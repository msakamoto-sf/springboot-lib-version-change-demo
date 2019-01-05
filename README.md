# springboot-lib-version-change-demo
springboot library version change demo

SpringBoot �ŁAspring-boot-dependencies �ŊǗ�����Ă��郉�C�u�����̃o�[�W�������ʂɏ㏑��������@�ɂ��Č��؂����T���v���ł��B

- �Q�l: 13.1 Dependency Management
  - https://docs.spring.io/spring-boot/docs/2.1.1.RELEASE/reference/htmlsingle/#using-boot-dependency-management

pom.xml����Tomcat��h2database�̃o�[�W�������J�X�^�}�C�Y���Ă��܂��B

```
	<properties>
		<java.version>1.8</java.version>
		<tomcat.version>9.0.14</tomcat.version>
		<h2.version>1.4.196</h2.version>
	</properties>
```

��Lversion�w����O������A�߂����肵�Ă݂āA�\�������o�[�W�������ǂ��ς�邩���Ă݂Ă��������B

�֘A�L�� :

- SpringBoot �̈ˑ����C�u�����̃o�[�W�������J�X�^�}�C�Y(Maven��) - Qiita
  - https://qiita.com/msakamoto_sf/items/2e416216a7e50849d87e

## ���s��

* 2019-01���_��Java8�œ���m�F���Ă��܂��B

## �J����

* AdoptOpenJDK 8 (jdk8u192-b12)
  * https://adoptopenjdk.net/
* Spring Tools 4 for Eclipse (Eclipse IDE 2018-12 R, 4.10�n)
  * https://spring.io/tools
* Maven >= 3.5.4 (maven-wrapper�ɂĎ����I��DL���Ă����)
* �\�[�X�R�[�h��e�L�X�g�t�@�C���S�ʂ̕����R�[�h��UTF-8���g�p

## �r���h�Ǝ��s

jar�t�@�C�����r���h���Ď��s���A http://localhost:18088/ �ɃA�N�Z�X���Ă��������B

```
cd springboot-lib-version-change-demo/

�r���h:
./mvnw package

jar�t�@�C��������s:
java -jar target/springboot-lib-version-change-demo-0.0.1-SNAPSHOT.jar
```

## Eclipse�v���W�F�N�g�p�̐ݒ�

https://github.com/SecureSkyTechnology/howto-eclipse-setup �� `setup-type2` ���g�p�BREADME.md�ňȉ����Q�Ƃ̂���:

* Clean Up/Formatter �ݒ�
* Git��clone����Maven�v���W�F�N�g�̃C���|�[�g
