package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {

    Member save(Member member); // 회원이 저장소에 저장됨 member를 저장하면 member반환
    Optional<Member> findById(Long id); // 저장소에서 id를 찾아줌
    Optional<Member> findByName(String name); // 저장소에서 name를 찾아줌
    List<Member> findAll(); // 지금까지 저장된 모든 회원정

}
