var fnamee:string = "Rohit";
var scoreOne:number = 95;
var scoreTwo:number = 85;
var summation:number = scoreOne+scoreTwo;
console.log("Name is   " +fnamee);
console.log("Score 1 is   " +scoreOne);
console.log("Score 2 is   " +scoreTwo);
console.log("Sum is " +summation);

var vnameone:string = "Ashok";
console.log("value Vname is "+vnameone);

// the variable stores a value of type String

var bnametwo:string;
console.log("value Bname is "+bnametwo);
// the variable is a string variable. the variable's value is set to undefined by default

var cnameone = "Durai";
console.log("value Cname is "+cnameone);

// the variable's type is inferred from the data type of the value. Here, the variable is of the type String.

var lnameone;
console.log("value Lname is "+lnameone);
// the variable's data type is any. Its value is set to undefined by default.

//**************************************************************************** */
// Example: Variable Scope

var global_num = 12 //global variable

class Employee{
    num_val = 13; // class varibale
    static sval = 10; // static field

    storeNum():void{
        var local_num = 14 // local variable

    }
}

console.log("Global num is : "+global_num);
console.log(Employee.sval);

var obj = new Employee();
console.log("Global num is : "+obj.num_val);