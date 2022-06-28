# GIT

## **GIT**이란?

* **분산** 버전 관리 시스템

  + 코드의 **히스토리(버전)**을 관리하는 도구
  + 개발되어온 과정 파악 가능
  + 이전 버전과의 **변경 사항 비교 및 분석**
  + 수정사항을 기록

* Git 기본기

  * Repository
    * 특정 디렉토리를 버전관리하는 저장소
    * `git init` 명령어로 로컬 저장소 생성

  * Working Directory = 내가 작업하고있는 실제 디렉토리

    + untracked 파일

    + `git add` 파일명  , `git .` (현재 진행중인 모든 파일을 올림)

  * Staging Area = commit으로 남기고 싶은 특정 버전으로 관리하고 싶은 파일이 있는곳

    + staged 파일

    + `git commit` -m "" ==> Repository로

  * Repository = commit 들이 저장되는 곳

    + `git init` = 로컬 저장소 생성

    + `git status` = 관리되고 있는 파일들의 상태를 알 수 있음

  * Git 명령어

    + `git diff `
    + `git log` `git log --oneline` 로그 조회

    + git `remote add` origin {remote_repo}

    + `git remote -v` 연결 확인

    + `git push -u`  origin master 업로드

      

## GUI / CLI

* GUI Graphic User Interface
    + 폴더의 아이콘 등 유저가 사용하기 쉬운 인터페이스
* CLI Command Line Interface
    + cmd , git 등 명령줄 인터페이스 


## Linux 명령어

+ `ls` - list segment
+ `mkdir` 폴더명  - make directory 
+ `cd` 폴더명 - change  directory
+ `touch `- 용량이 0인 파일 생성
+ `rm` 파일명 - remove
+ `cd ..` - 윗 디렉토리로 이동
+ `rm -r` 폴더명(recursive 재귀 - 처음으로 돌아와 다시함)
+ `clear` 출력된 화면 제거
+ `pwd` 현재 위치한 디렉토리를 알려줌


       