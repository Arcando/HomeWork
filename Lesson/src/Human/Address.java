package Human;
public class Address {
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

    public String getTown() {
        return city;
    }
    public String getStreet() {
        return street;
    }
    public int getHouse() {
        return house;
    }
    public int getFlat() {
        return flat;
    }

    @Override
    public String toString() {
        return "Human.Address{" +
                "town='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house=" + house +
                ", flat=" + flat +
                '}';
    }
}
