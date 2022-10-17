public class RightTriangleRunner {
    public static void main(String[] args) {
        RightTriangle vr = new RightTriangle(3, 4);
        RightTriangle om = new RightTriangle(6.5, 10.7);
        double hypotenuse1 = vr.hypotenuse();
        double hypotenuse2 = om.hypotenuse();
        System.out.println(hypotenuse1);
        System.out.println(hypotenuse2);

        RightTriangle mater = new RightTriangle(17, 0.5);
        System.out.println(mater.hypotenuse());
    }
}
