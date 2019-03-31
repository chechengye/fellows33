/**
 * 1、介绍一下课程体系
 * 2、JDK(配置了环境变量,系统、高级系统设置JAVA_HOME:jdk安装路径,path:必须添加进入path目录)
 * javac HelloWorld.java 编译  .class java HelloWorld 执行.
 * IDEA： HelloWorld.java .class文件输出在out目录下
 * 3、java发展史
 * 4、标识符(1、不能以数字开头 2、不能是java中的关键字和保留字(goto , const)
 *          3、不能有类似于#这种不识别的符号 4、之间不能有空格)
 * 5、基本数据类型
 *   8种:
 *   boolean: 布尔型  不定值  false
 *   byte :  字节型   1   0
 *   short:  短整型   2   0
 *   int :  整型      4   0
 *   long : 长整型    8   0
 *   float : 单精度浮点型  4 0.0F
 *   double : 双精度浮点型  8 0.0D
 *   char  : 字符型   2   '\u0000'
 *   数据类型转换
 *    long l = 0L;
 *    int i = 10;
 *    i = (int)l;
 *    l = i;
 * 6、面向对象和面向过程区别
 *   面向对象: 什么事情，不自己干，让别人帮你干 Arrays
 *   面向过程 : 什么事情，都自己干，亲力亲为. c c++
 * 7、做了几个小列子 传到了gitHub //github.com/chechengye/fellows33
 *
 */

public class Review {

    public static void main(String[] args) {
        long l = 0L;
        int i = 10;
        i = (int)l;
        l = i;

    }
}
