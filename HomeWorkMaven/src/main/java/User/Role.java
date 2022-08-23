package User;

import lombok.Getter;
import lombok.Setter;


/**
 * Описание роли пользователя
 */
@Getter
@Setter
public class Role {
    private String role;
    private String aboutRole;

    public Role(String role, String aboutRole) {
        this.role = role;
        this.aboutRole = aboutRole;
    }

    @Override
    public String toString() {
        return "Роль: "+role + "\n" + "Описание: " + aboutRole;
    }
}