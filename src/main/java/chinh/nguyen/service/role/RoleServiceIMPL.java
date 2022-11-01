package chinh.nguyen.service.role;

import chinh.nguyen.model.Role;
import chinh.nguyen.model.RoleName;
import chinh.nguyen.repository.IRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class RoleServiceIMPL implements IRoleService{
    @Autowired
    IRoleRepository repository;
    @Override
    public Optional<Role> findByName(RoleName name) {
        return repository.findByName(name);
    }
}
