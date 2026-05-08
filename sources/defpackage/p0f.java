package defpackage;

import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.events.EventEmitterWrapper;
import com.facebook.react.uimanager.RootViewManager;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class p0f {
    public static final /* synthetic */ int o = 0;
    public mkf c;
    public zo7 f;
    public final vqg g;
    public RootViewManager h;
    public FabricUIManager.a i;
    public loe<Object> m;
    public final int n;
    public volatile boolean a = false;
    public volatile boolean b = false;
    public ConcurrentHashMap<Integer, b> d = new ConcurrentHashMap<>();
    public final ArrayDeque e = new ArrayDeque();
    public final HashSet j = new HashSet();
    public final HashSet k = new HashSet();
    public final HashSet l = new HashSet();

    public static class a {
        public final String a;
        public final boolean b;
        public final int c;
        public final WritableMap d;

        public a(String str, WritableMap writableMap, int i, boolean z) {
            this.a = str;
            this.d = writableMap;
            this.c = i;
            this.b = z;
        }
    }

    public p0f(int i, zo7 zo7Var, vqg vqgVar, RootViewManager rootViewManager, FabricUIManager.a aVar, mkf mkfVar) {
        this.n = i;
        this.f = zo7Var;
        this.g = vqgVar;
        this.h = rootViewManager;
        this.i = aVar;
        this.c = mkfVar;
    }

    public static void f(ViewGroup viewGroup, boolean z) {
        int id = viewGroup.getId();
        StringBuilder sbG = o6.g(id, "  <ViewGroup tag=", " class=");
        sbG.append(viewGroup.getClass().toString());
        sbG.append(">");
        s55.f("p0f", sbG.toString());
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            StringBuilder sbG2 = o6.g(i, "     <View idx=", " tag=");
            sbG2.append(viewGroup.getChildAt(i).getId());
            sbG2.append(" class=");
            sbG2.append(viewGroup.getChildAt(i).getClass().toString());
            sbG2.append(">");
            s55.f("p0f", sbG2.toString());
        }
        s55.f("p0f", "  </ViewGroup tag=" + id + ">");
        if (z) {
            s55.f("p0f", "Displaying Ancestors:");
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                StringBuilder sbG3 = o6.g(viewGroup2 == null ? -1 : viewGroup2.getId(), "<ViewParent tag=", " class=");
                sbG3.append(parent.getClass().toString());
                sbG3.append(">");
                s55.f("p0f", sbG3.toString());
            }
        }
    }

    public static void g(b bVar) {
        vse vseVar = bVar.f;
        if (vseVar != null) {
            vseVar.destroyState();
            bVar.f = null;
        }
        EventEmitterWrapper eventEmitterWrapper = bVar.g;
        if (eventEmitterWrapper != null) {
            eventEmitterWrapper.destroy();
            bVar.g = null;
        }
        ViewManager viewManager = bVar.d;
        if (bVar.c || viewManager == null) {
            return;
        }
        viewManager.onDropViewInstance(bVar.a);
    }

    public final void a(mkf mkfVar, View view) {
        this.c = mkfVar;
        if (this.a) {
            return;
        }
        this.d.put(Integer.valueOf(this.n), new b(this.n, view, this.h, true));
        mkf mkfVar2 = this.c;
        hh1.n(mkfVar2);
        n0f n0fVar = new n0f(this, mkfVar2, view);
        if (UiThreadUtil.isOnUiThread()) {
            n0fVar.run();
        } else {
            UiThreadUtil.runOnUiThread(n0fVar);
        }
    }

    public final void b(String str, int i, ReadableMap readableMap, vse vseVar, EventEmitterWrapper eventEmitterWrapper, boolean z) {
        Trace.beginSection(jpf.g("SurfaceMountingManager::createViewUnsafe(" + str + ")"));
        try {
            noc nocVar = new noc(readableMap);
            b bVar = new b(i);
            bVar.e = nocVar;
            bVar.f = vseVar;
            bVar.g = eventEmitterWrapper;
            this.d.put(Integer.valueOf(i), bVar);
            if (z) {
                ViewManager<?, ?> viewManagerA = this.g.a(str);
                bVar.a = viewManagerA.createView(i, this.c, nocVar, vseVar, this.f);
                bVar.d = viewManagerA;
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void c(int i) {
        UiThreadUtil.assertOnUiThread();
        if (this.a) {
            return;
        }
        b bVarD = d(i);
        if (bVarD == null) {
            ReactSoftExceptionLogger.logSoftException(ReactSoftExceptionLogger.Categories.SURFACE_MOUNTING_MANAGER_MISSING_VIEWSTATE, new ReactNoCrashSoftException(bg.d(i, "Unable to find viewState for tag: ", " for deleteView")));
        } else if (this.k.contains(Integer.valueOf(i))) {
            this.l.add(Integer.valueOf(i));
        } else {
            this.d.remove(Integer.valueOf(i));
            g(bVarD);
        }
    }

    public final b d(int i) {
        ConcurrentHashMap<Integer, b> concurrentHashMap = this.d;
        if (concurrentHashMap == null) {
            return null;
        }
        return concurrentHashMap.get(Integer.valueOf(i));
    }

    public final b e(int i) {
        b bVar = this.d.get(Integer.valueOf(i));
        if (bVar != null) {
            return bVar;
        }
        StringBuilder sbG = o6.g(i, "Unable to find viewState for tag ", ". Surface stopped: ");
        sbG.append(this.a);
        throw new RetryableMountingLayerException(sbG.toString());
    }

    public final void h(int i, int i2) {
        if (this.a) {
            return;
        }
        b bVarE = e(i);
        if (bVarE.d == null) {
            throw new RetryableMountingLayerException(p6.c(i, "Unable to find viewState manager for tag "));
        }
        View view = bVarE.a;
        if (view == null) {
            throw new RetryableMountingLayerException(p6.c(i, "Unable to find viewState view for tag "));
        }
        view.sendAccessibilityEvent(i2);
    }

    public final void i(int i, ReadableMap readableMap) {
        if (this.a) {
            return;
        }
        b bVarE = e(i);
        bVarE.e = new noc(readableMap);
        View view = bVarE.a;
        if (view == null) {
            r6.g(bg.d(i, "Unable to find view for tag [", "]"));
            return;
        }
        ViewManager viewManager = bVarE.d;
        hh1.n(viewManager);
        viewManager.updateProperties(view, bVarE.e);
    }

    public static class b {
        public View a;
        public final int b;
        public final boolean c;
        public ViewManager d;
        public noc e;
        public vse f;
        public EventEmitterWrapper g;
        public LinkedList h;

        public b(int i, View view, ViewManager viewManager, boolean z) {
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
            this.b = i;
            this.a = view;
            this.c = z;
            this.d = viewManager;
        }

        public final String toString() {
            return "ViewState [" + this.b + "] - isRoot: " + this.c + " - props: " + this.e + " - localData: null - viewManager: " + this.d + " - isLayoutOnly: " + (this.d == null);
        }

        public b(int i) {
            this(i, null, null, false);
        }
    }
}
