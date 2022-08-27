package User;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Описание пользователя программы
 */
@AllArgsConstructor
@Data
public class User {
    /**
     * данное поле будет хранить информацию о ФИО юзера
     */
    private String fullName;

    /**
     * данном поле будет объект типа User.Role
     */
    private Role role;
}