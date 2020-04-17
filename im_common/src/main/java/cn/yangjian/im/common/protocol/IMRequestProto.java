// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BaseRequestProto.proto

package cn.yangjian.im.common.protocol;

public final class IMRequestProto {
  private IMRequestProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IMReqProtocolOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protocol.IMReqProtocol)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int64 requestId = 2;</code>
     */
    boolean hasRequestId();
    /**
     * <code>required int64 requestId = 2;</code>
     */
    long getRequestId();

    /**
     * <code>required string reqMsg = 1;</code>
     */
    boolean hasReqMsg();
    /**
     * <code>required string reqMsg = 1;</code>
     */
    java.lang.String getReqMsg();
    /**
     * <code>required string reqMsg = 1;</code>
     */
    com.google.protobuf.ByteString
        getReqMsgBytes();

    /**
     * <code>required int32 type = 3;</code>
     */
    boolean hasType();
    /**
     * <code>required int32 type = 3;</code>
     */
    int getType();
  }
  /**
   * Protobuf type {@code protocol.IMReqProtocol}
   */
  public  static final class IMReqProtocol extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:protocol.IMReqProtocol)
      IMReqProtocolOrBuilder {
    // Use IMReqProtocol.newBuilder() to construct.
    private IMReqProtocol(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IMReqProtocol() {
      requestId_ = 0L;
      reqMsg_ = "";
      type_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private IMReqProtocol(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              reqMsg_ = bs;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000001;
              requestId_ = input.readInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              type_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return cn.yangjian.im.common.protocol.IMRequestProto.internal_static_protocol_IMReqProtocol_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return cn.yangjian.im.common.protocol.IMRequestProto.internal_static_protocol_IMReqProtocol_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              cn.yangjian.im.common.protocol.IMRequestProto.IMReqProtocol.class, cn.yangjian.im.common.protocol.IMRequestProto.IMReqProtocol.Builder.class);
    }

    private int bitField0_;
    public static final int REQUESTID_FIELD_NUMBER = 2;
    private long requestId_;
    /**
     * <code>required int64 requestId = 2;</code>
     */
    public boolean hasRequestId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int64 requestId = 2;</code>
     */
    public long getRequestId() {
      return requestId_;
    }

    public static final int REQMSG_FIELD_NUMBER = 1;
    private volatile java.lang.Object reqMsg_;
    /**
     * <code>required string reqMsg = 1;</code>
     */
    public boolean hasReqMsg() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string reqMsg = 1;</code>
     */
    public java.lang.String getReqMsg() {
      java.lang.Object ref = reqMsg_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          reqMsg_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string reqMsg = 1;</code>
     */
    public com.google.protobuf.ByteString
        getReqMsgBytes() {
      java.lang.Object ref = reqMsg_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        reqMsg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TYPE_FIELD_NUMBER = 3;
    private int type_;
    /**
     * <code>required int32 type = 3;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int32 type = 3;</code>
     */
    public int getType() {
      return type_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasRequestId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasReqMsg()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, reqMsg_);
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(2, requestId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, type_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, reqMsg_);
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, requestId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, type_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof cn.yangjian.im.common.protocol.IMRequestProto.IMReqProtocol)) {
        return super.equals(obj);
      }
      cn.yangjian.im.common.protocol.IMRequestProto.IMReqProtocol other = (cn.yangjian.im.common.protocol.IMRequestProto.IMReqProtocol) obj;

      boolean result = true;
      result = result && (hasRequestId() == other.hasRequestId());
      if (hasRequestId()) {
        result = result && (getRequestId()
            == other.getRequestId());
      }
      result = result && (hasReqMsg() == other.hasReqMsg());
      if (hasReqMsg()) {
        result = result && getReqMsg()
            .equals(other.getReqMsg());
      }
      result = result && (hasType() == other.hasType());
      if (hasType()) {
        result = result && (getType()
            == other.getType());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      if (hasRequestId()) {
        hash = (37 * hash) + REQUESTID_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getRequestId());
      }
      if (hasReqMsg()) {
        hash = (37 * hash) + REQMSG_FIELD_NUMBER;
        hash = (53 * hash) + getReqMsg().hashCode();
      }
      if (hasType()) {
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + getType();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static cn.yangjian.im.common.protocol.IMRequestProto.IMReqProtocol parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.yangjian.im.common.protocol.IMRequestProto.IMReqProtocol parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.yangjian.im.common.protocol.IMRequestProto.IMReqProtocol parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static cn.yangjian.im.common.protocol.IMRequestProto.IMReqProtocol parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static cn.yangjian.im.common.protocol.IMRequestProto.IMReqProtocol parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static cn.yangjian.im.common.protocol.IMRequestProto.IMReqProtocol parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static cn.yangjian.im.common.protocol.IMRequestProto.IMReqProtocol parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static cn.yangjian.im.common.protocol.IMRequestProto.IMReqProtocol parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static cn.yangjian.im.common.protocol.IMRequestProto.IMReqProtocol parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static cn.yangjian.im.common.protocol.IMRequestProto.IMReqProtocol parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(cn.yangjian.im.common.protocol.IMRequestProto.IMReqProtocol prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code protocol.IMReqProtocol}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protocol.IMReqProtocol)
        cn.yangjian.im.common.protocol.IMRequestProto.IMReqProtocolOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return cn.yangjian.im.common.protocol.IMRequestProto.internal_static_protocol_IMReqProtocol_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return cn.yangjian.im.common.protocol.IMRequestProto.internal_static_protocol_IMReqProtocol_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                cn.yangjian.im.common.protocol.IMRequestProto.IMReqProtocol.class, cn.yangjian.im.common.protocol.IMRequestProto.IMReqProtocol.Builder.class);
      }

      // Construct using cn.yangjian.im.common.protocol.IMRequestProto.IMReqProtocol.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        requestId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        reqMsg_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return cn.yangjian.im.common.protocol.IMRequestProto.internal_static_protocol_IMReqProtocol_descriptor;
      }

      public cn.yangjian.im.common.protocol.IMRequestProto.IMReqProtocol getDefaultInstanceForType() {
        return cn.yangjian.im.common.protocol.IMRequestProto.IMReqProtocol.getDefaultInstance();
      }

      public cn.yangjian.im.common.protocol.IMRequestProto.IMReqProtocol build() {
        cn.yangjian.im.common.protocol.IMRequestProto.IMReqProtocol result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public cn.yangjian.im.common.protocol.IMRequestProto.IMReqProtocol buildPartial() {
        cn.yangjian.im.common.protocol.IMRequestProto.IMReqProtocol result = new cn.yangjian.im.common.protocol.IMRequestProto.IMReqProtocol(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.requestId_ = requestId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.reqMsg_ = reqMsg_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.type_ = type_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof cn.yangjian.im.common.protocol.IMRequestProto.IMReqProtocol) {
          return mergeFrom((cn.yangjian.im.common.protocol.IMRequestProto.IMReqProtocol)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(cn.yangjian.im.common.protocol.IMRequestProto.IMReqProtocol other) {
        if (other == cn.yangjian.im.common.protocol.IMRequestProto.IMReqProtocol.getDefaultInstance()) return this;
        if (other.hasRequestId()) {
          setRequestId(other.getRequestId());
        }
        if (other.hasReqMsg()) {
          bitField0_ |= 0x00000002;
          reqMsg_ = other.reqMsg_;
          onChanged();
        }
        if (other.hasType()) {
          setType(other.getType());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasRequestId()) {
          return false;
        }
        if (!hasReqMsg()) {
          return false;
        }
        if (!hasType()) {
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        cn.yangjian.im.common.protocol.IMRequestProto.IMReqProtocol parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (cn.yangjian.im.common.protocol.IMRequestProto.IMReqProtocol) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long requestId_ ;
      /**
       * <code>required int64 requestId = 2;</code>
       */
      public boolean hasRequestId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int64 requestId = 2;</code>
       */
      public long getRequestId() {
        return requestId_;
      }
      /**
       * <code>required int64 requestId = 2;</code>
       */
      public Builder setRequestId(long value) {
        bitField0_ |= 0x00000001;
        requestId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 requestId = 2;</code>
       */
      public Builder clearRequestId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        requestId_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object reqMsg_ = "";
      /**
       * <code>required string reqMsg = 1;</code>
       */
      public boolean hasReqMsg() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string reqMsg = 1;</code>
       */
      public java.lang.String getReqMsg() {
        java.lang.Object ref = reqMsg_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            reqMsg_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string reqMsg = 1;</code>
       */
      public com.google.protobuf.ByteString
          getReqMsgBytes() {
        java.lang.Object ref = reqMsg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          reqMsg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string reqMsg = 1;</code>
       */
      public Builder setReqMsg(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        reqMsg_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string reqMsg = 1;</code>
       */
      public Builder clearReqMsg() {
        bitField0_ = (bitField0_ & ~0x00000002);
        reqMsg_ = getDefaultInstance().getReqMsg();
        onChanged();
        return this;
      }
      /**
       * <code>required string reqMsg = 1;</code>
       */
      public Builder setReqMsgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        reqMsg_ = value;
        onChanged();
        return this;
      }

      private int type_ ;
      /**
       * <code>required int32 type = 3;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int32 type = 3;</code>
       */
      public int getType() {
        return type_;
      }
      /**
       * <code>required int32 type = 3;</code>
       */
      public Builder setType(int value) {
        bitField0_ |= 0x00000004;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 type = 3;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        type_ = 0;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:protocol.IMReqProtocol)
    }

    // @@protoc_insertion_point(class_scope:protocol.IMReqProtocol)
    private static final cn.yangjian.im.common.protocol.IMRequestProto.IMReqProtocol DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new cn.yangjian.im.common.protocol.IMRequestProto.IMReqProtocol();
    }

    public static cn.yangjian.im.common.protocol.IMRequestProto.IMReqProtocol getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<IMReqProtocol>
        PARSER = new com.google.protobuf.AbstractParser<IMReqProtocol>() {
      public IMReqProtocol parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new IMReqProtocol(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<IMReqProtocol> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IMReqProtocol> getParserForType() {
      return PARSER;
    }

    public cn.yangjian.im.common.protocol.IMRequestProto.IMReqProtocol getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protocol_IMReqProtocol_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protocol_IMReqProtocol_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026BaseRequestProto.proto\022\010protocol\"@\n\rIM" +
      "ReqProtocol\022\021\n\trequestId\030\002 \002(\003\022\016\n\006reqMsg" +
      "\030\001 \002(\t\022\014\n\004type\030\003 \002(\005B0\n\036cn.yangjian.im.c" +
      "ommon.protocolB\016IMRequestProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_protocol_IMReqProtocol_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protocol_IMReqProtocol_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protocol_IMReqProtocol_descriptor,
        new java.lang.String[] { "RequestId", "ReqMsg", "Type", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}