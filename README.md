# be-homework-docker

## Docker Hub
![dockerHubs](https://github.com/Jeonni/be-homework-docker/assets/69911004/0a3eecf6-d10a-43c8-8ebd-f55c5827687e)<br/><br/><br/>



## Docker v-0.1
#### SpringBoot 애플리케이션 0.1 버전을 도커 이미지로 만들고 도커 이미지 저장소에 등록
##### - http://host:8080/test/hello 로 API 주소 설정

<br/>1. Container<br/>
![v-01빌드이미지](https://github.com/Jeonni/be-homework-docker/assets/69911004/14fa0e51-5d13-4ba8-b0f8-a9c3c4240595)
2. HTML<br/>
![v-01HTML](https://github.com/Jeonni/be-homework-docker/assets/69911004/04bfe602-e2dd-404b-9cea-992636673020)<br/><br/><br/>



## Docker v-0.2 (JPA 적용)
#### SpringBoot 애플리케이션 0.1 버전에 아래 내용을 추가하여 0.2 버전으로 개선
##### - 응답 json {”sabun” : 1, “name” : “jeon”, “dept_cd” : “CS001023004”, “dept_nm” : “컨테이너 실습”, “role_cd” : “EEF9852”, “role_nm” : “STUDENT”}
##### - http://host:8080/test/member/1 에 해당하는 API 작성

1. Container<br/>
![v-02빌드이미지](https://github.com/Jeonni/be-homework-docker/assets/69911004/ab1f3440-1152-4b93-86b4-c0d92fc93fde)
2. POSTMAN<br/>
2-1. POST MAPPING<br/>![v-02POST](https://github.com/Jeonni/be-homework-docker/assets/69911004/783874ec-8843-4541-80f3-7bb6e3682bc9)<br/>
2.2. GET MAPPING<br/>![v-02GET](https://github.com/Jeonni/be-homework-docker/assets/69911004/6242d34f-c1eb-48b2-80b8-1c9ee14c043e)<br/>
3. HTML<br/>
![v-02HTML](https://github.com/Jeonni/be-homework-docker/assets/69911004/6237a45c-e7c8-4a01-a4fc-5e242b755c83)
