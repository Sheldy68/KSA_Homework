package Module8_KorotaevaSA.Middle.Task1;

import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {
        boolean exit;
        Library library = new Library(10); //зададим бибиотеку фиксированного размера

        //создадим контент для библиотеки
        Book book1 = new Book("Преступление и Наказание");
        Book book2 = new Book("Война и мир");
        Book book3 = new Book("Отцы и дети");

        NewsPaper newsPaper1 = new NewsPaper("Аргументы и Факты");
        NewsPaper newsPaper2 = new NewsPaper("Коммерсант");

        Journal journal1 = new Journal("Мурзилка");
        Journal journal2 = new Journal("Трамвай");

        //добавим литературу в нашу библиотеку
        library.addMaterial(book1);
        library.addMaterial(book2);
        library.addMaterial(book3);
        library.addMaterial(newsPaper1);
        library.addMaterial(newsPaper2);
        library.addMaterial(journal1);
        library.addMaterial(journal2);

        Scanner scanner = new Scanner(System.in);
        exit = false;
        do {
            System.out.println("Выберите действие: 1 - получить материал; 2 - вернуть материал");
            int action = scanner.nextInt();
            scanner.nextLine(); //чтобы не проскакивал дальше
            if (action == 1 || action == 2) {
                System.out.println("Введите название материала: ");
                String userMaterial = scanner.nextLine();
                //действия пользователя
                switch (action) {
                    case (1): {
                        //выдать
                        library.getMaterial(userMaterial);
                        exit = library.getAnswer();
                        break;
                    }
                    case (2): {
                        //вернуть
                        System.out.println("Выберите тип материала: 1 - книга, 2 - журнал, 3 - газета");
                        int action2 = scanner.nextInt();
                        switch (action2) {
                            case (1): {
                                Book book = new Book(userMaterial);
                                library.returnMaterial(book);
                                exit = library.getAnswer();
                                break;
                            }
                            case (2): {
                                NewsPaper newsPaper = new NewsPaper(userMaterial);
                                library.returnMaterial(newsPaper);
                                exit = library.getAnswer();
                                break;
                            }
                            case (3): {
                                Journal journal = new Journal(userMaterial);
                                library.returnMaterial(journal);
                                exit = library.getAnswer();
                                break;
                            }
                            default: {
                                System.out.println("Не корректный ввод");
                            }
                        }
                        break;
                    }
                }
            } else {
                System.out.println("Не корректный ввод");
            }
        } while ( !exit );
    }
}

