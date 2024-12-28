package domain;

public class Usuario {

    private int idnew_table;
    private String username;
    private String password;

    public Usuario() {
    }

    public Usuario(int idnew_table) {
        this.idnew_table = idnew_table;
    }

    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Usuario(int idnew_table, String username, String password) {
        this.idnew_table = idnew_table;
        this.username = username;
        this.password = password;
    }

    public int getIdnew_table() {
        return this.idnew_table;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    } 

    public void setIdnew_table(int idnew_table) {
        this.idnew_table = idnew_table;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idnew_table=" + idnew_table + ", username=" + username + ", password=" + password + '}';
    }

}
