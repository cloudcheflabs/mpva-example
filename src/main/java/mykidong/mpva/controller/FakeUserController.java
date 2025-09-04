package mykidong.mpva.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mykidong.mpva.domain.dto.FakeUserDto;
import mykidong.mpva.service.FakeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@Tag(name = "Fake User API", description = "Fake user 관리 API 입니다.")
public class FakeUserController {
    private static final Logger LOG = LoggerFactory.getLogger(FakeUserController.class);

    @Autowired
    private FakeService fakeService;

    @Operation(summary = "Fake user 조회")
    @GetMapping("/sample/users")
    public List<FakeUserDto> getUsers(){

        List<FakeUserDto> fakeUserDtoList = fakeService.getUsers();
        LOG.info("fake users: {}", fakeUserDtoList.toString());

        return fakeUserDtoList;
    }
}
