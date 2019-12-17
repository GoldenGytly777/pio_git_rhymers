package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int ROZMIAR=10;
    private static final int RETURN=-1;
    private final int[] NUMBERS = new int[ROZMIAR];

    public int total = RETURN;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == RETURN;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
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
