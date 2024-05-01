public class AnimalCounter implements AutoCloseable {
    private int count = 0;
    private boolean isClosed = false;

    public void add() {
        if (isClosed) {
            throw new IllegalStateException("Невозможно увеличить счетчик.");
        }
        count++;
    }

    public int getCount() {
        if (isClosed) {
            throw new IllegalStateException("Невозможно получить значение счетчика.");
        }
        return count;
    }

    @Override
    public void close() {
        isClosed = true;
    }
}
