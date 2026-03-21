class SortingAlgorithm {
  public static void main(String[] args){
    int[] nums = {5, 3, 5, 8, 1};
    Arrays.sort(nums);
    List<Integer> list = new ArrauList<>(Arrays.asList(5, 3, 5, 8, 1));
    Collections.sort(list);
    System.out.println("Sorted List" + list);
  }
}
