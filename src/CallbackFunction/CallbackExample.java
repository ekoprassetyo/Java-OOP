package CallbackFunction;

// Create interface to handle click event for the callback method
interface ClickHandler{
    public void clickEventHandler();
}

// Create a class that handle the callback and implements the ClickHandler
class Handler implements ClickHandler {

    public void clickEventHandler() {
        System.out.println("Button is Clicking");
    }
}


// Create a class that generate the event
class ButtonClass {
    public void onClickEvent(ClickHandler obj) {
        obj.clickEventHandler();
    }

}

public class CallbackExample {
    public static void main(String[] args) {
        // Create an object of the ButtonClass
        ButtonClass button = new ButtonClass();

        // Create an object of the handler class
        Handler handlerObj = new Handler();

        // Pass the object of ClickHandler for performing the default operation
        button.onClickEvent(handlerObj);

        // Create another object of ButtonClass
        ButtonClass newButton = new ButtonClass();

        // Pass the interface to implement own operation
        newButton.onClickEvent(new ClickHandler() {
            @Override
            public void clickEventHandler() {
                System.out.println("A button is clicked");
            }
        });
    }
}
