package com.aston.HW1;



public class HW1 {

    // Перевернуть строку и вывести на консоль
    //  String string = "I love Java";
    public static void turnString(String string) {
        char[] charArray = string.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
        System.out.println();
    }

    // int[] ints = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9};
    // Удалить дубликаты из массива и вывести в консоль
    public static void getDistinctNumbers(int[] ints) {

        // проверяем на дубликаты и если они есть, вместо дубликата ставим 0
        int[] newArr1 = ints;
        for (int i = 0; i < ints.length; i++) {

            for (int j = 0; j < newArr1.length; j++) {
                if(i != j && ints[i] == newArr1[j]) {
                    ints[i] = 0;
                    break;
                }
            }
        }

        // смотрим сколько в нашем массиве повторяющихся значений замененных на 0
        int countZero = 0;
        for(int i: ints) {
            if(i == 0){
                countZero++;
            }
        }
        //создаем массив с колличеством элементов без учета дубликатов и заполняем его уникальными значениями
        int[] newArr2 = new int[ints.length - countZero];
        int j = 0;
        for(int i: ints) {
            if(i != 0){
                newArr2[j] = i;
                j++;
            }
        }
        // Выводим массив с удаленными дубликатами
        for(int i: newArr2) {
            System.out.println(i);
        }
    }

    // Дан массив, заполненный уникальными значениями типа int.
    // int[] arr = {10, 15, 23, 11, 44, 13, 66, 1, 6, 47};
    // Необходимо найти элемент, который меньше максимума, но больше всех остальных.
    public static Integer findSecondMaxElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num: arr) {
            if(num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }
        return secondMax;


    }

    // Найти длину последнего слова в строке. В строке только буквы и пробелы.
    // "Hello world" - 5
    // "    fly me    to the moon    " - 4
    public static Integer lengthOfLastWord(String string) {
        if (string == null || string.length() == 0) {
            return 0; }
        //удаляет пробелы в начале и конце строки, затем разбивает строку на слова по пробелам
        String[] words = string.trim().split("\\s+");
        //возвращает длину последнего слова
        return words[words.length - 1].length();
    }

    // Определить, что строка является палиндромом
    // Сложность по памяти O(1), не создавать новые String, StringBuilder
    // Примеры:
    // abc - false
    // 112233 - false
    // aba - true
    // 112211 - true
    public static boolean isPalindrome(String string) {
        //проверяем строку по символам с начала и конца, постепенно сходясь к середине
        int left = 0;
        int right = string.length() - 1;
        while (left < right) {
            if (string.charAt(left) != string.charAt(right)) {
                return false; }
            left++;
            right--;
        } return true;
    }

}
