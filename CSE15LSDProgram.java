public class CSE15LSDProgram {
    public static int maxNumIdx(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int maxNum = arr[0];
        int maxNumPlacement = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
                maxNumPlacement = i;
            }
        }
        return maxNumPlacement;
    }
}
