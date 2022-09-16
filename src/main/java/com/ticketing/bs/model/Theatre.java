package com.ticketing.bs.model;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity(name = "theatre")
public class Theatre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String theatreName;
    private String location;
    @OneToMany(mappedBy = "theatre")
    @ToString.Exclude
    private List<Screen> screen;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Theatre theatre = (Theatre) o;
        return id != 0 && Objects.equals(id, theatre.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
