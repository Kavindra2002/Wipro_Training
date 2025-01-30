package String_QuestionsHW;

public class ArrayComparison {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 3, 2, 4, 5};

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]) {
                System.out.println("Equal");
            } else if (arr1[i] > arr2[i]) {
                System.out.println("Greater");
            } else {
                System.out.println("Lesser");
            }
        }
    }
}