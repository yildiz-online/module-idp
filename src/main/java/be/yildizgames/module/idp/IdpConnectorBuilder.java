package be.yildizgames.module.idp;

import java.util.ServiceLoader;

/**
 * @author Grégory Van den Borre
 */
public interface IdpConnectorBuilder {

    static IdpConnectorBuilder provide() {
        return ServiceLoader.load(IdpConnectorBuilder.class).findFirst().orElseThrow();
    }

    IdpConnector buildIdpConnector(IdpConfiguration configuration);

}
