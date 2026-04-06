import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bt02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.print("Nhập số lượng chuỗi cần chuyển sang số nguyên: ");
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            try {
                System.out.println("Nhập chuỗi cần chuyển đổi sang số nguyên:");
                int n = Integer.parseInt(sc.nextLine());
                list.add(n);
                System.out.println("Chuyển đổi thành công sang số nguyên");
            }
            catch (NumberFormatException e) {
                System.out.println("Không chuyển đổi được sang số nguyên");
            }
        }
        System.out.println("Số chuỗi hợp lệ: " + list.size());
        System.out.println("Số chuỗi không hợp lệ: " + (t - list.size()));
        System.out.print("Danh sách số nguyên hợp lệ: [");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i != list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
