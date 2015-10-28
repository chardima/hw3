JCC = javac 

test: MyInteger.class MyChar.class Sequence.class Element.class
	$(JCC) test.java

MyInteger.class: Element.class
	$(JCC) MyInteger.java


MyChar.class: Element.class
	$(JCC) MyChar.java


Sequence.class: Element.class
	$(JCC) Sequence.java


Element.class: 
	$(JCC) Element.java


clean: 
	rm *.class
