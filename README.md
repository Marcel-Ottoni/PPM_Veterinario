# PPM_Veterinario
Nome: Marcel Ottoni de Oliveira

# Projeto
O projeto escolhido foi um código em Java que eu fiz para a matéria de Programação Orientada a Objetos no 3º Período do curso. A ideia era criar um projeto simples para veterinários, onde seria possível cadastrar um animal (armazenando ele em uma lista) e também podia procurar o animal pelo seu nome, para o projeto foi utilizado o Swing para fazer a interface.

# Possíveis melhorias
<h2>1° melhoria: Refatorar código: Interface(Factory)</h2>
As instâncias de criação das telas e da funcionalidade dos botões estão na classe Main. Sendo assim, daria para refatorar o código, criando uma novas subclasses e tornando o código mais organizado e eficiente:

![image](https://github.com/user-attachments/assets/0ed08fd6-18c4-41c7-bce8-59bbe40ad78a)

<h2>2ª melhoria: Encapsular as Funções das telas de cadastro (Strategy)</h2>
Nas classes da criação das telas dos cadastros (cadastro_anfibio, cadastro_aves, etc...) possuem a repetição de diversas funções. Logo, no meu projeto, poderia ser criado uma interface do "Strategy", o que deixaria o código mais flexivel e modular:

![image](https://github.com/user-attachments/assets/1f14a84c-05fa-4976-b921-6202af0b7220)


<h2>2ª melhoria: Singleton</h2>
O Singleton permite que você crie uma única instância e que ela possa ser chamada globalmente pelo projeto. A utilização do Singleton no meu trabalho, poderia ser implementado para a lista de animais, já que ela é chamada para o cadastro de cada animal e é chamada na tela de procura, facilitando a legibilidade do código

![image](https://github.com/user-attachments/assets/961d597f-6a74-4a43-ac90-6ca5627a28a3)

![image](https://github.com/user-attachments/assets/4b5fa23b-2ed8-4ce4-ba5b-85b3d7521bd2)


![image](https://github.com/user-attachments/assets/20771e12-ac8a-48c8-b2d2-4de5c5aa046b)

<h2>3ª melhoria: Builder</h2>
O Builder permite que você possa criar objetos mais complexos que exigem muitos parâmetros. No caso do meu projeto, para a criação dos animais exige o bastante informações, então na hora de cadastrar pode acabar confundindo na hora de ajustar alguma coisa no código, então o Builder pode servir para deixar mais modular e flexível:

![image](https://github.com/user-attachments/assets/a71b9a58-5d41-4117-8d60-90c8895ddd19)

![image](https://github.com/user-attachments/assets/c299d5b6-eeae-4dbd-9b84-63444aa8ba53)

Na hora do Cadastro, o código ficaria:

![image](https://github.com/user-attachments/assets/b6d1d855-7356-4d43-9e35-078aefbf6d6a)

<h2>4ª melhoria: Separar Funções do CRUD (Command)</h2>
A criação do Animal no sistema e sua busca estão todas sendo feitas na Main, deixando o código confuso e cheio de informação. Logo, uma forma de resolver esse problema pode ser com o Command, sendo necessário criar uma interface chamada "Command" e separar em uma outra classe uma função para o próprio cadastro e outra função para a exibição na tela de busca:

![image](https://github.com/user-attachments/assets/0ede7cc7-b294-4c25-87da-c1cf54500c3b)

![image](https://github.com/user-attachments/assets/177aade7-0e1a-4db3-89cb-cc16c18e9720)

