// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/google/protobuf/nested_builders_test.proto

package protobuf_unittest;

public final class NestedBuilders {
  private NestedBuilders() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protobuf_unittest_Vehicle_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protobuf_unittest_Vehicle_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protobuf_unittest_Engine_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protobuf_unittest_Engine_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protobuf_unittest_Wheel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protobuf_unittest_Wheel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.com/google/protobuf/nested_builders_te" +
      "st.proto\022\021protobuf_unittest\"]\n\007Vehicle\022)" +
      "\n\006engine\030\001 \001(\0132\031.protobuf_unittest.Engin" +
      "e\022\'\n\005wheel\030\002 \003(\0132\030.protobuf_unittest.Whe" +
      "el\"*\n\006Engine\022\020\n\010cylinder\030\001 \001(\005\022\016\n\006liters" +
      "\030\002 \001(\005\"&\n\005Wheel\022\016\n\006radius\030\001 \001(\005\022\r\n\005width" +
      "\030\002 \001(\005B\022B\016NestedBuildersP\001"
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
    internal_static_protobuf_unittest_Vehicle_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protobuf_unittest_Vehicle_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protobuf_unittest_Vehicle_descriptor,
        new java.lang.String[] { "Engine", "Wheel", });
    internal_static_protobuf_unittest_Engine_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_protobuf_unittest_Engine_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protobuf_unittest_Engine_descriptor,
        new java.lang.String[] { "Cylinder", "Liters", });
    internal_static_protobuf_unittest_Wheel_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_protobuf_unittest_Wheel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protobuf_unittest_Wheel_descriptor,
        new java.lang.String[] { "Radius", "Width", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
