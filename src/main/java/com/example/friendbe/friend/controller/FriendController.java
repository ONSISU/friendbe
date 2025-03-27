package com.example.friendbe.friend.controller;

import com.example.friendbe.friend.dto.FriendDto;
import com.example.friendbe.friend.service.FriendService;
import com.example.friendbe.member.dto.MemberDto;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "http://localhost:3000")  // 특정 도메인에 대해 허용
@RequestMapping("/friend")
public class FriendController {

    // 1. form-data(파일업로드 등에 쓰임)
    // 예) @RequestParam("file") 같이 씀
    // 2. raw(JSON 형식으로 데이터 전송)
    // @RequestBody으로 씀

    @Autowired
    public FriendService friendService;

//    @GetMapping("/find")
//    public List<MemberDto> find(MemberDto mDto){
//        return memberService.find(mDto);
//    }
    @PostMapping("/list")
    public List<FriendDto> friendList(@RequestBody FriendDto fDto){
        return friendService.friendList(fDto);
    }
    @PostMapping("/friendYn")
    public int friendYn(@RequestBody FriendDto fDto) {
        return friendService.friendYn(fDto);
    }
    @PostMapping("/friendInsert")
    public void friendInsert(@RequestBody FriendDto fDto) {
        friendService.friendInsert(fDto);
    }

}
