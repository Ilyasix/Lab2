package Lab2;

/**
 * Клас Cl3, який реалізує інтерфейси If3 та If2.
 * @author Ilyas
 */
class Cl3 implements If3, If2 {

    /**
     * Реалізація методу methodIf3 з інтерфейсу If3.
     * Виводить повідомлення про виклик методу methodIf3.
     */
    @Override
    public void methodIf3() {
        System.out.println("Cl3 - methodIf3");
    }

    /**
     * Реалізація методу methodIf2 з інтерфейсу If2.
     * Виводить повідомлення про виклик методу methodIf2.
     */
    @Override
    public void methodIf2() {
        System.out.println("Cl3 - methodIf2");
    }
}
