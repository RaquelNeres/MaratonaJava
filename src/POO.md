# Todos os conceitos de POO

## Classes e Objetos

![bg1.png](bg1.png)

```Java
Class Pessoa{
    String nome;
    char sexo;
    int idade;
    String cpf;
}

public static void main(String[] args) {
    Pessoa p1 = new Pessoa();
    p1.nome = "Hilario";
    p1.cpf = "123.456.789-00";
    p1.idade = 18;
    p1.sexo = "M";
}
```

## Metodos 

Função dentro da classe
![imagem.jpg](imagem.jpg)

```java
public class Pessoa {
  // Campos
  private String nome;
  private int idade;

  // Métodos
  public void saudacao() {
    System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
  }

  public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa("João", 30);
    pessoa1.saudacao();
  }
}
```

#### Reescrita de Metodos (Overrid)
![img_9.png](img_9.png)

![img_12.png](img_12.png)

#### [Sobrecarga de Metodos (Overload)](https://www.devmedia.com.br/sobrecarga-e-sobreposicao-de-metodos-em-orientacao-a-objetos/33066)
![img_10.png](img_10.png)

```java
public class calculadora{
 public int calcula( int a, int b){
    return a+b;
  }
  public double calcula( double a, double b){
     return a+b;
  }
   public String calcula( String a, String b){
     return a+b;
}
```

#### Basicamente
![img_11.png](img_11.png)

## Construtores

```java
// No main
Pessoa p1 = new Pessoa("Joao", 21)
```

```java
public class Pessoa {
  // Campos
  private String nome;
  private int idade;

  // Construtor
  public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }
```

## [Herança](https://porloca.wordpress.com/2011/06/28/ontem-hoje-e-sempre/) 
![img_7.png](img_7.png)
![img_6.png](img_6.png)
![img_8.png](img_8.png)

### Entrada de Dados
```java
import java.util.Scanner; // 1. Importar a classe Scanner

public class EntradaDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 2. Instanciar o Scanner
        
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine(); // 3. Ler String
        
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt(); // 4. Ler Inteiro
        
        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");
        
        sc.close(); // 5. Fechar o Scanner
    }
}
```

## Encapsulamento


## Array 


## Metodos estaticos


## Tratamento de Erros e Exceções


## Poliforfismo


## Coleções e Ordenação