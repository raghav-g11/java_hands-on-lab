package design_patterns;

public class FactoryDemo {

    interface Document { void open(); }

    static class PdfDocument implements Document {
        public void open() { System.out.println("PDF opened"); }
    }
    static class WordDocument implements Document {
        public void open() { System.out.println("Word opened"); }
    }
    static class ExcelDocument implements Document {
        public void open() { System.out.println("Excel opened"); }
    }

    abstract static class DocumentFactory {
        abstract Document createDocument();
    }

    static class PdfFactory extends DocumentFactory {
        Document createDocument() { return new PdfDocument(); }
    }
    static class WordFactory extends DocumentFactory {
        Document createDocument() { return new WordDocument(); }
    }
    static class ExcelFactory extends DocumentFactory {
        Document createDocument() { return new ExcelDocument(); }
    }

    public static void main(String[] args) {
        DocumentFactory f1 = new PdfFactory();
        DocumentFactory f2 = new WordFactory();
        DocumentFactory f3 = new ExcelFactory();

        f1.createDocument().open();
        f2.createDocument().open();
        f3.createDocument().open();
    }
}
