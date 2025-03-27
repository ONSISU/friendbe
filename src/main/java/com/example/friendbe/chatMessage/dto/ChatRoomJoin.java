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
public class ChatRoomJoin {
	
	private int chatRoomJoinNo;
	private String memberGuest;
	private String title;
	private String memberId;


}