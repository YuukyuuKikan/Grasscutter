// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NHKODIELCKE.proto

package emu.grasscutter.net.proto;

public final class NHKODIELCKEOuterClass {
    private NHKODIELCKEOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface NHKODIELCKEOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:NHKODIELCKE)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 apply_entity_id = 8;</code>
         *
         * @return The applyEntityId.
         */
        int getApplyEntityId();
    }
    /** Protobuf type {@code NHKODIELCKE} */
    public static final class NHKODIELCKE extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:NHKODIELCKE)
            NHKODIELCKEOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use NHKODIELCKE.newBuilder() to construct.
        private NHKODIELCKE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private NHKODIELCKE() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new NHKODIELCKE();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private NHKODIELCKE(
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
                                applyEntityId_ = input.readUInt32();
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
            return emu.grasscutter.net.proto.NHKODIELCKEOuterClass.internal_static_NHKODIELCKE_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.NHKODIELCKEOuterClass
                    .internal_static_NHKODIELCKE_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.NHKODIELCKEOuterClass.NHKODIELCKE.class,
                            emu.grasscutter.net.proto.NHKODIELCKEOuterClass.NHKODIELCKE.Builder.class);
        }

        public static final int APPLY_ENTITY_ID_FIELD_NUMBER = 8;
        private int applyEntityId_;
        /**
         * <code>uint32 apply_entity_id = 8;</code>
         *
         * @return The applyEntityId.
         */
        @java.lang.Override
        public int getApplyEntityId() {
            return applyEntityId_;
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
            if (applyEntityId_ != 0) {
                output.writeUInt32(8, applyEntityId_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (applyEntityId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(8, applyEntityId_);
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
            if (!(obj instanceof emu.grasscutter.net.proto.NHKODIELCKEOuterClass.NHKODIELCKE)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.NHKODIELCKEOuterClass.NHKODIELCKE other =
                    (emu.grasscutter.net.proto.NHKODIELCKEOuterClass.NHKODIELCKE) obj;

            if (getApplyEntityId() != other.getApplyEntityId()) return false;
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
            hash = (37 * hash) + APPLY_ENTITY_ID_FIELD_NUMBER;
            hash = (53 * hash) + getApplyEntityId();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.NHKODIELCKEOuterClass.NHKODIELCKE parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.NHKODIELCKEOuterClass.NHKODIELCKE parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.NHKODIELCKEOuterClass.NHKODIELCKE parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.NHKODIELCKEOuterClass.NHKODIELCKE parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.NHKODIELCKEOuterClass.NHKODIELCKE parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.NHKODIELCKEOuterClass.NHKODIELCKE parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.NHKODIELCKEOuterClass.NHKODIELCKE parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.NHKODIELCKEOuterClass.NHKODIELCKE parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.NHKODIELCKEOuterClass.NHKODIELCKE parseDelimitedFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.NHKODIELCKEOuterClass.NHKODIELCKE parseDelimitedFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.NHKODIELCKEOuterClass.NHKODIELCKE parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.NHKODIELCKEOuterClass.NHKODIELCKE parseFrom(
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
                emu.grasscutter.net.proto.NHKODIELCKEOuterClass.NHKODIELCKE prototype) {
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
        /** Protobuf type {@code NHKODIELCKE} */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:NHKODIELCKE)
                emu.grasscutter.net.proto.NHKODIELCKEOuterClass.NHKODIELCKEOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.NHKODIELCKEOuterClass
                        .internal_static_NHKODIELCKE_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.NHKODIELCKEOuterClass
                        .internal_static_NHKODIELCKE_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.NHKODIELCKEOuterClass.NHKODIELCKE.class,
                                emu.grasscutter.net.proto.NHKODIELCKEOuterClass.NHKODIELCKE.Builder.class);
            }

            // Construct using emu.grasscutter.net.proto.NHKODIELCKEOuterClass.NHKODIELCKE.newBuilder()
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
                applyEntityId_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.NHKODIELCKEOuterClass
                        .internal_static_NHKODIELCKE_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.NHKODIELCKEOuterClass.NHKODIELCKE
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.NHKODIELCKEOuterClass.NHKODIELCKE.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.NHKODIELCKEOuterClass.NHKODIELCKE build() {
                emu.grasscutter.net.proto.NHKODIELCKEOuterClass.NHKODIELCKE result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.NHKODIELCKEOuterClass.NHKODIELCKE buildPartial() {
                emu.grasscutter.net.proto.NHKODIELCKEOuterClass.NHKODIELCKE result =
                        new emu.grasscutter.net.proto.NHKODIELCKEOuterClass.NHKODIELCKE(this);
                result.applyEntityId_ = applyEntityId_;
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
                if (other instanceof emu.grasscutter.net.proto.NHKODIELCKEOuterClass.NHKODIELCKE) {
                    return mergeFrom((emu.grasscutter.net.proto.NHKODIELCKEOuterClass.NHKODIELCKE) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(emu.grasscutter.net.proto.NHKODIELCKEOuterClass.NHKODIELCKE other) {
                if (other
                        == emu.grasscutter.net.proto.NHKODIELCKEOuterClass.NHKODIELCKE.getDefaultInstance())
                    return this;
                if (other.getApplyEntityId() != 0) {
                    setApplyEntityId(other.getApplyEntityId());
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
                emu.grasscutter.net.proto.NHKODIELCKEOuterClass.NHKODIELCKE parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.NHKODIELCKEOuterClass.NHKODIELCKE)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int applyEntityId_;
            /**
             * <code>uint32 apply_entity_id = 8;</code>
             *
             * @return The applyEntityId.
             */
            @java.lang.Override
            public int getApplyEntityId() {
                return applyEntityId_;
            }
            /**
             * <code>uint32 apply_entity_id = 8;</code>
             *
             * @param value The applyEntityId to set.
             * @return This builder for chaining.
             */
            public Builder setApplyEntityId(int value) {

                applyEntityId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 apply_entity_id = 8;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearApplyEntityId() {

                applyEntityId_ = 0;
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

            // @@protoc_insertion_point(builder_scope:NHKODIELCKE)
        }

        // @@protoc_insertion_point(class_scope:NHKODIELCKE)
        private static final emu.grasscutter.net.proto.NHKODIELCKEOuterClass.NHKODIELCKE
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new emu.grasscutter.net.proto.NHKODIELCKEOuterClass.NHKODIELCKE();
        }

        public static emu.grasscutter.net.proto.NHKODIELCKEOuterClass.NHKODIELCKE getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<NHKODIELCKE> PARSER =
                new com.google.protobuf.AbstractParser<NHKODIELCKE>() {
                    @java.lang.Override
                    public NHKODIELCKE parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new NHKODIELCKE(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<NHKODIELCKE> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<NHKODIELCKE> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.NHKODIELCKEOuterClass.NHKODIELCKE getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_NHKODIELCKE_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_NHKODIELCKE_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\021NHKODIELCKE.proto\"&\n\013NHKODIELCKE\022\027\n\017ap"
                    + "ply_entity_id\030\010 \001(\rB\033\n\031emu.grasscutter.n"
                    + "et.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_NHKODIELCKE_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_NHKODIELCKE_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_NHKODIELCKE_descriptor,
                        new java.lang.String[] {
                            "ApplyEntityId",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
