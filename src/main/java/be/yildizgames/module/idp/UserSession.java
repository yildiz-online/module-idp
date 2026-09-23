package be.yildizgames.module.idp;

import be.yildizgames.module.jwt.Tokens;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * @author Grégory Van den Borre
 */
public record UserSession(
        UUID userId,
        String username,
        Tokens tokens,
        LocalDateTime loginTime
) {

    public String accessToken() {
        return this.tokens.accessToken();
    }

}
