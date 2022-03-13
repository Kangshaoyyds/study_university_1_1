```java
//Example2_7 FJK——homework  书上源码
package Chapter2;
import java.util.Scanner;
public class ComputeTax{
    public static void main(String[] agrs){
        double income = 0.0;
        int status = 0;
        double tax=0;
        System.out.println("请输入纳税人类型：0-单身，1-已婚，2-家庭");
        Scanner inStatus = new Scanner(System.in);
        if(inStatus.hasNextInt()){
            status =inStatus.nextInt();
        }
        System.out.println("请输入可征税收入：");
        Scanner in = new Scanner(System.in);
        if(in.hasNextDouble()){
            income = in.nextDouble();
        }
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
                tax=12000*0.10+(46700-12000)*0.15+*(112850-46700)*0.27+(income-112850)*0.30;
            else
                tax=12000*0.10+(46700-12000)*0.15+*(112850-46700)*0.27+(171950-112850)*0.30+(income-171950)*0.35;
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
        Sytem.out.println("纳税人需要缴纳的税额为"+tax+"￥")； 
    }
}
```

