package com.pragma.powerup.usermicroservice.adapters.driven.jpa.mysql.mappers;

import com.pragma.powerup.usermicroservice.adapters.driven.jpa.mysql.entity.PersonEntity;
import com.pragma.powerup.usermicroservice.domain.model.Person;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-27T15:09:58-0500",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.jar, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class IPersonEntityMapperImpl implements IPersonEntityMapper {

    @Override
    public PersonEntity toEntity(Person person) {
        if ( person == null ) {
            return null;
        }

        PersonEntity personEntity = new PersonEntity();

        personEntity.setId( person.getId() );
        personEntity.setName( person.getName() );
        personEntity.setSurname( person.getSurname() );
        personEntity.setMail( person.getMail() );
        personEntity.setPhone( person.getPhone() );
        personEntity.setAddress( person.getAddress() );
        personEntity.setIdDniType( person.getIdDniType() );
        personEntity.setDniNumber( person.getDniNumber() );
        personEntity.setIdPersonType( person.getIdPersonType() );
        personEntity.setPassword( person.getPassword() );

        return personEntity;
    }
}
