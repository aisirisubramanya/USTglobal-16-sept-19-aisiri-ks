console.log('window object',window);
console.log('this keword',this);    
console.log(this === window);


// window.alert('welcome to JavaScript class');  //used for pop-up messages.
// alert('welcome ust global and test yentra'); 

// let confirmDelete = confirm('are you sure you want to delete');
// console.log('confirm delete:',confirmDelete);


// let userName = prompt('what is your name ','deeksha');
// console.log('user name',userName);


const person = {
    firstName:'Aisiri',
    age:22,
    lastName:'Kirani',
    getName:function(){
        console.log(this);
        return this.firstName+" "+this.lastName;
    }
}
let fullName = person.getName();
console.log('full name:',fullName);