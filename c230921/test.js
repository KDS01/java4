var num=1;
var str = "dewfwageg";
console.log(num);

let number=1;
number=2;
console.log("변수 number : "+ number);
//let = 재할당은 되지만, 재선언은 불가능

//const = final 상수
// const MAXNUM=1;
// MAXNUM=5;
// console.log(MAXNUM);

// let value = prompt("입력해라");//프롬프트 => 입력창을 띄우고 그 결과를 콘솔에 입력함
// console.log(value);
// alert(1);
// console.lo
let score =10;
let b =100;
if(score==10){
    let a=50;
    if(a==50){
        a=10;
        console.log(a);
        console.log(b);
    } 
}
//원시 타입
//  숫자 타입, 불리언, undefined, null
//객체 타입
//  객체,함수,배열 등등
for (let i = 0; i < 5; i++) {
    for (let j = 0; j <=i; j++) {
        window.document.write("*");
    }
    window.document.write("<br>");
}
//함수 선언문
function sum(x,y) {
    return x+y;
}
//함수 표현식
let res= function sum(x,y){
    return x+y;
}
//생성자
let res1=new Function("x","y","return x+y");
//화살표 함수(arrow func)
let res3= (x,y)=> x + y;
