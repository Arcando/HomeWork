package User;

/**
 * это класс User.Main и в нем будет описываться будут создаваться экземпляры классов и вызываться методы.
 */
public class Main{
    public static void main(String[] args) {
        Role role = new Role(":User", " - вы являетесь пользователем данной программы");
        User user = new User("Иванов Иван Иванович", role);
        user.infoAboutUser();

    }
}




