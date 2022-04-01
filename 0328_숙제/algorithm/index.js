// 자바스크립트 or 자바 선택해서 풀 것!
// 버블정렬을 이용하여 오름차순으로 정렬하고 총 몇회전 했는지 알아내시오.
// '버블정렬_과정.png'처럼 1씩 줄어들게
let array = [1, 10, 4, 3, 5];
let count = 0; //총 몇회전 했는지 알아내는 변수
let isSwap = false;
let len = array.length;

for(let i=len; i>0; i--){
    for(let j=0; j<(i-1); j++){
        if(array[j]>array[j+1]){
            let temp = array[j];
            array[j] = array[j+1];
            array[j+1] = temp;
            ++count;
            isSwap = true;
        };
    };
    if(!isSwap) {
        break; // isSwap이 flase라면 멈춰 => for [j]가 한 번 이라도 실행되면 isSwap은 true, 하지만 이미 정렬된 배열이라면 true가 안나옴
        // 이미 정렬된 배열이라는 의미 => for문을 돌리는 의미가 없기 때문에 for문 실행 안하도록
    }
};

console.log(array);
console.log(count);