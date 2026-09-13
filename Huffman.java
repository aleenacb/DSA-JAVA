import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

// Node class representing each element in the Huffman Tree
class HuffmanNode implements Comparable<HuffmanNode> {
    char ch;
    int frequency;
    HuffmanNode left, right;

    public HuffmanNode(char ch, int frequency) {
        this.ch = ch;
        this.frequency = frequency;
    }

    public HuffmanNode(int frequency, HuffmanNode left, HuffmanNode right) {
        this.ch = '\0'; // Internal node
        this.frequency = frequency;
        this.left = left;
        this.right = right;
    }

    // Min-priority queue relies on this to sort nodes by lowest frequency
    @Override
    public int compareTo(HuffmanNode o) {
        return Integer.compare(this.frequency, o.frequency);
    }
}

public class HuffmanCompressor {

    // 1. Build the Huffman Tree and return the root
    public static HuffmanNode buildTree(String text) {
        if (text == null || text.isEmpty()) return null;

        // Count frequencies of each character
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : text.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Add all leaf nodes to the priority queue
        PriorityQueue<HuffmanNode> pq = new PriorityQueue<>();
        for (var entry : freqMap.entrySet()) {
            pq.add(new HuffmanNode(entry.getKey(), entry.getValue()));
        }

        // Combine nodes until only the root remains
        while (pq.size() > 1) {
            HuffmanNode left = pq.poll();
            HuffmanNode right = pq.poll();
            
            int combinedFreq = left.frequency + right.frequency;
            pq.add(new HuffmanNode(combinedFreq, left, right));
        }

        return pq.peek(); // The root of the Huffman Tree
    }

    // 2. Generate prefix codes by traversing the tree
    public static void generateCodes(HuffmanNode root, String code, Map<Character, String> huffmanCodes) {
        if (root == null) return;

        // Found a leaf node (character)
        if (root.left == null && root.right == null) {
            huffmanCodes.put(root.ch, code);
            return;
        }

        generateCodes(root.left, code + "0", huffmanCodes);
        generateCodes(root.right, code + "1", huffmanCodes);
    }

    // 3. Compress the input text into a binary string
    public static String compress(String text, Map<Character, String> huffmanCodes) {
        StringBuilder sb = new StringBuilder();
        for (char ch : text.toCharArray()) {
            sb.append(huffmanCodes.get(ch));
        }
        return sb.toString();
    }

    // 4. Decompress the binary string back into original text using the tree
    public static String decompress(String bitString, HuffmanNode root) {
        StringBuilder sb = new StringBuilder();
        HuffmanNode current = root;

        for (char bit : bitString.toCharArray()) {
            current = (bit == '0') ? current.left : current.right;

            // Found a leaf node
            if (current.left == null && current.right == null) {
                sb.append(current.ch);
                current = root; // Reset back to root for the next character
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String originalText = "huffman coding dsa project";
        System.out.println("Original Text: " + originalText);

        // Build Tree and Generate Codes
        HuffmanNode root = buildTree(originalText);
        Map<Character, String> huffmanCodes = new HashMap<>();
        generateCodes(root, "", huffmanCodes);

        System.out.println("\nGenerated Huffman Codes:");
        huffmanCodes.forEach((k, v) -> System.out.println("'" + k + "': " + v));

        // Compress
        String compressedData = compress(originalText, huffmanCodes);
        System.out.println("\nCompressed Binary String: " + compressedData);

        // Decompress
        String decompressedText = decompress(compressedData, root);
        System.out.println("Decompressed Text       : " + decompressedText);
    }
}
