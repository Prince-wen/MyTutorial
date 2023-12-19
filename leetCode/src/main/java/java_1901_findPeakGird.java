import java.util.Arrays;

public class java_1901_findPeakGird {
    public static void main(String[] args) {
        java_1901_findPeakGird o = new java_1901_findPeakGird();
//        int[][] mat = {{1, 4}, {3, 2}};
        int[][] mat = {{10,20,15},{21,30,14},{7,16,32}};
        int[] peakGird = o.findPeakGird(mat);
        System.out.println(Arrays.toString(peakGird));
    }

    private int[] findPeakGird(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        for (int i = 0,j = 0; i < m & j<n;) {
            System.out.print(mat[i][j]+"\t");

            if (j + 1 < n && mat[i][j] < mat[i][j + 1]) {
                j++;continue;
            }
            if (i + 1 < m && mat[i][j] < mat[i + 1][j]) {
                i++;continue;
            }
            if (j - 1 >= 0 && mat[i][j] < mat[i][j - 1]) {
                j--;continue;
            }
            if (i - 1 >= 0 && mat[i][j] < mat[i - 1][j]) {
                i--;continue;
            }
            return new int[]{i, j};
        }
        return null;
    }
}
