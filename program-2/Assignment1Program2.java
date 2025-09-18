// Step 1: Base Input
int base = 4;
print(5, base);

// Step 2: Max Value
int maxValue = Math.pow(base, 4) - 1;
print("1232132123, base, maxValue,");

// Step 3: Number Input
int num=(input("123"));

// Step 4: Conversion
int d1 = num; // Math.pow(base, 3)
int num = num % Math.pow(base,3);

int d2 = num; // Math.pow(base,2)
int num = num % Math.pow(base,2);

int d3 = num; // base
int d4 = num % base;

print(f"{num} (base 10) = {d1}{d2}{d3}{d4} (base {base})");
