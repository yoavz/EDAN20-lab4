package format;

/**
 *
 * @author pierre
 */
public class Constants {

    public final static String NIVRE_HOME = "/Users/yoav/school/EDAN20/lab4/corpus/";
    //public final static String NIVRE_HOME = "";
    /* public final static String TRAINING_SET = NIVRE_HOME + "train_mini.txt"; */
    public final static String TRAINING_SET = NIVRE_HOME + "train.txt";
    public final static String TEST_SET = NIVRE_HOME + "test.txt";
    public final static String TEST_SET_PARSED = NIVRE_HOME + "test_answers.txt";
    public final static String ARFF_FILE = NIVRE_HOME + "simple4.arff";
    public final static String ARFF_MODEL = NIVRE_HOME + "simple4.model";
    
    public final static String UTB_HOME = "/Users/pierre/Documents/Cours/EDAN20/corpus/universal_treebanks_v1.0/";
    public final static String TRAINING_SET_FR = UTB_HOME + "fr/fr-universal-train.conll";
    public final static String TRAINING_SET_ES = UTB_HOME + "es/es-universal-train.conll";
    
    public final static String SUBJECT = "SS";
    public final static String OBJECT = "OO";

    //public final static String SUBJECT = "nsubj";
    //public final static String OBJECT = "dobj";

    public static void main(String[] args) {
        // TODO code application logic here
    }
}
