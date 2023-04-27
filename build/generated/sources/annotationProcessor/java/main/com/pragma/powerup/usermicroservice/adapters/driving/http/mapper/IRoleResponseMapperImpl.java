package com.pragma.powerup.usermicroservice.adapters.driving.http.mapper;

import com.pragma.powerup.usermicroservice.adapters.driving.http.dto.response.RoleResponseDto;
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
public class IRoleResponseMapperImpl implements IRoleResponseMapper {

    @Override
    public List<RoleResponseDto> toResponseList(List<Role> roleList) {
        if ( roleList == null ) {
            return null;
        }

        List<RoleResponseDto> list = new ArrayList<RoleResponseDto>( roleList.size() );
        for ( Role role : roleList ) {
            list.add( roleToRoleResponseDto( role ) );
        }

        return list;
    }

    protected RoleResponseDto roleToRoleResponseDto(Role role) {
        if ( role == null ) {
            return null;
        }

        String name = null;
        String description = null;

        name = role.getName();
        description = role.getDescription();

        RoleResponseDto roleResponseDto = new RoleResponseDto( name, description );

        return roleResponseDto;
    }
}
