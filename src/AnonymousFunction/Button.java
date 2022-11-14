package AnonymousFunction;

public class Button {
    // Membuat attributes dari interface
    private Clickable action;

    void setClickAction(Clickable action) {
        this.action = action;
    }

    void doClick() {
        action.onClick();
    }


}
