// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TryEnterNextRogueDiaryDungeonRsp.proto

package emu.grasscutter.net.proto;

public final class TryEnterNextRogueDiaryDungeonRspOuterClass {
    private TryEnterNextRogueDiaryDungeonRspOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface TryEnterNextRogueDiaryDungeonRspOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:TryEnterNextRogueDiaryDungeonRsp)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>int32 retcode = 2;</code>
         *
         * @return The retcode.
         */
        int getRetcode();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 8348
     * Obf: FPNHCCBIJMM
     * </pre>
     *
     * Protobuf type {@code TryEnterNextRogueDiaryDungeonRsp}
     */
    public static final class TryEnterNextRogueDiaryDungeonRsp
            extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:TryEnterNextRogueDiaryDungeonRsp)
            TryEnterNextRogueDiaryDungeonRspOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use TryEnterNextRogueDiaryDungeonRsp.newBuilder() to construct.
        private TryEnterNextRogueDiaryDungeonRsp(
                com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private TryEnterNextRogueDiaryDungeonRsp() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new TryEnterNextRogueDiaryDungeonRsp();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private TryEnterNextRogueDiaryDungeonRsp(
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
            return emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                    .internal_static_TryEnterNextRogueDiaryDungeonRsp_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                    .internal_static_TryEnterNextRogueDiaryDungeonRsp_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                                    .TryEnterNextRogueDiaryDungeonRsp.class,
                            emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                                    .TryEnterNextRogueDiaryDungeonRsp.Builder.class);
        }

        public static final int RETCODE_FIELD_NUMBER = 2;
        private int retcode_;
        /**
         * <code>int32 retcode = 2;</code>
         *
         * @return The retcode.
         */
        @java.lang.Override
        public int getRetcode() {
            return retcode_;
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
            if (retcode_ != 0) {
                output.writeInt32(2, retcode_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (retcode_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, retcode_);
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
                    emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                            .TryEnterNextRogueDiaryDungeonRsp)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                            .TryEnterNextRogueDiaryDungeonRsp
                    other =
                            (emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                                            .TryEnterNextRogueDiaryDungeonRsp)
                                    obj;

            if (getRetcode() != other.getRetcode()) return false;
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
            hash = (37 * hash) + RETCODE_FIELD_NUMBER;
            hash = (53 * hash) + getRetcode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                        .TryEnterNextRogueDiaryDungeonRsp
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                        .TryEnterNextRogueDiaryDungeonRsp
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                        .TryEnterNextRogueDiaryDungeonRsp
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                        .TryEnterNextRogueDiaryDungeonRsp
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                        .TryEnterNextRogueDiaryDungeonRsp
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                        .TryEnterNextRogueDiaryDungeonRsp
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                        .TryEnterNextRogueDiaryDungeonRsp
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                        .TryEnterNextRogueDiaryDungeonRsp
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                        .TryEnterNextRogueDiaryDungeonRsp
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                        .TryEnterNextRogueDiaryDungeonRsp
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                        .TryEnterNextRogueDiaryDungeonRsp
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                        .TryEnterNextRogueDiaryDungeonRsp
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
                emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                                .TryEnterNextRogueDiaryDungeonRsp
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
         * CmdId: 8348
         * Obf: FPNHCCBIJMM
         * </pre>
         *
         * Protobuf type {@code TryEnterNextRogueDiaryDungeonRsp}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:TryEnterNextRogueDiaryDungeonRsp)
                emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                        .TryEnterNextRogueDiaryDungeonRspOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                        .internal_static_TryEnterNextRogueDiaryDungeonRsp_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                        .internal_static_TryEnterNextRogueDiaryDungeonRsp_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                                        .TryEnterNextRogueDiaryDungeonRsp.class,
                                emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                                        .TryEnterNextRogueDiaryDungeonRsp.Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass.TryEnterNextRogueDiaryDungeonRsp.newBuilder()
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
                retcode_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                        .internal_static_TryEnterNextRogueDiaryDungeonRsp_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                            .TryEnterNextRogueDiaryDungeonRsp
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                        .TryEnterNextRogueDiaryDungeonRsp.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                            .TryEnterNextRogueDiaryDungeonRsp
                    build() {
                emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                                .TryEnterNextRogueDiaryDungeonRsp
                        result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                            .TryEnterNextRogueDiaryDungeonRsp
                    buildPartial() {
                emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                                .TryEnterNextRogueDiaryDungeonRsp
                        result =
                                new emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                                        .TryEnterNextRogueDiaryDungeonRsp(this);
                result.retcode_ = retcode_;
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
                        emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                                .TryEnterNextRogueDiaryDungeonRsp) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                                            .TryEnterNextRogueDiaryDungeonRsp)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                                    .TryEnterNextRogueDiaryDungeonRsp
                            other) {
                if (other
                        == emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                                .TryEnterNextRogueDiaryDungeonRsp.getDefaultInstance()) return this;
                if (other.getRetcode() != 0) {
                    setRetcode(other.getRetcode());
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
                emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                                .TryEnterNextRogueDiaryDungeonRsp
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                                            .TryEnterNextRogueDiaryDungeonRsp)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int retcode_;
            /**
             * <code>int32 retcode = 2;</code>
             *
             * @return The retcode.
             */
            @java.lang.Override
            public int getRetcode() {
                return retcode_;
            }
            /**
             * <code>int32 retcode = 2;</code>
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
             * <code>int32 retcode = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearRetcode() {

                retcode_ = 0;
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

            // @@protoc_insertion_point(builder_scope:TryEnterNextRogueDiaryDungeonRsp)
        }

        // @@protoc_insertion_point(class_scope:TryEnterNextRogueDiaryDungeonRsp)
        private static final emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                        .TryEnterNextRogueDiaryDungeonRsp
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                            .TryEnterNextRogueDiaryDungeonRsp();
        }

        public static emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                        .TryEnterNextRogueDiaryDungeonRsp
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<TryEnterNextRogueDiaryDungeonRsp> PARSER =
                new com.google.protobuf.AbstractParser<TryEnterNextRogueDiaryDungeonRsp>() {
                    @java.lang.Override
                    public TryEnterNextRogueDiaryDungeonRsp parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new TryEnterNextRogueDiaryDungeonRsp(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<TryEnterNextRogueDiaryDungeonRsp> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<TryEnterNextRogueDiaryDungeonRsp> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.TryEnterNextRogueDiaryDungeonRspOuterClass
                        .TryEnterNextRogueDiaryDungeonRsp
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_TryEnterNextRogueDiaryDungeonRsp_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_TryEnterNextRogueDiaryDungeonRsp_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n&TryEnterNextRogueDiaryDungeonRsp.proto"
                    + "\"3\n TryEnterNextRogueDiaryDungeonRsp\022\017\n\007"
                    + "retcode\030\002 \001(\005B\033\n\031emu.grasscutter.net.pro"
                    + "tob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_TryEnterNextRogueDiaryDungeonRsp_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_TryEnterNextRogueDiaryDungeonRsp_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_TryEnterNextRogueDiaryDungeonRsp_descriptor,
                        new java.lang.String[] {
                            "Retcode",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
