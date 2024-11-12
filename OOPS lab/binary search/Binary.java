import java.util.Scanner;
import java.util.Arrays;

class Binary {
    int binarySearch(int array[], int element, int low, int high) {

    while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == element){
                return mid;
            }
            if (array[mid] < element){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return 0;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Binary b = new Binary();

        System.out.print("Enter the size of an array :");
        int n = sc.nextInt();

        int[] a = new int[n]; 

        for(int i = 0; i < n; i++){
            System.out.print("Enter the "+ (i+1) +" element :");
                a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        System.out.print("Enter the element to be searched :");
        int s = sc.nextInt();
        
        sc.close();

        int result = b.binarySearch(a, s, 0, n - 1);
        if (result == 0)
        System.out.println("Not found");
        else
        System.out.println("Element found at index " + result);
    }
}