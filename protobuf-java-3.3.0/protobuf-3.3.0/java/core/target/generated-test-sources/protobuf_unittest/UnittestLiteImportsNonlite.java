// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/unittest_lite_imports_nonlite.proto

package protobuf_unittest;

public final class UnittestLiteImportsNonlite {
  private UnittestLiteImportsNonlite() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface TestLiteImportsNonliteOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protobuf_unittest.TestLiteImportsNonlite)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional .protobuf_unittest.TestAllTypes message = 1;</code>
     */
    boolean hasMessage();
    /**
     * <code>optional .protobuf_unittest.TestAllTypes message = 1;</code>
     */
    protobuf_unittest.UnittestProto.TestAllTypes getMessage();
  }
  /**
   * Protobuf type {@code protobuf_unittest.TestLiteImportsNonlite}
   */
  public  static final class TestLiteImportsNonlite extends
      com.google.protobuf.GeneratedMessageLite<
          TestLiteImportsNonlite, TestLiteImportsNonlite.Builder> implements
      // @@protoc_insertion_point(message_implements:protobuf_unittest.TestLiteImportsNonlite)
      TestLiteImportsNonliteOrBuilder {
    private TestLiteImportsNonlite() {
    }
    private int bitField0_;
    public static final int MESSAGE_FIELD_NUMBER = 1;
    private protobuf_unittest.UnittestProto.TestAllTypes message_;
    /**
     * <code>optional .protobuf_unittest.TestAllTypes message = 1;</code>
     */
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .protobuf_unittest.TestAllTypes message = 1;</code>
     */
    public protobuf_unittest.UnittestProto.TestAllTypes getMessage() {
      return message_ == null ? protobuf_unittest.UnittestProto.TestAllTypes.getDefaultInstance() : message_;
    }
    /**
     * <code>optional .protobuf_unittest.TestAllTypes message = 1;</code>
     */
    private void setMessage(protobuf_unittest.UnittestProto.TestAllTypes value) {
      if (value == null) {
        throw new NullPointerException();
      }
      message_ = value;
      bitField0_ |= 0x00000001;
      }
    /**
     * <code>optional .protobuf_unittest.TestAllTypes message = 1;</code>
     */
    private void setMessage(
        protobuf_unittest.UnittestProto.TestAllTypes.Builder builderForValue) {
      message_ = builderForValue.build();
      bitField0_ |= 0x00000001;
    }
    /**
     * <code>optional .protobuf_unittest.TestAllTypes message = 1;</code>
     */
    private void mergeMessage(protobuf_unittest.UnittestProto.TestAllTypes value) {
      if (message_ != null &&
          message_ != protobuf_unittest.UnittestProto.TestAllTypes.getDefaultInstance()) {
        message_ =
          protobuf_unittest.UnittestProto.TestAllTypes.newBuilder(message_).mergeFrom(value).buildPartial();
      } else {
        message_ = value;
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <code>optional .protobuf_unittest.TestAllTypes message = 1;</code>
     */
    private void clearMessage() {  message_ = null;
      bitField0_ = (bitField0_ & ~0x00000001);
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, getMessage());
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getMessage());
      }
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static protobuf_unittest.UnittestLiteImportsNonlite.TestLiteImportsNonlite parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static protobuf_unittest.UnittestLiteImportsNonlite.TestLiteImportsNonlite parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static protobuf_unittest.UnittestLiteImportsNonlite.TestLiteImportsNonlite parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static protobuf_unittest.UnittestLiteImportsNonlite.TestLiteImportsNonlite parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static protobuf_unittest.UnittestLiteImportsNonlite.TestLiteImportsNonlite parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static protobuf_unittest.UnittestLiteImportsNonlite.TestLiteImportsNonlite parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static protobuf_unittest.UnittestLiteImportsNonlite.TestLiteImportsNonlite parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static protobuf_unittest.UnittestLiteImportsNonlite.TestLiteImportsNonlite parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static protobuf_unittest.UnittestLiteImportsNonlite.TestLiteImportsNonlite parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static protobuf_unittest.UnittestLiteImportsNonlite.TestLiteImportsNonlite parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static protobuf_unittest.UnittestLiteImportsNonlite.TestLiteImportsNonlite parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static protobuf_unittest.UnittestLiteImportsNonlite.TestLiteImportsNonlite parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(protobuf_unittest.UnittestLiteImportsNonlite.TestLiteImportsNonlite prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code protobuf_unittest.TestLiteImportsNonlite}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          protobuf_unittest.UnittestLiteImportsNonlite.TestLiteImportsNonlite, Builder> implements
        // @@protoc_insertion_point(builder_implements:protobuf_unittest.TestLiteImportsNonlite)
        protobuf_unittest.UnittestLiteImportsNonlite.TestLiteImportsNonliteOrBuilder {
      // Construct using protobuf_unittest.UnittestLiteImportsNonlite.TestLiteImportsNonlite.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>optional .protobuf_unittest.TestAllTypes message = 1;</code>
       */
      public boolean hasMessage() {
        return instance.hasMessage();
      }
      /**
       * <code>optional .protobuf_unittest.TestAllTypes message = 1;</code>
       */
      public protobuf_unittest.UnittestProto.TestAllTypes getMessage() {
        return instance.getMessage();
      }
      /**
       * <code>optional .protobuf_unittest.TestAllTypes message = 1;</code>
       */
      public Builder setMessage(protobuf_unittest.UnittestProto.TestAllTypes value) {
        copyOnWrite();
        instance.setMessage(value);
        return this;
        }
      /**
       * <code>optional .protobuf_unittest.TestAllTypes message = 1;</code>
       */
      public Builder setMessage(
          protobuf_unittest.UnittestProto.TestAllTypes.Builder builderForValue) {
        copyOnWrite();
        instance.setMessage(builderForValue);
        return this;
      }
      /**
       * <code>optional .protobuf_unittest.TestAllTypes message = 1;</code>
       */
      public Builder mergeMessage(protobuf_unittest.UnittestProto.TestAllTypes value) {
        copyOnWrite();
        instance.mergeMessage(value);
        return this;
      }
      /**
       * <code>optional .protobuf_unittest.TestAllTypes message = 1;</code>
       */
      public Builder clearMessage() {  copyOnWrite();
        instance.clearMessage();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:protobuf_unittest.TestLiteImportsNonlite)
    }
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new protobuf_unittest.UnittestLiteImportsNonlite.TestLiteImportsNonlite();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          protobuf_unittest.UnittestLiteImportsNonlite.TestLiteImportsNonlite other = (protobuf_unittest.UnittestLiteImportsNonlite.TestLiteImportsNonlite) arg1;
          message_ = visitor.visitMessage(message_, other.message_);
          if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
              .INSTANCE) {
            bitField0_ |= other.bitField0_;
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                default: {
                  if (!parseUnknownField(tag, input)) {
                    done = true;
                  }
                  break;
                }
                case 10: {
                  protobuf_unittest.UnittestProto.TestAllTypes.Builder subBuilder = null;
                  if (((bitField0_ & 0x00000001) == 0x00000001)) {
                    subBuilder = message_.toBuilder();
                  }
                  message_ = input.readMessage(protobuf_unittest.UnittestProto.TestAllTypes.parser(), extensionRegistry);
                  if (subBuilder != null) {
                    subBuilder.mergeFrom(message_);
                    message_ = subBuilder.buildPartial();
                  }
                  bitField0_ |= 0x00000001;
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (protobuf_unittest.UnittestLiteImportsNonlite.TestLiteImportsNonlite.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
        }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:protobuf_unittest.TestLiteImportsNonlite)
    private static final protobuf_unittest.UnittestLiteImportsNonlite.TestLiteImportsNonlite DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new TestLiteImportsNonlite();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static protobuf_unittest.UnittestLiteImportsNonlite.TestLiteImportsNonlite getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<TestLiteImportsNonlite> PARSER;

    public static com.google.protobuf.Parser<TestLiteImportsNonlite> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}