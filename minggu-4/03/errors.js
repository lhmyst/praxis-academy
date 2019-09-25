// function alert(x){ 
//     x === 'undefined' ? console.log('undefined') : console.log(x); return; 
//  }; 
//  alert('x'); alert();


//  try {

//     let lalala; // error, variable is not defined!
  
  
//   } catch(err) {
  
//     console.log("haha noob"); // (3) <--
  
//   }

//   try {
//     throw new Error('Whoops!');
//   } catch (e) {
//     console.error(e.name + ': ' + e.message);
//   }

function CustomError(foo, message, fileName, lineNumber) {
    var instance = new Error(message, fileName, lineNumber);
    instance.name = 'CustomError';
    instance.foo = foo;
    Object.setPrototypeOf(instance, Object.getPrototypeOf(this));
    if (Error.captureStackTrace) {
      Error.captureStackTrace(instance, CustomError);
    }
    return instance;
  }
  
  CustomError.prototype = Object.create(Error.prototype, {
    constructor: {
      value: Error,
      enumerable: false,
      writable: true,
      configurable: true
    }
  });
  
  if (Object.setPrototypeOf){
    Object.setPrototypeOf(CustomError, Error);
  } else {
    CustomError.__proto__ = Error;
  }
  
  try {
    throw new CustomError('baz', 'bazMessage');
  } catch(e){
    console.error(e.name); //CustomError
    console.error(e.foo); //baz
    console.error(e.message); //bazMessage
  }