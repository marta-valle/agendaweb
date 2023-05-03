<!mensagem_sucessomensagem_sucessoDOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Realize o seu login</title>
<!-- CSS do Bootstrap 5 -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css">
	
	    <script>
        function verificarSenha() {
            var senha = document.getElementById("senha").value;
            var confirmarSenha = document.getElementById("confirmarsenha").value;
            var mensagem = document.getElementById("mensagem");

            if (senha !== confirmarSenha) {
                mensagem.textContent = "As senhas não correspondem.";
            } else {
                mensagem.textContent = "";
            }
        }
    </script>
</head>
<body>
	<div
		class="container my-5 d-flex align-items-center justify-content-center">
		<div class="card mx-auto" style="max-width: 400px;">
			<div class="card-body">

				<h5 class="card-title text-center">Novo do Usuário</h5>

				<div class="text-center">
					<p>Para criar o seu cadastro, preencha os campos abaixo:</p>
				</div>
				<hr>	
				<div class="text-success text-center">
      			<h5>${mensagem_sucesso}</h5>
      			</div>
      	
      			<div class="text-danger text-center">
      			<h5>${mensagem_erro}</h5>
      			</div>
				<form class="d-grid gap-1" Method= "post" action="cadastroUsuario">
					
					<div class="mb-2">
						<label for="inputLogin" class="form-label">
						Informe o seu Nome
						</label>
						 <input
						 	type="text" class="form-control"
							id="nome" name="nome"
							placeholder="Digite aqui seu Nome Completo" required pattern="[A-Za-zÀ-Üà-ü\s]{8,150}+">
					</div>
					
					<div class="mb-2">
						<label for="inputLogin" class="form-label">
						Informe o seu Telefone:
						</label>
						 <input 
						 	type="text" class="form-control"
							id="telefone" name="telefone"
							placeholder="digite até 11 digitos" required pattern="[0-9]+$">
					</div>
					
					<div class="mb-2">
						<label for="inputLogin" class="form-label">
						Informe o seu Email:
						</label>
						 <input 
						 	type="email" class="form-control"
							id="email" name="email"
							placeholder="pessoa@dominio.com.br" required>
					</div>
					
					<div class="mb-2">
						<label for="inputSenha" class="form-label">
						 Informe o Login </label> 
						<input type="text" class="form-control" 
						id="login" name="login"
						placeholder="Digite aqui seu login" required>
					
					</div>
					
					<div class="mb-2">
						<label for="inputSenha" class="form-label">
						Crie uma Senha </label>
						<input type="password" class="form-control"
						id="senha" name="senha" placeholder="Digite aqui sua senha" required pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*]).{8,}"
						title="A senha deve conter no mínimo 6 caracteres, incluindo pelo menos uma letra maiúscula, uma letra minúscula e um número">
					</div>
					
					<div class="mb-2">
						<label for="inputSenha" class="form-label">
						Confirme sua Senha</label>
						<input type="password" class="form-control"
						id="confirmarsenha"name="confirmarsenha" placeholder="Confirme sua senha" required pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*]).{8,}"
						title="A senha deve ser igual a digitada acima">
					</div>
					
					<button type="submit" class="btn btn-primary text-center">Salvar</button>

					<div class="my-2">
						<hr>
						<div class="mt-1 text-center card-links">
							<p>
								<a href="/agendaweb">Retornar a página de autenticação</a> |
							</p>
							<p class="text-center">
								COTI Informática |<br /> JAVA WebDeveloper Formação FullStack
							</p>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
	<!-- JavaScript do Bootstrap 5 -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.min.js"></script>
</body>
</html>
