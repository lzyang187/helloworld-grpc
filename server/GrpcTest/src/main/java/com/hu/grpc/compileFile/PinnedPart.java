// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloWorld.proto

package com.hu.grpc.compileFile;

/**
 * Protobuf type {@code com.hu.grpc.compileFile.PinnedPart}
 */
public  final class PinnedPart extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.hu.grpc.compileFile.PinnedPart)
    PinnedPartOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PinnedPart.newBuilder() to construct.
  private PinnedPart(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PinnedPart() {
    partType_ = 0;
    ignoreMcc_ = false;
    dataSet_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PinnedPart(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            partType_ = input.readInt32();
            break;
          }
          case 16: {

            ignoreMcc_ = input.readBool();
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              dataSet_ = new java.util.ArrayList<com.hu.grpc.compileFile.Greeting>();
              mutable_bitField0_ |= 0x00000004;
            }
            dataSet_.add(
                input.readMessage(com.hu.grpc.compileFile.Greeting.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        dataSet_ = java.util.Collections.unmodifiableList(dataSet_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hu.grpc.compileFile.HelloWorld.internal_static_com_hu_grpc_compileFile_PinnedPart_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hu.grpc.compileFile.HelloWorld.internal_static_com_hu_grpc_compileFile_PinnedPart_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hu.grpc.compileFile.PinnedPart.class, com.hu.grpc.compileFile.PinnedPart.Builder.class);
  }

  private int bitField0_;
  public static final int PARTTYPE_FIELD_NUMBER = 1;
  private int partType_;
  /**
   * <code>int32 partType = 1;</code>
   */
  public int getPartType() {
    return partType_;
  }

  public static final int IGNOREMCC_FIELD_NUMBER = 2;
  private boolean ignoreMcc_;
  /**
   * <code>bool ignoreMcc = 2;</code>
   */
  public boolean getIgnoreMcc() {
    return ignoreMcc_;
  }

  public static final int DATASET_FIELD_NUMBER = 3;
  private java.util.List<com.hu.grpc.compileFile.Greeting> dataSet_;
  /**
   * <code>repeated .com.hu.grpc.compileFile.Greeting dataSet = 3;</code>
   */
  public java.util.List<com.hu.grpc.compileFile.Greeting> getDataSetList() {
    return dataSet_;
  }
  /**
   * <code>repeated .com.hu.grpc.compileFile.Greeting dataSet = 3;</code>
   */
  public java.util.List<? extends com.hu.grpc.compileFile.GreetingOrBuilder> 
      getDataSetOrBuilderList() {
    return dataSet_;
  }
  /**
   * <code>repeated .com.hu.grpc.compileFile.Greeting dataSet = 3;</code>
   */
  public int getDataSetCount() {
    return dataSet_.size();
  }
  /**
   * <code>repeated .com.hu.grpc.compileFile.Greeting dataSet = 3;</code>
   */
  public com.hu.grpc.compileFile.Greeting getDataSet(int index) {
    return dataSet_.get(index);
  }
  /**
   * <code>repeated .com.hu.grpc.compileFile.Greeting dataSet = 3;</code>
   */
  public com.hu.grpc.compileFile.GreetingOrBuilder getDataSetOrBuilder(
      int index) {
    return dataSet_.get(index);
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
    if (partType_ != 0) {
      output.writeInt32(1, partType_);
    }
    if (ignoreMcc_ != false) {
      output.writeBool(2, ignoreMcc_);
    }
    for (int i = 0; i < dataSet_.size(); i++) {
      output.writeMessage(3, dataSet_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (partType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, partType_);
    }
    if (ignoreMcc_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, ignoreMcc_);
    }
    for (int i = 0; i < dataSet_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, dataSet_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.hu.grpc.compileFile.PinnedPart)) {
      return super.equals(obj);
    }
    com.hu.grpc.compileFile.PinnedPart other = (com.hu.grpc.compileFile.PinnedPart) obj;

    boolean result = true;
    result = result && (getPartType()
        == other.getPartType());
    result = result && (getIgnoreMcc()
        == other.getIgnoreMcc());
    result = result && getDataSetList()
        .equals(other.getDataSetList());
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
    hash = (37 * hash) + PARTTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getPartType();
    hash = (37 * hash) + IGNOREMCC_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIgnoreMcc());
    if (getDataSetCount() > 0) {
      hash = (37 * hash) + DATASET_FIELD_NUMBER;
      hash = (53 * hash) + getDataSetList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hu.grpc.compileFile.PinnedPart parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hu.grpc.compileFile.PinnedPart parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hu.grpc.compileFile.PinnedPart parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hu.grpc.compileFile.PinnedPart parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hu.grpc.compileFile.PinnedPart parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hu.grpc.compileFile.PinnedPart parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hu.grpc.compileFile.PinnedPart parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hu.grpc.compileFile.PinnedPart parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hu.grpc.compileFile.PinnedPart parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.hu.grpc.compileFile.PinnedPart parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hu.grpc.compileFile.PinnedPart parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hu.grpc.compileFile.PinnedPart parseFrom(
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
  public static Builder newBuilder(com.hu.grpc.compileFile.PinnedPart prototype) {
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
   * Protobuf type {@code com.hu.grpc.compileFile.PinnedPart}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.hu.grpc.compileFile.PinnedPart)
      com.hu.grpc.compileFile.PinnedPartOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hu.grpc.compileFile.HelloWorld.internal_static_com_hu_grpc_compileFile_PinnedPart_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hu.grpc.compileFile.HelloWorld.internal_static_com_hu_grpc_compileFile_PinnedPart_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hu.grpc.compileFile.PinnedPart.class, com.hu.grpc.compileFile.PinnedPart.Builder.class);
    }

    // Construct using com.hu.grpc.compileFile.PinnedPart.newBuilder()
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
        getDataSetFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      partType_ = 0;

      ignoreMcc_ = false;

      if (dataSetBuilder_ == null) {
        dataSet_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        dataSetBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hu.grpc.compileFile.HelloWorld.internal_static_com_hu_grpc_compileFile_PinnedPart_descriptor;
    }

    public com.hu.grpc.compileFile.PinnedPart getDefaultInstanceForType() {
      return com.hu.grpc.compileFile.PinnedPart.getDefaultInstance();
    }

    public com.hu.grpc.compileFile.PinnedPart build() {
      com.hu.grpc.compileFile.PinnedPart result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.hu.grpc.compileFile.PinnedPart buildPartial() {
      com.hu.grpc.compileFile.PinnedPart result = new com.hu.grpc.compileFile.PinnedPart(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.partType_ = partType_;
      result.ignoreMcc_ = ignoreMcc_;
      if (dataSetBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          dataSet_ = java.util.Collections.unmodifiableList(dataSet_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.dataSet_ = dataSet_;
      } else {
        result.dataSet_ = dataSetBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
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
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.hu.grpc.compileFile.PinnedPart) {
        return mergeFrom((com.hu.grpc.compileFile.PinnedPart)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hu.grpc.compileFile.PinnedPart other) {
      if (other == com.hu.grpc.compileFile.PinnedPart.getDefaultInstance()) return this;
      if (other.getPartType() != 0) {
        setPartType(other.getPartType());
      }
      if (other.getIgnoreMcc() != false) {
        setIgnoreMcc(other.getIgnoreMcc());
      }
      if (dataSetBuilder_ == null) {
        if (!other.dataSet_.isEmpty()) {
          if (dataSet_.isEmpty()) {
            dataSet_ = other.dataSet_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureDataSetIsMutable();
            dataSet_.addAll(other.dataSet_);
          }
          onChanged();
        }
      } else {
        if (!other.dataSet_.isEmpty()) {
          if (dataSetBuilder_.isEmpty()) {
            dataSetBuilder_.dispose();
            dataSetBuilder_ = null;
            dataSet_ = other.dataSet_;
            bitField0_ = (bitField0_ & ~0x00000004);
            dataSetBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDataSetFieldBuilder() : null;
          } else {
            dataSetBuilder_.addAllMessages(other.dataSet_);
          }
        }
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
      com.hu.grpc.compileFile.PinnedPart parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.hu.grpc.compileFile.PinnedPart) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int partType_ ;
    /**
     * <code>int32 partType = 1;</code>
     */
    public int getPartType() {
      return partType_;
    }
    /**
     * <code>int32 partType = 1;</code>
     */
    public Builder setPartType(int value) {
      
      partType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 partType = 1;</code>
     */
    public Builder clearPartType() {
      
      partType_ = 0;
      onChanged();
      return this;
    }

    private boolean ignoreMcc_ ;
    /**
     * <code>bool ignoreMcc = 2;</code>
     */
    public boolean getIgnoreMcc() {
      return ignoreMcc_;
    }
    /**
     * <code>bool ignoreMcc = 2;</code>
     */
    public Builder setIgnoreMcc(boolean value) {
      
      ignoreMcc_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool ignoreMcc = 2;</code>
     */
    public Builder clearIgnoreMcc() {
      
      ignoreMcc_ = false;
      onChanged();
      return this;
    }

    private java.util.List<com.hu.grpc.compileFile.Greeting> dataSet_ =
      java.util.Collections.emptyList();
    private void ensureDataSetIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        dataSet_ = new java.util.ArrayList<com.hu.grpc.compileFile.Greeting>(dataSet_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.hu.grpc.compileFile.Greeting, com.hu.grpc.compileFile.Greeting.Builder, com.hu.grpc.compileFile.GreetingOrBuilder> dataSetBuilder_;

    /**
     * <code>repeated .com.hu.grpc.compileFile.Greeting dataSet = 3;</code>
     */
    public java.util.List<com.hu.grpc.compileFile.Greeting> getDataSetList() {
      if (dataSetBuilder_ == null) {
        return java.util.Collections.unmodifiableList(dataSet_);
      } else {
        return dataSetBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.hu.grpc.compileFile.Greeting dataSet = 3;</code>
     */
    public int getDataSetCount() {
      if (dataSetBuilder_ == null) {
        return dataSet_.size();
      } else {
        return dataSetBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.hu.grpc.compileFile.Greeting dataSet = 3;</code>
     */
    public com.hu.grpc.compileFile.Greeting getDataSet(int index) {
      if (dataSetBuilder_ == null) {
        return dataSet_.get(index);
      } else {
        return dataSetBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.hu.grpc.compileFile.Greeting dataSet = 3;</code>
     */
    public Builder setDataSet(
        int index, com.hu.grpc.compileFile.Greeting value) {
      if (dataSetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataSetIsMutable();
        dataSet_.set(index, value);
        onChanged();
      } else {
        dataSetBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.hu.grpc.compileFile.Greeting dataSet = 3;</code>
     */
    public Builder setDataSet(
        int index, com.hu.grpc.compileFile.Greeting.Builder builderForValue) {
      if (dataSetBuilder_ == null) {
        ensureDataSetIsMutable();
        dataSet_.set(index, builderForValue.build());
        onChanged();
      } else {
        dataSetBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.hu.grpc.compileFile.Greeting dataSet = 3;</code>
     */
    public Builder addDataSet(com.hu.grpc.compileFile.Greeting value) {
      if (dataSetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataSetIsMutable();
        dataSet_.add(value);
        onChanged();
      } else {
        dataSetBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.hu.grpc.compileFile.Greeting dataSet = 3;</code>
     */
    public Builder addDataSet(
        int index, com.hu.grpc.compileFile.Greeting value) {
      if (dataSetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataSetIsMutable();
        dataSet_.add(index, value);
        onChanged();
      } else {
        dataSetBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.hu.grpc.compileFile.Greeting dataSet = 3;</code>
     */
    public Builder addDataSet(
        com.hu.grpc.compileFile.Greeting.Builder builderForValue) {
      if (dataSetBuilder_ == null) {
        ensureDataSetIsMutable();
        dataSet_.add(builderForValue.build());
        onChanged();
      } else {
        dataSetBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.hu.grpc.compileFile.Greeting dataSet = 3;</code>
     */
    public Builder addDataSet(
        int index, com.hu.grpc.compileFile.Greeting.Builder builderForValue) {
      if (dataSetBuilder_ == null) {
        ensureDataSetIsMutable();
        dataSet_.add(index, builderForValue.build());
        onChanged();
      } else {
        dataSetBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.hu.grpc.compileFile.Greeting dataSet = 3;</code>
     */
    public Builder addAllDataSet(
        java.lang.Iterable<? extends com.hu.grpc.compileFile.Greeting> values) {
      if (dataSetBuilder_ == null) {
        ensureDataSetIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, dataSet_);
        onChanged();
      } else {
        dataSetBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.hu.grpc.compileFile.Greeting dataSet = 3;</code>
     */
    public Builder clearDataSet() {
      if (dataSetBuilder_ == null) {
        dataSet_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        dataSetBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.hu.grpc.compileFile.Greeting dataSet = 3;</code>
     */
    public Builder removeDataSet(int index) {
      if (dataSetBuilder_ == null) {
        ensureDataSetIsMutable();
        dataSet_.remove(index);
        onChanged();
      } else {
        dataSetBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.hu.grpc.compileFile.Greeting dataSet = 3;</code>
     */
    public com.hu.grpc.compileFile.Greeting.Builder getDataSetBuilder(
        int index) {
      return getDataSetFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.hu.grpc.compileFile.Greeting dataSet = 3;</code>
     */
    public com.hu.grpc.compileFile.GreetingOrBuilder getDataSetOrBuilder(
        int index) {
      if (dataSetBuilder_ == null) {
        return dataSet_.get(index);  } else {
        return dataSetBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.hu.grpc.compileFile.Greeting dataSet = 3;</code>
     */
    public java.util.List<? extends com.hu.grpc.compileFile.GreetingOrBuilder> 
         getDataSetOrBuilderList() {
      if (dataSetBuilder_ != null) {
        return dataSetBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(dataSet_);
      }
    }
    /**
     * <code>repeated .com.hu.grpc.compileFile.Greeting dataSet = 3;</code>
     */
    public com.hu.grpc.compileFile.Greeting.Builder addDataSetBuilder() {
      return getDataSetFieldBuilder().addBuilder(
          com.hu.grpc.compileFile.Greeting.getDefaultInstance());
    }
    /**
     * <code>repeated .com.hu.grpc.compileFile.Greeting dataSet = 3;</code>
     */
    public com.hu.grpc.compileFile.Greeting.Builder addDataSetBuilder(
        int index) {
      return getDataSetFieldBuilder().addBuilder(
          index, com.hu.grpc.compileFile.Greeting.getDefaultInstance());
    }
    /**
     * <code>repeated .com.hu.grpc.compileFile.Greeting dataSet = 3;</code>
     */
    public java.util.List<com.hu.grpc.compileFile.Greeting.Builder> 
         getDataSetBuilderList() {
      return getDataSetFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.hu.grpc.compileFile.Greeting, com.hu.grpc.compileFile.Greeting.Builder, com.hu.grpc.compileFile.GreetingOrBuilder> 
        getDataSetFieldBuilder() {
      if (dataSetBuilder_ == null) {
        dataSetBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.hu.grpc.compileFile.Greeting, com.hu.grpc.compileFile.Greeting.Builder, com.hu.grpc.compileFile.GreetingOrBuilder>(
                dataSet_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        dataSet_ = null;
      }
      return dataSetBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.hu.grpc.compileFile.PinnedPart)
  }

  // @@protoc_insertion_point(class_scope:com.hu.grpc.compileFile.PinnedPart)
  private static final com.hu.grpc.compileFile.PinnedPart DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hu.grpc.compileFile.PinnedPart();
  }

  public static com.hu.grpc.compileFile.PinnedPart getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PinnedPart>
      PARSER = new com.google.protobuf.AbstractParser<PinnedPart>() {
    public PinnedPart parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PinnedPart(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PinnedPart> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PinnedPart> getParserForType() {
    return PARSER;
  }

  public com.hu.grpc.compileFile.PinnedPart getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

