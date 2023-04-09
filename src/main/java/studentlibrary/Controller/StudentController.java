package studentlibrary.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import studentlibrary.DTO.StudentRequestDto;
import studentlibrary.DTO.StudentResponseDto;
import studentlibrary.DTO.StudentUpdateEmailRequestDto;
import studentlibrary.Service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public String addStudent(@RequestBody StudentRequestDto studentRequestDto){
        studentService.addStudent(studentRequestDto);
        return "Student has been added";
    }

    @GetMapping("/find_by_email")
    public String findStudentByEmail(@RequestParam("email") String email){

        return studentService.findByEmail(email);
    }

    // get students of particular age

    // try for some other attribute also

    @PutMapping("/update_email")
    public StudentResponseDto updateEmail(@RequestBody StudentUpdateEmailRequestDto studentUpdateEmailRequestDto){
        return studentService.updateEmail(studentUpdateEmailRequestDto);
    }
}
