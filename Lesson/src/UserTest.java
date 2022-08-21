/**
 * это класс UserTest и в нем будет описываться будут создаваться экземпляры классов и вызываться методы.
 */
public class UserTest {
    public static void main(String[] args) {
        User user = new User("Иванов Иван Иванович", new Role());
        user.InfoAboutUser(user);

    }
}
/**
 * это класс User и в нем будет описываться юзер нашей программы
 */
class User {
    /**
     * данное поле будет хранить информацию о ФИО юзера
     */
    private String fullName;
    /**
     * данном поле будет объект типа Role
     */
    private Role role;

    public User(String fullName, Role role) {
        this.fullName = fullName;
        this.role = role;
    }

    /**
     * данный метод принимает в качестве параметра объект класса User и выводит информацию о нём
     * @param user
     */
    public void InfoAboutUser(User user){
        System.out.println("Приветствуем "+fullName+ user.role);
    }

}

