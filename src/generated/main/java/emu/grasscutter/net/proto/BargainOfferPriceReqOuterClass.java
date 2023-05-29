// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BargainOfferPriceReq.proto

package emu.grasscutter.net.proto;

public final class BargainOfferPriceReqOuterClass {
    private BargainOfferPriceReqOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface BargainOfferPriceReqOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:BargainOfferPriceReq)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 bargain_id = 14;</code>
         *
         * @return The bargainId.
         */
        int getBargainId();

        /**
         * <code>uint32 price = 8;</code>
         *
         * @return The price.
         */
        int getPrice();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 431
     * Obf: IHCHLEAKAFN
     * </pre>
     *
     * Protobuf type {@code BargainOfferPriceReq}
     */
    public static final class BargainOfferPriceReq extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:BargainOfferPriceReq)
            BargainOfferPriceReqOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use BargainOfferPriceReq.newBuilder() to construct.
        private BargainOfferPriceReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private BargainOfferPriceReq() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new BargainOfferPriceReq();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private BargainOfferPriceReq(
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
                        case 64:
                            {
                                price_ = input.readUInt32();
                                break;
                            }
                        case 112:
                            {
                                bargainId_ = input.readUInt32();
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
            return emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass
                    .internal_static_BargainOfferPriceReq_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass
                    .internal_static_BargainOfferPriceReq_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass.BargainOfferPriceReq.class,
                            emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass.BargainOfferPriceReq.Builder
                                    .class);
        }

        public static final int BARGAIN_ID_FIELD_NUMBER = 14;
        private int bargainId_;
        /**
         * <code>uint32 bargain_id = 14;</code>
         *
         * @return The bargainId.
         */
        @java.lang.Override
        public int getBargainId() {
            return bargainId_;
        }

        public static final int PRICE_FIELD_NUMBER = 8;
        private int price_;
        /**
         * <code>uint32 price = 8;</code>
         *
         * @return The price.
         */
        @java.lang.Override
        public int getPrice() {
            return price_;
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
            if (price_ != 0) {
                output.writeUInt32(8, price_);
            }
            if (bargainId_ != 0) {
                output.writeUInt32(14, bargainId_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (price_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(8, price_);
            }
            if (bargainId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(14, bargainId_);
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
                    emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass.BargainOfferPriceReq)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass.BargainOfferPriceReq other =
                    (emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass.BargainOfferPriceReq) obj;

            if (getBargainId() != other.getBargainId()) return false;
            if (getPrice() != other.getPrice()) return false;
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
            hash = (37 * hash) + BARGAIN_ID_FIELD_NUMBER;
            hash = (53 * hash) + getBargainId();
            hash = (37 * hash) + PRICE_FIELD_NUMBER;
            hash = (53 * hash) + getPrice();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass.BargainOfferPriceReq
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass.BargainOfferPriceReq
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass.BargainOfferPriceReq
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass.BargainOfferPriceReq
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass.BargainOfferPriceReq
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass.BargainOfferPriceReq
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass.BargainOfferPriceReq
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass.BargainOfferPriceReq
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass.BargainOfferPriceReq
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass.BargainOfferPriceReq
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass.BargainOfferPriceReq
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass.BargainOfferPriceReq
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
                emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass.BargainOfferPriceReq prototype) {
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
         * CmdId: 431
         * Obf: IHCHLEAKAFN
         * </pre>
         *
         * Protobuf type {@code BargainOfferPriceReq}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:BargainOfferPriceReq)
                emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass.BargainOfferPriceReqOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass
                        .internal_static_BargainOfferPriceReq_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass
                        .internal_static_BargainOfferPriceReq_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass.BargainOfferPriceReq.class,
                                emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass.BargainOfferPriceReq
                                        .Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass.BargainOfferPriceReq.newBuilder()
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
                bargainId_ = 0;

                price_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass
                        .internal_static_BargainOfferPriceReq_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass.BargainOfferPriceReq
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass.BargainOfferPriceReq
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass.BargainOfferPriceReq build() {
                emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass.BargainOfferPriceReq result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass.BargainOfferPriceReq
                    buildPartial() {
                emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass.BargainOfferPriceReq result =
                        new emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass.BargainOfferPriceReq(this);
                result.bargainId_ = bargainId_;
                result.price_ = price_;
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
                        emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass.BargainOfferPriceReq) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass.BargainOfferPriceReq)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass.BargainOfferPriceReq other) {
                if (other
                        == emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass.BargainOfferPriceReq
                                .getDefaultInstance()) return this;
                if (other.getBargainId() != 0) {
                    setBargainId(other.getBargainId());
                }
                if (other.getPrice() != 0) {
                    setPrice(other.getPrice());
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
                emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass.BargainOfferPriceReq
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass.BargainOfferPriceReq)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int bargainId_;
            /**
             * <code>uint32 bargain_id = 14;</code>
             *
             * @return The bargainId.
             */
            @java.lang.Override
            public int getBargainId() {
                return bargainId_;
            }
            /**
             * <code>uint32 bargain_id = 14;</code>
             *
             * @param value The bargainId to set.
             * @return This builder for chaining.
             */
            public Builder setBargainId(int value) {

                bargainId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 bargain_id = 14;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearBargainId() {

                bargainId_ = 0;
                onChanged();
                return this;
            }

            private int price_;
            /**
             * <code>uint32 price = 8;</code>
             *
             * @return The price.
             */
            @java.lang.Override
            public int getPrice() {
                return price_;
            }
            /**
             * <code>uint32 price = 8;</code>
             *
             * @param value The price to set.
             * @return This builder for chaining.
             */
            public Builder setPrice(int value) {

                price_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 price = 8;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearPrice() {

                price_ = 0;
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

            // @@protoc_insertion_point(builder_scope:BargainOfferPriceReq)
        }

        // @@protoc_insertion_point(class_scope:BargainOfferPriceReq)
        private static final emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass
                        .BargainOfferPriceReq
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass.BargainOfferPriceReq();
        }

        public static emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass.BargainOfferPriceReq
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<BargainOfferPriceReq> PARSER =
                new com.google.protobuf.AbstractParser<BargainOfferPriceReq>() {
                    @java.lang.Override
                    public BargainOfferPriceReq parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new BargainOfferPriceReq(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<BargainOfferPriceReq> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<BargainOfferPriceReq> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.BargainOfferPriceReqOuterClass.BargainOfferPriceReq
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_BargainOfferPriceReq_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_BargainOfferPriceReq_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\032BargainOfferPriceReq.proto\"9\n\024BargainO"
                    + "fferPriceReq\022\022\n\nbargain_id\030\016 \001(\r\022\r\n\005pric"
                    + "e\030\010 \001(\rB\033\n\031emu.grasscutter.net.protob\006pr"
                    + "oto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_BargainOfferPriceReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_BargainOfferPriceReq_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_BargainOfferPriceReq_descriptor,
                        new java.lang.String[] {
                            "BargainId", "Price",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
