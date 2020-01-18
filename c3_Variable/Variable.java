package javaFoundation.c3_Variable;

public class Variable {
    public static void main(String[] args) {
        boolean yes = false;
        short s = 0;
        int i = 0;
        long l = 0;
        float f = 0f;//不写f的一律视作int或者double，后缀f表示float
        double d = 0;
        char c = 'c';
        String S = "String不是一个基本类型！！！但是广泛使用";
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
    }
}
