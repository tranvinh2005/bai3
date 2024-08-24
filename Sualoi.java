
package sualoi;

import java.util.Scanner;

public class Sualoi{

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("nhap ten");
        String ten = keyboard.nextLine();

        System.out.println("nhap tuoi");
        int tuoi = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("nhap nam sinh");
        int namsinh = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("nhap chuyen nganh");
        String chuyennganh = keyboard.nextLine();

        System.out.println("nhap gta");
        int gta = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("nhap quequan");
        String quequan = keyboard.nextLine();

        System.out.println("ten la " + ten);
        System.out.println("tuoi la " + tuoi);
        System.out.println("nam sinh la " + namsinh);
        System.out.println("chuyen nganh la " + chuyennganh);
        System.out.println("gta la " + gta);
        System.out.println("que quan la " + quequan);

        System.out.println("nhap chuoi:");
        if (keyboard.hasNextLine()) {
            boolean input = keyboard.nextBoolean();
            System.out.println("nhap chuoi: " + input);
        } else {
            System.out.println("ko phai chuoi hop le.");
        }

        System.out.println("nhap so nguyen:");
        if (keyboard.hasNextLine()) {
            boolean input = keyboard.nextBoolean();
            System.out.println("hop le: " + input);
        } else {
            System.out.println("ko phai chuoi hop le.");
        }

        keyboard.close();
    }
}