// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MPGNFPDIGDJ.proto

package emu.grasscutter.net.proto;

public final class MPGNFPDIGDJOuterClass {
    private MPGNFPDIGDJOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface MPGNFPDIGDJOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:MPGNFPDIGDJ)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint64 dungeon_guid = 9;</code>
         *
         * @return The dungeonGuid.
         */
        long getDungeonGuid();

        /**
         * <code>bool is_add = 1;</code>
         *
         * @return The isAdd.
         */
        boolean getIsAdd();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 9196
     * </pre>
     *
     * Protobuf type {@code MPGNFPDIGDJ}
     */
    public static final class MPGNFPDIGDJ extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:MPGNFPDIGDJ)
            MPGNFPDIGDJOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use MPGNFPDIGDJ.newBuilder() to construct.
        private MPGNFPDIGDJ(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private MPGNFPDIGDJ() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new MPGNFPDIGDJ();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private MPGNFPDIGDJ(
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
                        case 8:
                            {
                                isAdd_ = input.readBool();
                                break;
                            }
                        case 72:
                            {
                                dungeonGuid_ = input.readUInt64();
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
            return emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass.internal_static_MPGNFPDIGDJ_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass
                    .internal_static_MPGNFPDIGDJ_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass.MPGNFPDIGDJ.class,
                            emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass.MPGNFPDIGDJ.Builder.class);
        }

        public static final int DUNGEON_GUID_FIELD_NUMBER = 9;
        private long dungeonGuid_;
        /**
         * <code>uint64 dungeon_guid = 9;</code>
         *
         * @return The dungeonGuid.
         */
        @java.lang.Override
        public long getDungeonGuid() {
            return dungeonGuid_;
        }

        public static final int IS_ADD_FIELD_NUMBER = 1;
        private boolean isAdd_;
        /**
         * <code>bool is_add = 1;</code>
         *
         * @return The isAdd.
         */
        @java.lang.Override
        public boolean getIsAdd() {
            return isAdd_;
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
            if (isAdd_ != false) {
                output.writeBool(1, isAdd_);
            }
            if (dungeonGuid_ != 0L) {
                output.writeUInt64(9, dungeonGuid_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (isAdd_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, isAdd_);
            }
            if (dungeonGuid_ != 0L) {
                size += com.google.protobuf.CodedOutputStream.computeUInt64Size(9, dungeonGuid_);
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
            if (!(obj instanceof emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass.MPGNFPDIGDJ)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass.MPGNFPDIGDJ other =
                    (emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass.MPGNFPDIGDJ) obj;

            if (getDungeonGuid() != other.getDungeonGuid()) return false;
            if (getIsAdd() != other.getIsAdd()) return false;
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
            hash = (37 * hash) + DUNGEON_GUID_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getDungeonGuid());
            hash = (37 * hash) + IS_ADD_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsAdd());
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass.MPGNFPDIGDJ parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass.MPGNFPDIGDJ parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass.MPGNFPDIGDJ parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass.MPGNFPDIGDJ parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass.MPGNFPDIGDJ parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass.MPGNFPDIGDJ parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass.MPGNFPDIGDJ parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass.MPGNFPDIGDJ parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass.MPGNFPDIGDJ parseDelimitedFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass.MPGNFPDIGDJ parseDelimitedFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass.MPGNFPDIGDJ parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass.MPGNFPDIGDJ parseFrom(
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
                emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass.MPGNFPDIGDJ prototype) {
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
         * CmdId: 9196
         * </pre>
         *
         * Protobuf type {@code MPGNFPDIGDJ}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:MPGNFPDIGDJ)
                emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass.MPGNFPDIGDJOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass
                        .internal_static_MPGNFPDIGDJ_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass
                        .internal_static_MPGNFPDIGDJ_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass.MPGNFPDIGDJ.class,
                                emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass.MPGNFPDIGDJ.Builder.class);
            }

            // Construct using emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass.MPGNFPDIGDJ.newBuilder()
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
                dungeonGuid_ = 0L;

                isAdd_ = false;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass
                        .internal_static_MPGNFPDIGDJ_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass.MPGNFPDIGDJ
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass.MPGNFPDIGDJ.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass.MPGNFPDIGDJ build() {
                emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass.MPGNFPDIGDJ result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass.MPGNFPDIGDJ buildPartial() {
                emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass.MPGNFPDIGDJ result =
                        new emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass.MPGNFPDIGDJ(this);
                result.dungeonGuid_ = dungeonGuid_;
                result.isAdd_ = isAdd_;
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
                if (other instanceof emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass.MPGNFPDIGDJ) {
                    return mergeFrom((emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass.MPGNFPDIGDJ) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass.MPGNFPDIGDJ other) {
                if (other
                        == emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass.MPGNFPDIGDJ.getDefaultInstance())
                    return this;
                if (other.getDungeonGuid() != 0L) {
                    setDungeonGuid(other.getDungeonGuid());
                }
                if (other.getIsAdd() != false) {
                    setIsAdd(other.getIsAdd());
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
                emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass.MPGNFPDIGDJ parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass.MPGNFPDIGDJ)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private long dungeonGuid_;
            /**
             * <code>uint64 dungeon_guid = 9;</code>
             *
             * @return The dungeonGuid.
             */
            @java.lang.Override
            public long getDungeonGuid() {
                return dungeonGuid_;
            }
            /**
             * <code>uint64 dungeon_guid = 9;</code>
             *
             * @param value The dungeonGuid to set.
             * @return This builder for chaining.
             */
            public Builder setDungeonGuid(long value) {

                dungeonGuid_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint64 dungeon_guid = 9;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearDungeonGuid() {

                dungeonGuid_ = 0L;
                onChanged();
                return this;
            }

            private boolean isAdd_;
            /**
             * <code>bool is_add = 1;</code>
             *
             * @return The isAdd.
             */
            @java.lang.Override
            public boolean getIsAdd() {
                return isAdd_;
            }
            /**
             * <code>bool is_add = 1;</code>
             *
             * @param value The isAdd to set.
             * @return This builder for chaining.
             */
            public Builder setIsAdd(boolean value) {

                isAdd_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool is_add = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsAdd() {

                isAdd_ = false;
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

            // @@protoc_insertion_point(builder_scope:MPGNFPDIGDJ)
        }

        // @@protoc_insertion_point(class_scope:MPGNFPDIGDJ)
        private static final emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass.MPGNFPDIGDJ
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass.MPGNFPDIGDJ();
        }

        public static emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass.MPGNFPDIGDJ getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<MPGNFPDIGDJ> PARSER =
                new com.google.protobuf.AbstractParser<MPGNFPDIGDJ>() {
                    @java.lang.Override
                    public MPGNFPDIGDJ parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new MPGNFPDIGDJ(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<MPGNFPDIGDJ> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<MPGNFPDIGDJ> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.MPGNFPDIGDJOuterClass.MPGNFPDIGDJ getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_MPGNFPDIGDJ_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_MPGNFPDIGDJ_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\021MPGNFPDIGDJ.proto\"3\n\013MPGNFPDIGDJ\022\024\n\014du"
                    + "ngeon_guid\030\t \001(\004\022\016\n\006is_add\030\001 \001(\010B\033\n\031emu."
                    + "grasscutter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_MPGNFPDIGDJ_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_MPGNFPDIGDJ_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_MPGNFPDIGDJ_descriptor,
                        new java.lang.String[] {
                            "DungeonGuid", "IsAdd",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
