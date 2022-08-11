import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.println("nhập vào size mảng");
        size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("arr[" + i + "]=");
            arr[i] = scanner.nextInt();
        }
        System.out.println("lựa chọn cách sắp xếp: \n 1: sắp xếp chèn \n 2: sắp xếp nổi bọt \n 3: sắp xếp chọn");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                insertionSort(arr);
                printArray(arr);
                break;
            case 2:
                bubbeleSort(arr);
                printArray(arr);
                break;
            case 3:
                selectionSort(arr);
                printArray(arr);
                break;
            default:
                System.out.println("chọn lại");
                break;
        }
    }

    public static void insertionSort(int[] array) {
        // Phương thức sắp xếp chèn
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;
            // Di chuyển các phần tử của arr [0 ... i - 1], lớn hơn key
            // đến một vị trí trước vị trí hiện tại của chúng
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void bubbeleSort(int[] array) {
        // Phương thức sắp xếp nổi bọt
        int n = array.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    // swap arr[j+1] và arr[i]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }

    static void selectionSort(int array[]) {

        for (int i = 0; i < array.length - 1; i++) {
            int minValue = array[i];

            int minindex = i;

            for (int j = i + 1; j < array.length; j++) {


                if (minValue > array[j]) {
                    minValue = array[j];
                    minindex = j;
                }
            }
            if (minindex != i) {
                int temp = array[i];
                array[i] = minValue;
                array[minindex] = temp;
            }
        }
    }

    static void printArray(int array[]) {
        int n = array.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}