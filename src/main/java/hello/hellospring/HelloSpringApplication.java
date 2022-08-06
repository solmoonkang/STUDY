package hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}

}

/* [IntelliJ] Cause: invalid source release: 11 에러
 = 본인이 생성한 프로젝트의 JAVA 버전과 현재 본인의 컴퓨터에 설치/설정된 JAVA 버전이 일치하지 않을 경우 발생
 <해결방법>
    1. 현재 본인 컴퓨터에 설치 및 설정된 JAVA 버전에 맞게 IDE 프로젝트의 JAVA 버전을 올리거나 내린다.
    2. 프로젝트 버전에 맞는 JDK를 다운받아 설치/설정 후 IDE JAVA 버전 세팅을 재설정한다.
*/