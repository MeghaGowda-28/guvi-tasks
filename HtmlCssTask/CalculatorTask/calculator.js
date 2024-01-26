function addToDisplay(value) {
    var display = document.getElementById('result');
    if (display.value.length < 28) {
        display.value += value;
    } else {
        alert('Maximum character limit reached.');
    }
}

function clearDisplay() {
    document.getElementById('result').value = '';
}

function deleteLast() {
    var currentValue = document.getElementById('result').value;
    document.getElementById('result').value = currentValue.slice(0, -1);
}

function removeTrailingZeros(str){
    return str.includes('.') ? str.replace(/(\.\d*?)0+$/, '$1').replace(/\.$/, '') : str;
}

function calculate() {
    try {
        const result = eval(document.getElementById('result').value);
        let formattedResult;
        if(Number.isInteger(result)){
            formattedResult = result.toString();
        }
        else{
            formattedResult = removeTrailingZeros(result.toFixed(3));
        }
        document.getElementById('result').value = formattedResult;
    } catch (error) {
        document.getElementById('result').value = 'Error';
    }
}

// Keyboard input
document.addEventListener('keydown', function (event) {
    const key = event.key;

    if (/^[0-9]$/.test(key) || key === '.' || key === '+' || key === '-' || key === '%' || key === '*' 
    || key === '/' || key === 'Enter' || key === 'Escape' || key === 'Backspace') {
        event.preventDefault();
        if (key === 'Enter') {
            calculate();
        } else if (key === 'Escape') {
            clearresult();
        } else if (key === 'Backspace') {
            deleteLast();
        } else {
            addToDisplay(key);
        }
    } else {
        alert('Only numbers and basic operators (+, -, *, /) are allowed.');
    }
});
