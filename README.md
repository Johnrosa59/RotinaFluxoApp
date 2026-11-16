<div align="center">

# 🟠 Meus Hábitos Diários

**Aplicativo Android para criar, acompanhar e organizar seus hábitos do dia a dia.**

![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)
![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-4285F4?style=for-the-badge&logo=jetpackcompose&logoColor=white)
![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
![Room](https://img.shields.io/badge/Room-Database-FF6F00?style=for-the-badge)
![Hilt](https://img.shields.io/badge/Hilt-DI-34A853?style=for-the-badge)

</div>

---

## 📱 Preview

<div align="center">
  <img src="screenshots/home.png" alt="Tela principal do app" width="280"/>
</div>

> 💡 Crie a pasta `screenshots/` na raiz do projeto e coloque o print do app como `home.png`.

---

## 📖 Sobre o projeto

O **Meus Hábitos Diários** é um *Habit Tracker* simples e direto: você cadastra os hábitos que quer manter, marca como concluídos e remove os que não fazem mais sentido.

Os dados ficam salvos **localmente no dispositivo** com Room, então o app funciona **100% offline**.

O projeto foi construído com foco em **boas práticas de arquitetura**, separando responsabilidades em camadas para facilitar manutenção, testes e evolução.

---

## ✨ Funcionalidades

- ✅ Adicionar novos hábitos (ex.: *Beber 2L de água*)
- ☑️ Marcar hábitos como concluídos
- 🗑️ Excluir hábitos
- 💾 Persistência local com Room (os dados não se perdem ao fechar o app)
- 🌙 Interface moderna e responsiva com Jetpack Compose

---

## 🛠️ Tecnologias

| Tecnologia | Para que serve |
|---|---|
| **Kotlin** | Linguagem principal |
| **Jetpack Compose** | Interface declarativa |
| **Clean Architecture** | Separação do projeto em camadas |
| **MVVM** | Padrão de apresentação (View ↔ ViewModel) |
| **LiveData** | Estado observável pela UI |
| **Room** | Banco de dados local (SQLite) |
| **Hilt** | Injeção de dependência |

---

## 🏗️ Arquitetura

### Analogia: um restaurante 🍽️

| Camada | No restaurante | No app |
|---|---|---|
| **Presentation** | Garçom (conversa com o cliente) | Telas Compose + ViewModel |
| **Domain** | Receitas e regras da cozinha | Entidades, UseCases e contratos |
| **Data** | Despensa (onde ficam os ingredientes) | Room, DAO e implementação do repositório |

O garçom nunca entra na despensa: ele pede para a cozinha. Da mesma forma, a **UI nunca fala direto com o banco**.

### Fluxo dos dados

```mermaid
flowchart LR
    A[UI - Compose] -->|ação do usuário| B[ViewModel]
    B -->|chama| C[UseCase]
    C -->|usa| D[Repository - interface]
    D -.implementado por.-> E[RepositoryImpl]
    E --> F[(Room / DAO)]
    F -->|dados| E
    E --> C
    C --> B
    B -->|LiveData| A
```

### Regra de dependência

```mermaid
flowchart TB
    P[Presentation] --> D[Domain]
    DA[Data] --> D
```

> A camada **Domain** é o centro: ela **não conhece** Android, Room nem Compose.

---

## 📂 Estrutura de pastas

> Ajuste os nomes conforme o seu projeto.

```
app/
└── src/main/java/com/seupacote/habittracker/
    ├── data/
    │   ├── local/          # Database, DAO e Entity (Room)
    │   ├── mapper/         # Entity ↔ Model
    │   └── repository/     # Implementação do repositório
    │
    ├── domain/
    │   ├── model/          # Modelos de negócio (Habit)
    │   ├── repository/     # Interface do repositório
    │   └── usecase/        # Adicionar, listar, alternar e excluir hábito
    │
    ├── presentation/
    │   ├── ui/             # Telas e componentes Compose
    │   ├── theme/          # Cores, tipografia e tema
    │   └── viewmodel/      # ViewModels com LiveData
    │
    ├── di/                 # Módulos do Hilt
    └── HabitApplication.kt # @HiltAndroidApp
```

---

## 🚀 Como executar

### Pré-requisitos

- [Android Studio](https://developer.android.com/studio) (versão estável mais recente)
- JDK 17
- Emulador ou celular Android com depuração USB

### Passo a passo

1. **Clone o repositório**
   ```bash
   git clone https://github.com/Johnrosa59/NOME-DO-REPOSITORIO.git
   ```
2. **Abra no Android Studio**
   `File` → `Open` → selecione a pasta do projeto
3. **Aguarde o Gradle sincronizar**
4. **Execute o app**
   Selecione um emulador/dispositivo e clique em ▶️ **Run**

---

## 🧠 O que eu pratiquei neste projeto

- Organização de um app Android em camadas com **Clean Architecture**
- Gerenciamento de estado com **MVVM + LiveData**
- Injeção de dependência com **Hilt**
- Persistência local com **Room**
- Construção de UI declarativa com **Jetpack Compose**

---

## 👨‍💻 Autor

**João Vitor Rosa** — Desenvolvedor Android (Kotlin/Java)

[![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/Johnrosa59)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://linkedin.com/in/joaovitorrosa-dev-android)

---

<div align="center">

⭐ Se este projeto te ajudou ou inspirou, deixe uma estrela no repositório!

</div>
