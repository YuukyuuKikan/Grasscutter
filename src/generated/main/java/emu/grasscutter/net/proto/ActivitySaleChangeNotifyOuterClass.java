// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ActivitySaleChangeNotify.proto

package emu.grasscutter.net.proto;

public final class ActivitySaleChangeNotifyOuterClass {
    private ActivitySaleChangeNotifyOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface ActivitySaleChangeNotifyOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:ActivitySaleChangeNotify)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 sale_id = 15;</code>
         *
         * @return The saleId.
         */
        int getSaleId();

        /**
         * <code>bool is_close = 3;</code>
         *
         * @return The isClose.
         */
        boolean getIsClose();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 2071
     * Obf: FBKFCGEADIG
     * </pre>
     *
     * Protobuf type {@code ActivitySaleChangeNotify}
     */
    public static final class ActivitySaleChangeNotify extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:ActivitySaleChangeNotify)
            ActivitySaleChangeNotifyOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use ActivitySaleChangeNotify.newBuilder() to construct.
        private ActivitySaleChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private ActivitySaleChangeNotify() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new ActivitySaleChangeNotify();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ActivitySaleChangeNotify(
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
                                isClose_ = input.readBool();
                                break;
                            }
                        case 120:
                            {
                                saleId_ = input.readUInt32();
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
            return emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass
                    .internal_static_ActivitySaleChangeNotify_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass
                    .internal_static_ActivitySaleChangeNotify_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass.ActivitySaleChangeNotify
                                    .class,
                            emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass.ActivitySaleChangeNotify
                                    .Builder.class);
        }

        public static final int SALE_ID_FIELD_NUMBER = 15;
        private int saleId_;
        /**
         * <code>uint32 sale_id = 15;</code>
         *
         * @return The saleId.
         */
        @java.lang.Override
        public int getSaleId() {
            return saleId_;
        }

        public static final int IS_CLOSE_FIELD_NUMBER = 3;
        private boolean isClose_;
        /**
         * <code>bool is_close = 3;</code>
         *
         * @return The isClose.
         */
        @java.lang.Override
        public boolean getIsClose() {
            return isClose_;
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
            if (isClose_ != false) {
                output.writeBool(3, isClose_);
            }
            if (saleId_ != 0) {
                output.writeUInt32(15, saleId_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (isClose_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, isClose_);
            }
            if (saleId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(15, saleId_);
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
                    emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass.ActivitySaleChangeNotify)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass.ActivitySaleChangeNotify other =
                    (emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass.ActivitySaleChangeNotify)
                            obj;

            if (getSaleId() != other.getSaleId()) return false;
            if (getIsClose() != other.getIsClose()) return false;
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
            hash = (37 * hash) + SALE_ID_FIELD_NUMBER;
            hash = (53 * hash) + getSaleId();
            hash = (37 * hash) + IS_CLOSE_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsClose());
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass
                        .ActivitySaleChangeNotify
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass
                        .ActivitySaleChangeNotify
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass
                        .ActivitySaleChangeNotify
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass
                        .ActivitySaleChangeNotify
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass
                        .ActivitySaleChangeNotify
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass
                        .ActivitySaleChangeNotify
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass
                        .ActivitySaleChangeNotify
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass
                        .ActivitySaleChangeNotify
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass
                        .ActivitySaleChangeNotify
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass
                        .ActivitySaleChangeNotify
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass
                        .ActivitySaleChangeNotify
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass
                        .ActivitySaleChangeNotify
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
                emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass.ActivitySaleChangeNotify
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
         * CmdId: 2071
         * Obf: FBKFCGEADIG
         * </pre>
         *
         * Protobuf type {@code ActivitySaleChangeNotify}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:ActivitySaleChangeNotify)
                emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass
                        .ActivitySaleChangeNotifyOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass
                        .internal_static_ActivitySaleChangeNotify_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass
                        .internal_static_ActivitySaleChangeNotify_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass
                                        .ActivitySaleChangeNotify.class,
                                emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass
                                        .ActivitySaleChangeNotify.Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass.ActivitySaleChangeNotify.newBuilder()
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
                saleId_ = 0;

                isClose_ = false;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass
                        .internal_static_ActivitySaleChangeNotify_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass.ActivitySaleChangeNotify
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass.ActivitySaleChangeNotify
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass.ActivitySaleChangeNotify
                    build() {
                emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass.ActivitySaleChangeNotify
                        result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass.ActivitySaleChangeNotify
                    buildPartial() {
                emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass.ActivitySaleChangeNotify
                        result =
                                new emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass
                                        .ActivitySaleChangeNotify(this);
                result.saleId_ = saleId_;
                result.isClose_ = isClose_;
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
                        emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass.ActivitySaleChangeNotify) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass
                                            .ActivitySaleChangeNotify)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass.ActivitySaleChangeNotify
                            other) {
                if (other
                        == emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass.ActivitySaleChangeNotify
                                .getDefaultInstance()) return this;
                if (other.getSaleId() != 0) {
                    setSaleId(other.getSaleId());
                }
                if (other.getIsClose() != false) {
                    setIsClose(other.getIsClose());
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
                emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass.ActivitySaleChangeNotify
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass
                                            .ActivitySaleChangeNotify)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int saleId_;
            /**
             * <code>uint32 sale_id = 15;</code>
             *
             * @return The saleId.
             */
            @java.lang.Override
            public int getSaleId() {
                return saleId_;
            }
            /**
             * <code>uint32 sale_id = 15;</code>
             *
             * @param value The saleId to set.
             * @return This builder for chaining.
             */
            public Builder setSaleId(int value) {

                saleId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 sale_id = 15;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearSaleId() {

                saleId_ = 0;
                onChanged();
                return this;
            }

            private boolean isClose_;
            /**
             * <code>bool is_close = 3;</code>
             *
             * @return The isClose.
             */
            @java.lang.Override
            public boolean getIsClose() {
                return isClose_;
            }
            /**
             * <code>bool is_close = 3;</code>
             *
             * @param value The isClose to set.
             * @return This builder for chaining.
             */
            public Builder setIsClose(boolean value) {

                isClose_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool is_close = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsClose() {

                isClose_ = false;
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

            // @@protoc_insertion_point(builder_scope:ActivitySaleChangeNotify)
        }

        // @@protoc_insertion_point(class_scope:ActivitySaleChangeNotify)
        private static final emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass
                        .ActivitySaleChangeNotify
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass
                            .ActivitySaleChangeNotify();
        }

        public static emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass
                        .ActivitySaleChangeNotify
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<ActivitySaleChangeNotify> PARSER =
                new com.google.protobuf.AbstractParser<ActivitySaleChangeNotify>() {
                    @java.lang.Override
                    public ActivitySaleChangeNotify parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new ActivitySaleChangeNotify(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<ActivitySaleChangeNotify> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<ActivitySaleChangeNotify> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.ActivitySaleChangeNotifyOuterClass.ActivitySaleChangeNotify
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_ActivitySaleChangeNotify_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_ActivitySaleChangeNotify_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\036ActivitySaleChangeNotify.proto\"=\n\030Acti"
                    + "vitySaleChangeNotify\022\017\n\007sale_id\030\017 \001(\r\022\020\n"
                    + "\010is_close\030\003 \001(\010B\033\n\031emu.grasscutter.net.p"
                    + "rotob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_ActivitySaleChangeNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ActivitySaleChangeNotify_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_ActivitySaleChangeNotify_descriptor,
                        new java.lang.String[] {
                            "SaleId", "IsClose",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
