# Tutorial - SPRING REST API
## _JPA, Hibernate, H2, Spring Rest_

[![N|Whatsapp](https://img.shields.io/badge/WhatsApp-25D366?style=for-the-badge&logo=whatsapp&logoColor=white)](https://wa.me/message/6ZKKFLDYGNCRO1)
[![N|Github](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/YanBarreto)

Este projeto servirá de espelho para outros projetos relacionados a desenvolvimento de API Rest  utilizando o Spring Data JPA.

![N|Languages](https://github-readme-stats.vercel.app/api/top-langs/?username=YanBarreto)

## Dependencias

Utilizarei o maven para gerenciar as dependencias do projeto com isso é necessário adicionar as seguintes dependencias no arquivo pom.xml com isso o maven irá ler o arquivo e baixar todas as dependencias necessárias para utilizar aquela biblioteca.
Atualmente o código possui as dependencias abaixo:
```sh
<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<scope>Runtime</scope>
		</dependency>
		<dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
		</dependency>
	</dependencies>
```

Caso após inserir as dependencias necessárias o IDE reclamar atualize o projeto maven clicando com o botão direito do mouse sobre o projeto e em seguida em Maven > Update Maven projetct ( No Eclipse ) 

> Certifique-se que as versões utilizadas solicitadas
> ao maven são compativeis com sua versão Java. 
> Recomendo copiar o codigo como o descrito acima e 
> deixar o maven fazer a escolha e gerenciamento das versões.

## JPA

Será necessário também popular o arquivo application.properties de acordo com o codigo abaixo:
```sh
# datasource 
spring.datasource.driverClassName=org.h2.Driver 
spring.datasource.url=jdbc:h2:mem:alura-forum
spring.datasource.username=sa
spring.datasource.password=

# jpa 
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect 
spring.jpa.hibernate.ddl-auto=update

# h2
spring.h2.console.enabled=true #H2 possibilita acessar o banco de dados via browser
spring.h2.console.path=/h2-console # Esta é a URI do H2. coloque http://server:port/h2-console
```

> Lembre-se que o JPA precisa que seja informado a classe dialeto
> do banco de dados em questão. E o metodo que utilizará no caso
"update" cria ou insere colunas e tabelas caso não exista.
> 

And of course Dillinger itself is open source with a [public repository][dill]
 on GitHub.

## Instalação

A configuração inicial foi feita completamente utilizando o Spring Initializr

![N|Solid](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)

> Nota: É necessário o development kit `JAVA 8`.

| Plugin | README |
| ------ | ------ |
| Java 8 | https://www.oracle.com/br/java/technologies/javase/jdk11-archive-downloads.html |
| Spring Initializr | https://start.spring.io/ |
| Maven | https://mvnrepository.com/|
| Eclipse | https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2021-06/R/eclipse-inst-jre-win64.exe |

