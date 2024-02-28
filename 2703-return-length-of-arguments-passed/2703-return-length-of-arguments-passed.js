/**
 * @param {...(null|boolean|number|string|Array|Object)} args
 * @return {number}
 */
var argumentsLength = function(...args) {
    var c=0;
    while(args[c]!==undefined)
        c++;
    
    return c;
};

/**
 * argumentsLength(1, 2, 3); // 3
 */