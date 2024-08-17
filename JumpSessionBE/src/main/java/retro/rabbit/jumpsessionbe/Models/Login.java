package retro.rabbit.jumpsessionbe.Models;

import jakarta.persistence.Entity;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Login {
    private String username;
    private String password;
}
