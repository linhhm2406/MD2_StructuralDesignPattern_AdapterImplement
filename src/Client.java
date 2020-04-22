public class Client {
    private FileCalculator fileCalculator;

    public Client(FileCalculator fileCalculator) {
        this.fileCalculator = fileCalculator;
    }

    public void pringFileSize(String path){
        long size = fileCalculator.calculateSize(path);
        System.out.println(size);
    }

}
