package threads.journaldev_threads.wait_notify;

import java.util.concurrent.atomic.AtomicReference;

public class Message
{
	AtomicReference<String> atomicReference;

	public Message(String str){
		atomicReference = new AtomicReference<>(str);
	}

	public String getMsg() {
		return atomicReference.get();
	}

	public void setMsg(String str) {
		atomicReference.set(str);
	}
}