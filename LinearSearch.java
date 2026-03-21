class LinearSearch {
  public static void main(Strimg[] args) {
    List<Intger> list = Arrays.asList(2,4,6,8,20);
    int key = 6;
    System.out.println("Linear Search" + list.contains(key));
    int index = Collections.binarySearch(list, key);
    if(index >= 0) {
      System.out.println("Element found at index"+index);
    } else {
      System.out.println("Element not found");
    }
  }
}s
