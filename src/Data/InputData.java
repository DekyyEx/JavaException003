package Data;

import java.util.Scanner;

public class InputData {
    public String[] enterData() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите строку через Пробел (Строка должна содержать Ф.И.О, " +
                    "дату рождения - dd.mm.yyyy, номер телефона - цифры, пол - Female/Male) : ");
            String data = scanner.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 6) {
                return arrayData;
            } else if (arrayData.length < 6) {
                System.out.println("you have not entered all the data, please try again");
            } else System.out.println("you entered more data, please try again");
        }
    }
}
