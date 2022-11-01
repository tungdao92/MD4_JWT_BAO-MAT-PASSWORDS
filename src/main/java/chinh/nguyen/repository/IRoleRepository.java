package chinh.nguyen.repository;

import chinh.nguyen.model.Role;
import chinh.nguyen.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IRoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName name);
}
