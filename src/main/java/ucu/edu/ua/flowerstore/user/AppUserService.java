package ucu.edu.ua.flowerstore.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUserService {
    private AppUserRepository appUserRepository;

    @Autowired
    public AppUserService(AppUserRepository userRepository) {
        this.appUserRepository = userRepository;
    }

    public List<AppUser> getUsers() {
        return appUserRepository.findAll();
    }

    public void add(AppUser user) {
        if (appUserRepository.findUserByEmail(user.getEmail()).isEmpty()) {
            appUserRepository.save(user);
        }
    }
}