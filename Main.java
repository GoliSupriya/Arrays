class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 1, 2, 5, 4, 0 };
        int[] arr2 = new int[] { 2, 4, 5, 0, 1 };
        Solution obj = new Solution();
        obj.check(arr1, arr2);
    }
}

class Solution {
    // Function to check if two arrays are equal or not.
    public boolean check(int[] arr1, int[] arr2) {
        int i, j, temp, temp1;
        int n = arr1.length;
        for (i = 0; i < n; i++) {
            for (j = i; j < n; j++) {
                if (arr1[i] > arr1[j]) {
                    temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        for (i = 0; i < n; i++) {
            for (j = i; j < n; j++) {
                if (arr2[i] > arr2[j]) {
                    temp1 = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp1;
                }
            }
        }
        for (i = 0; i < n; i++) {
            System.out.print(arr2[i]);
        }
        for (i = 0; i < n; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}