Worker Income Calculator
Descrição
Este projeto é uma aplicação simples que permite cadastrar um trabalhador, seus contratos de trabalho por hora e calcular a sua renda total em um determinado mês. A aplicação utiliza a classe Scanner para ler dados do usuário e as classes Worker, Department, HourContract e WorkerLevel para estruturar as informações do trabalhador e seus contratos.

Funcionalidades
Cadastro de trabalhador com nome, nível de trabalho e salário base.

Adição de contratos de trabalho com data, valor por hora e duração.

Cálculo de renda total do trabalhador para um mês específico.

Como usar
Pré-requisitos
Java 8 ou superior.

IDE ou terminal para rodar o código Java.

Passos para execução
Clone ou baixe o código para sua máquina.

Compile e execute o arquivo Main.java.

Exemplo de execução
Ao rodar o programa, o usuário será solicitado a fornecer as seguintes informações:

Nome do departamento: O nome do departamento ao qual o trabalhador pertence.

Dados do trabalhador:

Nome do trabalhador.

Nível de trabalho (Escolha entre os valores disponíveis em WorkerLevel).

Salário base.

Contratos de trabalho: O número de contratos que o trabalhador possui. Para cada contrato, será necessário informar:

Data do contrato (formato DD/MM/YYYY).

Valor por hora.

Duração em horas do contrato.

Cálculo de renda: O mês e ano para o qual o cálculo da renda deve ser feito (formato MM/YYYY).

Exemplo de saída
plaintext
Copiar
Editar
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
Estrutura do Projeto
Main.java: Contém a lógica principal do programa, onde o trabalhador e seus contratos são cadastrados e a renda é calculada.

entities/Worker.java: Define a classe Worker que contém os dados do trabalhador.

entities/Department.java: Define a classe Department que contém o nome do departamento do trabalhador.

entities/HourContract.java: Define a classe HourContract que contém as informações de cada contrato de trabalho.

entities/enums/WorkerLevel.java: Define o enum WorkerLevel que especifica o nível de trabalho do trabalhador (EXPERIENCED, MID_LEVEL, JUNIOR).

Contribuindo
Sinta-se à vontade para abrir problemas ou enviar pull requests para melhorar este projeto.
