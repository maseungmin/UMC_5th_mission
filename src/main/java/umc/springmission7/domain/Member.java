package umc.springmission7.domain;

import lombok.*;
import umc.springmission7.domain.common.BaseEntity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Member extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private String gender;

    private LocalDate birth;

    private String address;

    private String foodType;

    @Enumerated(EnumType.STRING)
    private String status;

    private LocalDate inactiveDate;

    private String userId;

    private String pw;

    private String phoneNumber;

    private int point;

}
