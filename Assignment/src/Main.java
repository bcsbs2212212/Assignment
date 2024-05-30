
public class Main {
    public static void main(String[] args) {
        int[] data = {2, 8, 7, 1, 3, 5, 6, 4};
        inlinequickSort(data, 0, data.length - 1);
        System.out.print("Sorted data of the given data is: ");
        for (int num : data) {
            System.out.print(num + " ");
        }
    }

    public static void inlinequickSort(int[] arr, int l, int h) {
        if (l < h) {
            int pi = partition(arr, l, h);
            inlinequickSort(arr, l, pi - 1);
            inlinequickSort(arr, pi + 1, h);
        }
    }

    public static int partition(int[] arr, int l, int h) {
        int pivot = arr[h];
        int i = (l - 1);
        for (int j = l; j < h; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[h];
        arr[h] = temp;
        return i + 1;
    }
}