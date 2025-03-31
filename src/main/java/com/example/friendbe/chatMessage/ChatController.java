package com.example.friendbe.chatMessage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.friendbe.chatMessage.dto.ChatMessage;
import com.example.friendbe.chatMessage.dto.ChatRoom;
import com.example.friendbe.chatMessage.dto.ChatRoomJoin;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ChatController {
	
	@Autowired
    public ChatService chatService;

	// private final SimpMessageSendingOperations template;
	private final SimpMessagingTemplate template;


    @PostMapping("/chatList")
    public List<ChatRoom> chatList(@RequestBody ChatRoom crDto){
        return chatService.chatList(crDto);
    }
    @PostMapping("/chatMessageList")
    public List<ChatMessage> chatMessageList(@RequestBody ChatMessage cmDto){
        return chatService.chatMessageList(cmDto);  
    }
	//메시지 송신 및 수신, /pub가 생략된 모습. 클라이언트 단에선 /pub/message로 요청
    // @MessageMapping("/message")
    // public ResponseEntity<Void> receiveMessage(@RequestBody ChatMessage chat) {
    //     // 메시지를 해당 채팅방 구독자들에게 전송
    
    //     return ResponseEntity.ok().build();
    // }@DestinationVariable String title,
    @MessageMapping("/message/{title}")
    @SendTo("/sub/chatroom/{title}")
    public void receiveMessage(@DestinationVariable String title, @RequestBody ChatMessage chat) {
        // 여기서 chat 객체에 필요한 추가 로직을 수행할 수 있습니다.
        template.convertAndSend("/sub/chatroom/" + chat.getTitle(), chat);
        // return chat; // 반환된 메시지가 해당 채팅방의 구독자들에게 전송됩니다.
    }
    @PostMapping("/insertChat")
    public void insertChat(@RequestBody ChatMessage cmDto){
        chatService.insertChat(cmDto);
    }
    @PostMapping("/insertChatRoom")
    public void insertChatRoom(@RequestBody ChatRoom crDto){
        chatService.insertChatRoom(crDto);
    }
    @PostMapping("/insertChatRoomJoin")
    public void insertChatRoomJoin(@RequestBody ChatRoomJoin crjDto){
        chatService.insertChatRoomJoin(crjDto);
    }

}