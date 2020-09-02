all: simple

Animal.class: /usr/bin/java ZooTest.java
	@javac -cp . Animal.java Mammal.java Reptile.java Bird.java Monkey.java Cat.java Chameleon.java Snake.java Finch.java Penguin.java ZooTest.java

simple: Animal.class
	@echo Running instance of the ZooTest system...
	@java ZooTest

clean:
	rm -rf *.class
