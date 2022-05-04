import java.util.ArrayList;
import java.util.List;

public class ReverseWords {


    public static String reverseWords(String s) {

        StringBuilder sol = new StringBuilder();
        char[] c = s.toCharArray();

        int lp=c.length-1,rp=c.length-1;

        while(lp>=0){

            while(lp>=0 && c[lp]==' '){
                lp--;
            }
            rp=lp;

            while(lp>=0 && c[lp]!= ' '){
                lp--;
            }
            if(rp<0){
                break;
            }
            sol.append(c,lp+1,rp-lp);
            sol.append(" ");
        }
        //sol.deleteCharAt(sol.length()-1);
        return sol.toString();

    }

    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world  "));
    }
}
