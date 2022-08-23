package User;

public class OperationsOnUser {
    public static void infoAboutUser(User user){
        System.out.println("Приветствуем " + user.getFullName() + " "+ user.getRole());
    }
}
