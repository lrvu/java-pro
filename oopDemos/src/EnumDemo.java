enum Gender {
    male, female;
}

public class EnumDemo {
    public static void main(String[] args) {
        enumTest(Gender.female);
    }

    private static void enumTest(Gender gender) {
        switch (gender) {
            case male:
                System.out.println("male");
                break;
            case female:
                System.out.println("female");
                break;
        }
    }
}
