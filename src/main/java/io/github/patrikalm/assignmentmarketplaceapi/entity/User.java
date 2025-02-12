package io.github.patrikalm.assignmentmarketplaceapi.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;


import javax.swing.*;
import java.util.List;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@ToString


@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long userId;

    @Column(unique = true, nullable = false)
    @NotNull
    @Setter(AccessLevel.NONE)
    String email;

    @Column(unique = true, nullable = false, length = 8)
    @NotNull
    @Setter(AccessLevel.PROTECTED)
    String password;

    @Column
    Boolean isActive = true;

    @OneToMany
    @Setter(AccessLevel.NONE)
    @ToString.Exclude
    List<Advertisement> advertisements;

    public void setActive(Boolean active) {
        isActive = active;
    }
}
