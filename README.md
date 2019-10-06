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
