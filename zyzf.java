import java.util.Scanner;
import java.io.*;

class clothes {
    public int pockets;
    public String color;
    public clothes() {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            System.out.print("Введите количество карманов: ");
            pockets = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Введите цвет: ");
            color = bufferedReader.readLine();
        } catch (Exception e) {
            System.out.println("Неверный тип данных!");
        }
    }
    public void print_pockets() {
        System.out.println(pockets);
    }
    public void print_color() {
        System.out.println(color);
    }
    @Override
    public String toString() {
        return "Карманов: " + pockets + ", цвет: " + color;
    }
}

class pants extends clothes{
    public int buttons;
    public int zipper;
    public pants() {
        InputStream inputstream = System.in;
        Reader inputstreamReader = new InputStreamReader(inputstream);
        BufferedReader bufferedreader = new BufferedReader(inputstreamReader);
        try {
            System.out.print("Введите количество пуговиц: ");
            buttons = Integer.parseInt(bufferedreader.readLine());
            System.out.print("Введите количество ширинок: ");
            zipper = Integer.parseInt(bufferedreader.readLine());
        } catch (Exception e) {
            System.out.println("Неверный тип данных!");
        }
    }
    public void print_buttons() {
        System.out.println(buttons);
    }
    public void print_zipper() {
        System.out.println(zipper);
    }
    @Override
    public String toString() {
        return "Пуговиц: " + buttons + ", ширинок: " + zipper;
    }
}

public class zyzf{
    public static void main(String[] args) {
        clothes clth = new clothes();
        clothes pant = new pants();

        pant.print_color();
    }
}