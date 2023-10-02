import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Nhập vào 1 số");
            byte number = scanner.nextByte();
            for (byte i = 2; i < number; i++) {
                if (showNumber(i)){
                    System.out.println(i+"là sô nguyên tố");
                }
            }
        }
    }

    public static boolean showNumber(byte number) {
        if (number <= 1){
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
