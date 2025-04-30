public class printAllSubstrings {
    public static void main(String[] args) {
        String s="Yashwant";
        //string start with a
        // for (int i = 0; i <= 4; i++) {
        //     System.out.print(s.substring(0, i) +" ");

        //for all substrings
        for (int i = 0; i < s.length(); i++) {
            for(int j=i+1; j<=s.length(); j++){
                System.out.print(s.substring(i,j) +" ");
            }
            System.out.println();
        }
        }
    }

