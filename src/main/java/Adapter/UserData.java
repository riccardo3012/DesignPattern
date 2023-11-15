package Adapter;

import lombok.Getter;
import lombok.Setter;

    @Getter
    @Setter

    public class UserData {
        private String fullName;
        private int age;


        public void getData(DataSource ds) {
            this.fullName = ds.getFullName();
            this.age = ds.getAge();
        }
}
