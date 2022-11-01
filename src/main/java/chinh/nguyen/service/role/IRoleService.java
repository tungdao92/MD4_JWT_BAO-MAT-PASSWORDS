package chinh.nguyen.service.role;

import chinh.nguyen.model.Role;
import chinh.nguyen.model.RoleName;

import java.util.Optional;

public interface IRoleService {
    Optional<Role> findByName(RoleName name);
}
