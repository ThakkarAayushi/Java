abstract class shape{
    abstract int area(int x,int y);
}
class Triangle extends shape{
    @Override
    public int area(int h,int b){
        // height*base/2
        return (h*b)/2;
    }
}
class Rectangle extends shape{
    @Override
    public int area(int l,int w){
        // length * width
        return l*w;
    }
}
class Circle extends shape{
    @Override
    public int area(int pi,int r){
        // pi*r ^2
        return pi*r*r;
        
    }
}
public class AbsDemo {
    public static void main(String[] args) {
       Triangle t = new Triangle();
       Rectangle r = new Rectangle();
       Circle c = new Circle();
       int a1=t.area(13, 10);
       int a2=r.area(4,12);
       int a3=c.area(22/7, 5);
       System.out.println("area of triangle = "+a1);
       System.out.println("area of recangle = "+a2);
       System.out.println("area of circle = "+a3);
    }
    
}
