package ucu.edu.ua.flowerstore.user;

import java.time.LocalDate;
import java.time.Period;

import jakarta.persistence.Column;

import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AppUser {
    @Id
    private int id;
    private int age;

    @Column(unique = true)
    private String email;

    @Transient
    private LocalDate dob;

    public AppUser(AppUser user) {
        this.email = user.email;
        this.dob = user.dob;
        this.age = user.age;
    }

    public int getAge() {
        if (dob == null) {
            return 0;
        }
        LocalDate currentDate = LocalDate.now();
        return Period.between(dob, currentDate).getYears();
    }
}
