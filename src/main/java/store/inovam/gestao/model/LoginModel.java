package store.inovam.gestao.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class LoginModel implements Serializable {

    private String login;
    private String senha;

}
