package com.denizenscript.depenizen.bukkit.bungee.packets.out;

import com.denizenscript.depenizen.bukkit.bungee.PacketOut;
import io.netty.buffer.ByteBuf;

public class ExecutePlayerCommandPacketOut extends PacketOut {

    public ExecutePlayerCommandPacketOut(String player, String command) {
        this.player = player;
        this.command = command;
    }

    public String player, command;

    @Override
    public int getPacketId() {
        return 18;
    }

    @Override
    public void writeTo(ByteBuf buf) {
        writeString(buf, player);
        writeString(buf, command);
    }
}
