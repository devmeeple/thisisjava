# 컬렉션 자료구조
## 컬렉션 프레임워크
널리 알려져 있는 자료구조를 바탕으로 객체들을 효율적으로 추가, 삭제, 검색할 수 있도록 관련
인터페이스와 클래스들을 모아둔 것. 총칭해서 컬렉션 프레임워크 라고 부른다.
## List 컬렉션
객체를 인덱스로 관리, ArrayList, Vector, LinkedList가 해당됨
### ArrayList
List 컬렉션에서 가장 많이 사용, 빈번한 객체 삭제와 삽입이 일어나는 곳에서 바람직하지 않음. 이런 경우라면
LinkedList를 권장
### Vector
ArrayList와 동일하누 내부 구조, 동기화된 메소드로 구성되어 있기 때문에 멀티 스레드가 동시에 Vector() 메소드 실행 불가
### LinkedList
ArrayList와 사용 방법은 동일하지만 내부구조는 완전히 다름. ArrayList는 내부 배열에 객체를 저장하지만,
LinkedList는 인접 객체를 체인처럼 연결해서 관리.
## Set 컬렉션
저장 순서를 유지하지 않음. 객체 중복저장 불가
### HashSet
Set 컬렉션 중에서 가장 많이 사용
## Map 컬렉션
키와 값으로 구성된 엔트리 객체를 저장. 키와 값은 객체임. 키는 중복저장 불가, 값은 가능.
### HashMap
### HashTable
동기화된 메소드로 멀티스레드 환경에서도 안전하게 객체를 추가, 삭제
## 검색 기능을 강화시킨 컬렉션
TreeSet, TreeMap
## LIFO와 FIFO 컬렉션
## 동기화된 컬렉션
## 수정할 수 없는 컬렉션
## 확인문제