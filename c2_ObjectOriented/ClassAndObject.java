package javaFoundation.c2_ObjectOriented;

public class ClassAndObject {
    //attribute
    String name;
    float DegreeOfDifficulty;
    int credit;
    String teacher;

    //method
    void guaren(String studentName){
        System.out.println(this.teacher+" 老师在 "+this.name+" 课上挂掉了 "+studentName);
    }

    public static void main(String[] args) {
        //object1
        ClassAndObject DiscreteMath = new ClassAndObject();
        DiscreteMath.name = "DiscreteMath";
        DiscreteMath.DegreeOfDifficulty = 8.8f;
        DiscreteMath.credit = 4;
        DiscreteMath.teacher = "IronGang";
        DiscreteMath.guaren("王柏韬");

        //object2
        ClassAndObject Java = new ClassAndObject();
        Java.name = "Java";
        Java.DegreeOfDifficulty = (float) 9.5;
        Java.credit = 3;
        Java.teacher = "LightLight";

        //output object
        System.out.println(Java);//输出后是一个内存位置
    }
}
