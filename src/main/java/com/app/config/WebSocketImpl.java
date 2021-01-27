package com.app.config;

import java.net.http.WebSocket;
import java.nio.ByteBuffer;
import java.util.concurrent.CompletableFuture;

public class WebSocketImpl implements WebSocket {

	@Override
	public void abort() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getSubprotocol() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isInputClosed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isOutputClosed() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void request(long arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public CompletableFuture<WebSocket> sendBinary(ByteBuffer arg0, boolean arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompletableFuture<WebSocket> sendClose(int arg0, String arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompletableFuture<WebSocket> sendPing(ByteBuffer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompletableFuture<WebSocket> sendPong(ByteBuffer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CompletableFuture<WebSocket> sendText(CharSequence arg0, boolean arg1) {
		// TODO Auto-generated method stub
		return null;
	}

}
