public class Main {
    public static void main(String[] args) {

        Main sl = new Main();


        int num[] = {4, 2, 10, 123, -3,
                32, 0, 34, 12, 91, 45,
                3, 21, 87, 61};

        sl.selectionSort_v01(num);

        for (int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }
    }

    public boolean selectionSort_v01(int vetor []) {
        if (vetor == null) return false;
        for (int i = 0; i < vetor.length - 1; i++) {
            int min = i;
            for (int j = i+1; j < vetor.length; j++) {
                if ( vetor[j] < vetor[min] ) min = j;
            }
            int temp = vetor[i];
            vetor[i] = vetor[min];
            vetor[min] = temp;
        }
        return true;
    }

}