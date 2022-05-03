public class BinOps {

    public String sum(String a, String b) {
        int decA = Integer.parseInt(a, 2);
        int decB = Integer.parseInt(b, 2);
        int decSum = decA + decB;
        return Integer.toBinaryString(decSum);
    }

    public String mult(String a, String b) {
        int decA = Integer.parseInt(a, 2);
        int decB = Integer.parseInt(b, 2);
        int decMult = decA * decB;
        return Integer.toBinaryString(decMult);
    }
}