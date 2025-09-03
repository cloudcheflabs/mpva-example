package mykidong.mpva.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mykidong.mpva.dto.FakeUserDto;
import mykidong.mpva.service.FakeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class FakeUserController {

    private final FakeService fakeService;

    @GetMapping(value = "/sample/users")
    public List<FakeUserDto> getUsers(){
        return fakeService.getUsers();
    }
}
