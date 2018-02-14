package seedu.addressbook.commands;

import seedu.addressbook.data.person.ReadOnlyPerson;
import java.util.List;

/**
 * Sorts the address book
 */
public class SortCommand extends Command {

    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = "Sorts address book according to person's name, in lexicographical order.\n"
            + "Example: " + COMMAND_WORD;

    public SortCommand() {}

    @Override
    public CommandResult execute() {
        addressBook.sort();
        List<ReadOnlyPerson> allPersons = addressBook.getAllPersons().immutableListView();
        return new CommandResult(getMessageForPersonSortedShownSummary(allPersons), allPersons);
    }
}
