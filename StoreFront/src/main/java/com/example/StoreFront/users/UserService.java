package com.example.StoreFront.users;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public List<Users> getUsers(){
        return List.of(
                new Users(1,
                        "Victoria",
                        "Trotts",
                        "user",
                        "23 jump street",
                        "victrotts@gmail.com")
        );
    }
}
