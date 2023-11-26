package mainpkg;


public class Feedback {
    private final String feedbackTextArea;
    private final int userIDTextField;
    private final String usernameTextField1;

    public Feedback(String feedbackTextArea, int userIDTextField, String usernameTextField1) {
        this.feedbackTextArea = feedbackTextArea;
        this.userIDTextField = userIDTextField;
        this.usernameTextField1 = usernameTextField1;
    }

    public String getFeedbackTextArea() {
        return feedbackTextArea;
    }

    public int getUserIDTextField() {
        return userIDTextField;
    }

    public String getUsernameTextField1() {
        return usernameTextField1;
    }
    
}
