package utils;


import com.github.javafaker.Faker;
import model.api.UserPostRequest;

public class UserDataGenerator {
    private static Faker fake = new Faker();

    public static UserPostRequest generateUser() {
        UserPostRequest userData = UserPostRequest.builder()
                .id(fake.number().numberBetween(1000, 9999))
                .username("user" + fake.number().numberBetween(1000, 9999))
                .firstName(fake.name().firstName())
                .lastName(fake.name().lastName())
                .email(fake.internet().emailAddress())
                .password(fake.internet().password(6, 12))
                .phone(fake.phoneNumber().cellPhone())
                .userStatus(1)
                .build();

        return userData;
    }
}
