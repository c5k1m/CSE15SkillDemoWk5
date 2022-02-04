public class CSE15LSDProgram {
    public static int maxNumIdx(int[] arr) {
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
