public class BinOps {
    public String sum(String a, String b) {
        int first = Integer.parseInt(a, 2);
        int second = Integer.parseInt(b, 2);
        int sum = first + second;
        String result = Integer.toBinaryString(sum);
        return result;
    }

    public String mult(String a, String b) {
        int first = Integer.parseInt(a, 2);
        int second = Integer.parseInt(b, 2);
        int mult = first * second;
        String result = Integer.toBinaryString(mult);
        return result;
    }
}