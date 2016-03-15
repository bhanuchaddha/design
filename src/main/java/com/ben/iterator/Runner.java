package com.ben.iterator;

import com.ben.iterator.impl.ChannelCollectionImpl;

/**
 * Created by BEN on 15-Mar-16.
 */
public class Runner {
    public static void main(String [] args){

        ChannelCollection collection = new ChannelCollectionImpl();
        collection.addChannel(new Channel(ChannelType.FRENCH,99.2));
        collection.addChannel(new Channel(ChannelType.HINDI,91.2));
        collection.addChannel(new Channel(ChannelType.ENGLISH,90.2));
        collection.addChannel(new Channel(ChannelType.FRENCH,100.2));
        collection.addChannel(new Channel(ChannelType.HINDI,232));
        collection.addChannel(new Channel(ChannelType.HINDI,911.2));
        collection.addChannel(new Channel(ChannelType.FRENCH,9922));
        collection.addChannel(new Channel(ChannelType.HINDI,3432));
        collection.addChannel(new Channel(ChannelType.ENGLISH,102));

        ChannelIterator all= collection.getChannels(ChannelType.ALL);
        while (all.hasNext()){
            System.out.println(all.next());
        }

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%");

        ChannelIterator hindi=collection.getChannels(ChannelType.HINDI);
        while (hindi.hasNext()){
            System.out.println(hindi.next());
        }

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%");

        ChannelIterator english=collection.getChannels(ChannelType.ENGLISH);
        while (english.hasNext()){
            System.out.println(english.next());
        }

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%");




    }

}
