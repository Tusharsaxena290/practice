import javax.swing.*;
public class Practice2 {
    public static void main(String[] args) {


        String s = JOptionPane.showInputDialog("Enter the decimal value");
        int a = Integer.parseInt(s);
        double b = Double.parseDouble(s);
        double T;
        T = b - a;
        System.out.println(a +"rs" + T +"paise");;
    }


}
