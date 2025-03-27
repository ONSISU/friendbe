package com.example.friendbe.chatMessage;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.friendbe.chatMessage.dto.ChatMessage;
import com.example.friendbe.chatMessage.dto.ChatRoom;
import com.example.friendbe.chatMessage.dto.ChatRoomJoin;

@Service
public class ChatService {
	
	private final ChatRepository chatRepository;
	public ChatService(ChatRepository chatRepository) {
        this.chatRepository = chatRepository;
    }

//	채팅방 목록
	public List<ChatRoom> chatList(ChatRoom crDto) {
		return chatRepository.chatList(crDto);
	}
	public List<ChatMessage> chatMessageList(ChatMessage cmDto) {
		return chatRepository.chatMessageList(cmDto);
	}
	public void insertChat(ChatMessage cmDto) {
		chatRepository.insertChat(cmDto);
	}
	public void insertChatRoom(ChatRoom crDto) {
		chatRepository.insertChatRoom(crDto);
	}
	public void insertChatRoomJoin(ChatRoomJoin crjDto) {
		chatRepository.insertChatRoomJoin(crjDto);
	}


}