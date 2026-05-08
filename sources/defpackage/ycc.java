package defpackage;

import android.util.SparseArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.swmansion.gesturehandler.core.GestureHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class ycc {
    public final SparseArray<int[]> a = new SparseArray<>();
    public final SparseArray<int[]> b = new SparseArray<>();
    public final SparseArray<int[]> c = new SparseArray<>();

    public static int[] b(ReadableMap readableMap, String str) {
        ReadableArray array = readableMap.getArray(str);
        array.getClass();
        int size = array.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = array.getInt(i);
        }
        return iArr;
    }

    public final void a(GestureHandler gestureHandler, ReadableMap readableMap) {
        readableMap.getClass();
        gestureHandler.C = this;
        if (readableMap.hasKey("waitFor")) {
            this.a.put(gestureHandler.d, b(readableMap, "waitFor"));
        }
        if (readableMap.hasKey("simultaneousHandlers")) {
            this.b.put(gestureHandler.d, b(readableMap, "simultaneousHandlers"));
        }
        if (readableMap.hasKey("blocksHandlers")) {
            this.c.put(gestureHandler.d, b(readableMap, "blocksHandlers"));
        }
    }
}
