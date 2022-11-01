package chinh.nguyen.service;

import java.util.List;
import java.util.Optional;

public interface IGenericService<T> {
    List<T> findAll();
    void save(T t);
    Optional<T> findById(Long id);
    void deleteById(Long id);
}
