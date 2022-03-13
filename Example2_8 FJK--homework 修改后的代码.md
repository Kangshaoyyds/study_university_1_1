```java
//Example2_8 FJK--homework 修改后的代码
package Chapter2;
import java.util.Scanner;
public class ShowDays{
    static void nyr(int x,int y)
    {
        int numDays=0;
        switch(y){
                case1:
                case3:
                case5:
                case7:
                case8:
                case10:
                case12:numDays=31;
                       break;
                case4:
                case6:
                case9:
                case11:numDays=30;
                       break;
                case2:
                if(((x%4==0)&&!(x%100==0))||(x%400==0)){
                    numDays=29;
                }
                else{
                    numDays=28;
                }
                       break;
        }
        System.out.println(x+"年"+y+"月份"+"有"+"numDays"+"天");
    }
    public static void main(String[] agrs){
        System.out.println("请输入年份：");
        Scanner inYear=new Scanner(System.in);
        int year=inYear.nextInt();
        System.out.println("请输入月份：");
        Scanner inMouth=new Scanner(System.in);
        int mouth=inMouth.nextInt();
        nyr(year,mouth);
    }
}
```

