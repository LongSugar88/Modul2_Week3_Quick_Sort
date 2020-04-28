public class Quick_Sort {
    int[] quickSort(int[] myArray, int low, int hight ){

        if(low < hight){
            int left = low;
            int right = hight;
            int middle = low + (hight - low)/2;
            int midElement = myArray[middle];
            while (left <= right){
                while (myArray[left] < midElement){
                    left++;
                }
                while (myArray[right] > midElement){
                    right--;
                }
                if(left <= right){
                    int token = myArray[left];
                    myArray[left] = myArray[right];
                    myArray[right] = token;
                    left++;
                    right--;
                }
            }
            if(low < right){
                quickSort(myArray, low, right);
            }
            if (hight > left){
                quickSort(myArray, left, hight);
            }
        }

        return myArray;
    }
    static void print(int[] myArray){
        for(int i=0; i<myArray.length; i++){
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

    }
}
