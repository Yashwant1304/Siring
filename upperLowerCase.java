public class upperLowerCase {
    public static void main(String[] args) {
        String s="Hello this is Yashwant";
        // System.out.println(s.toLowerCase());

        // String a=s.toLowerCase();
        // System.out.println(a);

        s=s.toLowerCase();
        s=s.toUpperCase();
        System.out.println(s);

        String a="abcd";
        String b="xyz";

        // a.concat(b);
        // System.out.println(a);  wrong method

       // System.out.println(a.concat(b));  //method-1

        a=a.concat(b);
        System.out.println(a);
        
    }
}
