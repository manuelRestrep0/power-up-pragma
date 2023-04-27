package com.pragma.powerup.usermicroservice.adapters.driven.jpa.mysql.mappers;

import com.pragma.powerup.usermicroservice.adapters.driven.jpa.mysql.entity.RoleEntity;
import com.pragma.powerup.usermicroservice.domain.model.Role;
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
public class IRoleEntityMapperImpl implements IRoleEntityMapper {

    @Override
    public List<Role> toRoleList(List<RoleEntity> roleEntityList) {
        if ( roleEntityList == null ) {
            return null;
        }

        List<Role> list = new ArrayList<Role>( roleEntityList.size() );
        for ( RoleEntity roleEntity : roleEntityList ) {
            list.add( roleEntityToRole( roleEntity ) );
        }

        return list;
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
