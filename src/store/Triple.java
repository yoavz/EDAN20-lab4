package store;

public class Triple {

    // the central word
    String verb;

    // the SS head of the verb
    String subject; 

    // the OO head of the verb
    String object;

    public Triple(String subject, String verb) { 
        this.subject = subject;
        this.verb = verb;
        this.object = null;
    }

    public Triple(String subject, String verb, String object) { 
        this.subject = subject;
        this.verb = verb;
        this.object = object;
    }

    public boolean isComplete() {
        return (this.subject != null && this.verb != null && this.object != null);
    }

    public String getSubject() {
        return this.subject;
    }

    public String getVerb() {
        return this.verb;
    }

    public String getObject() {
        if (this.object == null)
            return "";
        else
            return this.object;
    }

    public void print() {
        if (isComplete())
            System.out.println("Subject: " + this.subject + ", Verb: " + this.verb + ", Object: " + this.object);
        else
            System.out.println("Subject: " + this.subject + ", Verb: " + this.verb);
    }
}
