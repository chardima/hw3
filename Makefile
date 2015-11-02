JCC = javac 

test: MyInteger.class MyChar.class Sequence.class Element.class LinkedList.class Node.class SequenceIterator.class
	$(JCC) test.java

MyInteger.class: Element.class
	$(JCC) MyInteger.java


MyChar.class: Element.class
	$(JCC) MyChar.java


Sequence.class: Element.class LinkedList.class
	$(JCC) Sequence.java

SequenceIterator.class: Sequence.class
	$(JCC) SequenceIterator.java


Element.class: 
	$(JCC) Element.java

LinkedList.class: Node.class
	$(JCC) LinkedList.java

Node.class: Element.class
	$(JCC) Node.java

clean: 
	rm *.class
