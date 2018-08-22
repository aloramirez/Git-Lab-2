import java.util.*;
public class Translation{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        boolean itIs = true;
        if(s1.length() == s1.length()){
            int i = 0, j = s2.length()-1;
            while(i<s1.length() && j>=0){
                if(s1.charAt(i) != s2.charAt(j)){
                    itIs = false;
                }
                i++;
                j--;
            }
        }
        else{
            itIs = false;
        }
        if(itIs){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }     
}
