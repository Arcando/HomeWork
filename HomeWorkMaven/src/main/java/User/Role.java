package User;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Описание роли пользователя
 */
@AllArgsConstructor
@Data
public class Role {
    private String role;
    private String aboutRole;

    @Override
    public String toString() {
        return "Роль: " + role + "\n" + "Описание: " + aboutRole;
    }
}