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


```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica()
    }

    class AparelhoTelefonico {
        +ligar(numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone2007 {
        -reprodutorMusical
        -aparelhoTelefonico
        -navegadorInternet
        +tocar()
        +pausar()
        +selecionarMusica()
        +ligar(numero)
        +atender()
        +iniciarCorreioVoz()
        +exibirPagina(url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    ReprodutorMusical <|-- iPhone2007
    AparelhoTelefonico <|-- iPhone2007
    NavegadorInternet <|-- iPhone2007
