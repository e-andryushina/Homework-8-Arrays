public class Main {
    public static void main(String[] args) {

        //Урок Массивы-часть 1. Домашнее задание. Задача 1.
        System.out.println("Урок Массивы-часть 1. Домашнее задание. Задача 1.");
        int[] height = new int[3];
        height[0] = 1;
        height[1] = 2;
        height[2] = 3;
        double[] width = {1.57, 7.654, 9.986};
        int[] quantity = {23, 45, 56, 78, 99, 105, 150};

        //Урок Массивы-часть 1. Домашнее задание. Задача 2.
        System.out.println("Урок Массивы-часть 1. Домашнее задание. Задача 2.");
        for (int i = 0; i < height.length; i++) {
            if (i < height.length - 1) {
                System.out.print(height[i] + ",");
            } else
                System.out.print(height[i]);
        }
        System.out.println();

        for (int i = 0; i < width.length; i++) {
            if (i < width.length - 1) {
                System.out.print(width[i] + ",");
            } else
                System.out.print(width[i]);
        }

        System.out.println();

        for (int i = 0; i < quantity.length; i++) {
            if (i < quantity.length - 1) {
                System.out.print(quantity[i] + ",");
            } else
                System.out.print(quantity[i]);
        }

        System.out.println();

        //Урок Массивы-часть 1. Домашнее задание. Задача 3.
        System.out.println("Урок Массивы-часть 1. Домашнее задание. Задача 3.");
        for (int i = height.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(height[i] + ",");
            } else
                System.out.print(height[i]);
        }

        System.out.println();

        for (int i = width.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(width[i] + ",");
            } else
                System.out.print(width[i]);
        }
        System.out.println();


        for (int i = quantity.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(quantity[i] + ",");
            } else
                System.out.print(quantity[i]);
        }
        System.out.println();

        //Урок Массивы-часть 1. Домашнее задание. Задача 3.
        System.out.println("Урок Массивы-часть 1. Домашнее задание. Задача 3.");
        for (int i = 0; i < height.length; i++) {
            if (height[i] % 2 != 0) {
                height[i] = height[i] + 1;
            }
            else {
                height[i] = height[i];
            }

                if (i < height.length - 1) {
                    System.out.print(height[i] + ",");
                } else
                    System.out.print(height[i]);

            }

        }
    }
