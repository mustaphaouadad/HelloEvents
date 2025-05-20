package spring.helloevents.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name ="user")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String email;
    private String password;
    private Role role;


}
