# Lab05-MundoDeWumpus
# MC322

# Alunos
* Nome: Larissa Okabayashi RA:247220
* Nome: Gabriel Mikio RA: 248295

# Curso
* 34 - Engenharia da Computação
* 42 - Ciência da Computação


# Decisões sobre arquitetura 
* De modo a atender o critério número 4 de explorar ao máximo o encapsulamento, grande parte do atributos foram declarados como privados e foi implementado métodos para acessar seus valores, tal como a imagem abaixo mostra

![2022-05-19 (6)](https://user-images.githubusercontent.com/82288999/169311729-59d55bfb-362a-48dd-ab0a-b7d76c0d0f95.png)

* De modo a atender o critério número 6 de tornar a arquitetura fácil de ser expandida, foi utlizado a sobrecarga de métodos na função conectaComponente, desse modo dependendo do parâmetro passado para essa função um componente diferente é conectado a caverna, e caso mais componentes surjam, basta implementar a função com o tipo do novo componente.

![2022-05-19 (9)](https://user-images.githubusercontent.com/82288999/169312848-832c53b8-f31d-4ba3-bdc2-94c1ec8f8bac.png)

* Outra escolha feita pelo grupo foi agrupar todos os componentes numa pasta, assim o critério número 6  é atendido novamente, pois caso haja a adição de mais componentes, agrupá-los numa página deixa o código mais organizado e escalável

* Foi criada um classe chamada printUtils de modo a tornar a arquitetura fácil de ser expandida, assim atendendo ao critério 6, isso porque ao criá-la, delegamos as tarefas de impressão para uma única classe, a qual será responsável por essa tarefa específica, tornando o código mais organizado e escalável

![2022-05-19 (12)](https://user-images.githubusercontent.com/82288999/169321167-0ec93d2b-852d-49bd-a7a3-0061bdb1bcfa.png)

