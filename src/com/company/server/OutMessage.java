
package com.company.server;

/**
 * Created by Zver on 05.03.2018.
 */
public class OutMessage {
    private String accept, denay;
    private Integer userId, chatId;

    public OutMessage(Integer userId, Integer chatId, String accept ) {
        this.accept = accept;
        this.userId = userId;
        this.chatId = chatId;

    }
}
