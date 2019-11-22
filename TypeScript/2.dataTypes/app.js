var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
// primitive datatypes.
var name1 = "aisiri";
console.log(name1, "type:", typeof name1);
var age = 22;
console.log(age, 'type:', typeof age);
var num;
console.log(num, "type:", typeof num);
var value;
value = "sjfcgsz";
value = 0987654;
console.log(value, "type:", typeof value);
var calAge = function () {
    console.log("age is 22");
};
calAge();
// user defined datatypes or reference datatype.
// class
var Person = /** @class */ (function () {
    function Person(name, age) {
        this.name = name;
        this.age = age;
    }
    return Person;
}());
var person1 = new Person('akshatha', 21);
console.log(person1);
var Student = /** @class */ (function (_super) {
    __extends(Student, _super);
    function Student(name, age, rollno) {
        var _this = _super.call(this, name, age) || this;
        _this.rollno = rollno;
        return _this;
    }
    return Student;
}(Person));
var student1 = new Student('anu', 22, 1);
console.log(student1);
