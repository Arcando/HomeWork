public class UserTest {
    public static void main(String[] args) {
        User user = new User("Иванов Иван Иванович", new Role());
        user.InfoAboutUser(user);

    }
}
class User {
    private String fullName;
    private Role role;

    public User(String fullName, Role role) {
        this.fullName = fullName;
        this.role = role;
    }

    public void InfoAboutUser(User user){
        System.out.println("Приветствуем "+fullName+ user.role);
    }

}

