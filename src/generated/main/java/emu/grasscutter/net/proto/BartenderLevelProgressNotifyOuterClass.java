// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BartenderLevelProgressNotify.proto

package emu.grasscutter.net.proto;

public final class BartenderLevelProgressNotifyOuterClass {
    private BartenderLevelProgressNotifyOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface BartenderLevelProgressNotifyOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:BartenderLevelProgressNotify)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>bool is_new_record = 9;</code>
         *
         * @return The isNewRecord.
         */
        boolean getIsNewRecord();

        /**
         * <code>uint32 level_id = 12;</code>
         *
         * @return The levelId.
         */
        int getLevelId();

        /**
         * <code>bool is_finish = 3;</code>
         *
         * @return The isFinish.
         */
        boolean getIsFinish();

        /**
         * <code>uint32 score = 11;</code>
         *
         * @return The score.
         */
        int getScore();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 8030
     * Obf: NBMFBMPJBPJ
     * </pre>
     *
     * Protobuf type {@code BartenderLevelProgressNotify}
     */
    public static final class BartenderLevelProgressNotify
            extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:BartenderLevelProgressNotify)
            BartenderLevelProgressNotifyOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use BartenderLevelProgressNotify.newBuilder() to construct.
        private BartenderLevelProgressNotify(
                com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private BartenderLevelProgressNotify() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new BartenderLevelProgressNotify();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private BartenderLevelProgressNotify(
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
                        case 24:
                            {
                                isFinish_ = input.readBool();
                                break;
                            }
                        case 72:
                            {
                                isNewRecord_ = input.readBool();
                                break;
                            }
                        case 88:
                            {
                                score_ = input.readUInt32();
                                break;
                            }
                        case 96:
                            {
                                levelId_ = input.readUInt32();
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
            return emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                    .internal_static_BartenderLevelProgressNotify_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                    .internal_static_BartenderLevelProgressNotify_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                                    .BartenderLevelProgressNotify.class,
                            emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                                    .BartenderLevelProgressNotify.Builder.class);
        }

        public static final int IS_NEW_RECORD_FIELD_NUMBER = 9;
        private boolean isNewRecord_;
        /**
         * <code>bool is_new_record = 9;</code>
         *
         * @return The isNewRecord.
         */
        @java.lang.Override
        public boolean getIsNewRecord() {
            return isNewRecord_;
        }

        public static final int LEVEL_ID_FIELD_NUMBER = 12;
        private int levelId_;
        /**
         * <code>uint32 level_id = 12;</code>
         *
         * @return The levelId.
         */
        @java.lang.Override
        public int getLevelId() {
            return levelId_;
        }

        public static final int IS_FINISH_FIELD_NUMBER = 3;
        private boolean isFinish_;
        /**
         * <code>bool is_finish = 3;</code>
         *
         * @return The isFinish.
         */
        @java.lang.Override
        public boolean getIsFinish() {
            return isFinish_;
        }

        public static final int SCORE_FIELD_NUMBER = 11;
        private int score_;
        /**
         * <code>uint32 score = 11;</code>
         *
         * @return The score.
         */
        @java.lang.Override
        public int getScore() {
            return score_;
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
            if (isFinish_ != false) {
                output.writeBool(3, isFinish_);
            }
            if (isNewRecord_ != false) {
                output.writeBool(9, isNewRecord_);
            }
            if (score_ != 0) {
                output.writeUInt32(11, score_);
            }
            if (levelId_ != 0) {
                output.writeUInt32(12, levelId_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (isFinish_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, isFinish_);
            }
            if (isNewRecord_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(9, isNewRecord_);
            }
            if (score_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(11, score_);
            }
            if (levelId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(12, levelId_);
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
                    emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                            .BartenderLevelProgressNotify)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass.BartenderLevelProgressNotify
                    other =
                            (emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                                            .BartenderLevelProgressNotify)
                                    obj;

            if (getIsNewRecord() != other.getIsNewRecord()) return false;
            if (getLevelId() != other.getLevelId()) return false;
            if (getIsFinish() != other.getIsFinish()) return false;
            if (getScore() != other.getScore()) return false;
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
            hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsNewRecord());
            hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
            hash = (53 * hash) + getLevelId();
            hash = (37 * hash) + IS_FINISH_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsFinish());
            hash = (37 * hash) + SCORE_FIELD_NUMBER;
            hash = (53 * hash) + getScore();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                        .BartenderLevelProgressNotify
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                        .BartenderLevelProgressNotify
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                        .BartenderLevelProgressNotify
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                        .BartenderLevelProgressNotify
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                        .BartenderLevelProgressNotify
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                        .BartenderLevelProgressNotify
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                        .BartenderLevelProgressNotify
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                        .BartenderLevelProgressNotify
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                        .BartenderLevelProgressNotify
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                        .BartenderLevelProgressNotify
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                        .BartenderLevelProgressNotify
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                        .BartenderLevelProgressNotify
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
                emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                                .BartenderLevelProgressNotify
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
         * CmdId: 8030
         * Obf: NBMFBMPJBPJ
         * </pre>
         *
         * Protobuf type {@code BartenderLevelProgressNotify}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:BartenderLevelProgressNotify)
                emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                        .BartenderLevelProgressNotifyOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                        .internal_static_BartenderLevelProgressNotify_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                        .internal_static_BartenderLevelProgressNotify_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                                        .BartenderLevelProgressNotify.class,
                                emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                                        .BartenderLevelProgressNotify.Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass.BartenderLevelProgressNotify.newBuilder()
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
                isNewRecord_ = false;

                levelId_ = 0;

                isFinish_ = false;

                score_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                        .internal_static_BartenderLevelProgressNotify_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                            .BartenderLevelProgressNotify
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                        .BartenderLevelProgressNotify.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                            .BartenderLevelProgressNotify
                    build() {
                emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                                .BartenderLevelProgressNotify
                        result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                            .BartenderLevelProgressNotify
                    buildPartial() {
                emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                                .BartenderLevelProgressNotify
                        result =
                                new emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                                        .BartenderLevelProgressNotify(this);
                result.isNewRecord_ = isNewRecord_;
                result.levelId_ = levelId_;
                result.isFinish_ = isFinish_;
                result.score_ = score_;
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
                        emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                                .BartenderLevelProgressNotify) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                                            .BartenderLevelProgressNotify)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                                    .BartenderLevelProgressNotify
                            other) {
                if (other
                        == emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                                .BartenderLevelProgressNotify.getDefaultInstance()) return this;
                if (other.getIsNewRecord() != false) {
                    setIsNewRecord(other.getIsNewRecord());
                }
                if (other.getLevelId() != 0) {
                    setLevelId(other.getLevelId());
                }
                if (other.getIsFinish() != false) {
                    setIsFinish(other.getIsFinish());
                }
                if (other.getScore() != 0) {
                    setScore(other.getScore());
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
                emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                                .BartenderLevelProgressNotify
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                                            .BartenderLevelProgressNotify)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private boolean isNewRecord_;
            /**
             * <code>bool is_new_record = 9;</code>
             *
             * @return The isNewRecord.
             */
            @java.lang.Override
            public boolean getIsNewRecord() {
                return isNewRecord_;
            }
            /**
             * <code>bool is_new_record = 9;</code>
             *
             * @param value The isNewRecord to set.
             * @return This builder for chaining.
             */
            public Builder setIsNewRecord(boolean value) {

                isNewRecord_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool is_new_record = 9;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsNewRecord() {

                isNewRecord_ = false;
                onChanged();
                return this;
            }

            private int levelId_;
            /**
             * <code>uint32 level_id = 12;</code>
             *
             * @return The levelId.
             */
            @java.lang.Override
            public int getLevelId() {
                return levelId_;
            }
            /**
             * <code>uint32 level_id = 12;</code>
             *
             * @param value The levelId to set.
             * @return This builder for chaining.
             */
            public Builder setLevelId(int value) {

                levelId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 level_id = 12;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearLevelId() {

                levelId_ = 0;
                onChanged();
                return this;
            }

            private boolean isFinish_;
            /**
             * <code>bool is_finish = 3;</code>
             *
             * @return The isFinish.
             */
            @java.lang.Override
            public boolean getIsFinish() {
                return isFinish_;
            }
            /**
             * <code>bool is_finish = 3;</code>
             *
             * @param value The isFinish to set.
             * @return This builder for chaining.
             */
            public Builder setIsFinish(boolean value) {

                isFinish_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool is_finish = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsFinish() {

                isFinish_ = false;
                onChanged();
                return this;
            }

            private int score_;
            /**
             * <code>uint32 score = 11;</code>
             *
             * @return The score.
             */
            @java.lang.Override
            public int getScore() {
                return score_;
            }
            /**
             * <code>uint32 score = 11;</code>
             *
             * @param value The score to set.
             * @return This builder for chaining.
             */
            public Builder setScore(int value) {

                score_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 score = 11;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearScore() {

                score_ = 0;
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

            // @@protoc_insertion_point(builder_scope:BartenderLevelProgressNotify)
        }

        // @@protoc_insertion_point(class_scope:BartenderLevelProgressNotify)
        private static final emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                        .BartenderLevelProgressNotify
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                            .BartenderLevelProgressNotify();
        }

        public static emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                        .BartenderLevelProgressNotify
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<BartenderLevelProgressNotify> PARSER =
                new com.google.protobuf.AbstractParser<BartenderLevelProgressNotify>() {
                    @java.lang.Override
                    public BartenderLevelProgressNotify parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new BartenderLevelProgressNotify(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<BartenderLevelProgressNotify> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<BartenderLevelProgressNotify> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.BartenderLevelProgressNotifyOuterClass
                        .BartenderLevelProgressNotify
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_BartenderLevelProgressNotify_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_BartenderLevelProgressNotify_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\"BartenderLevelProgressNotify.proto\"i\n\034"
                    + "BartenderLevelProgressNotify\022\025\n\ris_new_r"
                    + "ecord\030\t \001(\010\022\020\n\010level_id\030\014 \001(\r\022\021\n\tis_fini"
                    + "sh\030\003 \001(\010\022\r\n\005score\030\013 \001(\rB\033\n\031emu.grasscutt"
                    + "er.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_BartenderLevelProgressNotify_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_BartenderLevelProgressNotify_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_BartenderLevelProgressNotify_descriptor,
                        new java.lang.String[] {
                            "IsNewRecord", "LevelId", "IsFinish", "Score",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
