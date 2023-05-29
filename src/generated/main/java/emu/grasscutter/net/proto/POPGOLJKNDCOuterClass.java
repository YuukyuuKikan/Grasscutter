// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POPGOLJKNDC.proto

package emu.grasscutter.net.proto;

public final class POPGOLJKNDCOuterClass {
    private POPGOLJKNDCOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface POPGOLJKNDCOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:POPGOLJKNDC)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 room_id = 7;</code>
         *
         * @return The roomId.
         */
        int getRoomId();

        /**
         * <code>int32 retcode = 14;</code>
         *
         * @return The retcode.
         */
        int getRetcode();

        /**
         * <code>uint64 dungeon_guid = 3;</code>
         *
         * @return The dungeonGuid.
         */
        long getDungeonGuid();

        /**
         * <code>bool is_add = 5;</code>
         *
         * @return The isAdd.
         */
        boolean getIsAdd();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 9234
     * </pre>
     *
     * Protobuf type {@code POPGOLJKNDC}
     */
    public static final class POPGOLJKNDC extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:POPGOLJKNDC)
            POPGOLJKNDCOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use POPGOLJKNDC.newBuilder() to construct.
        private POPGOLJKNDC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private POPGOLJKNDC() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new POPGOLJKNDC();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private POPGOLJKNDC(
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
                                dungeonGuid_ = input.readUInt64();
                                break;
                            }
                        case 40:
                            {
                                isAdd_ = input.readBool();
                                break;
                            }
                        case 56:
                            {
                                roomId_ = input.readUInt32();
                                break;
                            }
                        case 112:
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
            return emu.grasscutter.net.proto.POPGOLJKNDCOuterClass.internal_static_POPGOLJKNDC_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.POPGOLJKNDCOuterClass
                    .internal_static_POPGOLJKNDC_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.POPGOLJKNDCOuterClass.POPGOLJKNDC.class,
                            emu.grasscutter.net.proto.POPGOLJKNDCOuterClass.POPGOLJKNDC.Builder.class);
        }

        public static final int ROOM_ID_FIELD_NUMBER = 7;
        private int roomId_;
        /**
         * <code>uint32 room_id = 7;</code>
         *
         * @return The roomId.
         */
        @java.lang.Override
        public int getRoomId() {
            return roomId_;
        }

        public static final int RETCODE_FIELD_NUMBER = 14;
        private int retcode_;
        /**
         * <code>int32 retcode = 14;</code>
         *
         * @return The retcode.
         */
        @java.lang.Override
        public int getRetcode() {
            return retcode_;
        }

        public static final int DUNGEON_GUID_FIELD_NUMBER = 3;
        private long dungeonGuid_;
        /**
         * <code>uint64 dungeon_guid = 3;</code>
         *
         * @return The dungeonGuid.
         */
        @java.lang.Override
        public long getDungeonGuid() {
            return dungeonGuid_;
        }

        public static final int IS_ADD_FIELD_NUMBER = 5;
        private boolean isAdd_;
        /**
         * <code>bool is_add = 5;</code>
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
            if (dungeonGuid_ != 0L) {
                output.writeUInt64(3, dungeonGuid_);
            }
            if (isAdd_ != false) {
                output.writeBool(5, isAdd_);
            }
            if (roomId_ != 0) {
                output.writeUInt32(7, roomId_);
            }
            if (retcode_ != 0) {
                output.writeInt32(14, retcode_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (dungeonGuid_ != 0L) {
                size += com.google.protobuf.CodedOutputStream.computeUInt64Size(3, dungeonGuid_);
            }
            if (isAdd_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(5, isAdd_);
            }
            if (roomId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(7, roomId_);
            }
            if (retcode_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeInt32Size(14, retcode_);
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
            if (!(obj instanceof emu.grasscutter.net.proto.POPGOLJKNDCOuterClass.POPGOLJKNDC)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.POPGOLJKNDCOuterClass.POPGOLJKNDC other =
                    (emu.grasscutter.net.proto.POPGOLJKNDCOuterClass.POPGOLJKNDC) obj;

            if (getRoomId() != other.getRoomId()) return false;
            if (getRetcode() != other.getRetcode()) return false;
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
            hash = (37 * hash) + ROOM_ID_FIELD_NUMBER;
            hash = (53 * hash) + getRoomId();
            hash = (37 * hash) + RETCODE_FIELD_NUMBER;
            hash = (53 * hash) + getRetcode();
            hash = (37 * hash) + DUNGEON_GUID_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getDungeonGuid());
            hash = (37 * hash) + IS_ADD_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsAdd());
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.POPGOLJKNDCOuterClass.POPGOLJKNDC parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.POPGOLJKNDCOuterClass.POPGOLJKNDC parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.POPGOLJKNDCOuterClass.POPGOLJKNDC parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.POPGOLJKNDCOuterClass.POPGOLJKNDC parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.POPGOLJKNDCOuterClass.POPGOLJKNDC parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.POPGOLJKNDCOuterClass.POPGOLJKNDC parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.POPGOLJKNDCOuterClass.POPGOLJKNDC parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.POPGOLJKNDCOuterClass.POPGOLJKNDC parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.POPGOLJKNDCOuterClass.POPGOLJKNDC parseDelimitedFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.POPGOLJKNDCOuterClass.POPGOLJKNDC parseDelimitedFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.POPGOLJKNDCOuterClass.POPGOLJKNDC parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.POPGOLJKNDCOuterClass.POPGOLJKNDC parseFrom(
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
                emu.grasscutter.net.proto.POPGOLJKNDCOuterClass.POPGOLJKNDC prototype) {
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
         * CmdId: 9234
         * </pre>
         *
         * Protobuf type {@code POPGOLJKNDC}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:POPGOLJKNDC)
                emu.grasscutter.net.proto.POPGOLJKNDCOuterClass.POPGOLJKNDCOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.POPGOLJKNDCOuterClass
                        .internal_static_POPGOLJKNDC_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.POPGOLJKNDCOuterClass
                        .internal_static_POPGOLJKNDC_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.POPGOLJKNDCOuterClass.POPGOLJKNDC.class,
                                emu.grasscutter.net.proto.POPGOLJKNDCOuterClass.POPGOLJKNDC.Builder.class);
            }

            // Construct using emu.grasscutter.net.proto.POPGOLJKNDCOuterClass.POPGOLJKNDC.newBuilder()
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
                roomId_ = 0;

                retcode_ = 0;

                dungeonGuid_ = 0L;

                isAdd_ = false;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.POPGOLJKNDCOuterClass
                        .internal_static_POPGOLJKNDC_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.POPGOLJKNDCOuterClass.POPGOLJKNDC
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.POPGOLJKNDCOuterClass.POPGOLJKNDC.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.POPGOLJKNDCOuterClass.POPGOLJKNDC build() {
                emu.grasscutter.net.proto.POPGOLJKNDCOuterClass.POPGOLJKNDC result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.POPGOLJKNDCOuterClass.POPGOLJKNDC buildPartial() {
                emu.grasscutter.net.proto.POPGOLJKNDCOuterClass.POPGOLJKNDC result =
                        new emu.grasscutter.net.proto.POPGOLJKNDCOuterClass.POPGOLJKNDC(this);
                result.roomId_ = roomId_;
                result.retcode_ = retcode_;
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
                if (other instanceof emu.grasscutter.net.proto.POPGOLJKNDCOuterClass.POPGOLJKNDC) {
                    return mergeFrom((emu.grasscutter.net.proto.POPGOLJKNDCOuterClass.POPGOLJKNDC) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(emu.grasscutter.net.proto.POPGOLJKNDCOuterClass.POPGOLJKNDC other) {
                if (other
                        == emu.grasscutter.net.proto.POPGOLJKNDCOuterClass.POPGOLJKNDC.getDefaultInstance())
                    return this;
                if (other.getRoomId() != 0) {
                    setRoomId(other.getRoomId());
                }
                if (other.getRetcode() != 0) {
                    setRetcode(other.getRetcode());
                }
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
                emu.grasscutter.net.proto.POPGOLJKNDCOuterClass.POPGOLJKNDC parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.POPGOLJKNDCOuterClass.POPGOLJKNDC)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int roomId_;
            /**
             * <code>uint32 room_id = 7;</code>
             *
             * @return The roomId.
             */
            @java.lang.Override
            public int getRoomId() {
                return roomId_;
            }
            /**
             * <code>uint32 room_id = 7;</code>
             *
             * @param value The roomId to set.
             * @return This builder for chaining.
             */
            public Builder setRoomId(int value) {

                roomId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 room_id = 7;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearRoomId() {

                roomId_ = 0;
                onChanged();
                return this;
            }

            private int retcode_;
            /**
             * <code>int32 retcode = 14;</code>
             *
             * @return The retcode.
             */
            @java.lang.Override
            public int getRetcode() {
                return retcode_;
            }
            /**
             * <code>int32 retcode = 14;</code>
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
             * <code>int32 retcode = 14;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearRetcode() {

                retcode_ = 0;
                onChanged();
                return this;
            }

            private long dungeonGuid_;
            /**
             * <code>uint64 dungeon_guid = 3;</code>
             *
             * @return The dungeonGuid.
             */
            @java.lang.Override
            public long getDungeonGuid() {
                return dungeonGuid_;
            }
            /**
             * <code>uint64 dungeon_guid = 3;</code>
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
             * <code>uint64 dungeon_guid = 3;</code>
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
             * <code>bool is_add = 5;</code>
             *
             * @return The isAdd.
             */
            @java.lang.Override
            public boolean getIsAdd() {
                return isAdd_;
            }
            /**
             * <code>bool is_add = 5;</code>
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
             * <code>bool is_add = 5;</code>
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

            // @@protoc_insertion_point(builder_scope:POPGOLJKNDC)
        }

        // @@protoc_insertion_point(class_scope:POPGOLJKNDC)
        private static final emu.grasscutter.net.proto.POPGOLJKNDCOuterClass.POPGOLJKNDC
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new emu.grasscutter.net.proto.POPGOLJKNDCOuterClass.POPGOLJKNDC();
        }

        public static emu.grasscutter.net.proto.POPGOLJKNDCOuterClass.POPGOLJKNDC getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<POPGOLJKNDC> PARSER =
                new com.google.protobuf.AbstractParser<POPGOLJKNDC>() {
                    @java.lang.Override
                    public POPGOLJKNDC parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new POPGOLJKNDC(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<POPGOLJKNDC> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<POPGOLJKNDC> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.POPGOLJKNDCOuterClass.POPGOLJKNDC getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_POPGOLJKNDC_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_POPGOLJKNDC_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\021POPGOLJKNDC.proto\"U\n\013POPGOLJKNDC\022\017\n\007ro"
                    + "om_id\030\007 \001(\r\022\017\n\007retcode\030\016 \001(\005\022\024\n\014dungeon_"
                    + "guid\030\003 \001(\004\022\016\n\006is_add\030\005 \001(\010B\033\n\031emu.grassc"
                    + "utter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_POPGOLJKNDC_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_POPGOLJKNDC_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_POPGOLJKNDC_descriptor,
                        new java.lang.String[] {
                            "RoomId", "Retcode", "DungeonGuid", "IsAdd",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
