package lesson;

public class DivisionTask {

    private int count = 1;

    public DivisionTask() {
        count++;
    }

    public void getCount() {
        System.out.println(count);
    }

    public static void main(String[] args) {
        DivisionTask t1 = new DivisionTask();
        DivisionTask t2 = new DivisionTask();
        DivisionTask t3 = new DivisionTask();
        DivisionTask t4 = new DivisionTask();

        t1.getCount();
        t2.getCount();
        t3.getCount();
        t4.getCount();

        t2.getCount();
    }
}
