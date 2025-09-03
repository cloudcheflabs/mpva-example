package mykidong.mpva.service;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mykidong.mpva.dto.FakeUserDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class FakeService {

    public List<FakeUserDto> getUsers() {
        List<FakeUserDto> fakeUsers = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            FakeUserDto fakeUserDto = new FakeUserDto();
            fakeUserDto.setId(i + 1);
            fakeUserDto.setName("fake name " + i);
            fakeUserDto.setEmail("fakeuser" + i + "@fake.com");
            fakeUserDto.setPhone("010-1234-123" + i);

            fakeUsers.add(fakeUserDto);
        }

        return fakeUsers;
    }


}
