function validateForm(){
    let apple=parseInt(document.getElementById('apple').value);
    let banana=parseInt(document.getElementById('banana').value);
    let guava=parseInt(document.getElementById('guava').value);
    let mango=parseInt(document.getElementById('mango').value);
    let pear=parseInt(document.getElementById('pear').value);

    if(apple<0){
        alert("Invalid quantity entered for Apple");
        return;
    }
    if(banana<0){
        alert("Invalid quantity entered for Banana");
        return;
    }
    if(guava<0){
        alert("Invalid quantity entered for Guava");
        return;
    }
    if(mango<0){
        alert("Invalid quantity entered for Mango");
        return;
    }
    if(pear<0){
        alert("Invalid quantity entered for Pear");
        return;
    }

    alert('Proceeding to checkout.Thank you!');
    return;
}

function randomFruit(){
    var fruits=['Apple','Banana','Guava','Mango','Pear'];
    var randomFruitNumber=Math.floor(Math.random()*fruits.length);
    alert('Here is your:' + fruits[randomFruitNumber]);
    changeBackgroundColor();
}

function changeBackgroundColor(){
    
    var randomColor = '#'+Math.floor(Math.random()*16777215).toString(16);
    document.body.style.backgroundColor=randomColor;
    window.setTimeout( "changeBackgroundColor()", 80);
}