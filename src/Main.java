import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mat, fiz, turk, kim, muzik, toplam = 0, sayac = 0, ort;
        mat = input.nextDouble();
        fiz = input.nextDouble();
        turk = input.nextDouble();
        kim = input.nextDouble();
        muzik = input.nextDouble();

        if(mat>=0 && mat<= 100){
            toplam = toplam + mat;
            ++sayac;
        }

        if(fiz>=0 && fiz<= 100){
            toplam = toplam + fiz;
            ++sayac;
        }

        if(turk>=0 && turk<= 100){
            toplam = toplam + turk;
            ++sayac;
        }

        if(kim>=0 && kim<= 100){
            toplam = toplam + kim;
            ++sayac;
        }

        if(muzik>=0 && muzik<= 100){
            toplam = toplam + muzik;
            ++sayac;
        }

        ort = toplam / sayac;

        System.out.println("ortalama: " + ort);

        if(ort>=55){
            System.out.println("Successful");
        }else {
            System.out.println("Unsuccessful");
        }

    }
}