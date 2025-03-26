package com.example.myapplication

/*import com.example.myapplication.Pessoa.DesenvolvedorAdnroditivo
import com.example.myapplication.Pessoa.DevWebDevops
import com.example.myapplication.Pessoa.FuncionarioPublico
import com.example.myapplication.Pessoa.Jornallista*/
import java.util.Scanner

/*
//import com.example.myapplication.Passaro

//introducao paradigma funcional//

//classe carro//
*//*class Carro {

    var modelo = "Celta"

     //metodo para verificar o modelo do carro//
    fun verificarmodelo(){
        println("O modelo do carro é $modelo")

    }
}*//*

//funcao com retorno para isso usa-se apos os parenteses dois pontos e o tipo de retorno, caso nao tivesse nada apos o parentes, ela simplesmente ira execultar//
*//*
fun somar() : Int {
    return 2+2
}

fun main() {
  somar()

}*//*
//
//==================================== funcoes em linha, em line=========================================================
//fun subtarir() = println(10-8) // para utilizar poucas coisas, se usa essa funcao em linha
*//*
fun subtarir(): Int{
    return 10 - 8;
    }
fun main() {
   val retono = subtarir();
    println("o valor do retorno é $retono")
}*//*
//-------------------------------------fucoes; parametros nomeados e valor padrao--------------------------

*//*
fun somar(numero1 : Int, numero2 : Int,){
    println(numero1 + numero2);
}
fun main() {
    //abaixo basta digiitar o numero que ele automaticamente sera atribuida a respectiva variavel da funcao//
    somar(10, 50)
//    abaixo a funcao e nomeada, onde foi digitado manualmetne os parametros para serem atribuidos//
    somar(numero2 = 50, numero1 = 10)
}
*//*
// ==================================classes, objetos, propriedades e metod0os===================================
*//*

fun main() {
    val jogador = Jogador();
    jogador.carro = "Senna airton"
    jogador.acelerar(90)
    val poder = jogador.retonarPoder()
    println("O jogador tem o poder: $poder")
}

    class Jogador {
        var carro = ""
        var pneu = ""
        var planador = ""

        //metodo acelerar, metodo pertence a classe jogador, metodos servem para execultar uma acao;
        fun acelerar(aceleracaoatual : Int) {
            println("velocidade atual $aceleracaoatual")

            fun frear() {
                println("freando")
            }
        }
        fun retonarPoder() : String {
            return "Bola de fogo"
        }

    }
*//*

// =================================sobrecarga de metodos------------------------------------------
*//*

fun main() {
   val user = user()
    user.logar("joaopixi48050e@gmail.com " , "123456")
    user.logar("sennaitalo@gmail.com" , 999999)
    user.logar("7598128823")
}

class user {

    fun logar(email: String, senha: String) {
        println("logando com email $email e senha $senha")
    }
    //sobrecarga de metodos// abaixo se uso o mesmo metodo que esta acima, porem com parametros (tipo de dado diferentes)

    fun logar(email: String, senha: Int) {
        println("logando com email $email e senha do tipo int $senha")

    }
    fun logar(phonenumber: String) {
    println("logando com o numero $phonenumber")
    }
}*//*

*//*class Usuario(
    var nome: String = "",
    var sobrenome: String = "",
) {

    init {
        println("Objeto inicializando")
        println("O nome do usuário é $nome e o sobrenome é $sobrenome")
    }

    // Método para mostrar informações do usuário (Sobrecarga 1)
    fun mostrarInformacoes() {
        println("Informações do usuário: Nome = $nome, Sobrenome = $sobrenome")
    }

    // Método sobrecarregado para mostrar informações com uma mensagem adicional (Sobrecarga 2)
    fun mostrarInformacoes(mensagem: String) {
        println("$mensagem - Nome: $nome, Sobrenome: $sobrenome")
    }
    fun mostrarInformacoes(mensagem: Char,) {
        println("$mensagem Nome CHAR: $nome, Sobrenome: $sobrenome")
    }
    // Método irregardless para mostrar apenas o nome do usuario (Sobrecarga 3)
    fun mostrarInformacoes(onlyName: Boolean){
        if(onlyName){
            println("Nome: $nome")
        }
    }
}

fun main() {
    // Criando um objeto Usuario
    val usuario1 = Usuario("senna", "italo")

    // Usando a primeira sobrecarga (sem parâmetros adicionais)
    usuario1.mostrarInformacoes()

    // Usando a segunda sobrecarga (com mensagem)
    usuario1.mostrarInformacoes("Detalhes do usuário")

    //Usando a terceira sobrecarga (somente o nome)
    usuario1.mostrarInformacoes(true)

    //usando a quarta sobrecarga (somente o nome)
    usuario1.mostrarInformacoes('U')

}*//*
//----------------------------contrutor-------------------------------------------------------------
*//* // sem construtor
fun main() {
    val usuario = Usuario()
    usuario.nome = "senna"
    usuario.sobrenome = "italo"
    println("o nome do usuario é ${usuario.nome} e o sobrenome é ${usuario.sobrenome}")
}

class Usuario{
     var nome : String = ""
    var sobrenome: String = ""

}*//*
// com construtor

*//*
class Usuario(
    // Construtor Primário: define as propriedades básicas de um usuário
    var nome: String,        // Nome do usuário (obrigatório)
    var sobrenome: String,   // Sobrenome do usuário (obrigatório)
    var idade: Int? = null    // Idade do usuário (opcional, pode ser nulo)
) {
    // Construtor Secundário 1: apenas nome e sobrenome
    // Este construtor chama o construtor primário (this) e define a idade como nula (null) por padrão
    constructor(nome: String, sobrenome: String) : this(nome, sobrenome, null) {
        println("Construtor secundário 1 chamado: Apenas Nome e Sobrenome foram fornecidos.")
    }

    // Construtor Secundário 2: nome, sobrenome e idade como String
    // Este construtor chama o construtor primário (this) e converte a idade de String para Int (ou null se a conversão falhar)
    constructor(nome: String, sobrenome: String, idade: String) : this(
        nome,
        sobrenome,
        idade.toIntOrNull() // Tenta converter a String idade para Int, caso falhe retorna null.
    ) {
        println("Construtor secundário 2 chamado: Nome, Sobrenome e idade (como String) foram fornecidos.")
    }

    // Bloco de Inicialização (init): executa quando um objeto da classe é criado
    // Independente de qual construtor é utilizado, o bloco init sempre será executado
    init {
        println("Construtor primário ou delegado inicializado: Nome = $nome, Sobrenome = $sobrenome, Idade = $idade")
    }

    // Função para mostrar as informações do usuário
    fun mostrarInformacoes() {
        println("Informações do usuário: Nome = $nome, Sobrenome = $sobrenome, Idade = $idade")
    }
}

fun main() {
    // Usando o Construtor Primário (nome, sobrenome e idade)
    val usuario1 = Usuario("Senna", "Italo", 30)
    usuario1.mostrarInformacoes()

    // Usando o Construtor Secundário 1 (nome e sobrenome apenas)
    val usuario2 = Usuario("Maria", "Silva")
    usuario2.mostrarInformacoes()

    // Usando o Construtor Secundário 2 (nome, sobrenome e idade como String)
    val usuario3 = Usuario("João", "Pereira", "25")
    usuario3.mostrarInformacoes()
}*//*
// --------------------------------------------HERANCA -----------------------------------------------
// por padrao o kotlin desativa a relacao de  heranca das classes, se vocce quer estabelecer essa relacao se faz necessario colocar a palava Open no inicio da classe
*//*fun main() {
    val cao = Cao();
    cao.cor = "branco"
    cao.peso = 10.0
    cao.tamanho = "grande"
    cao.correr()
    cao.dormir()
    cao.latir()


    val passaro = Passaro();
    passaro.cor = "azul"
    passaro.peso = 5.0
    passaro.tamanho = "pequeno"
    passaro.correr()
    passaro.dormir()
    passaro.voar()
}
open class  Animal {
    var cor = "";
    var tamanho = "";
    var peso = 0.0;

  // se usa o open no metodo correr para que ele esteja acessivel dentro das subclasses que irao usa-lo
   open fun correr() {
      println("correr como um ")
    }

    open  fun dormir() {
        println("dormir como um ")
    }



    }
// o passo tem que extender da classe animal, para que consiga acessar os metodos que tem nela por meio da heranca,
// que e declarada apos a classe e da seguinte forma: class <nome da classe filha> : <nome da classe pai>
    class Passaro : Animal() {
        fun voar() {

        println("the bird is flying")
    }
    override fun dormir() {
        super.dormir()
        println("like a bird")

    }
    override fun correr() {
        super.correr()
        println("like a bird")
    }
}

    class Cao : Animal() {
        fun latir() {
            println("o cachorro esta latindo")

        }
        override fun dormir() {
            super.dormir()
            println("como um cao")
        }
        override fun correr() {
            super.correr()
            println("como um cao")
        }
    }*//*

//-=------------------------------------------classe completa vs classe abstrata-------------------------------------
*//*fun main() {
    val cao = Cao();
    cao.cor = "branco"
    cao.peso = 10.0
    cao.tamanho = "grande"
    cao.correr()
    cao.dormir()
    cao.latir()


    val passaro = Passaro();
    passaro.cor = "azul"
    passaro.peso = 5.0
    passaro.tamanho = "pequeno"
    passaro.correr()
    passaro.dormir()
    passaro.voar()
}



// ao colocar uma classe como abstata eu posso ver que nao mais e possivel instanciar a mesma, ex abaixo, vai dar erro na classe animal
// val animal = Animal(); // diferentemente se ela estivesse com o open ela poderia ser instanciada; se quiser acessar as propriedasde e metodos diretamnte, pode ficar como open
abstract class  Animal {
    var cor = "";
    var tamanho = "";
    var peso = 0.0;

  // se usa o open no metodo correr para que ele esteja acessivel dentro das subclasses que irao usa-lo
      abstract fun correr()

      abstract fun dormir()
//       acima sera delcarado como abstato
    *//**//*open  fun dormir() {
        println("dormir como um ")
    }*//**//*



    }
// o passo tem que extender da classe animal, para que consiga acessar os metodos que tem nela por meio da heranca,
// que e declarada apos a classe e da seguinte forma: class <nome da classe filha> : <nome da classe pai>
    class Passaro : Animal() {
        fun voar() {
        println("the bird is flying")
    }
    override fun dormir() {
        println("like a bird")

    }
    override fun correr() {
        println("like a bird")
    }
}

    class Cao : Animal() {
        fun latir() {
            println("o cachorro esta latindo")

        }
        override fun dormir() {
            println("dormindo como um cao")
        }
        override fun correr() {
            println("corrend como um cao")
        }
    }*//*
//------------------------------------------------MODIFICADORES DE ACESSO---------------------------------------\

//PUBLIC - VISIVEL EM QUALQUER LUGAR DO PROGRAMA
//PRIVATE - VISIVEL APEANS DENTRO DA CLASSE EM QUE ELE FOI CRIADO
//PROTECTED- VISIVEL APENAS DENTRO DA CLASSE OU SUBCLASSES DA CLASSE (AS CLASSES FILHAS)
//INTERNAL - VISIVEL DENTRO DE QUALQUER LUGAR DENTRO DE UM MODULO
// E CASO NAO SEJA DEFINIDO DENHUM MODIFICADOR DE ACESSO O PADRAO DELE SERA PUBLIC, TODA CLASSE POR PADRAO JA E PUBLICA

*//*
open class Carro { // classe pai

    var modelo = ""

    //    como esta privado nao pode ser acessado fora da classe carro, somente dentro da classe carro
//  private fun injecaoEletronicaInect() {} so e possivel acessa dentro da classe
//   se nao tivesse como protectec open, o override fun injecaoEletronicaInect nao teria acesso a ela
    protected open fun injecaoEletronicaInect() {
        println("injetando 1L/h")
    }

    //    o metodo injetando combustive esta como privado, logo ele so pode ser acessado quando estive dentro da classe carro,
//    ele pode ser exibido em outras classes do mesmo progrmaa, por meio da chamada do metodo acelerar, ja que ele chamado dentro do metodo acelerar da classe carro
    fun acelerar(speed: Int) {
        println("acelerando")
        injecaoEletronicaInect()

    }

    // para conseguir declara estabelecendo uma relacao de heranca
    class Gol : Carro() { // classe filha
        override fun injecaoEletronicaInect() {
        }
    }

    fun main() {

        val gol = Carro.Gol();
//    gol.modelo = "gol"
        gol.acelerar(100)
        println(gol.modelo)
    }
}
*//*
//---------------------------modificadores de acesso===modulos--------------------------------------*/
//Em resumo:
//
//    Atributos descrevem o que um objeto é (suas características).
//    Métodos descrevem o que um objeto pode fazer (suas ações).
//
/*class Pessoa(){
  var nome : String = "";
    fun saldar() : String {  // metodo que retorna uma string
        return "acenando"}
}


fun main() {

  val pessoa = Pessoa();
  // definindo o nome da pessoa
    pessoa.nome= "senna"
  // chamando o metodo saldar
    pessoa.saldar()
  //imprimindo o nome da pessoa que foi digitado no atributo nome;
    println(pessoa.nome)


  val pessoa2 = Pessoa();
  //implementando classe scanner para ler o nome da pessoa que foi digitado no teclado;
  val scanner = Scanner(System.`in`)
  println("digite o nome da pessoa") // solicita a entrada via teclado do nome
  pessoa2.nome = scanner.nextLine() // armazena a entrada do usuário no atributo nome da pessoa2
  pessoa2.saldar() // chama o método saldar da pessoa2
   // e necessario que a funcao seja declarada como string ou a variavel desejada para que seja possil imprimir o resultado
  println("${pessoa2.nome} esta ${pessoa2.saldar()}")  // imprime o nome da pessoa2 que foi digitado no teclado;

}*/
// como iremos criar uma relacao de heranca vamos colocar como abstract class Pessoa
// se a classe nao tiver como abstata ele nao sera acessivel a partir de outras classes


//=======================================INTERFACES=================================================



/*

fun main() {
  val desenvolvedorAdnroditivo = DesenvolvedorAdnroditivo();
  println("o desenvolvedor esta " + desenvolvedorAdnroditivo.comer()) //chamando o metodo comer da classe Pessoa que esta acessivel gracas esta como abtract
  desenvolvedorAdnroditivo.programar()
  println("-------------")


  val jornallista = Jornallista();
  println("o jornalista esta " + jornallista.comer())
  jornallista.reportar()
  println("O jornalista vai" + jornallista.seCandidatar())
  println("-------------")

  val funcionarioPublico = FuncionarioPublico();
  println("o funcionario esta " + funcionarioPublico.comer())
  funcionarioPublico.trabalhar()
  println("-------------")


  val devWebDevops = DevWebDevops();
  println("o desenvolvedor esta " + devWebDevops.comer())
  devWebDevops.deployar()
  println("O DevOps vai " + devWebDevops.seCandidatar())
  println("-------------")

// para que seja viavel usar interface, apos a declaracao da classe deve haver um hoverride fun, como abaixo
  // override fun seCandidatar() {
  //        println("candidatar-se a cargo politico")
  //      }
}

// apenas se eu declara que a classe herda da interface que eu tenho obrigacao de delcarar os metodos da interface, como por ex, jornalista de DevWebDevops
interface CandidatoApresidencia {
  fun seCandidatar() : String {
    return "se candidatar a cargo politico"
  }
}


abstract class Pessoa{

  fun comer() : String {


      return "esta comendo"
  }
  */
/*  // quando colocado como abstado o metodo, todas as classes filhas devem implementar o metodo obrigatoriamente

   abstract  fun seCandidatarCargoPolitico(){
      println("candidatar-se a cargo politico");
    }
  }
  *//*


// abaixo podemov verificar que a class DesenvolvedorAdnroditivo herda de pessoa
class DesenvolvedorAdnroditivo : Pessoa() {
  fun programar(){
    println("programando como um desenvolvedor adnroid")
  }

}
class FuncionarioPublico : Pessoa() {
  fun trabalhar(){
    println("trabalhando como um funcionario publico")
  }
}
  class Jornallista : Pessoa(), CandidatoApresidencia{ // Declara uma classe chamada Jornallista que herda da classe Pessoa e implementa a interface CandidatoApresidencia
    fun reportar(){ // cria uma função chamada reportar dentro da classe Jornallista
      println("reportando como um jornalista") // Imprime a mensagem "reportando como um jornalista" no console

    }
    override fun seCandidatar(): String { // Sobrescreve a função seCandidatar definida na interface CandidatoApresidencia
      // // Indica que a implementação desta função ainda não foi feita, para isso, se usa o printlin
      return "candidatar-se a cargo politico";
    }

  }


    class DevWebDevops : Pessoa(), CandidatoApresidencia {
    fun deployar(){
      println("deployando como um dev web devops")
    }

      override fun seCandidatar() : String {
        return "se candidatar a cargo politico"
      }
    }

}
*/

// ---------------------------------compenion object-------------------------------------------------
