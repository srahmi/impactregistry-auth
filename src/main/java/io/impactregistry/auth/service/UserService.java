package io.impactregistry.auth.service;

import io.impactregistry.auth.domain.ImpactregistryUser;
import io.impactregistry.auth.dto.ImpactregistryUserDto;
import io.impactregistry.auth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    public ImpactregistryUserDto getUserByUsername(String username) {
        ImpactregistryUser impactregistryUser = userRepository.findByUsername(username);

        return ImpactregistryUserDto.builder()
                .id(impactregistryUser.getId())
                .username(impactregistryUser.getUsername())
                .build();

    }

    public void saveUser(ImpactregistryUserDto impactregistryUserDto){

        ImpactregistryUser impactregistryUserToSave = ImpactregistryUser.builder()
                .id(impactregistryUserDto.getId())
                .username(impactregistryUserDto.getUsername())
                .password(bCryptPasswordEncoder.encode(impactregistryUserDto.getPassword()))
                .build();

        userRepository.save(impactregistryUserToSave);
    }

}
