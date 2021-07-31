package com.michalszalkowski.module.blog;

import java.util.UUID;

public class PostDto {

    private final String uuid;
    private final String title;
    private final String text;

    public PostDto(String title, String text) {
        this.uuid = UUID.randomUUID().toString();
        this.title = title;
        this.text = text;
    }

    public String getUuid() {
        return uuid;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
