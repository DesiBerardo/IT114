class Main
{
    public static void main(String[] args)
    {
        String myName = "Desimir";
        String mySection = "001";
        int start = 0;
        int loc = 0;

        SelectionSort.print_name(myName);
        SelectionSort.print_section(mySection);

        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        SelectionSort.print(arr1);

        int[] arr2 = {7, 9};
        SelectionSort.print(arr2);

        int[] arr3 = {};
        SelectionSort.print(arr3);

        int[] arr4 = {33,41,59,62,71,88,91};
        SelectionSort.print(arr4);

        start = 4;
        loc = SelectionSort.minIndex(arr1, start);
        System.out.println(loc);

        start = 8;
        loc = SelectionSort.minIndex(arr1, start);
        System.out.println(loc);

        start = 0;
        loc = SelectionSort.minIndex(arr1, start);
        System.out.println(loc);

        int[] arr5 = {50, 22, 53, 83, 1, 21, 20, 49, 81, 18};
        loc = SelectionSort.minIndex(arr5, start);
        System.out.println(loc);

        start = 5;
        loc = SelectionSort.minIndex(arr5, start);
        System.out.println(loc);
    }
}