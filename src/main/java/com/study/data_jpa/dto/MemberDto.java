package com.study.data_jpa.dto;

import com.study.data_jpa.entity.Member;
import lombok.Data;

@Data
public class MemberDto {
    private Long id;
    private String username;
    private String teamName;
    public MemberDto(Long id, String username, String teamName) {
        this.id = id;
        this.username = username;
        this.teamName = teamName;
    }

    public MemberDto(Member m) {
        this.id = m.getId();
        this.username = m.getUsername();
    }
}