import java.util.Arrays;
import java.util.Objects;

class R {
    public static int decimal(long n){
        int i=0;
        int dn=0;
        while(n>0){
            dn+=Math.pow(2,i++)*n%10;
            n=n/10;
        }
        return dn;
    }
    public static int octal(int n){
        int dec=decimal(n);
        String octal=Integer.toOctalString(dec);
        int ans=Integer.parseInt(octal);
        return ans;
    }


    public static int ocattodecimal(int num){
        int n=num;
        int decimal=0;
        int base=1;
        int temp=n;
        while(temp>0){

            int last=num%10;
            temp=temp/10;
            decimal+=last*base;
            base=base*8;
        }
        return decimal;
    }
    public static void main(String[] args) {
        System.out.println(octal(1110));
//        System.out.println(ocattodecimal());

    }
}
