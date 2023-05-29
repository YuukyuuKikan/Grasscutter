// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGDSFieldUnlockNotify.proto

package emu.grasscutter.net.proto;

public final class GCGDSFieldUnlockNotifyOuterClass {
    private GCGDSFieldUnlockNotifyOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface GCGDSFieldUnlockNotifyOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:GCGDSFieldUnlockNotify)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 field_id = 13;</code>
         *
         * @return The fieldId.
         */
        int getFieldId();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 7845
     * Obf: PDIGPHKJHIC
     * </pre>
     *
     * Protobuf type {@code GCGDSFieldUnlockNotify}
     */
    public static final class GCGDSFieldUnlockNotify extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:GCGDSFieldUnlockNotify)
            GCGDSFieldUnlockNotifyOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use GCGDSFieldUnlockNotify.newBuilder() to construct.
        private GCGDSFieldUnlockNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private GCGDSFieldUnlockNotify() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new GCGDSFieldUnlockNotify();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GCGDSFieldUnlockNotify(
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
                        case 104:
                            {
                                fieldId_ = input.readUInt32();
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
            return emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass
                    .internal_static_GCGDSFieldUnlockNotify_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass
                    .internal_static_GCGDSFieldUnlockNotify_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass.GCGDSFieldUnlockNotify
                                    .class,
                            emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass.GCGDSFieldUnlockNotify
                                    .Builder.class);
        }

        public static final int FIELD_ID_FIELD_NUMBER = 13;
        private int fieldId_;
        /**
         * <code>uint32 field_id = 13;</code>
         *
         * @return The fieldId.
         */
        @java.lang.Override
        public int getFieldId() {
            return fieldId_;
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
            if (fieldId_ != 0) {
                output.writeUInt32(13, fieldId_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (fieldId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(13, fieldId_);
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
                    emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass.GCGDSFieldUnlockNotify)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass.GCGDSFieldUnlockNotify other =
                    (emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass.GCGDSFieldUnlockNotify) obj;

            if (getFieldId() != other.getFieldId()) return false;
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
            hash = (37 * hash) + FIELD_ID_FIELD_NUMBER;
            hash = (53 * hash) + getFieldId();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass.GCGDSFieldUnlockNotify
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass.GCGDSFieldUnlockNotify
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass.GCGDSFieldUnlockNotify
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass.GCGDSFieldUnlockNotify
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass.GCGDSFieldUnlockNotify
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass.GCGDSFieldUnlockNotify
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass.GCGDSFieldUnlockNotify
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass.GCGDSFieldUnlockNotify
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass.GCGDSFieldUnlockNotify
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass.GCGDSFieldUnlockNotify
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass.GCGDSFieldUnlockNotify
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass.GCGDSFieldUnlockNotify
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
                emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass.GCGDSFieldUnlockNotify
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
         * CmdId: 7845
         * Obf: PDIGPHKJHIC
         * </pre>
         *
         * Protobuf type {@code GCGDSFieldUnlockNotify}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:GCGDSFieldUnlockNotify)
                emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass.GCGDSFieldUnlockNotifyOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass
                        .internal_static_GCGDSFieldUnlockNotify_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass
                        .internal_static_GCGDSFieldUnlockNotify_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass.GCGDSFieldUnlockNotify
                                        .class,
                                emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass.GCGDSFieldUnlockNotify
                                        .Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass.GCGDSFieldUnlockNotify.newBuilder()
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
                fieldId_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass
                        .internal_static_GCGDSFieldUnlockNotify_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass.GCGDSFieldUnlockNotify
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass.GCGDSFieldUnlockNotify
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass.GCGDSFieldUnlockNotify
                    build() {
                emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass.GCGDSFieldUnlockNotify result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass.GCGDSFieldUnlockNotify
                    buildPartial() {
                emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass.GCGDSFieldUnlockNotify result =
                        new emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass.GCGDSFieldUnlockNotify(
                                this);
                result.fieldId_ = fieldId_;
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
                        emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass.GCGDSFieldUnlockNotify) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass.GCGDSFieldUnlockNotify)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass.GCGDSFieldUnlockNotify other) {
                if (other
                        == emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass.GCGDSFieldUnlockNotify
                                .getDefaultInstance()) return this;
                if (other.getFieldId() != 0) {
                    setFieldId(other.getFieldId());
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
                emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass.GCGDSFieldUnlockNotify
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass.GCGDSFieldUnlockNotify)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int fieldId_;
            /**
             * <code>uint32 field_id = 13;</code>
             *
             * @return The fieldId.
             */
            @java.lang.Override
            public int getFieldId() {
                return fieldId_;
            }
            /**
             * <code>uint32 field_id = 13;</code>
             *
             * @param value The fieldId to set.
             * @return This builder for chaining.
             */
            public Builder setFieldId(int value) {

                fieldId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 field_id = 13;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearFieldId() {

                fieldId_ = 0;
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

            // @@protoc_insertion_point(builder_scope:GCGDSFieldUnlockNotify)
        }

        // @@protoc_insertion_point(class_scope:GCGDSFieldUnlockNotify)
        private static final emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass
                        .GCGDSFieldUnlockNotify
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass.GCGDSFieldUnlockNotify();
        }

        public static emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass.GCGDSFieldUnlockNotify
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<GCGDSFieldUnlockNotify> PARSER =
                new com.google.protobuf.AbstractParser<GCGDSFieldUnlockNotify>() {
                    @java.lang.Override
                    public GCGDSFieldUnlockNotify parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new GCGDSFieldUnlockNotify(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<GCGDSFieldUnlockNotify> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<GCGDSFieldUnlockNotify> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.GCGDSFieldUnlockNotifyOuterClass.GCGDSFieldUnlockNotify
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_GCGDSFieldUnlockNotify_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_GCGDSFieldUnlockNotify_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\034GCGDSFieldUnlockNotify.proto\"*\n\026GCGDSF"
                    + "ieldUnlockNotify\022\020\n\010field_id\030\r \001(\rB\033\n\031em"
                    + "u.grasscutter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_GCGDSFieldUnlockNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GCGDSFieldUnlockNotify_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_GCGDSFieldUnlockNotify_descriptor,
                        new java.lang.String[] {
                            "FieldId",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
