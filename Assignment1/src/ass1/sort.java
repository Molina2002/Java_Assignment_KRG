package ass1;

import java.util.*;
public class sort {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string  : ");
            String m=sc.next();
            char []a=m.toCharArray();
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a.length;j++){
                    if(a[i]<a[j]){
                        char temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }
            }
            /Arrays.sort(a);/
            a.toString();
            System.out.println(a);
        }
    }
}
