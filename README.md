# PPM_Veterinario
Nome: Marcel Ottoni de Oliveira

# Projeto
O projeto escolhido foi um código em Java que eu fiz para a matéria de Programação Orientada a Objetos no 3º Período do curso. A ideia era criar um projeto simples para veterinários, onde seria possível cadastrar um animal (armazenando ele em uma lista) e também podia procurar o animal pelo seu nome, para o projeto foi utilizado o Swing para fazer a interface.

# Possíveis melhorias
<h2>1ª melhoria: Separar Responsabilidades</h2>
As instâncias de criação das telas, da funcionalidade dos botões, criação da lista e do animal estão tudo no Main.java:

![image](https://github.com/user-attachments/assets/0ed08fd6-18c4-41c7-bce8-59bbe40ad78a)

Sendo assim, para tornar o código menos poluido e mais fácil para uma possível manutenção, daria para criar outras classes específicas para: <b>interface, outra classe para as ações do botão e outra para a criação do animal</b>

<h2>2ª melhoria: Singleton</h2>
O Singleton permite que você crie uma única instância e que ela possa ser chamada globalmente pelo projeto. A utilização do Singleton no meu trabalho, poderia ser implementado para a lista de animais, já que ela é chamada para o cadastro de cada animal e é chamada para na tela de procura deles

![image](https://github.com/user-attachments/assets/961d597f-6a74-4a43-ac90-6ca5627a28a3)

![image](https://github.com/user-attachments/assets/4b5fa23b-2ed8-4ce4-ba5b-85b3d7521bd2)


![image](https://github.com/user-attachments/assets/20771e12-ac8a-48c8-b2d2-4de5c5aa046b)

<h2>3ª melhoria: Builder</h2>
O Builder permite que você possa criar objetos mais complexos que exigem muitos parâmetros. No caso do meu projeto, para a criação dos animais exige o bastante informações, então na hora de cadastrar pode acabar confundindo na hora de ajustar alguma coisa no código, então o Builder pode servir para deixar mais modular e flexível:

![image](https://github.com/user-attachments/assets/a71b9a58-5d41-4117-8d60-90c8895ddd19)

![image](https://github.com/user-attachments/assets/c299d5b6-eeae-4dbd-9b84-63444aa8ba53)

Na hora do Cadastro, o código ficaria:

![image](https://github.com/user-attachments/assets/b6d1d855-7356-4d43-9e35-078aefbf6d6a)
