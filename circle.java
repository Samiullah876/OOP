public class circle {
    public int radius;
    public float pi;
    public int circumference;

    public circle() {
        radius = 15;
        pi = 3.14f;
    }

    public circle(int a, int b) {
        radius=a;
        pi=b;
    }

    public double Circumference() {
        return (2 * pi * radius);
    }

    public static void main(String[] args) {
        circle c = new circle();
        System.out.println(c.Circumference());
        circle c2 = new circle(6, 10);
        System.out.println(c2.Circumference());
    }
}
