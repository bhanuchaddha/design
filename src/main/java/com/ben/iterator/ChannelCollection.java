package com.ben.iterator;

/**
 * Created by BEN on 15-Mar-16.
 */
public interface ChannelCollection {
    public void addChannel(Channel ch);
    public void removeChannel(Channel ch);
    public ChannelIterator getChannels(ChannelType channelType);
}
