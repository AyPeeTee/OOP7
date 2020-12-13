public class User {
    String firstname;
    String lastname;
    int age;
    String username;
    String password;
    String gender;
    String phone;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    private User(Builder builder) {
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.age = builder.age;
        this.username = builder.username;
        this.password = builder.password;
        this.gender = builder.gender;
        this.phone = builder.phone;
    }

    static class Builder {
        private String firstname;
        private String lastname;
        private int age;
        private String username;
        private String password;
        private String gender;
        private String phone;

        public Builder(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public Builder setFirstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder setLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
