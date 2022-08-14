# LocalStack

### Abaixo irei descrever o passo-a-passo para iniciar o LocalStack, nesse exemplo irei utilizar o SQS para simular o envio de uma mensagem.

1 - Executar o docker-compose.yml abaixo.

```
version: '3.7'
services:
aws:
image: 'localstack/localstack'
container_name: 'localstack'
environment:
- SERVICES=sqs
  - DEFAULT_REGION=us-east-1
  - AWS_DEFAULT_REGION=us-east-1
  - AWS_ACCESS_KEY_ID=teste
  - AWS_SECRET_ACCESS_KEY=teste
  - DEBUG=1
  - DATA_DIR=/tmp/localstack/data
  ports:
  - '4566:4566'
```

2 - Executar no seu terminal o comando abaixo, para entrar no container do localstack.

```
docker exec -it localstack sh 
```

3 - Executar o comando abaixo para criar a fila dentro do localstack.

```
awslocal sqs create-queue --queue-name nome-da-sua-fila
```

Links úteis

```
https://localstack.cloud/
```

```
https://github.com/localstack/localstack
```

