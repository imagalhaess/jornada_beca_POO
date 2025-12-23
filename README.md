# ViaCEP API Client

[![Java](https://img.shields.io/badge/Java-17-blue.svg)](https://www.oracle.com/java/)
[![Maven](https://img.shields.io/badge/Maven-3.9-orange.svg)](https://maven.apache.org/)

Aplicação console em Java que consulta endereços via API ViaCEP usando arquitetura limpa com SRP (Single Responsibility
Principle).

## ✨ Funcionalidades

* ✅ Consulta CEP por API ViaCEP
* ✅ Validação rigorosa (8 dígitos numéricos)
* ✅ 4 tipos de tratamento de erro específico:
    * `InvalidParameter` - Formato inválido
    * `CepNotFound` - CEP não cadastrado
    * `IOException` - Problemas de rede
    * `InterruptedException` - Requisição interrompida
* ✅ Loop interativo com `Scanner`
* ✅ Saída formatada com `toString()` customizado
* ✅ Arquitetura limpa: `Main` + `Service` + `Model` + `Exceptions`

## 📱 Como usar

```bash
# Clone o projeto
git clone https://github.com/imagalhaess/viacep-java.git
cd viacep-java

# Execute
mvn clean compile exec:java -Dexec.mainClass="br.com.imagalhaess.viacep.MainViaCep"
```

**Exemplo de uso:**

```text
****** INICIANDO PROGRAMA ******
Digite o número do CEP para a busca ou 'sair' para encerrar.

> 01001000
✅ Dados{cep='01001-000', logradouro='Praça da Sé - Centro - São Paulo', bairro='Sé', estado='SP', erro=false}

> 99999999
❌ CEP não encontrado no nosso banco de dados.

> abc
❌ O CEP deve ter um total de 08 dígitos e conter apenas números de 0 a 9.

> sair
****** FINALIZANDO PROGRAMA ******
```

## 🏗️ Arquitetura

```text
br.com.imagalhaess.viacep/
├── MainViaCep.java          # Interface usuário (Scanner + while)
├── services/
│   └── ViaCepService.java   # HTTP + Gson + Validações
├── models/
│   └── Dados.java           # Record com toString()
└── exceptions/
    ├── InvalidParameter.java
    └── CepNotFound.java
```

## 🛠️ Tecnologias

| Tecnologia | Versão | Uso |
|------------|--------|-----|
| Java | 17+ | Backend |
| Maven | 3.9+ | Dependências |
| Gson | 2.10+ | JSON |
| HttpClient | Java 11+ | Requisições HTTP |

## 📋 Dependências Maven

```xml
<dependencies>
    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.10.1</version>
    </dependency>
</dependencies>
```

## 🎯 Aprendizado demonstrado

* ✅ OOP: Encapsulamento, exceções customizadas
* ✅ SRP: Separação clara de responsabilidades
* ✅ HTTP Client: Requisições assíncronas seguras
* ✅ JSON: Parsing com Gson
* ✅ Tratamento de erro: Exceções granulares
* ✅ Arquitetura limpa: Camadas bem definidas

## 🧪 Casos de teste implementados

| Teste | Entrada | Saída esperada |
|-------|---------|----------------|
| ✅ CEP válido | `01001000` | Endereço completo |
| ✅ CEP inexistente | `99999999` | `CepNotFound` |
| ✅ Formato inválido | `abc` | `InvalidParameter` |
| ✅ Saída do programa | `sair` | Encerra sem erro |

## 📄 API ViaCEP

* **Endpoint:** `https://viacep.com.br/ws/{CEP}/json/`
* **Formato:** Apenas 8 dígitos numéricos
* **Resposta erro:** `{"erro": "true"}`

## 🚀 Próximos passos planejados

* 🔄 Spring Boot REST API
* 🎨 Frontend React
* 💾 Banco PostgreSQL (cache)
* 🐳 Docker
* ✅ Testes unitários (JUnit)

## 📝 Autora

Desenvolvido por **Isabela Magalhães**

👩‍💻 Desenvolvedora Java Jr | Backend Developer  
💼 [LinkedIn](https://www.linkedin.com/in/isabela-magalhaes-se) | 💻 [GitHub](https://github.com/imagalhaess)

---

<div align="center">
  <img src="https://img.shields.io/badge/version-1.0.0-green.svg" alt="Version">
  <img src="https://img.shields.io/badge/status-developing-blue.svg" alt="Status">
</div>