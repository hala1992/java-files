
public class SelectionSortDemo
{
   public static void main(String[] arg)
   {
      int[] values = {5, 7, 2, 8, 9, 1};

      System.out.println("The unsorted values are:");
      for (int index = 0; index < values.length; index++)
         System.out.print(values[index] + " ");
      System.out.println();

      selectionSort(values);

      System.out.println("The sorted values are:");
      for (int index = 0; index < values.length; index++)
         System.out.print(values[index] + " ");
   }
      
   public static void selectionSort(int[] array)
   {
      int startScan, index, minIndex, minValue;

      for (startScan = 0; startScan < (array.length-1); startScan++)
      {
         minIndex = startScan;
         minValue = array[startScan];
         for(index = startScan + 1; index < array.length; index++)
         {
            if (array[index] < minValue)
            {
               minValue = array[index];
               minIndex = index;
            }
         }
         array[minIndex] = array[startScan];
         array[startScan] = minValue;
      }
   }
}
