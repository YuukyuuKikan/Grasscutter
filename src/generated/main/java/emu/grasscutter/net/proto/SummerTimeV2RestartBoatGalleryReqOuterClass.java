// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SummerTimeV2RestartBoatGalleryReq.proto

package emu.grasscutter.net.proto;

public final class SummerTimeV2RestartBoatGalleryReqOuterClass {
    private SummerTimeV2RestartBoatGalleryReqOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface SummerTimeV2RestartBoatGalleryReqOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:SummerTimeV2RestartBoatGalleryReq)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 gallery_id = 3;</code>
         *
         * @return The galleryId.
         */
        int getGalleryId();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 8342
     * Obf: GFHIFPKGPEH
     * </pre>
     *
     * Protobuf type {@code SummerTimeV2RestartBoatGalleryReq}
     */
    public static final class SummerTimeV2RestartBoatGalleryReq
            extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:SummerTimeV2RestartBoatGalleryReq)
            SummerTimeV2RestartBoatGalleryReqOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use SummerTimeV2RestartBoatGalleryReq.newBuilder() to construct.
        private SummerTimeV2RestartBoatGalleryReq(
                com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private SummerTimeV2RestartBoatGalleryReq() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new SummerTimeV2RestartBoatGalleryReq();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private SummerTimeV2RestartBoatGalleryReq(
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
                                galleryId_ = input.readUInt32();
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
            return emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                    .internal_static_SummerTimeV2RestartBoatGalleryReq_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                    .internal_static_SummerTimeV2RestartBoatGalleryReq_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                                    .SummerTimeV2RestartBoatGalleryReq.class,
                            emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                                    .SummerTimeV2RestartBoatGalleryReq.Builder.class);
        }

        public static final int GALLERY_ID_FIELD_NUMBER = 3;
        private int galleryId_;
        /**
         * <code>uint32 gallery_id = 3;</code>
         *
         * @return The galleryId.
         */
        @java.lang.Override
        public int getGalleryId() {
            return galleryId_;
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
            if (galleryId_ != 0) {
                output.writeUInt32(3, galleryId_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (galleryId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(3, galleryId_);
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
                    emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                            .SummerTimeV2RestartBoatGalleryReq)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                            .SummerTimeV2RestartBoatGalleryReq
                    other =
                            (emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                                            .SummerTimeV2RestartBoatGalleryReq)
                                    obj;

            if (getGalleryId() != other.getGalleryId()) return false;
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
            hash = (37 * hash) + GALLERY_ID_FIELD_NUMBER;
            hash = (53 * hash) + getGalleryId();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                        .SummerTimeV2RestartBoatGalleryReq
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                        .SummerTimeV2RestartBoatGalleryReq
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                        .SummerTimeV2RestartBoatGalleryReq
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                        .SummerTimeV2RestartBoatGalleryReq
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                        .SummerTimeV2RestartBoatGalleryReq
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                        .SummerTimeV2RestartBoatGalleryReq
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                        .SummerTimeV2RestartBoatGalleryReq
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                        .SummerTimeV2RestartBoatGalleryReq
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                        .SummerTimeV2RestartBoatGalleryReq
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                        .SummerTimeV2RestartBoatGalleryReq
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                        .SummerTimeV2RestartBoatGalleryReq
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                        .SummerTimeV2RestartBoatGalleryReq
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
                emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                                .SummerTimeV2RestartBoatGalleryReq
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
         * CmdId: 8342
         * Obf: GFHIFPKGPEH
         * </pre>
         *
         * Protobuf type {@code SummerTimeV2RestartBoatGalleryReq}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:SummerTimeV2RestartBoatGalleryReq)
                emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                        .SummerTimeV2RestartBoatGalleryReqOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                        .internal_static_SummerTimeV2RestartBoatGalleryReq_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                        .internal_static_SummerTimeV2RestartBoatGalleryReq_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                                        .SummerTimeV2RestartBoatGalleryReq.class,
                                emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                                        .SummerTimeV2RestartBoatGalleryReq.Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass.SummerTimeV2RestartBoatGalleryReq.newBuilder()
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
                galleryId_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                        .internal_static_SummerTimeV2RestartBoatGalleryReq_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                            .SummerTimeV2RestartBoatGalleryReq
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                        .SummerTimeV2RestartBoatGalleryReq.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                            .SummerTimeV2RestartBoatGalleryReq
                    build() {
                emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                                .SummerTimeV2RestartBoatGalleryReq
                        result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                            .SummerTimeV2RestartBoatGalleryReq
                    buildPartial() {
                emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                                .SummerTimeV2RestartBoatGalleryReq
                        result =
                                new emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                                        .SummerTimeV2RestartBoatGalleryReq(this);
                result.galleryId_ = galleryId_;
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
                        emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                                .SummerTimeV2RestartBoatGalleryReq) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                                            .SummerTimeV2RestartBoatGalleryReq)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                                    .SummerTimeV2RestartBoatGalleryReq
                            other) {
                if (other
                        == emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                                .SummerTimeV2RestartBoatGalleryReq.getDefaultInstance()) return this;
                if (other.getGalleryId() != 0) {
                    setGalleryId(other.getGalleryId());
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
                emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                                .SummerTimeV2RestartBoatGalleryReq
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                                            .SummerTimeV2RestartBoatGalleryReq)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int galleryId_;
            /**
             * <code>uint32 gallery_id = 3;</code>
             *
             * @return The galleryId.
             */
            @java.lang.Override
            public int getGalleryId() {
                return galleryId_;
            }
            /**
             * <code>uint32 gallery_id = 3;</code>
             *
             * @param value The galleryId to set.
             * @return This builder for chaining.
             */
            public Builder setGalleryId(int value) {

                galleryId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 gallery_id = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearGalleryId() {

                galleryId_ = 0;
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

            // @@protoc_insertion_point(builder_scope:SummerTimeV2RestartBoatGalleryReq)
        }

        // @@protoc_insertion_point(class_scope:SummerTimeV2RestartBoatGalleryReq)
        private static final emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                        .SummerTimeV2RestartBoatGalleryReq
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                            .SummerTimeV2RestartBoatGalleryReq();
        }

        public static emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                        .SummerTimeV2RestartBoatGalleryReq
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<SummerTimeV2RestartBoatGalleryReq> PARSER =
                new com.google.protobuf.AbstractParser<SummerTimeV2RestartBoatGalleryReq>() {
                    @java.lang.Override
                    public SummerTimeV2RestartBoatGalleryReq parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new SummerTimeV2RestartBoatGalleryReq(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<SummerTimeV2RestartBoatGalleryReq> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<SummerTimeV2RestartBoatGalleryReq> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.SummerTimeV2RestartBoatGalleryReqOuterClass
                        .SummerTimeV2RestartBoatGalleryReq
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_SummerTimeV2RestartBoatGalleryReq_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_SummerTimeV2RestartBoatGalleryReq_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\'SummerTimeV2RestartBoatGalleryReq.prot"
                    + "o\"7\n!SummerTimeV2RestartBoatGalleryReq\022\022"
                    + "\n\ngallery_id\030\003 \001(\rB\033\n\031emu.grasscutter.ne"
                    + "t.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_SummerTimeV2RestartBoatGalleryReq_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_SummerTimeV2RestartBoatGalleryReq_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_SummerTimeV2RestartBoatGalleryReq_descriptor,
                        new java.lang.String[] {
                            "GalleryId",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
