public class Main {
    public static void main(String[] args) {
        BinOps binOps = new BinOps();
        String first = "10";    //2
        String second = "100";   //4
        System.out.println(binOps.sum(first, second)); //110
        System.out.println(binOps.mult(first, second)); //1000
    }
}