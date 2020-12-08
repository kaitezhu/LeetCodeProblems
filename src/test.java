public class test {
    public static void main(String[] args) {

        System.out.println(recurrence(5));
    }

    public static int recurrence(int i) {
        if (i == 0) {
            return 0;
        } else {
            return recurrence(i - 1) + i;
        }
    }
}
