package com.pragma.powerup.usermicroservice.adapters.driving.http.mapper;

import com.pragma.powerup.usermicroservice.adapters.driving.http.dto.request.UserRequestDto;
import com.pragma.powerup.usermicroservice.domain.model.Person;
import com.pragma.powerup.usermicroservice.domain.model.Role;
import com.pragma.powerup.usermicroservice.domain.model.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-27T15:09:57-0500",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.jar, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class IUserRequestMapperImpl implements IUserRequestMapper {

    @Override
    public User toUser(UserRequestDto userRequestDto) {
        if ( userRequestDto == null ) {
            return null;
        }

        Person person = null;
        Role role = null;

        person = userRequestDtoToPerson( userRequestDto );
        role = userRequestDtoToRole( userRequestDto );

        Long id = null;

        User user = new User( id, person, role );

        return user;
    }

    protected Person userRequestDtoToPerson(UserRequestDto userRequestDto) {
        if ( userRequestDto == null ) {
            return null;
        }

        Long id = null;

        id = userRequestDto.getIdPerson();

        String name = null;
        String surname = null;
        String mail = null;
        String phone = null;
        String address = null;
        String idDniType = null;
        String dniNumber = null;
        String idPersonType = null;
        String password = null;

        Person person = new Person( id, name, surname, mail, phone, address, idDniType, dniNumber, idPersonType, password );

        return person;
    }

    protected Role userRequestDtoToRole(UserRequestDto userRequestDto) {
        if ( userRequestDto == null ) {
            return null;
        }

        Long id = null;

        id = userRequestDto.getIdRole();

        String name = null;
        String description = null;

        Role role = new Role( id, name, description );

        return role;
    }
}
