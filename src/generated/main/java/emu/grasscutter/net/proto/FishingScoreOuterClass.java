// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FishingScore.proto

package emu.grasscutter.net.proto;

public final class FishingScoreOuterClass {
    private FishingScoreOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface FishingScoreOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:FishingScore)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>bool is_new_record = 11;</code>
         *
         * @return The isNewRecord.
         */
        boolean getIsNewRecord();

        /**
         * <code>uint32 fishing_score = 8;</code>
         *
         * @return The fishingScore.
         */
        int getFishingScore();
    }
    /**
     *
     *
     * <pre>
     * Obf: JHJEIKMHHHJ
     * </pre>
     *
     * Protobuf type {@code FishingScore}
     */
    public static final class FishingScore extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:FishingScore)
            FishingScoreOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use FishingScore.newBuilder() to construct.
        private FishingScore(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private FishingScore() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new FishingScore();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private FishingScore(
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
                        case 64:
                            {
                                fishingScore_ = input.readUInt32();
                                break;
                            }
                        case 88:
                            {
                                isNewRecord_ = input.readBool();
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
            return emu.grasscutter.net.proto.FishingScoreOuterClass
                    .internal_static_FishingScore_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.FishingScoreOuterClass
                    .internal_static_FishingScore_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.FishingScoreOuterClass.FishingScore.class,
                            emu.grasscutter.net.proto.FishingScoreOuterClass.FishingScore.Builder.class);
        }

        public static final int IS_NEW_RECORD_FIELD_NUMBER = 11;
        private boolean isNewRecord_;
        /**
         * <code>bool is_new_record = 11;</code>
         *
         * @return The isNewRecord.
         */
        @java.lang.Override
        public boolean getIsNewRecord() {
            return isNewRecord_;
        }

        public static final int FISHING_SCORE_FIELD_NUMBER = 8;
        private int fishingScore_;
        /**
         * <code>uint32 fishing_score = 8;</code>
         *
         * @return The fishingScore.
         */
        @java.lang.Override
        public int getFishingScore() {
            return fishingScore_;
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
            if (fishingScore_ != 0) {
                output.writeUInt32(8, fishingScore_);
            }
            if (isNewRecord_ != false) {
                output.writeBool(11, isNewRecord_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (fishingScore_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(8, fishingScore_);
            }
            if (isNewRecord_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(11, isNewRecord_);
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
            if (!(obj instanceof emu.grasscutter.net.proto.FishingScoreOuterClass.FishingScore)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.FishingScoreOuterClass.FishingScore other =
                    (emu.grasscutter.net.proto.FishingScoreOuterClass.FishingScore) obj;

            if (getIsNewRecord() != other.getIsNewRecord()) return false;
            if (getFishingScore() != other.getFishingScore()) return false;
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
            hash = (37 * hash) + FISHING_SCORE_FIELD_NUMBER;
            hash = (53 * hash) + getFishingScore();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.FishingScoreOuterClass.FishingScore parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.FishingScoreOuterClass.FishingScore parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.FishingScoreOuterClass.FishingScore parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.FishingScoreOuterClass.FishingScore parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.FishingScoreOuterClass.FishingScore parseFrom(
                byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.FishingScoreOuterClass.FishingScore parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.FishingScoreOuterClass.FishingScore parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.FishingScoreOuterClass.FishingScore parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.FishingScoreOuterClass.FishingScore parseDelimitedFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.FishingScoreOuterClass.FishingScore parseDelimitedFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.FishingScoreOuterClass.FishingScore parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.FishingScoreOuterClass.FishingScore parseFrom(
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
                emu.grasscutter.net.proto.FishingScoreOuterClass.FishingScore prototype) {
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
         * Obf: JHJEIKMHHHJ
         * </pre>
         *
         * Protobuf type {@code FishingScore}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:FishingScore)
                emu.grasscutter.net.proto.FishingScoreOuterClass.FishingScoreOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.FishingScoreOuterClass
                        .internal_static_FishingScore_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.FishingScoreOuterClass
                        .internal_static_FishingScore_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.FishingScoreOuterClass.FishingScore.class,
                                emu.grasscutter.net.proto.FishingScoreOuterClass.FishingScore.Builder.class);
            }

            // Construct using emu.grasscutter.net.proto.FishingScoreOuterClass.FishingScore.newBuilder()
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

                fishingScore_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.FishingScoreOuterClass
                        .internal_static_FishingScore_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.FishingScoreOuterClass.FishingScore
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.FishingScoreOuterClass.FishingScore.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.FishingScoreOuterClass.FishingScore build() {
                emu.grasscutter.net.proto.FishingScoreOuterClass.FishingScore result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.FishingScoreOuterClass.FishingScore buildPartial() {
                emu.grasscutter.net.proto.FishingScoreOuterClass.FishingScore result =
                        new emu.grasscutter.net.proto.FishingScoreOuterClass.FishingScore(this);
                result.isNewRecord_ = isNewRecord_;
                result.fishingScore_ = fishingScore_;
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
                if (other instanceof emu.grasscutter.net.proto.FishingScoreOuterClass.FishingScore) {
                    return mergeFrom((emu.grasscutter.net.proto.FishingScoreOuterClass.FishingScore) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.FishingScoreOuterClass.FishingScore other) {
                if (other
                        == emu.grasscutter.net.proto.FishingScoreOuterClass.FishingScore.getDefaultInstance())
                    return this;
                if (other.getIsNewRecord() != false) {
                    setIsNewRecord(other.getIsNewRecord());
                }
                if (other.getFishingScore() != 0) {
                    setFishingScore(other.getFishingScore());
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
                emu.grasscutter.net.proto.FishingScoreOuterClass.FishingScore parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.FishingScoreOuterClass.FishingScore)
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
             * <code>bool is_new_record = 11;</code>
             *
             * @return The isNewRecord.
             */
            @java.lang.Override
            public boolean getIsNewRecord() {
                return isNewRecord_;
            }
            /**
             * <code>bool is_new_record = 11;</code>
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
             * <code>bool is_new_record = 11;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsNewRecord() {

                isNewRecord_ = false;
                onChanged();
                return this;
            }

            private int fishingScore_;
            /**
             * <code>uint32 fishing_score = 8;</code>
             *
             * @return The fishingScore.
             */
            @java.lang.Override
            public int getFishingScore() {
                return fishingScore_;
            }
            /**
             * <code>uint32 fishing_score = 8;</code>
             *
             * @param value The fishingScore to set.
             * @return This builder for chaining.
             */
            public Builder setFishingScore(int value) {

                fishingScore_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 fishing_score = 8;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearFishingScore() {

                fishingScore_ = 0;
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

            // @@protoc_insertion_point(builder_scope:FishingScore)
        }

        // @@protoc_insertion_point(class_scope:FishingScore)
        private static final emu.grasscutter.net.proto.FishingScoreOuterClass.FishingScore
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FishingScoreOuterClass.FishingScore();
        }

        public static emu.grasscutter.net.proto.FishingScoreOuterClass.FishingScore
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<FishingScore> PARSER =
                new com.google.protobuf.AbstractParser<FishingScore>() {
                    @java.lang.Override
                    public FishingScore parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new FishingScore(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<FishingScore> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<FishingScore> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.FishingScoreOuterClass.FishingScore
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_FishingScore_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_FishingScore_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\022FishingScore.proto\"<\n\014FishingScore\022\025\n\r"
                    + "is_new_record\030\013 \001(\010\022\025\n\rfishing_score\030\010 \001"
                    + "(\rB\033\n\031emu.grasscutter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_FishingScore_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_FishingScore_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_FishingScore_descriptor,
                        new java.lang.String[] {
                            "IsNewRecord", "FishingScore",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
