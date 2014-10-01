package store;

import java.util.*;

class TripleStruct implements Comparable<TripleStruct> {
    Triple t;
    int freq;

    TripleStruct(Triple t, int freq) {
        this.t = t;
        this.freq = freq;
    }
    
    public int getFrequency() {
        return this.freq;
    }

    public Triple getTriple() {
        return this.t;
    }

    @Override
    public int compareTo(TripleStruct t) {
        return (t.getFrequency() - freq);
    }
}

public class TripleStore {

    ArrayList<Triple> triples;
    Map<String, Integer> frequency;

    public TripleStore() {
        triples = new ArrayList<Triple>();
        frequency = new HashMap<String, Integer>();
    }

    public void add(Triple t) {
        triples.add(t);

        String key = t.getSubject() + " " + t.getVerb() + " " + t.getObject();
        if (frequency.containsKey(key)) {
            frequency.put(key, frequency.get(key) + 1);
        } else {
            frequency.put(key, 1); 
        }
    }

    public void frequentPairs() {
        ArrayList<TripleStruct> to_sort = new ArrayList<TripleStruct>();        

        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            String[] parts = entry.getKey().split("\\s+");
            to_sort.add(new TripleStruct(new Triple(parts[0], parts[1], parts[2]), entry.getValue())); 
        }

        Collections.sort(to_sort);

        for (int i=0; i<5; i++) {
            to_sort.get(i).getTriple().print();
            System.out.println(to_sort.get(i).getFrequency());
        }
    }
}
