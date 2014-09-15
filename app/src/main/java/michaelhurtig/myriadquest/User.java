package michaelhurtig.myriadquest;

/**
 * Created by Michael Hurtig on 9/15/2014.
 */
public class User {

    private String name,
                   password,
                   alignment,
                   origin;

    public User(String name, String password, String alignment, String origin) {
        this.name = name;
        this.password = password;
        this.alignment = alignment;
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
