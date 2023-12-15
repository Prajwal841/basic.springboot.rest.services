package net.prajwal.springboot.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import net.prajwal.springboot.dto.UserDto;
import net.prajwal.springboot.entity.User;

@Mapper
public interface AutoUserMapper {

    AutoUserMapper MAPPER = Mappers.getMapper(AutoUserMapper.class);

    UserDto mapToUserDto(User user);

    User mapToUser(UserDto userDto);
}
