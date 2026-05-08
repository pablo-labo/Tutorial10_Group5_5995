package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.databind.node.ContainerNode;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ContainerNode<T extends ContainerNode<T>> extends BaseJsonNode {
    private static final long serialVersionUID = 1;
    protected final JsonNodeFactory _nodeFactory;

    public ContainerNode() {
        this._nodeFactory = null;
    }

    public final ArrayNode arrayNode() {
        return this._nodeFactory.arrayNode();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String asText() {
        return "";
    }

    public final BooleanNode booleanNode(boolean z) {
        return this._nodeFactory.booleanNode(z);
    }

    public final NullNode nullNode() {
        return this._nodeFactory.nullNode();
    }

    public final ObjectNode objectNode() {
        return this._nodeFactory.objectNode();
    }

    public final TextNode textNode(String str) {
        return this._nodeFactory.textNode(str);
    }

    public ContainerNode(JsonNodeFactory jsonNodeFactory) {
        this._nodeFactory = jsonNodeFactory;
    }
}
