public class Sum {

    public int sum(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Bhai tum galat ho apna value sahi kroo");
        }
        int c = a + b;
        //we will test Junit for this
        return c;
    }
}
