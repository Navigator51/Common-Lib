package su.goodcat.commonlib.faign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import su.goodcat.commonlib.domain.User;
import su.goodcat.commonlib.domain.UserDTO;
import su.goodcat.commonlib.domain.UserSearchDTO;

import java.util.List;

@FeignClient(name = "spr", url = "${property.spring-application.url}")
public interface UserFeignClient {

    @PostMapping("/api/v1/registry/controller")
    ResponseEntity<Void> saveNewUser(@RequestBody UserDTO userDTO);

    @GetMapping(path = "/api/v1/search/user")
    ResponseEntity<List<UserSearchDTO>> searchUserByQuery(@RequestParam String query);

    @GetMapping(path = "/api/v1/search/user/{name}")
    ResponseEntity<User> searchUserByName(@PathVariable String name);

    @GetMapping(path = "/api/v1/search/user/{id}")
    ResponseEntity <User> searchUserById(@PathVariable long id);

}
