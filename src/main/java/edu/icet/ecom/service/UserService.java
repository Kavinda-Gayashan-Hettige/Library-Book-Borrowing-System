package edu.icet.ecom.service;

import edu.icet.ecom.model.dto.Book;
import edu.icet.ecom.model.dto.User;
import edu.icet.ecom.model.entity.BookEntity;
import edu.icet.ecom.model.entity.UserEntity;
import edu.icet.ecom.repository.BookRepository;
import edu.icet.ecom.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    UserRepository userRepository;


    public void save(User user) {
        userRepository.save(new UserEntity(
                user.getUserId(),
                user.getName(),
                user.getEmail(),
                user.getPhone(),
                user.getAddress(),
                user.getMembershipDate()
        ));
    }


}


