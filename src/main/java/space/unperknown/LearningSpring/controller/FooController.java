package space.unperknown.LearningSpring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import space.unperknown.LearningSpring.model.Foo;
import space.unperknown.LearningSpring.repository.FooRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class FooController {

    @Autowired
    FooRepository fooRepository;

    @GetMapping("/foo")
    public List<Foo> getAllFoos() {
        fooRepository.findAll();
    }

}
