package StrategyPattern;

public class InsertStrategy implements SortStrategy {
    @Override
    public void sort(int[] a) {
        for (int i = 1; i < a.length; ++i) {
            if (a[i] < a[i - 1]) {
                int temp = a[i];
                int j;
                for (j = i - 1; j >= 0 && a[j] > temp; --j) {
                    a[j + 1] = a[j];
                }
                a[j + 1] = temp;
            }
        }
    }
}
