import java.util.Scanner;

/*
Dairenin Alanını ve Çevresini Hesaplayan Program
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

Alan Formülü : π * r * r;

Çevre Formülü : 2 * π * r;

Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360
 */
public class Main {
    public static void main(String[] args) {

        float yaricap,cevre,alan,aci,dilimAlan;
        Scanner yazici = new Scanner(System.in);
        System.out.println("Lutfen bir yaricapi giriniz:");
        yaricap=yazici.nextFloat();
        System.out.println("Acinizi giriniz: ");
        aci=yazici.nextFloat();

        cevre= (float) (2*Math.PI*yaricap);
        alan= (float)(Math.PI*yaricap*yaricap);

        dilimAlan=(float)((Math.PI*(yaricap*yaricap)*aci)/360);
        System.out.println("Dairenin Tam Alani: "+alan);
        System.out.println("Dairenin Tam Cevresi: "+cevre);
        System.out.println("Dairenin dilimsel alani: "+dilimAlan);
    }
}
