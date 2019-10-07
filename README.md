# TIL
Today I Learned


2019년 10월 5일 
-------------
ㅇ 빈 객체 여부를 확인하는 방법  

1. Object.keys(obj).length === 0
2. 빈 객체 체크 해서 확인하는 함수 작성
for (let prop in obj) {
  if (obj.hasOwnProperty(prop)) {
    return false  // 아닌 경우 true
  }
}

ㅇ 해당 프로퍼티가 있는 지 확인하려면
Object.hasOwnProperty('prop') // return Boolean



2019년 10월 6일
-------------

ㅇ setState 작동방식
- setState() / 상태변화에 대한 정의 -> render() / 변화 적용
  * 변화 적용을 위해서 jsx 문법을 사용하며, 이 문법을 통해 virtual dom 에 적용됨.
  -> virtual dom -> real dom 실제 dom 과 비교해서 다른 점만 비교하고 -> 진짜 그린다.
  
ㅇ 라이프 사이클
- 처음에 constructor 로 state 가 초기화 되며 render 가 실행, 실행된 내용이 화면에 표시가 된
이후 componentDidMount() 메소드가 실행
- 변화가 발생하면, setState -> render() -> componentDidUpdate()

2019년 10월 7일
---------

ㅇ 모든 이벤트 핸들러는 모든 브라우저에서 동일하게 처리하기 위하여 합성 이벤트 객체를 전달받게 되고, 풀링(기능을 사용하기 위한 준비 / 리소스 많이 차지함)
상태이고, 성능 상의 이유로 호출되고 나면 초기화되며, 동기 처리되는 특징을 가지고 있다.
ㅇ 이를 컨트롤 하고 비동기 처리해주기 위한 기능이 Throttle, debounce 등이다.

ㅇ 프레임워크와 라이브러리 차이
- 프레임워크 : 특정 디자인 패턴이나 전처리 후처리에 필요한 동작과 기능을 수행하기 위해서 프레임워크가
중간 중간에 특정 비즈니스나 특정 구현 단에서만 사용자의 코드를 검색하여 사용하는 형태(제어의 역전 발생)
- 라이브러리 : 함수, 기능 모음을 단순히 가져다쓰는 
