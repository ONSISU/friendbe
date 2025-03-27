package com.example.friendbe.member.repository;

import com.example.friendbe.member.dto.MemberDto;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MemberRepository {

    public boolean login(MemberDto mDto);
    public List<MemberDto> search(MemberDto mDto);
    public MemberDto findById(MemberDto mDto);

}
