package ucu.edu.ua.flowerstore.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class AppUserController {
    private AppUserService appUserService;

    @Autowired
    public AppUserController(AppUserService userService) {
        this.appUserService = userService;
    }

    @GetMapping("/list")
    public List<AppUser> getUsers() {
        return appUserService.getUsers();
    }

    @PostMapping("/add")
    public void addUser(@RequestBody AppUser user) {
        appUserService.add(user);
    }

}