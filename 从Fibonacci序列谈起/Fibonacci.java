import java.math.BigInteger;

public class Fibonacci {
    public BigInteger fibonacci(int n){
        if(n==0) return BigInteger.valueOf(0);
        if(n==1||n==2) return BigInteger.valueOf(1);
        //偶数
        BigInteger res;//结果
        BigInteger Fm;//Fm项的值
        BigInteger Fmp1;//F(m+1)项的值
        //偶数
        if(n%2==0){
            Fm=fibonacci(n/2);
            Fmp1=fibonacci(n/2+1);
            //Fn=(2*F(m+1)-Fm)*Fm
            res=(Fmp1.multiply(BigInteger.valueOf(2)).subtract(Fm)).multiply(Fm);
            return res;
        }else {
            Fm=fibonacci(n/2);
            Fmp1=fibonacci(n/2+1);
            //Fn=F(m+1)*F(m+1)+Fm*Fm
            res=Fm.multiply(Fm).add(Fmp1.multiply(Fmp1));
            return res;
        }
    }

    public static void main(String[] args) {
        Fibonacci f=new Fibonacci();
        for (int i=0;i<100;i++){
            System.out.print(f.fibonacci(i)+" ");
            if(i>0&&i%20==0){
                System.out.println();
                System.out.println();
            }

        }
    }
}
