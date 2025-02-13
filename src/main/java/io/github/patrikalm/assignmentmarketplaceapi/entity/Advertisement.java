package io.github.patrikalm.assignmentmarketplaceapi.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@EqualsAndHashCode(exclude = "user")

@Entity
public class Advertisement {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "Advertisement_Id", unique = true, nullable = false, updatable = false)
    protected String id;

    @Column(name = "Advertisement_Name")
    @NonNull
    @Setter(AccessLevel.NONE)
    private String name;

    @Column
    @Setter(AccessLevel.NONE)
    private String description;

    @Column
    @NonNull
    @Setter(AccessLevel.NONE)
    private LocalDate startDate;

    @Column
    @NonNull
    @Setter(AccessLevel.NONE)
    private LocalDate endDate;

    //without ToString.exclude because the user shall be in the string as well.
    @ManyToOne
    @JoinColumn(name = "User_Id")
    private User user;




}
