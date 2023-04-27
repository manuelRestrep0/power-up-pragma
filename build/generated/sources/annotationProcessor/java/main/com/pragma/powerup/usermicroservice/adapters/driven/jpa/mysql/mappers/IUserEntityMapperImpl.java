package com.pragma.powerup.usermicroservice.adapters.driven.jpa.mysql.mappers;

import com.pragma.powerup.usermicroservice.adapters.driven.jpa.mysql.entity.PersonEntity;
import com.pragma.powerup.usermicroservice.adapters.driven.jpa.mysql.entity.RoleEntity;
import com.pragma.powerup.usermicroservice.adapters.driven.jpa.mysql.entity.UserEntity;
import com.pragma.powerup.usermicroservice.domain.model.Person;
import com.pragma.powerup.usermicroservice.domain.model.Role;
import com.pragma.powerup.usermicroservice.domain.model.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-27T15:09:57-0500",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.jar, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class IUserEntityMapperImpl implements IUserEntityMapper {

    @Override
    public UserEntity toEntity(User user) {
        if ( user == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setPersonEntity( personToPersonEntity( user.getPerson() ) );
        userEntity.setRoleEntity( roleToRoleEntity( user.getRole() ) );
        userEntity.setId( user.getId() );

        return userEntity;
    }

    @Override
    public User toUser(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        Person person = null;
        Role role = null;
        Long id = null;

        person = personEntityToPerson( userEntity.getPersonEntity() );
        role = roleEntityToRole( userEntity.getRoleEntity() );
        id = userEntity.getId();

        User user = new User( id, person, role );

        return user;
    }

    @Override
    public List<User> toUserList(List<UserEntity> userEntityList) {
        if ( userEntityList == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( userEntityList.size() );
        for ( UserEntity userEntity : userEntityList ) {
            list.add( toUser( userEntity ) );
        }

        return list;
    }

    protected PersonEntity personToPersonEntity(Person person) {
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

    protected RoleEntity roleToRoleEntity(Role role) {
        if ( role == null ) {
            return null;
        }

        RoleEntity roleEntity = new RoleEntity();

        roleEntity.setId( role.getId() );
        roleEntity.setName( role.getName() );
        roleEntity.setDescription( role.getDescription() );

        return roleEntity;
    }

    protected Person personEntityToPerson(PersonEntity personEntity) {
        if ( personEntity == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        String surname = null;
        String mail = null;
        String phone = null;
        String address = null;
        String idDniType = null;
        String dniNumber = null;
        String idPersonType = null;
        String password = null;

        id = personEntity.getId();
        name = personEntity.getName();
        surname = personEntity.getSurname();
        mail = personEntity.getMail();
        phone = personEntity.getPhone();
        address = personEntity.getAddress();
        idDniType = personEntity.getIdDniType();
        dniNumber = personEntity.getDniNumber();
        idPersonType = personEntity.getIdPersonType();
        password = personEntity.getPassword();

        Person person = new Person( id, name, surname, mail, phone, address, idDniType, dniNumber, idPersonType, password );

        return person;
    }

    protected Role roleEntityToRole(RoleEntity roleEntity) {
        if ( roleEntity == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        String description = null;

        id = roleEntity.getId();
        name = roleEntity.getName();
        description = roleEntity.getDescription();

        Role role = new Role( id, name, description );

        return role;
    }
}
