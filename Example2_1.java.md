//Example2_1.java  chapter2.1.1 P12声明代码所在章节

package Chapter2;//声明程序所在包(我也不知道是个啥)
import java.util.Scanner;//好像package import 是包引入包声明关键字
public class Example2_1{
public static void main(String agr[]){  //注：String 和agr[]之间不是逗号，是空格
int x,y,z;  //声明3个变量
System.out.println("Please enter two integers:");
//注：scanner类表示一个文本扫描器，它可以扫描从键盘上数入的字符
Scanner in = new Scanner(System.in);
//注：方法nextInt()返回键盘上输入的一个整数，这一块我又不懂了
x = in.nexInt();
y = in.nexInt();
z = x + y;
System.out.println(x + "+" + y  "=" + z);//为什么输出个这个东西
}
}

