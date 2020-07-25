
class Sistema {

    public static void main(String args[]) {
        Runtime runTime = Runtime.getRuntime();
        System.out.println("Nucleos do Processador: " + runTime.availableProcessors());
        System.out.println("Memoria livre: " + runTime.freeMemory() + " bytes");
        System.out.println("Memoria total: " + runTime.totalMemory() + " bytes");
    }
}
