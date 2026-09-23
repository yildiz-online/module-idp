package be.yildizgames.module.idp;

import java.util.List;

/**
 * @author Grégory Van den Borre
 */
public interface IdpConfiguration {

    String issuer();

    default String authorizationEndpoint() {
        return this.issuer() + "/protocol/openid-connect/auth";
    }

    default String tokenEndpoint() {
        return this.issuer() + "/protocol/openid-connect/token";
    }

    default String logoutEndpoint() {
        return this.issuer() + "/protocol/openid-connect/logout";
    }

    String clientId();

    String redirectUri();

    List<String> scopes();
}
