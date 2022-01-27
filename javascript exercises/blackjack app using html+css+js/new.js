var fname ="gopal"
var lname = "krishna"
var fullname = fname + " " +lname;

console.log(fullname)

let name ="gopal"
let message = "hi there "
function lo(){
console.log(message+name+"!")    
}
lo();


let point = 3
function addpoint()
{
  
    point = point + 2;
    console.log(point)
}
addpoint();
function removepoint(){
point = point - 1
console.log(point)

}
removepoint()
console.log(point)


console.log("njhgcfgdcuytv")


let ppp = document.getElementById("pp")

console.log(ppp)

function error(){
    console.log("button clicked")
    document.getElementById("pp").innerText = "there is an error, please check thorrowly";
}




let n1 = 100;

let n2 =  230;

console.log(n1)

document.getElementById("num").innerText = n1;
document.getElementById("numm").innerText = n2;

let sum = document.getElementById("re")

function addition()
{

  let results = n1 + n2;
  sum.innerText = "sum:" + results
  
}
function sub()
{

  let results = n1 - n2;
  sum.innerText = "sum:" + results
  
}

function mul()
{

 let results = n1 * n2;
  sum.innerText = "sum:" + results
  
}
function div()
{

 let  results = n1 / n2;
  sum.innerText = "sum:" + results

 
}

/////////////////////

// let age=100

// if(age > 100)
// {
//   console.log("eligible")
// }else if(age==100)
// {
//   console.log("happy birthday from kind")
// }else{
//   console.log("not eligible")
// }



let fcard = 10;

let scard = 22

let arr = [fcard,scard]

let summ = fcard + scard
let isalive = true

let message1 = ""

let messages = document.getElementById("mess")

let summm = document.querySelector("#sum")

cards = document.getElementById("card")

function startgame(){
rendergame();

}





function rendergame()
{
cards.innerContent = "cards:"

for(i=0;i<arr.length;i++)
{
  cards.textContent += arr[i] + ""
}
summm.innerText = "sum" + summ
if(summ <= 20)
{
  message1 = "do you want to draw another card???"
}else if(summ===21)
{
message1 ="you got blackjack"
}
else{
  message1="you are out of game"
  isalive = false
}

messages.textContent = message1
}


function newcard(){
 let card = 7
  summ = summ + card
 
  arr.push(card)

  rendergame()
}





 
