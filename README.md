# Worker Income Calculator

## Descrição

Este é um sistema simples para cadastrar trabalhadores, seus contratos de trabalho e calcular a renda total do trabalhador em um mês específico.

## Funcionalidades

- Cadastro de trabalhador com nome, nível e salário base.
- Adição de contratos de trabalho (data, valor por hora e duração).
- Cálculo de renda do trabalhador para um mês específico.

## Como Usar

### Pré-requisitos

- Java 8 ou superior.

### Passos para Execução

1. Clone o repositório ou baixe o código.
2. Compile o código com `javac Main.java`.
3. Execute o programa com `java Main`.

### Exemplo de Execução

```plaintext
Enter the department's name:
HR
Enter worker data:
name:
John Doe
Level: 
MID_LEVEL
Base Salary:
3000
How many contracts to this worker?
2
Enter contract 1 data:
Date (DD/MM/YYYY): 
01/03/2025
Value per hour: 
50
Duration: 
8
Enter contract 2 data:
Date (DD/MM/YYYY): 
15/03/2025
Value per hour: 
60
Duration: 
10
Enter month and year to calculate income (MM/YYYY)
03/2025
Name: John Doe
Department: HR
Income for: 03/2025 3400.0

