public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;

        long actual = service.calculate(amount, registered);
// В принципе нормуль. Старой ошибки нету))) Можно писать, что исправлено)
        long expected = 30;
        boolean passed = expected == actual;

        // выводим результат
        if (passed) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
//        А что за ворнинги?
//        WARNING: An illegal reflective access operation has occurred
//        WARNING: Illegal reflective access by org.codehaus.groovy.reflection.ReflectionUtils (file:/C:/Users/Dima/.m2/repository/org/codehaus/groovy/groovy/3.0.0-beta-2/groovy-3.0.0-beta-2-indy.jar) to method java.util.Collections$UnmodifiableCollection.toString()
//        WARNING: Please consider reporting this to the maintainers of org.codehaus.groovy.reflection.ReflectionUtils
//        WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
//        WARNING: All illegal access operations will be denied in a future release
    }
}

