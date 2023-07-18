import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        int yil;
        Scanner input = new Scanner(System.in);
        System.out.print("Yılı giriniz: ");
        yil = input.nextInt();

        if(yil%400==0 && yil%100==0){
            System.out.println("Artık yıl");
        } else if(yil%4==0 && yil%100!=0){
            System.out.println("Artık yıl");
        } else{
            System.out.println("Artık yıl değil");
        }
    }
}
