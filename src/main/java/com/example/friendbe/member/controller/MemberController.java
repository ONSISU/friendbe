package com.example.friendbe.member.controller;

import com.example.friendbe.member.dto.MemberDto;
import com.example.friendbe.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "http://localhost:3000")  // 특정 도메인에 대해 허용
@RequestMapping("/member")
public class MemberController {

    // 1. form-data(파일업로드 등에 쓰임)
    // 예) @RequestParam("file") 같이 씀
    // 2. raw(JSON 형식으로 데이터 전송)
    // @RequestBody으로 씀

    @Autowired
    public MemberService memberService;

    @PostMapping("/login")
    public boolean login(@RequestBody MemberDto mDto){
        return memberService.login(mDto);
    }
    @PostMapping("/search")
    public List<MemberDto> search(@RequestBody MemberDto mDto) {
        return memberService.search(mDto);
    }
    @PostMapping("/findById")
    public MemberDto findById(@RequestBody MemberDto mDto) {
        return memberService.findById(mDto);
    }
}
