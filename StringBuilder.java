class StringBuilder {
  public static void main(String[] args) {
    String s = "Hello";
    System.out.println(s);
    StringBuilder sb = new StringBuilder("Hello");
    sb.append("World");
    System.out.println(sb.toString());
  }
}
