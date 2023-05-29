// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AsterMiscInfoNotify.proto

package emu.grasscutter.net.proto;

public final class AsterMiscInfoNotifyOuterClass {
    private AsterMiscInfoNotifyOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface AsterMiscInfoNotifyOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:AsterMiscInfoNotify)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 CBLMAGNNCGK = 5;</code>
         *
         * @return The cBLMAGNNCGK.
         */
        int getCBLMAGNNCGK();

        /**
         * <code>uint32 CGOCPLCJMBA = 10;</code>
         *
         * @return The cGOCPLCJMBA.
         */
        int getCGOCPLCJMBA();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 2181
     * Obf: NIMHLANNJAE
     * </pre>
     *
     * Protobuf type {@code AsterMiscInfoNotify}
     */
    public static final class AsterMiscInfoNotify extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:AsterMiscInfoNotify)
            AsterMiscInfoNotifyOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use AsterMiscInfoNotify.newBuilder() to construct.
        private AsterMiscInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private AsterMiscInfoNotify() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new AsterMiscInfoNotify();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private AsterMiscInfoNotify(
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
                                cBLMAGNNCGK_ = input.readUInt32();
                                break;
                            }
                        case 80:
                            {
                                cGOCPLCJMBA_ = input.readUInt32();
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
            return emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass
                    .internal_static_AsterMiscInfoNotify_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass
                    .internal_static_AsterMiscInfoNotify_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass.AsterMiscInfoNotify.class,
                            emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass.AsterMiscInfoNotify.Builder
                                    .class);
        }

        public static final int CBLMAGNNCGK_FIELD_NUMBER = 5;
        private int cBLMAGNNCGK_;
        /**
         * <code>uint32 CBLMAGNNCGK = 5;</code>
         *
         * @return The cBLMAGNNCGK.
         */
        @java.lang.Override
        public int getCBLMAGNNCGK() {
            return cBLMAGNNCGK_;
        }

        public static final int CGOCPLCJMBA_FIELD_NUMBER = 10;
        private int cGOCPLCJMBA_;
        /**
         * <code>uint32 CGOCPLCJMBA = 10;</code>
         *
         * @return The cGOCPLCJMBA.
         */
        @java.lang.Override
        public int getCGOCPLCJMBA() {
            return cGOCPLCJMBA_;
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
            if (cBLMAGNNCGK_ != 0) {
                output.writeUInt32(5, cBLMAGNNCGK_);
            }
            if (cGOCPLCJMBA_ != 0) {
                output.writeUInt32(10, cGOCPLCJMBA_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (cBLMAGNNCGK_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(5, cBLMAGNNCGK_);
            }
            if (cGOCPLCJMBA_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(10, cGOCPLCJMBA_);
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
                    instanceof emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass.AsterMiscInfoNotify)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass.AsterMiscInfoNotify other =
                    (emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass.AsterMiscInfoNotify) obj;

            if (getCBLMAGNNCGK() != other.getCBLMAGNNCGK()) return false;
            if (getCGOCPLCJMBA() != other.getCGOCPLCJMBA()) return false;
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
            hash = (37 * hash) + CBLMAGNNCGK_FIELD_NUMBER;
            hash = (53 * hash) + getCBLMAGNNCGK();
            hash = (37 * hash) + CGOCPLCJMBA_FIELD_NUMBER;
            hash = (53 * hash) + getCGOCPLCJMBA();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass.AsterMiscInfoNotify
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass.AsterMiscInfoNotify
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass.AsterMiscInfoNotify
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass.AsterMiscInfoNotify
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass.AsterMiscInfoNotify
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass.AsterMiscInfoNotify
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass.AsterMiscInfoNotify
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass.AsterMiscInfoNotify
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass.AsterMiscInfoNotify
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass.AsterMiscInfoNotify
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass.AsterMiscInfoNotify
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass.AsterMiscInfoNotify
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
                emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass.AsterMiscInfoNotify prototype) {
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
         * CmdId: 2181
         * Obf: NIMHLANNJAE
         * </pre>
         *
         * Protobuf type {@code AsterMiscInfoNotify}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:AsterMiscInfoNotify)
                emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass.AsterMiscInfoNotifyOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass
                        .internal_static_AsterMiscInfoNotify_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass
                        .internal_static_AsterMiscInfoNotify_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass.AsterMiscInfoNotify.class,
                                emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass.AsterMiscInfoNotify.Builder
                                        .class);
            }

            // Construct using
            // emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass.AsterMiscInfoNotify.newBuilder()
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
                cBLMAGNNCGK_ = 0;

                cGOCPLCJMBA_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass
                        .internal_static_AsterMiscInfoNotify_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass.AsterMiscInfoNotify
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass.AsterMiscInfoNotify
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass.AsterMiscInfoNotify build() {
                emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass.AsterMiscInfoNotify result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass.AsterMiscInfoNotify
                    buildPartial() {
                emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass.AsterMiscInfoNotify result =
                        new emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass.AsterMiscInfoNotify(this);
                result.cBLMAGNNCGK_ = cBLMAGNNCGK_;
                result.cGOCPLCJMBA_ = cGOCPLCJMBA_;
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
                        emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass.AsterMiscInfoNotify) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass.AsterMiscInfoNotify) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass.AsterMiscInfoNotify other) {
                if (other
                        == emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass.AsterMiscInfoNotify
                                .getDefaultInstance()) return this;
                if (other.getCBLMAGNNCGK() != 0) {
                    setCBLMAGNNCGK(other.getCBLMAGNNCGK());
                }
                if (other.getCGOCPLCJMBA() != 0) {
                    setCGOCPLCJMBA(other.getCGOCPLCJMBA());
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
                emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass.AsterMiscInfoNotify parsedMessage =
                        null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass.AsterMiscInfoNotify)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int cBLMAGNNCGK_;
            /**
             * <code>uint32 CBLMAGNNCGK = 5;</code>
             *
             * @return The cBLMAGNNCGK.
             */
            @java.lang.Override
            public int getCBLMAGNNCGK() {
                return cBLMAGNNCGK_;
            }
            /**
             * <code>uint32 CBLMAGNNCGK = 5;</code>
             *
             * @param value The cBLMAGNNCGK to set.
             * @return This builder for chaining.
             */
            public Builder setCBLMAGNNCGK(int value) {

                cBLMAGNNCGK_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 CBLMAGNNCGK = 5;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearCBLMAGNNCGK() {

                cBLMAGNNCGK_ = 0;
                onChanged();
                return this;
            }

            private int cGOCPLCJMBA_;
            /**
             * <code>uint32 CGOCPLCJMBA = 10;</code>
             *
             * @return The cGOCPLCJMBA.
             */
            @java.lang.Override
            public int getCGOCPLCJMBA() {
                return cGOCPLCJMBA_;
            }
            /**
             * <code>uint32 CGOCPLCJMBA = 10;</code>
             *
             * @param value The cGOCPLCJMBA to set.
             * @return This builder for chaining.
             */
            public Builder setCGOCPLCJMBA(int value) {

                cGOCPLCJMBA_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 CGOCPLCJMBA = 10;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearCGOCPLCJMBA() {

                cGOCPLCJMBA_ = 0;
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

            // @@protoc_insertion_point(builder_scope:AsterMiscInfoNotify)
        }

        // @@protoc_insertion_point(class_scope:AsterMiscInfoNotify)
        private static final emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass.AsterMiscInfoNotify
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass.AsterMiscInfoNotify();
        }

        public static emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass.AsterMiscInfoNotify
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<AsterMiscInfoNotify> PARSER =
                new com.google.protobuf.AbstractParser<AsterMiscInfoNotify>() {
                    @java.lang.Override
                    public AsterMiscInfoNotify parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new AsterMiscInfoNotify(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<AsterMiscInfoNotify> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<AsterMiscInfoNotify> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.AsterMiscInfoNotifyOuterClass.AsterMiscInfoNotify
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_AsterMiscInfoNotify_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_AsterMiscInfoNotify_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\031AsterMiscInfoNotify.proto\"?\n\023AsterMisc"
                    + "InfoNotify\022\023\n\013CBLMAGNNCGK\030\005 \001(\r\022\023\n\013CGOCP"
                    + "LCJMBA\030\n \001(\rB\033\n\031emu.grasscutter.net.prot"
                    + "ob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_AsterMiscInfoNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AsterMiscInfoNotify_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_AsterMiscInfoNotify_descriptor,
                        new java.lang.String[] {
                            "CBLMAGNNCGK", "CGOCPLCJMBA",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
