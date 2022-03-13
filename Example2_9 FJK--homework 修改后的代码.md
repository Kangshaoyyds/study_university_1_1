```java
//Example2_9 FJK--homework 修改后的代码
//package Chapter2;
import java.util.Scanner;
public class Game{
    static final int FGVALUE=20;
    static final int GSVALUE=16;
    static final int FGLIFE=30;
    static final int GSLIFE=20;
    static void kang(int goldcoin){
        int max_life=0;
        int fg_num=0,gs_num=0;35
        for(int fg_loop=0;fg_loop<=(goldcoin/FGVALUE);fg_loop++)
            for(int gs_loop=0;gs_loop<=(goldcoin/GSVALUE);gs_loop++)
                if(((fg_loop*FGVALUE+gs_loop*GSVALUE)<=goldcoin)&&((FGLIFE*fg_loop+GSVALUE*gs_loop)>max_life)){
                    fg_num=fg_loop;
                    gs_num=gs_loop;
                    max_life=FGLIFE*fg_loop+GSLIFE*gs_loop;
                }
        System.out.println("购买的宝物最多能增加你"+max_life+"个生命力！");
        System.out.println("购买仙女草的数量为"+fg_num);
        System.out.println("购买银河梭的数量为"+gs_num);
    }
    public static void mian(String[] args){
        int goldcoin1=100;
        System.out.println("请输入金币的数量为：");
        Scanner in=new Scanner(System.in);
        goldcoin1=in.nextInt();
        kang(goldcoin1);
    }
}
```

