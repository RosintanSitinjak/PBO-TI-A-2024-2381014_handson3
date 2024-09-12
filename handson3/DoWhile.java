package handson3;

public class DoWhile {
    public static void main(String[] args) {
            int deretanAngka = 1;

        do {
            if (deretanAngka >= 15){
                break;
            }
            if (deretanAngka % 3 == 0){
                deretanAngka++;
                continue;
            }
            System.out.println("Angka ke- " + (deretanAngka) + ": " + deretanAngka);
            deretanAngka++;

        } while (deretanAngka <= 20);
    }
}




