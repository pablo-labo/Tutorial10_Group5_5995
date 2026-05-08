package defpackage;

import android.view.View;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.rzg;
import defpackage.wle;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class xzg {
    public static final WeakHashMap<View, xzg> v = new WeakHashMap<>();
    public final ub0 a = a.a(4, "captionBar");
    public final ub0 b;
    public final ub0 c;
    public final ub0 d;
    public final ub0 e;
    public final ub0 f;
    public final ub0 g;
    public final ub0 h;
    public final ub0 i;
    public final plg j;
    public final g6g k;
    public final plg l;
    public final plg m;
    public final plg n;
    public final plg o;
    public final plg p;
    public final plg q;
    public final plg r;
    public final boolean s;
    public int t;
    public final mf7 u;

    public static final class a {
        public static final ub0 a(int i, String str) {
            WeakHashMap<View, xzg> weakHashMap = xzg.v;
            return new ub0(i, str);
        }

        public static final plg b(int i, String str) {
            WeakHashMap<View, xzg> weakHashMap = xzg.v;
            return new plg(new rf7(0, 0, 0, 0), str);
        }

        public static xzg c(b bVar) {
            xzg xzgVar;
            View view = (View) bVar.M(AndroidCompositionLocals_androidKt.f);
            WeakHashMap<View, xzg> weakHashMap = xzg.v;
            synchronized (weakHashMap) {
                try {
                    xzg xzgVar2 = weakHashMap.get(view);
                    if (xzgVar2 == null) {
                        xzgVar2 = new xzg(view);
                        weakHashMap.put(view, xzgVar2);
                    }
                    xzgVar = xzgVar2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            boolean zX = bVar.x(xzgVar) | bVar.x(view);
            Object objV = bVar.v();
            if (zX || objV == b.a.a) {
                objV = new wi1(8, xzgVar, view);
                bVar.p(objV);
            }
            to4.b(xzgVar, (Function1) objV, bVar);
            return xzgVar;
        }
    }

    public xzg(View view) {
        ub0 ub0VarA = a.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, "displayCutout");
        this.b = ub0VarA;
        ub0 ub0VarA2 = a.a(8, "ime");
        this.c = ub0VarA2;
        ub0 ub0VarA3 = a.a(32, "mandatorySystemGestures");
        this.d = ub0VarA3;
        this.e = a.a(2, "navigationBars");
        this.f = a.a(1, "statusBars");
        ub0 ub0VarA4 = a.a(7, "systemBars");
        this.g = ub0VarA4;
        ub0 ub0VarA5 = a.a(16, "systemGestures");
        this.h = ub0VarA5;
        ub0 ub0VarA6 = a.a(64, "tappableElement");
        this.i = ub0VarA6;
        plg plgVar = new plg(new rf7(0, 0, 0, 0), "waterfall");
        this.j = plgVar;
        this.k = new g6g(new g6g(ub0VarA4, ub0VarA2), ub0VarA);
        new g6g(new g6g(new g6g(ub0VarA6, ub0VarA3), ub0VarA5), plgVar);
        this.l = a.b(4, "captionBarIgnoringVisibility");
        this.m = a.b(2, "navigationBarsIgnoringVisibility");
        this.n = a.b(1, "statusBarsIgnoringVisibility");
        this.o = a.b(7, "systemBarsIgnoringVisibility");
        this.p = a.b(64, "tappableElementIgnoringVisibility");
        this.q = a.b(8, "imeAnimationTarget");
        this.r = a.b(8, "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.s = bool != null ? bool.booleanValue() : false;
        this.u = new mf7(this);
    }

    public static void a(xzg xzgVar, rzg rzgVar) {
        xzgVar.a.f(rzgVar, 0);
        xzgVar.c.f(rzgVar, 0);
        xzgVar.b.f(rzgVar, 0);
        xzgVar.e.f(rzgVar, 0);
        xzgVar.f.f(rzgVar, 0);
        xzgVar.g.f(rzgVar, 0);
        xzgVar.h.f(rzgVar, 0);
        xzgVar.i.f(rzgVar, 0);
        xzgVar.d.f(rzgVar, 0);
        plg plgVar = xzgVar.l;
        rzg.j jVar = rzgVar.a;
        plgVar.f(e0h.a(jVar.h(4)));
        xzgVar.m.f(e0h.a(jVar.h(2)));
        xzgVar.n.f(e0h.a(jVar.h(1)));
        xzgVar.o.f(e0h.a(jVar.h(7)));
        xzgVar.p.f(e0h.a(jVar.h(64)));
        b74 b74VarF = jVar.f();
        if (b74VarF != null) {
            xzgVar.j.f(e0h.a(b74VarF.a()));
        }
        wle.e.getClass();
        wle.a.f();
    }
}
