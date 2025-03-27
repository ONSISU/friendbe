package com.example.friendbe.member.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Data
public class MemberDto {

    private int memberNo;
    private String memberId;
    private String memberPw;
    private String memberName;
    private String memberNickname;
    private String memberPhone;
    private String memberInfo;
    private Date memberDate;
    private int fileNo;
    private String memberSubscribeYn;
    private String searchNickname;
    private String searchId;
    private String friendId;

    
}
