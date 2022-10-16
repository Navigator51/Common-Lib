package su.goodcat.commonlib.domain;

import lombok.RequiredArgsConstructor;
import lombok.Value;

@Value
@RequiredArgsConstructor
public class UserSearchDTO {

    String name;
    String email;
    long userId;
}
