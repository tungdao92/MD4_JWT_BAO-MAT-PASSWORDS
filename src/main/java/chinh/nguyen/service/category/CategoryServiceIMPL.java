package chinh.nguyen.service.category;

import chinh.nguyen.model.Category;
import chinh.nguyen.model.User;
import chinh.nguyen.repository.ICategoryRepository;
import chinh.nguyen.security.userprincipal.UserDetailsServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CategoryServiceIMPL implements ICategoryService{
    @Autowired
    private ICategoryRepository categoryRepository;
    @Autowired
    private UserDetailsServiceIMPL userDetailsServiceIMPL;
    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public void save(Category category) {
        User user = userDetailsServiceIMPL.getCurrentUser();
            category.setUser(user);
            categoryRepository.save(category);

    }

    @Override
    public Optional<Category> findById(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
categoryRepository.deleteById(id);
    }
}
