package su.goodcat.commonlib.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor


    public class User {


        private long id;


        private String name;


        private String middleName;

        private String surname;

        private LocalDate bornDate;

        private String about;


        private LocalDateTime creationDateTime;


        private LocalDateTime modifyDateTime;

        private Role role = Role.builder()
                .id(1L)
                .build();


        private String login;


        private String password;


    }


