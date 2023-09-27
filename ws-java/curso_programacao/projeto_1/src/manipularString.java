public class manipularString {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFGH        ";
        String s1 = original.toLowerCase();
        String s2 = original.toUpperCase();
        String s3 = original.trim();
        System.out.println("Original: - " + original + " - ");
        System.out.println("toLowerCase: - " + s1 + " - ");
        System.out.println("toUpperCase: - " + s2 + " - ");
        System.out.println("Trim: - " + s3 + " - ");

    }
}
