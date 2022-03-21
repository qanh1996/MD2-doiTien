import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap tien muon chuyen");
        double money = sc.nextDouble();
        System.out.println("1: USA, 2: VND");
        int money1 = sc.nextInt();
        switch (money1) {
            case 1:
                System.out.println("so tien usa" + money * 23000);
                break;
            case 2:
                System.out.println("so tien vnd" + money / 23000);
                break;
        }
    }
}
