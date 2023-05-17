package com.example.calmdown.service;

import com.example.calmdown.dto.UserRequest;
import com.example.calmdown.dto.UserResponse;
import com.example.calmdown.entity.User;
import com.example.calmdown.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    /** DTO to Entity**/
    public void create(UserRequest userRequest){
        User user = new User(
                null, userRequest.getPhone(), userRequest.getEmergency_phone(),
                userRequest.getGender(), userRequest.getLogin_id(), userRequest.getLogin_password(),
                userRequest.getBirth()
        );

        userRepository.save(user);
    }


    /** Entity to DTO **/
    public UserResponse read(Long userID){

        User user = userRepository.findById(userID).orElse(null);

        if(user == null){
            return null;
        }

        UserResponse userResponse = new UserResponse(
                user.getPhone(), user.getEmergency_phone(),
                user.getGender(), user.getLogin_id(), user.getLogin_password(),
                user.getBirth()
        );

        return userResponse;
    }
}
