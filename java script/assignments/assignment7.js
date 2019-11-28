const item1=[];
const items = [{
    name:'ear ring',
    id:1,
    price:5000
},{
    name:'kajal',
    id:2,
    price:1000
},{
    name:'trimer',
    id:3,
    price:3000
},
{                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
    name:'beardo',
    id:4,
    price:170
}];
items.map(function(item,index){
    item.price=item.price+300;
    return item;
})
console.log(items);
console.log("*************************");
const filltered = items.filter((items)=>items.price>1000);
console.log(filltered);