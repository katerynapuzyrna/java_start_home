package practice1.ex1;

public class Program1 {
    public static void main(String[] args) {
        double a = 20;
        double b = 10;
        double c = 1;
if (a==0)
{  if (b==0) {System.out.println("x1=");
    System.out.println("x2=");}
else {
    if (c==0) {double x1 = 0;
        double x2 =0;
        System.out.println("x1=" + x1);
        System.out.println("x2=" + x2);}
    else{
double x1 = -1*c/b;
double x2 = -1*c/b;
    System.out.println("x1=" + x1);
    System.out.println("x2=" + x2);}
}
}
else {
    double D = b * b - 4 * a * c;
    if ((D) >= 0) {
        double sqrtD = Math.sqrt(D);
        double x1 = (-b + sqrtD) / (2 * a);
        double x2 = (-b - sqrtD) / (2 * a);
        System.out.println("x1=" + x1);
        System.out.println("x2=" + x2);
    } else {
        System.out.println("x1=");
        System.out.println("x2=");
    }
}
    }
}
