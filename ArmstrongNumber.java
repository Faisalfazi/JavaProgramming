import java.util.*;
public class ArmstrongNumber{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ori=n;
        int m,res=1;
        int count=0;
        while(n>0){
            m=n%10;
            if(m/10>0){
                count++;
            }
            for(int i=1;i<=count;i++){
                res*=i;
            }
            n=n/10;
        }
        System.out.println(res);
        if(res==ori){
            System.out.println("Armstrong number");       
        }
        else{
            System.out.println("not an Armstrong number");
        }
    }
}
