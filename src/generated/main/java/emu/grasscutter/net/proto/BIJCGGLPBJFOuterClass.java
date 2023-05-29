// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BIJCGGLPBJF.proto

package emu.grasscutter.net.proto;

public final class BIJCGGLPBJFOuterClass {
    private BIJCGGLPBJFOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface BIJCGGLPBJFOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:BIJCGGLPBJF)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint64 guid = 2;</code>
         *
         * @return The guid.
         */
        long getGuid();

        /**
         * <code>.OMJBALCDKJK JGOLDOIMPOL = 8;</code>
         *
         * @return Whether the jGOLDOIMPOL field is set.
         */
        boolean hasJGOLDOIMPOL();
        /**
         * <code>.OMJBALCDKJK JGOLDOIMPOL = 8;</code>
         *
         * @return The jGOLDOIMPOL.
         */
        emu.grasscutter.net.proto.OMJBALCDKJKOuterClass.OMJBALCDKJK getJGOLDOIMPOL();
        /** <code>.OMJBALCDKJK JGOLDOIMPOL = 8;</code> */
        emu.grasscutter.net.proto.OMJBALCDKJKOuterClass.OMJBALCDKJKOrBuilder getJGOLDOIMPOLOrBuilder();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 9104
     * </pre>
     *
     * Protobuf type {@code BIJCGGLPBJF}
     */
    public static final class BIJCGGLPBJF extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:BIJCGGLPBJF)
            BIJCGGLPBJFOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use BIJCGGLPBJF.newBuilder() to construct.
        private BIJCGGLPBJF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private BIJCGGLPBJF() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new BIJCGGLPBJF();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private BIJCGGLPBJF(
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
                                guid_ = input.readUInt64();
                                break;
                            }
                        case 66:
                            {
                                emu.grasscutter.net.proto.OMJBALCDKJKOuterClass.OMJBALCDKJK.Builder subBuilder =
                                        null;
                                if (jGOLDOIMPOL_ != null) {
                                    subBuilder = jGOLDOIMPOL_.toBuilder();
                                }
                                jGOLDOIMPOL_ =
                                        input.readMessage(
                                                emu.grasscutter.net.proto.OMJBALCDKJKOuterClass.OMJBALCDKJK.parser(),
                                                extensionRegistry);
                                if (subBuilder != null) {
                                    subBuilder.mergeFrom(jGOLDOIMPOL_);
                                    jGOLDOIMPOL_ = subBuilder.buildPartial();
                                }

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
            return emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass.internal_static_BIJCGGLPBJF_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass
                    .internal_static_BIJCGGLPBJF_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass.BIJCGGLPBJF.class,
                            emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass.BIJCGGLPBJF.Builder.class);
        }

        public static final int GUID_FIELD_NUMBER = 2;
        private long guid_;
        /**
         * <code>uint64 guid = 2;</code>
         *
         * @return The guid.
         */
        @java.lang.Override
        public long getGuid() {
            return guid_;
        }

        public static final int JGOLDOIMPOL_FIELD_NUMBER = 8;
        private emu.grasscutter.net.proto.OMJBALCDKJKOuterClass.OMJBALCDKJK jGOLDOIMPOL_;
        /**
         * <code>.OMJBALCDKJK JGOLDOIMPOL = 8;</code>
         *
         * @return Whether the jGOLDOIMPOL field is set.
         */
        @java.lang.Override
        public boolean hasJGOLDOIMPOL() {
            return jGOLDOIMPOL_ != null;
        }
        /**
         * <code>.OMJBALCDKJK JGOLDOIMPOL = 8;</code>
         *
         * @return The jGOLDOIMPOL.
         */
        @java.lang.Override
        public emu.grasscutter.net.proto.OMJBALCDKJKOuterClass.OMJBALCDKJK getJGOLDOIMPOL() {
            return jGOLDOIMPOL_ == null
                    ? emu.grasscutter.net.proto.OMJBALCDKJKOuterClass.OMJBALCDKJK.getDefaultInstance()
                    : jGOLDOIMPOL_;
        }
        /** <code>.OMJBALCDKJK JGOLDOIMPOL = 8;</code> */
        @java.lang.Override
        public emu.grasscutter.net.proto.OMJBALCDKJKOuterClass.OMJBALCDKJKOrBuilder
                getJGOLDOIMPOLOrBuilder() {
            return getJGOLDOIMPOL();
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
            if (guid_ != 0L) {
                output.writeUInt64(2, guid_);
            }
            if (jGOLDOIMPOL_ != null) {
                output.writeMessage(8, getJGOLDOIMPOL());
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (guid_ != 0L) {
                size += com.google.protobuf.CodedOutputStream.computeUInt64Size(2, guid_);
            }
            if (jGOLDOIMPOL_ != null) {
                size += com.google.protobuf.CodedOutputStream.computeMessageSize(8, getJGOLDOIMPOL());
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
            if (!(obj instanceof emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass.BIJCGGLPBJF)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass.BIJCGGLPBJF other =
                    (emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass.BIJCGGLPBJF) obj;

            if (getGuid() != other.getGuid()) return false;
            if (hasJGOLDOIMPOL() != other.hasJGOLDOIMPOL()) return false;
            if (hasJGOLDOIMPOL()) {
                if (!getJGOLDOIMPOL().equals(other.getJGOLDOIMPOL())) return false;
            }
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
            hash = (37 * hash) + GUID_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getGuid());
            if (hasJGOLDOIMPOL()) {
                hash = (37 * hash) + JGOLDOIMPOL_FIELD_NUMBER;
                hash = (53 * hash) + getJGOLDOIMPOL().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass.BIJCGGLPBJF parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass.BIJCGGLPBJF parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass.BIJCGGLPBJF parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass.BIJCGGLPBJF parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass.BIJCGGLPBJF parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass.BIJCGGLPBJF parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass.BIJCGGLPBJF parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass.BIJCGGLPBJF parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass.BIJCGGLPBJF parseDelimitedFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass.BIJCGGLPBJF parseDelimitedFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass.BIJCGGLPBJF parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass.BIJCGGLPBJF parseFrom(
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
                emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass.BIJCGGLPBJF prototype) {
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
         * CmdId: 9104
         * </pre>
         *
         * Protobuf type {@code BIJCGGLPBJF}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:BIJCGGLPBJF)
                emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass.BIJCGGLPBJFOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass
                        .internal_static_BIJCGGLPBJF_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass
                        .internal_static_BIJCGGLPBJF_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass.BIJCGGLPBJF.class,
                                emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass.BIJCGGLPBJF.Builder.class);
            }

            // Construct using emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass.BIJCGGLPBJF.newBuilder()
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
                guid_ = 0L;

                if (jGOLDOIMPOLBuilder_ == null) {
                    jGOLDOIMPOL_ = null;
                } else {
                    jGOLDOIMPOL_ = null;
                    jGOLDOIMPOLBuilder_ = null;
                }
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass
                        .internal_static_BIJCGGLPBJF_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass.BIJCGGLPBJF
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass.BIJCGGLPBJF.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass.BIJCGGLPBJF build() {
                emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass.BIJCGGLPBJF result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass.BIJCGGLPBJF buildPartial() {
                emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass.BIJCGGLPBJF result =
                        new emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass.BIJCGGLPBJF(this);
                result.guid_ = guid_;
                if (jGOLDOIMPOLBuilder_ == null) {
                    result.jGOLDOIMPOL_ = jGOLDOIMPOL_;
                } else {
                    result.jGOLDOIMPOL_ = jGOLDOIMPOLBuilder_.build();
                }
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
                if (other instanceof emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass.BIJCGGLPBJF) {
                    return mergeFrom((emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass.BIJCGGLPBJF) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass.BIJCGGLPBJF other) {
                if (other
                        == emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass.BIJCGGLPBJF.getDefaultInstance())
                    return this;
                if (other.getGuid() != 0L) {
                    setGuid(other.getGuid());
                }
                if (other.hasJGOLDOIMPOL()) {
                    mergeJGOLDOIMPOL(other.getJGOLDOIMPOL());
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
                emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass.BIJCGGLPBJF parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass.BIJCGGLPBJF)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private long guid_;
            /**
             * <code>uint64 guid = 2;</code>
             *
             * @return The guid.
             */
            @java.lang.Override
            public long getGuid() {
                return guid_;
            }
            /**
             * <code>uint64 guid = 2;</code>
             *
             * @param value The guid to set.
             * @return This builder for chaining.
             */
            public Builder setGuid(long value) {

                guid_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint64 guid = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearGuid() {

                guid_ = 0L;
                onChanged();
                return this;
            }

            private emu.grasscutter.net.proto.OMJBALCDKJKOuterClass.OMJBALCDKJK jGOLDOIMPOL_;
            private com.google.protobuf.SingleFieldBuilderV3<
                            emu.grasscutter.net.proto.OMJBALCDKJKOuterClass.OMJBALCDKJK,
                            emu.grasscutter.net.proto.OMJBALCDKJKOuterClass.OMJBALCDKJK.Builder,
                            emu.grasscutter.net.proto.OMJBALCDKJKOuterClass.OMJBALCDKJKOrBuilder>
                    jGOLDOIMPOLBuilder_;
            /**
             * <code>.OMJBALCDKJK JGOLDOIMPOL = 8;</code>
             *
             * @return Whether the jGOLDOIMPOL field is set.
             */
            public boolean hasJGOLDOIMPOL() {
                return jGOLDOIMPOLBuilder_ != null || jGOLDOIMPOL_ != null;
            }
            /**
             * <code>.OMJBALCDKJK JGOLDOIMPOL = 8;</code>
             *
             * @return The jGOLDOIMPOL.
             */
            public emu.grasscutter.net.proto.OMJBALCDKJKOuterClass.OMJBALCDKJK getJGOLDOIMPOL() {
                if (jGOLDOIMPOLBuilder_ == null) {
                    return jGOLDOIMPOL_ == null
                            ? emu.grasscutter.net.proto.OMJBALCDKJKOuterClass.OMJBALCDKJK.getDefaultInstance()
                            : jGOLDOIMPOL_;
                } else {
                    return jGOLDOIMPOLBuilder_.getMessage();
                }
            }
            /** <code>.OMJBALCDKJK JGOLDOIMPOL = 8;</code> */
            public Builder setJGOLDOIMPOL(
                    emu.grasscutter.net.proto.OMJBALCDKJKOuterClass.OMJBALCDKJK value) {
                if (jGOLDOIMPOLBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    jGOLDOIMPOL_ = value;
                    onChanged();
                } else {
                    jGOLDOIMPOLBuilder_.setMessage(value);
                }

                return this;
            }
            /** <code>.OMJBALCDKJK JGOLDOIMPOL = 8;</code> */
            public Builder setJGOLDOIMPOL(
                    emu.grasscutter.net.proto.OMJBALCDKJKOuterClass.OMJBALCDKJK.Builder builderForValue) {
                if (jGOLDOIMPOLBuilder_ == null) {
                    jGOLDOIMPOL_ = builderForValue.build();
                    onChanged();
                } else {
                    jGOLDOIMPOLBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }
            /** <code>.OMJBALCDKJK JGOLDOIMPOL = 8;</code> */
            public Builder mergeJGOLDOIMPOL(
                    emu.grasscutter.net.proto.OMJBALCDKJKOuterClass.OMJBALCDKJK value) {
                if (jGOLDOIMPOLBuilder_ == null) {
                    if (jGOLDOIMPOL_ != null) {
                        jGOLDOIMPOL_ =
                                emu.grasscutter.net.proto.OMJBALCDKJKOuterClass.OMJBALCDKJK
                                        .newBuilder(jGOLDOIMPOL_)
                                        .mergeFrom(value)
                                        .buildPartial();
                    } else {
                        jGOLDOIMPOL_ = value;
                    }
                    onChanged();
                } else {
                    jGOLDOIMPOLBuilder_.mergeFrom(value);
                }

                return this;
            }
            /** <code>.OMJBALCDKJK JGOLDOIMPOL = 8;</code> */
            public Builder clearJGOLDOIMPOL() {
                if (jGOLDOIMPOLBuilder_ == null) {
                    jGOLDOIMPOL_ = null;
                    onChanged();
                } else {
                    jGOLDOIMPOL_ = null;
                    jGOLDOIMPOLBuilder_ = null;
                }

                return this;
            }
            /** <code>.OMJBALCDKJK JGOLDOIMPOL = 8;</code> */
            public emu.grasscutter.net.proto.OMJBALCDKJKOuterClass.OMJBALCDKJK.Builder
                    getJGOLDOIMPOLBuilder() {

                onChanged();
                return getJGOLDOIMPOLFieldBuilder().getBuilder();
            }
            /** <code>.OMJBALCDKJK JGOLDOIMPOL = 8;</code> */
            public emu.grasscutter.net.proto.OMJBALCDKJKOuterClass.OMJBALCDKJKOrBuilder
                    getJGOLDOIMPOLOrBuilder() {
                if (jGOLDOIMPOLBuilder_ != null) {
                    return jGOLDOIMPOLBuilder_.getMessageOrBuilder();
                } else {
                    return jGOLDOIMPOL_ == null
                            ? emu.grasscutter.net.proto.OMJBALCDKJKOuterClass.OMJBALCDKJK.getDefaultInstance()
                            : jGOLDOIMPOL_;
                }
            }
            /** <code>.OMJBALCDKJK JGOLDOIMPOL = 8;</code> */
            private com.google.protobuf.SingleFieldBuilderV3<
                            emu.grasscutter.net.proto.OMJBALCDKJKOuterClass.OMJBALCDKJK,
                            emu.grasscutter.net.proto.OMJBALCDKJKOuterClass.OMJBALCDKJK.Builder,
                            emu.grasscutter.net.proto.OMJBALCDKJKOuterClass.OMJBALCDKJKOrBuilder>
                    getJGOLDOIMPOLFieldBuilder() {
                if (jGOLDOIMPOLBuilder_ == null) {
                    jGOLDOIMPOLBuilder_ =
                            new com.google.protobuf.SingleFieldBuilderV3<
                                    emu.grasscutter.net.proto.OMJBALCDKJKOuterClass.OMJBALCDKJK,
                                    emu.grasscutter.net.proto.OMJBALCDKJKOuterClass.OMJBALCDKJK.Builder,
                                    emu.grasscutter.net.proto.OMJBALCDKJKOuterClass.OMJBALCDKJKOrBuilder>(
                                    getJGOLDOIMPOL(), getParentForChildren(), isClean());
                    jGOLDOIMPOL_ = null;
                }
                return jGOLDOIMPOLBuilder_;
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

            // @@protoc_insertion_point(builder_scope:BIJCGGLPBJF)
        }

        // @@protoc_insertion_point(class_scope:BIJCGGLPBJF)
        private static final emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass.BIJCGGLPBJF
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass.BIJCGGLPBJF();
        }

        public static emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass.BIJCGGLPBJF getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<BIJCGGLPBJF> PARSER =
                new com.google.protobuf.AbstractParser<BIJCGGLPBJF>() {
                    @java.lang.Override
                    public BIJCGGLPBJF parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new BIJCGGLPBJF(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<BIJCGGLPBJF> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<BIJCGGLPBJF> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.BIJCGGLPBJFOuterClass.BIJCGGLPBJF getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_BIJCGGLPBJF_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_BIJCGGLPBJF_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\021BIJCGGLPBJF.proto\032\021OMJBALCDKJK.proto\">"
                    + "\n\013BIJCGGLPBJF\022\014\n\004guid\030\002 \001(\004\022!\n\013JGOLDOIMP"
                    + "OL\030\010 \001(\0132\014.OMJBALCDKJKB\033\n\031emu.grasscutte"
                    + "r.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                            emu.grasscutter.net.proto.OMJBALCDKJKOuterClass.getDescriptor(),
                        });
        internal_static_BIJCGGLPBJF_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_BIJCGGLPBJF_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_BIJCGGLPBJF_descriptor,
                        new java.lang.String[] {
                            "Guid", "JGOLDOIMPOL",
                        });
        emu.grasscutter.net.proto.OMJBALCDKJKOuterClass.getDescriptor();
    }

    // @@protoc_insertion_point(outer_class_scope)
}
