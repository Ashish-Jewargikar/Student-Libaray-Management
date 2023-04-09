package studentlibrary.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import studentlibrary.Entity.Author;
import studentlibrary.Repository.AuthorRepository;


@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    public void addAuthor(Author author){

        authorRepository.save(author);
    }

    public List<Author> getAuthors(){
        return authorRepository.findAll();
    }
}