
    var x = 10;
    console.log(typeof(x))
    x = "Hello"; 

    const a = 10;
    var tong = a  + 5;

    var y; //undefined
    console.log(y)
    
    var z="1000";
    tong = parseInt(z) + tong;
    console.log(tong)

    let c = 10;

    function tong2So(a,b){
        return a + b;
    }

    var hieu2So = function(a,b){
        return a - b;
    }

    console.log(tong2So(2,5));

    var thuong2So = (a,b) => {   //trong js var co the la ham, co the la bien
        if(b !=undefined)
        return a / b;
        else      
        return a;
    }

    console.log(typeof(Thuong2So))

    console.log(thuong2So(10));

    var numbers = [0,5,1,4];
    var min
    for(var i = 0;i<numbers.length;i++){
        console.log(numbers[i])
        if(min > numbers[i])
        min = numbers[i]
    }
    console.log(min)

    var personA = {
        name : "Dung",
        age:20,
        address : 'Bac Giang',
        talk: function (){
            return this.name + 'talk about' + this.address + 'age' + this.age
        }
    }
    console.log(personA)
    

