package com.example.friendbe.chatMessage.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatMessage {
	
	private int cmNo;
	private String message;
	private String createDate;
	private String memberId;
	private String memberNickname;
	private String title;
    public List<ChatRoom> insertChat() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertChat'");
    }


}