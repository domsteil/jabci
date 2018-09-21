// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package com.github.jtendermint.jabci.types;

/**
 * Protobuf type {@code com.github.jtendermint.jabci.types.ResponseQuery}
 */
public  final class ResponseQuery extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.github.jtendermint.jabci.types.ResponseQuery)
    ResponseQueryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResponseQuery.newBuilder() to construct.
  private ResponseQuery(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResponseQuery() {
    code_ = 0;
    log_ = "";
    info_ = "";
    index_ = 0L;
    key_ = com.google.protobuf.ByteString.EMPTY;
    value_ = com.google.protobuf.ByteString.EMPTY;
    proof_ = com.google.protobuf.ByteString.EMPTY;
    height_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ResponseQuery(
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
          case 8: {

            code_ = input.readUInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            log_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            info_ = s;
            break;
          }
          case 40: {

            index_ = input.readInt64();
            break;
          }
          case 50: {

            key_ = input.readBytes();
            break;
          }
          case 58: {

            value_ = input.readBytes();
            break;
          }
          case 66: {

            proof_ = input.readBytes();
            break;
          }
          case 72: {

            height_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
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
    return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_ResponseQuery_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_ResponseQuery_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.jtendermint.jabci.types.ResponseQuery.class, com.github.jtendermint.jabci.types.ResponseQuery.Builder.class);
  }

  public static final int CODE_FIELD_NUMBER = 1;
  private int code_;
  /**
   * <code>uint32 code = 1;</code>
   */
  public int getCode() {
    return code_;
  }

  public static final int LOG_FIELD_NUMBER = 3;
  private volatile java.lang.Object log_;
  /**
   * <pre>
   * bytes data = 2; // use "value" instead.
   * </pre>
   *
   * <code>string log = 3;</code>
   */
  public java.lang.String getLog() {
    java.lang.Object ref = log_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      log_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * bytes data = 2; // use "value" instead.
   * </pre>
   *
   * <code>string log = 3;</code>
   */
  public com.google.protobuf.ByteString
      getLogBytes() {
    java.lang.Object ref = log_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      log_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INFO_FIELD_NUMBER = 4;
  private volatile java.lang.Object info_;
  /**
   * <pre>
   * nondeterministic
   * </pre>
   *
   * <code>string info = 4;</code>
   */
  public java.lang.String getInfo() {
    java.lang.Object ref = info_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      info_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * nondeterministic
   * </pre>
   *
   * <code>string info = 4;</code>
   */
  public com.google.protobuf.ByteString
      getInfoBytes() {
    java.lang.Object ref = info_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      info_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INDEX_FIELD_NUMBER = 5;
  private long index_;
  /**
   * <code>int64 index = 5;</code>
   */
  public long getIndex() {
    return index_;
  }

  public static final int KEY_FIELD_NUMBER = 6;
  private com.google.protobuf.ByteString key_;
  /**
   * <code>bytes key = 6;</code>
   */
  public com.google.protobuf.ByteString getKey() {
    return key_;
  }

  public static final int VALUE_FIELD_NUMBER = 7;
  private com.google.protobuf.ByteString value_;
  /**
   * <code>bytes value = 7;</code>
   */
  public com.google.protobuf.ByteString getValue() {
    return value_;
  }

  public static final int PROOF_FIELD_NUMBER = 8;
  private com.google.protobuf.ByteString proof_;
  /**
   * <code>bytes proof = 8;</code>
   */
  public com.google.protobuf.ByteString getProof() {
    return proof_;
  }

  public static final int HEIGHT_FIELD_NUMBER = 9;
  private long height_;
  /**
   * <code>int64 height = 9;</code>
   */
  public long getHeight() {
    return height_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (code_ != 0) {
      output.writeUInt32(1, code_);
    }
    if (!getLogBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, log_);
    }
    if (!getInfoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, info_);
    }
    if (index_ != 0L) {
      output.writeInt64(5, index_);
    }
    if (!key_.isEmpty()) {
      output.writeBytes(6, key_);
    }
    if (!value_.isEmpty()) {
      output.writeBytes(7, value_);
    }
    if (!proof_.isEmpty()) {
      output.writeBytes(8, proof_);
    }
    if (height_ != 0L) {
      output.writeInt64(9, height_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (code_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, code_);
    }
    if (!getLogBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, log_);
    }
    if (!getInfoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, info_);
    }
    if (index_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, index_);
    }
    if (!key_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(6, key_);
    }
    if (!value_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(7, value_);
    }
    if (!proof_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(8, proof_);
    }
    if (height_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(9, height_);
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
    if (!(obj instanceof com.github.jtendermint.jabci.types.ResponseQuery)) {
      return super.equals(obj);
    }
    com.github.jtendermint.jabci.types.ResponseQuery other = (com.github.jtendermint.jabci.types.ResponseQuery) obj;

    boolean result = true;
    result = result && (getCode()
        == other.getCode());
    result = result && getLog()
        .equals(other.getLog());
    result = result && getInfo()
        .equals(other.getInfo());
    result = result && (getIndex()
        == other.getIndex());
    result = result && getKey()
        .equals(other.getKey());
    result = result && getValue()
        .equals(other.getValue());
    result = result && getProof()
        .equals(other.getProof());
    result = result && (getHeight()
        == other.getHeight());
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
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCode();
    hash = (37 * hash) + LOG_FIELD_NUMBER;
    hash = (53 * hash) + getLog().hashCode();
    hash = (37 * hash) + INFO_FIELD_NUMBER;
    hash = (53 * hash) + getInfo().hashCode();
    hash = (37 * hash) + INDEX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getIndex());
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getValue().hashCode();
    hash = (37 * hash) + PROOF_FIELD_NUMBER;
    hash = (53 * hash) + getProof().hashCode();
    hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHeight());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.jtendermint.jabci.types.ResponseQuery parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.jtendermint.jabci.types.ResponseQuery parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.ResponseQuery parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.jtendermint.jabci.types.ResponseQuery parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.ResponseQuery parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.jtendermint.jabci.types.ResponseQuery parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.ResponseQuery parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.jtendermint.jabci.types.ResponseQuery parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.ResponseQuery parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.jtendermint.jabci.types.ResponseQuery parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.ResponseQuery parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.jtendermint.jabci.types.ResponseQuery parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.jtendermint.jabci.types.ResponseQuery prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code com.github.jtendermint.jabci.types.ResponseQuery}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.github.jtendermint.jabci.types.ResponseQuery)
      com.github.jtendermint.jabci.types.ResponseQueryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_ResponseQuery_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_ResponseQuery_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.jtendermint.jabci.types.ResponseQuery.class, com.github.jtendermint.jabci.types.ResponseQuery.Builder.class);
    }

    // Construct using com.github.jtendermint.jabci.types.ResponseQuery.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      code_ = 0;

      log_ = "";

      info_ = "";

      index_ = 0L;

      key_ = com.google.protobuf.ByteString.EMPTY;

      value_ = com.google.protobuf.ByteString.EMPTY;

      proof_ = com.google.protobuf.ByteString.EMPTY;

      height_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_ResponseQuery_descriptor;
    }

    @java.lang.Override
    public com.github.jtendermint.jabci.types.ResponseQuery getDefaultInstanceForType() {
      return com.github.jtendermint.jabci.types.ResponseQuery.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.jtendermint.jabci.types.ResponseQuery build() {
      com.github.jtendermint.jabci.types.ResponseQuery result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.jtendermint.jabci.types.ResponseQuery buildPartial() {
      com.github.jtendermint.jabci.types.ResponseQuery result = new com.github.jtendermint.jabci.types.ResponseQuery(this);
      result.code_ = code_;
      result.log_ = log_;
      result.info_ = info_;
      result.index_ = index_;
      result.key_ = key_;
      result.value_ = value_;
      result.proof_ = proof_;
      result.height_ = height_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.jtendermint.jabci.types.ResponseQuery) {
        return mergeFrom((com.github.jtendermint.jabci.types.ResponseQuery)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.jtendermint.jabci.types.ResponseQuery other) {
      if (other == com.github.jtendermint.jabci.types.ResponseQuery.getDefaultInstance()) return this;
      if (other.getCode() != 0) {
        setCode(other.getCode());
      }
      if (!other.getLog().isEmpty()) {
        log_ = other.log_;
        onChanged();
      }
      if (!other.getInfo().isEmpty()) {
        info_ = other.info_;
        onChanged();
      }
      if (other.getIndex() != 0L) {
        setIndex(other.getIndex());
      }
      if (other.getKey() != com.google.protobuf.ByteString.EMPTY) {
        setKey(other.getKey());
      }
      if (other.getValue() != com.google.protobuf.ByteString.EMPTY) {
        setValue(other.getValue());
      }
      if (other.getProof() != com.google.protobuf.ByteString.EMPTY) {
        setProof(other.getProof());
      }
      if (other.getHeight() != 0L) {
        setHeight(other.getHeight());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.github.jtendermint.jabci.types.ResponseQuery parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.jtendermint.jabci.types.ResponseQuery) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int code_ ;
    /**
     * <code>uint32 code = 1;</code>
     */
    public int getCode() {
      return code_;
    }
    /**
     * <code>uint32 code = 1;</code>
     */
    public Builder setCode(int value) {
      
      code_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 code = 1;</code>
     */
    public Builder clearCode() {
      
      code_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object log_ = "";
    /**
     * <pre>
     * bytes data = 2; // use "value" instead.
     * </pre>
     *
     * <code>string log = 3;</code>
     */
    public java.lang.String getLog() {
      java.lang.Object ref = log_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        log_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * bytes data = 2; // use "value" instead.
     * </pre>
     *
     * <code>string log = 3;</code>
     */
    public com.google.protobuf.ByteString
        getLogBytes() {
      java.lang.Object ref = log_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        log_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * bytes data = 2; // use "value" instead.
     * </pre>
     *
     * <code>string log = 3;</code>
     */
    public Builder setLog(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      log_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * bytes data = 2; // use "value" instead.
     * </pre>
     *
     * <code>string log = 3;</code>
     */
    public Builder clearLog() {
      
      log_ = getDefaultInstance().getLog();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * bytes data = 2; // use "value" instead.
     * </pre>
     *
     * <code>string log = 3;</code>
     */
    public Builder setLogBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      log_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object info_ = "";
    /**
     * <pre>
     * nondeterministic
     * </pre>
     *
     * <code>string info = 4;</code>
     */
    public java.lang.String getInfo() {
      java.lang.Object ref = info_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        info_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * nondeterministic
     * </pre>
     *
     * <code>string info = 4;</code>
     */
    public com.google.protobuf.ByteString
        getInfoBytes() {
      java.lang.Object ref = info_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        info_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * nondeterministic
     * </pre>
     *
     * <code>string info = 4;</code>
     */
    public Builder setInfo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      info_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * nondeterministic
     * </pre>
     *
     * <code>string info = 4;</code>
     */
    public Builder clearInfo() {
      
      info_ = getDefaultInstance().getInfo();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * nondeterministic
     * </pre>
     *
     * <code>string info = 4;</code>
     */
    public Builder setInfoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      info_ = value;
      onChanged();
      return this;
    }

    private long index_ ;
    /**
     * <code>int64 index = 5;</code>
     */
    public long getIndex() {
      return index_;
    }
    /**
     * <code>int64 index = 5;</code>
     */
    public Builder setIndex(long value) {
      
      index_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 index = 5;</code>
     */
    public Builder clearIndex() {
      
      index_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString key_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes key = 6;</code>
     */
    public com.google.protobuf.ByteString getKey() {
      return key_;
    }
    /**
     * <code>bytes key = 6;</code>
     */
    public Builder setKey(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      key_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes key = 6;</code>
     */
    public Builder clearKey() {
      
      key_ = getDefaultInstance().getKey();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString value_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes value = 7;</code>
     */
    public com.google.protobuf.ByteString getValue() {
      return value_;
    }
    /**
     * <code>bytes value = 7;</code>
     */
    public Builder setValue(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes value = 7;</code>
     */
    public Builder clearValue() {
      
      value_ = getDefaultInstance().getValue();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString proof_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes proof = 8;</code>
     */
    public com.google.protobuf.ByteString getProof() {
      return proof_;
    }
    /**
     * <code>bytes proof = 8;</code>
     */
    public Builder setProof(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      proof_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes proof = 8;</code>
     */
    public Builder clearProof() {
      
      proof_ = getDefaultInstance().getProof();
      onChanged();
      return this;
    }

    private long height_ ;
    /**
     * <code>int64 height = 9;</code>
     */
    public long getHeight() {
      return height_;
    }
    /**
     * <code>int64 height = 9;</code>
     */
    public Builder setHeight(long value) {
      
      height_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 height = 9;</code>
     */
    public Builder clearHeight() {
      
      height_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.github.jtendermint.jabci.types.ResponseQuery)
  }

  // @@protoc_insertion_point(class_scope:com.github.jtendermint.jabci.types.ResponseQuery)
  private static final com.github.jtendermint.jabci.types.ResponseQuery DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.jtendermint.jabci.types.ResponseQuery();
  }

  public static com.github.jtendermint.jabci.types.ResponseQuery getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResponseQuery>
      PARSER = new com.google.protobuf.AbstractParser<ResponseQuery>() {
    @java.lang.Override
    public ResponseQuery parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ResponseQuery(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ResponseQuery> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResponseQuery> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.jtendermint.jabci.types.ResponseQuery getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

