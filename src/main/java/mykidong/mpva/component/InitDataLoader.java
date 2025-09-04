package mykidong.mpva.component;

import mykidong.mpva.domain.dto.FakeUserDto;
import mykidong.mpva.service.FakeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InitDataLoader implements InitializingBean {
    private static final Logger LOG = LoggerFactory.getLogger(InitDataLoader.class);
    @Autowired
    private FakeService fakeService;

    @Override
    public void afterPropertiesSet() throws Exception {
        List<FakeUserDto> fakeUserDtos = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            FakeUserDto fakeUserDto = new FakeUserDto();
            fakeUserDto.setId(i + 1);
            fakeUserDto.setName("fake user name " + i);
            fakeUserDto.setUsername("fakeuser" + i);
            fakeUserDto.setEmail("fakeuser" + i + "@fake.com");
            fakeUserDto.setPhone("010-1234-123" + i);

            fakeUserDtos.add(fakeUserDto);
        }

        fakeService.addUsers(fakeUserDtos);
        LOG.info("init fake users inserted.");
    }
}
