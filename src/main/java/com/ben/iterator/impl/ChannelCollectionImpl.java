package com.ben.iterator.impl;

import com.ben.iterator.Channel;
import com.ben.iterator.ChannelCollection;
import com.ben.iterator.ChannelIterator;
import com.ben.iterator.ChannelType;

import java.util.ArrayList;

/**
 * Created by BEN on 15-Mar-16.
 */
public class ChannelCollectionImpl implements ChannelCollection {
    private ArrayList<Channel> channels;

    public ChannelCollectionImpl() {
        channels = new ArrayList<Channel>();
    }

    public void addChannel(Channel ch) {
        channels.add(ch);
    }

    public void removeChannel(Channel ch) {
        channels.remove(ch);
    }

    public ChannelIterator getChannels(ChannelType channelType) {
        return new ChannelIteratorImpl(channels,channelType);
    }

    private class ChannelIteratorImpl implements ChannelIterator{

        private int index;
        private ArrayList<Channel> channels;
        private ChannelType channelType;

        public ChannelIteratorImpl(ArrayList<Channel> channels, ChannelType channelType) {
            this.channels = channels;
            this.channelType = channelType;
        }

        public boolean hasNext() {
            while(index < channels.size()){
                Channel ch= channels.get(index);
                if(ch.getcType().equals(channelType) || channelType.equals(ChannelType.ALL)){
                    return true;
                }else
                    index++;
            }
            return false;
        }

        public Channel next() {
            Channel c= channels.get(index);
            index++;
            return c;
        }
    }
}
