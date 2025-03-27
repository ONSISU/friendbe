package com.example.friendbe.chatMessage;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.friendbe.chatMessage.dto.ChatMessage;
import com.example.friendbe.chatMessage.dto.ChatRoom;
import com.example.friendbe.chatMessage.dto.ChatRoomJoin;

@Mapper
@Repository
public interface ChatRepository {
	
//	채팅방 목록
	// public List<ChatRoom> selectChatRooms() {
	// 	return session.selectList("chatMapper.selectChatRooms");
	// }
	public List<ChatRoom> chatList(ChatRoom crDto);
	public void insertChat(ChatMessage cmDto);
	public void insertChatRoom(ChatRoom crDto);
	public void insertChatRoomJoin(ChatRoomJoin crjDto);
	public List<ChatMessage> chatMessageList(ChatMessage cmDto);

}