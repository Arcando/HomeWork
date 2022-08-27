package Human;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Описание полного, фактического адреса места проживания
 */
@AllArgsConstructor
@Data
public class Address{
    /**
     * в данном поле будет храниться название города, в котором проживает пользователь
     */
    private String city;

    /**
     * в данном поле будет храниться полное название улицы, на которой проживает пользователь
     */
    private String street;

    /**
     * в данном поле будет храниться номер дома, в котором проживает пользователь
     */
    private int house;

    /**
     * в данном поле будет храниться номер квартиры, в которой проживает пользователь
     */
    private int flat;
}