public class User {
    // TODO Create Attribute of User; Name and Phone Number then Create Setter
    public String userName;
    public int phoneNumber;

    public void setuserName (String userName) {
        this.userName = userName;
    }
    public void setphoneNumber (int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    // TODO Create Method to Register User and Display User's Name and Phone Number and success message
    public void displayuserName (String userName){
    System.out.println("Masukkan Nama Anda : " + userName);
    }
    public void displayphoneNumber (int phoneNumber) {
    System.out.println("Masukkan Nomor HP : " + phoneNumber);
    }
}
