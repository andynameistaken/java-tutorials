package arrOfGenericTypeDerrivedFromComparable;

public class GenArr<T extends Comparable<T>> {
    T[] arr;
    private Para<T,T> minMax;
    public GenArr(T[] arr) {
        init(arr);
    }

    public void init(T[] arr) {
        if (arr.length == 0 || arr == null)
            throw  new IllegalArgumentException("Invalid init");
        this.arr = arr;
        minMax = null;
    }
    public T max() {
        return evaluate("MAX").getFirst();
    }
    public T min() {
        return evaluate("MIN").getLast();
    }



    private Para<T,T> evaluate(String kind) {
        if (minMax == null)
            minMax = new Para<>();
        T val = arr[0];
        switch(kind) {
            case "MAX": {
                if (minMax.getFirst() == null)
                    for (T element : arr)
                        if (element.compareTo(val) > 0)
                            val = element;
                minMax.setFirst(val);
            }
            case "MIN" : {
                if (minMax.getLast() == null) {
                    for (T element : arr)
                        if (element.compareTo(val) < 0)
                            val = element;
                    minMax.setLast(val);
                }
            }
        }
        return minMax;
    }

    public static <T> T last(T[] arr) {
        return arr[arr.length - 1];
    }

    public static void main(String[] args) {
        Integer[] arr1 = { 1, 2 , 7, -3 };
        Integer[] arr2 = { 1, 7 , 8, -10 };
        String[]  napisy = { "A", "Z", "C" };

        GenArr<Integer> gai = new GenArr<>(arr1);
        System.out.println(gai.max() + " " + gai.min());
        gai.init(arr2);
        System.out.println(gai.max() + " " + gai.min());

        GenArr<String> gas = new GenArr<>(napisy);
        System.out.println(gas.max() + " " + gas.min());

         Integer[] arr = {1, 2, 3};
        System.out.printf("Last element of an arr: %d\n", GenArr.<Integer>last(arr));

        Integer n = last(new Integer[]{0, 1, 2, 3});
        System.out.println("Integer n = " + n);
    }

}
