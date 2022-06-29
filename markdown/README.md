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
    + 코드의 **히스토리(버전)**을 관리하는 도구
    + 개발되어온 과정 파악 가능
    + 이전 버전과의 **변경 사항 비교 및 분석**
    + 수정사항을 기록
    + 백업, 협업, 복구에 유용

* Git 기본기

    * Repository
      + 특정 디렉토리를 버전관리하는 저장소
      +`git init` 명령어로 로컬 저장소 생성

    *  W.D (Working Directory) : 내가 작업하고있는 실제 디렉토리
      + untracked 파일
      + `git add` 파일명  , `git .` (현재 진행중인 모든 파일을 올림)

    * Staging Area = commit으로 남기고 싶은 특정 버전으로 관리하고 싶은 파일이 있는곳
      + staged 파일
      + `git commit` -m "" : Repository로 commit 이동

    * Repository = commit 들이 저장되는 곳
      + `git init` : 로컬 저장소 생성
      + `git status` : 관리되고 있는 파일들의 상태를 알 수 있음

    * Git 명령어
      + `git diff` (commit id) (commit id) 변경사항 조회가능
      + `git log`, `git log --oneline` 로그 조회
      + `git remote -v` 연결 확인


 * Git Remote 명령어
    + `git remote add` origin (Repository Url)
    + `git push -u`  origin master 로컬과 원격저장소 동기화
    + `git clone ` repo url  (clone = 다운로드)
    + `git pull` origin master (pull = update, push 전에 항상 pull,     local 환경으로 복사해오는 것) 
    + `git reset` --soft, --hard, --mixed : 해당 commit 아이디 기준으로 커밋을 돌리고 그 이후의 커밋을 다 지운다.

    + `git restore` {파일명} : w.d에서 수정한 것을 원래상태로 돌려준다
    + `git restore --staged` {파일명} : staging Area에 있는 것들을 w.d로 돌려놓는다.
    + `git revert` : 돌아가고 싶은 commit으로 새로운 commit 생성

 * 협업 관련 Git 명령어
    + `git remote add origin {repo_url}`
    + `git clone {git_repo}` : download
    + `git push origin master` : uproad
    + `git pull origin master` : update


---

## **Branch** 란?

특정 커밋을 가르키는 포인터
default branch = master >> 상용
head - Branch에서 가장 최근에 생긴 커밋
브랜치는 다 사용하면 지워줘야함 단 merge 되기 전에 삭제하면 안됌



1. 브랜치 생성
   `git branch {branch name}`

2. 브랜치 이동
   `git checkout , switch {branch name}`

3. 브랜치 생성 및 이동 
   `git checkout -b {branch name}`
   `git switch -c {branch name}`

4. 브랜치 목록
   `git branch`

5. 브랜치 삭제
   `git branch -d {branch name}`
   -D로 하면 강제로 삭제가 되니 유의

6. 브랜치 Merge
   `git merge {branch name}`  : master > 기본 틀이되는 브랜치 이동하고 merge

---

## GitHub

### 협업

1. Shared Repository Model

  * Owner & Collaborator
    + 모든 팀원이 push  권한을 갖는다
    + 가장 1차원적인 기본이 되는 협업의 모델
    + 협업을 할 때, 해당 모델만 가지고는 어려움이 있음
  

2. Fork & Pull Request

  * 권한의 유무가 가장 큰 차이
    + push의 권한이 없기 때문에 **Pull Request**를 통해 기여할 수 있다.
    + branch 생성해도 되고 안해도 된다. 하지만 사용하는것이 좋음


3. 관련 명령어

  * `.gitignore` 원하지않는 파일 제외하기
  * `data.csv` 특정파일
  * `secret/` 특정폴더
  * `*.png` 특정 확장자    *(모든것을 포함하라)
  * `!profile.png` 모든 png는 빼고 profile.png는 넣고

