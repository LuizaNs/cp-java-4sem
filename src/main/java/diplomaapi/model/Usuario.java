package diplomaapi.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Entity
public class Usuario implements UserDetails {

    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String login;
    private String senha;
    @Enumerated(EnumType.STRING)
    private PapelUser papel;

    public Usuario() {
    }

    public Usuario(String login, String senha, PapelUser papel) {
        this.login = login;
        this.senha = senha;
        this.papel = papel;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if (PapelUser.ADMIN.equals(this.papel)) {
            return List.of(
                    new SimpleGrantedAuthority("PAPEL_ADMIN"),
                    new SimpleGrantedAuthority("PAPEL_USER")
            );
        }
        return List.of(new SimpleGrantedAuthority("PAPEL_USER"));
    }

    @Override
    public String getPassword() {
        return this.senha;
    }

    @Override
    public String getUsername() {
        return this.login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public String getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = String.valueOf(id);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public PapelUser getRole() {
        return papel;
    }

    public void setRole(PapelUser papel) {
        this.papel = papel;
    }

}
