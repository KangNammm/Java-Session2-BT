import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean outWhite = true;
        while (outWhite) {
            System.out.println("Bạn muốn làm gì (a/b/c/x)");

            String text = scanner.nextLine();
            switch (text) {
                case "a":
                    System.out.println("Nhập chiều dài hình chữ nhật :");
                    int dai = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập chiều rộng hình chữ nhật :");
                    int rong = Integer.parseInt(scanner.nextLine());
                    if (dai>0 && rong>0){
                        System.out.println("Diện tích hình chữ nhật là : " + dai * rong);
                        System.out.println("Chu vi hình chữ nhật là : " + (dai + rong) * 2);
                    }else{
                        System.out.println("Không hợp lệ");
                    }
                    break;
                case "b":
                    System.out.println("Nhập chiều dài cạnh 1 của tam giác :");
                    int a = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập chiều dài cạnh 2 của tam giác :");
                    int b = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập chiều dài cạnh 3 của tam giác :");
                    int c = Integer.parseInt(scanner.nextLine());
                    if (checkTamGiac(a,b,c)){
                        double s = (a + b + c) / 2;
                        final double S = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                        System.out.println("Chu vi hình tam giác là : " + (a + b + c));
                        System.out.println("Diện tích hình tam giác là : " + S);
                    }else{
                        System.out.println("Không phải hình tam giác");
                    }
                    break;
                case "c":
                    System.out.println("Nhập bán kính của hình tròn : ");
                    double radius = Double.parseDouble(scanner.nextLine());
                    if (radius>0){
                        System.out.println("Chu vi của hình tròn là : " + radius * 2 * Math.PI);
                        System.out.println("Diện tích của hình tròn là: " + radius * radius * Math.PI);
                    }else{
                        System.out.println("Không hợp lệ");
                    }
                    break;
                case "x":
                    System.out.println("Bạn có chắc chắn? (y/n)");
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
    public static boolean checkTamGiac(int a, int b, int c) {
        if (a >0 && b >0 && c>0){
            if (a + b > c && a +c>b && c+b>a){
                return true;
            }
            return false;
        }
        return false;
    }
}
