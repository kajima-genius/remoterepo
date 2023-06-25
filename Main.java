import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("sout");
        System.out.println("addd dsf dsfdsf");
        int z = 2 * 50;
        System.out.println("sdsdsd");

        var arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(test(arr));
    }

    public static int test(int[] arr) {
        return Arrays.stream(arr).sum();
    }
}