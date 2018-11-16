class Car{

engine:string; // field

// constructor

constructor (engine:string){
    this.engine=engine;

}
// function
disp():void{
    console.log("Function displays Engine is "+this.engine);
}
}

// create an object
var obj = new Car("Honda");

// access the field

console.log("Reading attribute value engine "+obj.engine);

// access the function
obj.disp();