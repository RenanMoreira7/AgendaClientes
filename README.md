# Mini CRM em Java (Console Application)

Projeto desenvolvido com o objetivo de consolidar os fundamentos de **Orientação a Objetos (POO)** e arquitetura de software em **Java puro**, simulando um sistema de gerenciamento de clientes e pedidos executado via terminal (CLI).

---

## Tecnologias e Conceitos Aplicados

* **Linguagem:** Java (JDK)
* **Pilares da POO:** Encapsulamento, Herança, Abstração e Polimorfismo.
* **Estruturas de Dados:** `List` (Java Collections Framework).
* **Modificadores:** Uso de atributos `static` para controle de autoincremento de IDs.
* **Arquitetura de Controle:** Separação de responsabilidades entre classes de domínio (`Cliente`, `Produto`, `Pedido`, `Agenda`) e interface de usuário via console.

---

## Funcionalidades da Aplicação

1. **Gestão de Clientes:**
    * Cadastro diferenciado para **Pessoa Física (PF)** com CPF e **Pessoa Jurídica (PJ)** com CNPJ e Razão Social.
    * Listagem polimórfica de clientes cadastrados.
    * Busca de clientes por documento utilizando contrato polimórfico.
2. **Catálogo de Produtos:**
    * Cadastro dinâmico de produtos com geração automática de ID sequencial (`static`).
3. **Criação de Pedidos:**
    * Associação de um pedido a um cliente cadastrado (com validação defensiva contra nulos).
    * Adição de múltiplos itens ao carrinho do pedido.
    * Cálculo automático do valor total acumulado (`calcTotal()`).

---

##  Como Executar o Projeto

Certifique-se de ter o **Java JDK** instalado em sua máquina.

1. Abra o terminal na pasta raiz do código-fonte (`src`):
   ```bash
   cd src