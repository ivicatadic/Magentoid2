package com.ivica.magentoid.core;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

public class Model {

	protected static Client client = MagentoidApp.client;
	protected static Serializer serializer = new Persister();

}
