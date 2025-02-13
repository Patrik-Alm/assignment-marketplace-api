package io.github.patrikalm.assignmentmarketplaceapi.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;


import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode(exclude = "advertisements")


@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="User_Id", unique = true, nullable = false, updatable = false)
    protected Long userId;

    @Column(unique = true, nullable = false)
    @NonNull
    @Setter(AccessLevel.NONE)
    private String email;

    @Column(unique = true, nullable = false, length = 8)
    @NonNull
    @Setter(AccessLevel.PROTECTED)
    protected String password;

    @Column
    Boolean isActive = true;

    //Bidirectional relationship so user can be found in Advertisement class as well
    @OneToMany(mappedBy = "Advertisement_Id")
    @Setter(AccessLevel.NONE)
    @ToString.Exclude
    private List<Advertisement> advertisements;

    public void setActive(Boolean active) {
        isActive = active;
    }

    public void addAdvertisement(Advertisement advertisement) {
        if (advertisement == null) throw new NullPointerException("Advertisement is null");
        if (advertisements == null) { advertisements = new ArrayList<Advertisement>();}
            advertisements.add(advertisement);
    }

    public void removeAdvertisement(Advertisement advertisement) {
        if (advertisement == null) throw new NullPointerException("Advertisement is null");
        if (advertisements != null) {
            advertisements.remove(advertisement);
        } else throw new NullPointerException("Advertisements list is empty");
    }
}
