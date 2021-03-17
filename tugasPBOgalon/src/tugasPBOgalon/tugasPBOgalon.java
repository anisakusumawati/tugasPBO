package tugasPBOgalon;
import java.util.Scanner;
public class tugasPBOgalon {


        public static void main(String[] args){

            int gallons = 0 ;
            double liters;

            Scanner scan = new Scanner(System.in);
            System.out.println("Masukkan Gallon yang ingin di konversi : ");
            gallons = scan.nextInt();


            liters = gallons *3.785;



            System.out.println(gallons + " galon adalah " + liters + " liter.");



        }
    }

