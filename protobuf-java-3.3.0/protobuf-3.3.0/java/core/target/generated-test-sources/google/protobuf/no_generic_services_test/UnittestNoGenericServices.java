// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/unittest_no_generic_services.proto

package google.protobuf.no_generic_services_test;

public final class UnittestNoGenericServices {
  private UnittestNoGenericServices() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(google.protobuf.no_generic_services_test.UnittestNoGenericServices.testExtension);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code google.protobuf.no_generic_services_test.TestEnum}
   */
  public enum TestEnum
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>FOO = 1;</code>
     */
    FOO(1),
    ;

    /**
     * <code>FOO = 1;</code>
     */
    public static final int FOO_VALUE = 1;


    public final int getNumber() {
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TestEnum valueOf(int value) {
      return forNumber(value);
    }

    public static TestEnum forNumber(int value) {
      switch (value) {
        case 1: return FOO;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<TestEnum>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        TestEnum> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<TestEnum>() {
            public TestEnum findValueByNumber(int number) {
              return TestEnum.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return google.protobuf.no_generic_services_test.UnittestNoGenericServices.getDescriptor().getEnumTypes().get(0);
    }

    private static final TestEnum[] VALUES = values();

    public static TestEnum valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private TestEnum(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.protobuf.no_generic_services_test.TestEnum)
  }

  public interface TestMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:google.protobuf.no_generic_services_test.TestMessage)
      com.google.protobuf.GeneratedMessageV3.
          ExtendableMessageOrBuilder<TestMessage> {

    /**
     * <code>optional int32 a = 1;</code>
     */
    boolean hasA();
    /**
     * <code>optional int32 a = 1;</code>
     */
    int getA();
  }
  /**
   * Protobuf type {@code google.protobuf.no_generic_services_test.TestMessage}
   */
  public  static final class TestMessage extends
      com.google.protobuf.GeneratedMessageV3.ExtendableMessage<
        TestMessage> implements
      // @@protoc_insertion_point(message_implements:google.protobuf.no_generic_services_test.TestMessage)
      TestMessageOrBuilder {
    // Use TestMessage.newBuilder() to construct.
    private TestMessage(com.google.protobuf.GeneratedMessageV3.ExtendableBuilder<google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage, ?> builder) {
      super(builder);
    }
    private TestMessage() {
      a_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TestMessage(
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
              a_ = input.readInt32();
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
      return google.protobuf.no_generic_services_test.UnittestNoGenericServices.internal_static_google_protobuf_no_generic_services_test_TestMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return google.protobuf.no_generic_services_test.UnittestNoGenericServices.internal_static_google_protobuf_no_generic_services_test_TestMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage.class, google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage.Builder.class);
    }

    private int bitField0_;
    public static final int A_FIELD_NUMBER = 1;
    private int a_;
    /**
     * <code>optional int32 a = 1;</code>
     */
    public boolean hasA() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 a = 1;</code>
     */
    public int getA() {
      return a_;
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!extensionsAreInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      com.google.protobuf.GeneratedMessageV3
        .ExtendableMessage<google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage>.ExtensionWriter
          extensionWriter = newExtensionWriter();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, a_);
      }
      extensionWriter.writeUntil(536870912, output);
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, a_);
      }
      size += extensionsSerializedSize();
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
      if (!(obj instanceof google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage)) {
        return super.equals(obj);
      }
      google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage other = (google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage) obj;

      boolean result = true;
      result = result && (hasA() == other.hasA());
      if (hasA()) {
        result = result && (getA()
            == other.getA());
      }
      result = result && unknownFields.equals(other.unknownFields);
      result = result &&
          getExtensionFields().equals(other.getExtensionFields());
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasA()) {
        hash = (37 * hash) + A_FIELD_NUMBER;
        hash = (53 * hash) + getA();
      }
      hash = hashFields(hash, getExtensionFields());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage parseFrom(
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
    public static Builder newBuilder(google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage prototype) {
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
     * Protobuf type {@code google.protobuf.no_generic_services_test.TestMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.ExtendableBuilder<
          google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage, Builder> implements
        // @@protoc_insertion_point(builder_implements:google.protobuf.no_generic_services_test.TestMessage)
        google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return google.protobuf.no_generic_services_test.UnittestNoGenericServices.internal_static_google_protobuf_no_generic_services_test_TestMessage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return google.protobuf.no_generic_services_test.UnittestNoGenericServices.internal_static_google_protobuf_no_generic_services_test_TestMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage.class, google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage.Builder.class);
      }

      // Construct using google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage.newBuilder()
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
        a_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return google.protobuf.no_generic_services_test.UnittestNoGenericServices.internal_static_google_protobuf_no_generic_services_test_TestMessage_descriptor;
      }

      public google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage getDefaultInstanceForType() {
        return google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage.getDefaultInstance();
      }

      public google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage build() {
        google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage buildPartial() {
        google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage result = new google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.a_ = a_;
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
      public <Type> Builder setExtension(
          com.google.protobuf.GeneratedMessage.GeneratedExtension<
              google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage, Type> extension,
          Type value) {
        return (Builder) super.setExtension(extension, value);
      }
      public <Type> Builder setExtension(
          com.google.protobuf.GeneratedMessage.GeneratedExtension<
              google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage, java.util.List<Type>> extension,
          int index, Type value) {
        return (Builder) super.setExtension(extension, index, value);
      }
      public <Type> Builder addExtension(
          com.google.protobuf.GeneratedMessage.GeneratedExtension<
              google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage, java.util.List<Type>> extension,
          Type value) {
        return (Builder) super.addExtension(extension, value);
      }
      public <Type> Builder clearExtension(
          com.google.protobuf.GeneratedMessage.GeneratedExtension<
              google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage, ?> extension) {
        return (Builder) super.clearExtension(extension);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage) {
          return mergeFrom((google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage other) {
        if (other == google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage.getDefaultInstance()) return this;
        if (other.hasA()) {
          setA(other.getA());
        }
        this.mergeExtensionFields(other);
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!extensionsAreInitialized()) {
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int a_ ;
      /**
       * <code>optional int32 a = 1;</code>
       */
      public boolean hasA() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 a = 1;</code>
       */
      public int getA() {
        return a_;
      }
      /**
       * <code>optional int32 a = 1;</code>
       */
      public Builder setA(int value) {
        bitField0_ |= 0x00000001;
        a_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 a = 1;</code>
       */
      public Builder clearA() {
        bitField0_ = (bitField0_ & ~0x00000001);
        a_ = 0;
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


      // @@protoc_insertion_point(builder_scope:google.protobuf.no_generic_services_test.TestMessage)
    }

    // @@protoc_insertion_point(class_scope:google.protobuf.no_generic_services_test.TestMessage)
    private static final google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage();
    }

    public static google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<TestMessage>
        PARSER = new com.google.protobuf.AbstractParser<TestMessage>() {
      public TestMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new TestMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TestMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TestMessage> getParserForType() {
      return PARSER;
    }

    public google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public static final int TEST_EXTENSION_FIELD_NUMBER = 1000;
  /**
   * <code>extend .google.protobuf.no_generic_services_test.TestMessage { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      google.protobuf.no_generic_services_test.UnittestNoGenericServices.TestMessage,
      java.lang.Integer> testExtension = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.Integer.class,
        null);
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_protobuf_no_generic_services_test_TestMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_protobuf_no_generic_services_test_TestMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2google/protobuf/unittest_no_generic_se" +
      "rvices.proto\022(google.protobuf.no_generic" +
      "_services_test\"#\n\013TestMessage\022\t\n\001a\030\001 \001(\005" +
      "*\t\010\350\007\020\200\200\200\200\002*\023\n\010TestEnum\022\007\n\003FOO\020\0012\202\001\n\013Tes" +
      "tService\022s\n\003Foo\0225.google.protobuf.no_gen" +
      "eric_services_test.TestMessage\0325.google." +
      "protobuf.no_generic_services_test.TestMe" +
      "ssage:N\n\016test_extension\0225.google.protobu" +
      "f.no_generic_services_test.TestMessage\030\350" +
      "\007 \001(\005"
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
    internal_static_google_protobuf_no_generic_services_test_TestMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_protobuf_no_generic_services_test_TestMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_protobuf_no_generic_services_test_TestMessage_descriptor,
        new java.lang.String[] { "A", });
    testExtension.internalInit(descriptor.getExtensions().get(0));
  }

  // @@protoc_insertion_point(outer_class_scope)
}
