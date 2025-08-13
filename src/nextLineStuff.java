import java.util.Scanner;
public class nextLineStuff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, s2, s3;
        int n;
        n = sc.nextInt();
        sc.nextLine(); // Coloque um nextLine antes do qual você vai usar para o \n que restou do nextInt consuma ele primeiro
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        System.out.println("DADOS DIGITADOS:");
        System.out.println(n);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        sc.close();
    }
}
