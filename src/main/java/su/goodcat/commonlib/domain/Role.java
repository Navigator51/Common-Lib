package su.goodcat.commonlib.domain;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Role  {

    public Long id;

    private String roleName;

}

