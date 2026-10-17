package se331.passport.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    private String role;

    private String name;
    private String surname;
    private String province;

    @Column(length = 1000)
    private String profileImage;

    @Builder.Default
    private Integer currentLevel = 1;

    @Builder.Default
    private Boolean isActive = true;
}