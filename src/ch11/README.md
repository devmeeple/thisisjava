# 예외 처리

## 예외와 예외 클래스
일반 예외, 실행 예외가 있다.

### 일반 예외
 - 일반 예외는 컴파일러에 의해 체크되는 예외를 말한다.
- 주로 데이터베이스 연결, 파일 입출력을 다룰 때 발생한다. 
- 예외가 발생하는 메소드를 작성할때 예외처리 해주지 않으면 컴파일 오류가 발생한다. (IOEException, SQLException)

### 실행 예외
- 프로그램 실행중에 발생하는 예외를 말한다.(프로그램의 오류)
- ArrayIndexOutOfBoundsException, NullPointerException

## 예외 처리 코드
- try-catch-finally 블록으로 구성
- try를 통해 예외 확인 / catch를 통해 처리 / finally 블록은 항상 실행(옵션으로 생략 가능)
- `e.getMessage()` 예외가 발생한 이유
- `e.toString()` 예외의 종류
- `e.printStackTrace` 예외가 어디서 발생했는지 추적한 내용까지 출력

## 예외 종류에 따른 처리
## 리소스 자동 닫기
- try-with-resources
## 예외 떠넘기기
## 사용자 정의 예외
## 확인문제