package retro.rabbit.jumpsessionbe.Controllers;

import org.springframework.web.bind.annotation.*;
import retro.rabbit.jumpsessionbe.Models.Admin;
import retro.rabbit.jumpsessionbe.Services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/login")
@CrossOrigin(origins = "http://localhost:4200")

public class LoginController {
    @Autowired
    private LoginService LC = new LoginService();
    @PostMapping("/post-login_details")
    public boolean check_login(@RequestBody Admin admin){
        boolean flag = LC.verify(admin.getUsername(), admin.getPassword());
        return flag;
    }
}
