package com.pragma.powerup.usermicroservice.adapters.driving.http.mapper;

import com.pragma.powerup.usermicroservice.adapters.driving.http.dto.response.PersonResponseDto;
import com.pragma.powerup.usermicroservice.domain.model.Person;
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
public class IPersonResponseMapperImpl implements IPersonResponseMapper {

    @Override
    public PersonResponseDto userToPersonResponse(User user) {
        if ( user == null ) {
            return null;
        }

        String name = null;
        String surname = null;
        String mail = null;
        String phone = null;
        String address = null;
        String idDniType = null;
        String dniNumber = null;
        String idPersonType = null;

        name = userPersonName( user );
        surname = userPersonSurname( user );
        mail = userPersonMail( user );
        phone = userPersonPhone( user );
        address = userPersonAddress( user );
        idDniType = userPersonIdDniType( user );
        dniNumber = userPersonDniNumber( user );
        idPersonType = userPersonIdPersonType( user );

        PersonResponseDto personResponseDto = new PersonResponseDto( name, surname, mail, phone, address, idDniType, dniNumber, idPersonType );

        return personResponseDto;
    }

    @Override
    public List<PersonResponseDto> userListToPersonResponseList(List<User> userList) {
        if ( userList == null ) {
            return null;
        }

        List<PersonResponseDto> list = new ArrayList<PersonResponseDto>( userList.size() );
        for ( User user : userList ) {
            list.add( userToPersonResponse( user ) );
        }

        return list;
    }

    private String userPersonName(User user) {
        if ( user == null ) {
            return null;
        }
        Person person = user.getPerson();
        if ( person == null ) {
            return null;
        }
        String name = person.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String userPersonSurname(User user) {
        if ( user == null ) {
            return null;
        }
        Person person = user.getPerson();
        if ( person == null ) {
            return null;
        }
        String surname = person.getSurname();
        if ( surname == null ) {
            return null;
        }
        return surname;
    }

    private String userPersonMail(User user) {
        if ( user == null ) {
            return null;
        }
        Person person = user.getPerson();
        if ( person == null ) {
            return null;
        }
        String mail = person.getMail();
        if ( mail == null ) {
            return null;
        }
        return mail;
    }

    private String userPersonPhone(User user) {
        if ( user == null ) {
            return null;
        }
        Person person = user.getPerson();
        if ( person == null ) {
            return null;
        }
        String phone = person.getPhone();
        if ( phone == null ) {
            return null;
        }
        return phone;
    }

    private String userPersonAddress(User user) {
        if ( user == null ) {
            return null;
        }
        Person person = user.getPerson();
        if ( person == null ) {
            return null;
        }
        String address = person.getAddress();
        if ( address == null ) {
            return null;
        }
        return address;
    }

    private String userPersonIdDniType(User user) {
        if ( user == null ) {
            return null;
        }
        Person person = user.getPerson();
        if ( person == null ) {
            return null;
        }
        String idDniType = person.getIdDniType();
        if ( idDniType == null ) {
            return null;
        }
        return idDniType;
    }

    private String userPersonDniNumber(User user) {
        if ( user == null ) {
            return null;
        }
        Person person = user.getPerson();
        if ( person == null ) {
            return null;
        }
        String dniNumber = person.getDniNumber();
        if ( dniNumber == null ) {
            return null;
        }
        return dniNumber;
    }

    private String userPersonIdPersonType(User user) {
        if ( user == null ) {
            return null;
        }
        Person person = user.getPerson();
        if ( person == null ) {
            return null;
        }
        String idPersonType = person.getIdPersonType();
        if ( idPersonType == null ) {
            return null;
        }
        return idPersonType;
    }
}
