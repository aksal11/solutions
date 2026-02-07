public class Solutions {

    public static void main(String[] args) {

        String s = "aababbab";
        System.out.println(minimumDeletions(s));

    }

    public static int minimumDeletions(String s){

        int delete = 0;
        int count = 0;
        for ( int i = 0; i < s.length(); i++){

            char c = s.charAt(i);
            if ( c == 'b'){
                count++;
            }else{
                delete++;
                delete = Math.min(delete,count);
            }
        }
        return delete;
    }
}
