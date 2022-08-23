package Human;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Описание человека
 */
@AllArgsConstructor
@Data
public class Human {
    /**
     * В этом поле будет храниться ФИО пользователя
     */
    private String fullName;

    /**
     * В этом поле будет храниться возраст
     */
    private int age;

    /**
     * в этом поле будет храниться объект класса Human(Фактический, полный адрес проживания)
     */
    private Address address;

    public String getFullAddress() {
            return address.toString();
        }
    }
