public class BT2 {
    public static void main(String[] args) {
        // hình chữ nhật
        for (int i = 0; i < 3; i++) {
        System.out.println("* * * * * * * *");
        }
        System.out.println(" ");

        // tam giác đỉnh trên
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println(" ");

        // tam giác đỉnh dưới
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println(" ");

        // tam giác cân
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 2; k <  2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
