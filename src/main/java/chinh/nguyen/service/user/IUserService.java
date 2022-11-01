package chinh.nguyen.service.user;

import chinh.nguyen.model.User;

import java.util.Optional;

public interface IUserService {
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
    Optional<User> findByUsername(String username);
    User save(User user);
}
