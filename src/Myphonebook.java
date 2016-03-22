public class Myphonebook {

    private Phonenumber[] phonenumbers = new Phonenumber[10];

    private int arrayIndex = 0;

    public void addphonenumber(String name, String phone){

        Phonenumber phonenumber = new Phonenumber(name, phone);
        phonenumbers [arrayIndex] = phonenumber;
        arrayIndex++;    }
    public void printPhoneBook(){
        for (Phonenumber phonenumber: phonenumbers ) {
            System.out.println(phonenumber);     }}

    static class Phonenumber{
        private String name;
        private String phone;

        public Phonenumber(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public String getPhone() { return phone; }
        public void setPhone(String phone) { this.phone = phone; }

        @Override
        public String toString() {
            return "name: " + name + ", phone: " + phone;
        }
    }
}