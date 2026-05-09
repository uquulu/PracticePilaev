import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList <String> list = new ArrayList<>();

        while (true) {

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Додати елемент в кінець");
            System.out.println("2 - Додати елемент за індексом");
            System.out.println("3 - Видалити елемент");
            System.out.println("4 - Отримати елемент");
            System.out.println("5 - Кількість елементів");
            System.out.println("6 - Розмір буфера");
            System.out.println("7 - Показати список");
            System.out.println("0 - Вихід");

            int choice = scanner.nextInt();
            scanner.nextLine();

            try {

                switch (choice) {

                    case 1:
                        System.out.print("Введіть елемент: ");
                        String value = scanner.nextLine();

                        list.add(value);

                        System.out.println("Елемент додано");
                        break;

                    case 2:
                        System.out.print("Введіть індекс: ");
                        int index = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Введіть елемент: ");
                        String element = scanner.nextLine();

                        list.add(index, element);

                        System.out.println("Елемент додано");
                        break;

                    case 3:
                        System.out.print("Введіть індекс: ");
                        int removeIndex = scanner.nextInt();

                        String removed = list.remove(removeIndex);

                        System.out.println("Видалено: " + removed);
                        break;

                    case 4:
                        System.out.print("Введіть індекс: ");
                        int getIndex = scanner.nextInt();

                        System.out.println("Елемент: " + list.get(getIndex));
                        break;

                    case 5:
                        System.out.println("Кількість елементів: " + list.size());
                        break;

                    case 6:
                        System.out.println("Розмір буфера: " + list.capacity());
                        break;

                    case 7:
                        list.printList();
                        break;

                    case 0:
                        System.out.println("Програма завершена");
                        return;

                    default:
                        System.out.println("Невірний пункт меню");
                }

            } catch (Exception e) {
                System.out.println("Помилка: " + e.getMessage());
            }
        }
    }
}