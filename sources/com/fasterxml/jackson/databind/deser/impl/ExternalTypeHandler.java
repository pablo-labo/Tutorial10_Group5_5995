package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ExternalTypeHandler {
    private final JavaType _beanType;
    private final Map<String, Object> _nameToPropertyIndex;
    private final ExtTypedProperty[] _properties;
    private final TokenBuffer[] _tokens;
    private final String[] _typeIds;

    public static class Builder {
        private final JavaType _beanType;
        private final List<ExtTypedProperty> _properties = new ArrayList();
        private final Map<String, Object> _nameToPropertyIndex = new HashMap();

        public Builder(JavaType javaType) {
            this._beanType = javaType;
        }

        private void _addPropertyIndex(String str, Integer num) {
            Object obj = this._nameToPropertyIndex.get(str);
            if (obj == null) {
                this._nameToPropertyIndex.put(str, num);
                return;
            }
            if (obj instanceof List) {
                ((List) obj).add(num);
                return;
            }
            LinkedList linkedList = new LinkedList();
            linkedList.add(obj);
            linkedList.add(num);
            this._nameToPropertyIndex.put(str, linkedList);
        }

        public void addExternal(SettableBeanProperty settableBeanProperty, TypeDeserializer typeDeserializer) {
            Integer numValueOf = Integer.valueOf(this._properties.size());
            this._properties.add(new ExtTypedProperty(settableBeanProperty, typeDeserializer));
            _addPropertyIndex(settableBeanProperty.getName(), numValueOf);
            _addPropertyIndex(typeDeserializer.getPropertyName(), numValueOf);
        }

        public ExternalTypeHandler build(BeanPropertyMap beanPropertyMap) {
            int size = this._properties.size();
            ExtTypedProperty[] extTypedPropertyArr = new ExtTypedProperty[size];
            for (int i = 0; i < size; i++) {
                ExtTypedProperty extTypedProperty = this._properties.get(i);
                SettableBeanProperty settableBeanPropertyFind = beanPropertyMap.find(extTypedProperty.getTypePropertyName());
                if (settableBeanPropertyFind != null) {
                    extTypedProperty.linkTypeProperty(settableBeanPropertyFind);
                }
                extTypedPropertyArr[i] = extTypedProperty;
            }
            return new ExternalTypeHandler(this._beanType, extTypedPropertyArr, this._nameToPropertyIndex, null, null);
        }
    }

    public static final class ExtTypedProperty {
        private final SettableBeanProperty _property;
        private final TypeDeserializer _typeDeserializer;
        private SettableBeanProperty _typeProperty;
        private final String _typePropertyName;

        public ExtTypedProperty(SettableBeanProperty settableBeanProperty, TypeDeserializer typeDeserializer) {
            this._property = settableBeanProperty;
            this._typeDeserializer = typeDeserializer;
            this._typePropertyName = typeDeserializer.getPropertyName();
        }

        public String getDefaultTypeId() {
            Class<?> defaultImpl = this._typeDeserializer.getDefaultImpl();
            if (defaultImpl == null) {
                return null;
            }
            return this._typeDeserializer.getTypeIdResolver().idFromValueAndType(null, defaultImpl);
        }

        public SettableBeanProperty getProperty() {
            return this._property;
        }

        public SettableBeanProperty getTypeProperty() {
            return this._typeProperty;
        }

        public String getTypePropertyName() {
            return this._typePropertyName;
        }

        public boolean hasDefaultType() {
            return this._typeDeserializer.hasDefaultImpl();
        }

        public boolean hasTypePropertyName(String str) {
            return str.equals(this._typePropertyName);
        }

        public void linkTypeProperty(SettableBeanProperty settableBeanProperty) {
            this._typeProperty = settableBeanProperty;
        }
    }

    public ExternalTypeHandler(ExternalTypeHandler externalTypeHandler) {
        this._beanType = externalTypeHandler._beanType;
        ExtTypedProperty[] extTypedPropertyArr = externalTypeHandler._properties;
        this._properties = extTypedPropertyArr;
        this._nameToPropertyIndex = externalTypeHandler._nameToPropertyIndex;
        int length = extTypedPropertyArr.length;
        this._typeIds = new String[length];
        this._tokens = new TokenBuffer[length];
    }

    private final boolean _handleTypePropertyValue(JsonParser jsonParser, DeserializationContext deserializationContext, String str, Object obj, String str2, int i) throws MismatchedInputException {
        if (!this._properties[i].hasTypePropertyName(str)) {
            return false;
        }
        if (obj == null || this._tokens[i] == null) {
            this._typeIds[i] = str2;
            return true;
        }
        _deserializeAndSet(jsonParser, deserializationContext, obj, i, str2);
        this._tokens[i] = null;
        return true;
    }

    public static Builder builder(JavaType javaType) {
        return new Builder(javaType);
    }

    public final Object _deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, int i, String str) {
        JsonParser jsonParserAsParser = this._tokens[i].asParser(jsonParser);
        if (jsonParserAsParser.nextToken() == JsonToken.VALUE_NULL) {
            return null;
        }
        TokenBuffer tokenBufferBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
        tokenBufferBufferForInputBuffering.writeStartArray();
        tokenBufferBufferForInputBuffering.writeString(str);
        tokenBufferBufferForInputBuffering.copyCurrentStructure(jsonParserAsParser);
        tokenBufferBufferForInputBuffering.writeEndArray();
        JsonParser jsonParserAsParser2 = tokenBufferBufferForInputBuffering.asParser(jsonParser);
        jsonParserAsParser2.nextToken();
        return this._properties[i].getProperty().deserialize(jsonParserAsParser2, deserializationContext);
    }

    public final void _deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, int i, String str) throws MismatchedInputException {
        if (str == null) {
            deserializationContext.reportInputMismatch(this._beanType, "Internal error in external Type Id handling: `null` type id passed", new Object[0]);
        }
        JsonParser jsonParserAsParser = this._tokens[i].asParser(jsonParser);
        if (jsonParserAsParser.nextToken() == JsonToken.VALUE_NULL) {
            this._properties[i].getProperty().set(obj, null);
            return;
        }
        TokenBuffer tokenBufferBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
        tokenBufferBufferForInputBuffering.writeStartArray();
        tokenBufferBufferForInputBuffering.writeString(str);
        tokenBufferBufferForInputBuffering.copyCurrentStructure(jsonParserAsParser);
        tokenBufferBufferForInputBuffering.writeEndArray();
        JsonParser jsonParserAsParser2 = tokenBufferBufferForInputBuffering.asParser(jsonParser);
        jsonParserAsParser2.nextToken();
        this._properties[i].getProperty().deserializeAndSet(jsonParserAsParser2, deserializationContext, obj);
    }

    public final Object _deserializeMissingToken(JsonParser jsonParser, DeserializationContext deserializationContext, int i, String str) {
        TokenBuffer tokenBufferBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
        tokenBufferBufferForInputBuffering.writeStartArray();
        tokenBufferBufferForInputBuffering.writeString(str);
        tokenBufferBufferForInputBuffering.writeEndArray();
        JsonParser jsonParserAsParser = tokenBufferBufferForInputBuffering.asParser(jsonParser);
        jsonParserAsParser.nextToken();
        return this._properties[i].getProperty().deserialize(jsonParserAsParser, deserializationContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object complete(com.fasterxml.jackson.core.JsonParser r11, com.fasterxml.jackson.databind.DeserializationContext r12, com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer r13, com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator r14) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer, com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean handlePropertyValue(com.fasterxml.jackson.core.JsonParser r10, com.fasterxml.jackson.databind.DeserializationContext r11, java.lang.String r12, java.lang.Object r13) throws com.fasterxml.jackson.databind.exc.MismatchedInputException {
        /*
            r9 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r9._nameToPropertyIndex
            java.lang.Object r0 = r0.get(r12)
            if (r0 != 0) goto La
            r9 = 0
            return r9
        La:
            boolean r1 = r0 instanceof java.util.List
            r2 = 1
            if (r1 == 0) goto L6f
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r13 = r0.iterator()
            java.lang.Object r0 = r13.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty[] r1 = r9._properties
            int r3 = r0.intValue()
            r1 = r1[r3]
            boolean r12 = r1.hasTypePropertyName(r12)
            if (r12 == 0) goto L4d
            java.lang.String r11 = r10.getText()
            r10.skipChildren()
            java.lang.String[] r10 = r9._typeIds
            int r12 = r0.intValue()
            r10[r12] = r11
        L38:
            boolean r10 = r13.hasNext()
            if (r10 == 0) goto L6e
            java.lang.String[] r10 = r9._typeIds
            java.lang.Object r12 = r13.next()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r10[r12] = r11
            goto L38
        L4d:
            com.fasterxml.jackson.databind.util.TokenBuffer r10 = r11.bufferAsCopyOfValue(r10)
            com.fasterxml.jackson.databind.util.TokenBuffer[] r11 = r9._tokens
            int r12 = r0.intValue()
            r11[r12] = r10
        L59:
            boolean r11 = r13.hasNext()
            if (r11 == 0) goto L6e
            com.fasterxml.jackson.databind.util.TokenBuffer[] r11 = r9._tokens
            java.lang.Object r12 = r13.next()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r11[r12] = r10
            goto L59
        L6e:
            return r2
        L6f:
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r7 = r0.intValue()
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty[] r0 = r9._properties
            r0 = r0[r7]
            boolean r12 = r0.hasTypePropertyName(r12)
            if (r12 == 0) goto L93
            java.lang.String[] r12 = r9._typeIds
            java.lang.String r0 = r10.getValueAsString()
            r12[r7] = r0
            r10.skipChildren()
            if (r13 == 0) goto Lb5
            com.fasterxml.jackson.databind.util.TokenBuffer[] r12 = r9._tokens
            r12 = r12[r7]
            if (r12 == 0) goto Lb5
            goto La3
        L93:
            com.fasterxml.jackson.databind.util.TokenBuffer r12 = r11.bufferAsCopyOfValue(r10)
            com.fasterxml.jackson.databind.util.TokenBuffer[] r0 = r9._tokens
            r0[r7] = r12
            if (r13 == 0) goto Lb5
            java.lang.String[] r12 = r9._typeIds
            r12 = r12[r7]
            if (r12 == 0) goto Lb5
        La3:
            java.lang.String[] r12 = r9._typeIds
            r8 = r12[r7]
            r0 = 0
            r12[r7] = r0
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r13
            r3._deserializeAndSet(r4, r5, r6, r7, r8)
            com.fasterxml.jackson.databind.util.TokenBuffer[] r9 = r3._tokens
            r9[r7] = r0
        Lb5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.handlePropertyValue(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.String, java.lang.Object):boolean");
    }

    public boolean handleTypePropertyValue(JsonParser jsonParser, DeserializationContext deserializationContext, String str, Object obj) {
        Object obj2 = this._nameToPropertyIndex.get(str);
        boolean z = false;
        if (obj2 == null) {
            return false;
        }
        String text = jsonParser.getText();
        if (!(obj2 instanceof List)) {
            return _handleTypePropertyValue(jsonParser, deserializationContext, str, obj, text, ((Integer) obj2).intValue());
        }
        Iterator it = ((List) obj2).iterator();
        while (it.hasNext()) {
            ExternalTypeHandler externalTypeHandler = this;
            JsonParser jsonParser2 = jsonParser;
            DeserializationContext deserializationContext2 = deserializationContext;
            String str2 = str;
            Object obj3 = obj;
            if (externalTypeHandler._handleTypePropertyValue(jsonParser2, deserializationContext2, str2, obj3, text, ((Integer) it.next()).intValue())) {
                z = true;
            }
            this = externalTypeHandler;
            jsonParser = jsonParser2;
            deserializationContext = deserializationContext2;
            str = str2;
            obj = obj3;
        }
        return z;
    }

    public ExternalTypeHandler start() {
        return new ExternalTypeHandler(this);
    }

    public ExternalTypeHandler(JavaType javaType, ExtTypedProperty[] extTypedPropertyArr, Map<String, Object> map, String[] strArr, TokenBuffer[] tokenBufferArr) {
        this._beanType = javaType;
        this._properties = extTypedPropertyArr;
        this._nameToPropertyIndex = map;
        this._typeIds = strArr;
        this._tokens = tokenBufferArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bf, code lost:
    
        return r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object complete(com.fasterxml.jackson.core.JsonParser r9, com.fasterxml.jackson.databind.DeserializationContext r10, java.lang.Object r11) throws com.fasterxml.jackson.databind.exc.MismatchedInputException {
        /*
            r8 = this;
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty[] r0 = r8._properties
            int r0 = r0.length
            r1 = 0
            r6 = r1
        L5:
            if (r6 >= r0) goto L98
            java.lang.String[] r1 = r8._typeIds
            r1 = r1[r6]
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler$ExtTypedProperty[] r2 = r8._properties
            r2 = r2[r6]
            com.fasterxml.jackson.databind.util.TokenBuffer[] r3 = r8._tokens
            if (r1 != 0) goto L81
            r3 = r3[r6]
            if (r3 != 0) goto L1d
        L17:
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            goto Lb7
        L1d:
            com.fasterxml.jackson.core.JsonToken r4 = r3.firstToken()
            boolean r4 = r4.isScalarValue()
            if (r4 == 0) goto L40
            com.fasterxml.jackson.core.JsonParser r3 = r3.asParser(r9)
            r3.nextToken()
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r4 = r2.getProperty()
            com.fasterxml.jackson.databind.JavaType r5 = r4.getType()
            java.lang.Object r3 = com.fasterxml.jackson.databind.jsontype.TypeDeserializer.deserializeIfNatural(r3, r10, r5)
            if (r3 == 0) goto L40
            r4.set(r11, r3)
            goto L17
        L40:
            boolean r3 = r2.hasDefaultType()
            if (r3 != 0) goto L5e
            com.fasterxml.jackson.databind.JavaType r3 = r8._beanType
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r4 = r2.getProperty()
            java.lang.String r4 = r4.getName()
            java.lang.String r2 = r2.getTypePropertyName()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r5 = "Missing external type id property '%s' (and no 'defaultImpl' specified)"
            r10.reportPropertyInputMismatch(r3, r4, r5, r2)
            goto L7b
        L5e:
            java.lang.String r1 = r2.getDefaultTypeId()
            if (r1 != 0) goto L7b
            com.fasterxml.jackson.databind.JavaType r3 = r8._beanType
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r4 = r2.getProperty()
            java.lang.String r4 = r4.getName()
            java.lang.String r2 = r2.getTypePropertyName()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r5 = "Invalid default type id for property '%s': `null` returned by TypeIdResolver"
            r10.reportPropertyInputMismatch(r3, r4, r5, r2)
        L7b:
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r7 = r1
            goto Lb4
        L81:
            r3 = r3[r6]
            if (r3 != 0) goto L7b
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r8 = r2.getProperty()
            boolean r9 = r8.isRequired()
            if (r9 != 0) goto L9a
            com.fasterxml.jackson.databind.DeserializationFeature r9 = com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY
            boolean r9 = r10.isEnabled(r9)
            if (r9 == 0) goto L98
            goto L9a
        L98:
            r5 = r11
            goto Lbf
        L9a:
            java.lang.Class r9 = r11.getClass()
            java.lang.String r0 = r8.getName()
            java.lang.String r8 = r8.getName()
            java.lang.String r1 = r2.getTypePropertyName()
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r1}
            java.lang.String r1 = "Missing property '%s' for external type id '%s'"
            r10.reportPropertyInputMismatch(r9, r0, r1, r8)
            return r11
        Lb4:
            r2._deserializeAndSet(r3, r4, r5, r6, r7)
        Lb7:
            int r6 = r6 + 1
            r8 = r2
            r9 = r3
            r10 = r4
            r11 = r5
            goto L5
        Lbf:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.complete(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, java.lang.Object):java.lang.Object");
    }
}
