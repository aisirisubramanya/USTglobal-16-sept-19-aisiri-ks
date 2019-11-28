const hobbies = ['sleeping','watching movies','coding'];
console.log('type:',typeof hobbies);
const isArrayOrNot = Array.isArray(hobbies);
console.log('hobbies array or not:',isArrayOrNot);
const hasSleeping = hobbies.includes('sleeping');
console.log('sleeping is there or not:',hasSleeping);
hobbies.push('playing','roaming');
console.log('after pushing elements:',hobbies);
hobbies.pop();
console.log('after poping:',hobbies);
hobbies.unshift('numismatics','singing');//used to add elements at first.
console.log('after unshift elements:',hobbies);
hobbies.shift();//used to remove elements at first.
console.log('after shift:',hobbies);
const hobbies1 = ['sleeping','cricket','eating','coding','roaming'];
hobbies1.splice(1,0,'pubg','bird watching');
console.log('after splice : ',hobbies1);
const afterSlice = hobbies1.slice(1,3);
console.log('after slice : ',afterSlice);
console.log('after slice : ',hobbies1);
const index = hobbies1.indexOf('coding',1);
const index1 = hobbies1.indexOf('playing',1);
console.log('index of coding is ',index);
console.log('index of coding is ',index1);
const arrayToString = hobbies1.join('*');
console.log('after converting into string:',arrayToString);
const numbers = [100,200,300,400];
const numbers1 = numbers.map(function(value,index){
    let newValue = value+50;
    return newValue;
})
console.log('after map:',numbers1);
const num = numbers.map(value=>value+50);
console.log('after fat arrow:',num);

const num1 = numbers.filter(function(value,index){
    if(value>200){
        return true;
    }
    else{
        return false;
    }
})
console.log('after filter:',num1);


const num2 = numbers.filter(value=>value>200);
console.log('after arrow:',num2);