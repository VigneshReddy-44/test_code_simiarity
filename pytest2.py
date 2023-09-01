def is_prime(number):
    if number <= 1:
        return False
    elif number <= 3:
        return True
    elif number % 2 == 0 or number % 3 == 0:
        return False
    i = 5
    while i * i <= number:
        if number % i == 0 or number % (i + 2) == 0:
            return False
        i += 6
    return True

add_numbers = lambda a, b: a + b

def find_max_of_three_numbers(x, y, z):
    return max(x, y, z)

num1 = 17
num2 = 23
sum_result = add_numbers(num1, num2)
print(f"The sum of {num1} and {num2} is {sum_result}")

num_to_check = 29
if is_prime(num_to_check):
    print(f"{num_to_check} is a prime number.")
else:
    print(f"{num_to_check} is not a prime number.")

num1 = 42
num2 = 68
num3 = 55
max_result = find_max_of_three_numbers(num1, num2, num3)
print(f"The maximum of {num1}, {num2}, and {num3} is {max_result}")
