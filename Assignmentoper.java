public class Assignmentoper {
    public static void main(String[] args) {
        //Using Assignment Operator
        int a = 5;
        System.out.println("a += 3: " +(a += 3));
        System.out.println("a -= 2: " +(a -= 2));
        System.out.println("a *= 3: " +(a *= 3));
        System.out.println("a /= 4: " +(a /= 4));
        System.out.println("a %= 3: " +(a %= 3));
        System.out.println("a &= 0b1010: " +(a &= 0b1010));
        System.out.println("a ^= 0b1100: " +(a ^= 0b1100));
        System.out.println("a |= 0b1010: " +(a |= 0b1010));
        System.out.println("a <<= 3: " +(a <<= 3));
        System.out.println("a >>= 2: " +(a >>= 2));
        System.out.println("a >>>= 3: " +(a >>>= 3));
    }
}
