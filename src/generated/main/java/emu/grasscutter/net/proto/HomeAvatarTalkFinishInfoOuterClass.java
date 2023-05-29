// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeAvatarTalkFinishInfo.proto

package emu.grasscutter.net.proto;

public final class HomeAvatarTalkFinishInfoOuterClass {
    private HomeAvatarTalkFinishInfoOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface HomeAvatarTalkFinishInfoOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:HomeAvatarTalkFinishInfo)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>repeated uint32 finish_talk_id_list = 1;</code>
         *
         * @return A list containing the finishTalkIdList.
         */
        java.util.List<java.lang.Integer> getFinishTalkIdListList();
        /**
         * <code>repeated uint32 finish_talk_id_list = 1;</code>
         *
         * @return The count of finishTalkIdList.
         */
        int getFinishTalkIdListCount();
        /**
         * <code>repeated uint32 finish_talk_id_list = 1;</code>
         *
         * @param index The index of the element to return.
         * @return The finishTalkIdList at the given index.
         */
        int getFinishTalkIdList(int index);

        /**
         * <code>uint32 avatar_id = 6;</code>
         *
         * @return The avatarId.
         */
        int getAvatarId();
    }
    /**
     *
     *
     * <pre>
     * Obf: ALOPHAPLAKL
     * </pre>
     *
     * Protobuf type {@code HomeAvatarTalkFinishInfo}
     */
    public static final class HomeAvatarTalkFinishInfo extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:HomeAvatarTalkFinishInfo)
            HomeAvatarTalkFinishInfoOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use HomeAvatarTalkFinishInfo.newBuilder() to construct.
        private HomeAvatarTalkFinishInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private HomeAvatarTalkFinishInfo() {
            finishTalkIdList_ = emptyIntList();
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new HomeAvatarTalkFinishInfo();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private HomeAvatarTalkFinishInfo(
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
                        case 8:
                            {
                                if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                                    finishTalkIdList_ = newIntList();
                                    mutable_bitField0_ |= 0x00000001;
                                }
                                finishTalkIdList_.addInt(input.readUInt32());
                                break;
                            }
                        case 10:
                            {
                                int length = input.readRawVarint32();
                                int limit = input.pushLimit(length);
                                if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                                    finishTalkIdList_ = newIntList();
                                    mutable_bitField0_ |= 0x00000001;
                                }
                                while (input.getBytesUntilLimit() > 0) {
                                    finishTalkIdList_.addInt(input.readUInt32());
                                }
                                input.popLimit(limit);
                                break;
                            }
                        case 48:
                            {
                                avatarId_ = input.readUInt32();
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
                if (((mutable_bitField0_ & 0x00000001) != 0)) {
                    finishTalkIdList_.makeImmutable(); // C
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass
                    .internal_static_HomeAvatarTalkFinishInfo_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass
                    .internal_static_HomeAvatarTalkFinishInfo_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo
                                    .class,
                            emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo
                                    .Builder.class);
        }

        public static final int FINISH_TALK_ID_LIST_FIELD_NUMBER = 1;
        private com.google.protobuf.Internal.IntList finishTalkIdList_;
        /**
         * <code>repeated uint32 finish_talk_id_list = 1;</code>
         *
         * @return A list containing the finishTalkIdList.
         */
        @java.lang.Override
        public java.util.List<java.lang.Integer> getFinishTalkIdListList() {
            return finishTalkIdList_;
        }
        /**
         * <code>repeated uint32 finish_talk_id_list = 1;</code>
         *
         * @return The count of finishTalkIdList.
         */
        public int getFinishTalkIdListCount() {
            return finishTalkIdList_.size();
        }
        /**
         * <code>repeated uint32 finish_talk_id_list = 1;</code>
         *
         * @param index The index of the element to return.
         * @return The finishTalkIdList at the given index.
         */
        public int getFinishTalkIdList(int index) {
            return finishTalkIdList_.getInt(index);
        }

        private int finishTalkIdListMemoizedSerializedSize = -1;

        public static final int AVATAR_ID_FIELD_NUMBER = 6;
        private int avatarId_;
        /**
         * <code>uint32 avatar_id = 6;</code>
         *
         * @return The avatarId.
         */
        @java.lang.Override
        public int getAvatarId() {
            return avatarId_;
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
            getSerializedSize();
            if (getFinishTalkIdListList().size() > 0) {
                output.writeUInt32NoTag(10);
                output.writeUInt32NoTag(finishTalkIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < finishTalkIdList_.size(); i++) {
                output.writeUInt32NoTag(finishTalkIdList_.getInt(i));
            }
            if (avatarId_ != 0) {
                output.writeUInt32(6, avatarId_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            {
                int dataSize = 0;
                for (int i = 0; i < finishTalkIdList_.size(); i++) {
                    dataSize +=
                            com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(
                                    finishTalkIdList_.getInt(i));
                }
                size += dataSize;
                if (!getFinishTalkIdListList().isEmpty()) {
                    size += 1;
                    size += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(dataSize);
                }
                finishTalkIdListMemoizedSerializedSize = dataSize;
            }
            if (avatarId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(6, avatarId_);
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
                    emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo other =
                    (emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo)
                            obj;

            if (!getFinishTalkIdListList().equals(other.getFinishTalkIdListList())) return false;
            if (getAvatarId() != other.getAvatarId()) return false;
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
            if (getFinishTalkIdListCount() > 0) {
                hash = (37 * hash) + FINISH_TALK_ID_LIST_FIELD_NUMBER;
                hash = (53 * hash) + getFinishTalkIdListList().hashCode();
            }
            hash = (37 * hash) + AVATAR_ID_FIELD_NUMBER;
            hash = (53 * hash) + getAvatarId();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass
                        .HomeAvatarTalkFinishInfo
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass
                        .HomeAvatarTalkFinishInfo
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass
                        .HomeAvatarTalkFinishInfo
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass
                        .HomeAvatarTalkFinishInfo
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass
                        .HomeAvatarTalkFinishInfo
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass
                        .HomeAvatarTalkFinishInfo
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass
                        .HomeAvatarTalkFinishInfo
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass
                        .HomeAvatarTalkFinishInfo
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass
                        .HomeAvatarTalkFinishInfo
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass
                        .HomeAvatarTalkFinishInfo
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass
                        .HomeAvatarTalkFinishInfo
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass
                        .HomeAvatarTalkFinishInfo
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
                emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo
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
         * Obf: ALOPHAPLAKL
         * </pre>
         *
         * Protobuf type {@code HomeAvatarTalkFinishInfo}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:HomeAvatarTalkFinishInfo)
                emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass
                        .HomeAvatarTalkFinishInfoOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass
                        .internal_static_HomeAvatarTalkFinishInfo_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass
                        .internal_static_HomeAvatarTalkFinishInfo_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass
                                        .HomeAvatarTalkFinishInfo.class,
                                emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass
                                        .HomeAvatarTalkFinishInfo.Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo.newBuilder()
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
                finishTalkIdList_ = emptyIntList();
                bitField0_ = (bitField0_ & ~0x00000001);
                avatarId_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass
                        .internal_static_HomeAvatarTalkFinishInfo_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo
                    build() {
                emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo
                        result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo
                    buildPartial() {
                emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo
                        result =
                                new emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass
                                        .HomeAvatarTalkFinishInfo(this);
                int from_bitField0_ = bitField0_;
                if (((bitField0_ & 0x00000001) != 0)) {
                    finishTalkIdList_.makeImmutable();
                    bitField0_ = (bitField0_ & ~0x00000001);
                }
                result.finishTalkIdList_ = finishTalkIdList_;
                result.avatarId_ = avatarId_;
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
                        emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass
                                            .HomeAvatarTalkFinishInfo)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo
                            other) {
                if (other
                        == emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo
                                .getDefaultInstance()) return this;
                if (!other.finishTalkIdList_.isEmpty()) {
                    if (finishTalkIdList_.isEmpty()) {
                        finishTalkIdList_ = other.finishTalkIdList_;
                        bitField0_ = (bitField0_ & ~0x00000001);
                    } else {
                        ensureFinishTalkIdListIsMutable();
                        finishTalkIdList_.addAll(other.finishTalkIdList_);
                    }
                    onChanged();
                }
                if (other.getAvatarId() != 0) {
                    setAvatarId(other.getAvatarId());
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
                emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass
                                            .HomeAvatarTalkFinishInfo)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int bitField0_;

            private com.google.protobuf.Internal.IntList finishTalkIdList_ = emptyIntList();

            private void ensureFinishTalkIdListIsMutable() {
                if (!((bitField0_ & 0x00000001) != 0)) {
                    finishTalkIdList_ = mutableCopy(finishTalkIdList_);
                    bitField0_ |= 0x00000001;
                }
            }
            /**
             * <code>repeated uint32 finish_talk_id_list = 1;</code>
             *
             * @return A list containing the finishTalkIdList.
             */
            public java.util.List<java.lang.Integer> getFinishTalkIdListList() {
                return ((bitField0_ & 0x00000001) != 0)
                        ? java.util.Collections.unmodifiableList(finishTalkIdList_)
                        : finishTalkIdList_;
            }
            /**
             * <code>repeated uint32 finish_talk_id_list = 1;</code>
             *
             * @return The count of finishTalkIdList.
             */
            public int getFinishTalkIdListCount() {
                return finishTalkIdList_.size();
            }
            /**
             * <code>repeated uint32 finish_talk_id_list = 1;</code>
             *
             * @param index The index of the element to return.
             * @return The finishTalkIdList at the given index.
             */
            public int getFinishTalkIdList(int index) {
                return finishTalkIdList_.getInt(index);
            }
            /**
             * <code>repeated uint32 finish_talk_id_list = 1;</code>
             *
             * @param index The index to set the value at.
             * @param value The finishTalkIdList to set.
             * @return This builder for chaining.
             */
            public Builder setFinishTalkIdList(int index, int value) {
                ensureFinishTalkIdListIsMutable();
                finishTalkIdList_.setInt(index, value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint32 finish_talk_id_list = 1;</code>
             *
             * @param value The finishTalkIdList to add.
             * @return This builder for chaining.
             */
            public Builder addFinishTalkIdList(int value) {
                ensureFinishTalkIdListIsMutable();
                finishTalkIdList_.addInt(value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint32 finish_talk_id_list = 1;</code>
             *
             * @param values The finishTalkIdList to add.
             * @return This builder for chaining.
             */
            public Builder addAllFinishTalkIdList(
                    java.lang.Iterable<? extends java.lang.Integer> values) {
                ensureFinishTalkIdListIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(values, finishTalkIdList_);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint32 finish_talk_id_list = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearFinishTalkIdList() {
                finishTalkIdList_ = emptyIntList();
                bitField0_ = (bitField0_ & ~0x00000001);
                onChanged();
                return this;
            }

            private int avatarId_;
            /**
             * <code>uint32 avatar_id = 6;</code>
             *
             * @return The avatarId.
             */
            @java.lang.Override
            public int getAvatarId() {
                return avatarId_;
            }
            /**
             * <code>uint32 avatar_id = 6;</code>
             *
             * @param value The avatarId to set.
             * @return This builder for chaining.
             */
            public Builder setAvatarId(int value) {

                avatarId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 avatar_id = 6;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearAvatarId() {

                avatarId_ = 0;
                onChanged();
                return this;
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

            // @@protoc_insertion_point(builder_scope:HomeAvatarTalkFinishInfo)
        }

        // @@protoc_insertion_point(class_scope:HomeAvatarTalkFinishInfo)
        private static final emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass
                        .HomeAvatarTalkFinishInfo
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass
                            .HomeAvatarTalkFinishInfo();
        }

        public static emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass
                        .HomeAvatarTalkFinishInfo
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<HomeAvatarTalkFinishInfo> PARSER =
                new com.google.protobuf.AbstractParser<HomeAvatarTalkFinishInfo>() {
                    @java.lang.Override
                    public HomeAvatarTalkFinishInfo parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new HomeAvatarTalkFinishInfo(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<HomeAvatarTalkFinishInfo> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<HomeAvatarTalkFinishInfo> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.HomeAvatarTalkFinishInfoOuterClass.HomeAvatarTalkFinishInfo
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_HomeAvatarTalkFinishInfo_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_HomeAvatarTalkFinishInfo_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\036HomeAvatarTalkFinishInfo.proto\"J\n\030Home"
                    + "AvatarTalkFinishInfo\022\033\n\023finish_talk_id_l"
                    + "ist\030\001 \003(\r\022\021\n\tavatar_id\030\006 \001(\rB\033\n\031emu.gras"
                    + "scutter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_HomeAvatarTalkFinishInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_HomeAvatarTalkFinishInfo_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_HomeAvatarTalkFinishInfo_descriptor,
                        new java.lang.String[] {
                            "FinishTalkIdList", "AvatarId",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
