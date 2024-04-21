O Que Estudar: 





![Tópicos](https://github.com/amandaAlvesa/Estudos-Backend-Java/assets/108950028/c61d9947-e30d-42c6-a6af-17b139e048c8)



1- Injeção de Dependencias:

    O que é: 
      Objetos que fornecem depêndencias a outros objectos, depêndecia é um objeto que pode ser usado;
    
    Framework: 
      Principal responsável por injetar depêndencias em componentes declarados com @Component, como SpringBoot;
    
    Tipos de Injeção: 
           1-Injeção pelo construtor,
           2-Injeção pelo Setter e
           3-Injeção de Interface;
    
    Responsabilidade da Injeção: 
           1-Criar objetos,
           2-Saber quais classes precisam dos objetos e
           3-Fornecer esses objetos;
    
    Beneficios Da Injeção de Depêndencias:
           1-Ajuda em testes unitarios e
           2-Boilerplate é reduzido pelas depêndencias do campo injetor;
    
    Desvantanges:
      Muitos erros em tempo de compilção acabam em tempo de execução:
  
    Conclusão: 
      A Injeção de Depêndencias ajuda no baixo acoplamento e na manutenção do código;

2 - Estruturação de Projetos, Camadas:
    
    Alguns tipos de Camadas:
        Camada de Apresentação - interface gráfica.
        Camada de Negócios - lógica de negócios do sistema. 
        Camada de Persistência - salva o estado do objeto em algum lugar.
        
    Projeto em duas camadas:
        Camada Cliente: apresentação e da lógica de negócios;
        Camada Servidor: persistência de dados(SGBD).
        problemas na manutenção e falta de escalabilidade eram comuns.
        
    Projeto em três camadas:
        Camada de aplicação;
        Camada de persistência 
        Camada de apresentação;.
    

///lugares de estudo\\\
https://www.devmedia.com.br/construindo-projetos-em-camadas-usando-java/6418
https://www.youtube.com/watch?v=ta0q7OrVxIc
