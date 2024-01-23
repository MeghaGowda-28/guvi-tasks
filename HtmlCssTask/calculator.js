function addToDisplay(value) {
    document.getElementById('display').value += value;
}

function clearDisplay() {
    document.getElementById('display').value = '';
}

function deleteLast() {
    var currentValue = document.getElementById('display').value;
    document.getElementById('display').value = currentValue.slice(0, -1);
}

function removeTrailingZeros(str){
    return str.includes('.') ? str.replace(/(\.\d*?)0+$/, '$1').replace(/\.$/, '') : str;
}

function calculate() {
    try {
        const result = eval(document.getElementById('display').value);
        let formattedResult;
        if(Number.isInteger(result)){
            formattedResult = result.toString();
        }
        else{
            formattedResult = removeTrailingZeros(result.toFixed(3));
        }
        document.getElementById('display').value = formattedResult;
    } catch (error) {
        document.getElementById('display').value = 'Error';
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
            clearDisplay();
        } else if (key === 'Backspace') {
            deleteLast();
        } else {
            addToDisplay(key);
        }
    } else {
        alert('Only numbers and basic operators (+, -, *, /) are allowed.');
    }
});
