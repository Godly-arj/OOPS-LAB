public class QuickSort {
    String names[];
    int length;

    void exchangeNames(int i, int j) {
        String temp = this.names[i];
        this.names[i] = this.names[j];
        this.names[j] = temp;
    }

    void sort(String array[]) {
        if (array == null || array.length == 0) {
            return;
        }
        this.names = array; // Corrected
        this.length = array.length;
        quickSort(0, length - 1);
    }

    void quickSort(int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;

        String pivot = this.names[lowerIndex + (higherIndex - lowerIndex) / 2]; 

        while (i <= j) {
            while (this.names[i].compareToIgnoreCase(pivot) < 0) {
                i++;
            }
            while (this.names[j].compareToIgnoreCase(pivot) > 0) { 
                j--;
            }

            if (i <= j) {
                exchangeNames(i, j);
                i++;
                j--;
            }
        }

        if (lowerIndex < j) {
            quickSort(lowerIndex, j);
        }
        if (i < higherIndex) {
            quickSort(i, higherIndex);
        }
    }

    public static void main(String[] args) {
        QuickSort q = new QuickSort();

        String stringList[] = {"Raja", "Gouthu", "Rani", "Gouthami", "Hello"};
        q.sort(stringList);

        for (String i : stringList) {
            System.out.print(i);
            System.out.print(" ");
        }
    }
}