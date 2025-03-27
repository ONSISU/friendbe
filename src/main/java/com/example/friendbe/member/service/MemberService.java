package com.example.friendbe.member.service;
import com.example.friendbe.member.dto.MemberDto;
import com.example.friendbe.member.repository.MemberRepository;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public boolean login(MemberDto mDto){
        return memberRepository.login(mDto);
    };
    public List<MemberDto> search(MemberDto mDto){
        return memberRepository.search(mDto);
    } 
    public MemberDto findById(MemberDto mDto) {
        return memberRepository.findById(mDto);
    }
//    public  void coffeeInsert(MemberDto mDto){
//        memberRepository.coffeeInsert(mDto);
//    }
}
