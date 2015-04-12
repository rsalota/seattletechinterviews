/*
Set of Stacks
Curt Hill
3/6/2015
Stacks & Queues 3.3 from CTCI
*/

var Stack = function () {
    this.elements = new Array();  //stack contents
}

Stack.prototype = {
    push: function (element) {
        this.elements.push(element);
    },
    pop: function () {
        return this.elements.pop();
    },
    shift: function () {
        return this.elements.shift();
    },
    elementCount: function () {
        return this.elements.length;
    }
}

var StackSet = function (maxCapacity) {
    this.maxCapacity = maxCapacity;
    this.stacks = new Array();
    this.stacks.push(new Stack());
}

StackSet.prototype = {
    currentStackIdx: function () {
        return this.stacks.length - 1;
    },
    getCurrentStack: function () {
        if (this.currentStackIdx() === -1) {
            //all stacks gone so create a new stack
            this.stacks.push(new Stack());
        }
        return this.stacks[this.currentStackIdx()];
    },
    addStack: function () {
        this.stacks.push(new Stack());
        return this.getCurrentStack();
    },
    stackCount: function () {
        return this.stacks.length;
    },
    push: function (element) {
        var currStack = this.getCurrentStack();
        if (currStack.elementCount() === this.maxCapacity) {
            //end of current stack. add new stack
            currStack = this.addStack(); //add new stack
        }
        currStack.push(element);
    },
    pop: function () {
        if (this.stackCount() === 0) throw new Error('the stackset is empty');
        var currStack = this.getCurrentStack();
        var el = currStack.pop();
        if (currStack.elementCount() === 0) {
            this.stacks.pop();   //remove empty stack
        }
        return el;
    },
    print: function () {
        for (var iStackNum = 0; iStackNum < this.stackCount(); iStackNum++) {
            var _stack = this.stacks[iStackNum];
            for (var i = 0; i < _stack.elementCount(); i++) {
                console.log('Element: ' +  _stack.elements[i] + ' - Stack: ' + iStackNum);
            }
        }
    },
    popAt: function (stackNum) {
        if (this.stackCount() === 0) throw new Error('the stackset is empty');
        if (stackNum < 0 || stackNum >= this.stackCount()) throw new Error('invalid stack number. (stack number is zero based)');
        var currStack = this.stacks[stackNum];
        var element = currStack.pop(); //pop off selected stack


        //now correct remaining stacks
        for (var i = stackNum; i < this.stackCount() - 1; i++) {
            currStack = this.stacks[i];
            var nextStack = this.stacks[i + 1];
            currStack.push(nextStack.shift());   //put bottom item of next stop on top of current stack
            if (nextStack.elementCount() === 0) {
                this.stacks.pop(); //remove next stack if empty;
            }
        }
        return element;
    }
}


//*************** Test Code *******************************
//popAt(0)
var ss = new StackSet(3);
for (var i = 1; i <= 9; i++) {
    ss.push(i);
}
ss.print();
var el = ss.popAt(0);
console.log('popAt(0): ' + el);
el = ss.popAt(1);
console.log('popAt(1): ' + el);
el = ss.pop();
console.log('pop(): ' + el);
try {
    el = ss.popAt(2);
    console.log('popAt(2): ' + el);
}
catch (ex) {
    console.log('!!! ss.popAt(2) ' + ex.message);
}

while (true) {
    try {
        el = ss.pop();
        console.log('pop(): ' + el + ',' + ss.currentStackIdx());
    } 
    catch(ex) {
        console.log('!!! pop(): ' + ex.message);
        break;
    }
}

for (var i = 1; i <= 9; i++) {
    ss.push(i);
}
ss.print();
