package num2;

public class Account {

    private  String nama;
    private String noHP;
    private  String email;
    private  String password;

    public Account(String nama, String noHP, String email, String password) {
        this.nama = nama;
        this.noHP = noHP;
        this.email = email;
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoHP() {
        return noHP;
    }

    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
