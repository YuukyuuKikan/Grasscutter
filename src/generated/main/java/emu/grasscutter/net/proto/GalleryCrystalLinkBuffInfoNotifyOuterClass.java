// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GalleryCrystalLinkBuffInfoNotify.proto

package emu.grasscutter.net.proto;

public final class GalleryCrystalLinkBuffInfoNotifyOuterClass {
    private GalleryCrystalLinkBuffInfoNotifyOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface GalleryCrystalLinkBuffInfoNotifyOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:GalleryCrystalLinkBuffInfoNotify)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 buff_id = 3;</code>
         *
         * @return The buffId.
         */
        int getBuffId();

        /**
         * <code>bool is_buff_valid = 7;</code>
         *
         * @return The isBuffValid.
         */
        boolean getIsBuffValid();

        /**
         * <code>uint32 gallery_id = 10;</code>
         *
         * @return The galleryId.
         */
        int getGalleryId();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 5588
     * Obf: CBJBKNGAOCB
     * </pre>
     *
     * Protobuf type {@code GalleryCrystalLinkBuffInfoNotify}
     */
    public static final class GalleryCrystalLinkBuffInfoNotify
            extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:GalleryCrystalLinkBuffInfoNotify)
            GalleryCrystalLinkBuffInfoNotifyOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use GalleryCrystalLinkBuffInfoNotify.newBuilder() to construct.
        private GalleryCrystalLinkBuffInfoNotify(
                com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private GalleryCrystalLinkBuffInfoNotify() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new GalleryCrystalLinkBuffInfoNotify();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private GalleryCrystalLinkBuffInfoNotify(
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
                                buffId_ = input.readUInt32();
                                break;
                            }
                        case 56:
                            {
                                isBuffValid_ = input.readBool();
                                break;
                            }
                        case 80:
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
            return emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                    .internal_static_GalleryCrystalLinkBuffInfoNotify_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                    .internal_static_GalleryCrystalLinkBuffInfoNotify_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                                    .GalleryCrystalLinkBuffInfoNotify.class,
                            emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                                    .GalleryCrystalLinkBuffInfoNotify.Builder.class);
        }

        public static final int BUFF_ID_FIELD_NUMBER = 3;
        private int buffId_;
        /**
         * <code>uint32 buff_id = 3;</code>
         *
         * @return The buffId.
         */
        @java.lang.Override
        public int getBuffId() {
            return buffId_;
        }

        public static final int IS_BUFF_VALID_FIELD_NUMBER = 7;
        private boolean isBuffValid_;
        /**
         * <code>bool is_buff_valid = 7;</code>
         *
         * @return The isBuffValid.
         */
        @java.lang.Override
        public boolean getIsBuffValid() {
            return isBuffValid_;
        }

        public static final int GALLERY_ID_FIELD_NUMBER = 10;
        private int galleryId_;
        /**
         * <code>uint32 gallery_id = 10;</code>
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
            if (buffId_ != 0) {
                output.writeUInt32(3, buffId_);
            }
            if (isBuffValid_ != false) {
                output.writeBool(7, isBuffValid_);
            }
            if (galleryId_ != 0) {
                output.writeUInt32(10, galleryId_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (buffId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(3, buffId_);
            }
            if (isBuffValid_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(7, isBuffValid_);
            }
            if (galleryId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(10, galleryId_);
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
                    emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                            .GalleryCrystalLinkBuffInfoNotify)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                            .GalleryCrystalLinkBuffInfoNotify
                    other =
                            (emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                                            .GalleryCrystalLinkBuffInfoNotify)
                                    obj;

            if (getBuffId() != other.getBuffId()) return false;
            if (getIsBuffValid() != other.getIsBuffValid()) return false;
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
            hash = (37 * hash) + BUFF_ID_FIELD_NUMBER;
            hash = (53 * hash) + getBuffId();
            hash = (37 * hash) + IS_BUFF_VALID_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsBuffValid());
            hash = (37 * hash) + GALLERY_ID_FIELD_NUMBER;
            hash = (53 * hash) + getGalleryId();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                        .GalleryCrystalLinkBuffInfoNotify
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                        .GalleryCrystalLinkBuffInfoNotify
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                        .GalleryCrystalLinkBuffInfoNotify
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                        .GalleryCrystalLinkBuffInfoNotify
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                        .GalleryCrystalLinkBuffInfoNotify
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                        .GalleryCrystalLinkBuffInfoNotify
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                        .GalleryCrystalLinkBuffInfoNotify
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                        .GalleryCrystalLinkBuffInfoNotify
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                        .GalleryCrystalLinkBuffInfoNotify
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                        .GalleryCrystalLinkBuffInfoNotify
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                        .GalleryCrystalLinkBuffInfoNotify
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                        .GalleryCrystalLinkBuffInfoNotify
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
                emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                                .GalleryCrystalLinkBuffInfoNotify
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
         * CmdId: 5588
         * Obf: CBJBKNGAOCB
         * </pre>
         *
         * Protobuf type {@code GalleryCrystalLinkBuffInfoNotify}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:GalleryCrystalLinkBuffInfoNotify)
                emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                        .GalleryCrystalLinkBuffInfoNotifyOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                        .internal_static_GalleryCrystalLinkBuffInfoNotify_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                        .internal_static_GalleryCrystalLinkBuffInfoNotify_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                                        .GalleryCrystalLinkBuffInfoNotify.class,
                                emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                                        .GalleryCrystalLinkBuffInfoNotify.Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass.GalleryCrystalLinkBuffInfoNotify.newBuilder()
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
                buffId_ = 0;

                isBuffValid_ = false;

                galleryId_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                        .internal_static_GalleryCrystalLinkBuffInfoNotify_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                            .GalleryCrystalLinkBuffInfoNotify
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                        .GalleryCrystalLinkBuffInfoNotify.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                            .GalleryCrystalLinkBuffInfoNotify
                    build() {
                emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                                .GalleryCrystalLinkBuffInfoNotify
                        result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                            .GalleryCrystalLinkBuffInfoNotify
                    buildPartial() {
                emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                                .GalleryCrystalLinkBuffInfoNotify
                        result =
                                new emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                                        .GalleryCrystalLinkBuffInfoNotify(this);
                result.buffId_ = buffId_;
                result.isBuffValid_ = isBuffValid_;
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
                        emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                                .GalleryCrystalLinkBuffInfoNotify) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                                            .GalleryCrystalLinkBuffInfoNotify)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                                    .GalleryCrystalLinkBuffInfoNotify
                            other) {
                if (other
                        == emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                                .GalleryCrystalLinkBuffInfoNotify.getDefaultInstance()) return this;
                if (other.getBuffId() != 0) {
                    setBuffId(other.getBuffId());
                }
                if (other.getIsBuffValid() != false) {
                    setIsBuffValid(other.getIsBuffValid());
                }
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
                emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                                .GalleryCrystalLinkBuffInfoNotify
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                                            .GalleryCrystalLinkBuffInfoNotify)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int buffId_;
            /**
             * <code>uint32 buff_id = 3;</code>
             *
             * @return The buffId.
             */
            @java.lang.Override
            public int getBuffId() {
                return buffId_;
            }
            /**
             * <code>uint32 buff_id = 3;</code>
             *
             * @param value The buffId to set.
             * @return This builder for chaining.
             */
            public Builder setBuffId(int value) {

                buffId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 buff_id = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearBuffId() {

                buffId_ = 0;
                onChanged();
                return this;
            }

            private boolean isBuffValid_;
            /**
             * <code>bool is_buff_valid = 7;</code>
             *
             * @return The isBuffValid.
             */
            @java.lang.Override
            public boolean getIsBuffValid() {
                return isBuffValid_;
            }
            /**
             * <code>bool is_buff_valid = 7;</code>
             *
             * @param value The isBuffValid to set.
             * @return This builder for chaining.
             */
            public Builder setIsBuffValid(boolean value) {

                isBuffValid_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool is_buff_valid = 7;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsBuffValid() {

                isBuffValid_ = false;
                onChanged();
                return this;
            }

            private int galleryId_;
            /**
             * <code>uint32 gallery_id = 10;</code>
             *
             * @return The galleryId.
             */
            @java.lang.Override
            public int getGalleryId() {
                return galleryId_;
            }
            /**
             * <code>uint32 gallery_id = 10;</code>
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
             * <code>uint32 gallery_id = 10;</code>
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

            // @@protoc_insertion_point(builder_scope:GalleryCrystalLinkBuffInfoNotify)
        }

        // @@protoc_insertion_point(class_scope:GalleryCrystalLinkBuffInfoNotify)
        private static final emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                        .GalleryCrystalLinkBuffInfoNotify
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                            .GalleryCrystalLinkBuffInfoNotify();
        }

        public static emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                        .GalleryCrystalLinkBuffInfoNotify
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<GalleryCrystalLinkBuffInfoNotify> PARSER =
                new com.google.protobuf.AbstractParser<GalleryCrystalLinkBuffInfoNotify>() {
                    @java.lang.Override
                    public GalleryCrystalLinkBuffInfoNotify parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new GalleryCrystalLinkBuffInfoNotify(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<GalleryCrystalLinkBuffInfoNotify> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<GalleryCrystalLinkBuffInfoNotify> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.GalleryCrystalLinkBuffInfoNotifyOuterClass
                        .GalleryCrystalLinkBuffInfoNotify
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_GalleryCrystalLinkBuffInfoNotify_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_GalleryCrystalLinkBuffInfoNotify_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n&GalleryCrystalLinkBuffInfoNotify.proto"
                    + "\"^\n GalleryCrystalLinkBuffInfoNotify\022\017\n\007"
                    + "buff_id\030\003 \001(\r\022\025\n\ris_buff_valid\030\007 \001(\010\022\022\n\n"
                    + "gallery_id\030\n \001(\rB\033\n\031emu.grasscutter.net."
                    + "protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_GalleryCrystalLinkBuffInfoNotify_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_GalleryCrystalLinkBuffInfoNotify_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_GalleryCrystalLinkBuffInfoNotify_descriptor,
                        new java.lang.String[] {
                            "BuffId", "IsBuffValid", "GalleryId",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
