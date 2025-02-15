package seedu.address.model.group.exceptions;

/**
 * Signals that the operation is unable to find the specified group.
 */
public class GroupNotFoundException extends RuntimeException {
    public GroupNotFoundException() {
        super("The group that you are finding does not exist!");
    }
}
