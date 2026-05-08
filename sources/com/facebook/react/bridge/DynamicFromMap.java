package com.facebook.react.bridge;

import androidx.core.util.Pools$SimplePool;
import defpackage.cm0;
import defpackage.dm0;
import defpackage.ej2;
import defpackage.em0;
import defpackage.fj2;
import defpackage.fm0;
import defpackage.kk2;
import defpackage.r6;
import defpackage.rh2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u000fR\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/facebook/react/bridge/DynamicFromMap;", "Lcom/facebook/react/bridge/Dynamic;", "<init>", "()V", "T", "Lkotlin/Function2;", "Lcom/facebook/react/bridge/ReadableMap;", "", "executor", "accessMapSafely", "(Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lj6g;", "recycle", "", "asBoolean", "()Z", "", "asDouble", "()D", "", "asInt", "()I", "asString", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/ReadableArray;", "asArray", "()Lcom/facebook/react/bridge/ReadableArray;", "asMap", "()Lcom/facebook/react/bridge/ReadableMap;", "map", "Lcom/facebook/react/bridge/ReadableMap;", "name", "Ljava/lang/String;", "isNull", "Lcom/facebook/react/bridge/ReadableType;", "getType", "()Lcom/facebook/react/bridge/ReadableType;", "type", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DynamicFromMap implements Dynamic {
    private static final String DYNAMIC_VALUE_RECYCLED_FAILURE_MESSAGE = "This dynamic value has been recycled";
    private ReadableMap map;
    private String name;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ThreadLocal<Pools$SimplePool<DynamicFromMap>> pool = new ThreadLocal<Pools$SimplePool<DynamicFromMap>>() { // from class: com.facebook.react.bridge.DynamicFromMap$Companion$pool$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public Pools$SimplePool<DynamicFromMap> initialValue() {
            return new Pools$SimplePool<>(10);
        }
    };

    public /* synthetic */ DynamicFromMap(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _get_isNull_$lambda$0(ReadableMap readableMap, String str) {
        readableMap.getClass();
        str.getClass();
        return readableMap.isNull(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadableType _get_type_$lambda$7(ReadableMap readableMap, String str) {
        readableMap.getClass();
        str.getClass();
        return readableMap.getType(str);
    }

    private final <T> T accessMapSafely(Function2<? super ReadableMap, ? super String, ? extends T> executor) {
        String str = this.name;
        if (str == null) {
            r6.g(DYNAMIC_VALUE_RECYCLED_FAILURE_MESSAGE);
            return null;
        }
        ReadableMap readableMap = this.map;
        if (readableMap != null) {
            return executor.invoke(readableMap, str);
        }
        r6.g(DYNAMIC_VALUE_RECYCLED_FAILURE_MESSAGE);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadableArray asArray$lambda$5(ReadableMap readableMap, String str) {
        readableMap.getClass();
        str.getClass();
        return readableMap.getArray(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean asBoolean$lambda$1(ReadableMap readableMap, String str) {
        readableMap.getClass();
        str.getClass();
        return readableMap.getBoolean(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double asDouble$lambda$2(ReadableMap readableMap, String str) {
        readableMap.getClass();
        str.getClass();
        return readableMap.getDouble(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int asInt$lambda$3(ReadableMap readableMap, String str) {
        readableMap.getClass();
        str.getClass();
        return readableMap.getInt(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadableMap asMap$lambda$6(ReadableMap readableMap, String str) {
        readableMap.getClass();
        str.getClass();
        return readableMap.getMap(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String asString$lambda$4(ReadableMap readableMap, String str) {
        readableMap.getClass();
        str.getClass();
        return readableMap.getString(str);
    }

    @Override // com.facebook.react.bridge.Dynamic
    public ReadableArray asArray() {
        return (ReadableArray) accessMapSafely(new dm0(6, (byte) 0));
    }

    @Override // com.facebook.react.bridge.Dynamic
    public boolean asBoolean() {
        return ((Boolean) accessMapSafely(new kk2(3))).booleanValue();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public double asDouble() {
        return ((Number) accessMapSafely(new fm0(7))).doubleValue();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public int asInt() {
        return ((Number) accessMapSafely(new ej2(4, (byte) 0))).intValue();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public ReadableMap asMap() {
        return (ReadableMap) accessMapSafely(new rh2(4, (byte) 0));
    }

    @Override // com.facebook.react.bridge.Dynamic
    public String asString() {
        return (String) accessMapSafely(new fj2(4, (byte) 0));
    }

    @Override // com.facebook.react.bridge.Dynamic
    public ReadableType getType() {
        return (ReadableType) accessMapSafely(new cm0(4));
    }

    @Override // com.facebook.react.bridge.Dynamic
    public boolean isNull() {
        return ((Boolean) accessMapSafely(new em0(5))).booleanValue();
    }

    @Override // com.facebook.react.bridge.Dynamic
    public void recycle() {
        this.map = null;
        this.name = null;
        Pools$SimplePool<DynamicFromMap> pools$SimplePool = pool.get();
        if (pools$SimplePool != null) {
            pools$SimplePool.a(this);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tR\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/bridge/DynamicFromMap$Companion;", "", "<init>", "()V", "pool", "Ljava/lang/ThreadLocal;", "Landroidx/core/util/Pools$SimplePool;", "Lcom/facebook/react/bridge/DynamicFromMap;", "DYNAMIC_VALUE_RECYCLED_FAILURE_MESSAGE", "", "create", "map", "Lcom/facebook/react/bridge/ReadableMap;", "name", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DynamicFromMap create(ReadableMap map, String name) {
            DynamicFromMap dynamicFromMap;
            map.getClass();
            name.getClass();
            Pools$SimplePool pools$SimplePool = (Pools$SimplePool) DynamicFromMap.pool.get();
            if (pools$SimplePool == null || (dynamicFromMap = (DynamicFromMap) pools$SimplePool.acquire()) == null) {
                dynamicFromMap = new DynamicFromMap(null);
            }
            dynamicFromMap.map = map;
            dynamicFromMap.name = name;
            return dynamicFromMap;
        }

        private Companion() {
        }
    }

    private DynamicFromMap() {
    }
}
