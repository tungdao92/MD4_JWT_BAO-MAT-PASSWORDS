package chinh.nguyen.controller;

import chinh.nguyen.dto.response.ResponseMessage;
import chinh.nguyen.model.Category;
import chinh.nguyen.model.User;
import chinh.nguyen.security.userprincipal.UserDetailsServiceIMPL;
import chinh.nguyen.service.category.ICategoryService;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("categories")
public class CategoryController {
    @Autowired
    private ICategoryService categoryService;
    @Autowired
    private UserDetailsServiceIMPL userDetailsServiceIMPL;
    @PostMapping
    public ResponseEntity<?> createCategory(@RequestBody Category category){
        User user = userDetailsServiceIMPL.getCurrentUser();
        if(user.getUsername().equals("Anonymous")){
            return new ResponseEntity<>(new ResponseMessage("Khong co dang nhap"), HttpStatus.OK);
        }
        categoryService.save(category);
        return new ResponseEntity<>(new ResponseMessage("create category success!"), HttpStatus.OK);
    }
}
