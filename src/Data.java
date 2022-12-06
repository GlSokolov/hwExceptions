import java.lang.invoke.WrongMethodTypeException;

public class Data {
    private static final String VALID_CHARACTERS="QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm1234567890_";

    public static boolean checkData(String login, String password, String confirmPassword) {
        try {
            check(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    private static void check (String login, String password, String confirmPassword) throws WrongLoginException,WrongPasswordException {
        if (!validateData(login)) {
            throw new WrongLoginException("Неверно введен логин");
        }
        if (!validateData(password)) {
            throw new WrongPasswordException("Неверно введен пароль");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли должны совпадать");
        }
    }

    private static boolean validateData(String s) {
        if (s.length()>20) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!VALID_CHARACTERS.contains(String.valueOf(s.charAt(i)))) {
                return false;
            }
        } return true;
    }
}