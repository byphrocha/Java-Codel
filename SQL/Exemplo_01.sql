USE codel_03;
CREATE TABLE IF NOT EXISTS cursos(
	id_curso INT AUTO_INCREMENT PRIMARY KEY,
    nome_curso VARCHAR (50) NOT NULL UNIQUE,
	descricao TEXT,
	carga INT UNSIGNED,
	Taulas INT UNSIGNED,
	ano YEAR DEFAULT '2023'
)DEFAULT CHARSET = utf8mb3;

INSERT INTO `cursos` VALUES (1,'HTML5','Curso de HTML5',40,37,2021),(2,'Algoritmos','Lógica de Programação',20,15,2020),(3,'Photoshop','Dicas de Photoshop CC',10,8,2022),(4,'PHP','Curso de PHP para iniciantes',40,20,2023),(5,'Java','Introdução à Linguagem Java',40,29,2020),(6,'MySQL','Bancos de Dados MySQL',30,15,2020),(7,'Word','Curso completo de Word',40,30,2022),(8,'Python','Curso de Python',40,18,2020),(9,'POO','Curso de Programação Orientada a Objetos',60,35,2020),(10,'LINUX','Curso do SISTEMA Operacional',60,20,2021),(11,'Responsividade','Curso de Responsividade',30,15,2019),(12,'C++','Curso de C++ com Orientação a Objetos',40,25,2020),(13,'C#','Curso de C#',30,12,2020),(14,'Android','Curso de Desenvolvimento de Aplicativos para Android',60,30,2021),(15,'JavaScript','Curso de JavaScript',35,18,2020),(16,'PowerPoint','Curso completo de PowerPoint',30,12,2020),(17,'Swift','Curso de Desenvolvimento de Aplicativos para iOS',60,30,2021),(18,'Hardware','Curso de Montagem e Manutenção de PCs',30,12,2022),(19,'Redes','Curso de Redes para Iniciantes',40,15,2019),(20,'Segurança','Curso de Segurança',15,8,2020),(21,'SEO','Curso de Otimização de Sites',30,12,2021),(22,'Premiere','Curso de Edição de Vídeos com Premiere',20,10,2023),(23,'After Effects','Curso de Efeitos em Vídeos com After Effects',20,10,2021),(24,'WordPress','Curso de Criação de Sites com WordPress',60,30,2020),(25,'Joomla','Curso de Criação de Sites com Joomla',60,30,2019),(26,'Magento','Curso de Criação de Lojas Virtuais com Magento',50,25,2023),(27,'Modelagem de Dados','Curso de Modelagem de Dados',30,12,2020),(28,'HTML4','Curso Básico de HTML, versão 4.0',20,9,2023),(29,'PHP7','Curso de PHP, versão 7.0',40,20,2020),(30,'PHP4','Curso de PHP, versão 4.0',20,10,2022),(31,'Internet2','Curso para navegação',25,12,2021),(32,'Intranet2','Curso de ambientação de redes internas',30,15,2020),(33,'LibreOffice','Curso do pacote Libre Office',50,20,2023),(34,'Arduino2','Curso introdução ao arduino',40,20,2024),(35,'Corel9','Curso de Corel Draw',50,25,2024),(36,'Web Designer','Curso internet WEB',50,25,2023),(37,'Lógica','Curso de lógica de programação',30,15,2021),(38,'Android1','Curso de programação Android',50,20,2020),(39,'Auto Cad','Curso introdução ao CAD',30,15,2023),(40,'SQL','Curso de Banco de dados MySQL',50,20,2022);
select * from cursos where carga >= '30' and carga < '60';
select nome_curso, ano from cursos where Taulas > '30';
select id_curso, nome_curso from cursos where id_curso > '10' and id_curso <'20'; 
select nome_curso, descricao from cursos where carga = '50' or carga ='30';
select * from cursos where ano != '2020';
select * from cursos where ano <> '2020';
select * from cursos where ano > '2020' or ano < '2020';
select * from cursos where not ano = '2020';
select * from cursos where Taulas > '20';
select nome_curso, descricao, ano from cursos where ano = '2019' or ano = '2023' or ano = '2024';
 