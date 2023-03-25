package net.md_5.bungee.connection;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HasJoinedRequest
{
    public static final String URL = "http://x19authserver.nie.netease.com/check";
    //public static final String URL = "http://x19authexpr.nie.netease.com/check";
    public String username;
    public String serverId;
}
