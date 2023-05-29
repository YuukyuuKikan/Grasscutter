// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClientNewMailNotify.proto

package emu.grasscutter.net.proto;

public final class ClientNewMailNotifyOuterClass {
    private ClientNewMailNotifyOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface ClientNewMailNotifyOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:ClientNewMailNotify)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 CDIKCAIGHAE = 2;</code>
         *
         * @return The cDIKCAIGHAE.
         */
        int getCDIKCAIGHAE();

        /**
         * <code>uint32 KJEEEDPFMFE = 6;</code>
         *
         * @return The kJEEEDPFMFE.
         */
        int getKJEEEDPFMFE();

        /**
         * <code>bool IGMALOKLIPP = 14;</code>
         *
         * @return The iGMALOKLIPP.
         */
        boolean getIGMALOKLIPP();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 1430
     * Obf: BEBABNFCJIO
     * </pre>
     *
     * Protobuf type {@code ClientNewMailNotify}
     */
    public static final class ClientNewMailNotify extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:ClientNewMailNotify)
            ClientNewMailNotifyOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use ClientNewMailNotify.newBuilder() to construct.
        private ClientNewMailNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private ClientNewMailNotify() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new ClientNewMailNotify();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ClientNewMailNotify(
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
                                cDIKCAIGHAE_ = input.readUInt32();
                                break;
                            }
                        case 48:
                            {
                                kJEEEDPFMFE_ = input.readUInt32();
                                break;
                            }
                        case 112:
                            {
                                iGMALOKLIPP_ = input.readBool();
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
            return emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass
                    .internal_static_ClientNewMailNotify_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass
                    .internal_static_ClientNewMailNotify_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify.class,
                            emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify.Builder
                                    .class);
        }

        public static final int CDIKCAIGHAE_FIELD_NUMBER = 2;
        private int cDIKCAIGHAE_;
        /**
         * <code>uint32 CDIKCAIGHAE = 2;</code>
         *
         * @return The cDIKCAIGHAE.
         */
        @java.lang.Override
        public int getCDIKCAIGHAE() {
            return cDIKCAIGHAE_;
        }

        public static final int KJEEEDPFMFE_FIELD_NUMBER = 6;
        private int kJEEEDPFMFE_;
        /**
         * <code>uint32 KJEEEDPFMFE = 6;</code>
         *
         * @return The kJEEEDPFMFE.
         */
        @java.lang.Override
        public int getKJEEEDPFMFE() {
            return kJEEEDPFMFE_;
        }

        public static final int IGMALOKLIPP_FIELD_NUMBER = 14;
        private boolean iGMALOKLIPP_;
        /**
         * <code>bool IGMALOKLIPP = 14;</code>
         *
         * @return The iGMALOKLIPP.
         */
        @java.lang.Override
        public boolean getIGMALOKLIPP() {
            return iGMALOKLIPP_;
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
            if (cDIKCAIGHAE_ != 0) {
                output.writeUInt32(2, cDIKCAIGHAE_);
            }
            if (kJEEEDPFMFE_ != 0) {
                output.writeUInt32(6, kJEEEDPFMFE_);
            }
            if (iGMALOKLIPP_ != false) {
                output.writeBool(14, iGMALOKLIPP_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (cDIKCAIGHAE_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(2, cDIKCAIGHAE_);
            }
            if (kJEEEDPFMFE_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(6, kJEEEDPFMFE_);
            }
            if (iGMALOKLIPP_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(14, iGMALOKLIPP_);
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
                    instanceof emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify other =
                    (emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify) obj;

            if (getCDIKCAIGHAE() != other.getCDIKCAIGHAE()) return false;
            if (getKJEEEDPFMFE() != other.getKJEEEDPFMFE()) return false;
            if (getIGMALOKLIPP() != other.getIGMALOKLIPP()) return false;
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
            hash = (37 * hash) + CDIKCAIGHAE_FIELD_NUMBER;
            hash = (53 * hash) + getCDIKCAIGHAE();
            hash = (37 * hash) + KJEEEDPFMFE_FIELD_NUMBER;
            hash = (53 * hash) + getKJEEEDPFMFE();
            hash = (37 * hash) + IGMALOKLIPP_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIGMALOKLIPP());
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify
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
                emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify prototype) {
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
         * CmdId: 1430
         * Obf: BEBABNFCJIO
         * </pre>
         *
         * Protobuf type {@code ClientNewMailNotify}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:ClientNewMailNotify)
                emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotifyOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass
                        .internal_static_ClientNewMailNotify_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass
                        .internal_static_ClientNewMailNotify_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify.class,
                                emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify.Builder
                                        .class);
            }

            // Construct using
            // emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify.newBuilder()
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
                cDIKCAIGHAE_ = 0;

                kJEEEDPFMFE_ = 0;

                iGMALOKLIPP_ = false;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass
                        .internal_static_ClientNewMailNotify_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify build() {
                emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify
                    buildPartial() {
                emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify result =
                        new emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify(this);
                result.cDIKCAIGHAE_ = cDIKCAIGHAE_;
                result.kJEEEDPFMFE_ = kJEEEDPFMFE_;
                result.iGMALOKLIPP_ = iGMALOKLIPP_;
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
                        emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify other) {
                if (other
                        == emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify
                                .getDefaultInstance()) return this;
                if (other.getCDIKCAIGHAE() != 0) {
                    setCDIKCAIGHAE(other.getCDIKCAIGHAE());
                }
                if (other.getKJEEEDPFMFE() != 0) {
                    setKJEEEDPFMFE(other.getKJEEEDPFMFE());
                }
                if (other.getIGMALOKLIPP() != false) {
                    setIGMALOKLIPP(other.getIGMALOKLIPP());
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
                emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify parsedMessage =
                        null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int cDIKCAIGHAE_;
            /**
             * <code>uint32 CDIKCAIGHAE = 2;</code>
             *
             * @return The cDIKCAIGHAE.
             */
            @java.lang.Override
            public int getCDIKCAIGHAE() {
                return cDIKCAIGHAE_;
            }
            /**
             * <code>uint32 CDIKCAIGHAE = 2;</code>
             *
             * @param value The cDIKCAIGHAE to set.
             * @return This builder for chaining.
             */
            public Builder setCDIKCAIGHAE(int value) {

                cDIKCAIGHAE_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 CDIKCAIGHAE = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearCDIKCAIGHAE() {

                cDIKCAIGHAE_ = 0;
                onChanged();
                return this;
            }

            private int kJEEEDPFMFE_;
            /**
             * <code>uint32 KJEEEDPFMFE = 6;</code>
             *
             * @return The kJEEEDPFMFE.
             */
            @java.lang.Override
            public int getKJEEEDPFMFE() {
                return kJEEEDPFMFE_;
            }
            /**
             * <code>uint32 KJEEEDPFMFE = 6;</code>
             *
             * @param value The kJEEEDPFMFE to set.
             * @return This builder for chaining.
             */
            public Builder setKJEEEDPFMFE(int value) {

                kJEEEDPFMFE_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 KJEEEDPFMFE = 6;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearKJEEEDPFMFE() {

                kJEEEDPFMFE_ = 0;
                onChanged();
                return this;
            }

            private boolean iGMALOKLIPP_;
            /**
             * <code>bool IGMALOKLIPP = 14;</code>
             *
             * @return The iGMALOKLIPP.
             */
            @java.lang.Override
            public boolean getIGMALOKLIPP() {
                return iGMALOKLIPP_;
            }
            /**
             * <code>bool IGMALOKLIPP = 14;</code>
             *
             * @param value The iGMALOKLIPP to set.
             * @return This builder for chaining.
             */
            public Builder setIGMALOKLIPP(boolean value) {

                iGMALOKLIPP_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool IGMALOKLIPP = 14;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIGMALOKLIPP() {

                iGMALOKLIPP_ = false;
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

            // @@protoc_insertion_point(builder_scope:ClientNewMailNotify)
        }

        // @@protoc_insertion_point(class_scope:ClientNewMailNotify)
        private static final emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify();
        }

        public static emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<ClientNewMailNotify> PARSER =
                new com.google.protobuf.AbstractParser<ClientNewMailNotify>() {
                    @java.lang.Override
                    public ClientNewMailNotify parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new ClientNewMailNotify(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<ClientNewMailNotify> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<ClientNewMailNotify> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.ClientNewMailNotifyOuterClass.ClientNewMailNotify
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_ClientNewMailNotify_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_ClientNewMailNotify_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\031ClientNewMailNotify.proto\"T\n\023ClientNew"
                    + "MailNotify\022\023\n\013CDIKCAIGHAE\030\002 \001(\r\022\023\n\013KJEEE"
                    + "DPFMFE\030\006 \001(\r\022\023\n\013IGMALOKLIPP\030\016 \001(\010B\033\n\031emu"
                    + ".grasscutter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_ClientNewMailNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_ClientNewMailNotify_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_ClientNewMailNotify_descriptor,
                        new java.lang.String[] {
                            "CDIKCAIGHAE", "KJEEEDPFMFE", "IGMALOKLIPP",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
