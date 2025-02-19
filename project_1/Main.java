public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println((double) a/b);

        double r = 6;
        System.out.println(Math.PI * Math.pow(r,2));

        double n = 4;
        boolean number = (n % 2 == 0);
        System.out.println(number);

        String name = "Mykola";
        System.out.println("Привіт, " + name + "!");

        int [] arr = {1,2,3};
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
