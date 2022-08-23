package User;

import lombok.Getter;
import lombok.Setter;

/**
 * Описание пользователя программы
 */
@Getter
@Setter
public class User {
    /**
     * данное поле будет хранить информацию о ФИО юзера
     */
    private String fullName;
    /**
     * данном поле будет объект типа User.Role
     */
    private Role role;

    public User(String fullName, Role role) {
        this.fullName = fullName;
        this.role = role;
    }

    /**
     * данный метод принимает в качестве параметра объект класса User и выводит информацию о нём
     * @param
     */

}
