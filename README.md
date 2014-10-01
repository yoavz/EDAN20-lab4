Lab 4: Extraction of subject-verb-object triples 
======================
Report by ***Yoav Zimmerman*** for EDAN20 Fall 2014

Introduction
------------

In previous labs, we have used linguistic inspired analysis to tag words by their part of speech tag, and even chunk multiple words into groups. But these techniques still miss some important lexical information about the words we are trying to parse. In this lab, we will use the **dependency relations** to extract triples from a training set. Dependency relations are how words or groups of words are semantically related to one another. They can be visualized like so:

![](http://i.imgur.com/TnC7Lit.png)

In the above image, a sentence is seperated into seven tokens and these tokens are related as visualized by the arrows. Each arrow is tagged with a dependency relation; one we are interested in is `SS`, meaning subject. The above relation between token 1 and 2 can be stated as "`Är` is the subject of `den`".

For this lab, the tagged and annotated CONLL-X training data set was used. This data set consisted of about 200,000 words, where each word was tagged with 10 different fields, including the dependency relation to some other word in it's sentence. We also used the open source program _What's wrong with my NLP_ to visualize dependency relations, as is shown in the image above.

Extracting Subject-Verb pairs
-----------------------------

The first task was to attempt to extract every subject verb pair, as defined by the `SS` dependency relation. To implement this, a Triple class (although at this point it was more of a Double) was written to keep track of the pairs together with a HashMap of their frequencies. To count all the pairs, the list of words was iterated through and a Triple created everytime the `SS` relation was detected. A total of 18,885 subject-verb pairs were discovered by the program. The following were the five most frequent and their respective frequencies:

```
Subject: det, Verb: är
319
Subject: som, Verb: är
210
Subject: man, Verb: kan
207
Subject: Det, Verb: är
198
Subject: man, Verb: har
130
```

Extracting Subject-Verb-Object triples
--------------------------------------

Extracting the triples required a little more work. The program was refined to, on encountering an `SS` relation, iterate an additional time through the sentence and find if any other word contained an `OO` relation to the same verb. In addition, a TripleStore class was written to help keep track of the frequencies and triples. A total of 5,844 triples were found. The following were the five most frequent and their respective frequencies:

```
Subject: man, Verb: gifter, Object: sig
29
Subject: jag, Verb: tycker, Object: är
25
Subject: Jag, Verb: tror, Object: är
19
Subject: Man, Verb: vänder, Object: sig
18
Subject: som, Verb: ingått, Object: äktenskap
17
```
