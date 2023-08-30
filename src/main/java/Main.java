public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Count count = new Count();
        Count.incrementTotalCount();
        count.incrementInstanceCount();
        System.out.println(Count.totalCount);
        System.out.println(count.instanceCount);
    }




}
