import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalRegistry {
    List<Animal> animals = new ArrayList<>();
    Scanner scanner = new Scanner(System.in, "cp866");
    private AnimalCounter counter;

    public AnimalRegistry() {
        counter = new AnimalCounter();
    }

    public void addAnimal() {
        System.out.print("Введите тип животного (DOG, CAT, HAMSTER, HORSE, CAMEL, DONKEY): ");
        String type = scanner.nextLine().toUpperCase();

        AnimalType animalType;
        try {
            animalType = AnimalType.valueOf(type);
        } catch (IllegalArgumentException e) {
            System.out.println("Неверный тип животного.");
            return;
        }

        System.out.print("Введите имя животного: ");
        String name = scanner.nextLine();

        System.out.print("Введите дату рождения животного (гггг-мм-дд): ");
        LocalDate birthDate = LocalDate.parse(scanner.nextLine());

        try (AnimalCounter ignored = new AnimalCounter()) {
            Animal animal = createAnimal(animalType, name, birthDate);
            if (animal != null) {
                if (isValidAnimal(animal)) {
                    animals.add(animal);
                    counter.add();
                    System.out.println("Животное добавлено в реестр.");
                    System.out.println("Общее количество животных: " + counter.getCount());
                } else {
                    System.out.println("Некоторые поля не заполнены. Животное не добавлено в реестр.");
                }
            } else {
                System.out.println("Неверный тип животного.");
            }
        } catch (Exception e) {
            System.out.println("Ошибка при работе со счетчиком животных: " + e.getMessage());
        }
    }

    private boolean isValidAnimal(Animal animal) {
        if (animal.name == null || animal.name.equals("")) {
            return false;
        }
    
        if (animal.birthDate == null) {
            return false;
        }
    
        return true;
    }

    private Animal createAnimal(AnimalType type, String name, LocalDate birthDate) {
        switch (type) {
            case DOG:
                return new Dog(name, birthDate);
            case CAT:
                return new Cat(name, birthDate);
            case HAMSTER:
                return new Hamster(name, birthDate);
            case HORSE:
                return new Horse(name, birthDate);
            case CAMEL:
                return new Camel(name, birthDate);
            case DONKEY:
                return new Donkey(name, birthDate);
            default:
                return null;
        }
    }

    public void listCommands() {
        System.out.print("Введите имя животного: ");
        String name = scanner.nextLine();

        Animal animal = findAnimalByName(name);
        if (animal != null) {
            System.out.println("Команды для " + animal.name + ":");
            for (String command : animal.commands) {
                System.out.println(command);
            }
        } else {
            System.out.println("Животное не найдено.");
        }
    }

    private Animal findAnimalByName(String name) {
        for (Animal animal : animals) {
            if (animal.name.equalsIgnoreCase(name)) {
                return animal;
            }
        }
        return null;
    }

    public void teachCommand() {
        System.out.print("Введите имя животного: ");
        String name = scanner.nextLine();

        Animal animal = findAnimalByName(name);
        if (animal != null) {
            System.out.print("Введите новую команду: ");
            String command = scanner.nextLine();
            animal.commands.add(command);
            System.out.println("Команда добавлена");
        } else {
            System.out.println("Животное не найдено.");
        }
    }

    public void listByBirthDate() {
        System.out.println("Животные, отсортированные по дате рождения:");
        List<Animal> sortedAnimals = new ArrayList<>(animals);
    
        for (int i = 0; i < sortedAnimals.size() - 1; i++) {
            for (int j = 0; j < sortedAnimals.size() - i - 1; j++) {
                if (sortedAnimals.get(j).birthDate.isAfter(sortedAnimals.get(j + 1).birthDate)) {
                    Animal temp = sortedAnimals.get(j);
                    sortedAnimals.set(j, sortedAnimals.get(j + 1));
                    sortedAnimals.set(j + 1, temp);
                }
            }
        }
    
        for (Animal animal : sortedAnimals) {
            String animalType = animal.getClass().getSimpleName();
            System.out.println("- " + animal.name + " (" + animalType + "), дата рождения: " + animal.birthDate);
        }
    }

    public void displayMenu() {
        boolean quit = false;
        while (!quit) {
            System.out.println("\nМеню реестра животных:");
            System.out.println("1. Добавить новое животное");
            System.out.println("2. Вывести список команд животного");
            System.out.println("3. Обучить животное новой команде");
            System.out.println("4. Вывести список животных по дате рождения");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addAnimal();
                    break;
                case 2:
                    listCommands();
                    break;
                case 3:
                    teachCommand();
                    break;
                case 4:
                    listByBirthDate();
                    break;
                case 0:
                    quit = true;
                    break;
                default:
                    System.out.println("Неверный выбор. Попробуйте еще раз.");
            }
        }
    }
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();
        registry.displayMenu();
    }
}
