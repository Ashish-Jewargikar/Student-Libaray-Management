package studentlibrary.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import studentlibrary.DTO.BookRequestDto;
import studentlibrary.DTO.BookResponseDto;
import studentlibrary.Entity.Author;
import studentlibrary.Entity.Book;
import studentlibrary.Entity.LibraryCard;
import studentlibrary.Repository.AuthorRepository;

@Service
public class BookService {
    @Autowired
    AuthorRepository authorRepository;


    public BookResponseDto addBook(BookRequestDto bookRequestDto) throws Exception {

        // get the author object
        Author author = authorRepository.findById(bookRequestDto.getAuthorId()).get();

        Book book = new Book();
        book.setTitle(bookRequestDto.getTitle());
        book.setGenre(bookRequestDto.getGenre());
        book.setPrice(bookRequestDto.getPrice());
        book.setIssued(false);
        book.setAuthor(author);
        //book.setCard(card);
        author.getBooks().add(book);
        authorRepository.save(author);  // will save both book and author

        // create a response also
        BookResponseDto bookResponseDto = new BookResponseDto();
        bookResponseDto.setTitle(book.getTitle());
        bookResponseDto.setPrice(book.getPrice());

        return bookResponseDto;
    }
}