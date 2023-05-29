// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DungeonReviseLevelNotify.proto

package emu.grasscutter.net.proto;

public final class DungeonReviseLevelNotifyOuterClass {
    private DungeonReviseLevelNotifyOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface DungeonReviseLevelNotifyOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:DungeonReviseLevelNotify)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 LPEGNBKLNPD = 2;</code>
         *
         * @return The lPEGNBKLNPD.
         */
        int getLPEGNBKLNPD();

        /**
         * <code>uint32 dungeon_id = 11;</code>
         *
         * @return The dungeonId.
         */
        int getDungeonId();

        /**
         * <code>uint32 MAGJOJOBHEK = 10;</code>
         *
         * @return The mAGJOJOBHEK.
         */
        int getMAGJOJOBHEK();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 915
     * Obf: DPHJKPDLJME
     * </pre>
     *
     * Protobuf type {@code DungeonReviseLevelNotify}
     */
    public static final class DungeonReviseLevelNotify extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:DungeonReviseLevelNotify)
            DungeonReviseLevelNotifyOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use DungeonReviseLevelNotify.newBuilder() to construct.
        private DungeonReviseLevelNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private DungeonReviseLevelNotify() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new DungeonReviseLevelNotify();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private DungeonReviseLevelNotify(
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
                        case 16:
                            {
                                lPEGNBKLNPD_ = input.readUInt32();
                                break;
                            }
                        case 80:
                            {
                                mAGJOJOBHEK_ = input.readUInt32();
                                break;
                            }
                        case 88:
                            {
                                dungeonId_ = input.readUInt32();
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
            return emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass
                    .internal_static_DungeonReviseLevelNotify_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass
                    .internal_static_DungeonReviseLevelNotify_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify
                                    .class,
                            emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify
                                    .Builder.class);
        }

        public static final int LPEGNBKLNPD_FIELD_NUMBER = 2;
        private int lPEGNBKLNPD_;
        /**
         * <code>uint32 LPEGNBKLNPD = 2;</code>
         *
         * @return The lPEGNBKLNPD.
         */
        @java.lang.Override
        public int getLPEGNBKLNPD() {
            return lPEGNBKLNPD_;
        }

        public static final int DUNGEON_ID_FIELD_NUMBER = 11;
        private int dungeonId_;
        /**
         * <code>uint32 dungeon_id = 11;</code>
         *
         * @return The dungeonId.
         */
        @java.lang.Override
        public int getDungeonId() {
            return dungeonId_;
        }

        public static final int MAGJOJOBHEK_FIELD_NUMBER = 10;
        private int mAGJOJOBHEK_;
        /**
         * <code>uint32 MAGJOJOBHEK = 10;</code>
         *
         * @return The mAGJOJOBHEK.
         */
        @java.lang.Override
        public int getMAGJOJOBHEK() {
            return mAGJOJOBHEK_;
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
            if (lPEGNBKLNPD_ != 0) {
                output.writeUInt32(2, lPEGNBKLNPD_);
            }
            if (mAGJOJOBHEK_ != 0) {
                output.writeUInt32(10, mAGJOJOBHEK_);
            }
            if (dungeonId_ != 0) {
                output.writeUInt32(11, dungeonId_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (lPEGNBKLNPD_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(2, lPEGNBKLNPD_);
            }
            if (mAGJOJOBHEK_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(10, mAGJOJOBHEK_);
            }
            if (dungeonId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(11, dungeonId_);
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
                    emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify other =
                    (emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify)
                            obj;

            if (getLPEGNBKLNPD() != other.getLPEGNBKLNPD()) return false;
            if (getDungeonId() != other.getDungeonId()) return false;
            if (getMAGJOJOBHEK() != other.getMAGJOJOBHEK()) return false;
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
            hash = (37 * hash) + LPEGNBKLNPD_FIELD_NUMBER;
            hash = (53 * hash) + getLPEGNBKLNPD();
            hash = (37 * hash) + DUNGEON_ID_FIELD_NUMBER;
            hash = (53 * hash) + getDungeonId();
            hash = (37 * hash) + MAGJOJOBHEK_FIELD_NUMBER;
            hash = (53 * hash) + getMAGJOJOBHEK();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass
                        .DungeonReviseLevelNotify
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass
                        .DungeonReviseLevelNotify
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass
                        .DungeonReviseLevelNotify
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass
                        .DungeonReviseLevelNotify
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass
                        .DungeonReviseLevelNotify
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass
                        .DungeonReviseLevelNotify
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass
                        .DungeonReviseLevelNotify
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass
                        .DungeonReviseLevelNotify
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass
                        .DungeonReviseLevelNotify
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass
                        .DungeonReviseLevelNotify
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass
                        .DungeonReviseLevelNotify
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass
                        .DungeonReviseLevelNotify
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
                emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify
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
         * CmdId: 915
         * Obf: DPHJKPDLJME
         * </pre>
         *
         * Protobuf type {@code DungeonReviseLevelNotify}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:DungeonReviseLevelNotify)
                emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass
                        .DungeonReviseLevelNotifyOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass
                        .internal_static_DungeonReviseLevelNotify_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass
                        .internal_static_DungeonReviseLevelNotify_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass
                                        .DungeonReviseLevelNotify.class,
                                emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass
                                        .DungeonReviseLevelNotify.Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify.newBuilder()
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
                lPEGNBKLNPD_ = 0;

                dungeonId_ = 0;

                mAGJOJOBHEK_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass
                        .internal_static_DungeonReviseLevelNotify_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify
                    build() {
                emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify
                        result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify
                    buildPartial() {
                emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify
                        result =
                                new emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass
                                        .DungeonReviseLevelNotify(this);
                result.lPEGNBKLNPD_ = lPEGNBKLNPD_;
                result.dungeonId_ = dungeonId_;
                result.mAGJOJOBHEK_ = mAGJOJOBHEK_;
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
                        emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass
                                            .DungeonReviseLevelNotify)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify
                            other) {
                if (other
                        == emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify
                                .getDefaultInstance()) return this;
                if (other.getLPEGNBKLNPD() != 0) {
                    setLPEGNBKLNPD(other.getLPEGNBKLNPD());
                }
                if (other.getDungeonId() != 0) {
                    setDungeonId(other.getDungeonId());
                }
                if (other.getMAGJOJOBHEK() != 0) {
                    setMAGJOJOBHEK(other.getMAGJOJOBHEK());
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
                emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass
                                            .DungeonReviseLevelNotify)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int lPEGNBKLNPD_;
            /**
             * <code>uint32 LPEGNBKLNPD = 2;</code>
             *
             * @return The lPEGNBKLNPD.
             */
            @java.lang.Override
            public int getLPEGNBKLNPD() {
                return lPEGNBKLNPD_;
            }
            /**
             * <code>uint32 LPEGNBKLNPD = 2;</code>
             *
             * @param value The lPEGNBKLNPD to set.
             * @return This builder for chaining.
             */
            public Builder setLPEGNBKLNPD(int value) {

                lPEGNBKLNPD_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 LPEGNBKLNPD = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearLPEGNBKLNPD() {

                lPEGNBKLNPD_ = 0;
                onChanged();
                return this;
            }

            private int dungeonId_;
            /**
             * <code>uint32 dungeon_id = 11;</code>
             *
             * @return The dungeonId.
             */
            @java.lang.Override
            public int getDungeonId() {
                return dungeonId_;
            }
            /**
             * <code>uint32 dungeon_id = 11;</code>
             *
             * @param value The dungeonId to set.
             * @return This builder for chaining.
             */
            public Builder setDungeonId(int value) {

                dungeonId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 dungeon_id = 11;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearDungeonId() {

                dungeonId_ = 0;
                onChanged();
                return this;
            }

            private int mAGJOJOBHEK_;
            /**
             * <code>uint32 MAGJOJOBHEK = 10;</code>
             *
             * @return The mAGJOJOBHEK.
             */
            @java.lang.Override
            public int getMAGJOJOBHEK() {
                return mAGJOJOBHEK_;
            }
            /**
             * <code>uint32 MAGJOJOBHEK = 10;</code>
             *
             * @param value The mAGJOJOBHEK to set.
             * @return This builder for chaining.
             */
            public Builder setMAGJOJOBHEK(int value) {

                mAGJOJOBHEK_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 MAGJOJOBHEK = 10;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearMAGJOJOBHEK() {

                mAGJOJOBHEK_ = 0;
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

            // @@protoc_insertion_point(builder_scope:DungeonReviseLevelNotify)
        }

        // @@protoc_insertion_point(class_scope:DungeonReviseLevelNotify)
        private static final emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass
                        .DungeonReviseLevelNotify
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass
                            .DungeonReviseLevelNotify();
        }

        public static emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass
                        .DungeonReviseLevelNotify
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<DungeonReviseLevelNotify> PARSER =
                new com.google.protobuf.AbstractParser<DungeonReviseLevelNotify>() {
                    @java.lang.Override
                    public DungeonReviseLevelNotify parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new DungeonReviseLevelNotify(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<DungeonReviseLevelNotify> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<DungeonReviseLevelNotify> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.DungeonReviseLevelNotifyOuterClass.DungeonReviseLevelNotify
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_DungeonReviseLevelNotify_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_DungeonReviseLevelNotify_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\036DungeonReviseLevelNotify.proto\"X\n\030Dung"
                    + "eonReviseLevelNotify\022\023\n\013LPEGNBKLNPD\030\002 \001("
                    + "\r\022\022\n\ndungeon_id\030\013 \001(\r\022\023\n\013MAGJOJOBHEK\030\n \001"
                    + "(\rB\033\n\031emu.grasscutter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_DungeonReviseLevelNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_DungeonReviseLevelNotify_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_DungeonReviseLevelNotify_descriptor,
                        new java.lang.String[] {
                            "LPEGNBKLNPD", "DungeonId", "MAGJOJOBHEK",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
