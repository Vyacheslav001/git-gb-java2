package ru.geekbrains.dz2.leonov.vyacheslav.dz;

public class MainClass {

    public static void main(String[] args) {
        String[][] matrix = {{"-12", "-1", "3", "5"},
                {"33", "3", "6", "9"},
                {"0", "5", "77", "854"},
                {"11", "5", "99", "-1000"}};
        System.out.println("----------------------------------------");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------");

        try {
            sumArrElements(matrix);
        } catch (MyArraySizeException e) {
            System.out.println("Матрица неподходящего размера!");
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public static void sumArrElements(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr.length != 4 || arr[i].length != 4)
                    throw new MyArraySizeException("Матрица неподходящего размера!");
                sum += methodParseInt(arr[i][j], i, j);
            }
        }
        System.out.println("Сумма всех элементов матрицы равна: " + sum);
    }

    public static int methodParseInt(String str, int y, int x) throws MyArrayDataException {
        int num;
        String regexNegative = "-[0-9]+";
        String regexPositive = "[0-9]+";
        if (str.matches(regexNegative) == false & str.matches(regexPositive) == false)
            throw new MyArrayDataException("Элемент матрицы в координате x:" + x + ", y:" + y + " содержит нечисловое значение!");
        num = Integer.parseInt(str);
        return num;
    }
}
