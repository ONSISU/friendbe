package com.example.friendbe.friend.service;
import com.example.friendbe.friend.dto.FriendDto;
import com.example.friendbe.friend.repository.FriendRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendService {

    private final FriendRepository friendRepository;
    public FriendService(FriendRepository friendRepository) {
        this.friendRepository = friendRepository;
    }

//    public List<MemberDto> find(MemberDto mDto){
//       return memberRepository.find(mDto);
//    };
    public List<FriendDto> friendList(FriendDto fDto){
        return friendRepository.friendList(fDto);
    };
    public int friendYn(FriendDto fDto){
            return friendRepository.friendYn(fDto);
    }
    public void friendInsert(FriendDto fDto){
            friendRepository.friendInsert(fDto);
    }
}
