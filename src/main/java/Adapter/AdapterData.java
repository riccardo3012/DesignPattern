package Adapter;

import java.time.LocalDate;


    public class AdapterData implements DataSource {

        private final Info info;

        public AdapterData(Info info) {
            this.info = info;
        }

        @Override
        public String getFullName() {
            return info.getName() + " " + info.getSurname();
        }

        @Override
        public int getAge() {
            return LocalDate.now().getYear() - info.getBirthDate().getYear();
        }
}

