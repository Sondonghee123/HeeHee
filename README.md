# 🚪 희희 낙찰

신한DS SW 아카데미 1차 팀 프로젝트

![image](https://github.com/user-attachments/assets/e6705014-e1c7-4909-b6cf-652cea89e878)


#### 📙 발표자료 보러가기([Click](https://github.com/user-attachments/files/18175644/default.pdf))

<br/>

## 💡 프로젝트 소개

**중고 거래 및 실시간 경매 플랫폼**

- 불필요한 물건을 버리지 않고 다른 사람에게 필요한 자원으로 활용할 수 있도록 도울 수 있습니다. 이는 환경 보호와 자원 절약에도 기여하며, 이용자들이 편하게 거래를 진행할 수 있도록 해줍니다.
- 한정판 제품, 골동품 등 희소성 있는 물품에 대한 수요를 만족시킬 수 있는 효과적인 거래 방식입니다. 또한, 경매는 시장에서 물건의 가치를 실시간으로 평가받을 수 있는 공정한 방법으로, 판매자는 더 높은 가격으로 판매를, 구매자는 예산 내에서 거래를 시도할 기회를 얻을 수 있습니다.


<img src="https://github.com/user-attachments/assets/0d1c8ce4-16be-4ca7-a865-b3b3bcaa85ac" width="70%">

<img src="https://github.com/user-attachments/assets/58ae76a4-f071-4168-82c6-938ba3c4211e" width="70%">


<br/>

### ✔️ 서비스 흐름


<img src="https://github.com/user-attachments/assets/58b47802-8f63-4102-a0f8-77a0dd44e632" width="70%">

<img src="https://github.com/user-attachments/assets/49f9a914-18be-4a87-aabb-8a2ae515eb50" width="70%">

<img src="https://github.com/user-attachments/assets/d9a87a2f-6827-4c35-b499-3dc6b7f42733" width="70%">

<img src="https://github.com/user-attachments/assets/abaa9394-200b-4d26-bd05-18e457a38a05" width="70%">

<br/>

## 👪 팀원 소개 및 역할

**개발기간: 2024.05.28 ~ 2024.07.09**

### ✔️ 세부 역할 분담

- 공통: 웹 디자인 / DB 설계

- 손동희: 메인화면 / 판매 상품 상세페이지 / 판매 물품 등록 및 수정

- 신정인: 실시간 채팅 / 약속잡기 및 취소 / 채팅방 내 결제

- 신현상: 실시간 경매 / 로그인 및 회원가입 / 엘라스틱 서치 / 결제 라이브러리 연동 / 공통 JS 및 모듈 개발 / GIT 협업 관리

- 이두리: 마이페이지 / QNA 및 FAQ 게시판

- 최재명: 관리자 페이지

- 황수영: 실시간 알림 / 이용 정지된 유저 페이지

<br/>

## 📒 주요 내용

### ✔️ 간편 로그인 및 보호자-피보호자 매칭 구현

#### - 회원가입 및 간편 로그인

고령자분들의 손쉬운 사용을 위하여 간결한 회원가입 과정과 간편 로그인 기능을 구현하였습니다.
<div style="display: flex;">
    <img src="https://github.com/user-attachments/assets/1a2c7631-34ab-45b5-b2b4-416048711994" alt="보호자회원가입" width="200px" />
    <img src="https://github.com/user-attachments/assets/5ae933e5-e115-41db-ab55-dd9504f228be" alt="생체로그인" width="200px" />
</div>

#### - 보호자-피보호자 매칭

보호자로 회원가입 시 피보호자와 매칭을 진행하게 되고 매칭된다면 대신 정보 입력, 이상징후 알림 받기 등의 서비스를 이용할 수 있습니다.
<div style="display: flex;">
    <img src="https://github.com/user-attachments/assets/f60ffecf-cbfd-4813-902b-b07d3a25c539" alt="보호자매칭화면" width="200px" />
    <img src="https://github.com/user-attachments/assets/dc987764-f2d8-47b9-b159-4a7f68e2eba6" alt="피보호자매칭" width="200px" />
</div>

### ✔️ 카드 발급 및 소비 관련 기능

#### - 개인 및 가족 카드 발급

어르신의 카드 사용을 손쉽게 하기 위해서 보호자가 가족카드를 발급할 수 있도록 하였습니다.
<div style="display: flex;">
    <img src="https://github.com/user-attachments/assets/c78ccee6-b53f-455e-9259-372364cd5f74" alt="개인카드발급" width="200px" />
    <img src="https://github.com/user-attachments/assets/7f969343-a321-4294-a4dc-174e0e90f9a8" alt="가족카드신청" width="200px" />
</div>

#### - 소비 내역, 소비 리포트 확인

발급한 카드의 소비 내역과 소비 리포트를 확인할 수 있습니다.
<div style="display: flex;">
    <img src="https://github.com/user-attachments/assets/950bc988-a3f5-4f88-90f6-6ee97f712bb8" alt="소비내역" width="200px" />
    <img src="https://github.com/user-attachments/assets/09b9bf18-7c68-4da5-98e2-3a735eb8e436" alt="소비리포트" width="200px" />
</div>

#### - 소비 이상징후 알림

보호자는 피보호자의 카드 사용 내역에서 이상 거래가 탐지된다면 알림을 받을 수 있습니다.
<div style="display: flex;">
    <img src="https://github.com/user-attachments/assets/02cc2744-1651-4e78-b9fe-f2f4d7841f53" alt="소비이상징후알림" width="200px" />
</div>

### ✔️ 복지 서비스 예약 및 결제

#### - 복지 서비스 예약

보호자는 피보호자의 복지 서비스를 대신 예약할 수 있습니다.
<div style="display: flex;">
    <img src="https://github.com/user-attachments/assets/d00dd4c9-d862-4c6c-aebc-dd7ec7ba6032" alt="보호자예약" width="200px" />
    <img src="https://github.com/user-attachments/assets/3e4d0cc3-48c4-48fd-8fb7-d39cda49c7bc" alt="보호자예약확인" width="200px" />
    <img src="https://github.com/user-attachments/assets/bfd4fca7-9818-49ce-a776-f9e946d10259" alt="보호자예약취소" width="200px" />
</div>

### ✔️ 대화형 챗봇 '똑똑이'

똑똑이는 LLM과 TTS 모델을 사용하여 사용자와 대화를 통해 상호작용합니다. 똑똑이와 대화를 통하여 어르신들은 화면을 보지 않고 다양한 서비스를 이용할 수 있습니다.

예를 들어 원하는 날짜와 시간을 알려준다면 똑똑이가 복지 서비스를 대신 예약해 줍니다.
<div style="display: flex;">
    <img src="https://github.com/user-attachments/assets/00b38939-209b-44ba-9dc3-7088416e2336" alt="똑똑이일상대화" width="200px" />
    <img src="https://github.com/user-attachments/assets/d65ec333-e8d9-4214-9d90-1dc6e6c997f9" alt="똑똑이복지로" width="200px" />
</div>




<div style="display: flex;">
    <img src="" alt="" width="200px" />
    <img src="" alt="" width="200px" />
</div>

<br/>

## 📲 서비스 이용

<img src="https://github.com/user-attachments/assets/d43648a6-7f4f-494a-8b4e-cb8df00d594c" width="80%">

<br/>

## 🗃️ 시스템 아키텍처

<img src="https://github.com/user-attachments/assets/7c6cd372-0317-4fb6-afce-e92f3fcc8437" width="80%">

<br/>

## 🛠 기술 스택

#### - Front-end
<img src="https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white" alt="HTML5"> <img src="https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white" alt="CSS3"> <img src="https://img.shields.io/badge/React-61DAFB?style=for-the-badge&logo=react&logoColor=white" alt="React"> <img src="https://img.shields.io/badge/PWA-5A0FC8?style=for-the-badge&logo=pwa&logoColor=white" alt="PWA">

#### - Back-end
<img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white" alt="Spring Boot"> <img src="https://img.shields.io/badge/Spring_Security-6DB33F?style=for-the-badge&logo=springsecurity&logoColor=white" alt="Spring Security">

#### - AI
<img src="https://img.shields.io/badge/OpenAI-412991?style=for-the-badge&logo=openai&logoColor=white" alt="OpenAI">

#### - Data
<img src="https://img.shields.io/badge/PostgreSQL-4169E1?style=for-the-badge&logo=postgresql&logoColor=white" alt="PostgreSQL">

#### - Deploy
<img src="https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white" alt="Docker"> <img src="https://img.shields.io/badge/GitHub_Actions-2088FF?style=for-the-badge&logo=githubactions&logoColor=white" alt="GitHub Actions"> <img src="https://img.shields.io/badge/AWS-FF9900?style=for-the-badge&logo=amazonaws&logoColor=white" alt="AWS"> <img src="https://img.shields.io/badge/Nginx-009639?style=for-the-badge&logo=nginx&logoColor=white" alt="Nginx">

#### - Collaboration Tools
<img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white" alt="GitHub"> <img src="https://img.shields.io/badge/Miro-FFD700?style=for-the-badge&logo=miro&logoColor=white" alt="Miro"> <img src="https://img.shields.io/badge/Notion-000000?style=for-the-badge&logo=notion&logoColor=white" alt="Notion"> <img src="https://img.shields.io/badge/Figma-F24E1E?style=for-the-badge&logo=figma&logoColor=white" alt="Figma">
