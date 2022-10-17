public class CircleRunner {
    public static void main(String[] args) {
        Circle tater = new Circle(5.0);
        System.out.println(tater.getInfo());
        tater.setRadius(9.2);
        System.out.println(tater.getInfo());

        Circle tots = new Circle(39.2);
        System.out.println(tots.getInfo());
        tater.setRadius(2.0);
        System.out.println(tater.getInfo());
    }
}
