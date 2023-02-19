# Library-app 

# 목차
- [사용 기술](#사용-기술)
- [프로젝트 설명](#프로젝트-설명)
- [설계](#설계)
- [API 스펙](#API-스펙)
- [트러블 슈팅](#트러블-슈팅)
- [브랜치 전략](#브랜치-전략)
- [관리](#관리)

---

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

<img width="632" alt="스크린샷 2023-02-20 오전 3 17 20" src="https://user-images.githubusercontent.com/83000829/219967128-d70e4299-21a6-434a-8e6e-18801671e814.png">

📌 리뷰 추가 예정

### Entity

<img width="589" alt="스크린샷 2023-02-20 오전 3 17 43" src="https://user-images.githubusercontent.com/83000829/219967147-42bea406-6555-493b-9c97-3475eb66b364.png">



## API 스펙


| 기능       | HTTP Method | HTTP Path           |
|----------|-------------|---------------------|
| [사용자] 등록 | POST        | /user               |
| [도서] 등록  | POST        | /book               |
| [도서] 대출  | POST        | /book/{bookId}/loan |



## 트러블 슈팅

