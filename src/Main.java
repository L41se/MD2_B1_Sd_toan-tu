
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);//khai bao scanner
        System.out.println("nhap chieu rong: ");
        width = scanner.nextFloat();//nhap chieu rong
        System.out.println("nhap chieu cao: ");
        height = scanner.nextFloat();//nhap chieu cao
        float area = width * height;
        System.out.println("dien tich hcn = " + area);

        }
    }
