package personal.day1203;

public  class Day1203 {

    /**
     * 数组选择排序
     * @param arr
     * @throws Exception
     */
    public static void selectSortFunction(int[] arr) throws Exception {
        if(arr.equals(null)) {
            throw new NullPointerException();
        }
        int minIndex = 0;
        for(int i = 0;i<arr.length -1; i++) {
            minIndex = i;
            for(int j = i + 1;j<arr.length;j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if(i != minIndex) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    /**
     * 数组冒泡排序
     * @param arr
     */
    public static void bubbleSortFunction(int[] arr) {
        for(int i = 1;i<arr.length;i++) {
            for(int j = 0;j<i;j++) {
                if(arr[j + 1] < arr[j] ) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    /**
     *
     * @param arr
     */
    public static void insertSortFunction(int[] arr) {
        int min = 0;
        for(int i = 1;i<arr.length;i++) {
             for(int j = i  ;j<arr.length;j++) {
                 if(arr[j] >= arr[j-1]) {
                     int temp = arr[j-1];
                     arr[j-1] = arr[j];
                     arr[j] = temp;
                 }
             }
        }
    }

}
