package com.example.friendbe.chatMessage.dto;

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
public class ChatRoom {
	
	private int chatRoomNo;
	private String title;
	private String memberHost;
	private String memberId;
	private String memberGuest;

}
