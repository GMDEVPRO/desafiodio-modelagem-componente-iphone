Modelagem e Diagramação de um Componente iPhone

Funcionalidades a Modelar
Reprodutor Musical
Métodos: tocar(), pausar(), selecionarMusica(String musica)
Aparelho Telefônico
Métodos: ligar(String numero), atender(), iniciarCorreioVoz()
Navegador na Internet
Métodos: exibirPagina(String url), adicionarNovaAba(), atualizarPagina()
Objetivo
Criar um diagrama UML que represente as funcionalidades descritas acima.
Implementar as classes e interfaces correspondentes em Java (Opcional).


+------------------------+
|     ReprodutorMusical   |  <------------------------+
+------------------------+                            |
| +tocar()               |                            |
| +pausar()              |                            |
| +selecionarMusica()    |                            |
+------------------------+                            |
                                                       |
+------------------------+                            |
|   AparelhoTelefonico   |  <------------------------+  
+------------------------+                            |
| +ligar(numero)         |                            |
| +atender()             |                            |
| +iniciarCorreioVoz()   |                            |
+------------------------+                            |
                                                       |
+------------------------+                            |
|    NavegadorInternet    |  <------------------------+
+------------------------+ 
| +exibirPagina(url)     |
| +adicionarNovaAba()    |
| +atualizarPagina()     |
+------------------------+
        |
        |
+------------------------+
|      iPhone2007         | 
+------------------------+
| -reprodutorMusical     |
| -aparelhoTelefonico    |
| -navegadorInternet     |
+------------------------+
| +tocar()               |
| +pausar()              |
| +selecionarMusica()    |
| +ligar(numero)         |
| +atender()             |
| +iniciarCorreioVoz()   |
| +exibirPagina(url)     |
| +adicionarNovaAba()    |
| +atualizarPagina()     |
+------------------------+
