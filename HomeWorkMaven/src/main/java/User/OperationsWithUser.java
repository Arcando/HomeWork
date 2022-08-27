package User;

public class OperationsWithUser {
    public static void infoAboutUser(User user) {
        System.out.println("Приветствуем " + user.getFullName() + " " + user.getRole());
    }
}
