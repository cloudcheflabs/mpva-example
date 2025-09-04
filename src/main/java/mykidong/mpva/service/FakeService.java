package mykidong.mpva.service;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mykidong.mpva.domain.dto.FakeUserDto;
import mykidong.mpva.domain.entity.FakeUser;
import mykidong.mpva.domain.mapper.FakeUserMapper;
import mykidong.mpva.repository.FakeUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class FakeService {

    @Autowired
    private FakeUserRepository fakeUserRepository;

    @Autowired
    private FakeUserMapper fakeUserMapper;

    public List<FakeUserDto> getUsers() {
        List<FakeUser> fakeUsers = fakeUserRepository.findAll();

        List<FakeUserDto> fakeUserDtos = new ArrayList<>();
        for(FakeUser fakeUser : fakeUsers) {
            FakeUserDto fakeUserDto = fakeUserMapper.toDto(fakeUser);
            fakeUserDtos.add(fakeUserDto);
        }

        return fakeUserDtos;
    }

    public void addUsers(List<FakeUserDto> fakeUserDtos) {
        for(FakeUserDto fakeUserDto: fakeUserDtos) {
            fakeUserRepository.save(fakeUserMapper.toEntity(fakeUserDto));
        }
    }


}
