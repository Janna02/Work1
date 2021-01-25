import java.util.Arrays;
import java.util.Scanner;

class WorkTwo {

    public int[] array;

    public WorkTwo(int a[]) {
        this.array = a;
    }

    public static void addingLastPosition() {
        WorkTwo test = new WorkTwo(new int[]{5, 8, 6});
        System.out.println("Добавление в последнюю позицию элемента в массив");

        WorkTwo testOne = new WorkTwo(Arrays.copyOf(test.array, test.array.length + 1));
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите значение для добавления в массив последним элементом:");
        int b = sc1.nextInt();
        sc1.close();
        testOne.array[test.array.length] = b;
        for (int y = 0; y < testOne.array.length; y++) {
            System.out.println(testOne.array[y]);
        }

    }

    public static void addingNPosition() {
        WorkTwo test = new WorkTwo(new int[]{5, 8, 6});
        System.out.println("Добавление в нужную позицию элемента в массив");

        WorkTwo testTwo = new WorkTwo(Arrays.copyOf(test.array, test.array.length + 1));
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите значение которое нужно добавить:");
        int c = sc2.nextInt();
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Введите индекс каким нужно добавить элемент в массив:");
        int d = sc3.nextInt();
        if (d != 3) {
            int tmp = testTwo.array[d];
            testTwo.array[d] = testTwo.array[test.array.length];
            testTwo.array[test.array.length] = tmp;
        }
        testTwo.array[d] = c;
        for (int y = 0; y < testTwo.array.length; y++) {
            System.out.println(testTwo.array[y]);
        }
        sc2.close();
        sc3.close();

    }

    public static void showCountElements() {
        WorkTwo test = new WorkTwo(new int[]{5, 8, 6});
        int t = test.array.length;
        System.out.println(t);
    }

    public static void deleteNElements() {
        Scanner input = new Scanner(System.in);
        WorkTwo test = new WorkTwo(new int[]{5, 8, 6});
        System.out.println("Удаление в нужной позиции элемента в массиве");
        System.out.println("Введите позицию элемента,  который нужно удалить: ");
        int index = input.nextInt();
        for (int y = 0; y < test.array.length; y++) {
            if (test.array[y] == index) {
                break;
            }
            if (test.array[y] != index) {
                test.array[index] = test.array[index + 1];
            }
        }
        for (int y = 1; y < test.array.length; y++) {
            System.out.println(test.array[y]);
        }
    }

    public static void changeNElements() {
        WorkTwo test = new WorkTwo(new int[]{5, 8, 6});
        System.out.println("Замена в нужной позиции значения элемента в массиве");
        System.out.println("Введите позицию элемента,  которому  нужно заменить значение: ");
        Scanner sc6 = new Scanner(System.in);
        int g = sc6.nextInt();
        System.out.println("Введите значение на которое заменить: ");
        Scanner sc7 = new Scanner(System.in);
        int h = sc7.nextInt();
        for (int y = 0; y < test.array.length; y++) {
            if (test.array[y] == test.array[g]) {
                test.array[g] = h;
            }
        }
        for (int y = 0; y < test.array.length; y++) {
            System.out.println(test.array[y]);
        }
    }


    public static void changeElementsOnIdenticalValue() {
        WorkTwo test = new WorkTwo(new int[]{5, 8, 6});
        System.out.println("Изменение значений элементов в массиве на одинаковое значение");

        WorkTwo testOne = new WorkTwo(Arrays.copyOf(test.array, test.array.length + 1));
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите значение для изменения в массиве значения элементов:");
        int b = sc1.nextInt();
        sc1.close();
        for (int y = 0; y < testOne.array.length; y++) {
            testOne.array[y] = b;
        }
        for (int y = 0; y < testOne.array.length; y++) {
            System.out.println(testOne.array[y]);
        }

    }

    public static void sortArrayByAsc() {
        WorkTwo test = new WorkTwo(new int[]{5, 8, 10});
        System.out.println("Сортировка значений элементов в массиве по возрастанию");
        Arrays.sort(test.array);
        for (int y = 0; y < test.array.length; y++) {
            System.out.println(test.array[y]);
        }
    }

    public static void sortArrayByDesc() {
        WorkTwo test = new WorkTwo(new int[]{5, 8, 10});
        System.out.println("Сортировка значений элементов в массиве по убыванию");
        for (int i = 0; i < test.array.length; i++) {
            for (int j = i + 1; j < test.array.length; j++) {
                if (test.array[i] < test.array[j]) {
                    int tmp = test.array[i];
                    test.array[i] = test.array[j];
                    test.array[j] = tmp;
                }
            }
        }
        for (int y = 0; y < test.array.length; y++) {
            System.out.println(test.array[y]);
        }

    }

    public static void minValueOfArray() {
        WorkTwo test = new WorkTwo(new int[]{5, 8, 10});
        System.out.println("Нахождение минимального значения в массиве");
        Arrays.sort(test.array);
        System.out.println("Минимальное значение в массиве:  " + test.array[0]);
    }

    public static void maxValueOfArray() {
        WorkTwo test = new WorkTwo(new int[]{5, 8, 10});
        System.out.println("Нахождение минимального значения в массиве");
        Arrays.sort(test.array);
        System.out.println("Минимальное значение в массиве:  " + test.array[test.array.length - 1]);
    }


    public static void main(String[] args) {
        System.out.println(
                "1:Добавление элемента в последнюю позицию массива;   " +
                        "2:Добавление элемента в нужную позицию массива; " +
                        "3:Показать кол-во элементов в массиве;      " +
                        "4: Удаление элементов в массиве; " +
                        "5: Изменение нужных элементов в массиве;  " +
                        "6: Изменение элементов в массиве на одинаковое значение;" +
                        "7: Сортировка массива по возрастанию;" +
                        "8: Сортировка массива по убыванию;" +
                        "9: Поиск минимального значения массива;" +
                        "10: Поиск максимального значения массива ");
        System.out.println("Введите код операции:");
        Scanner sc4 = new Scanner(System.in);
        int e = sc4.nextInt();
        switch (e) {
            case 1:
                addingLastPosition();
                break;
            case 2:
                addingNPosition();
                break;
            case 3:
                showCountElements();
                break;
            case 4:
                deleteNElements();
                break;
            case 5:
                changeNElements();
                break;
            case 6:
                changeElementsOnIdenticalValue();
                break;
            case 7:
                sortArrayByAsc();
                break;
            case 8:
                sortArrayByDesc();
                break;
            case 9:
                minValueOfArray();
                break;
            case 10:
                maxValueOfArray();
                break;
        }

    }


}





