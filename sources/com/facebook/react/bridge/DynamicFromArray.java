package com.facebook.react.bridge;

import androidx.core.util.Pools$SimplePool;
import defpackage.r6;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u000b¨\u0006\""}, d2 = {"Lcom/facebook/react/bridge/DynamicFromArray;", "Lcom/facebook/react/bridge/Dynamic;", "<init>", "()V", "Lj6g;", "recycle", "Lcom/facebook/react/bridge/ReadableArray;", "asArray", "()Lcom/facebook/react/bridge/ReadableArray;", "", "asBoolean", "()Z", "", "asDouble", "()D", "", "asInt", "()I", "Lcom/facebook/react/bridge/ReadableMap;", "asMap", "()Lcom/facebook/react/bridge/ReadableMap;", "", "asString", "()Ljava/lang/String;", "array", "Lcom/facebook/react/bridge/ReadableArray;", "index", "I", "Lcom/facebook/react/bridge/ReadableType;", "getType", "()Lcom/facebook/react/bridge/ReadableType;", "type", "isNull", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DynamicFromArray implements Dynamic {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Pools$SimplePool<DynamicFromArray> pool = new Pools$SimplePool<>(10);
    private ReadableArray array;
    private int index;

    private DynamicFromArray() {
        this.index = -1;
    }

    public static final DynamicFromArray create(ReadableArray readableArray, int i) {
        return INSTANCE.create(readableArray, i);
    }

    @Override // com.facebook.react.bridge.Dynamic
    public ReadableArray asArray() {
        ReadableArray array;
        ReadableArray readableArray = this.array;
        if (readableArray != null && (array = readableArray.getArray(this.index)) != null) {
            return array;
        }
        r6.g("This dynamic value has been recycled");
        return null;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public boolean asBoolean() {
        ReadableArray readableArray = this.array;
        if (readableArray != null) {
            return readableArray.getBoolean(this.index);
        }
        r6.g("This dynamic value has been recycled");
        return false;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public double asDouble() {
        ReadableArray readableArray = this.array;
        if (readableArray != null) {
            return readableArray.getDouble(this.index);
        }
        r6.g("This dynamic value has been recycled");
        return 0.0d;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public int asInt() {
        ReadableArray readableArray = this.array;
        if (readableArray != null) {
            return readableArray.getInt(this.index);
        }
        r6.g("This dynamic value has been recycled");
        return 0;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public ReadableMap asMap() {
        ReadableMap map;
        ReadableArray readableArray = this.array;
        if (readableArray != null && (map = readableArray.getMap(this.index)) != null) {
            return map;
        }
        r6.g("This dynamic value has been recycled");
        return null;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public String asString() {
        String string;
        ReadableArray readableArray = this.array;
        if (readableArray != null && (string = readableArray.getString(this.index)) != null) {
            return string;
        }
        r6.g("This dynamic value has been recycled");
        return null;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public ReadableType getType() {
        ReadableType type;
        ReadableArray readableArray = this.array;
        if (readableArray != null && (type = readableArray.getType(this.index)) != null) {
            return type;
        }
        r6.g("This dynamic value has been recycled");
        return null;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public boolean isNull() {
        ReadableArray readableArray = this.array;
        if (readableArray != null) {
            return readableArray.isNull(this.index);
        }
        r6.g("This dynamic value has been recycled");
        return false;
    }

    @Override // com.facebook.react.bridge.Dynamic
    public void recycle() {
        this.array = null;
        this.index = -1;
        pool.a(this);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/facebook/react/bridge/DynamicFromArray$Companion;", "", "<init>", "()V", "pool", "Landroidx/core/util/Pools$SimplePool;", "Lcom/facebook/react/bridge/DynamicFromArray;", "create", "array", "Lcom/facebook/react/bridge/ReadableArray;", "index", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DynamicFromArray create(ReadableArray array, int index) {
            array.getClass();
            DynamicFromArray dynamicFromArray = (DynamicFromArray) DynamicFromArray.pool.acquire();
            if (dynamicFromArray == null) {
                dynamicFromArray = new DynamicFromArray(null);
            }
            dynamicFromArray.array = array;
            dynamicFromArray.index = index;
            return dynamicFromArray;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DynamicFromArray(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
