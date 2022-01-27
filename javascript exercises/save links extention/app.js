

let melead = []
const inputEl = document.getElementById("input-el")
let  inputbtn = document.getElementById("input=btn")
const ulel = document.getElementById("ul-el");
let savetab = document.getElementById("tabbtn")

let dele = document.getElementById("delete-el") 

const stroing = JSON.parse(localStorage.getItem("melead"))

if(stroing)
{
    melead = stroing
    renderlead()
}


dele.addEventListener("click", function(){
    
  localStorage.clear()

  melead = []
  renderlead()
 
})

savetab.addEventListener("click", function()
{
    chrome.tabs.query({active:true, currentWindow:true}, function(tabs){
        melead.push(tabs[0].url)
        localStorage.setItem("melead", JSON.stringify("melead"))
        renderlead()
    })
})



inputbtn.addEventListener("click", function(){
    melead.push(inputEl.value)
    inputEl.value= ""
    localStorage.setItem("melead", JSON.stringify(melead))
    renderlead()
   
})
function renderlead()
{
let listitem = " "
for(let i=0;i<melead.length;i++)
{
listitem += "<li><a target='_blank' href='" + melead[i] + "'>" + melead[i] + "</a>"
       
}
ulel.innerHTML = listitem
}







let p = "gopal"
let op = " nick"
let game = "fighetrsclub"
let points  = 0;
let haswon = false;

 points += 100
 haswon = true

 if(haswon){
     console.log('${p} ')
      }
else{
    console.log("oponent won")
}


// let divbox = document.getElementById("box")

// divbox .addEventListener("click", function(){
//     console.log("box ix clicked")
// })

// for(let i =0;i<melead1.length;i++)
// {
//     console.log(melead1[i])
// }


// let name = "gopal"

// // const mail = "hi " +name+ " happy to seee you!!"

// //convert to template string or literals

// const mail1 = `hi
//  ${name} welcome to 
//  the world!!
//  ! `
// console.log(mail1)



