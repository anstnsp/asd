-- 큐엔에이 테이블 and 시퀀스
CREATE sequence QA_seq nocache;

CREATE sequence QAnswer_seq nocache;

CREATE TABLE QA_writer(
writerNum number primary key,
writerMainquestion varchar2(100),
writerDetailquestion varchar2(500),
writerWriter varchar2(50),
regdate date);

CREATE TABLE QA_answer(
answerNum number primary key,
answerWriter varchar2(50),
answerContent varchar2(500),
answerRef_num number,
regdate date);