package org.apache.struts.helloworld.action;

import org.apache.struts.helloworld.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private static int helloCount = 0;
	private MessageStore messageStore;
	private String userName;

	@Override
	public String execute() throws Exception {
		
		messageStore = new MessageStore();
		if (userName != null) {
            
		    messageStore.setMessage( messageStore.getMessage() + " " + userName);
		    
		}
		helloCount++;
		return SUCCESS;
	}
	
	public String getUserName() {
	    return userName;
	}
	 
	public void setUserName(String userName) {
	    this.userName = userName;
	}
	
	public int getHelloCount() {
		return helloCount;
	}

	public void setHelloCount(int helloCount) {
		HelloWorldAction.helloCount = helloCount;
	}

	public MessageStore getMessageStore() {
		return messageStore;
	}

	public void setMessageStore(MessageStore messageStore) {
		this.messageStore = messageStore;
	}

}
