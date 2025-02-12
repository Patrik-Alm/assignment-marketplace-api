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

@Entity
public class Advertisement {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "Advertisement_Id", unique = true, nullable = false)
    String id;

    @Column(name = "Advertisement_Name")
    @NotNull
    @Setter(AccessLevel.NONE)
    String name;

    @Column
    @Setter(AccessLevel.NONE)
    String description;

    @Column
    @NotNull
    @Setter(AccessLevel.NONE)
    LocalDate startDate;

    @Column
    @NotNull
    @Setter(AccessLevel.NONE)
    LocalDate endDate;




}
