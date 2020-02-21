
전제조건

1) autocommit=1 (true) 인 상태입니다. (DB는 아무거나 - 현재 MySQL)
2) @Transactional 구현

개요)

BoardController 를 최초 호출합니다.
bbs_board 와 mem_admin 테이블을 업데이트 하는데 마지막에 일부러 에러를 만듭니다.
상위의 모든 Query가 rollback 되면 종료입니다.

자바 + 스프링 + mybatis를 사용하여 @Tansactional 을 이용한 
다중 트랜잭션을 구헌 하고자 합니다.

