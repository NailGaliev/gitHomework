import java.util.Scanner;

public class Main {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        int [] arr = new int [sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        VectorCode nail = new VectorCode(arr);
        nail.print();
        int [] gail = nail.decode();
        for (int i = 0; i < gail.length; i++) {
            System.out.print(gail[i] + " ");
        }
        System.out.println();
        nail.delete(6);
        nail.print();
        nail.insert(228, 4);
        nail.print();
        VectorCode hanzo = new VectorCode(arr);
        System.out.println(nail.scalarProduct(hanzo));
    }
}
