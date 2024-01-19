package AssessmentDay4;

public abstract class CustomFile {
    String extension;

    public abstract void readFile();

    public String getExtension() {
        return this.extension;
    };
}
