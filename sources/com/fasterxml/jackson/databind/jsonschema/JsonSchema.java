package com.fasterxml.jackson.databind.jsonschema;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class JsonSchema {
    private final ObjectNode schema;

    @JsonCreator
    public JsonSchema(ObjectNode objectNode) {
        this.schema = objectNode;
    }

    public static JsonNode getDefaultSchemaNode() {
        ObjectNode objectNode = JsonNodeFactory.instance.objectNode();
        objectNode.put("type", "any");
        return objectNode;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof JsonSchema)) {
            return false;
        }
        ObjectNode objectNode = this.schema;
        ObjectNode objectNode2 = ((JsonSchema) obj).schema;
        return objectNode == null ? objectNode2 == null : objectNode.equals(objectNode2);
    }

    public int hashCode() {
        return this.schema.hashCode();
    }

    public String toString() {
        return this.schema.toString();
    }
}
