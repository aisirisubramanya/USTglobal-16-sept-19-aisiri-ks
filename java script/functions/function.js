// named function
function add(num1,num2)
{
    console.log('sum=',num1+num2);
}
add(1,2);
add(1);
// anonymous function
var sub = function(num1,num2)
           {
            //  return num1-num2;
             console.log('value1+=',num1-num2);
           }
// var value=sub(2,3);
// console.log('value=',value);
sub(2,3);
// function overloading
function add(num1,num2,num3)
{
    console.log(num1+num2+num3);
}
add(1,2,3);

// if we have same method name then the last method will be called there is no concept of method overloading.
// self invoked function.
// semicolon is mandatory in before statement of self invoked function. 
(function(num1,num2)
{
    console.log('product=',num1*num2);
})
(2,3);
// fat arrow function
var num = num1=>console.log(num1);
num(1000);
var addition=(num1,num2)=>num1+num2;
console.log('sum=',addition(100,10));