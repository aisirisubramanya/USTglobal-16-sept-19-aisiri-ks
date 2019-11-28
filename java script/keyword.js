var name;
var name = 'aisiri';
name = 'kirani';


// let keyword
let name1;
// let name1='aisiri';     not possible
name1='aisiri';
name1='kirani';



// const keyword
const name2 = 'aisiri';
// name2 = 'kirani';      re-assigning is not possible 


//var in 'for loop'
for(var i=0;i<5;i++){
    console.log('inside for loop ',i);
} 
console.log('outside for loop ',i);

// let in 'for loop'
for(let j=0;j<5;j++){
    console.log('inside for loop ',j);
} 
// console.log('outside for loop ',j);        gives the error


