package mykidong.mpva.domain.mapper;

import mykidong.mpva.domain.dto.FakeUserDto;
import mykidong.mpva.domain.entity.FakeUser;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FakeUserMapper {
    FakeUser toEntity(FakeUserDto dto);
    FakeUserDto toDto(FakeUser user);
}
