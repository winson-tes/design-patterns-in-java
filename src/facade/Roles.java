package facade;

import java.util.ArrayList;
import java.util.List;

public class Roles {
    List<String> roles = new ArrayList<String>();

    public List<String> getRoles() {
        return roles;
    }

    public void addRole(String role) {
        this.roles.add(role);
    }
}
