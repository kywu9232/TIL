**# Markdown**

 텍스트 기반의 마크업 언어

 TAG를 사용한다

---
## **문법**

* Heading : #, ## , ###
* list : - , *  , +
* Code block : ```
* Link : [String][(URL)]
* Image : ![String][(URL)]
* Text Emphasis : -- -- , ** **
* Horizontal Line : ---
* Block Quotes : > 주석  
* Table

---

## **GIT**이란?

* **분산** 버전 관리 시스템

    + 코드의 ***\*히스토리(버전)\****을 관리하는 도구

   + 개발되어온 과정 파악 가능

    + 이전 버전과의 ***\*변경 사항 비교 및 분석\****

    + 수정사항을 기록

    + 백업, 협업, 복구에 유용

* Git 기본기

    * Repository
      + 특정 디렉토리를 버전관리하는 저장소
      +`git init` 명령어로 로컬 저장소 생성

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
      + `git diff` (commit id) (commit id) 변경사항 조회가능
      + `git log`, `git log --oneline` 로그 조회
      + `git remote -v` 연결 확인
      + `git restore` --staged 파일명 

 * Git Remote 명령어
    + `git `remote add` origin (Repository Url)
    + `git push -u`  origin master 로컬과 원격저장소 동기화
    + `git clone ` repo url  (clone = 다운로드)
    + `git pull` origin master (pull = update, push 전에 항상 pull, local 환경으로 복사해오는 것) 
    + `git reset`

---