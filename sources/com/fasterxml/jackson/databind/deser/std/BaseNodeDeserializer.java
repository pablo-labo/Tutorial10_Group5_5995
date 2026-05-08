package com.fasterxml.jackson.databind.deser.std;

import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.cfg.DatatypeFeatures;
import com.fasterxml.jackson.databind.cfg.JsonNodeFeature;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ContainerNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.RawValue;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
abstract class BaseNodeDeserializer<T extends JsonNode> extends StdDeserializer<T> implements ContextualDeserializer {
    protected final boolean _mergeArrays;
    protected final boolean _mergeObjects;
    protected final Boolean _supportsUpdates;

    public static final class ContainerStack {
        private int _end;
        private ContainerNode[] _stack;
        private int _top;

        public ContainerNode popOrNull() {
            int i = this._top;
            if (i == 0) {
                return null;
            }
            ContainerNode[] containerNodeArr = this._stack;
            int i2 = i - 1;
            this._top = i2;
            return containerNodeArr[i2];
        }

        public void push(ContainerNode containerNode) {
            int i = this._top;
            int i2 = this._end;
            ContainerNode[] containerNodeArr = this._stack;
            if (i < i2) {
                this._top = i + 1;
                containerNodeArr[i] = containerNode;
                return;
            }
            if (containerNodeArr == null) {
                this._end = 10;
                this._stack = new ContainerNode[10];
            } else {
                int iMin = Math.min(4000, Math.max(20, i2 >> 1)) + i2;
                this._end = iMin;
                this._stack = (ContainerNode[]) Arrays.copyOf(this._stack, iMin);
            }
            ContainerNode[] containerNodeArr2 = this._stack;
            int i3 = this._top;
            this._top = i3 + 1;
            containerNodeArr2[i3] = containerNode;
        }
    }

    public BaseNodeDeserializer(BaseNodeDeserializer<?> baseNodeDeserializer, boolean z, boolean z2) {
        super(baseNodeDeserializer);
        this._supportsUpdates = baseNodeDeserializer._supportsUpdates;
        this._mergeArrays = z;
        this._mergeObjects = z2;
    }

    private static boolean _shouldMerge(Boolean bool, Boolean bool2) {
        if (bool != null) {
            return bool.booleanValue();
        }
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        return true;
    }

    public abstract JsonDeserializer<?> _createWithMerge(boolean z, boolean z2);

    public final JsonNode _deserializeAnyScalar(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
        int iCurrentTokenId = jsonParser.currentTokenId();
        if (iCurrentTokenId == 2) {
            return nodeFactory.objectNode();
        }
        switch (iCurrentTokenId) {
            case 6:
                return nodeFactory.textNode(jsonParser.getText());
            case 7:
                return _fromInt(jsonParser, deserializationContext, nodeFactory);
            case 8:
                return _fromFloat(jsonParser, deserializationContext, nodeFactory);
            case DatadogLogGenerator.CRASH /* 9 */:
                return nodeFactory.booleanNode(true);
            case 10:
                return nodeFactory.booleanNode(false);
            case 11:
                return nodeFactory.nullNode();
            case 12:
                return _fromEmbedded(jsonParser, deserializationContext);
            default:
                return (JsonNode) deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fasterxml.jackson.databind.node.ContainerNode<?> _deserializeContainerNoRecursion(com.fasterxml.jackson.core.JsonParser r14, com.fasterxml.jackson.databind.DeserializationContext r15, com.fasterxml.jackson.databind.node.JsonNodeFactory r16, com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.ContainerStack r17, com.fasterxml.jackson.databind.node.ContainerNode<?> r18) throws com.fasterxml.jackson.databind.exc.MismatchedInputException {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer._deserializeContainerNoRecursion(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.node.JsonNodeFactory, com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer$ContainerStack, com.fasterxml.jackson.databind.node.ContainerNode):com.fasterxml.jackson.databind.node.ContainerNode");
    }

    public final ObjectNode _deserializeObjectAtName(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory, ContainerStack containerStack) throws MismatchedInputException {
        ObjectNode objectNode = jsonNodeFactory.objectNode();
        String strCurrentName = jsonParser.currentName();
        while (strCurrentName != null) {
            JsonToken jsonTokenNextToken = jsonParser.nextToken();
            if (jsonTokenNextToken == null) {
                jsonTokenNextToken = JsonToken.NOT_AVAILABLE;
            }
            int iId = jsonTokenNextToken.id();
            JsonNode jsonNode_deserializeAnyScalar = iId != 1 ? iId != 3 ? _deserializeAnyScalar(jsonParser, deserializationContext) : _deserializeContainerNoRecursion(jsonParser, deserializationContext, jsonNodeFactory, containerStack, jsonNodeFactory.arrayNode()) : _deserializeContainerNoRecursion(jsonParser, deserializationContext, jsonNodeFactory, containerStack, jsonNodeFactory.objectNode());
            JsonNode jsonNodeReplace = objectNode.replace(strCurrentName, jsonNode_deserializeAnyScalar);
            if (jsonNodeReplace != null) {
                _handleDuplicateField(jsonParser, deserializationContext, jsonNodeFactory, strCurrentName, objectNode, jsonNodeReplace, jsonNode_deserializeAnyScalar);
            }
            strCurrentName = jsonParser.nextFieldName();
        }
        return objectNode;
    }

    public final JsonNode _deserializeRareScalar(JsonParser jsonParser, DeserializationContext deserializationContext) {
        int iCurrentTokenId = jsonParser.currentTokenId();
        return iCurrentTokenId != 2 ? iCurrentTokenId != 8 ? iCurrentTokenId != 12 ? (JsonNode) deserializationContext.handleUnexpectedToken(handledType(), jsonParser) : _fromEmbedded(jsonParser, deserializationContext) : _fromFloat(jsonParser, deserializationContext, deserializationContext.getNodeFactory()) : deserializationContext.getNodeFactory().objectNode();
    }

    public final JsonNode _fromBigDecimal(DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory, BigDecimal bigDecimal) {
        DatatypeFeatures datatypeFeatures = deserializationContext.getDatatypeFeatures();
        JsonNodeFeature jsonNodeFeature = JsonNodeFeature.STRIP_TRAILING_BIGDECIMAL_ZEROES;
        if (datatypeFeatures.isExplicitlySet(jsonNodeFeature) ? datatypeFeatures.isEnabled(jsonNodeFeature) : jsonNodeFactory.willStripTrailingBigDecimalZeroes()) {
            try {
                bigDecimal = bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
            } catch (ArithmeticException unused) {
            }
        }
        return jsonNodeFactory.numberNode(bigDecimal);
    }

    public final JsonNode _fromEmbedded(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
        Object embeddedObject = jsonParser.getEmbeddedObject();
        return embeddedObject == null ? nodeFactory.nullNode() : embeddedObject.getClass() == byte[].class ? nodeFactory.binaryNode((byte[]) embeddedObject) : embeddedObject instanceof RawValue ? nodeFactory.rawValueNode((RawValue) embeddedObject) : embeddedObject instanceof JsonNode ? (JsonNode) embeddedObject : nodeFactory.pojoNode(embeddedObject);
    }

    public final JsonNode _fromFloat(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) {
        JsonParser.NumberTypeFP numberTypeFP = jsonParser.getNumberTypeFP();
        return numberTypeFP == JsonParser.NumberTypeFP.BIG_DECIMAL ? _fromBigDecimal(deserializationContext, jsonNodeFactory, jsonParser.getDecimalValue()) : deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) ? jsonParser.isNaN() ? deserializationContext.isEnabled(JsonNodeFeature.FAIL_ON_NAN_TO_BIG_DECIMAL_COERCION) ? (JsonNode) deserializationContext.handleWeirdNumberValue(handledType(), Double.valueOf(jsonParser.getDoubleValue()), "Cannot convert NaN into BigDecimal", new Object[0]) : jsonNodeFactory.numberNode(jsonParser.getDoubleValue()) : _fromBigDecimal(deserializationContext, jsonNodeFactory, jsonParser.getDecimalValue()) : numberTypeFP == JsonParser.NumberTypeFP.FLOAT32 ? jsonNodeFactory.numberNode(jsonParser.getFloatValue()) : jsonNodeFactory.numberNode(jsonParser.getDoubleValue());
    }

    public final JsonNode _fromInt(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) {
        int deserializationFeatures = deserializationContext.getDeserializationFeatures();
        JsonParser.NumberType numberType = (StdDeserializer.F_MASK_INT_COERCIONS & deserializationFeatures) != 0 ? DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.enabledIn(deserializationFeatures) ? JsonParser.NumberType.BIG_INTEGER : DeserializationFeature.USE_LONG_FOR_INTS.enabledIn(deserializationFeatures) ? JsonParser.NumberType.LONG : jsonParser.getNumberType() : jsonParser.getNumberType();
        return numberType == JsonParser.NumberType.INT ? jsonNodeFactory.numberNode(jsonParser.getIntValue()) : numberType == JsonParser.NumberType.LONG ? jsonNodeFactory.numberNode(jsonParser.getLongValue()) : jsonNodeFactory.numberNode(jsonParser.getBigIntegerValue());
    }

    public void _handleDuplicateField(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory, String str, ObjectNode objectNode, JsonNode jsonNode, JsonNode jsonNode2) throws MismatchedInputException {
        if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY)) {
            deserializationContext.reportInputMismatch(JsonNode.class, "Duplicate field '%s' for `ObjectNode`: not allowed when `DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY` enabled", str);
        }
        if (deserializationContext.isEnabled(StreamReadCapability.DUPLICATE_PROPERTIES)) {
            if (jsonNode.isArray()) {
                ((ArrayNode) jsonNode).add(jsonNode2);
                objectNode.replace(str, jsonNode);
            } else {
                ArrayNode arrayNode = jsonNodeFactory.arrayNode();
                arrayNode.add(jsonNode);
                arrayNode.add(jsonNode2);
                objectNode.replace(str, arrayNode);
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        DeserializationConfig config = deserializationContext.getConfig();
        Boolean defaultMergeable = config.getDefaultMergeable(ArrayNode.class);
        Boolean defaultMergeable2 = config.getDefaultMergeable(ObjectNode.class);
        Boolean defaultMergeable3 = config.getDefaultMergeable(JsonNode.class);
        boolean z_shouldMerge = _shouldMerge(defaultMergeable, defaultMergeable3);
        boolean z_shouldMerge2 = _shouldMerge(defaultMergeable2, defaultMergeable3);
        return (z_shouldMerge == this._mergeArrays && z_shouldMerge2 == this._mergeObjects) ? this : _createWithMerge(z_shouldMerge, z_shouldMerge2);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType logicalType() {
        return LogicalType.Untyped;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return this._supportsUpdates;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fasterxml.jackson.databind.JsonNode updateObject(com.fasterxml.jackson.core.JsonParser r8, com.fasterxml.jackson.databind.DeserializationContext r9, com.fasterxml.jackson.databind.node.ObjectNode r10, com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.ContainerStack r11) throws com.fasterxml.jackson.databind.exc.MismatchedInputException {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.updateObject(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.node.ObjectNode, com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer$ContainerStack):com.fasterxml.jackson.databind.JsonNode");
    }

    public BaseNodeDeserializer(Class<T> cls, Boolean bool) {
        super((Class<?>) cls);
        this._supportsUpdates = bool;
        this._mergeArrays = true;
        this._mergeObjects = true;
    }

    public final JsonNode _fromInt(JsonParser jsonParser, int i, JsonNodeFactory jsonNodeFactory) {
        if (i != 0) {
            if (DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.enabledIn(i)) {
                return jsonNodeFactory.numberNode(jsonParser.getBigIntegerValue());
            }
            return jsonNodeFactory.numberNode(jsonParser.getLongValue());
        }
        JsonParser.NumberType numberType = jsonParser.getNumberType();
        if (numberType == JsonParser.NumberType.INT) {
            return jsonNodeFactory.numberNode(jsonParser.getIntValue());
        }
        if (numberType == JsonParser.NumberType.LONG) {
            return jsonNodeFactory.numberNode(jsonParser.getLongValue());
        }
        return jsonNodeFactory.numberNode(jsonParser.getBigIntegerValue());
    }
}
