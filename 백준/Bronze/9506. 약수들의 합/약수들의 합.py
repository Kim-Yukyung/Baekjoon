while True:
    num = int(input())
    if num == -1:
        break;
    
    divisors = list()

    for i in range(1, num//2+1):
        if num % i == 0:
            divisors.append(i)
        
    if sum(divisors) == num:
        expr = " + ".join(map(str, divisors))
        print(f"{num} = {expr}")
    else:
        print(f"{num} is NOT perfect.")
