# springboot-lib-version-change-demo
springboot library version change demo

SpringBoot で、spring-boot-dependencies で管理されているライブラリのバージョンを個別に上書きする方法について検証したサンプルです。

- 参考: 13.1 Dependency Management
  - https://docs.spring.io/spring-boot/docs/2.1.1.RELEASE/reference/htmlsingle/#using-boot-dependency-management

pom.xml中でTomcatとh2databaseのバージョンをカスタマイズしています。

```
	<properties>
		<java.version>1.8</java.version>
		<tomcat.version>9.0.14</tomcat.version>
		<h2.version>1.4.196</h2.version>
	</properties>
```

上記version指定を外したり、戻したりしてみて、表示されるバージョンがどう変わるか見てみてください。

関連記事 :

- SpringBoot の依存ライブラリのバージョンをカスタマイズ(Maven版) - Qiita
  - https://qiita.com/msakamoto_sf/items/2e416216a7e50849d87e

## 実行環境

* 2019-01時点でJava8で動作確認しています。

## 開発環境

* AdoptOpenJDK 8 (jdk8u192-b12)
  * https://adoptopenjdk.net/
* Spring Tools 4 for Eclipse (Eclipse IDE 2018-12 R, 4.10系)
  * https://spring.io/tools
* Maven >= 3.5.4 (maven-wrapperにて自動的にDLしてくれる)
* ソースコードやテキストファイル全般の文字コードはUTF-8を使用

## ビルドと実行

jarファイルをビルドして実行し、 http://localhost:18088/ にアクセスしてください。

```
cd springboot-lib-version-change-demo/

ビルド:
./mvnw package

jarファイルから実行:
java -jar target/springboot-lib-version-change-demo-0.0.1-SNAPSHOT.jar
```

## Eclipseプロジェクト用の設定

https://github.com/SecureSkyTechnology/howto-eclipse-setup の `setup-type2` を使用。README.mdで以下を参照のこと:

* Clean Up/Formatter 設定
* GitでcloneしたMavenプロジェクトのインポート
