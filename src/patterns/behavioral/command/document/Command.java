package patterns.behavioral.command.document;

public interface Command {
    void undo();

    void redo();
}
