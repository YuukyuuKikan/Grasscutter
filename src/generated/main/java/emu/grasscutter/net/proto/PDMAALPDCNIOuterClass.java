// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PDMAALPDCNI.proto

package emu.grasscutter.net.proto;

public final class PDMAALPDCNIOuterClass {
    private PDMAALPDCNIOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface PDMAALPDCNIOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:PDMAALPDCNI)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 apply_uid = 9;</code>
         *
         * @return The applyUid.
         */
        int getApplyUid();

        /**
         * <code>bool is_agreed = 10;</code>
         *
         * @return The isAgreed.
         */
        boolean getIsAgreed();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 4765
     * </pre>
     *
     * Protobuf type {@code PDMAALPDCNI}
     */
    public static final class PDMAALPDCNI extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:PDMAALPDCNI)
            PDMAALPDCNIOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use PDMAALPDCNI.newBuilder() to construct.
        private PDMAALPDCNI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private PDMAALPDCNI() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new PDMAALPDCNI();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private PDMAALPDCNI(
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
                        case 72:
                            {
                                applyUid_ = input.readUInt32();
                                break;
                            }
                        case 80:
                            {
                                isAgreed_ = input.readBool();
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
            return emu.grasscutter.net.proto.PDMAALPDCNIOuterClass.internal_static_PDMAALPDCNI_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.PDMAALPDCNIOuterClass
                    .internal_static_PDMAALPDCNI_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.PDMAALPDCNIOuterClass.PDMAALPDCNI.class,
                            emu.grasscutter.net.proto.PDMAALPDCNIOuterClass.PDMAALPDCNI.Builder.class);
        }

        public static final int APPLY_UID_FIELD_NUMBER = 9;
        private int applyUid_;
        /**
         * <code>uint32 apply_uid = 9;</code>
         *
         * @return The applyUid.
         */
        @java.lang.Override
        public int getApplyUid() {
            return applyUid_;
        }

        public static final int IS_AGREED_FIELD_NUMBER = 10;
        private boolean isAgreed_;
        /**
         * <code>bool is_agreed = 10;</code>
         *
         * @return The isAgreed.
         */
        @java.lang.Override
        public boolean getIsAgreed() {
            return isAgreed_;
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
            if (applyUid_ != 0) {
                output.writeUInt32(9, applyUid_);
            }
            if (isAgreed_ != false) {
                output.writeBool(10, isAgreed_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (applyUid_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(9, applyUid_);
            }
            if (isAgreed_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(10, isAgreed_);
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
            if (!(obj instanceof emu.grasscutter.net.proto.PDMAALPDCNIOuterClass.PDMAALPDCNI)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.PDMAALPDCNIOuterClass.PDMAALPDCNI other =
                    (emu.grasscutter.net.proto.PDMAALPDCNIOuterClass.PDMAALPDCNI) obj;

            if (getApplyUid() != other.getApplyUid()) return false;
            if (getIsAgreed() != other.getIsAgreed()) return false;
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
            hash = (37 * hash) + APPLY_UID_FIELD_NUMBER;
            hash = (53 * hash) + getApplyUid();
            hash = (37 * hash) + IS_AGREED_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsAgreed());
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.PDMAALPDCNIOuterClass.PDMAALPDCNI parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.PDMAALPDCNIOuterClass.PDMAALPDCNI parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.PDMAALPDCNIOuterClass.PDMAALPDCNI parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.PDMAALPDCNIOuterClass.PDMAALPDCNI parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.PDMAALPDCNIOuterClass.PDMAALPDCNI parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.PDMAALPDCNIOuterClass.PDMAALPDCNI parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.PDMAALPDCNIOuterClass.PDMAALPDCNI parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.PDMAALPDCNIOuterClass.PDMAALPDCNI parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.PDMAALPDCNIOuterClass.PDMAALPDCNI parseDelimitedFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.PDMAALPDCNIOuterClass.PDMAALPDCNI parseDelimitedFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.PDMAALPDCNIOuterClass.PDMAALPDCNI parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.PDMAALPDCNIOuterClass.PDMAALPDCNI parseFrom(
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
                emu.grasscutter.net.proto.PDMAALPDCNIOuterClass.PDMAALPDCNI prototype) {
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
         * CmdId: 4765
         * </pre>
         *
         * Protobuf type {@code PDMAALPDCNI}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:PDMAALPDCNI)
                emu.grasscutter.net.proto.PDMAALPDCNIOuterClass.PDMAALPDCNIOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.PDMAALPDCNIOuterClass
                        .internal_static_PDMAALPDCNI_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.PDMAALPDCNIOuterClass
                        .internal_static_PDMAALPDCNI_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.PDMAALPDCNIOuterClass.PDMAALPDCNI.class,
                                emu.grasscutter.net.proto.PDMAALPDCNIOuterClass.PDMAALPDCNI.Builder.class);
            }

            // Construct using emu.grasscutter.net.proto.PDMAALPDCNIOuterClass.PDMAALPDCNI.newBuilder()
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
                applyUid_ = 0;

                isAgreed_ = false;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.PDMAALPDCNIOuterClass
                        .internal_static_PDMAALPDCNI_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.PDMAALPDCNIOuterClass.PDMAALPDCNI
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.PDMAALPDCNIOuterClass.PDMAALPDCNI.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.PDMAALPDCNIOuterClass.PDMAALPDCNI build() {
                emu.grasscutter.net.proto.PDMAALPDCNIOuterClass.PDMAALPDCNI result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.PDMAALPDCNIOuterClass.PDMAALPDCNI buildPartial() {
                emu.grasscutter.net.proto.PDMAALPDCNIOuterClass.PDMAALPDCNI result =
                        new emu.grasscutter.net.proto.PDMAALPDCNIOuterClass.PDMAALPDCNI(this);
                result.applyUid_ = applyUid_;
                result.isAgreed_ = isAgreed_;
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
                if (other instanceof emu.grasscutter.net.proto.PDMAALPDCNIOuterClass.PDMAALPDCNI) {
                    return mergeFrom((emu.grasscutter.net.proto.PDMAALPDCNIOuterClass.PDMAALPDCNI) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(emu.grasscutter.net.proto.PDMAALPDCNIOuterClass.PDMAALPDCNI other) {
                if (other
                        == emu.grasscutter.net.proto.PDMAALPDCNIOuterClass.PDMAALPDCNI.getDefaultInstance())
                    return this;
                if (other.getApplyUid() != 0) {
                    setApplyUid(other.getApplyUid());
                }
                if (other.getIsAgreed() != false) {
                    setIsAgreed(other.getIsAgreed());
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
                emu.grasscutter.net.proto.PDMAALPDCNIOuterClass.PDMAALPDCNI parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.PDMAALPDCNIOuterClass.PDMAALPDCNI)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int applyUid_;
            /**
             * <code>uint32 apply_uid = 9;</code>
             *
             * @return The applyUid.
             */
            @java.lang.Override
            public int getApplyUid() {
                return applyUid_;
            }
            /**
             * <code>uint32 apply_uid = 9;</code>
             *
             * @param value The applyUid to set.
             * @return This builder for chaining.
             */
            public Builder setApplyUid(int value) {

                applyUid_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 apply_uid = 9;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearApplyUid() {

                applyUid_ = 0;
                onChanged();
                return this;
            }

            private boolean isAgreed_;
            /**
             * <code>bool is_agreed = 10;</code>
             *
             * @return The isAgreed.
             */
            @java.lang.Override
            public boolean getIsAgreed() {
                return isAgreed_;
            }
            /**
             * <code>bool is_agreed = 10;</code>
             *
             * @param value The isAgreed to set.
             * @return This builder for chaining.
             */
            public Builder setIsAgreed(boolean value) {

                isAgreed_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool is_agreed = 10;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsAgreed() {

                isAgreed_ = false;
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

            // @@protoc_insertion_point(builder_scope:PDMAALPDCNI)
        }

        // @@protoc_insertion_point(class_scope:PDMAALPDCNI)
        private static final emu.grasscutter.net.proto.PDMAALPDCNIOuterClass.PDMAALPDCNI
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PDMAALPDCNIOuterClass.PDMAALPDCNI();
        }

        public static emu.grasscutter.net.proto.PDMAALPDCNIOuterClass.PDMAALPDCNI getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<PDMAALPDCNI> PARSER =
                new com.google.protobuf.AbstractParser<PDMAALPDCNI>() {
                    @java.lang.Override
                    public PDMAALPDCNI parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new PDMAALPDCNI(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<PDMAALPDCNI> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<PDMAALPDCNI> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.PDMAALPDCNIOuterClass.PDMAALPDCNI getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_PDMAALPDCNI_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_PDMAALPDCNI_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\021PDMAALPDCNI.proto\"3\n\013PDMAALPDCNI\022\021\n\tap"
                    + "ply_uid\030\t \001(\r\022\021\n\tis_agreed\030\n \001(\010B\033\n\031emu."
                    + "grasscutter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_PDMAALPDCNI_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PDMAALPDCNI_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_PDMAALPDCNI_descriptor,
                        new java.lang.String[] {
                            "ApplyUid", "IsAgreed",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
