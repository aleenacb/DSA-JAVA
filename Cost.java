public class Cost {
    public static void main(String[] args) {
        int items = 50;
        float costPerItems = 9.99f;
        float totalCost = items * costPerItems;
        char currency = '$';
        System.out.println("Number of items :" + items);
        System.out.println("Cost per items :" + costPerItems);
        System.out.println("Total cost :" + totalCost + currency);
    }
}
