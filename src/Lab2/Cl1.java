package Lab2;

/**
 * Клас Cl1, який наслідує від Cl2 та реалізує інтерфейс If1.
 * @author Ilyas
 */
class Cl1 extends Cl2 implements If1 {

    // Агрегація з класом Cl3
    Cl3 cl3;

    /**
     * Реалізація методу methodIf1 з інтерфейсу If1.
     * Виводить повідомлення про виклик методу methodIf1.
     */
    @Override
    public void methodIf1() {
        System.out.println("Cl1 - methodIf1");
    }

    /**
     * Реалізація методу methodIf2 з інтерфейсу If1.
     * Виводить повідомлення про виклик методу methodIf2.
     */
    @Override
    public void methodIf2() {
        System.out.println("Cl1 - methodIf2");
    }

    /**
     * Метод, який виводить повідомлення про виклик методу methodIf3.
     * Це метод, специфічний для класу Cl1.
     */
    public void methodIf3() {
        System.out.println("Cl1 - methodIf3");
    }
}
