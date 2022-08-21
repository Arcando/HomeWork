public class Role {
    private String Admin = "вы являетесь администратором данного приложения, в ваши обязанности входит работа с интерфейсом...";
    private String User = "вы являетесь пользователем данном приложения и можете использовать весь доступный функционал";
    private String Moderator = "вы являетесь модератором данного приложения, в ваши обязанности входит работа над улучшением приложения и добавление нового функционала";



    public void setAdmin(String admin) {
        Admin = admin;
    }

    public void setUser(String user) {
        User = user;
    }

    public void setModerator(String moderator) {
        Moderator = moderator;
    }

    public String getAdmin() {
        return Admin;
    }

    public String getUser() {
        return User;
    }

    public String getModerator() {
        return Moderator;
    }

    @Override
    public String toString() {
        return "Role{" +
                "Admin='" + Admin + '\'' +
                ", User='" + User + '\'' +
                ", Moderator='" + Moderator + '\'' +
                '}';
    }
}
