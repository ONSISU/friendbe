package com.example.friendbe.friend.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Data
@NoArgsConstructor
public class FriendDto {

    private int friendNo;
    private String memberId;
    private String friendId;
    private Date friendDate;
    private String memberInfo;
    private String memberPhone;
}
