package AnonymousClass;

public class Button {
    private Clickable action;

    void setClickAction(Clickable action){
        this.action = action;
    }

    void onClick(){
        action.onClick();
    }
}
