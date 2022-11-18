import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai1 {
    static Scanner scanner = new Scanner(System.in);
    static Map<String,String> map = new HashMap<String,String>();

    public static void main(String[] args) {
        int choice;

        String menu = "MENU DANG NHAP" +
                "\n1.Dang nhap" +
                "\n2.Dang ky" +
                "\n3.Doi mat khau" +
                "\n4.Thoat";

        do {
            System.out.println(menu);
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    register();
                    break;
                case 3:
                    resetPassword();
                    break;
            }

        } while (0 < choice && choice < 4);
    }

    private static void resetPassword() {
        String username, oldPassword, newPassword;

        System.out.println("Nhap tai khoan: ");
        username = scanner.nextLine();

        System.out.println("Nhap mat khau cu: ");
        oldPassword = scanner.nextLine();

        if(map.containsKey(username) && map.get(username).equals(oldPassword)) {
            System.out.println("Nhap mat khau moi: ");
            newPassword = scanner.nextLine();

            map.put(username, newPassword);

            System.out.println("Doi mat khau thanh cong");
        }
    }
    private static void register() {
        String username, password;

        System.out.println("Nhap tai khoan: ");
        username = scanner.nextLine();

        System.out.println("Nhap mat khau: ");
        password = scanner.nextLine();

        if(!map.containsKey(username)) {
            map.put(username, password);
        }
    }
    private static void login() {
        String username, password;

        System.out.println("Nhap tai khoan: ");
        username = scanner.nextLine();

        System.out.println("Nhap mat khau: ");
        password = scanner.nextLine();

        if(map.containsKey(username) && map.get(username).equals(password)) {
            System.out.println("Ok");
        } else {
            System.out.println("Ko");
        }
    }
}
