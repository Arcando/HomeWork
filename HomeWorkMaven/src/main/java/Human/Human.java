package Human;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

    /**
     * Описание человека
     */
    @Getter
    @Setter
    @ToString(of = {"fullName", "age", "address"})
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

        public Human(String fullName, int age, Address address) {
            this.fullName = fullName;
            this.age = age;
            this.address = address;
        }

        public String getFullAddress() {
            return address.toString();
        }
    }
