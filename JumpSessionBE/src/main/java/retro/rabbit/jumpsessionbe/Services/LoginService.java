package retro.rabbit.jumpsessionbe.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import retro.rabbit.jumpsessionbe.Controllers.AdminControllers;
import retro.rabbit.jumpsessionbe.Models.Admin;

import java.util.List;

@Service
public class LoginService {
    public AdminControllers AC = new AdminControllers();
    @Autowired
    private AdminService adminService;
    public boolean verify (String uname, String p_word){
        boolean flag=false;
        List<Admin> list_of_Admins =adminService.getAllAdmins();
        String expected_u = list_of_Admins.get(0).getUsername();
        String expected_p = list_of_Admins.get(0).getPassword();
        if (uname.equals(expected_u) && p_word.equals(expected_p)){
            flag= true;
        }
        return flag;
    }
}
