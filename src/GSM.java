import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GSM {
    public static void main(String[] args) throws IOException {

        double priceOne = 46.1;
        double priceTwo = 48.9;
        double priceThree = 47.5;
        double priceFour = 48.9;

        double expenseOne = 12.5;
        double expenseTwo = 12.0;
        double expenseThree = 11.5;
        double expenseFour = 20.0;

        /* Расчет стоимости расходов для каждого кода на 100км  */

        double allExpenseOne = priceOne * expenseOne;
        double allExpenseTwo = priceTwo * expenseTwo;
        double allExpenseThree = priceThree * expenseThree;
        double allExpenseFour = priceFour * expenseFour;

        System.out.format("Стоимость расходов на 100км с кодом 100 = %.2f%n", allExpenseOne);
        System.out.format("Стоимость расходов на 100км с кодом 200 = %.2f%n", allExpenseTwo);
        System.out.format("Стоимость расходов на 100км с кодом 300 = %.2f%n", allExpenseThree);
        System.out.format("Стоимость расходов на 100км с кодом 400 = %.2f%n", allExpenseFour);

        /* Расчет наибольшей стоимости расходов на 100 км  */

        double a = (Math.max(allExpenseOne, allExpenseTwo));
        double b = (Math.max(allExpenseThree, allExpenseFour));
        double c = (Math.max(a, b));

        if (c == allExpenseOne) {
            System.out.println("Наибольшая стоимость расходов на 100км: с кодом 100");
        } else if (c == allExpenseTwo) {
            System.out.println("Наибольшая стоимость расходов на 100км: с кодом 200");
        } else if (c == allExpenseThree) {
            System.out.println("Наибольшая стоимость расходов на 100км: с кодом 300");
        } else if (c == allExpenseFour) {
            System.out.println("Наибольшая стоимость расходов на 100км: с кодом 400");
        }

        /* Расчет наименьшей стоимости расходов на 100 км  */


        double d = (Math.min(allExpenseOne, allExpenseTwo));
        double e = (Math.min(allExpenseThree, allExpenseFour));
        double f = (Math.min(d, e));

        if (f == allExpenseOne) {
            System.out.println("Наименьшая стоимость расходов на 100км: с кодом 100");
        } else if (f == allExpenseTwo) {
            System.out.println("Наименьшая стоимость расходов на 100км: с кодом 200");
        } else if (f == allExpenseThree) {
            System.out.println("Наименьшая стоимость расходов на 100км: с кодом 300");
        } else if (f == allExpenseFour) {
            System.out.println("Наименьшая стоимость расходов на 100км: с кодом 400");
        }

        String[] gsmArray = {"C100_1-100", "C200_1-120-1200", "C300_1-120-30",
                "C400_1-80-20", "C100_2-50", "C200_2-40-1000", "C300_2-200-45",
                "C400_2-10-20", "C100_3-10", "C200_3-170-1100", "C300_3-150-29",
                "C400_3-100-28", "C100_1-300", "C200_1-100-750", "C300_1-32-15"};

        /* Расчет итоговой стоимости расходов на 100 км, учитывая данные по кодам в массиве   */

        double sum = 0.0;
        double doubleArray[] = new double[15];

        for (int i = 0; i < gsmArray.length; i++) {

            String testString = gsmArray[i];

            if (testString.subSequence(1, 2).equals("1")) {
                double y = allExpenseOne;
                doubleArray[i] = y;
            } else if (testString.subSequence(1, 2).equals("2")) {
                double y = allExpenseTwo;
                doubleArray[i] = y;

            } else if (testString.subSequence(1, 2).equals("3")) {
                double y = allExpenseThree;
                doubleArray[i] = y;

            } else if (testString.subSequence(1, 2).equals("4")) {
                double y = allExpenseFour;
                doubleArray[i] = y;

            }
        }
        int index = 0;
        while (index < doubleArray.length) {
            sum += doubleArray[index];
            index++;
        }
        System.out.format("Общая стоимость расходов на ГСМ = %.2f%n", sum);

        /* Вывод информации машин по введенному в консоль коду */


        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        Arrays.sort(gsmArray);
        System.out.println("Введите код авто для получения дальнейшей информации(рекомендованные значения 100, 200, 300, 400):");
        while (true) {
            String s = buffer.readLine();
            if (s.equals("100")) {
                for (String testString : gsmArray) {

                    if (testString.subSequence(1, 2).equals("1")) {
                        if (testString.contains("-")) {
                            testString= testString.replaceAll("-", " ");
                        }
                        System.out.println("Код машины" +  "| "  + testString.subSequence(1,4) +  "| "
                                +  "Гос номер" +  "| "  + testString.subSequence(5,6)
                        + "|" +  "Пробег" +  "| "  + testString.substring(7));
                    }
                }
                break;
            }

            if (s.equals("200")) {
                for (String testString : gsmArray) {

                    if (testString.subSequence(1, 2).equals("2")) {
                        if (testString.contains("-")) {
                            testString= testString.replaceAll("-", " ");
                        }
                        System.out.println("Код машины" +  "| "  + testString.subSequence(1,4) +  "| "
                                +  "Гос номер" +  "| "  + testString.subSequence(5,6)
                                + "|" +  "Пробег" +  "| "  + testString.substring(7,10) + "|" +
                                "Доп.параметр" +  "| "  + testString.substring(10));
                    }
                }
                break;
            }
            if (s.equals("300")) {
                for (String testString : gsmArray) {

                    if (testString.subSequence(1, 2).equals("3")   ) {
                        if (testString.contains("-")) {
                            testString= testString.replaceAll("-", " ");
                        }
                        System.out.println("Код машины" +  "| "  + testString.subSequence(1,4) +  "| "
                                +  "Гос номер" +  "| "  + testString.subSequence(5,6)
                                + "|" +  "Пробег" +  "| "  + testString.substring(7,10) + "|" +
                                "Доп.параметр" +  "| "  + testString.substring(11)) ;                                      ;
                    }
                }
                break;
            }
            if (s.equals("400")) {
                for (String testString : gsmArray) {

                    if (testString.subSequence(1, 2).equals("4")) {
                        if (testString.contains("-")) {
                            testString= testString.replaceAll("-", " ");
                        }
                        System.out.println("Код машины" +  "| "  + testString.subSequence(1,4) +  "| "
                                +  "Гос номер" +  "| "  + testString.subSequence(5,6)
                                + "|" +  "Пробег" +  "| "  + testString.substring(7,10) + "|" +
                                "Доп.параметр" +  "| "  + testString.substring(10)) ;
                    }
                }
                break;
            }
            if ( (!s.equals("100")) || (!s.equals("200")) || (!s.equals("300")) || (!s.equals("400")) ) {
                System.out.println("Введен неверный код(рекомендованные значения 100, 200, 300, 400)");
            }
            break;
        }

    }

}


