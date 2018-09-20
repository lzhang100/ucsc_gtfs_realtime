// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/type.proto

package com.google.protobuf;

public interface FieldOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.protobuf.Field)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The field type.
   * </pre>
   *
   * <code>.google.protobuf.Field.Kind kind = 1;</code>
   */
  int getKindValue();
  /**
   * <pre>
   * The field type.
   * </pre>
   *
   * <code>.google.protobuf.Field.Kind kind = 1;</code>
   */
  com.google.protobuf.Field.Kind getKind();

  /**
   * <pre>
   * The field cardinality.
   * </pre>
   *
   * <code>.google.protobuf.Field.Cardinality cardinality = 2;</code>
   */
  int getCardinalityValue();
  /**
   * <pre>
   * The field cardinality.
   * </pre>
   *
   * <code>.google.protobuf.Field.Cardinality cardinality = 2;</code>
   */
  com.google.protobuf.Field.Cardinality getCardinality();

  /**
   * <pre>
   * The field number.
   * </pre>
   *
   * <code>int32 number = 3;</code>
   */
  int getNumber();

  /**
   * <pre>
   * The field name.
   * </pre>
   *
   * <code>string name = 4;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The field name.
   * </pre>
   *
   * <code>string name = 4;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The field type URL, without the scheme, for message or enumeration
   * types. Example: `"type.googleapis.com/google.protobuf.Timestamp"`.
   * </pre>
   *
   * <code>string type_url = 6;</code>
   */
  java.lang.String getTypeUrl();
  /**
   * <pre>
   * The field type URL, without the scheme, for message or enumeration
   * types. Example: `"type.googleapis.com/google.protobuf.Timestamp"`.
   * </pre>
   *
   * <code>string type_url = 6;</code>
   */
  com.google.protobuf.ByteString
      getTypeUrlBytes();

  /**
   * <pre>
   * The index of the field type in `Type.oneofs`, for message or enumeration
   * types. The first type has index 1; zero means the type is not in the list.
   * </pre>
   *
   * <code>int32 oneof_index = 7;</code>
   */
  int getOneofIndex();

  /**
   * <pre>
   * Whether to use alternative packed wire representation.
   * </pre>
   *
   * <code>bool packed = 8;</code>
   */
  boolean getPacked();

  /**
   * <pre>
   * The protocol buffer options.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 9;</code>
   */
  java.util.List<com.google.protobuf.Option> 
      getOptionsList();
  /**
   * <pre>
   * The protocol buffer options.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 9;</code>
   */
  com.google.protobuf.Option getOptions(int index);
  /**
   * <pre>
   * The protocol buffer options.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 9;</code>
   */
  int getOptionsCount();
  /**
   * <pre>
   * The protocol buffer options.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 9;</code>
   */
  java.util.List<? extends com.google.protobuf.OptionOrBuilder> 
      getOptionsOrBuilderList();
  /**
   * <pre>
   * The protocol buffer options.
   * </pre>
   *
   * <code>repeated .google.protobuf.Option options = 9;</code>
   */
  com.google.protobuf.OptionOrBuilder getOptionsOrBuilder(
      int index);

  /**
   * <pre>
   * The field JSON name.
   * </pre>
   *
   * <code>string json_name = 10;</code>
   */
  java.lang.String getJsonName();
  /**
   * <pre>
   * The field JSON name.
   * </pre>
   *
   * <code>string json_name = 10;</code>
   */
  com.google.protobuf.ByteString
      getJsonNameBytes();

  /**
   * <pre>
   * The string value of the default value of this field. Proto2 syntax only.
   * </pre>
   *
   * <code>string default_value = 11;</code>
   */
  java.lang.String getDefaultValue();
  /**
   * <pre>
   * The string value of the default value of this field. Proto2 syntax only.
   * </pre>
   *
   * <code>string default_value = 11;</code>
   */
  com.google.protobuf.ByteString
      getDefaultValueBytes();
}
