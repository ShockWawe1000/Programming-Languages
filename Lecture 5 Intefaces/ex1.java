package ex1;

interface Two_D_Shape{
    double P = 3.14;

    void parametres();
    float area();
    float perimeter();

}

interface Three_D_Shape{
    float volume();
}

class Triangle implements Two_D_Shape{

    double sideA;
    double sideB;
    double sideC;
    double height;

    Triangle (double A,double B,double C,double D)
    {
        sideA=A;
        sideB=B;
        sideC=C;
        height=D;
        System.out.println( "A new triangle was created");
    }
    
    public boolean rectangular() {
        return (sideA*sideA+sideB*sideB==sideC*sideC);
    }

    @Override
    public void parametres() {
        System.out.println("Calculating parameters of the triangle");
    }

    @Override
    public float area() {
        System.out.println("Calculating area of the triangle");
        return 0;
    }

    @Override
    public float perimeter() {
        System.out.println("Calculating perimeter of the triangle");
        return 0;
    }
}


class Sphere implements Two_D_Shape, Three_D_Shape {

    double radius;

    Sphere(double a)
    {
        radius=a;
        System.out.println("A new sphere has been created");
    }

    @Override
    public void parametres() {
        System.out.println("Calculating parameters of the sphere");
    }

    @Override
    public float area() {
        System.out.println("Calculating area of the sphere");
        return 0;
    }

    @Override
    public float perimeter() {
        System.out.println("Calculating perimeter of the sphere");
        return 0;
    }

    @Override
    public float volume() {
        System.out.println("Calculating volume of the sphere");
        return 0;
    }
}


public class ex1 {  
    public static void main(String[] args) {  
        Triangle T1=new Triangle(3,5,6,3);
        Sphere B1=new Sphere(4);
        Two_D_Shape T2=new Triangle(8,2,10,16);
        Two_D_Shape B2=new Sphere(3);
        Three_D_Shape B3=new Sphere(7);
        
        T1.parametres();
        T1.area();
        T1.perimeter();
        
        B1.parametres();
        B1.area();
        B1.perimeter();
        B1.volume();
        
        T2.parametres();
        T2.area();
        T2.perimeter();
        
        B2.parametres();
        B2.area();
        B2.perimeter();
        
        B3.volume();
    }  
}
