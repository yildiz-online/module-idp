package be.yildizgames.module.idp;

import java.util.UUID;
import java.util.function.Consumer;

/**
 * @author Grégory Van den Borre
 */
public interface IdpConnector {

    void login(UUID subject, Consumer<AuthenticationFlowResult> callback);

    void shutdownCallbackServer(UUID id);

    boolean isAuthenticated(UUID id);

    UserSession getSession(UUID value);
}
