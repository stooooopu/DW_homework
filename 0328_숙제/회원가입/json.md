        
## json은 위에 변수에 영향을 받지 않음
- jsonParam.uwerName = '정지유' 이렇게 json입력
- 이때 id는 중복 안되니까 key값으로 사용
1. json 선언
- var jsonParam = {};
2. key값을 phone으로 두고 값을 입력하고 싶음
- jsonParam.phone ='010-3434-8310';
3. key값을 iphone으로 두고 값을 입력하고 싶음
- var elementId = 'iphone';
- jsonParam.elementId = 'ipone mini';
4. 결과
- jsonParam = {phone : '010-3434-8310', elementId : 'ipone mini'};
- key값이 iphon이 아닌 elementId로 들어간 것으로 볼 때 json은 변수에 영향을 받지 않음


1. json 선언
- var jsonParam = {};
2. key값을 phone으로 두고 값을 입력하고 싶음
- jsonParam.phone ='010-3434-8310';
3. key값을 iphone으로 두고 값을 입력하고 싶음
- var elementId = 'iphone';
- jsonParam[elementId] = '010-3434-8310';
4. 결과
- jsonParam = {phone : '010-3434-8310', iphone : '010-3434-8310'};
- 이렇게 elementId 의 값을 key로 주고싶을 땐 이렇게 배열로 넣는다
