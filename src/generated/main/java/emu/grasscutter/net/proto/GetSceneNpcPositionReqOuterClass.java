// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetSceneNpcPositionReq.proto

package emu.grasscutter.net.proto;

public final class GetSceneNpcPositionReqOuterClass {
    private GetSceneNpcPositionReqOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface GetSceneNpcPositionReqOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:GetSceneNpcPositionReq)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>repeated uint32 npc_id_list = 1;</code>
         *
         * @return A list containing the npcIdList.
         */
        java.util.List<java.lang.Integer> getNpcIdListList();
        /**
         * <code>repeated uint32 npc_id_list = 1;</code>
         *
         * @return The count of npcIdList.
         */
        int getNpcIdListCount();
        /**
         * <code>repeated uint32 npc_id_list = 1;</code>
         *
         * @param index The index of the element to return.
         * @return The npcIdList at the given index.
         */
        int getNpcIdList(int index);

        /**
         * <code>uint32 scene_id = 3;</code>
         *
         * @return The sceneId.
         */
        int getSceneId();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 572
     * Obf: BJLGMOBMIPP
     * </pre>
     *
     * Protobuf type {@code GetSceneNpcPositionReq}
     */
    public static final class GetSceneNpcPositionReq extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:GetSceneNpcPositionReq)
            GetSceneNpcPositionReqOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use GetSceneNpcPositionReq.newBuilder() to construct.
        private GetSceneNpcPositionReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private GetSceneNpcPositionReq() {
            npcIdList_ = emptyIntList();
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new GetSceneNpcPositionReq();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GetSceneNpcPositionReq(
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
                                    npcIdList_ = newIntList();
                                    mutable_bitField0_ |= 0x00000001;
                                }
                                npcIdList_.addInt(input.readUInt32());
                                break;
                            }
                        case 10:
                            {
                                int length = input.readRawVarint32();
                                int limit = input.pushLimit(length);
                                if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                                    npcIdList_ = newIntList();
                                    mutable_bitField0_ |= 0x00000001;
                                }
                                while (input.getBytesUntilLimit() > 0) {
                                    npcIdList_.addInt(input.readUInt32());
                                }
                                input.popLimit(limit);
                                break;
                            }
                        case 24:
                            {
                                sceneId_ = input.readUInt32();
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
                    npcIdList_.makeImmutable(); // C
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass
                    .internal_static_GetSceneNpcPositionReq_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass
                    .internal_static_GetSceneNpcPositionReq_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass.GetSceneNpcPositionReq
                                    .class,
                            emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass.GetSceneNpcPositionReq
                                    .Builder.class);
        }

        public static final int NPC_ID_LIST_FIELD_NUMBER = 1;
        private com.google.protobuf.Internal.IntList npcIdList_;
        /**
         * <code>repeated uint32 npc_id_list = 1;</code>
         *
         * @return A list containing the npcIdList.
         */
        @java.lang.Override
        public java.util.List<java.lang.Integer> getNpcIdListList() {
            return npcIdList_;
        }
        /**
         * <code>repeated uint32 npc_id_list = 1;</code>
         *
         * @return The count of npcIdList.
         */
        public int getNpcIdListCount() {
            return npcIdList_.size();
        }
        /**
         * <code>repeated uint32 npc_id_list = 1;</code>
         *
         * @param index The index of the element to return.
         * @return The npcIdList at the given index.
         */
        public int getNpcIdList(int index) {
            return npcIdList_.getInt(index);
        }

        private int npcIdListMemoizedSerializedSize = -1;

        public static final int SCENE_ID_FIELD_NUMBER = 3;
        private int sceneId_;
        /**
         * <code>uint32 scene_id = 3;</code>
         *
         * @return The sceneId.
         */
        @java.lang.Override
        public int getSceneId() {
            return sceneId_;
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
            if (getNpcIdListList().size() > 0) {
                output.writeUInt32NoTag(10);
                output.writeUInt32NoTag(npcIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < npcIdList_.size(); i++) {
                output.writeUInt32NoTag(npcIdList_.getInt(i));
            }
            if (sceneId_ != 0) {
                output.writeUInt32(3, sceneId_);
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
                for (int i = 0; i < npcIdList_.size(); i++) {
                    dataSize +=
                            com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(npcIdList_.getInt(i));
                }
                size += dataSize;
                if (!getNpcIdListList().isEmpty()) {
                    size += 1;
                    size += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(dataSize);
                }
                npcIdListMemoizedSerializedSize = dataSize;
            }
            if (sceneId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(3, sceneId_);
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
                    emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass.GetSceneNpcPositionReq)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass.GetSceneNpcPositionReq other =
                    (emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass.GetSceneNpcPositionReq) obj;

            if (!getNpcIdListList().equals(other.getNpcIdListList())) return false;
            if (getSceneId() != other.getSceneId()) return false;
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
            if (getNpcIdListCount() > 0) {
                hash = (37 * hash) + NPC_ID_LIST_FIELD_NUMBER;
                hash = (53 * hash) + getNpcIdListList().hashCode();
            }
            hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
            hash = (53 * hash) + getSceneId();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass.GetSceneNpcPositionReq
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass.GetSceneNpcPositionReq
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass.GetSceneNpcPositionReq
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass.GetSceneNpcPositionReq
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass.GetSceneNpcPositionReq
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass.GetSceneNpcPositionReq
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass.GetSceneNpcPositionReq
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass.GetSceneNpcPositionReq
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass.GetSceneNpcPositionReq
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass.GetSceneNpcPositionReq
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass.GetSceneNpcPositionReq
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass.GetSceneNpcPositionReq
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
                emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass.GetSceneNpcPositionReq
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
         * CmdId: 572
         * Obf: BJLGMOBMIPP
         * </pre>
         *
         * Protobuf type {@code GetSceneNpcPositionReq}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:GetSceneNpcPositionReq)
                emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass.GetSceneNpcPositionReqOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass
                        .internal_static_GetSceneNpcPositionReq_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass
                        .internal_static_GetSceneNpcPositionReq_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass.GetSceneNpcPositionReq
                                        .class,
                                emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass.GetSceneNpcPositionReq
                                        .Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass.GetSceneNpcPositionReq.newBuilder()
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
                npcIdList_ = emptyIntList();
                bitField0_ = (bitField0_ & ~0x00000001);
                sceneId_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass
                        .internal_static_GetSceneNpcPositionReq_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass.GetSceneNpcPositionReq
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass.GetSceneNpcPositionReq
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass.GetSceneNpcPositionReq
                    build() {
                emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass.GetSceneNpcPositionReq result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass.GetSceneNpcPositionReq
                    buildPartial() {
                emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass.GetSceneNpcPositionReq result =
                        new emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass.GetSceneNpcPositionReq(
                                this);
                int from_bitField0_ = bitField0_;
                if (((bitField0_ & 0x00000001) != 0)) {
                    npcIdList_.makeImmutable();
                    bitField0_ = (bitField0_ & ~0x00000001);
                }
                result.npcIdList_ = npcIdList_;
                result.sceneId_ = sceneId_;
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
                        emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass.GetSceneNpcPositionReq) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass.GetSceneNpcPositionReq)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass.GetSceneNpcPositionReq other) {
                if (other
                        == emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass.GetSceneNpcPositionReq
                                .getDefaultInstance()) return this;
                if (!other.npcIdList_.isEmpty()) {
                    if (npcIdList_.isEmpty()) {
                        npcIdList_ = other.npcIdList_;
                        bitField0_ = (bitField0_ & ~0x00000001);
                    } else {
                        ensureNpcIdListIsMutable();
                        npcIdList_.addAll(other.npcIdList_);
                    }
                    onChanged();
                }
                if (other.getSceneId() != 0) {
                    setSceneId(other.getSceneId());
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
                emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass.GetSceneNpcPositionReq
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass.GetSceneNpcPositionReq)
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

            private com.google.protobuf.Internal.IntList npcIdList_ = emptyIntList();

            private void ensureNpcIdListIsMutable() {
                if (!((bitField0_ & 0x00000001) != 0)) {
                    npcIdList_ = mutableCopy(npcIdList_);
                    bitField0_ |= 0x00000001;
                }
            }
            /**
             * <code>repeated uint32 npc_id_list = 1;</code>
             *
             * @return A list containing the npcIdList.
             */
            public java.util.List<java.lang.Integer> getNpcIdListList() {
                return ((bitField0_ & 0x00000001) != 0)
                        ? java.util.Collections.unmodifiableList(npcIdList_)
                        : npcIdList_;
            }
            /**
             * <code>repeated uint32 npc_id_list = 1;</code>
             *
             * @return The count of npcIdList.
             */
            public int getNpcIdListCount() {
                return npcIdList_.size();
            }
            /**
             * <code>repeated uint32 npc_id_list = 1;</code>
             *
             * @param index The index of the element to return.
             * @return The npcIdList at the given index.
             */
            public int getNpcIdList(int index) {
                return npcIdList_.getInt(index);
            }
            /**
             * <code>repeated uint32 npc_id_list = 1;</code>
             *
             * @param index The index to set the value at.
             * @param value The npcIdList to set.
             * @return This builder for chaining.
             */
            public Builder setNpcIdList(int index, int value) {
                ensureNpcIdListIsMutable();
                npcIdList_.setInt(index, value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint32 npc_id_list = 1;</code>
             *
             * @param value The npcIdList to add.
             * @return This builder for chaining.
             */
            public Builder addNpcIdList(int value) {
                ensureNpcIdListIsMutable();
                npcIdList_.addInt(value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint32 npc_id_list = 1;</code>
             *
             * @param values The npcIdList to add.
             * @return This builder for chaining.
             */
            public Builder addAllNpcIdList(java.lang.Iterable<? extends java.lang.Integer> values) {
                ensureNpcIdListIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(values, npcIdList_);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint32 npc_id_list = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearNpcIdList() {
                npcIdList_ = emptyIntList();
                bitField0_ = (bitField0_ & ~0x00000001);
                onChanged();
                return this;
            }

            private int sceneId_;
            /**
             * <code>uint32 scene_id = 3;</code>
             *
             * @return The sceneId.
             */
            @java.lang.Override
            public int getSceneId() {
                return sceneId_;
            }
            /**
             * <code>uint32 scene_id = 3;</code>
             *
             * @param value The sceneId to set.
             * @return This builder for chaining.
             */
            public Builder setSceneId(int value) {

                sceneId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 scene_id = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearSceneId() {

                sceneId_ = 0;
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

            // @@protoc_insertion_point(builder_scope:GetSceneNpcPositionReq)
        }

        // @@protoc_insertion_point(class_scope:GetSceneNpcPositionReq)
        private static final emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass
                        .GetSceneNpcPositionReq
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass.GetSceneNpcPositionReq();
        }

        public static emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass.GetSceneNpcPositionReq
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<GetSceneNpcPositionReq> PARSER =
                new com.google.protobuf.AbstractParser<GetSceneNpcPositionReq>() {
                    @java.lang.Override
                    public GetSceneNpcPositionReq parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new GetSceneNpcPositionReq(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<GetSceneNpcPositionReq> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<GetSceneNpcPositionReq> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.GetSceneNpcPositionReqOuterClass.GetSceneNpcPositionReq
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_GetSceneNpcPositionReq_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_GetSceneNpcPositionReq_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\034GetSceneNpcPositionReq.proto\"?\n\026GetSce"
                    + "neNpcPositionReq\022\023\n\013npc_id_list\030\001 \003(\r\022\020\n"
                    + "\010scene_id\030\003 \001(\rB\033\n\031emu.grasscutter.net.p"
                    + "rotob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_GetSceneNpcPositionReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GetSceneNpcPositionReq_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_GetSceneNpcPositionReq_descriptor,
                        new java.lang.String[] {
                            "NpcIdList", "SceneId",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
