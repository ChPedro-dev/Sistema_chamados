
## Fluxo de Trabalho (Git Flow)

Este é o ciclo de vida padrão para criar qualquer nova funcionalidade (feature) no sistema de forma isolada e profissional.

### Passo 1: Preparação (Atualizando a Base)
Sempre antes de começar algo novo, garanta que você está na branch principal e com o código mais recente do GitHub:
```bash
git checkout main
git pull origin main
```

### Passo 2: Criando a Nova Branch
Crie sua área de trabalho isolada. **Regra de ouro:** Nada de acentos, espaços ou caracteres especiais no nome!
```bash
git checkout -b feature/nome-da-tarefa
```

### Passo 3: Salvando o Trabalho (Local)
Fez o código da feature? Testou? Salve no histórico do Git:
```bash
git add .
git commit -m "Adiciona funcionalidade X"
```

### Passo 4: Enviando para a Nuvem
Suba a sua branch para o GitHub. (O `-u origin` só é obrigatório na primeira vez que for enviar esta branch):
```bash
git push -u origin feature/nome-da-tarefa
```

### Passo 5: Revisão e Merge (No site do GitHub)
1. Abra o repositório no navegador.
2. Clique no botão verde **Compare & pull request**.
3. Revise o código gerado.
4. Clique em **Merge pull request**.

### Passo 6: Atualização e Limpeza (Fim do ciclo)
Volte para o seu terminal, atualize sua `main` com o código recém-aprovado e apague a branch velha para manter o computador limpo:
```bash
# Volta para a main
git checkout main

# Puxa o código com o merge
git pull origin main

# Apaga a branch antiga
git branch -d feature/nome-da-tarefa
```

---

## 🛠️ Comandos de Sobrevivência (Git)
Caso se perca no terminal, use estes comandos:
* **`git status`**: Mostra em qual branch você está e quais arquivos foram alterados e ainda não salvos.
* **`git branch`**: Lista todas as branches locais. A que estiver com um `*` (geralmente verde) é onde você está agora.
* **`git log`**: Mostra o histórico de commits. Aperte a tecla `Q` para sair da visualização.