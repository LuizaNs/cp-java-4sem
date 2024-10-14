package diplomaapi.model;

public enum PapelUser {
    ADMIN("admin"),
    USER("user");

    private String papel;

    PapelUser(String papel) {this.papel = papel;}

    public String getPapel() {return papel;}
}


