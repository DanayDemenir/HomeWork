public class Printer {
    public void printIntArray(int[] incomeArray){
        for(int i=0;i<incomeArray.length-1;i++){
            System.out.print(incomeArray[i]+", ");
        }
        System.out.print(incomeArray[incomeArray.length-1]);
    }
}
