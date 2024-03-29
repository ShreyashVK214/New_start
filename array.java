public class ArrayTransform {
    public static int[][] transformArray(int[][] inputArray) {
        int rows = inputArray.length;
        int cols = inputArray[0].length;
        
        int[][] transformedArray = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int originalValue = inputArray[i][j];
                int newValue = originalValue + (i + 1) * 10 + (j + 1);
                transformedArray[i][j] = newValue;
            }
        }
        
        return transformedArray;
    }

    public static void main(String[] args) {
        int[][] inputArray = {{1, 2, 3}, {4, 5, 6}};
        int[][] transformedArray = transformArray(inputArray);
        
        for (int i = 0; i < transformedArray.length; i++) {
            for (int j = 0; j < transformedArray[0].length; j++) {
                System.out.print(transformedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
