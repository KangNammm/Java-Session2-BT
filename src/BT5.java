import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean outWhite = true;
        while (outWhite){
            System.out.println("Bạn muốn làm gì (a/b/x)");
            System.out.println("a. Kiểm tra tính chẵn lẻ");
            System.out.println("b. Kiểm tra số nguyên tố");
            System.out.println("x. Thoát chương trình");
            String text = scanner.nextLine();
            switch (text){
                case "a":
                    System.out.println("Nhập số bạn muốn tính chẵn lẻ :");
                    int numCheck = Integer.parseInt(scanner.nextLine());
                    if (numCheck >0){
                        if (numCheck %2 == 0){
                            System.out.println("So "+ numCheck +" là số chẵn");
                        }else {
                            System.out.println("So "+ numCheck +" là số lẻ");
                        }
                    }else{
                        System.out.println("So "+ numCheck +" không phải số chẵn và lẻ");
                    }
                    break;
                case "b":
                    System.out.println("Nhập số bạn muốn kiểm tra có phải số nguyên tố :");
                    int num = Integer.parseInt(scanner.nextLine());
                    if (num < 2){
                        System.out.println(num + " không phải số nguyên tố");
                    }else {
                        boolean check = true;
                        for (int i = 2; i < num; i++){
                            if (num % i == 0){
                                check = false;
                            }
                        }
                        if (check){
                            System.out.println(num + " là số nguyên tố");
                        }else{
                            System.out.println(num + " không phải là số nguyên tố ");
                        }
                    }
                    break;
                case "x":
                    System.out.println("Bạn muốn out? (y/n)");
                    String agree = scanner.nextLine();
                    switch (agree) {
                        case "y":
                            outWhite = false;
                            break;
                        default:
                            break;
                    }
                default:
                    break;
            }
        }
    }
}
