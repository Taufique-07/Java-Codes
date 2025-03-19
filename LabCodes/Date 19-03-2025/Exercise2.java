
interface GFG {
    void learnCoding();
    void learnProgramming();
    void contribute();
}

abstract class $Student implements GFG {
    public void learnCoding() {
        System.out.println("Lets learn Coding");
    }
    public void learnProgramming() {
        System.out.println("Lets learn Programming");
    }
}

class GEEK extends $Student {
    public void contribute() {
        System.out.println("Contribute");
    }
}

public class Exercise2 {
    public static void main(String[] args) {
        GEEK geek = new GEEK();
        geek.learnCoding();
        geek.learnProgramming();
        geek.contribute();
    }
}
