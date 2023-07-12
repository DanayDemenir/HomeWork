class SortIntArray
{
    public int[] bubbleSort(int incomeArray[]){
        for(int i=0; i<incomeArray.length-1; i++){
            for(int j=0; j<incomeArray.length-1; j++){
                if (incomeArray[j]>incomeArray[j+1]){
                    swap(incomeArray,j,j+1);
                }
            }
        }

        return incomeArray;
    }

    private int[] swap(int incomeArray[],int firstPosition, int secondPosition){
        int temp;
        temp=incomeArray[firstPosition];
        incomeArray[firstPosition]=incomeArray[secondPosition];
        incomeArray[secondPosition]=temp;
        return incomeArray;
    }
}

public class Sorting_machine {
    public static void main (String[] args){
        int testArray[] = {3,1,5,2,0,7,1,8,9,4};
        Printer print = new Printer();

        System.out.println("\nМассив до сортировки:");
        print.printIntArray(testArray);
        SortIntArray machine = new SortIntArray();
        testArray = machine.bubbleSort(testArray);
        System.out.println("\nМассив после сортировки:");
        print.printIntArray(testArray);
    }
}
