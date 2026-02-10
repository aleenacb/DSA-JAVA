class AccessorMutator {
    private int balance = 40;
    public int getBalance() {
        return balance;
    }
    public void setBalance(int a) {
        balance += a;
    }
}
class Accessor {
    public static void main(String[] args) {
        AccessorMutator obj = new AccessorMutator();
        obj.setBalance(40);
        System.out.println("Balance : " + obj.getBalance());
    }
}
