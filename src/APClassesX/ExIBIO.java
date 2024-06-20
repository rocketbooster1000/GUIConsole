package APClassesX;

import APClasses.APConsole;

class ExIBIO {
   private APConsole console = new APConsole("");

   public String input(String prompt) {
      this.console.println(prompt + ": ");
      return this.console.nextLine();
   }

   public String input() {
      return this.input("");
   }

   public String inputString(String prompt) {
      return this.input(prompt);
   }

   public char inputChar(String prompt) {
      this.console.print(prompt + ": ");
      return this.console.nextCharacter();
   }

   public boolean inputBoolean(String prompt) {
      this.console.print(prompt + ": ");
      return this.console.nextBoolean();
   }

   public byte inputByte(String prompt) {
      this.console.print(prompt + ": ");
      return this.console.nextByte();
   }

   public int inputInt(String prompt) {
      this.console.print(prompt + ": ");
      return this.console.nextInt();
   }

   public long inputLong(String prompt) {
      this.console.print(prompt + ": ");
      return this.console.nextLong();
   }

   public double inputDouble(String prompt) {
      this.console.print(prompt + ": ");
      return this.console.nextDouble();
   }

   public void output(String text) {
      this.console.print(text);
   }

   public void output(char text) {
      this.console.print(text);
   }

   public void output(boolean text) {
      this.console.print(text);
   }

   public void output(byte text) {
      this.console.print(text);
   }

   public void output(int text) {
      this.console.print(text);
   }

   public void output(long text) {
      this.console.print(text);
   }

   public void output(double text) {
      this.console.print(text);
   }
}
