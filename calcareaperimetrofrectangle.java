public class calcareaperimetrofrectangle {

    public static void main(String[] args) {
      //  Perimeter of a Rectangle = 2(a+b)
     //   Area of Rectangle = a × b.
        float height=8.5f;
        float width=5.5f;
        float i = height + width;
        float perimeter=2* (i);
        float area= 2*(height*width);
        System.out.println("area of rectangle = "+ area);
        System.out.println("Rectangle of perimeter = "+ perimeter);

    }
}
