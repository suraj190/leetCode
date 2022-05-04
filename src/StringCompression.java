import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StringCompression {

    public static int compress(char[] chars) {

        int lp=0, rp = 0;
        int count = 0;
        int sum = 0;

        List<Character> soln = new ArrayList<>();

        if(chars.length==0){
            return 0;
        }

        if(chars.length==1){
            soln.add(chars[0]);
            return 1;
        }

        //soln.add(chars[lp]);

        while(rp<chars.length){

            count = 0;

            while(rp<chars.length && chars[lp] == chars[rp] ){
                count++;
                rp++;
            }

            soln.add(chars[lp]);

            if(count>1){
                for(char c : Integer.toString(count).toCharArray()){
                    soln.add(c);
                }
            }
            sum+=count;
            lp=rp;

        }

        for (char c: soln) {
            System.out.print(c+" ");
        }

        return sum;
    }

    public static void main(String[] args) {
        char[] a = {'a','b','b','c','c','c'};
        compress(a);
    }
}
