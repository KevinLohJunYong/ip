/**
 * Parser class to parse user input
 */
public class Parser {
    /**
     *
     * @param line the command
     * @return a command
     * @throws InvalidCommandException when the command is not recognized
     */
    public static Command parseCommand(String line) {
        String[] inputs = line.split(" ");
        if(inputs[0].equals("list")) {
            return new ListCommand();
        }
        else if(inputs[0].equals("delete")) {
            return new DeleteCommand(Integer.parseInt(inputs[1]));
        }
        else if(inputs[0].equals("done")) {
            return new DoneCommand(Integer.parseInt(inputs[1]));
        }
        else if(inputs[0].equals("bye")) {
            return new ExitCommand();
        }
        else if(inputs[0].equals("deadline")) {
            return new DeadlineCommand(line);
        }
        else if(inputs[0].equals("todo")) {
            return new ToDoCommand(line);
        }
        else if(inputs[0].equals("event")) {
            return new EventCommand(line);
        }
        else return new InvalidCommand();
    }
}