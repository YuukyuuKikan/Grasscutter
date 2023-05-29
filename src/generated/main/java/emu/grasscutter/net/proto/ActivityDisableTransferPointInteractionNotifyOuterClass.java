// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ActivityDisableTransferPointInteractionNotify.proto

package emu.grasscutter.net.proto;

public final class ActivityDisableTransferPointInteractionNotifyOuterClass {
    private ActivityDisableTransferPointInteractionNotifyOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface ActivityDisableTransferPointInteractionNotifyOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:ActivityDisableTransferPointInteractionNotify)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>bool is_disable = 8;</code>
         *
         * @return The isDisable.
         */
        boolean getIsDisable();

        /**
         * <code>.Uint32Pair scene_point_pair = 2;</code>
         *
         * @return Whether the scenePointPair field is set.
         */
        boolean hasScenePointPair();
        /**
         * <code>.Uint32Pair scene_point_pair = 2;</code>
         *
         * @return The scenePointPair.
         */
        emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair getScenePointPair();
        /** <code>.Uint32Pair scene_point_pair = 2;</code> */
        emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32PairOrBuilder getScenePointPairOrBuilder();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 8212
     * Obf: KODDECOKPBA
     * </pre>
     *
     * Protobuf type {@code ActivityDisableTransferPointInteractionNotify}
     */
    public static final class ActivityDisableTransferPointInteractionNotify
            extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:ActivityDisableTransferPointInteractionNotify)
            ActivityDisableTransferPointInteractionNotifyOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use ActivityDisableTransferPointInteractionNotify.newBuilder() to construct.
        private ActivityDisableTransferPointInteractionNotify(
                com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private ActivityDisableTransferPointInteractionNotify() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new ActivityDisableTransferPointInteractionNotify();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private ActivityDisableTransferPointInteractionNotify(
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
                        case 18:
                            {
                                emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.Builder subBuilder = null;
                                if (scenePointPair_ != null) {
                                    subBuilder = scenePointPair_.toBuilder();
                                }
                                scenePointPair_ =
                                        input.readMessage(
                                                emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.parser(),
                                                extensionRegistry);
                                if (subBuilder != null) {
                                    subBuilder.mergeFrom(scenePointPair_);
                                    scenePointPair_ = subBuilder.buildPartial();
                                }

                                break;
                            }
                        case 64:
                            {
                                isDisable_ = input.readBool();
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
            return emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                    .internal_static_ActivityDisableTransferPointInteractionNotify_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                    .internal_static_ActivityDisableTransferPointInteractionNotify_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                                    .ActivityDisableTransferPointInteractionNotify.class,
                            emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                                    .ActivityDisableTransferPointInteractionNotify.Builder.class);
        }

        public static final int IS_DISABLE_FIELD_NUMBER = 8;
        private boolean isDisable_;
        /**
         * <code>bool is_disable = 8;</code>
         *
         * @return The isDisable.
         */
        @java.lang.Override
        public boolean getIsDisable() {
            return isDisable_;
        }

        public static final int SCENE_POINT_PAIR_FIELD_NUMBER = 2;
        private emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair scenePointPair_;
        /**
         * <code>.Uint32Pair scene_point_pair = 2;</code>
         *
         * @return Whether the scenePointPair field is set.
         */
        @java.lang.Override
        public boolean hasScenePointPair() {
            return scenePointPair_ != null;
        }
        /**
         * <code>.Uint32Pair scene_point_pair = 2;</code>
         *
         * @return The scenePointPair.
         */
        @java.lang.Override
        public emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair getScenePointPair() {
            return scenePointPair_ == null
                    ? emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.getDefaultInstance()
                    : scenePointPair_;
        }
        /** <code>.Uint32Pair scene_point_pair = 2;</code> */
        @java.lang.Override
        public emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32PairOrBuilder
                getScenePointPairOrBuilder() {
            return getScenePointPair();
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
            if (scenePointPair_ != null) {
                output.writeMessage(2, getScenePointPair());
            }
            if (isDisable_ != false) {
                output.writeBool(8, isDisable_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (scenePointPair_ != null) {
                size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getScenePointPair());
            }
            if (isDisable_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(8, isDisable_);
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
                    emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                            .ActivityDisableTransferPointInteractionNotify)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                            .ActivityDisableTransferPointInteractionNotify
                    other =
                            (emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                                            .ActivityDisableTransferPointInteractionNotify)
                                    obj;

            if (getIsDisable() != other.getIsDisable()) return false;
            if (hasScenePointPair() != other.hasScenePointPair()) return false;
            if (hasScenePointPair()) {
                if (!getScenePointPair().equals(other.getScenePointPair())) return false;
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
            hash = (37 * hash) + IS_DISABLE_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsDisable());
            if (hasScenePointPair()) {
                hash = (37 * hash) + SCENE_POINT_PAIR_FIELD_NUMBER;
                hash = (53 * hash) + getScenePointPair().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                        .ActivityDisableTransferPointInteractionNotify
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                        .ActivityDisableTransferPointInteractionNotify
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                        .ActivityDisableTransferPointInteractionNotify
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                        .ActivityDisableTransferPointInteractionNotify
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                        .ActivityDisableTransferPointInteractionNotify
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                        .ActivityDisableTransferPointInteractionNotify
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                        .ActivityDisableTransferPointInteractionNotify
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                        .ActivityDisableTransferPointInteractionNotify
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                        .ActivityDisableTransferPointInteractionNotify
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                        .ActivityDisableTransferPointInteractionNotify
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                        .ActivityDisableTransferPointInteractionNotify
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                        .ActivityDisableTransferPointInteractionNotify
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
                emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                                .ActivityDisableTransferPointInteractionNotify
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
         * CmdId: 8212
         * Obf: KODDECOKPBA
         * </pre>
         *
         * Protobuf type {@code ActivityDisableTransferPointInteractionNotify}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:ActivityDisableTransferPointInteractionNotify)
                emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                        .ActivityDisableTransferPointInteractionNotifyOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                        .internal_static_ActivityDisableTransferPointInteractionNotify_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                        .internal_static_ActivityDisableTransferPointInteractionNotify_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                                        .ActivityDisableTransferPointInteractionNotify.class,
                                emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                                        .ActivityDisableTransferPointInteractionNotify.Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass.ActivityDisableTransferPointInteractionNotify.newBuilder()
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
                isDisable_ = false;

                if (scenePointPairBuilder_ == null) {
                    scenePointPair_ = null;
                } else {
                    scenePointPair_ = null;
                    scenePointPairBuilder_ = null;
                }
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                        .internal_static_ActivityDisableTransferPointInteractionNotify_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                            .ActivityDisableTransferPointInteractionNotify
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                        .ActivityDisableTransferPointInteractionNotify.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                            .ActivityDisableTransferPointInteractionNotify
                    build() {
                emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                                .ActivityDisableTransferPointInteractionNotify
                        result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                            .ActivityDisableTransferPointInteractionNotify
                    buildPartial() {
                emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                                .ActivityDisableTransferPointInteractionNotify
                        result =
                                new emu.grasscutter.net.proto
                                        .ActivityDisableTransferPointInteractionNotifyOuterClass
                                        .ActivityDisableTransferPointInteractionNotify(this);
                result.isDisable_ = isDisable_;
                if (scenePointPairBuilder_ == null) {
                    result.scenePointPair_ = scenePointPair_;
                } else {
                    result.scenePointPair_ = scenePointPairBuilder_.build();
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
                if (other
                        instanceof
                        emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                                .ActivityDisableTransferPointInteractionNotify) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                                            .ActivityDisableTransferPointInteractionNotify)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                                    .ActivityDisableTransferPointInteractionNotify
                            other) {
                if (other
                        == emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                                .ActivityDisableTransferPointInteractionNotify.getDefaultInstance()) return this;
                if (other.getIsDisable() != false) {
                    setIsDisable(other.getIsDisable());
                }
                if (other.hasScenePointPair()) {
                    mergeScenePointPair(other.getScenePointPair());
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
                emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                                .ActivityDisableTransferPointInteractionNotify
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                                            .ActivityDisableTransferPointInteractionNotify)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private boolean isDisable_;
            /**
             * <code>bool is_disable = 8;</code>
             *
             * @return The isDisable.
             */
            @java.lang.Override
            public boolean getIsDisable() {
                return isDisable_;
            }
            /**
             * <code>bool is_disable = 8;</code>
             *
             * @param value The isDisable to set.
             * @return This builder for chaining.
             */
            public Builder setIsDisable(boolean value) {

                isDisable_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool is_disable = 8;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsDisable() {

                isDisable_ = false;
                onChanged();
                return this;
            }

            private emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair scenePointPair_;
            private com.google.protobuf.SingleFieldBuilderV3<
                            emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair,
                            emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.Builder,
                            emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32PairOrBuilder>
                    scenePointPairBuilder_;
            /**
             * <code>.Uint32Pair scene_point_pair = 2;</code>
             *
             * @return Whether the scenePointPair field is set.
             */
            public boolean hasScenePointPair() {
                return scenePointPairBuilder_ != null || scenePointPair_ != null;
            }
            /**
             * <code>.Uint32Pair scene_point_pair = 2;</code>
             *
             * @return The scenePointPair.
             */
            public emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair getScenePointPair() {
                if (scenePointPairBuilder_ == null) {
                    return scenePointPair_ == null
                            ? emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.getDefaultInstance()
                            : scenePointPair_;
                } else {
                    return scenePointPairBuilder_.getMessage();
                }
            }
            /** <code>.Uint32Pair scene_point_pair = 2;</code> */
            public Builder setScenePointPair(
                    emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair value) {
                if (scenePointPairBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    scenePointPair_ = value;
                    onChanged();
                } else {
                    scenePointPairBuilder_.setMessage(value);
                }

                return this;
            }
            /** <code>.Uint32Pair scene_point_pair = 2;</code> */
            public Builder setScenePointPair(
                    emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.Builder builderForValue) {
                if (scenePointPairBuilder_ == null) {
                    scenePointPair_ = builderForValue.build();
                    onChanged();
                } else {
                    scenePointPairBuilder_.setMessage(builderForValue.build());
                }

                return this;
            }
            /** <code>.Uint32Pair scene_point_pair = 2;</code> */
            public Builder mergeScenePointPair(
                    emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair value) {
                if (scenePointPairBuilder_ == null) {
                    if (scenePointPair_ != null) {
                        scenePointPair_ =
                                emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.newBuilder(
                                                scenePointPair_)
                                        .mergeFrom(value)
                                        .buildPartial();
                    } else {
                        scenePointPair_ = value;
                    }
                    onChanged();
                } else {
                    scenePointPairBuilder_.mergeFrom(value);
                }

                return this;
            }
            /** <code>.Uint32Pair scene_point_pair = 2;</code> */
            public Builder clearScenePointPair() {
                if (scenePointPairBuilder_ == null) {
                    scenePointPair_ = null;
                    onChanged();
                } else {
                    scenePointPair_ = null;
                    scenePointPairBuilder_ = null;
                }

                return this;
            }
            /** <code>.Uint32Pair scene_point_pair = 2;</code> */
            public emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.Builder
                    getScenePointPairBuilder() {

                onChanged();
                return getScenePointPairFieldBuilder().getBuilder();
            }
            /** <code>.Uint32Pair scene_point_pair = 2;</code> */
            public emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32PairOrBuilder
                    getScenePointPairOrBuilder() {
                if (scenePointPairBuilder_ != null) {
                    return scenePointPairBuilder_.getMessageOrBuilder();
                } else {
                    return scenePointPair_ == null
                            ? emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.getDefaultInstance()
                            : scenePointPair_;
                }
            }
            /** <code>.Uint32Pair scene_point_pair = 2;</code> */
            private com.google.protobuf.SingleFieldBuilderV3<
                            emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair,
                            emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.Builder,
                            emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32PairOrBuilder>
                    getScenePointPairFieldBuilder() {
                if (scenePointPairBuilder_ == null) {
                    scenePointPairBuilder_ =
                            new com.google.protobuf.SingleFieldBuilderV3<
                                    emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair,
                                    emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32Pair.Builder,
                                    emu.grasscutter.net.proto.Uint32PairOuterClass.Uint32PairOrBuilder>(
                                    getScenePointPair(), getParentForChildren(), isClean());
                    scenePointPair_ = null;
                }
                return scenePointPairBuilder_;
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

            // @@protoc_insertion_point(builder_scope:ActivityDisableTransferPointInteractionNotify)
        }

        // @@protoc_insertion_point(class_scope:ActivityDisableTransferPointInteractionNotify)
        private static final emu.grasscutter.net.proto
                        .ActivityDisableTransferPointInteractionNotifyOuterClass
                        .ActivityDisableTransferPointInteractionNotify
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                            .ActivityDisableTransferPointInteractionNotify();
        }

        public static emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                        .ActivityDisableTransferPointInteractionNotify
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<ActivityDisableTransferPointInteractionNotify>
                PARSER =
                        new com.google.protobuf.AbstractParser<
                                ActivityDisableTransferPointInteractionNotify>() {
                            @java.lang.Override
                            public ActivityDisableTransferPointInteractionNotify parsePartialFrom(
                                    com.google.protobuf.CodedInputStream input,
                                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                                    throws com.google.protobuf.InvalidProtocolBufferException {
                                return new ActivityDisableTransferPointInteractionNotify(input, extensionRegistry);
                            }
                        };

        public static com.google.protobuf.Parser<ActivityDisableTransferPointInteractionNotify>
                parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<ActivityDisableTransferPointInteractionNotify>
                getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.ActivityDisableTransferPointInteractionNotifyOuterClass
                        .ActivityDisableTransferPointInteractionNotify
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_ActivityDisableTransferPointInteractionNotify_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_ActivityDisableTransferPointInteractionNotify_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n3ActivityDisableTransferPointInteractio"
                    + "nNotify.proto\032\020Uint32Pair.proto\"j\n-Activ"
                    + "ityDisableTransferPointInteractionNotify"
                    + "\022\022\n\nis_disable\030\010 \001(\010\022%\n\020scene_point_pair"
                    + "\030\002 \001(\0132\013.Uint32PairB\033\n\031emu.grasscutter.n"
                    + "et.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                            emu.grasscutter.net.proto.Uint32PairOuterClass.getDescriptor(),
                        });
        internal_static_ActivityDisableTransferPointInteractionNotify_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_ActivityDisableTransferPointInteractionNotify_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_ActivityDisableTransferPointInteractionNotify_descriptor,
                        new java.lang.String[] {
                            "IsDisable", "ScenePointPair",
                        });
        emu.grasscutter.net.proto.Uint32PairOuterClass.getDescriptor();
    }

    // @@protoc_insertion_point(outer_class_scope)
}
