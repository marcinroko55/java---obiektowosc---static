public class KodyPocztoweApp {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(kodPocztowy());
            i++;
        }
    }

    public static String kodPocztowy() {
        String numbers = "0123456789";
        int min = 0;
        int max = numbers.length() - 1;
        StringBuilder number = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                number.append('-');
            }
            number.append((int) (Math.floor(Math.random() * (max - min + 1)) + min));
        }
        return String.valueOf(number);
    }
}
