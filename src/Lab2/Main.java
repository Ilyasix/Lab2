package Lab2;

/**
 * Головний клас для запуску програми.
 * @author Ilyas
 */
public class Main {

    /**
     * Точка входу в програму. Створює об'єкти класів і викликає їх методи.
     * @param args аргументи командного рядка
     */
    public static void main(String[] args) {
        Cl1 c1 = new Cl1();
        Cl2 c2 = new Cl2();
        Cl3 c3 = new Cl3();

        c1.methodIf1();
        c1.methodIf2();
        c1.methodIf3();
        c2.methodIf2();
        c2.methodIf3();
        c3.methodIf2();
        c3.methodIf3();
    }
}
