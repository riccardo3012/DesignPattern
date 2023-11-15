package Adapter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


    @Component
    public class Runner implements CommandLineRunner {

        @Override
        public void run(String... args) throws Exception {

            UserData userData = new UserData();
            Info info = new Info();
            info.setName("Aldo");
            info.setSurname("Baglio");
            info.setBirthDate(java.time.LocalDate.of(1958, 9, 28));
            AdapterData adapterData = new AdapterData(info);
            userData.getData(adapterData);
            System.out.println("Full name: " + userData.getFullName());
            System.out.println("Age: " + userData.getAge());
        }
}
