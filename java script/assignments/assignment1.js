var i;
var value=1;
// named function
function fact(num1)
{
    for(i=1;i<=num1;i++)
    {
        value=value*i;
    }
    console.log('Factorial of '+num1+" is "+value);
    value=1;
}
fact(2);
// anonymous function
var fact1 = function(num2)
            {
                for(i=1;i<=num2;i++)
                {
                    value=value*i;
                }
                console.log('Factorial of '+num2+" is "+value);
                value=1;
            }
fact1(3);
// self invoked function
(
    function(num2)
            {
                for(i=1;i<=num2;i++)
                {
                    value=value*i;
                }
                console.log('Factorial of '+num2+" is "+value);
                value=1;
            }
)
(4);
// fat arrow function
var fact3 = num2 => {
    for(i=1;i<=num2;i++)
    {
        value=value*i;
    }
    console.log('Factorial of '+num2+" is "+value);
    value=1;
}
fact3(5);