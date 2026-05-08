package defpackage;

import android.util.SparseArray;
import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import com.swmansion.gesturehandler.core.GestureHandler;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class bdc {
    public final SparseArray<GestureHandler> a = new SparseArray<>();
    public final SparseArray<Integer> b = new SparseArray<>();
    public final SparseArray<ArrayList<GestureHandler>> c = new SparseArray<>();

    public final synchronized boolean a(int i, int i2, int i3) {
        boolean z;
        GestureHandler gestureHandler = this.a.get(i);
        if (gestureHandler != null) {
            b(gestureHandler);
            gestureHandler.k = i3;
            f(i2, gestureHandler);
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final synchronized void b(GestureHandler gestureHandler) {
        try {
            Integer num = this.b.get(gestureHandler.d);
            if (num != null) {
                this.b.remove(gestureHandler.d);
                ArrayList<GestureHandler> arrayList = this.c.get(num.intValue());
                if (arrayList != null) {
                    synchronized (arrayList) {
                        arrayList.remove(gestureHandler);
                    }
                    if (arrayList.size() == 0) {
                        this.c.remove(num.intValue());
                    }
                }
            }
            if (gestureHandler.e != null) {
                UiThreadUtil.runOnUiThread(new pn0(gestureHandler, 3));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(int i) {
        GestureHandler gestureHandler = this.a.get(i);
        if (gestureHandler != null) {
            b(gestureHandler);
            this.a.remove(i);
        }
    }

    public final synchronized GestureHandler d(int i) {
        return this.a.get(i);
    }

    public final synchronized ArrayList<GestureHandler> e(View view) {
        ArrayList<GestureHandler> arrayList;
        int id = view.getId();
        synchronized (this) {
            arrayList = this.c.get(id);
        }
        return arrayList;
        return arrayList;
    }

    public final synchronized void f(int i, GestureHandler gestureHandler) {
        try {
            if (this.b.get(gestureHandler.d) != null) {
                throw new IllegalStateException(("Handler " + gestureHandler + " already attached").toString());
            }
            this.b.put(gestureHandler.d, Integer.valueOf(i));
            ArrayList<GestureHandler> arrayList = this.c.get(i);
            if (arrayList == null) {
                ArrayList<GestureHandler> arrayList2 = new ArrayList<>(1);
                arrayList2.add(gestureHandler);
                this.c.put(i, arrayList2);
            } else {
                synchronized (arrayList) {
                    arrayList.add(gestureHandler);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
