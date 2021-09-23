class SelectionSort
{
    public static void print_name(String name)
    {
        System.out.println("Student Name: ");
        System.out.println("\t" + name);
    }

    public static void print_section(String section)
    {
        System.out.println("Section: ");
        System.out.println("\t" + section);
    }

    public static void selectionSort(int[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            int k = minIndex(a,i);
            //swap
            int t = a[k]; a[k] = a[i]; a[i] = t;
        }
    }

    public static int[] selectionSortBook(int[] a)
    {
        int[] newArr = new int[a.length];
        for(int i = 0; i < a.length; i++)
        {
            int smallest = minIndex(a,i);
            newArr[smallest] = a[smallest];
        }
        return newArr;

    }
    public static int minIndex(int[] list, int i)
    {
        int answer = i;
        int min = list[answer];
        for(int k = answer+1; k < list.length; k++)
        {
            if(k < min)
            {
                min = list[k];
                answer = k;
            }
        }
        return answer;
    }

    public static void print(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}