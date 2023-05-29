// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGBossChallengeUpdateNotify.proto

package emu.grasscutter.net.proto;

public final class GCGBossChallengeUpdateNotifyOuterClass {
    private GCGBossChallengeUpdateNotifyOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface GCGBossChallengeUpdateNotifyOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:GCGBossChallengeUpdateNotify)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>.GCGBossChallengeData boss_challenge = 8;</code>
         *
         * @return Whether the bossChallenge field is set.
         */
        boolean hasBossChallenge();
        /**
         * <code>.GCGBossChallengeData boss_challenge = 8;</code>
         *
         * @return The bossChallenge.
         */
        emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData
                getBossChallenge();
        /** <code>.GCGBossChallengeData boss_challenge = 8;</code> */
        emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeDataOrBuilder
                getBossChallengeOrBuilder();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 7099
     * Obf: BNGAGMGNFAF
     * </pre>
     *
     * Protobuf type {@code GCGBossChallengeUpdateNotify}
     */
    public static final class GCGBossChallengeUpdateNotify
            extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:GCGBossChallengeUpdateNotify)
            GCGBossChallengeUpdateNotifyOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use GCGBossChallengeUpdateNotify.newBuilder() to construct.
        private GCGBossChallengeUpdateNotify(
                com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private GCGBossChallengeUpdateNotify() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new GCGBossChallengeUpdateNotify();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GCGBossChallengeUpdateNotify(
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
                        case 66:
                            {
                                emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData
                                                .Builder
                                        subBuilder = null;
                                if (bossChallenge_ != null) {
                                    subBuilder = bossChallenge_.toBuilder();
                                }
                                bossChallenge_ =
                                        input.readMessage(
                                                emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass
                                                        .GCGBossChallengeData.parser(),
                                                extensionRegistry);
                                if (subBuilder != null) {
                                    subBuilder.mergeFrom(bossChallenge_);
                                    bossChallenge_ = subBuilder.buildPartial();
                                }

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
            return emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                    .internal_static_GCGBossChallengeUpdateNotify_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                    .internal_static_GCGBossChallengeUpdateNotify_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                                    .GCGBossChallengeUpdateNotify.class,
                            emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                                    .GCGBossChallengeUpdateNotify.Builder.class);
        }

        public static final int BOSS_CHALLENGE_FIELD_NUMBER = 8;
        private emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData
                bossChallenge_;
        /**
         * <code>.GCGBossChallengeData boss_challenge = 8;</code>
         *
         * @return Whether the bossChallenge field is set.
         */
        @java.lang.Override
        public boolean hasBossChallenge() {
            return bossChallenge_ != null;
        }
        /**
         * <code>.GCGBossChallengeData boss_challenge = 8;</code>
         *
         * @return The bossChallenge.
         */
        @java.lang.Override
        public emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData
                getBossChallenge() {
            return bossChallenge_ == null
                    ? emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData
                            .getDefaultInstance()
                    : bossChallenge_;
        }
        /** <code>.GCGBossChallengeData boss_challenge = 8;</code> */
        @java.lang.Override
        public emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeDataOrBuilder
                getBossChallengeOrBuilder() {
            return getBossChallenge();
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
            if (bossChallenge_ != null) {
                output.writeMessage(8, getBossChallenge());
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (bossChallenge_ != null) {
                size += com.google.protobuf.CodedOutputStream.computeMessageSize(8, getBossChallenge());
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
                    emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                            .GCGBossChallengeUpdateNotify)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify
                    other =
                            (emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                                            .GCGBossChallengeUpdateNotify)
                                    obj;

            if (hasBossChallenge() != other.hasBossChallenge()) return false;
            if (hasBossChallenge()) {
                if (!getBossChallenge().equals(other.getBossChallenge())) return false;
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
            if (hasBossChallenge()) {
                hash = (37 * hash) + BOSS_CHALLENGE_FIELD_NUMBER;
                hash = (53 * hash) + getBossChallenge().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                        .GCGBossChallengeUpdateNotify
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                        .GCGBossChallengeUpdateNotify
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                        .GCGBossChallengeUpdateNotify
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                        .GCGBossChallengeUpdateNotify
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                        .GCGBossChallengeUpdateNotify
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                        .GCGBossChallengeUpdateNotify
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                        .GCGBossChallengeUpdateNotify
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                        .GCGBossChallengeUpdateNotify
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                        .GCGBossChallengeUpdateNotify
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                        .GCGBossChallengeUpdateNotify
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                        .GCGBossChallengeUpdateNotify
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                        .GCGBossChallengeUpdateNotify
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
                emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                                .GCGBossChallengeUpdateNotify
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
         * CmdId: 7099
         * Obf: BNGAGMGNFAF
         * </pre>
         *
         * Protobuf type {@code GCGBossChallengeUpdateNotify}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:GCGBossChallengeUpdateNotify)
                emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                        .GCGBossChallengeUpdateNotifyOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                        .internal_static_GCGBossChallengeUpdateNotify_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                        .internal_static_GCGBossChallengeUpdateNotify_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                                        .GCGBossChallengeUpdateNotify.class,
                                emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                                        .GCGBossChallengeUpdateNotify.Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass.GCGBossChallengeUpdateNotify.newBuilder()
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
                if (bossChallengeBuilder_ == null) {
                    bossChallenge_ = null;
                } else {
                    bossChallenge_ = null;
                    bossChallengeBuilder_ = null;
                }
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                        .internal_static_GCGBossChallengeUpdateNotify_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                            .GCGBossChallengeUpdateNotify
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                        .GCGBossChallengeUpdateNotify.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                            .GCGBossChallengeUpdateNotify
                    build() {
                emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                                .GCGBossChallengeUpdateNotify
                        result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                            .GCGBossChallengeUpdateNotify
                    buildPartial() {
                emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                                .GCGBossChallengeUpdateNotify
                        result =
                                new emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                                        .GCGBossChallengeUpdateNotify(this);
                if (bossChallengeBuilder_ == null) {
                    result.bossChallenge_ = bossChallenge_;
                } else {
                    result.bossChallenge_ = bossChallengeBuilder_.build();
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
                        emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                                .GCGBossChallengeUpdateNotify) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                                            .GCGBossChallengeUpdateNotify)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                                    .GCGBossChallengeUpdateNotify
                            other) {
                if (other
                        == emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                                .GCGBossChallengeUpdateNotify.getDefaultInstance()) return this;
                if (other.hasBossChallenge()) {
                    mergeBossChallenge(other.getBossChallenge());
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
                emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                                .GCGBossChallengeUpdateNotify
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                                            .GCGBossChallengeUpdateNotify)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData
                    bossChallenge_;
            private com.google.protobuf.SingleFieldBuilderV3<
                            emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData,
                            emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData.Builder,
                            emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass
                                    .GCGBossChallengeDataOrBuilder>
                    bossChallengeBuilder_;
            /**
             * <code>.GCGBossChallengeData boss_challenge = 8;</code>
             *
             * @return Whether the bossChallenge field is set.
             */
            public boolean hasBossChallenge() {
                return bossChallengeBuilder_ != null || bossChallenge_ != null;
            }
            /**
             * <code>.GCGBossChallengeData boss_challenge = 8;</code>
             *
             * @return The bossChallenge.
             */
            public emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData
                    getBossChallenge() {
                if (bossChallengeBuilder_ == null) {
                    return bossChallenge_ == null
                            ? emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData
                                    .getDefaultInstance()
                            : bossChallenge_;
                } else {
                    return bossChallengeBuilder_.getMessage();
                }
            }
            /** <code>.GCGBossChallengeData boss_challenge = 8;</code> */
            public Builder setBossChallenge(
                    emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData value) {
                if (bossChallengeBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bossChallenge_ = value;
                    onChanged();
                } else {
                    bossChallengeBuilder_.setMessage(value);
                }

                return this;
            }
            /** <code>.GCGBossChallengeData boss_challenge = 8;</code> */
            public Builder setBossChallenge(
                    emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData.Builder
                            builderForValue) {
                if (bossChallengeBuilder_ == null) {
                    bossChallenge_ = builderForValue.build();
                    onChanged();
                } else {
                    bossChallengeBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }
            /** <code>.GCGBossChallengeData boss_challenge = 8;</code> */
            public Builder mergeBossChallenge(
                    emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData value) {
                if (bossChallengeBuilder_ == null) {
                    if (bossChallenge_ != null) {
                        bossChallenge_ =
                                emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData
                                        .newBuilder(bossChallenge_)
                                        .mergeFrom(value)
                                        .buildPartial();
                    } else {
                        bossChallenge_ = value;
                    }
                    onChanged();
                } else {
                    bossChallengeBuilder_.mergeFrom(value);
                }

                return this;
            }
            /** <code>.GCGBossChallengeData boss_challenge = 8;</code> */
            public Builder clearBossChallenge() {
                if (bossChallengeBuilder_ == null) {
                    bossChallenge_ = null;
                    onChanged();
                } else {
                    bossChallenge_ = null;
                    bossChallengeBuilder_ = null;
                }

                return this;
            }
            /** <code>.GCGBossChallengeData boss_challenge = 8;</code> */
            public emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData.Builder
                    getBossChallengeBuilder() {

                onChanged();
                return getBossChallengeFieldBuilder().getBuilder();
            }
            /** <code>.GCGBossChallengeData boss_challenge = 8;</code> */
            public emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeDataOrBuilder
                    getBossChallengeOrBuilder() {
                if (bossChallengeBuilder_ != null) {
                    return bossChallengeBuilder_.getMessageOrBuilder();
                } else {
                    return bossChallenge_ == null
                            ? emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData
                                    .getDefaultInstance()
                            : bossChallenge_;
                }
            }
            /** <code>.GCGBossChallengeData boss_challenge = 8;</code> */
            private com.google.protobuf.SingleFieldBuilderV3<
                            emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData,
                            emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData.Builder,
                            emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass
                                    .GCGBossChallengeDataOrBuilder>
                    getBossChallengeFieldBuilder() {
                if (bossChallengeBuilder_ == null) {
                    bossChallengeBuilder_ =
                            new com.google.protobuf.SingleFieldBuilderV3<
                                    emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData,
                                    emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.GCGBossChallengeData
                                            .Builder,
                                    emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass
                                            .GCGBossChallengeDataOrBuilder>(
                                    getBossChallenge(), getParentForChildren(), isClean());
                    bossChallenge_ = null;
                }
                return bossChallengeBuilder_;
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

            // @@protoc_insertion_point(builder_scope:GCGBossChallengeUpdateNotify)
        }

        // @@protoc_insertion_point(class_scope:GCGBossChallengeUpdateNotify)
        private static final emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                        .GCGBossChallengeUpdateNotify
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                            .GCGBossChallengeUpdateNotify();
        }

        public static emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                        .GCGBossChallengeUpdateNotify
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<GCGBossChallengeUpdateNotify> PARSER =
                new com.google.protobuf.AbstractParser<GCGBossChallengeUpdateNotify>() {
                    @java.lang.Override
                    public GCGBossChallengeUpdateNotify parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new GCGBossChallengeUpdateNotify(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<GCGBossChallengeUpdateNotify> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<GCGBossChallengeUpdateNotify> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.GCGBossChallengeUpdateNotifyOuterClass
                        .GCGBossChallengeUpdateNotify
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_GCGBossChallengeUpdateNotify_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_GCGBossChallengeUpdateNotify_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\"GCGBossChallengeUpdateNotify.proto\032\032GC"
                    + "GBossChallengeData.proto\"M\n\034GCGBossChall"
                    + "engeUpdateNotify\022-\n\016boss_challenge\030\010 \001(\013"
                    + "2\025.GCGBossChallengeDataB\033\n\031emu.grasscutt"
                    + "er.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                            emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.getDescriptor(),
                        });
        internal_static_GCGBossChallengeUpdateNotify_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_GCGBossChallengeUpdateNotify_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_GCGBossChallengeUpdateNotify_descriptor,
                        new java.lang.String[] {
                            "BossChallenge",
                        });
        emu.grasscutter.net.proto.GCGBossChallengeDataOuterClass.getDescriptor();
    }

    // @@protoc_insertion_point(outer_class_scope)
}
