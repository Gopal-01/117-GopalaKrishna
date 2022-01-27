  document.getElementById("count").innerText = 0

  let count = 0;
function increment(){

  count = count + 1
  document.getElementById("count").innerText = count;
}

function decrement()
{
  count = count - 1
  document.getElementById("count").innerText = count;
}

let pre = document.getElementById("previous")
function save()
{
  let constr = count + " - "
  pre.textContent = pre.innerText + constr
  console.log(count)
  document.getElementById("count").innerText = 0;
  count = 0;
  
}

function exit(){

document.getElementById("count").innerText = 0;
}

let greetings = document.getElementById("greet")

let name ="gopal 👋"

let greetingmessage = "happpy greetings in this very new year, "

let message =  greetingmessage + name;

greetings.innerText = message
greetings.innerText = greetings.innerText + "👋 👋";







// let a  = 4;
 
// let b = 

// console.log(a+b)



// let name = "gopal";
 
// let greeting = "hi, my name is ";

// let mygreeting = greeting + name;

// console.log(mygreeting)




// let message  = "you have three otificationh";
// let name  ="gopal"
// console.log(name + ","+message)

// let messagetouser = name+"," +message+"!";
// console.log(messagetouser)


// let count1 = 0;
// console.log(count1)

// let MyAge = 25
// console.log(MyAge)

// let c = 5/2;
// console.log(c)

// let MyAge = 25;
// let humandogratio = 7
// let dogage= MyAge * humandogratio;
// console.log("doggae:"+dogage)
// console.log("ratio:"+humandogratio)
// console.log("myage:"+MyAge)

// let a = 10;
// a =100;
// console.log(a)


// let bonuspoint = 50;
// bonuspoint = bonuspoint + 50;

// console.log(bonuspoint)
// bonuspoint = bonuspoint - 75

// console.log(bonuspoint)
// bonuspoint = bonuspoint + 45

// console.log(bonuspoint)




// function my(){

//     console.log(54)
// }
// my();
// let lag1 = 100
// let lag2 = 200
// let lag3 = 300
// function logtime()
// {
// //  let total =  lag1 + lag2 + lag3;
// //  console.log(total)
//  console.log(lag1 + lag2 + lag3)

// }

// logtime()

// let lapcompleted = 0;

// function lap()
// {
//  lapcompleted = lapcompleted + 1

// }
// lap()
// lap()
// lap()
// lap()
// lap()
// lap()

// console.log(lapcompleted)



