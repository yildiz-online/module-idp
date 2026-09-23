package be.yildizgames.module.idp;

import be.yildizgames.module.jwt.session.UserSession;

/**
 * @author Grégory Van den Borre
 */
public record AuthenticationFlowResult(UserSession session, Exception error) {
    public static AuthenticationFlowResult success(UserSession s) {
        return new AuthenticationFlowResult(s, null);
    }
    public static AuthenticationFlowResult error(Exception e) {
        return new AuthenticationFlowResult(null, e);
    }

    public boolean isSuccessful() {
        return this.session != null;
    }
}
