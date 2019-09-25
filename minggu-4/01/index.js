var name_john = "John";
var age_john = 22;

var name_max = name_john;
var age_max = age_john;

name_max = "Max";
age_max = 26;

console.log(name_john,age_john);
console.log(name_max,age_max);





function Animal (name){
    this.name = name;

    this.getName = function(){
        return 'Animal name is => ' + this.name;
    }
}

// var a = new Animal('Dog');
// console.log('a object ==> ',a);
// console.log('a.getName() ==>', a.getName());
// console.log('a.constructor === Animal', a.constructor === Animal);
console.log(Animal.prototype);

function makeClass(phrase) {
    // declare a class and return it
    return class {
      sayHi() {
        console.log((phrase));
      };
    };
  }
  
  // Create a new class
  let User = makeClass("Hello");
  
  new User().sayHi(); // Hello