package Human;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Описание полного, фактического адреса места проживания
 */
@Getter
@Setter
@ToString(of = {"city", "street", "house", "flat"})
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

    public Address(String town, String street, int house, int flat) {
        this.city = town;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

}

