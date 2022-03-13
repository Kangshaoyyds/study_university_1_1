//Example2_2.java
package Chapter2;
public class Example2_2{
static int allClicks=0;//类变量
String str = "hello world";//实例变量
public void method(){
int i=0;//局部变量
}
}

//Example2_3.java
package Chapter2;
public class Text{
public void pupAge(){ //下面的代码会调用这个方法，局部变量，它的作用只限制在这个方法中
int age = 0 ;
age = age + 7;
System.out .println("小狗的年龄是：" + age);
}
public static void mian(String[]  ags){
Text text = new Text();
text.pupAge();//我目前理解的是这是一个方法
}
}

//Example2_4 基本类型转换
package Chapter2;
class Example2_4{
public static void main(String arg[]){
int i1=10;
short s1 =2;
int i2 =i1+s1;
float f1= 12.5F;
float f2 = f1 +i2 ;
long l= 12L;
float f3=l;
char c1 = 'a';
char c2 ='A';
int i3=c1+l;
int i4=c2+l;
short ss1 = 12;
byte bb1=l;
char cc1='a';
int ii1 =ss1+bb1+cc1;
}
}

//强制类型转换 使用括号（）
long l1=100L;
int i1=(int)l1;//要注意精度损失的问题

//注意：字符串与基本数据之间只能进行连接计算，即将两个数据拼接到一起，得到的结果依然是字符串类型的数据  如：
package Chaper2;
class Example2_5{
public static void main(String agr[]){
String str1 = "abc";
int i1=123;
String str2 = str1+i1;
System.out.println("str2");
}
}