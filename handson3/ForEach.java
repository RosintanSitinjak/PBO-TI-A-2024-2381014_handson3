package handson3;

public class ForEach {
    public static void main(String[] args) {

        int[] banyakAngka = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        for (int angka : banyakAngka){
            if (angka % 3) {
                break;
            }
            if (angka == 14) {
                continue;
            }



//        for (int i = 0; i < banyakAngka.length ; i++){
//            if ( (i + 1) % 3 == 0){
//                continue;
//            }
//            if ( i == 14){
//                break;
            }
            System.out.println("Angka ke " + ( banyakAngka + 1) + ": " + angka[i]);
        }
    }
}

