package com.primeton.eos.spring.edas;

import com.eos.runtime.core.RuntimeEvent;
import com.primeton.spring.context.ApplicationContextFactory;

public class SpringContetEagerlyInitialization implements
		com.eos.runtime.core.IRuntimeListener {

	public void start(RuntimeEvent arg0) {
		System.out.println("==============Init Spring Context Start");
		ApplicationContextFactory.getContext();
		System.out.println("==============Init Spring Context End");
	}

	public void stop(RuntimeEvent arg0) {

	}
}
