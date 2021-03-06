// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/google/protobuf/nested_extension_lite.proto

package protobuf_unittest;

public final class NestedExtensionLite {
  private NestedExtensionLite() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(protobuf_unittest.NestedExtensionLite.MyNestedExtensionLite.recursiveExtensionLite);
  }
  public interface MyNestedExtensionLiteOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protobuf_unittest.MyNestedExtensionLite)
      com.google.protobuf.MessageLiteOrBuilder {
  }
  /**
   * Protobuf type {@code protobuf_unittest.MyNestedExtensionLite}
   */
  public  static final class MyNestedExtensionLite extends
      com.google.protobuf.GeneratedMessageLite<
          MyNestedExtensionLite, MyNestedExtensionLite.Builder> implements
      // @@protoc_insertion_point(message_implements:protobuf_unittest.MyNestedExtensionLite)
      MyNestedExtensionLiteOrBuilder {
    private MyNestedExtensionLite() {
    }
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static protobuf_unittest.NestedExtensionLite.MyNestedExtensionLite parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static protobuf_unittest.NestedExtensionLite.MyNestedExtensionLite parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static protobuf_unittest.NestedExtensionLite.MyNestedExtensionLite parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static protobuf_unittest.NestedExtensionLite.MyNestedExtensionLite parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static protobuf_unittest.NestedExtensionLite.MyNestedExtensionLite parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static protobuf_unittest.NestedExtensionLite.MyNestedExtensionLite parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static protobuf_unittest.NestedExtensionLite.MyNestedExtensionLite parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static protobuf_unittest.NestedExtensionLite.MyNestedExtensionLite parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static protobuf_unittest.NestedExtensionLite.MyNestedExtensionLite parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static protobuf_unittest.NestedExtensionLite.MyNestedExtensionLite parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static protobuf_unittest.NestedExtensionLite.MyNestedExtensionLite parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static protobuf_unittest.NestedExtensionLite.MyNestedExtensionLite parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(protobuf_unittest.NestedExtensionLite.MyNestedExtensionLite prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code protobuf_unittest.MyNestedExtensionLite}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          protobuf_unittest.NestedExtensionLite.MyNestedExtensionLite, Builder> implements
        // @@protoc_insertion_point(builder_implements:protobuf_unittest.MyNestedExtensionLite)
        protobuf_unittest.NestedExtensionLite.MyNestedExtensionLiteOrBuilder {
      // Construct using protobuf_unittest.NestedExtensionLite.MyNestedExtensionLite.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      // @@protoc_insertion_point(builder_scope:protobuf_unittest.MyNestedExtensionLite)
    }
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new protobuf_unittest.NestedExtensionLite.MyNestedExtensionLite();
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
          protobuf_unittest.NestedExtensionLite.MyNestedExtensionLite other = (protobuf_unittest.NestedExtensionLite.MyNestedExtensionLite) arg1;
          if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
              .INSTANCE) {
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
          if (PARSER == null) {    synchronized (protobuf_unittest.NestedExtensionLite.MyNestedExtensionLite.class) {
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


    // @@protoc_insertion_point(class_scope:protobuf_unittest.MyNestedExtensionLite)
    private static final protobuf_unittest.NestedExtensionLite.MyNestedExtensionLite DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new MyNestedExtensionLite();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static protobuf_unittest.NestedExtensionLite.MyNestedExtensionLite getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<MyNestedExtensionLite> PARSER;

    public static com.google.protobuf.Parser<MyNestedExtensionLite> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
    public static final int RECURSIVEEXTENSIONLITE_FIELD_NUMBER = 3;
    /**
     * <code>extend .protobuf_unittest.MessageLiteToBeExtended { ... }</code>
     */
    public static final
      com.google.protobuf.GeneratedMessageLite.GeneratedExtension<
        protobuf_unittest.NonNestedExtensionLite.MessageLiteToBeExtended,
        protobuf_unittest.NonNestedExtensionLite.MessageLiteToBeExtended> recursiveExtensionLite = com.google.protobuf.GeneratedMessageLite
            .newSingularGeneratedExtension(
          protobuf_unittest.NonNestedExtensionLite.MessageLiteToBeExtended.getDefaultInstance(),
          protobuf_unittest.NonNestedExtensionLite.MessageLiteToBeExtended.getDefaultInstance(),
          protobuf_unittest.NonNestedExtensionLite.MessageLiteToBeExtended.getDefaultInstance(),
          null,
          3,
          com.google.protobuf.WireFormat.FieldType.MESSAGE,
          protobuf_unittest.NonNestedExtensionLite.MessageLiteToBeExtended.class);
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
