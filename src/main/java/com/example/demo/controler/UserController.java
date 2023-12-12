package com.example.demo.controler;

import com.example.demo.entity.UserEntity;
import com.example.demo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/users")
public class UserController {
    @Autowired
    private UserRepo userRepo ;
    @PostMapping
    public ResponseEntity registr (@RequestBody UserEntity user){
        try {
            userRepo.save(user);
            return ResponseEntity.ok("Пользователь успешно сохранен") ;

        }catch (Exception e){
            return ResponseEntity.badRequest().body("произошла ошибка") ;
        }
    }
    @GetMapping("/")
    public ResponseEntity getUser(){
        try {
            return ResponseEntity.ok("Сервер работает") ;

        }catch (Exception e){
            return ResponseEntity.badRequest().body("произошла ошибка") ;
        }

    }
}
