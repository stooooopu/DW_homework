// 자바스크립트 or 자바 선택해서 풀 것!
// 선택정렬을 이용해서 오름차순으로 정렬해보자.
// 선택정렬 관련해서 서치는 좋지만 코드는 직접 풀어봐요! 과정을 중요시 생각합니다 :)
let array = [9, 6, 7, 3, 5];
console.log(array);
var min = 0;
var temp = 0;
for(var i = 0; i<array.length-1; i++){
    min = i;
    for(var j=i+1; j<array.length; j++){
        if(array[j]<array[min]){
            min = j;
        }
    }
    temp = array[i];
    array[i]=array[min];
    array[min]=temp;
}
console.log(array);