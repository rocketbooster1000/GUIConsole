package APClassesX;

public class InputOutput {
    private ExIBIO console;
    /**
     * InputOutput -> expanded IBIO
     * cout() -> new line method
     * singleton architechture
     */

     
    private static volatile InputOutput instance = null;

    private InputOutput(){
        console = new ExIBIO();
    }
    
    public void cout(Object o){
        console.output(o.toString());
    }

    public void cout(double d){
        console.output(d);
    }

    public void cout(int n){
        console.output(n);
    }

    public void cout(long l){
        console.output(l);
    }

    public void cout(char c){
        console.output(c);
    }

    public void cout(boolean b){
        console.output(b);
    }

    public void cout(byte b){
        console.output(b);
    }

    public void cout(short s){
        console.output(s);
    }
    
    public void coutln(Object o){
        console.output(o.toString());
        console.output("\n");
    }

    public void coutln(double d){
        console.output(d);
        console.output("\n");
    }

    public void coutln(int n){
        console.output(n);
        console.output("\n");
    }

    public void coutln(long l){
        console.output(l);
        console.output("\n");
    }

    public void coutln(char c){
        console.output(c);
        console.output("\n");
    }

    public void coutln(boolean b){
        console.output(b);
        console.output("\n");
    }

    public void coutln(byte b){
        console.output(b);
        console.output("\n");
    }

    public void coutln(short s){
        console.output(s);
        console.output("\n");
    }

    public void coutln(){
        console.output("\n");
    }

    public String getString(String prompt){
        return console.input(prompt);
    }

    public String geString(){
        return this.getString("String");
    }

    public double getDouble(String prompt){
        return console.inputDouble(prompt);
    }

    public double getDouble(){
        return this.getDouble("Double");
    }

    public int getInt(String prompt){
        return console.inputInt(prompt);
    }

    public int getInt(){
        return this.getInt("Int");
    }

    public byte getByte(String prompt){
        return console.inputByte(prompt);
    }

    public byte getByte(){
        return this.getByte("Byte");
    }

    public long getLong(String prompt){
        return console.inputLong(prompt);
    }

    public long getLong(){
        return this.getLong("Long");
    }

    public boolean getBool(String prompt){
        return console.inputBoolean(prompt);
    }

    public boolean getBool(){
        return this.getBool("Boolean");
    }

    public char getChar(String prompt){
        return console.inputChar(prompt);
    }

    public char getChar(){
        return this.getChar("Char");
    }
    
    public static InputOutput getInstance(){
        if (instance == null){
            synchronized(InputOutput.class) {
                if (instance == null){
                    instance = new InputOutput();
                }
            }
        }
        return instance;
    }
}
