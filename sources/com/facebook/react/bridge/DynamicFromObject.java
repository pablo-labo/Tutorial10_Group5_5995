package com.facebook.react.bridge;

import defpackage.s55;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000bR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/facebook/react/bridge/DynamicFromObject;", "Lcom/facebook/react/bridge/Dynamic;", "", "value", "<init>", "(Ljava/lang/Object;)V", "Lj6g;", "recycle", "()V", "", "asBoolean", "()Z", "", "asDouble", "()D", "", "asInt", "()I", "", "asString", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/ReadableArray;", "asArray", "()Lcom/facebook/react/bridge/ReadableArray;", "Lcom/facebook/react/bridge/ReadableMap;", "asMap", "()Lcom/facebook/react/bridge/ReadableMap;", "Ljava/lang/Object;", "isNull", "Lcom/facebook/react/bridge/ReadableType;", "getType", "()Lcom/facebook/react/bridge/ReadableType;", "type", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DynamicFromObject implements Dynamic {
    private final Object value;

    public DynamicFromObject(Object obj) {
        this.value = obj;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public ReadableArray asArray() {
        Object obj = this.value;
        if (obj instanceof ReadableArray) {
            return (ReadableArray) obj;
        }
        throw new ClassCastException("Dynamic value from Object is not a ReadableArray");
    }

    @Override // com.facebook.react.bridge.Dynamic
    public boolean asBoolean() {
        Object obj = this.value;
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        throw new ClassCastException("Dynamic value from Object is not a boolean");
    }

    @Override // com.facebook.react.bridge.Dynamic
    public double asDouble() {
        Object obj = this.value;
        if (!(obj instanceof Number)) {
            throw new ClassCastException("Dynamic value from Object is not a number");
        }
        obj.getClass();
        return ((Double) obj).doubleValue();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public int asInt() {
        Object obj = this.value;
        if (!(obj instanceof Number)) {
            throw new ClassCastException("Dynamic value from Object is not a number");
        }
        obj.getClass();
        return (int) ((Double) obj).doubleValue();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public ReadableMap asMap() {
        Object obj = this.value;
        if (obj instanceof ReadableMap) {
            return (ReadableMap) obj;
        }
        throw new ClassCastException("Dynamic value from Object is not a ReadableMap");
    }

    @Override // com.facebook.react.bridge.Dynamic
    public String asString() {
        Object obj = this.value;
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException("Dynamic value from Object is not a string");
    }

    @Override // com.facebook.react.bridge.Dynamic
    public ReadableType getType() {
        Object obj = this.value;
        if (obj == null) {
            return ReadableType.Null;
        }
        if (obj instanceof Boolean) {
            return ReadableType.Boolean;
        }
        if (obj instanceof Number) {
            return ReadableType.Number;
        }
        if (obj instanceof String) {
            return ReadableType.String;
        }
        if (obj instanceof ReadableMap) {
            return ReadableType.Map;
        }
        if (obj instanceof ReadableArray) {
            return ReadableType.Array;
        }
        s55.f("ReactNative", "Unmapped object type ".concat(obj.getClass().getName()));
        return ReadableType.Null;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public boolean isNull() {
        return this.value == null;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public void recycle() {
    }
}
