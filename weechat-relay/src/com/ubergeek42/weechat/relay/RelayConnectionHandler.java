package com.ubergeek42.weechat.relay;

/**
 * Provides notifications about the connection with the server such as when a
 * connection is made or lost.
 * 
 * @author ubergeek42<kj@ubergeek42.com>
 * 
 */
public interface RelayConnectionHandler {
	/**
	 * Called when a connection to the server is established, and commands can
	 * begin to be sent/received.
	 */
	public void onConnect();

	/**
	 * Called when the server is disconnected, either through error, timeout, or
	 * because the client requested a disconnect.
	 */
	public void onDisconnect();
	
	/**
	 * Called when there is an error with the connection, and provides a message as a string.
	 * @param err - The error string
	 */
	public void onError(String err);
}
