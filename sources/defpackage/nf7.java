package defpackage;

import android.view.View;
import com.facebook.react.bridge.LifecycleEventListener;
import defpackage.epg;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class nf7 implements tpa, LifecycleEventListener {
    public static boolean d;
    public static boolean e;
    public static final nf7 a = new nf7();
    public static final HashSet<tpa> b = new HashSet<>();
    public static WeakReference<View> c = new WeakReference<>(null);
    public static final boolean f = true;

    public final void a(View view) {
        if (!d || c.get() == null) {
            WeakHashMap<View, prg> weakHashMap = epg.a;
            epg.d.m(view, this);
            c = new WeakReference<>(view);
            d = true;
        }
    }

    @Override // defpackage.tpa
    public final rzg b(View view, rzg rzgVar) {
        view.getClass();
        rzg rzgVarI = f ? epg.i(view, rzgVar) : rzgVar;
        Iterator<tpa> it = b.iterator();
        while (it.hasNext()) {
            rzgVarI = it.next().b(view, rzgVar);
            rzgVarI.getClass();
        }
        return rzgVarI;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostDestroy() {
        View view = c.get();
        if (d && view != null) {
            WeakHashMap<View, prg> weakHashMap = epg.a;
            epg.d.m(view, null);
            d = false;
            c.clear();
        }
        e = false;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public final void onHostResume() {
    }
}
