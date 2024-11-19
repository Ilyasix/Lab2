package Lab2;

/**
 * Клас Cl2, який реалізує інтерфейси If2 та If3.
 * @author Ilyas
 */
class Cl2 implements If2, If3 {

    /**
     * Реалізація методу methodIf3 з інтерфейсу If3.
     * Виводить повідомлення про виклик методу methodIf3.
     */
    @Override
    public void methodIf3() {
        System.out.println("Cl2 - methodIf3");
    }

    /**
     * Реалізація методу methodIf2 з інтерфейсу If2.
     * Виводить повідомлення про виклик методу methodIf2.
     */
    @Override
    public void methodIf2() {
        System.out.println("Cl2 - methodIf2");
    }
}
