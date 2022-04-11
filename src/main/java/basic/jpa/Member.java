package basic.jpa;

import javax.persistence.*;


@Entity
public class Member {
    @Id @GeneratedValue
    private Long id;
    private String name;

    @Embedded
    private Address address;
}
