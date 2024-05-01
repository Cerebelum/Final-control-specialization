public class AnimalCounter implements AutoCloseable {
    private int count = 0;
    private boolean isClosed = false;

    public void incrementCount(Animal animal) {
        if (isClosed) {
            throw new IllegalStateException("Счетчик животных закрыт. Невозможно увеличить счетчик.");
        }
        if (isValidAnimal(animal)) {
            count++;
        }
    }

    public int getCount() {
        if (isClosed) {
            throw new IllegalStateException("Счетчик животных закрыт. Невозможно получить значение счетчика.");
        }
        return count;
    }

    private boolean isValidAnimal(Animal animal) {
        return animal.name != null && !animal.name.isEmpty() && animal.birthDate != null;
    }

    @Override
    public void close() {
        isClosed = true;
    }
}
