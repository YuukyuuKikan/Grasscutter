// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SalesmanTakeRewardRsp.proto

package emu.grasscutter.net.proto;

public final class SalesmanTakeRewardRspOuterClass {
    private SalesmanTakeRewardRspOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface SalesmanTakeRewardRspOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:SalesmanTakeRewardRsp)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 reward_id = 13;</code>
         *
         * @return The rewardId.
         */
        int getRewardId();

        /**
         * <code>int32 retcode = 15;</code>
         *
         * @return The retcode.
         */
        int getRetcode();

        /**
         * <code>uint32 position = 9;</code>
         *
         * @return The position.
         */
        int getPosition();

        /**
         * <code>uint32 schedule_id = 8;</code>
         *
         * @return The scheduleId.
         */
        int getScheduleId();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 2119
     * Obf: ABLDDCGLFCA
     * </pre>
     *
     * Protobuf type {@code SalesmanTakeRewardRsp}
     */
    public static final class SalesmanTakeRewardRsp extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:SalesmanTakeRewardRsp)
            SalesmanTakeRewardRspOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use SalesmanTakeRewardRsp.newBuilder() to construct.
        private SalesmanTakeRewardRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private SalesmanTakeRewardRsp() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new SalesmanTakeRewardRsp();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private SalesmanTakeRewardRsp(
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
                                scheduleId_ = input.readUInt32();
                                break;
                            }
                        case 72:
                            {
                                position_ = input.readUInt32();
                                break;
                            }
                        case 104:
                            {
                                rewardId_ = input.readUInt32();
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
            return emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass
                    .internal_static_SalesmanTakeRewardRsp_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass
                    .internal_static_SalesmanTakeRewardRsp_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass.SalesmanTakeRewardRsp.class,
                            emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass.SalesmanTakeRewardRsp
                                    .Builder.class);
        }

        public static final int REWARD_ID_FIELD_NUMBER = 13;
        private int rewardId_;
        /**
         * <code>uint32 reward_id = 13;</code>
         *
         * @return The rewardId.
         */
        @java.lang.Override
        public int getRewardId() {
            return rewardId_;
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

        public static final int POSITION_FIELD_NUMBER = 9;
        private int position_;
        /**
         * <code>uint32 position = 9;</code>
         *
         * @return The position.
         */
        @java.lang.Override
        public int getPosition() {
            return position_;
        }

        public static final int SCHEDULE_ID_FIELD_NUMBER = 8;
        private int scheduleId_;
        /**
         * <code>uint32 schedule_id = 8;</code>
         *
         * @return The scheduleId.
         */
        @java.lang.Override
        public int getScheduleId() {
            return scheduleId_;
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
            if (scheduleId_ != 0) {
                output.writeUInt32(8, scheduleId_);
            }
            if (position_ != 0) {
                output.writeUInt32(9, position_);
            }
            if (rewardId_ != 0) {
                output.writeUInt32(13, rewardId_);
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
            if (scheduleId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(8, scheduleId_);
            }
            if (position_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(9, position_);
            }
            if (rewardId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(13, rewardId_);
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
                    emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass.SalesmanTakeRewardRsp)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass.SalesmanTakeRewardRsp other =
                    (emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass.SalesmanTakeRewardRsp) obj;

            if (getRewardId() != other.getRewardId()) return false;
            if (getRetcode() != other.getRetcode()) return false;
            if (getPosition() != other.getPosition()) return false;
            if (getScheduleId() != other.getScheduleId()) return false;
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
            hash = (37 * hash) + REWARD_ID_FIELD_NUMBER;
            hash = (53 * hash) + getRewardId();
            hash = (37 * hash) + RETCODE_FIELD_NUMBER;
            hash = (53 * hash) + getRetcode();
            hash = (37 * hash) + POSITION_FIELD_NUMBER;
            hash = (53 * hash) + getPosition();
            hash = (37 * hash) + SCHEDULE_ID_FIELD_NUMBER;
            hash = (53 * hash) + getScheduleId();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass.SalesmanTakeRewardRsp
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass.SalesmanTakeRewardRsp
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass.SalesmanTakeRewardRsp
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass.SalesmanTakeRewardRsp
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass.SalesmanTakeRewardRsp
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass.SalesmanTakeRewardRsp
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass.SalesmanTakeRewardRsp
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass.SalesmanTakeRewardRsp
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass.SalesmanTakeRewardRsp
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass.SalesmanTakeRewardRsp
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass.SalesmanTakeRewardRsp
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass.SalesmanTakeRewardRsp
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
                emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass.SalesmanTakeRewardRsp prototype) {
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
         * CmdId: 2119
         * Obf: ABLDDCGLFCA
         * </pre>
         *
         * Protobuf type {@code SalesmanTakeRewardRsp}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:SalesmanTakeRewardRsp)
                emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass.SalesmanTakeRewardRspOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass
                        .internal_static_SalesmanTakeRewardRsp_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass
                        .internal_static_SalesmanTakeRewardRsp_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass.SalesmanTakeRewardRsp
                                        .class,
                                emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass.SalesmanTakeRewardRsp
                                        .Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass.SalesmanTakeRewardRsp.newBuilder()
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
                rewardId_ = 0;

                retcode_ = 0;

                position_ = 0;

                scheduleId_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass
                        .internal_static_SalesmanTakeRewardRsp_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass.SalesmanTakeRewardRsp
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass.SalesmanTakeRewardRsp
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass.SalesmanTakeRewardRsp
                    build() {
                emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass.SalesmanTakeRewardRsp result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass.SalesmanTakeRewardRsp
                    buildPartial() {
                emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass.SalesmanTakeRewardRsp result =
                        new emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass.SalesmanTakeRewardRsp(
                                this);
                result.rewardId_ = rewardId_;
                result.retcode_ = retcode_;
                result.position_ = position_;
                result.scheduleId_ = scheduleId_;
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
                        emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass.SalesmanTakeRewardRsp) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass.SalesmanTakeRewardRsp)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass.SalesmanTakeRewardRsp other) {
                if (other
                        == emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass.SalesmanTakeRewardRsp
                                .getDefaultInstance()) return this;
                if (other.getRewardId() != 0) {
                    setRewardId(other.getRewardId());
                }
                if (other.getRetcode() != 0) {
                    setRetcode(other.getRetcode());
                }
                if (other.getPosition() != 0) {
                    setPosition(other.getPosition());
                }
                if (other.getScheduleId() != 0) {
                    setScheduleId(other.getScheduleId());
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
                emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass.SalesmanTakeRewardRsp
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass.SalesmanTakeRewardRsp)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int rewardId_;
            /**
             * <code>uint32 reward_id = 13;</code>
             *
             * @return The rewardId.
             */
            @java.lang.Override
            public int getRewardId() {
                return rewardId_;
            }
            /**
             * <code>uint32 reward_id = 13;</code>
             *
             * @param value The rewardId to set.
             * @return This builder for chaining.
             */
            public Builder setRewardId(int value) {

                rewardId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 reward_id = 13;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearRewardId() {

                rewardId_ = 0;
                onChanged();
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

            private int position_;
            /**
             * <code>uint32 position = 9;</code>
             *
             * @return The position.
             */
            @java.lang.Override
            public int getPosition() {
                return position_;
            }
            /**
             * <code>uint32 position = 9;</code>
             *
             * @param value The position to set.
             * @return This builder for chaining.
             */
            public Builder setPosition(int value) {

                position_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 position = 9;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearPosition() {

                position_ = 0;
                onChanged();
                return this;
            }

            private int scheduleId_;
            /**
             * <code>uint32 schedule_id = 8;</code>
             *
             * @return The scheduleId.
             */
            @java.lang.Override
            public int getScheduleId() {
                return scheduleId_;
            }
            /**
             * <code>uint32 schedule_id = 8;</code>
             *
             * @param value The scheduleId to set.
             * @return This builder for chaining.
             */
            public Builder setScheduleId(int value) {

                scheduleId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 schedule_id = 8;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearScheduleId() {

                scheduleId_ = 0;
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

            // @@protoc_insertion_point(builder_scope:SalesmanTakeRewardRsp)
        }

        // @@protoc_insertion_point(class_scope:SalesmanTakeRewardRsp)
        private static final emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass
                        .SalesmanTakeRewardRsp
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass.SalesmanTakeRewardRsp();
        }

        public static emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass.SalesmanTakeRewardRsp
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<SalesmanTakeRewardRsp> PARSER =
                new com.google.protobuf.AbstractParser<SalesmanTakeRewardRsp>() {
                    @java.lang.Override
                    public SalesmanTakeRewardRsp parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new SalesmanTakeRewardRsp(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<SalesmanTakeRewardRsp> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<SalesmanTakeRewardRsp> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.SalesmanTakeRewardRspOuterClass.SalesmanTakeRewardRsp
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_SalesmanTakeRewardRsp_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_SalesmanTakeRewardRsp_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\033SalesmanTakeRewardRsp.proto\"b\n\025Salesma"
                    + "nTakeRewardRsp\022\021\n\treward_id\030\r \001(\r\022\017\n\007ret"
                    + "code\030\017 \001(\005\022\020\n\010position\030\t \001(\r\022\023\n\013schedule"
                    + "_id\030\010 \001(\rB\033\n\031emu.grasscutter.net.protob\006"
                    + "proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_SalesmanTakeRewardRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SalesmanTakeRewardRsp_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_SalesmanTakeRewardRsp_descriptor,
                        new java.lang.String[] {
                            "RewardId", "Retcode", "Position", "ScheduleId",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
