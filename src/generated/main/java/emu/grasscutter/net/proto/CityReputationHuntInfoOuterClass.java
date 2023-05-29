// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CityReputationHuntInfo.proto

package emu.grasscutter.net.proto;

public final class CityReputationHuntInfoOuterClass {
    private CityReputationHuntInfoOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface CityReputationHuntInfoOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:CityReputationHuntInfo)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>bool has_reward = 15;</code>
         *
         * @return The hasReward.
         */
        boolean getHasReward();

        /**
         * <code>uint32 cur_week_finish_num = 13;</code>
         *
         * @return The curWeekFinishNum.
         */
        int getCurWeekFinishNum();

        /**
         * <code>bool is_open = 8;</code>
         *
         * @return The isOpen.
         */
        boolean getIsOpen();
    }
    /**
     *
     *
     * <pre>
     * Obf: FANGELMMMLL
     * </pre>
     *
     * Protobuf type {@code CityReputationHuntInfo}
     */
    public static final class CityReputationHuntInfo extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:CityReputationHuntInfo)
            CityReputationHuntInfoOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use CityReputationHuntInfo.newBuilder() to construct.
        private CityReputationHuntInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private CityReputationHuntInfo() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new CityReputationHuntInfo();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CityReputationHuntInfo(
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
                                isOpen_ = input.readBool();
                                break;
                            }
                        case 104:
                            {
                                curWeekFinishNum_ = input.readUInt32();
                                break;
                            }
                        case 120:
                            {
                                hasReward_ = input.readBool();
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
            return emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass
                    .internal_static_CityReputationHuntInfo_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass
                    .internal_static_CityReputationHuntInfo_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass.CityReputationHuntInfo
                                    .class,
                            emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass.CityReputationHuntInfo
                                    .Builder.class);
        }

        public static final int HAS_REWARD_FIELD_NUMBER = 15;
        private boolean hasReward_;
        /**
         * <code>bool has_reward = 15;</code>
         *
         * @return The hasReward.
         */
        @java.lang.Override
        public boolean getHasReward() {
            return hasReward_;
        }

        public static final int CUR_WEEK_FINISH_NUM_FIELD_NUMBER = 13;
        private int curWeekFinishNum_;
        /**
         * <code>uint32 cur_week_finish_num = 13;</code>
         *
         * @return The curWeekFinishNum.
         */
        @java.lang.Override
        public int getCurWeekFinishNum() {
            return curWeekFinishNum_;
        }

        public static final int IS_OPEN_FIELD_NUMBER = 8;
        private boolean isOpen_;
        /**
         * <code>bool is_open = 8;</code>
         *
         * @return The isOpen.
         */
        @java.lang.Override
        public boolean getIsOpen() {
            return isOpen_;
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
            if (isOpen_ != false) {
                output.writeBool(8, isOpen_);
            }
            if (curWeekFinishNum_ != 0) {
                output.writeUInt32(13, curWeekFinishNum_);
            }
            if (hasReward_ != false) {
                output.writeBool(15, hasReward_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (isOpen_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(8, isOpen_);
            }
            if (curWeekFinishNum_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(13, curWeekFinishNum_);
            }
            if (hasReward_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(15, hasReward_);
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
                    emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass.CityReputationHuntInfo)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass.CityReputationHuntInfo other =
                    (emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass.CityReputationHuntInfo) obj;

            if (getHasReward() != other.getHasReward()) return false;
            if (getCurWeekFinishNum() != other.getCurWeekFinishNum()) return false;
            if (getIsOpen() != other.getIsOpen()) return false;
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
            hash = (37 * hash) + HAS_REWARD_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getHasReward());
            hash = (37 * hash) + CUR_WEEK_FINISH_NUM_FIELD_NUMBER;
            hash = (53 * hash) + getCurWeekFinishNum();
            hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsOpen());
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass.CityReputationHuntInfo
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass.CityReputationHuntInfo
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass.CityReputationHuntInfo
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass.CityReputationHuntInfo
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass.CityReputationHuntInfo
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass.CityReputationHuntInfo
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass.CityReputationHuntInfo
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass.CityReputationHuntInfo
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass.CityReputationHuntInfo
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass.CityReputationHuntInfo
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass.CityReputationHuntInfo
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass.CityReputationHuntInfo
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
                emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass.CityReputationHuntInfo
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
         * Obf: FANGELMMMLL
         * </pre>
         *
         * Protobuf type {@code CityReputationHuntInfo}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:CityReputationHuntInfo)
                emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass.CityReputationHuntInfoOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass
                        .internal_static_CityReputationHuntInfo_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass
                        .internal_static_CityReputationHuntInfo_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass.CityReputationHuntInfo
                                        .class,
                                emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass.CityReputationHuntInfo
                                        .Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass.CityReputationHuntInfo.newBuilder()
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
                hasReward_ = false;

                curWeekFinishNum_ = 0;

                isOpen_ = false;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass
                        .internal_static_CityReputationHuntInfo_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass.CityReputationHuntInfo
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass.CityReputationHuntInfo
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass.CityReputationHuntInfo
                    build() {
                emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass.CityReputationHuntInfo result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass.CityReputationHuntInfo
                    buildPartial() {
                emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass.CityReputationHuntInfo result =
                        new emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass.CityReputationHuntInfo(
                                this);
                result.hasReward_ = hasReward_;
                result.curWeekFinishNum_ = curWeekFinishNum_;
                result.isOpen_ = isOpen_;
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
                        emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass.CityReputationHuntInfo) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass.CityReputationHuntInfo)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass.CityReputationHuntInfo other) {
                if (other
                        == emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass.CityReputationHuntInfo
                                .getDefaultInstance()) return this;
                if (other.getHasReward() != false) {
                    setHasReward(other.getHasReward());
                }
                if (other.getCurWeekFinishNum() != 0) {
                    setCurWeekFinishNum(other.getCurWeekFinishNum());
                }
                if (other.getIsOpen() != false) {
                    setIsOpen(other.getIsOpen());
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
                emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass.CityReputationHuntInfo
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass.CityReputationHuntInfo)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private boolean hasReward_;
            /**
             * <code>bool has_reward = 15;</code>
             *
             * @return The hasReward.
             */
            @java.lang.Override
            public boolean getHasReward() {
                return hasReward_;
            }
            /**
             * <code>bool has_reward = 15;</code>
             *
             * @param value The hasReward to set.
             * @return This builder for chaining.
             */
            public Builder setHasReward(boolean value) {

                hasReward_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool has_reward = 15;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearHasReward() {

                hasReward_ = false;
                onChanged();
                return this;
            }

            private int curWeekFinishNum_;
            /**
             * <code>uint32 cur_week_finish_num = 13;</code>
             *
             * @return The curWeekFinishNum.
             */
            @java.lang.Override
            public int getCurWeekFinishNum() {
                return curWeekFinishNum_;
            }
            /**
             * <code>uint32 cur_week_finish_num = 13;</code>
             *
             * @param value The curWeekFinishNum to set.
             * @return This builder for chaining.
             */
            public Builder setCurWeekFinishNum(int value) {

                curWeekFinishNum_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 cur_week_finish_num = 13;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearCurWeekFinishNum() {

                curWeekFinishNum_ = 0;
                onChanged();
                return this;
            }

            private boolean isOpen_;
            /**
             * <code>bool is_open = 8;</code>
             *
             * @return The isOpen.
             */
            @java.lang.Override
            public boolean getIsOpen() {
                return isOpen_;
            }
            /**
             * <code>bool is_open = 8;</code>
             *
             * @param value The isOpen to set.
             * @return This builder for chaining.
             */
            public Builder setIsOpen(boolean value) {

                isOpen_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool is_open = 8;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsOpen() {

                isOpen_ = false;
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

            // @@protoc_insertion_point(builder_scope:CityReputationHuntInfo)
        }

        // @@protoc_insertion_point(class_scope:CityReputationHuntInfo)
        private static final emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass
                        .CityReputationHuntInfo
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass.CityReputationHuntInfo();
        }

        public static emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass.CityReputationHuntInfo
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<CityReputationHuntInfo> PARSER =
                new com.google.protobuf.AbstractParser<CityReputationHuntInfo>() {
                    @java.lang.Override
                    public CityReputationHuntInfo parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new CityReputationHuntInfo(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<CityReputationHuntInfo> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<CityReputationHuntInfo> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.CityReputationHuntInfoOuterClass.CityReputationHuntInfo
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_CityReputationHuntInfo_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_CityReputationHuntInfo_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\034CityReputationHuntInfo.proto\"Z\n\026CityRe"
                    + "putationHuntInfo\022\022\n\nhas_reward\030\017 \001(\010\022\033\n\023"
                    + "cur_week_finish_num\030\r \001(\r\022\017\n\007is_open\030\010 \001"
                    + "(\010B\033\n\031emu.grasscutter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_CityReputationHuntInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_CityReputationHuntInfo_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_CityReputationHuntInfo_descriptor,
                        new java.lang.String[] {
                            "HasReward", "CurWeekFinishNum", "IsOpen",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
