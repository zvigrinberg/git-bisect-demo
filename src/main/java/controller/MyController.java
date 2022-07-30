package controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import service.MyService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/my/private")
public class MyController {

    private final MyService myService;

    @GetMapping("/{age}")
    public String getMyAge(@PathVariable Integer age)
    {
        return myService.getTheAge(age);
    }

}
