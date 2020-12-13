public class Main {
    public static void main(String[] args) {
        User user = new User.Builder("AyPeeTee", "Abs1561").build();
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
    }
}
