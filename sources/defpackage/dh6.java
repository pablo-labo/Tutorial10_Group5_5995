package defpackage;

import android.util.SparseArray;
import com.facebook.react.bridge.ReactContext;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class dh6 {
    public static final WeakHashMap<ReactContext, dh6> e = new WeakHashMap<>();
    public final CopyOnWriteArraySet a;
    public final CopyOnWriteArraySet b;
    public final ConcurrentHashMap c;
    public final SparseArray<Runnable> d;

    public static final class a {
        public static dh6 a(ReactContext reactContext) {
            WeakHashMap<ReactContext, dh6> weakHashMap = dh6.e;
            dh6 dh6Var = weakHashMap.get(reactContext);
            if (dh6Var == null) {
                dh6Var = new dh6(reactContext);
                weakHashMap.put(reactContext, dh6Var);
            }
            return dh6Var;
        }
    }

    public dh6(ReactContext reactContext) {
        new WeakReference(reactContext);
        this.a = new CopyOnWriteArraySet();
        new AtomicInteger(0);
        this.b = new CopyOnWriteArraySet();
        this.c = new ConcurrentHashMap();
        this.d = new SparseArray<>();
    }
}
