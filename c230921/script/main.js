
let title =document.getElementById("main-title");


console.log(title);
let sp=document.getElementsByTagName("span");
console.log(sp);
let spclass= document.getElementsByClassName("span-class");
console.log(spclass);

let getName = document.querySelectorAll(".name");
console.log(getName);
let getLi = document.getLi(".m1");
console.log(getLi);
//쿼리셀럭터를 썼을 때 중복되는 id가 있다면 가장 첫 번째 값을 가져옴
getLi.innerHTML ="변경해볼까?";
/*
브라우저 렌더링 과정
DOM(document object model)
BOM(browser object model)
==>둘의 차이점을 알아두는게 좋음
val let const
레벨 스코프(함수레벨 스코프냐, 블록레벨 스코프냐 등등 )
*/