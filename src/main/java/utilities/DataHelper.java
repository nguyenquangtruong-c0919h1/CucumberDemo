package utilities;

import com.github.javafaker.Faker;

public class DataHelper {
    static Faker faker = new Faker();

    public static String setRandomCharacter() {
        return faker.lorem().characters(1, 6);
    }

    public static String concatString(String first, String second) {
        return first.concat(second);
    }

}
