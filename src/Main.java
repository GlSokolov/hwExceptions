public class Main {
    public static void main(String[] args) {
        boolean success = Data.checkData("Gleb", "zxc", "zxc");
        if (!success) {
            System.out.println("Регистрация прервана");
        } else {
            System.out.println("Регистрация прошла успешно");
        }
        // Продолжение домашки с исключениями в репозитории с Полиморфизмом
    }
}