public class Runner {
    public static void main(String[] args) {
        RightTriangle triangle1 = new RightTriangle(3.0, 4.0);
        double hypotenuse1 = triangle1.hypotenuse();
        System.out.println(hypotenuse1);

        RightTriangle triangle2 = new RightTriangle(6.5, 10.7);
        double hypotenuse2 = triangle2.hypotenuse();
        System.out.println(hypotenuse2);



    }
}
