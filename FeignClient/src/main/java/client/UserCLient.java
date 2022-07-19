package client;


import dto.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "User-client",url = "https://jsonplaceholder.typicode.com")
public interface UserCLient {

    @GetMapping("/users")
    public List<UserResponse> getUsers();

}
