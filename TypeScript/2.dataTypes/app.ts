// primitive datatypes.
let name1 : string = "aisiri";
console.log(name1,"type:",typeof name1);


let age = 22;
console.log(age,'type:',typeof age);


let num : number;
console.log(num,"type:",typeof num);


let value;
value = "sjfcgsz";
value = 0987654;
console.log(value,"type:",typeof value);

let calAge = function() : void{
    console.log("age is 22");
}
calAge();


// user defined datatypes or reference datatype.

// class

class Person{
    constructor(public name:string,public age:number){

    }
}
let person1 = new Person('akshatha',21);
console.log(person1);



class Student extends Person{
    constructor(name:string,age:number,public rollno:number){
        super(name,age);
    }
}
let student1 = new Student('anu',22,1);

console.log(student1);