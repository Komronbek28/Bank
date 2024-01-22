import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            Scanner read = new Scanner(System.in);

            System.out.println("\uD83C\uDFE6 Assalomu alaykum !");
            System.out.println("1.\uD83D\uDCDD Ro'yxatdan o'tish.");
            System.out.println("2.\uD83D\uDC68\u200D\uD83D\uDCBB/\uD83D\uDC69\u200D\uD83D\uDCBB Kirish.");
            System.out.println("0.\uD83D\uDEAB Chiqish.");
            System.out.print(">>> ");
            int n = read.nextInt();

            switch (n) {
                case 0:

                    System.out.println("Dasturdan chiqdingiz");
                    return;

                case 1:

                    Scanner scanner = new Scanner(System.in);

                    System.out.print("Ismingizni kiriting: ");
                    String name = scanner.nextLine();

                    System.out.print("Yoshingizni kiriting: ");
                    int age = read.nextInt();

                    System.out.print("Parol yarating: ");
                    String password = scanner.nextLine();

                    User user = new User(name, age, password);

                    System.out.println("Ismingiz -> " + user.getName());
                    System.out.println("Yoshingiz -> " + user.getAge());
                    System.out.println("Parolingiz -> " + user.getPassword());
                    System.out.println("Ma'lumotlaringiz saqlab qo'yildi !");

                    break;

                case 2:
                    Scanner check = new Scanner(System.in);

                    System.out.print("Ismingizni kiriting: ");
                    String p = check.nextLine();

                    System.out.print("Parolingizni kiriting: ");
                    String pas = check.nextLine();

                    //if (p.equals(user.getName())) {

            }
            break;

            //default:
            // System.out.println("Siz mavjud bo'lmagan bo'limni tanladingiz !");
            // break;
        }
    }
}

