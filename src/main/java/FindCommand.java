public class FindCommand extends Command {
    String keyWord;
    public FindCommand(String keyWord) {
        this.keyWord = keyWord;
    }
    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public String getType() {
        return "find";
    }

    @Override
    public String getDescription() {
        return keyWord;
    }
}
