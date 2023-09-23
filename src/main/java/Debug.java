public class Debug {

    public static void main(String[] args) {

        int[] array = {0, 1, 2};
        String str = "hello world";

//      testArrayDebug(str);
      recursion(str, 0);
    }

    public static void testArrayDebug(String str) {
        int i = str.length() - 1;
        String newStr = "";

        while(i >= 0) {
            newStr += str.charAt(i);
            i--;
        }

        System.out.println(newStr);
    }

    public static void recursion(String str, int num) {
        if (num < str.length()-1) {
            recursion(str, ++num);
            System.out.print(str.charAt(num));
        }
    }
}
