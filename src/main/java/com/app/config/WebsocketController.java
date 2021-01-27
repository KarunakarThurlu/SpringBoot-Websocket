package com.app.config;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.WebSocket;
import java.util.Scanner;

import org.springframework.messaging.converter.MappingJackson2MessageConverter;
import org.springframework.messaging.simp.stomp.StompSessionHandler;
import org.springframework.scheduling.concurrent.ConcurrentTaskScheduler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.socket.client.WebSocketClient;
import org.springframework.web.socket.client.standard.StandardWebSocketClient;
import org.springframework.web.socket.messaging.WebSocketStompClient;

@RestController
@RequestMapping("/app")
public class WebsocketController {

	Runnable r=()->{
		 // TODO Auto-generated method stub
        URI uri;
        try {
            uri = new URI("ws://46.137.30.198:4001/graphql");
            //System.out.println("webSoekt Address : "+uri.toString());
            final WebsocketClientEndpoint clientEndPoint = new WebsocketClientEndpoint(uri);
            System.out.println("after clientEndPoint");
            // add listener
            clientEndPoint.addMessageHandler(new WebsocketClientEndpoint.MessageHandler() {
                public void handleMessage(String message) {
                    System.out.println(message);
                }
            });
            //System.out.println("add listener");
            // send message to websocket
            clientEndPoint.sendMessage("{'event':'addChannel','channel':'ok_btccny_ticker'}");
            //System.out.println("send");
            // wait 5 seconds for messages from websocket
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        } catch (URISyntaxException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		
	};

	@RequestMapping("/connect")
	public String  connectToWebSocket() {
		try {
			for(int i=0;i<2000;i++) {
				new Thread(r).start();
			}
		} catch (Exception e) {
			return e.getMessage().toString();
		}
		return "connect";
	}
}
