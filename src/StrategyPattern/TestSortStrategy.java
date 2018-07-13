package StrategyPattern;

public class TestSortStrategy {
    SortStrategy mystrategy;
    public static void main(String[] args){
        TestSortStrategy myStrategy=new TestSortStrategy();
        int[] a = {5, 6, 2, 4, 9, 8, 6, 7, 1};
        myStrategy.setStrategy(new InsertStrategy());
        myStrategy.sortArr(a);

        for (int i : a) {
            System.out.print(i + " ");

        }

    }
    public void setStrategy(SortStrategy strategy){
        mystrategy=strategy;
    }
    public void sortArr(int[] a){
         mystrategy.sort(a);
    }
}
