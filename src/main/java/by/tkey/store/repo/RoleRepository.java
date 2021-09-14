package by.tkey.store.repo;
import by.tkey.store.model.ERole;
import by.tkey.store.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Long> {

    Optional<Role> findByName(ERole name);
}
