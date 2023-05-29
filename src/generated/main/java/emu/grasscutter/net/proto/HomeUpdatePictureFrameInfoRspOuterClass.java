// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeUpdatePictureFrameInfoRsp.proto

package emu.grasscutter.net.proto;

public final class HomeUpdatePictureFrameInfoRspOuterClass {
    private HomeUpdatePictureFrameInfoRspOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface HomeUpdatePictureFrameInfoRspOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:HomeUpdatePictureFrameInfoRsp)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>int32 retcode = 15;</code>
         *
         * @return The retcode.
         */
        int getRetcode();

        /**
         * <code>.HomePictureFrameInfo picture_frame_info = 4;</code>
         *
         * @return Whether the pictureFrameInfo field is set.
         */
        boolean hasPictureFrameInfo();
        /**
         * <code>.HomePictureFrameInfo picture_frame_info = 4;</code>
         *
         * @return The pictureFrameInfo.
         */
        emu.grasscutter.net.proto.HomePictureFrameInfoOuterClass.HomePictureFrameInfo
                getPictureFrameInfo();
        /** <code>.HomePictureFrameInfo picture_frame_info = 4;</code> */
        emu.grasscutter.net.proto.HomePictureFrameInfoOuterClass.HomePictureFrameInfoOrBuilder
                getPictureFrameInfoOrBuilder();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 4886
     * Obf: NHMHOHMOOEH
     * </pre>
     *
     * Protobuf type {@code HomeUpdatePictureFrameInfoRsp}
     */
    public static final class HomeUpdatePictureFrameInfoRsp
            extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:HomeUpdatePictureFrameInfoRsp)
            HomeUpdatePictureFrameInfoRspOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use HomeUpdatePictureFrameInfoRsp.newBuilder() to construct.
        private HomeUpdatePictureFrameInfoRsp(
                com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private HomeUpdatePictureFrameInfoRsp() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new HomeUpdatePictureFrameInfoRsp();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private HomeUpdatePictureFrameInfoRsp(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
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
                        case 34:
                            {
                                emu.grasscutter.net.proto.HomePictureFrameInfoOuterClass.HomePictureFrameInfo
                                                .Builder
                                        subBuilder = null;
                                if (pictureFrameInfo_ != null) {
                                    subBuilder = pictureFrameInfo_.toBuilder();
                                }
                                pictureFrameInfo_ =
                                        input.readMessage(
                                                emu.grasscutter.net.proto.HomePictureFrameInfoOuterClass
                                                        .HomePictureFrameInfo.parser(),
                                                extensionRegistry);
                                if (subBuilder != null) {
                                    subBuilder.mergeFrom(pictureFrameInfo_);
                                    pictureFrameInfo_ = subBuilder.buildPartial();
                                }

                                break;
                            }
                        case 120:
                            {
                                retcode_ = input.readInt32();
                                break;
                            }
                        default:
                            {
                                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                    .internal_static_HomeUpdatePictureFrameInfoRsp_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                    .internal_static_HomeUpdatePictureFrameInfoRsp_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                                    .HomeUpdatePictureFrameInfoRsp.class,
                            emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                                    .HomeUpdatePictureFrameInfoRsp.Builder.class);
        }

        public static final int RETCODE_FIELD_NUMBER = 15;
        private int retcode_;
        /**
         * <code>int32 retcode = 15;</code>
         *
         * @return The retcode.
         */
        @java.lang.Override
        public int getRetcode() {
            return retcode_;
        }

        public static final int PICTURE_FRAME_INFO_FIELD_NUMBER = 4;
        private emu.grasscutter.net.proto.HomePictureFrameInfoOuterClass.HomePictureFrameInfo
                pictureFrameInfo_;
        /**
         * <code>.HomePictureFrameInfo picture_frame_info = 4;</code>
         *
         * @return Whether the pictureFrameInfo field is set.
         */
        @java.lang.Override
        public boolean hasPictureFrameInfo() {
            return pictureFrameInfo_ != null;
        }
        /**
         * <code>.HomePictureFrameInfo picture_frame_info = 4;</code>
         *
         * @return The pictureFrameInfo.
         */
        @java.lang.Override
        public emu.grasscutter.net.proto.HomePictureFrameInfoOuterClass.HomePictureFrameInfo
                getPictureFrameInfo() {
            return pictureFrameInfo_ == null
                    ? emu.grasscutter.net.proto.HomePictureFrameInfoOuterClass.HomePictureFrameInfo
                            .getDefaultInstance()
                    : pictureFrameInfo_;
        }
        /** <code>.HomePictureFrameInfo picture_frame_info = 4;</code> */
        @java.lang.Override
        public emu.grasscutter.net.proto.HomePictureFrameInfoOuterClass.HomePictureFrameInfoOrBuilder
                getPictureFrameInfoOrBuilder() {
            return getPictureFrameInfo();
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
        public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
            if (pictureFrameInfo_ != null) {
                output.writeMessage(4, getPictureFrameInfo());
            }
            if (retcode_ != 0) {
                output.writeInt32(15, retcode_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (pictureFrameInfo_ != null) {
                size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, getPictureFrameInfo());
            }
            if (retcode_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeInt32Size(15, retcode_);
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
            if (!(obj
                    instanceof
                    emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                            .HomeUpdatePictureFrameInfoRsp)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                            .HomeUpdatePictureFrameInfoRsp
                    other =
                            (emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                                            .HomeUpdatePictureFrameInfoRsp)
                                    obj;

            if (getRetcode() != other.getRetcode()) return false;
            if (hasPictureFrameInfo() != other.hasPictureFrameInfo()) return false;
            if (hasPictureFrameInfo()) {
                if (!getPictureFrameInfo().equals(other.getPictureFrameInfo())) return false;
            }
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + RETCODE_FIELD_NUMBER;
            hash = (53 * hash) + getRetcode();
            if (hasPictureFrameInfo()) {
                hash = (37 * hash) + PICTURE_FRAME_INFO_FIELD_NUMBER;
                hash = (53 * hash) + getPictureFrameInfo().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                        .HomeUpdatePictureFrameInfoRsp
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                        .HomeUpdatePictureFrameInfoRsp
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                        .HomeUpdatePictureFrameInfoRsp
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                        .HomeUpdatePictureFrameInfoRsp
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                        .HomeUpdatePictureFrameInfoRsp
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                        .HomeUpdatePictureFrameInfoRsp
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                        .HomeUpdatePictureFrameInfoRsp
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                        .HomeUpdatePictureFrameInfoRsp
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                        .HomeUpdatePictureFrameInfoRsp
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                        .HomeUpdatePictureFrameInfoRsp
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                        .HomeUpdatePictureFrameInfoRsp
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                        .HomeUpdatePictureFrameInfoRsp
                parseFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(
                emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                                .HomeUpdatePictureFrameInfoRsp
                        prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         *
         *
         * <pre>
         * CmdId: 4886
         * Obf: NHMHOHMOOEH
         * </pre>
         *
         * Protobuf type {@code HomeUpdatePictureFrameInfoRsp}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:HomeUpdatePictureFrameInfoRsp)
                emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                        .HomeUpdatePictureFrameInfoRspOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                        .internal_static_HomeUpdatePictureFrameInfoRsp_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                        .internal_static_HomeUpdatePictureFrameInfoRsp_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                                        .HomeUpdatePictureFrameInfoRsp.class,
                                emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                                        .HomeUpdatePictureFrameInfoRsp.Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass.HomeUpdatePictureFrameInfoRsp.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                retcode_ = 0;

                if (pictureFrameInfoBuilder_ == null) {
                    pictureFrameInfo_ = null;
                } else {
                    pictureFrameInfo_ = null;
                    pictureFrameInfoBuilder_ = null;
                }
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                        .internal_static_HomeUpdatePictureFrameInfoRsp_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                            .HomeUpdatePictureFrameInfoRsp
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                        .HomeUpdatePictureFrameInfoRsp.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                            .HomeUpdatePictureFrameInfoRsp
                    build() {
                emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                                .HomeUpdatePictureFrameInfoRsp
                        result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                            .HomeUpdatePictureFrameInfoRsp
                    buildPartial() {
                emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                                .HomeUpdatePictureFrameInfoRsp
                        result =
                                new emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                                        .HomeUpdatePictureFrameInfoRsp(this);
                result.retcode_ = retcode_;
                if (pictureFrameInfoBuilder_ == null) {
                    result.pictureFrameInfo_ = pictureFrameInfo_;
                } else {
                    result.pictureFrameInfo_ = pictureFrameInfoBuilder_.build();
                }
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index,
                    java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other
                        instanceof
                        emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                                .HomeUpdatePictureFrameInfoRsp) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                                            .HomeUpdatePictureFrameInfoRsp)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                                    .HomeUpdatePictureFrameInfoRsp
                            other) {
                if (other
                        == emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                                .HomeUpdatePictureFrameInfoRsp.getDefaultInstance()) return this;
                if (other.getRetcode() != 0) {
                    setRetcode(other.getRetcode());
                }
                if (other.hasPictureFrameInfo()) {
                    mergePictureFrameInfo(other.getPictureFrameInfo());
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
                emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                                .HomeUpdatePictureFrameInfoRsp
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                                            .HomeUpdatePictureFrameInfoRsp)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int retcode_;
            /**
             * <code>int32 retcode = 15;</code>
             *
             * @return The retcode.
             */
            @java.lang.Override
            public int getRetcode() {
                return retcode_;
            }
            /**
             * <code>int32 retcode = 15;</code>
             *
             * @param value The retcode to set.
             * @return This builder for chaining.
             */
            public Builder setRetcode(int value) {

                retcode_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 retcode = 15;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearRetcode() {

                retcode_ = 0;
                onChanged();
                return this;
            }

            private emu.grasscutter.net.proto.HomePictureFrameInfoOuterClass.HomePictureFrameInfo
                    pictureFrameInfo_;
            private com.google.protobuf.SingleFieldBuilderV3<
                            emu.grasscutter.net.proto.HomePictureFrameInfoOuterClass.HomePictureFrameInfo,
                            emu.grasscutter.net.proto.HomePictureFrameInfoOuterClass.HomePictureFrameInfo.Builder,
                            emu.grasscutter.net.proto.HomePictureFrameInfoOuterClass
                                    .HomePictureFrameInfoOrBuilder>
                    pictureFrameInfoBuilder_;
            /**
             * <code>.HomePictureFrameInfo picture_frame_info = 4;</code>
             *
             * @return Whether the pictureFrameInfo field is set.
             */
            public boolean hasPictureFrameInfo() {
                return pictureFrameInfoBuilder_ != null || pictureFrameInfo_ != null;
            }
            /**
             * <code>.HomePictureFrameInfo picture_frame_info = 4;</code>
             *
             * @return The pictureFrameInfo.
             */
            public emu.grasscutter.net.proto.HomePictureFrameInfoOuterClass.HomePictureFrameInfo
                    getPictureFrameInfo() {
                if (pictureFrameInfoBuilder_ == null) {
                    return pictureFrameInfo_ == null
                            ? emu.grasscutter.net.proto.HomePictureFrameInfoOuterClass.HomePictureFrameInfo
                                    .getDefaultInstance()
                            : pictureFrameInfo_;
                } else {
                    return pictureFrameInfoBuilder_.getMessage();
                }
            }
            /** <code>.HomePictureFrameInfo picture_frame_info = 4;</code> */
            public Builder setPictureFrameInfo(
                    emu.grasscutter.net.proto.HomePictureFrameInfoOuterClass.HomePictureFrameInfo value) {
                if (pictureFrameInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    pictureFrameInfo_ = value;
                    onChanged();
                } else {
                    pictureFrameInfoBuilder_.setMessage(value);
                }

                return this;
            }
            /** <code>.HomePictureFrameInfo picture_frame_info = 4;</code> */
            public Builder setPictureFrameInfo(
                    emu.grasscutter.net.proto.HomePictureFrameInfoOuterClass.HomePictureFrameInfo.Builder
                            builderForValue) {
                if (pictureFrameInfoBuilder_ == null) {
                    pictureFrameInfo_ = builderForValue.build();
                    onChanged();
                } else {
                    pictureFrameInfoBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }
            /** <code>.HomePictureFrameInfo picture_frame_info = 4;</code> */
            public Builder mergePictureFrameInfo(
                    emu.grasscutter.net.proto.HomePictureFrameInfoOuterClass.HomePictureFrameInfo value) {
                if (pictureFrameInfoBuilder_ == null) {
                    if (pictureFrameInfo_ != null) {
                        pictureFrameInfo_ =
                                emu.grasscutter.net.proto.HomePictureFrameInfoOuterClass.HomePictureFrameInfo
                                        .newBuilder(pictureFrameInfo_)
                                        .mergeFrom(value)
                                        .buildPartial();
                    } else {
                        pictureFrameInfo_ = value;
                    }
                    onChanged();
                } else {
                    pictureFrameInfoBuilder_.mergeFrom(value);
                }

                return this;
            }
            /** <code>.HomePictureFrameInfo picture_frame_info = 4;</code> */
            public Builder clearPictureFrameInfo() {
                if (pictureFrameInfoBuilder_ == null) {
                    pictureFrameInfo_ = null;
                    onChanged();
                } else {
                    pictureFrameInfo_ = null;
                    pictureFrameInfoBuilder_ = null;
                }

                return this;
            }
            /** <code>.HomePictureFrameInfo picture_frame_info = 4;</code> */
            public emu.grasscutter.net.proto.HomePictureFrameInfoOuterClass.HomePictureFrameInfo.Builder
                    getPictureFrameInfoBuilder() {

                onChanged();
                return getPictureFrameInfoFieldBuilder().getBuilder();
            }
            /** <code>.HomePictureFrameInfo picture_frame_info = 4;</code> */
            public emu.grasscutter.net.proto.HomePictureFrameInfoOuterClass.HomePictureFrameInfoOrBuilder
                    getPictureFrameInfoOrBuilder() {
                if (pictureFrameInfoBuilder_ != null) {
                    return pictureFrameInfoBuilder_.getMessageOrBuilder();
                } else {
                    return pictureFrameInfo_ == null
                            ? emu.grasscutter.net.proto.HomePictureFrameInfoOuterClass.HomePictureFrameInfo
                                    .getDefaultInstance()
                            : pictureFrameInfo_;
                }
            }
            /** <code>.HomePictureFrameInfo picture_frame_info = 4;</code> */
            private com.google.protobuf.SingleFieldBuilderV3<
                            emu.grasscutter.net.proto.HomePictureFrameInfoOuterClass.HomePictureFrameInfo,
                            emu.grasscutter.net.proto.HomePictureFrameInfoOuterClass.HomePictureFrameInfo.Builder,
                            emu.grasscutter.net.proto.HomePictureFrameInfoOuterClass
                                    .HomePictureFrameInfoOrBuilder>
                    getPictureFrameInfoFieldBuilder() {
                if (pictureFrameInfoBuilder_ == null) {
                    pictureFrameInfoBuilder_ =
                            new com.google.protobuf.SingleFieldBuilderV3<
                                    emu.grasscutter.net.proto.HomePictureFrameInfoOuterClass.HomePictureFrameInfo,
                                    emu.grasscutter.net.proto.HomePictureFrameInfoOuterClass.HomePictureFrameInfo
                                            .Builder,
                                    emu.grasscutter.net.proto.HomePictureFrameInfoOuterClass
                                            .HomePictureFrameInfoOrBuilder>(
                                    getPictureFrameInfo(), getParentForChildren(), isClean());
                    pictureFrameInfo_ = null;
                }
                return pictureFrameInfoBuilder_;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }

            // @@protoc_insertion_point(builder_scope:HomeUpdatePictureFrameInfoRsp)
        }

        // @@protoc_insertion_point(class_scope:HomeUpdatePictureFrameInfoRsp)
        private static final emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                        .HomeUpdatePictureFrameInfoRsp
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                            .HomeUpdatePictureFrameInfoRsp();
        }

        public static emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                        .HomeUpdatePictureFrameInfoRsp
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<HomeUpdatePictureFrameInfoRsp> PARSER =
                new com.google.protobuf.AbstractParser<HomeUpdatePictureFrameInfoRsp>() {
                    @java.lang.Override
                    public HomeUpdatePictureFrameInfoRsp parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new HomeUpdatePictureFrameInfoRsp(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<HomeUpdatePictureFrameInfoRsp> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<HomeUpdatePictureFrameInfoRsp> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.HomeUpdatePictureFrameInfoRspOuterClass
                        .HomeUpdatePictureFrameInfoRsp
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_HomeUpdatePictureFrameInfoRsp_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_HomeUpdatePictureFrameInfoRsp_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n#HomeUpdatePictureFrameInfoRsp.proto\032\032H"
                    + "omePictureFrameInfo.proto\"c\n\035HomeUpdateP"
                    + "ictureFrameInfoRsp\022\017\n\007retcode\030\017 \001(\005\0221\n\022p"
                    + "icture_frame_info\030\004 \001(\0132\025.HomePictureFra"
                    + "meInfoB\033\n\031emu.grasscutter.net.protob\006pro"
                    + "to3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                            emu.grasscutter.net.proto.HomePictureFrameInfoOuterClass.getDescriptor(),
                        });
        internal_static_HomeUpdatePictureFrameInfoRsp_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_HomeUpdatePictureFrameInfoRsp_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_HomeUpdatePictureFrameInfoRsp_descriptor,
                        new java.lang.String[] {
                            "Retcode", "PictureFrameInfo",
                        });
        emu.grasscutter.net.proto.HomePictureFrameInfoOuterClass.getDescriptor();
    }

    // @@protoc_insertion_point(outer_class_scope)
}
