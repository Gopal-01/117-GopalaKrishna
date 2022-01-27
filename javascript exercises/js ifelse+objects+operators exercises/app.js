let person = {

    name: "gopal",
    // age: "25",
    country: "india"
}

function logData()
{

    console.log(person.name + " is " + person.age + " years old and lives in " +person.country ) 
     
}

logData();


let age = 15

if(age < 6)
{
    console.log("free")
}
 else if(age<18)
{
    console.log("child disount")
}
else if(age<27)
{
    console.log("student discount")
}
else if(age <66)
{
    console.log("full price")
}
else{
console.log("senior citizen discount")
}

let countries = ["india", "usa","japan","australia","england"]




for(let i =0; i < countries.length;i++)
{
    console.log("-" + countries[i])
}





countries.pop()

console.log(countries)

countries.push("newzland")

console.log(countries)

countries.shift()

console.log(countries)

countries.unshift("germani")

console.log(countries)


let dayofmonth = 31

let weekday = "friday"

if(dayofmonth ==13 && weekday == "friday")
{
    console.log("spooky face")
}
else{
    console.log("not a spooky face")
}

let co = ["india", "usa","japan","australia","england"]

function randomm(){

    let randomindex = Math.floor(Math.random() * 3)
    return co[randomindex];
}
console.log(randomm())