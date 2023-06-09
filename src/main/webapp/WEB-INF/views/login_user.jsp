<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Realize o seu login</title>
<!-- CSS do Bootstrap 5 -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css">
<!-- Carregando informa��es do CSS -->	
<link rel="stylesheet"
	href="agendaweb/src/main/webapp/resouces/style.css">	
</head>

<body>
	<div class="container my-5 d-flex align-items-center justify-content-center">
		<div class="card mx-auto" style="max-width: 400px;">
			<div class="card-body">

				<h5 class="card-title text-center">
					Autentica��o do Usu�rio
				</h5>

				<div class="text-center">
					<p>Para iniciar a sess�o, preencha os campos abaixo:</p>
				</div>

				<hr>

				<form class="d-grid gap-1">
					<div class="mb-2">
						<label for="inputLogin" class="form-label">Informe o seu Email ou o seu Login</label>
						<input type="text" class="form-control" id="email" name="email"
							placeholder="Digite aqui seu email/usuario cadastrado" required>
						</div>

					<div class="mb-2">
						<label for="inputSenha" class="form-label"> Informe a sua Senha </label>
						<input type="password" class="form-control" id="senha" name="senha"
							placeholder="Digite aqui sua senha" required>
					</div>

					<button type="submit" class="btn btn-primary text-center">Entrar</button>

					<div class="my-2">
						<hr>
						<div class="mt-1 text-center card-links">
							<p>
								<a href="/agendaweb/register_user">Criar Cadastro</a> |
								<a href="/agendaweb/nova_senha">Criar nova senha</a>
							</p>
							<p class="text-center">COTI Inform�tica |<br /> JAVA WebDeveloper Forma��o FullStack</p>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
	<!-- JavaScript do Bootstrap 5 -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.min.js"></script>
</body>
</html>
