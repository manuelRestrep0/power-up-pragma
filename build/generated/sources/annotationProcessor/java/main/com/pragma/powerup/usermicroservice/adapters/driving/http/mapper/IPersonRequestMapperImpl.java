package com.pragma.powerup.usermicroservice.adapters.driving.http.mapper;

import com.pragma.powerup.usermicroservice.adapters.driving.http.dto.request.PersonRequestDto;
import com.pragma.powerup.usermicroservice.domain.model.Person;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-27T15:09:57-0500",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.jar, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class IPersonRequestMapperImpl implements IPersonRequestMapper {

    @Override
    public Person toPerson(PersonRequestDto personRequestDto) {
        if ( personRequestDto == null ) {
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
        String password = null;

        name = personRequestDto.getName();
        surname = personRequestDto.getSurname();
        mail = personRequestDto.getMail();
        phone = personRequestDto.getPhone();
        address = personRequestDto.getAddress();
        idDniType = personRequestDto.getIdDniType();
        dniNumber = personRequestDto.getDniNumber();
        idPersonType = personRequestDto.getIdPersonType();
        password = personRequestDto.getPassword();

        Long id = null;

        Person person = new Person( id, name, surname, mail, phone, address, idDniType, dniNumber, idPersonType, password );

        return person;
    }
}
