package laboop.Lab01.Otherspr;
import java.util.Scanner;

public class MonthYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);//lay input thong qua doi tuong s
        int year;       //khoi tao
        int month = -1; //
        String[] months = {//lke cac tang
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        while (true) {
            System.out.print("Enter a month (e.g., January, Jan., Jan, 1): ");
            String inputMonth = s.nextLine();   //scan month
            System.out.print("Enter a year (e.g., 1999): ");
            String inputYear = s.nextLine();//scan year

            // Kiểm tra tính đúng đắn của năm (không âm, tất cả các chữ số)
            if (inputYear.matches("\\d+")) { //ktra xem string chua chu so
                year = Integer.parseInt(inputYear);
            } else {
                System.out.println("Invalid year. Please enter a valid year.");//year k hop le
                continue;
            }

            // Kiểm tra tính đúng đắn của tháng
            boolean validMonth = false;
            for (int i = 0; i < months.length; i++) {//check thang
                if (inputMonth.equalsIgnoreCase(months[i]) || inputMonth.equalsIgnoreCase(months[i].substring(0, 3)) || inputMonth.equals(String.valueOf(i + 1))) {
                    month = i + 1;
                    validMonth = true;
                    break;
                }
            }

            if (!validMonth) {
                System.out.println("Invalid month. Please enter a valid month."); // month k hople
                continue;
            }

            // Kiểm tra năm nhuận
            boolean isLeapYear = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));

            // Tính số ngày trong tháng đã chọn
            int daysInMonth;
            switch (month) {
                case 4:
                case 6:
                case 9:
                case 11:
                    daysInMonth = 30;
                    break;
                case 2:
                    daysInMonth = isLeapYear ? 29 : 28;//check thang 2 nam nhuan
                    break;
                default:
                    daysInMonth = 31;
            }

            System.out.println("There are " + daysInMonth + " days in " + months[month - 1] + " " + year);//in ra kq
            break;
        }

        s.close();
    }
}