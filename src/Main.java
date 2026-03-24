import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //задача 1
        int [] massive = new int[]{1,2,3};
        double [] massive2 = {1.57,7.654,9.986};
        int [] box = {5,534,-543,542};

        //задача 2
        System.out.println(Arrays.toString(massive));
        System.out.println(Arrays.toString(massive2));
        System.out.println(Arrays.toString(box));

        //задача 3
        for (int i = 2; i < massive.length; i--) {
            if (i == massive.length - 3) {
                System.out.println(massive[i]);
                break;
            }
            System.out.print(massive[i] + ", ");
        }
        for (int i = 2; i < massive2.length; i--) {
            if (i == massive2.length - 3) {
                System.out.println(massive2[i]);
                break;
            }
            System.out.print(massive2[i] + ", ");
        }
        for (int i = 3; i < box.length; i--) {
            if (i == box.length - 4) {
                System.out.println(box[i]);
                break;
            }
            System.out.print(box[i] + ", ");
        }

        //задача 4
        for (int i = 0; i < massive.length; i++) {
            if (massive[i]%2 != 0) {
                massive[i]+=1;
            }
            if (i == massive.length - 1) {
                break;
            }
        }
        System.out.println(Arrays.toString(massive));

    }
}