package wsi.service;

import com.github.javafaker.Faker;
import wsi.model.FakeUser;

import java.util.Locale;

public class FakerTutorial {

    public static FakeUser fakeUser() {
        Faker f = new Faker(new Locale("pl")); //pl, en-UK, ru, ...
        String name = f.name().name();
        String city = f.address().city();
        String country = f.address().country();
        String phone = f.phoneNumber().phoneNumber();
        String img_url = f.avatar().image();

        FakeUser user = new FakeUser(null, name, city, country, phone, img_url);
        return user;
    }

    public static void main(String[] args) {
//        Faker f = new Faker(new Locale("pl")); //pl, en-UK, ru, ...
//        for (int i = 0; i < 10; i++) {
//            System.out.println(f.address().city() + ", " + f.address().state());
//        }
//        for (int i = 0; i < 10; i++) {
//            System.out.println(f.avatar().image());
//        }
//        System.out.println(f.idNumber().valid()); //US
//        System.out.println(f.internet().ipV4Address());
//        for (int i = 0; i < 20; i++) {
//            System.out.println(f.lorem().paragraph());
//        }
//
//        for (int i = 0; i < 30; i++) {
//            System.out.println(f.commerce().productName());
//            System.out.println(f.avatar().image());
//        }

        for (int i = 0; i < 10; i++) {
            System.out.println(fakeUser());
        }


    }
}
