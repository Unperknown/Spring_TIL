package space.unperknown.LearningSpring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import space.unperknown.LearningSpring.model.Foo;
import space.unperknown.LearningSpring.repository.FooRepository;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class FooController {

    @Autowired
    FooRepository fooRepository;

    @GetMapping("/foo")
    public List<Foo> getAllFoos() {
        return fooRepository.findAll();
    }

    @PostMapping("/foo")
    public Foo insertFoo(@Valid @RequestBody Foo foo) {
        return fooRepository.save(foo);
    }


}
