// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/google/protobuf/nested_extension.proto

package protobuf_unittest;

public final class NestedExtension {
  private NestedExtension() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(protobuf_unittest.NestedExtension.MyNestedExtension.recursiveExtension);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MyNestedExtensionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protobuf_unittest.MyNestedExtension)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code protobuf_unittest.MyNestedExtension}
   */
  public  static final class MyNestedExtension extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:protobuf_unittest.MyNestedExtension)
      MyNestedExtensionOrBuilder {
    // Use MyNestedExtension.newBuilder() to construct.
    private MyNestedExtension(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MyNestedExtension() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MyNestedExtension(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
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
      return protobuf_unittest.NestedExtension.internal_static_protobuf_unittest_MyNestedExtension_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protobuf_unittest.NestedExtension.internal_static_protobuf_unittest_MyNestedExtension_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protobuf_unittest.NestedExtension.MyNestedExtension.class, protobuf_unittest.NestedExtension.MyNestedExtension.Builder.class);
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
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
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
      if (!(obj instanceof protobuf_unittest.NestedExtension.MyNestedExtension)) {
        return super.equals(obj);
      }
      protobuf_unittest.NestedExtension.MyNestedExtension other = (protobuf_unittest.NestedExtension.MyNestedExtension) obj;

      boolean result = true;
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
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static protobuf_unittest.NestedExtension.MyNestedExtension parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protobuf_unittest.NestedExtension.MyNestedExtension parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protobuf_unittest.NestedExtension.MyNestedExtension parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protobuf_unittest.NestedExtension.MyNestedExtension parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protobuf_unittest.NestedExtension.MyNestedExtension parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static protobuf_unittest.NestedExtension.MyNestedExtension parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static protobuf_unittest.NestedExtension.MyNestedExtension parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static protobuf_unittest.NestedExtension.MyNestedExtension parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static protobuf_unittest.NestedExtension.MyNestedExtension parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static protobuf_unittest.NestedExtension.MyNestedExtension parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static protobuf_unittest.NestedExtension.MyNestedExtension parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static protobuf_unittest.NestedExtension.MyNestedExtension parseFrom(
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
    public static Builder newBuilder(protobuf_unittest.NestedExtension.MyNestedExtension prototype) {
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
     * Protobuf type {@code protobuf_unittest.MyNestedExtension}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:protobuf_unittest.MyNestedExtension)
        protobuf_unittest.NestedExtension.MyNestedExtensionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return protobuf_unittest.NestedExtension.internal_static_protobuf_unittest_MyNestedExtension_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return protobuf_unittest.NestedExtension.internal_static_protobuf_unittest_MyNestedExtension_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                protobuf_unittest.NestedExtension.MyNestedExtension.class, protobuf_unittest.NestedExtension.MyNestedExtension.Builder.class);
      }

      // Construct using protobuf_unittest.NestedExtension.MyNestedExtension.newBuilder()
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
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return protobuf_unittest.NestedExtension.internal_static_protobuf_unittest_MyNestedExtension_descriptor;
      }

      public protobuf_unittest.NestedExtension.MyNestedExtension getDefaultInstanceForType() {
        return protobuf_unittest.NestedExtension.MyNestedExtension.getDefaultInstance();
      }

      public protobuf_unittest.NestedExtension.MyNestedExtension build() {
        protobuf_unittest.NestedExtension.MyNestedExtension result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public protobuf_unittest.NestedExtension.MyNestedExtension buildPartial() {
        protobuf_unittest.NestedExtension.MyNestedExtension result = new protobuf_unittest.NestedExtension.MyNestedExtension(this);
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
        if (other instanceof protobuf_unittest.NestedExtension.MyNestedExtension) {
          return mergeFrom((protobuf_unittest.NestedExtension.MyNestedExtension)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(protobuf_unittest.NestedExtension.MyNestedExtension other) {
        if (other == protobuf_unittest.NestedExtension.MyNestedExtension.getDefaultInstance()) return this;
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
        protobuf_unittest.NestedExtension.MyNestedExtension parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (protobuf_unittest.NestedExtension.MyNestedExtension) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
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


      // @@protoc_insertion_point(builder_scope:protobuf_unittest.MyNestedExtension)
    }

    // @@protoc_insertion_point(class_scope:protobuf_unittest.MyNestedExtension)
    private static final protobuf_unittest.NestedExtension.MyNestedExtension DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new protobuf_unittest.NestedExtension.MyNestedExtension();
    }

    public static protobuf_unittest.NestedExtension.MyNestedExtension getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<MyNestedExtension>
        PARSER = new com.google.protobuf.AbstractParser<MyNestedExtension>() {
      public MyNestedExtension parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new MyNestedExtension(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MyNestedExtension> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MyNestedExtension> getParserForType() {
      return PARSER;
    }

    public protobuf_unittest.NestedExtension.MyNestedExtension getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

    public static final int RECURSIVEEXTENSION_FIELD_NUMBER = 2;
    /**
     * <code>extend .protobuf_unittest.MessageToBeExtended { ... }</code>
     */
    public static final
      com.google.protobuf.GeneratedMessage.GeneratedExtension<
        protobuf_unittest.NonNestedExtension.MessageToBeExtended,
        protobuf_unittest.NonNestedExtension.MessageToBeExtended> recursiveExtension = com.google.protobuf.GeneratedMessage
            .newMessageScopedGeneratedExtension(
          protobuf_unittest.NestedExtension.MyNestedExtension.getDefaultInstance(),
          0,
          protobuf_unittest.NonNestedExtension.MessageToBeExtended.class,
          protobuf_unittest.NonNestedExtension.MessageToBeExtended.getDefaultInstance());
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protobuf_unittest_MyNestedExtension_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protobuf_unittest_MyNestedExtension_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*com/google/protobuf/nested_extension.p" +
      "roto\022\021protobuf_unittest\032.com/google/prot" +
      "obuf/non_nested_extension.proto\"\177\n\021MyNes" +
      "tedExtension2j\n\022recursiveExtension\022&.pro" +
      "tobuf_unittest.MessageToBeExtended\030\002 \001(\013" +
      "2&.protobuf_unittest.MessageToBeExtended"
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
          protobuf_unittest.NonNestedExtension.getDescriptor(),
        }, assigner);
    internal_static_protobuf_unittest_MyNestedExtension_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protobuf_unittest_MyNestedExtension_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protobuf_unittest_MyNestedExtension_descriptor,
        new java.lang.String[] { });
    protobuf_unittest.NonNestedExtension.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}