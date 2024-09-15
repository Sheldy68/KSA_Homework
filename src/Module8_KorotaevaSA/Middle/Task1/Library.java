package Module8_KorotaevaSA.Middle.Task1;

import java.util.Scanner;

public class Library {
   private Material[] materials;
    private int count;
    private boolean exit;

    public Library(int size) {
        materials = new Material[size];
        count = 0;
    }

    //добавить материал в библиотеку
    public void addMaterial(Material material) {
        if (count < materials.length) {
            materials[count++] = material;
            System.out.println("Материал " + material.getName() + " добавлен в библиотеку");
        } else {
            System.out.println("В библиотеке нет места! Материал " + material.getName() + " не добавлен");
        }
        System.out.println("В библиотеке " + count + " материалов");
    }

    //выдать материал
    public void getMaterial(String name) {
        for (int i = 0; i < count; i++) {
            if (materials[i].getName().equalsIgnoreCase(name)) {
                System.out.println("Материал " + materials[i].getName() + " выдан");
                //удалим из массива этот материал
                for (int j = i; j < count - 1; j++) {
                    materials[j] = materials[j + 1];
                    materials[--count] = null;
                }
                System.out.println("В библиотеке " + count + " материалов");
                return;
            }
        }
        //если не вышел, значит книги нет
        System.out.println("В библиотеке нет такого материала!");
    }

    //вернуть материал
    public void returnMaterial(Material material) {
        addMaterial(material);
    }

    public boolean getAnswer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Вы хотите продолжить? 1 - да или 2 - нет: ");
        String answer = scanner.nextLine();
        while (!isNumber(answer)) {
            System.out.println("Неверный ввод!");
            answer = scanner.nextLine();
        }
        switch (Integer.parseInt(answer)) {
            case (1):
                exit = false;
                break;
            case (2):
                exit = true;
                break;
            default:
                exit = true;
                break;
        }
        return exit;
    }

    public static boolean isNumber( String string) {
        try {
            Integer.parseInt(string);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}

