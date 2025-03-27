package com.example.friendbe.friend.repository;

import com.example.friendbe.friend.dto.FriendDto;
import com.example.friendbe.member.repository.MemberRepository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface FriendRepository extends MemberRepository{

//    public List<MemberDto> find(MemberDto mDto);
    public List<FriendDto> friendList(FriendDto fDto);
    public int friendYn(FriendDto fDto);
    public void friendInsert(FriendDto fDto);

}
