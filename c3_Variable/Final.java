package javaFoundation.c3_Variable;

//变量作用域就不展开了，和C++没差

public class Final {
/*
    final 修饰一个变量，有很多种说法，比如不能改变等等
准确的描述是 当一个变量被final修饰的时候，该变量只有一次赋值的机会（就好像预定义define？）
 */
    public void method1() {
        final int i;
        i = 10; //i只是被声明，但是没有被赋值，所以在这里可以进行第一次赋值
  //      i = 11; //i已经被赋值过了，所以这里会出现编译错误
    }
}
