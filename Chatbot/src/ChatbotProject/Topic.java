package ChatbotProject;

public interface Topic {

	boolean isTriggered(String response);
	void startChatting(String response);
}
