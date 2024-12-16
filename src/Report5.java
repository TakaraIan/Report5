public class Report5 {
    public static void main(String[] args) {
        String str = null;
        try {
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("例外メッセージ: " + e.getMessage());
        }
    }
}
