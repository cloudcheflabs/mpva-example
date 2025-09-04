package mykidong.mpva.domain.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;


@Data
@Schema(description = "Fake User DTO")
public class FakeUserDto {
    @Schema(description = "Fake User ID", example = "1")
    int id;

    @Schema(description = "Fake User 이름", example = "홍길동")
    String name;

    @Schema(description = "사용자 이름", example = "fakeuser1")
    String username;

    @Schema(description = "사용자 이메일", example = "fakeuser1@fake.com")
    String email;

    @Schema(description = "사용자 전화", example = "010-1234-1234")
    String phone;
}
