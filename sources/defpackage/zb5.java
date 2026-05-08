package defpackage;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zb5 implements ReadableMap {
    public final ReadableMap a;
    public final ArrayList b;
    public final yb5<Map.Entry<String, Object>> c;

    public zb5(ReadableMap readableMap, ArrayList arrayList) {
        this.a = readableMap;
        this.b = arrayList;
        this.c = new yb5<>(readableMap.getEntryIterator(), new i35(this, 1));
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public final ReadableArray getArray(String str) {
        str.getClass();
        return this.a.getArray(str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public final boolean getBoolean(String str) {
        str.getClass();
        return this.a.getBoolean(str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public final double getDouble(String str) {
        str.getClass();
        return this.a.getDouble(str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public final Dynamic getDynamic(String str) {
        str.getClass();
        return this.a.getDynamic(str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public final Iterator getEntryIterator() {
        return this.c;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public final int getInt(String str) {
        str.getClass();
        return this.a.getInt(str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public final long getLong(String str) {
        str.getClass();
        return this.a.getLong(str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public final ReadableMap getMap(String str) {
        str.getClass();
        return this.a.getMap(str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public final String getString(String str) {
        str.getClass();
        return this.a.getString(str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public final ReadableType getType(String str) {
        str.getClass();
        return this.a.getType(str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public final boolean hasKey(String str) {
        str.getClass();
        return this.a.hasKey(str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public final boolean isNull(String str) {
        str.getClass();
        return this.a.isNull(str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public final ReadableMapKeySetIterator keySetIterator() {
        return new ym3(this.a.keySetIterator(), new k91(this));
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public final HashMap<String, Object> toHashMap() {
        return this.a.toHashMap();
    }
}
