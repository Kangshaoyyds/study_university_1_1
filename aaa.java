```java
//Example2_7 FJK--homework 淇敼鍚庣殑浠ｇ爜
package Charper2;
import java.util.Scanner;
public class ComputerTax{
    static int taxpayerType(int x)
    {
        int tax=0;
         if(status==0){
            if(income<=6000)
                tax=income*0.10;
            else if(income<=27950)
                tax=6000*0.10+(income-6000)*0.15;
            else if(income<=67700)
                tax=6000*0.10+(27950-6000)*0.15+(income-27950)*0.27;
            else if(income<=141250)
                tax=6000*0.10+(27950-6000)*0.15+(67700-27950)*0.27+(income-27950)*0.30;
            else 
                tax=6000*0.10+(27950-6000)*0.15+(67700-27950)*0.27+(141250-67701)*0.30+(income-141250)*0.35;
        }
        else if(status==1){
            if(income<=12000)
                tax=income*0.10;
            else if(income<=46700)
                tax=12000*0.10+(income-12000)*0.15;
            else if(income<=112850)
                tax=12000*0.10+(46700-12000)*0.15+(income-46700)*0.27;
            else if(income<=171950)
                tax=12000*0.10+(46700-12000)*0.15+(112850-46700)*0.27+(income-112850)*0.30;
            else
                tax=12000*0.10+(46700-12000)*0.15+(112850-46700)*0.27+(171950-112850)*0.30+(income-171950)*0.35;
        }
        else if(status==2){
            if(income<=10000)
                tax=income*0.10;
            else if(income<=37450)
                tax=10000*0.10+(income-10000)*0.15;
            else if(income<=96700)
                tax=10000*0.10+(37450-10000)*0.15+(income-37450)*0.27;
            else if(income<=156600)
                tax=10000*0.10+(37450-10000)*0.15+(96700-37450)*0.27+(income-96700)*0.30;
            else
                tax=10000*0.10+(37450-10000)*0.15+(96700-37450)*0.27+(156600-96700)*0.30+(income-156600)*0.35;
        }
        return(tax);
    }
    
    public static void main(String[] agrs){
        double income = 0.0;
        int status = 0;
        System.out.println("璇疯緭鍏ョ撼绋庝汉鐨勭被鍨嬶細0-鍗曡韩锛??1-宸插锛??2-瀹跺涵");
        Scanner inStatus=new Scanner(System.in);
        if(inStatus.hasnextInt()){
            status=inStatus.nextInt();//杈撳叆绾崇◣浜虹殑绫诲瀷
        }
        int result = taxpayerType(status);
        System.out.println("绾崇◣浜洪渶瑕佺即绾崇殑绋庨涓??"+result+"锟??");
    }
}
```

