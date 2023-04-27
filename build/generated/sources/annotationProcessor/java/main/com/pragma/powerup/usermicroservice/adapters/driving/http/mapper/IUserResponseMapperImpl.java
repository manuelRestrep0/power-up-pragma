package com.pragma.powerup.usermicroservice.adapters.driving.http.mapper;

import com.pragma.powerup.usermicroservice.adapters.driving.http.dto.response.UserResponseDto;
import com.pragma.powerup.usermicroservice.domain.model.Person;
import com.pragma.powerup.usermicroservice.domain.model.Role;
import com.pragma.powerup.usermicroservice.domain.model.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-27T15:09:58-0500",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.jar, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class IUserResponseMapperImpl implements IUserResponseMapper {

    @Override
    public UserResponseDto toResponse(User user) {
        if ( user == null ) {
            return null;
        }

        Long idPerson = null;
        Long idRole = null;

        idPerson = userPersonId( user );
        idRole = userRoleId( user );

        UserResponseDto userResponseDto = new UserResponseDto( idPerson, idRole );

        return userResponseDto;
    }

    @Override
    public List<UserResponseDto> toResponseList(List<User> userList) {
        if ( userList == null ) {
            return null;
        }

        List<UserResponseDto> list = new ArrayList<UserResponseDto>( userList.size() );
        for ( User user : userList ) {
            list.add( toResponse( user ) );
        }

        return list;
    }

    private Long userPersonId(User user) {
        if ( user == null ) {
            return null;
        }
        Person person = user.getPerson();
        if ( person == null ) {
            return null;
        }
        Long id = person.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long userRoleId(User user) {
        if ( user == null ) {
            return null;
        }
        Role role = user.getRole();
        if ( role == null ) {
            return null;
        }
        Long id = role.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
