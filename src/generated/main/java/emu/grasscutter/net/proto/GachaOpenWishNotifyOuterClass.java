// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GachaOpenWishNotify.proto

package emu.grasscutter.net.proto;

public final class GachaOpenWishNotifyOuterClass {
    private GachaOpenWishNotifyOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface GachaOpenWishNotifyOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:GachaOpenWishNotify)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 gachaType = 5;</code>
         *
         * @return The gachaType.
         */
        int getGachaType();

        /**
         * <code>uint32 gachaScheduleId = 10;</code>
         *
         * @return The gachaScheduleId.
         */
        int getGachaScheduleId();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 1558
     * Obf: HIFNJMPDIHJ
     * </pre>
     *
     * Protobuf type {@code GachaOpenWishNotify}
     */
    public static final class GachaOpenWishNotify extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:GachaOpenWishNotify)
            GachaOpenWishNotifyOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use GachaOpenWishNotify.newBuilder() to construct.
        private GachaOpenWishNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private GachaOpenWishNotify() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new GachaOpenWishNotify();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GachaOpenWishNotify(
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
                        case 40:
                            {
                                gachaType_ = input.readUInt32();
                                break;
                            }
                        case 80:
                            {
                                gachaScheduleId_ = input.readUInt32();
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
            return emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass
                    .internal_static_GachaOpenWishNotify_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass
                    .internal_static_GachaOpenWishNotify_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify.class,
                            emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify.Builder
                                    .class);
        }

        public static final int GACHATYPE_FIELD_NUMBER = 5;
        private int gachaType_;
        /**
         * <code>uint32 gachaType = 5;</code>
         *
         * @return The gachaType.
         */
        @java.lang.Override
        public int getGachaType() {
            return gachaType_;
        }

        public static final int GACHASCHEDULEID_FIELD_NUMBER = 10;
        private int gachaScheduleId_;
        /**
         * <code>uint32 gachaScheduleId = 10;</code>
         *
         * @return The gachaScheduleId.
         */
        @java.lang.Override
        public int getGachaScheduleId() {
            return gachaScheduleId_;
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
            if (gachaType_ != 0) {
                output.writeUInt32(5, gachaType_);
            }
            if (gachaScheduleId_ != 0) {
                output.writeUInt32(10, gachaScheduleId_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (gachaType_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(5, gachaType_);
            }
            if (gachaScheduleId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(10, gachaScheduleId_);
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
                    instanceof emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify other =
                    (emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify) obj;

            if (getGachaType() != other.getGachaType()) return false;
            if (getGachaScheduleId() != other.getGachaScheduleId()) return false;
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
            hash = (37 * hash) + GACHATYPE_FIELD_NUMBER;
            hash = (53 * hash) + getGachaType();
            hash = (37 * hash) + GACHASCHEDULEID_FIELD_NUMBER;
            hash = (53 * hash) + getGachaScheduleId();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify
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
                emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify prototype) {
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
         * CmdId: 1558
         * Obf: HIFNJMPDIHJ
         * </pre>
         *
         * Protobuf type {@code GachaOpenWishNotify}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:GachaOpenWishNotify)
                emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotifyOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass
                        .internal_static_GachaOpenWishNotify_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass
                        .internal_static_GachaOpenWishNotify_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify.class,
                                emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify.Builder
                                        .class);
            }

            // Construct using
            // emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify.newBuilder()
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
                gachaType_ = 0;

                gachaScheduleId_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass
                        .internal_static_GachaOpenWishNotify_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify build() {
                emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify
                    buildPartial() {
                emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify result =
                        new emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify(this);
                result.gachaType_ = gachaType_;
                result.gachaScheduleId_ = gachaScheduleId_;
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
                        emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify other) {
                if (other
                        == emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify
                                .getDefaultInstance()) return this;
                if (other.getGachaType() != 0) {
                    setGachaType(other.getGachaType());
                }
                if (other.getGachaScheduleId() != 0) {
                    setGachaScheduleId(other.getGachaScheduleId());
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
                emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify parsedMessage =
                        null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int gachaType_;
            /**
             * <code>uint32 gachaType = 5;</code>
             *
             * @return The gachaType.
             */
            @java.lang.Override
            public int getGachaType() {
                return gachaType_;
            }
            /**
             * <code>uint32 gachaType = 5;</code>
             *
             * @param value The gachaType to set.
             * @return This builder for chaining.
             */
            public Builder setGachaType(int value) {

                gachaType_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 gachaType = 5;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearGachaType() {

                gachaType_ = 0;
                onChanged();
                return this;
            }

            private int gachaScheduleId_;
            /**
             * <code>uint32 gachaScheduleId = 10;</code>
             *
             * @return The gachaScheduleId.
             */
            @java.lang.Override
            public int getGachaScheduleId() {
                return gachaScheduleId_;
            }
            /**
             * <code>uint32 gachaScheduleId = 10;</code>
             *
             * @param value The gachaScheduleId to set.
             * @return This builder for chaining.
             */
            public Builder setGachaScheduleId(int value) {

                gachaScheduleId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 gachaScheduleId = 10;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearGachaScheduleId() {

                gachaScheduleId_ = 0;
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

            // @@protoc_insertion_point(builder_scope:GachaOpenWishNotify)
        }

        // @@protoc_insertion_point(class_scope:GachaOpenWishNotify)
        private static final emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify();
        }

        public static emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<GachaOpenWishNotify> PARSER =
                new com.google.protobuf.AbstractParser<GachaOpenWishNotify>() {
                    @java.lang.Override
                    public GachaOpenWishNotify parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new GachaOpenWishNotify(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<GachaOpenWishNotify> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<GachaOpenWishNotify> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.GachaOpenWishNotifyOuterClass.GachaOpenWishNotify
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_GachaOpenWishNotify_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_GachaOpenWishNotify_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\031GachaOpenWishNotify.proto\"A\n\023GachaOpen"
                    + "WishNotify\022\021\n\tgachaType\030\005 \001(\r\022\027\n\017gachaSc"
                    + "heduleId\030\n \001(\rB\033\n\031emu.grasscutter.net.pr"
                    + "otob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_GachaOpenWishNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GachaOpenWishNotify_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_GachaOpenWishNotify_descriptor,
                        new java.lang.String[] {
                            "GachaType", "GachaScheduleId",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
