package nextstep.member.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

    void deleteByEmail(String email);

    Optional<Member> findByEmail(String email);

    Optional<Member> findByAccessToken(String token);
}
