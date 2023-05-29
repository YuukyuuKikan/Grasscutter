// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FishEscapeReason.proto

package emu.grasscutter.net.proto;

public final class FishEscapeReasonOuterClass {
    private FishEscapeReasonOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }
    /**
     *
     *
     * <pre>
     * Obf: DGDCCMHODEN
     * </pre>
     *
     * Protobuf enum {@code FishEscapeReason}
     */
    public enum FishEscapeReason implements com.google.protobuf.ProtocolMessageEnum {
        /** <code>FISN_ESCAPE_NONE = 0;</code> */
        FISN_ESCAPE_NONE(0),
        /** <code>FISH_ESCAPE_SHOCKED = 1;</code> */
        FISH_ESCAPE_SHOCKED(1),
        /** <code>FISH_ESCAPE_UNHOOK = 2;</code> */
        FISH_ESCAPE_UNHOOK(2),
        UNRECOGNIZED(-1),
        ;

        /** <code>FISN_ESCAPE_NONE = 0;</code> */
        public static final int FISN_ESCAPE_NONE_VALUE = 0;
        /** <code>FISH_ESCAPE_SHOCKED = 1;</code> */
        public static final int FISH_ESCAPE_SHOCKED_VALUE = 1;
        /** <code>FISH_ESCAPE_UNHOOK = 2;</code> */
        public static final int FISH_ESCAPE_UNHOOK_VALUE = 2;

        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new java.lang.IllegalArgumentException(
                        "Can't get the number of an unknown enum value.");
            }
            return value;
        }

        /**
         * @param value The numeric wire value of the corresponding enum entry.
         * @return The enum associated with the given numeric wire value.
         * @deprecated Use {@link #forNumber(int)} instead.
         */
        @java.lang.Deprecated
        public static FishEscapeReason valueOf(int value) {
            return forNumber(value);
        }

        /**
         * @param value The numeric wire value of the corresponding enum entry.
         * @return The enum associated with the given numeric wire value.
         */
        public static FishEscapeReason forNumber(int value) {
            switch (value) {
                case 0:
                    return FISN_ESCAPE_NONE;
                case 1:
                    return FISH_ESCAPE_SHOCKED;
                case 2:
                    return FISH_ESCAPE_UNHOOK;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<FishEscapeReason> internalGetValueMap() {
            return internalValueMap;
        }

        private static final com.google.protobuf.Internal.EnumLiteMap<FishEscapeReason>
                internalValueMap =
                        new com.google.protobuf.Internal.EnumLiteMap<FishEscapeReason>() {
                            public FishEscapeReason findValueByNumber(int number) {
                                return FishEscapeReason.forNumber(number);
                            }
                        };

        public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this == UNRECOGNIZED) {
                throw new java.lang.IllegalStateException(
                        "Can't get the descriptor of an unrecognized enum value.");
            }
            return getDescriptor().getValues().get(ordinal());
        }

        public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }

        public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
            return emu.grasscutter.net.proto.FishEscapeReasonOuterClass.getDescriptor()
                    .getEnumTypes()
                    .get(0);
        }

        private static final FishEscapeReason[] VALUES = values();

        public static FishEscapeReason valueOf(
                com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[desc.getIndex()];
        }

        private final int value;

        private FishEscapeReason(int value) {
            this.value = value;
        }

        // @@protoc_insertion_point(enum_scope:FishEscapeReason)
    }

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\026FishEscapeReason.proto*Y\n\020FishEscapeRe"
                    + "ason\022\024\n\020FISN_ESCAPE_NONE\020\000\022\027\n\023FISH_ESCAP"
                    + "E_SHOCKED\020\001\022\026\n\022FISH_ESCAPE_UNHOOK\020\002B\033\n\031e"
                    + "mu.grasscutter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    }

    // @@protoc_insertion_point(outer_class_scope)
}
