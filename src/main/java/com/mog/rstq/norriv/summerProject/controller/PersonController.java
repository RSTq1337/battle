package com.mog.rstq.norriv.summerProject.controller;

import com.mog.rstq.norriv.summerProject.entity.BufferEntity;
import com.mog.rstq.norriv.summerProject.entity.Person;
import com.mog.rstq.norriv.summerProject.repository.PersonRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/battle")
public class PersonController {

    private final PersonRepository repo;

    @Autowired
    public PersonController(PersonRepository repo) {
        this.repo = repo;
    }

    @PutMapping("{id}")
    private Person update(
            @PathVariable("id") Person personFromDb,
            @RequestBody Person person
    ){
        BeanUtils.copyProperties(person,personFromDb,"id");
         return repo.save(person);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Person person) {
        repo.delete(person);
    }

    @GetMapping
    private List<Person> listOfTwo(){
         List<Person> list = repo.findAll();
         Person first = null;
         Person second = null;
         do{
             Random r = new Random();
             first = list.get(r.nextInt(list.size()));
             Random m = new Random();
             second = list.get(m.nextInt(list.size()));
         }while(Objects.equals(first, second));
         List<Person> twoPersons = new ArrayList<>();
         twoPersons.add(first);
         twoPersons.add(second);
         return twoPersons;
    }

    @GetMapping("/score")
    private List<Person> score(){
        List<Person> list = repo.findAll();
        Collections.sort(list);
        list.removeAll(list.subList(50,list.size()));
        return list;
    }
}

