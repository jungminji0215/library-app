# Library-app 

# 목차
- [사용 기술](#사용-기술)
- [프로젝트 설명](#프로젝트-설명)
- [설계](#설계)
- [API 스펙](#API-스펙)
- [트러블 슈팅](#트러블슈팅)
- [브랜치 전략](#브랜치-전략)
- [관리](#관리)

## 사용 기술

<a><img src="https://img.shields.io/badge/Spring Boot-6DB33F?style=flat-square&logo=SpringBoot&logoColor=white"/></a>
<a><img src="https://img.shields.io/badge/Java-007396?style=flat-square&logo=Java&logo&Color=white"/></a>
<a><img src="https://img.shields.io/badge/Spring Data JPA-6DB33F?style=flat-square&logo=&logoColor=white"/></a>
<a><img src="https://img.shields.io/badge/Gradle-02303A?style=flat-square&logo=Gradle&logoColor=white"/></a>
<a><img src="https://img.shields.io/badge/Git-F05032?style=flat-square&logo=Git&logoColor=white"/></a>
<a><img src="https://img.shields.io/badge/GitHub-181717?style=flat-square&logo=GitHub&logoColor=white"/></a>

## 프로젝트 설명

- 도서 관리 REST API를 개발해보려고 한다. Library-app 프로젝트는 entity 연관관계 설계 연습 및 API 개발 연습이 목적이다.
- 주요 기능으로는 사용자는 책을 대출 및 반남할 수 있고, 책에 대해서 리뷰를 작성할 수 있다.

## 설계

### ERD

![스크린샷 2023-02-20 오전 3.10.27.png](..%2F..%2F..%2F..%2Fvar%2Ffolders%2Flk%2Fn_96fhdj67j60xqgsjk45vh00000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_aypC1v%2F%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202023-02-20%20%EC%98%A4%EC%A0%84%203.10.27.png)

📌 리뷰 추가 예정

### Entity

![스크린샷 2023-02-20 오전 3.10.48.png](..%2F..%2F..%2F..%2Fvar%2Ffolders%2Flk%2Fn_96fhdj67j60xqgsjk45vh00000gn%2FT%2FTemporaryItems%2FNSIRD_screencaptureui_gWXOOK%2F%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202023-02-20%20%EC%98%A4%EC%A0%84%203.10.48.png)



## API 스펙

| 기능       | HTTP Method | HTTP Path           |
|----------|-------------|---------------------|
| [사용자] 등록 | POST        | /user               |
| [도서] 등록  | POST        | /book               |
| [도서] 대출  | POST        | /book/{bookId}/loan |


