// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DungeonCandidateTeamDismissNotify.proto

package emu.grasscutter.net.proto;

public final class DungeonCandidateTeamDismissNotifyOuterClass {
    private DungeonCandidateTeamDismissNotifyOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface DungeonCandidateTeamDismissNotifyOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:DungeonCandidateTeamDismissNotify)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 player_uid = 9;</code>
         *
         * @return The playerUid.
         */
        int getPlayerUid();

        /**
         * <code>.DungeonCandidateTeamDismissReason reason = 7;</code>
         *
         * @return The enum numeric value on the wire for reason.
         */
        int getReasonValue();
        /**
         * <code>.DungeonCandidateTeamDismissReason reason = 7;</code>
         *
         * @return The reason.
         */
        emu.grasscutter.net.proto.DungeonCandidateTeamDismissReasonOuterClass
                        .DungeonCandidateTeamDismissReason
                getReason();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 936
     * Obf: PNCMAJFHICH
     * </pre>
     *
     * Protobuf type {@code DungeonCandidateTeamDismissNotify}
     */
    public static final class DungeonCandidateTeamDismissNotify
            extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:DungeonCandidateTeamDismissNotify)
            DungeonCandidateTeamDismissNotifyOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use DungeonCandidateTeamDismissNotify.newBuilder() to construct.
        private DungeonCandidateTeamDismissNotify(
                com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private DungeonCandidateTeamDismissNotify() {
            reason_ = 0;
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new DungeonCandidateTeamDismissNotify();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private DungeonCandidateTeamDismissNotify(
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
                        case 56:
                            {
                                int rawValue = input.readEnum();

                                reason_ = rawValue;
                                break;
                            }
                        case 72:
                            {
                                playerUid_ = input.readUInt32();
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
            return emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                    .internal_static_DungeonCandidateTeamDismissNotify_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                    .internal_static_DungeonCandidateTeamDismissNotify_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                                    .DungeonCandidateTeamDismissNotify.class,
                            emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                                    .DungeonCandidateTeamDismissNotify.Builder.class);
        }

        public static final int PLAYER_UID_FIELD_NUMBER = 9;
        private int playerUid_;
        /**
         * <code>uint32 player_uid = 9;</code>
         *
         * @return The playerUid.
         */
        @java.lang.Override
        public int getPlayerUid() {
            return playerUid_;
        }

        public static final int REASON_FIELD_NUMBER = 7;
        private int reason_;
        /**
         * <code>.DungeonCandidateTeamDismissReason reason = 7;</code>
         *
         * @return The enum numeric value on the wire for reason.
         */
        @java.lang.Override
        public int getReasonValue() {
            return reason_;
        }
        /**
         * <code>.DungeonCandidateTeamDismissReason reason = 7;</code>
         *
         * @return The reason.
         */
        @java.lang.Override
        public emu.grasscutter.net.proto.DungeonCandidateTeamDismissReasonOuterClass
                        .DungeonCandidateTeamDismissReason
                getReason() {
            @SuppressWarnings("deprecation")
            emu.grasscutter.net.proto.DungeonCandidateTeamDismissReasonOuterClass
                            .DungeonCandidateTeamDismissReason
                    result =
                            emu.grasscutter.net.proto.DungeonCandidateTeamDismissReasonOuterClass
                                    .DungeonCandidateTeamDismissReason.valueOf(reason_);
            return result == null
                    ? emu.grasscutter.net.proto.DungeonCandidateTeamDismissReasonOuterClass
                            .DungeonCandidateTeamDismissReason.UNRECOGNIZED
                    : result;
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
            if (reason_
                    != emu.grasscutter.net.proto.DungeonCandidateTeamDismissReasonOuterClass
                            .DungeonCandidateTeamDismissReason.DUNGEON_CANDIDATE_TPDR_NORMAL
                            .getNumber()) {
                output.writeEnum(7, reason_);
            }
            if (playerUid_ != 0) {
                output.writeUInt32(9, playerUid_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (reason_
                    != emu.grasscutter.net.proto.DungeonCandidateTeamDismissReasonOuterClass
                            .DungeonCandidateTeamDismissReason.DUNGEON_CANDIDATE_TPDR_NORMAL
                            .getNumber()) {
                size += com.google.protobuf.CodedOutputStream.computeEnumSize(7, reason_);
            }
            if (playerUid_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(9, playerUid_);
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
                    emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                            .DungeonCandidateTeamDismissNotify)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                            .DungeonCandidateTeamDismissNotify
                    other =
                            (emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                                            .DungeonCandidateTeamDismissNotify)
                                    obj;

            if (getPlayerUid() != other.getPlayerUid()) return false;
            if (reason_ != other.reason_) return false;
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
            hash = (37 * hash) + PLAYER_UID_FIELD_NUMBER;
            hash = (53 * hash) + getPlayerUid();
            hash = (37 * hash) + REASON_FIELD_NUMBER;
            hash = (53 * hash) + reason_;
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                        .DungeonCandidateTeamDismissNotify
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                        .DungeonCandidateTeamDismissNotify
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                        .DungeonCandidateTeamDismissNotify
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                        .DungeonCandidateTeamDismissNotify
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                        .DungeonCandidateTeamDismissNotify
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                        .DungeonCandidateTeamDismissNotify
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                        .DungeonCandidateTeamDismissNotify
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                        .DungeonCandidateTeamDismissNotify
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                        .DungeonCandidateTeamDismissNotify
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                        .DungeonCandidateTeamDismissNotify
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                        .DungeonCandidateTeamDismissNotify
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                        .DungeonCandidateTeamDismissNotify
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
                emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                                .DungeonCandidateTeamDismissNotify
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
         * CmdId: 936
         * Obf: PNCMAJFHICH
         * </pre>
         *
         * Protobuf type {@code DungeonCandidateTeamDismissNotify}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:DungeonCandidateTeamDismissNotify)
                emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                        .DungeonCandidateTeamDismissNotifyOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                        .internal_static_DungeonCandidateTeamDismissNotify_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                        .internal_static_DungeonCandidateTeamDismissNotify_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                                        .DungeonCandidateTeamDismissNotify.class,
                                emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                                        .DungeonCandidateTeamDismissNotify.Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass.DungeonCandidateTeamDismissNotify.newBuilder()
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
                playerUid_ = 0;

                reason_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                        .internal_static_DungeonCandidateTeamDismissNotify_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                            .DungeonCandidateTeamDismissNotify
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                        .DungeonCandidateTeamDismissNotify.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                            .DungeonCandidateTeamDismissNotify
                    build() {
                emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                                .DungeonCandidateTeamDismissNotify
                        result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                            .DungeonCandidateTeamDismissNotify
                    buildPartial() {
                emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                                .DungeonCandidateTeamDismissNotify
                        result =
                                new emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                                        .DungeonCandidateTeamDismissNotify(this);
                result.playerUid_ = playerUid_;
                result.reason_ = reason_;
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
                        emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                                .DungeonCandidateTeamDismissNotify) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                                            .DungeonCandidateTeamDismissNotify)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                                    .DungeonCandidateTeamDismissNotify
                            other) {
                if (other
                        == emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                                .DungeonCandidateTeamDismissNotify.getDefaultInstance()) return this;
                if (other.getPlayerUid() != 0) {
                    setPlayerUid(other.getPlayerUid());
                }
                if (other.reason_ != 0) {
                    setReasonValue(other.getReasonValue());
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
                emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                                .DungeonCandidateTeamDismissNotify
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                                            .DungeonCandidateTeamDismissNotify)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int playerUid_;
            /**
             * <code>uint32 player_uid = 9;</code>
             *
             * @return The playerUid.
             */
            @java.lang.Override
            public int getPlayerUid() {
                return playerUid_;
            }
            /**
             * <code>uint32 player_uid = 9;</code>
             *
             * @param value The playerUid to set.
             * @return This builder for chaining.
             */
            public Builder setPlayerUid(int value) {

                playerUid_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 player_uid = 9;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearPlayerUid() {

                playerUid_ = 0;
                onChanged();
                return this;
            }

            private int reason_ = 0;
            /**
             * <code>.DungeonCandidateTeamDismissReason reason = 7;</code>
             *
             * @return The enum numeric value on the wire for reason.
             */
            @java.lang.Override
            public int getReasonValue() {
                return reason_;
            }
            /**
             * <code>.DungeonCandidateTeamDismissReason reason = 7;</code>
             *
             * @param value The enum numeric value on the wire for reason to set.
             * @return This builder for chaining.
             */
            public Builder setReasonValue(int value) {

                reason_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>.DungeonCandidateTeamDismissReason reason = 7;</code>
             *
             * @return The reason.
             */
            @java.lang.Override
            public emu.grasscutter.net.proto.DungeonCandidateTeamDismissReasonOuterClass
                            .DungeonCandidateTeamDismissReason
                    getReason() {
                @SuppressWarnings("deprecation")
                emu.grasscutter.net.proto.DungeonCandidateTeamDismissReasonOuterClass
                                .DungeonCandidateTeamDismissReason
                        result =
                                emu.grasscutter.net.proto.DungeonCandidateTeamDismissReasonOuterClass
                                        .DungeonCandidateTeamDismissReason.valueOf(reason_);
                return result == null
                        ? emu.grasscutter.net.proto.DungeonCandidateTeamDismissReasonOuterClass
                                .DungeonCandidateTeamDismissReason.UNRECOGNIZED
                        : result;
            }
            /**
             * <code>.DungeonCandidateTeamDismissReason reason = 7;</code>
             *
             * @param value The reason to set.
             * @return This builder for chaining.
             */
            public Builder setReason(
                    emu.grasscutter.net.proto.DungeonCandidateTeamDismissReasonOuterClass
                                    .DungeonCandidateTeamDismissReason
                            value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                reason_ = value.getNumber();
                onChanged();
                return this;
            }
            /**
             * <code>.DungeonCandidateTeamDismissReason reason = 7;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearReason() {

                reason_ = 0;
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

            // @@protoc_insertion_point(builder_scope:DungeonCandidateTeamDismissNotify)
        }

        // @@protoc_insertion_point(class_scope:DungeonCandidateTeamDismissNotify)
        private static final emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                        .DungeonCandidateTeamDismissNotify
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                            .DungeonCandidateTeamDismissNotify();
        }

        public static emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                        .DungeonCandidateTeamDismissNotify
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<DungeonCandidateTeamDismissNotify> PARSER =
                new com.google.protobuf.AbstractParser<DungeonCandidateTeamDismissNotify>() {
                    @java.lang.Override
                    public DungeonCandidateTeamDismissNotify parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new DungeonCandidateTeamDismissNotify(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<DungeonCandidateTeamDismissNotify> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<DungeonCandidateTeamDismissNotify> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.DungeonCandidateTeamDismissNotifyOuterClass
                        .DungeonCandidateTeamDismissNotify
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_DungeonCandidateTeamDismissNotify_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_DungeonCandidateTeamDismissNotify_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\'DungeonCandidateTeamDismissNotify.prot"
                    + "o\032\'DungeonCandidateTeamDismissReason.pro"
                    + "to\"k\n!DungeonCandidateTeamDismissNotify\022"
                    + "\022\n\nplayer_uid\030\t \001(\r\0222\n\006reason\030\007 \001(\0162\".Du"
                    + "ngeonCandidateTeamDismissReasonB\033\n\031emu.g"
                    + "rasscutter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                            emu.grasscutter.net.proto.DungeonCandidateTeamDismissReasonOuterClass.getDescriptor(),
                        });
        internal_static_DungeonCandidateTeamDismissNotify_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_DungeonCandidateTeamDismissNotify_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_DungeonCandidateTeamDismissNotify_descriptor,
                        new java.lang.String[] {
                            "PlayerUid", "Reason",
                        });
        emu.grasscutter.net.proto.DungeonCandidateTeamDismissReasonOuterClass.getDescriptor();
    }

    // @@protoc_insertion_point(outer_class_scope)
}
