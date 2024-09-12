package handson3;

public class ForEach {
    public static void main(String[] args) {
        int[] deretanAngka = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        for (int angka : deretanAngka) {
            if (angka == 15) {
                break;
            }
            if (angka % 3 == 0) {
                continue;
            }
            System.out.println("Angka ke- " + angka + ": " + angka);
        }
    }
}


