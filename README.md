# RestWithSpringBoot
Douglas Ferreira

REST API's RESTFul do 0 à AWS Com Spring Boot 2.x e Docker, teacher Marcelo, grande fera.

Quer testar a calculadora?

De um git clone com o endereço acima do meu projeto. (Se tiver conhecimento pode usar o próprio terminal do Git bash).

Vai baixar um arquivo zip, decompacte ele.

No Eclipse JEE, clique em abrir um projeto maven existente.

Selecione a pasta que acabou de clonar.

Abra o projeto, em applicastion.properties altere a porta para uma mais conveniente, no caso eu estou usando a porta 8050.

Após subir o projeto, digite no browser:

http://localhost:8050/op/{Escolha o number one de 0 a 9}/{Escolha o number two de 0 a 9}/{Escolha a operação de 1 a 6}

switch(NumberConverter.convertToInt(numberThree)) {
		
			case 1:
				op = math.sum(x, y);
				break;
			case 2:	
				op = math.sub(x, y);
				break;
			case 3:
				op = math.mult(x, y);
				break;
			case 4:
				op = math.div(x, y);
				break;
			case 5:
				op = math.avg(x, y);
				break;
			case 6:
				op = math.sqrt(x, y);
				break;
			default:
				throw new UnsuportedMathOperationException("Please set a numeric value 1 to 6:");
			}

Exemplo:

http://localhost:8050/op/8/8/3

Neste caso eu vou multiplicar (Que é o case 3) os números 8 e 8

8 * 8 = 64.0


Obrigado.
Douglas
