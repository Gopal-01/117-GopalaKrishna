let fruit = ["🍊","🍎","🍊","🍎","🍎"];

let apple = document.getElementById("div1") 
let orange = document.getElementById("div2")


function sortfruits()
{

    for(let i = 0; i < fruit.length; i++)
    {
        if(fruit[i] ==="🍎")
        {
           apple.innerText += "🍎"
        }
        else if (fruit[i]==="🍊")
            {
               orange.innerText += "🍊"
            }
    }
}

sortfruits()
