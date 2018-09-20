// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/unittest_import_public.proto

package com.google.protobuf.test;

public final class UnittestImportPublic {
  private UnittestImportPublic() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PublicImportMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protobuf_unittest_import.PublicImportMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 e = 1;</code>
     */
    boolean hasE();
    /**
     * <code>optional int32 e = 1;</code>
     */
    int getE();
  }
  /**
   * Protobuf type {@code protobuf_unittest_import.PublicImportMessage}
   */
  public  static final class PublicImportMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:protobuf_unittest_import.PublicImportMessage)
      PublicImportMessageOrBuilder {
    // Use PublicImportMessage.newBuilder() to construct.
    private PublicImportMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PublicImportMessage() {
      e_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PublicImportMessage(
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
            case 8: {
              bitField0_ |= 0x00000001;
              e_ = input.readInt32();
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
      return com.google.protobuf.test.UnittestImportPublic.internal_static_protobuf_unittest_import_PublicImportMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.protobuf.test.UnittestImportPublic.internal_static_protobuf_unittest_import_PublicImportMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.protobuf.test.UnittestImportPublic.PublicImportMessage.class, com.google.protobuf.test.UnittestImportPublic.PublicImportMessage.Builder.class);
    }

    private int bitField0_;
    public static final int E_FIELD_NUMBER = 1;
    private int e_;
    /**
     * <code>optional int32 e = 1;</code>
     */
    public boolean hasE() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 e = 1;</code>
     */
    public int getE() {
      return e_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, e_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, e_);
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
      if (!(obj instanceof com.google.protobuf.test.UnittestImportPublic.PublicImportMessage)) {
        return super.equals(obj);
      }
      com.google.protobuf.test.UnittestImportPublic.PublicImportMessage other = (com.google.protobuf.test.UnittestImportPublic.PublicImportMessage) obj;

      boolean result = true;
      result = result && (hasE() == other.hasE());
      if (hasE()) {
        result = result && (getE()
            == other.getE());
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
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasE()) {
        hash = (37 * hash) + E_FIELD_NUMBER;
        hash = (53 * hash) + getE();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.google.protobuf.test.UnittestImportPublic.PublicImportMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.google.protobuf.test.UnittestImportPublic.PublicImportMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.google.protobuf.test.UnittestImportPublic.PublicImportMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.google.protobuf.test.UnittestImportPublic.PublicImportMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.google.protobuf.test.UnittestImportPublic.PublicImportMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.google.protobuf.test.UnittestImportPublic.PublicImportMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.google.protobuf.test.UnittestImportPublic.PublicImportMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.google.protobuf.test.UnittestImportPublic.PublicImportMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.google.protobuf.test.UnittestImportPublic.PublicImportMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.google.protobuf.test.UnittestImportPublic.PublicImportMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.google.protobuf.test.UnittestImportPublic.PublicImportMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.google.protobuf.test.UnittestImportPublic.PublicImportMessage parseFrom(
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
    public static Builder newBuilder(com.google.protobuf.test.UnittestImportPublic.PublicImportMessage prototype) {
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
     * Protobuf type {@code protobuf_unittest_import.PublicImportMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protobuf_unittest_import.PublicImportMessage)
        com.google.protobuf.test.UnittestImportPublic.PublicImportMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.google.protobuf.test.UnittestImportPublic.internal_static_protobuf_unittest_import_PublicImportMessage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.google.protobuf.test.UnittestImportPublic.internal_static_protobuf_unittest_import_PublicImportMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.google.protobuf.test.UnittestImportPublic.PublicImportMessage.class, com.google.protobuf.test.UnittestImportPublic.PublicImportMessage.Builder.class);
      }

      // Construct using com.google.protobuf.test.UnittestImportPublic.PublicImportMessage.newBuilder()
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
        e_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.google.protobuf.test.UnittestImportPublic.internal_static_protobuf_unittest_import_PublicImportMessage_descriptor;
      }

      public com.google.protobuf.test.UnittestImportPublic.PublicImportMessage getDefaultInstanceForType() {
        return com.google.protobuf.test.UnittestImportPublic.PublicImportMessage.getDefaultInstance();
      }

      public com.google.protobuf.test.UnittestImportPublic.PublicImportMessage build() {
        com.google.protobuf.test.UnittestImportPublic.PublicImportMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.google.protobuf.test.UnittestImportPublic.PublicImportMessage buildPartial() {
        com.google.protobuf.test.UnittestImportPublic.PublicImportMessage result = new com.google.protobuf.test.UnittestImportPublic.PublicImportMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.e_ = e_;
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
        if (other instanceof com.google.protobuf.test.UnittestImportPublic.PublicImportMessage) {
          return mergeFrom((com.google.protobuf.test.UnittestImportPublic.PublicImportMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.google.protobuf.test.UnittestImportPublic.PublicImportMessage other) {
        if (other == com.google.protobuf.test.UnittestImportPublic.PublicImportMessage.getDefaultInstance()) return this;
        if (other.hasE()) {
          setE(other.getE());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.test.UnittestImportPublic.PublicImportMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.google.protobuf.test.UnittestImportPublic.PublicImportMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int e_ ;
      /**
       * <code>optional int32 e = 1;</code>
       */
      public boolean hasE() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 e = 1;</code>
       */
      public int getE() {
        return e_;
      }
      /**
       * <code>optional int32 e = 1;</code>
       */
      public Builder setE(int value) {
        bitField0_ |= 0x00000001;
        e_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 e = 1;</code>
       */
      public Builder clearE() {
        bitField0_ = (bitField0_ & ~0x00000001);
        e_ = 0;
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


      // @@protoc_insertion_point(builder_scope:protobuf_unittest_import.PublicImportMessage)
    }

    // @@protoc_insertion_point(class_scope:protobuf_unittest_import.PublicImportMessage)
    private static final com.google.protobuf.test.UnittestImportPublic.PublicImportMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.google.protobuf.test.UnittestImportPublic.PublicImportMessage();
    }

    public static com.google.protobuf.test.UnittestImportPublic.PublicImportMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<PublicImportMessage>
        PARSER = new com.google.protobuf.AbstractParser<PublicImportMessage>() {
      public PublicImportMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new PublicImportMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PublicImportMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PublicImportMessage> getParserForType() {
      return PARSER;
    }

    public com.google.protobuf.test.UnittestImportPublic.PublicImportMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protobuf_unittest_import_PublicImportMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protobuf_unittest_import_PublicImportMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,google/protobuf/unittest_import_public" +
      ".proto\022\030protobuf_unittest_import\" \n\023Publ" +
      "icImportMessage\022\t\n\001e\030\001 \001(\005B\032\n\030com.google" +
      ".protobuf.test"
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
    internal_static_protobuf_unittest_import_PublicImportMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protobuf_unittest_import_PublicImportMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protobuf_unittest_import_PublicImportMessage_descriptor,
        new java.lang.String[] { "E", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
