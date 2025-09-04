package mykidong.mpva.repository;

import mykidong.mpva.domain.entity.FakeUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FakeUserRepository extends JpaRepository<FakeUser, Integer> {
    List<FakeUser> findAll();

}
