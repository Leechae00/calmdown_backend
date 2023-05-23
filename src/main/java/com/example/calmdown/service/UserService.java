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
        // 안드로이드에서 보낸 데이터로 User Entity 생성
        User user = new User(
                null, userRequest.getPhoneNum_Value(), userRequest.getEm_PhoneNum_Value(),
                userRequest.getName(),userRequest.getAge(),
                userRequest.getSex_Value(), userRequest.getLogin_id(), userRequest.getLogin_password(),
                userRequest.getBirth()
        );



        // User Entity를 DB애 저장
        userRepository.save(user);
    }


    /** Entity to DTO **/
    public UserResponse read(Long userID){

        User user = userRepository.findById(userID).orElse(null);

        if(user == null){
            return null;
        }


        UserResponse userResponse = new UserResponse(
                user.getPhoneNum_Value(), user.getEm_PhoneNum_Value(),
                user.getName(),user.getAge(),
                user.getSex_Value(), user.getLogin_id(), user.getLogin_password(),
                user.getBirth()
        );

        return userResponse;
    }
}
