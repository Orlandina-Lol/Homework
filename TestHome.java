import java.util.Arrays;

class TestHome {
    public static void main(String[] args) {
        invertArray();
        invertArrayTwo();
    }

    static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print(Arrays.toString(arr));
        System.out.println();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 1){
            arr[i] = 0;
            } else {arr[i] = 1;
            }
        }
        System.out.print(Arrays.toString(arr));
        System.out.println();
    }
    
    static void invertArrayTwo() {
        int[] mass = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print(Arrays.toString(mass));
        System.out.println();
        for (int i = 0; i < mass.length; i++){
            mass[i] = mass[i] ==1 ? 0 : 1;
        }
        System.out.print(Arrays.toString(mass));
    }
}



