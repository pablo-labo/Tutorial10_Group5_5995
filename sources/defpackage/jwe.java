package defpackage;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class jwe extends hd0 {
    public final d9a e;
    public final hb9 f;

    public jwe(ReadableMap readableMap, d9a d9aVar) {
        this.e = d9aVar;
        ReadableMap map = readableMap.getMap("style");
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map != null ? map.keySetIterator() : null;
        hb9 hb9Var = new hb9();
        while (readableMapKeySetIteratorKeySetIterator != null && readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            hb9Var.put(strNextKey, Integer.valueOf(map.getInt(strNextKey)));
        }
        this.f = hb9Var.j();
    }

    @Override // defpackage.hd0
    public final String d() {
        return "StyleAnimatedNode[" + this.d + "] mPropMapping: " + this.f;
    }
}
