package retro.rabbit.jumpsessionbe.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import retro.rabbit.jumpsessionbe.Models.Admin;
import retro.rabbit.jumpsessionbe.Models.Login;
import retro.rabbit.jumpsessionbe.Services.AdminService;
import retro.rabbit.jumpsessionbe.Services.LoginService;

import java.util.List;

@RestController
@RequestMapping("/api/login")
@CrossOrigin(origins = "http://localhost:4200")

public class LoginController {
    @Autowired
//    private LoginService loginService;

    @PostMapping("/post-login_details")
    public boolean verify(@RequestBody Login login) {
        return true;
    }

}
