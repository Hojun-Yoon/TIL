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
