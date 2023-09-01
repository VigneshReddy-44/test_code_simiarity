def add_two_values(x, y):
    return x + y

def generate_fibonacci_sequence(length):
    fib_sequence = []
    a, b = 0, 1
    for _ in range(length):
        fib_sequence.append(a)
        a, b = b, a + b
    return fib_sequence

def calculate_factorial_of_number(num):
    if num < 0:
        return "Factorial is not defined for negative numbers."
    elif num == 0:
        return 1
    else:
        result = 1
        for i in range(1, num + 1):
            result *= i
        return result

value1 = 5
value2 = 7
addition_result = add_two_values(value1, value2)
print(f"The result of adding {value1} and {value2} is {addition_result}")

fibonacci_length = 10
fibonacci_sequence_result = generate_fibonacci_sequence(fibonacci_length)
print(f"The Fibonacci sequence of length {fibonacci_length} is {fibonacci_sequence_result}")

factorial_number = 6
factorial_result = calculate_factorial_of_number(factorial_number)
print(f"The factorial of {factorial_number} is {factorial_result}")
