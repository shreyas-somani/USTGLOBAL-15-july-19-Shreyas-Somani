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
var myName = 'Hello Shreyas';
var company;
company = 'testyantra';
company = 23;
console.log(company);
console.log(myName);
var sample;
sample = 32;
sample = true;
console.log(sample);
var myArray = [1345, 'kkjk', 'fsegzbt', true];
//internall it is like
console.log(myArray);
var myA = ['SDFGHJK', 'ADSFGH'];
console.log(myA);
var myTuple = ['', 2, true];
//enum is a keyword to specify name
var Colors;
(function (Colors) {
    Colors[Colors["red"] = 300] = "red";
    Colors[Colors["green"] = 301] = "green";
    Colors[Colors["blue"] = 302] = "blue";
    Colors[Colors["black"] = 303] = "black";
})(Colors || (Colors = {}));
//the nos will go jin incremental style
console.log(Colors.black);
var Colo;
(function (Colo) {
    Colo["red"] = "Danger";
    Colo["green"] = "success";
    Colo["blue"] = "primary";
    Colo["black"] = "dark ";
})(Colo || (Colo = {}));
//if we initialize one as string ,we need to initialize al
console.log(Colo.black);
var Person = /** @class */ (function () {
    // name:string='Raja';
    // age:number=23;
    //constructor(public Personname:string,private Personage:number){
    function Person(Personname, Personage) {
        //  this.name=Personname;
        //  this.age=Personage;
        this.Personname = Personname;
        this.Personage = Personage;
    }
    return Person;
}());
var person = new Person('Raja1', 21);
console.log(person.Personage);
var mName = 'Raja2';
mName = null;
console.log(mName);
var Car = /** @class */ (function () {
    function Car() {
        this.brand = 'BMW'; //non ststic object
    }
    Car.model = 'X5';
    return Car;
}());
var brand1 = new Car();
console.log(brand1.brand);
console.log(Car.model); //static member
var Car1 = /** @class */ (function () {
    function Car1(brand, model) {
        this.brand = brand;
        this.model = model;
    }
    return Car1;
}());
var bmwCar = new Car1('BMW', 'X5');
console.log(bmwCar.brand);
console.log(bmwCar.model);
var benzCar = {
    brand: 'Benz',
    model: '0002'
};
var Person1 = /** @class */ (function () {
    function Person1(name, age) {
        this.name = name;
        this.age = age;
        this.salary = 567111;
    }
    return Person1;
}());
var Student = /** @class */ (function (_super) {
    __extends(Student, _super);
    function Student(Myname, age, USN) {
        var _this = _super.call(this, Myname, age) || this;
        _this.Myname = Myname;
        _this.age = age;
        _this.USN = USN;
        return _this;
    }
    return Student;
}(Person1));
var person1 = new Person1('Dinga', 23);
var person2 = new Student('Dingi', 34, 99);
console.log(person1.salary);
var P2 = /** @class */ (function () {
    function P2(name, age, degree) {
        this.name = name;
        this.age = age;
        this.degree = degree;
    }
    return P2;
}());
var person3 = {
    name: 'kjhgfcd',
    age: 34
};
var person4 = {
    name: 'kjhgfcd',
    age: 40,
    degree: 'asd'
};
var Stud5 = /** @class */ (function () {
    function Stud5() {
        this.name = 'Raja';
        this.age = 23;
    }
    Stud5.prototype.printDetails = function () {
        console.log("name is" + this.name + 'age is' + this.age);
    };
    return Stud5;
}());
var person5 = new Stud5();
person5.printDetails();
var st1 = {
    name: 'xyz',
    age: 23,
    printDetails: function () {
        console.log("name is" + st1.name + 'age is' + st1.age);
    }
};
st1.printDetails();
// just keeping a question mark  can make it optional
//here degree is optional
