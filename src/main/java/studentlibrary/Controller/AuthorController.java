package studentlibrary.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import studentlibrary.Entity.Author;
import studentlibrary.Service.AuthorService;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    // chnage to DTO
    @PostMapping("/add")
    public String addAuthor(@RequestBody Author author){

        authorService.addAuthor(author);
        return "Author added successfully";
    }

    @GetMapping("/get_authors")
    public List<Author> getAuthors(){
        return authorService.getAuthors();
    }
}