package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int ROZMIAR=10;
    private static final int RETURN=-1;
    private final int[] NUMBERS = new int[ROZMIAR];

    private int total = RETURN;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    boolean callCheck() {
        return total == RETURN;
    }

    boolean isFull() {
        return total == 11;
    }

    int peekaboo() {
        if (callCheck())
            return RETURN;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return RETURN;
        return NUMBERS[total--];
    }

}
