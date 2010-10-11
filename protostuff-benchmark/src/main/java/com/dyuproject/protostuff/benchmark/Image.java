// Generated by http://code.google.com/p/protostuff/ ... DO NOT EDIT!
// Generated from media.proto

package com.dyuproject.protostuff.benchmark;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import com.dyuproject.protostuff.Input;
import com.dyuproject.protostuff.Message;
import com.dyuproject.protostuff.Output;
import com.dyuproject.protostuff.ProtostuffIOUtil;
import com.dyuproject.protostuff.Schema;
import com.dyuproject.protostuff.UninitializedMessageException;

public final class Image implements Externalizable, Message<Image>
{
    public enum Size implements com.dyuproject.protostuff.EnumLite<Size>
    {
        SMALL(0),
        LARGE(1);
        
        public final int number;
        
        private Size (int number)
        {
            this.number = number;
        }
        
        public int getNumber()
        {
            return number;
        }
        
        public static Size valueOf(int number)
        {
            switch(number) 
            {
                case 0: return SMALL;
                case 1: return LARGE;
                default: return null;
            }
        }
    }


    public static Schema<Image> getSchema()
    {
        return SCHEMA;
    }

    public static Image getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final Image DEFAULT_INSTANCE = new Image();

    
    // non-private fields
    // see http://developer.android.com/guide/practices/design/performance.html#package_inner
    String uri;
    String title;
    Integer width;
    Integer height;
    Size size;

    public Image()
    {
        
    }

    public Image(
        String uri,
        Integer width,
        Integer height,
        Size size
    )
    {
        this.uri = uri;
        this.width = width;
        this.height = height;
        this.size = size;
    }

    // getters and setters

    // uri

    public String getUri()
    {
        return uri;
    }

    public Image setUri(String uri)
    {
        this.uri = uri;
        return this;
    }

    // title

    public String getTitle()
    {
        return title;
    }

    public Image setTitle(String title)
    {
        this.title = title;
        return this;
    }

    // width

    public Integer getWidth()
    {
        return width;
    }

    public Image setWidth(Integer width)
    {
        this.width = width;
        return this;
    }

    // height

    public Integer getHeight()
    {
        return height;
    }

    public Image setHeight(Integer height)
    {
        this.height = height;
        return this;
    }

    // size

    public Size getSize()
    {
        return size;
    }

    public Image setSize(Size size)
    {
        this.size = size;
        return this;
    }

    // java serialization

    public void readExternal(ObjectInput in) throws IOException
    {
        ProtostuffIOUtil.mergeDelimitedFrom(in, this, SCHEMA);
    }

    public void writeExternal(ObjectOutput out) throws IOException
    {
        ProtostuffIOUtil.writeDelimitedTo(out, this, SCHEMA);
    }

    // message method

    public Schema<Image> cachedSchema()
    {
        return SCHEMA;
    }

    static final Schema<Image> SCHEMA = new Schema<Image>()
    {
        // schema methods

        public Image newMessage()
        {
            return new Image();
        }

        public Class<Image> typeClass()
        {
            return Image.class;
        }

        public String messageName()
        {
            return Image.class.getSimpleName();
        }

        public String messageFullName()
        {
            return Image.class.getName();
        }

        public boolean isInitialized(Image message)
        {
            return 
                message.uri != null 
                && message.width != null 
                && message.height != null 
                && message.size != null;
        }

        public void mergeFrom(Input input, Image message) throws IOException
        {
            while(true)
            {
                final int number = input.readFieldNumber(this);
                switch(number)
                {
                    case 0:
                        return;
                    case 1:
                        message.uri = input.readString();
                        break;
                    case 2:
                        message.title = input.readString();
                        break;
                    case 3:
                        message.width = input.readInt32();
                        break;
                    case 4:
                        message.height = input.readInt32();
                        break;
                    case 5:
                        message.size = Size.valueOf(input.readEnum());
                        break;
                    default:
                        input.handleUnknownField(number, this);
                }   
            }
        }


        public void writeTo(Output output, Image message) throws IOException
        {
            if(message.uri == null)
                throw new UninitializedMessageException(message);
            output.writeString(1, message.uri, false);

            if(message.title != null)
                output.writeString(2, message.title, false);

            if(message.width == null)
                throw new UninitializedMessageException(message);
            output.writeInt32(3, message.width, false);

            if(message.height == null)
                throw new UninitializedMessageException(message);
            output.writeInt32(4, message.height, false);

            if(message.size == null)
                throw new UninitializedMessageException(message);
            output.writeEnum(5, message.size.number, false);
        }

        public String getFieldName(int number)
        {
            switch(number)
            {
                case 1: return "f1";
                case 2: return "f2";
                case 3: return "f3";
                case 4: return "f4";
                case 5: return "f5";
                default: return null;
            }
        }

        public int getFieldNumber(String name)
        {
            final Integer number = fieldMap.get(name);
            return number == null ? 0 : number.intValue();
        }

        final java.util.HashMap<String,Integer> fieldMap = new java.util.HashMap<String,Integer>();
        {
            fieldMap.put("f1", 1);
            fieldMap.put("f2", 2);
            fieldMap.put("f3", 3);
            fieldMap.put("f4", 4);
            fieldMap.put("f5", 5);
        }
    };
    
}
