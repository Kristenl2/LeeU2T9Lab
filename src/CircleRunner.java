public class CircleRunner {
    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            int rand1 = (int) (Math.random() * 9) + 2;
            int rand2 = (int) Math.random() * 9 + 2;
            System.out.println(rand1);
            System.out.println(rand2);

        }

    }
}