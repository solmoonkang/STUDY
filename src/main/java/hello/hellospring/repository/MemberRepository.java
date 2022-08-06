package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id); // null 반환을 Optional로 감싸서 반환
    Optional<Member> findByName(String name);
    List<Member> findAll(); // 지금까지 저장된 모든 리스트를 저장해서 반환
}
