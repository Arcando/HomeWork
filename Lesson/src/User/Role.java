package User;
/**
 * Описание роли пользователя
 */
public class Role {
    private String role;
    private String aboutRole;

    public Role(String role, String aboutRole) {
        this.role = role;
        this.aboutRole = aboutRole;
    }

    public String getRole() {
        return role;
    }

    public String getAboutRole() {
        return aboutRole;
    }
}
