let comScore=0;
let userScore =0;
let isComputerTurn = true;

let shotleft =15;
function onComputershoot(){
    if(isComputerTurn) return;
    let shootType= Math.random()<0.5? 2: 3;
    if(shootType==2){
        if(Math.random()<0.5){
            showText("태웅이가 2점슛을 성공");
        }
    }
}
function onUserShoot(shootType){
    if(isComputerTurn) return;
    const textElem = document.getElementById("text");
    if(shootType==2){
        if(Math.random()<0.5){
            showText("백호가 2점슛 성공");
            updateUserScore(2);
        }
        else{
            showText("백호가 2점슛 실패")
        }
    }
    else{
        if(Math.random()<0.33){
            showText("백호가 3점슛 성공");
            updateUserScore(2);
        }
        else{
            showText("백호가 3점슛 실패")
        }
    }
    isComputerTurn=true;
    disalbeuserbutton=true;
    disalbecomputerbutton=false;
    shotleft--;
    const shotLeftElem = document.getElementById("shoots-left")
    shotLeftElem.innerHTML = shotleft;
    if(shotleft==0){
        if(userScore>comScore) textElem.innerHTML="승리"
        else if(userScore<comScore) textElem.innerHTML="패배"
    }
}
function showText(str){
    const textElem=document.getElementById('text');
    textElem.innerHTML = str;
}
function updateComputerScore(score){
    comScore+=score;
    const comscoreElem = document.getElementById("computer-score");
    comscoreElem.innerHTML=comScore;
}
function updateUserScore(score){
    userScore+=score;
    const usercoreElem = document.getElementById("user-score");
    usercoreElem.innerHTML=user-Score;
}
function disalbecomputerbutton(flag){
    const computerButton = document.getElementsByClassName("btn-computer");
    for(let index=0; index<computerButton.length; index++){
        computerButton[index].ariaDisabled =flag;
    }
}
function disalbeuserbutton(flag){
    const userButton = document.getElementsByClassName("btn-user");
    for(let index=0; index<userButton.length; index++){
       userButton[index].ariaDisabled =flag;
    }
}
fuc