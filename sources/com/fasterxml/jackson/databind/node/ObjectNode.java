package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.cfg.JsonNodeFeature;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public class ObjectNode extends ContainerNode<ObjectNode> implements Serializable {
    private static final long serialVersionUID = 1;
    protected final Map<String, JsonNode> _children;

    public ObjectNode(JsonNodeFactory jsonNodeFactory) {
        super(jsonNodeFactory);
        this._children = new LinkedHashMap();
    }

    public boolean _childrenEqual(ObjectNode objectNode) {
        return this._children.equals(objectNode._children);
    }

    public Map<String, JsonNode> _contentsToSerialize(SerializerProvider serializerProvider) {
        return (!serializerProvider.isEnabled(JsonNodeFeature.WRITE_PROPERTIES_SORTED) || this._children.isEmpty()) ? this._children : new TreeMap(this._children);
    }

    public ObjectNode _put(String str, JsonNode jsonNode) {
        this._children.put(str, jsonNode);
        return this;
    }

    @Override // com.fasterxml.jackson.core.TreeNode
    public JsonToken asToken() {
        return JsonToken.START_OBJECT;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public Iterator<JsonNode> elements() {
        return this._children.values().iterator();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ObjectNode)) {
            return _childrenEqual((ObjectNode) obj);
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public Iterator<String> fieldNames() {
        return this._children.keySet().iterator();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public Iterator<Map.Entry<String, JsonNode>> fields() {
        return this._children.entrySet().iterator();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNode get(String str) {
        return this._children.get(str);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNodeType getNodeType() {
        return JsonNodeType.OBJECT;
    }

    public int hashCode() {
        return this._children.hashCode();
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializable.Base
    public boolean isEmpty(SerializerProvider serializerProvider) {
        return this._children.isEmpty();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public final boolean isObject() {
        return true;
    }

    public ObjectNode put(String str, String str2) {
        return _put(str, str2 == null ? nullNode() : textNode(str2));
    }

    public ArrayNode putArray(String str) {
        ArrayNode arrayNode = arrayNode();
        _put(str, arrayNode);
        return arrayNode;
    }

    public JsonNode replace(String str, JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        return this._children.put(str, jsonNode);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        if (serializerProvider != null) {
            boolean zIsEnabled = serializerProvider.isEnabled(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS);
            boolean z = !zIsEnabled;
            boolean zIsEnabled2 = serializerProvider.isEnabled(JsonNodeFeature.WRITE_NULL_PROPERTIES);
            boolean z2 = !zIsEnabled2;
            if (!zIsEnabled || !zIsEnabled2) {
                jsonGenerator.writeStartObject(this);
                serializeFilteredContents(jsonGenerator, serializerProvider, z, z2);
                jsonGenerator.writeEndObject();
                return;
            }
        }
        jsonGenerator.writeStartObject(this);
        for (Map.Entry<String, JsonNode> entry : _contentsToSerialize(serializerProvider).entrySet()) {
            JsonNode value = entry.getValue();
            jsonGenerator.writeFieldName(entry.getKey());
            value.serialize(jsonGenerator, serializerProvider);
        }
        jsonGenerator.writeEndObject();
    }

    public void serializeFilteredContents(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, boolean z, boolean z2) {
        for (Map.Entry<String, JsonNode> entry : _contentsToSerialize(serializerProvider).entrySet()) {
            JsonNode value = entry.getValue();
            if (!z || !value.isArray() || !value.isEmpty(serializerProvider)) {
                if (!z2 || !value.isNull()) {
                    jsonGenerator.writeFieldName(entry.getKey());
                    value.serialize(jsonGenerator, serializerProvider);
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializable
    public void serializeWithType(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) {
        boolean z;
        boolean z2;
        if (serializerProvider != null) {
            z = !serializerProvider.isEnabled(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS);
            z2 = !serializerProvider.isEnabled(JsonNodeFeature.WRITE_NULL_PROPERTIES);
        } else {
            z = false;
            z2 = false;
        }
        WritableTypeId writableTypeIdWriteTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(this, JsonToken.START_OBJECT));
        if (z || z2) {
            serializeFilteredContents(jsonGenerator, serializerProvider, z, z2);
        } else {
            for (Map.Entry<String, JsonNode> entry : _contentsToSerialize(serializerProvider).entrySet()) {
                JsonNode value = entry.getValue();
                jsonGenerator.writeFieldName(entry.getKey());
                value.serialize(jsonGenerator, serializerProvider);
            }
        }
        typeSerializer.writeTypeSuffix(jsonGenerator, writableTypeIdWriteTypePrefix);
    }

    public <T extends JsonNode> T set(String str, JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        this._children.put(str, jsonNode);
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public int size() {
        return this._children.size();
    }

    public ObjectNode put(String str, boolean z) {
        return _put(str, booleanNode(z));
    }
}
