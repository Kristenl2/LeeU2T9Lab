public class RightTriangleRunner {
    public static void main(String[]args){
        RightTriangle tri1 = new RightTriangle(3,4);
        RightTriangle tri2 = new RightTriangle(6.5,10.7);
        double hyp1 = tri1.hypotenuse();
        double hyp2 = tri2.hypotenuse();
        System.out.println(hyp1 + "\n" + hyp2);
    }
}
