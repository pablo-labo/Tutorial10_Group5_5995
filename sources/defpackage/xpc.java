package defpackage;

import android.graphics.Rect;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.facebook.react.views.scroll.b;
import com.facebook.react.views.scroll.c;
import com.facebook.react.views.scroll.d;
import com.indeed.android.jobsearch.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class xpc extends tpc implements d.i, d.f, View.OnLayoutChangeListener {
    public final wpc V;
    public ViewGroup W;
    public wsg a;
    public final Rect a0;
    public ysg b;
    public final Rect b0;
    public bx9 c;
    public final Rect c0;
    public double d;
    public int d0;
    public final boolean e;
    public int e0;
    public final boolean f;
    public boolean f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v4, types: [wpc] */
    public xpc(mkf mkfVar) {
        super(mkfVar);
        mkfVar.getClass();
        this.b = ysg.Unknown;
        qmc qmcVar = ie7.g0;
        this.d = qmcVar.virtualViewPrerenderRatio();
        this.e = qmcVar.enableVirtualViewDebugFeatures();
        this.f = qmcVar.enableVirtualViewWindowFocusDetection();
        this.V = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: wpc
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z) {
                this.a.g(false);
            }
        };
        this.a0 = new Rect();
        this.b0 = new Rect();
        this.c0 = new Rect();
    }

    private final ViewGroup getParentScrollView() {
        return i(true);
    }

    public static boolean h(Rect rect, Rect rect2) {
        return rect.top < rect2.bottom && rect2.top < rect.bottom && rect.left < rect2.right && rect2.left < rect.right;
    }

    @Override // com.facebook.react.views.scroll.d.i
    public final void a(FrameLayout frameLayout) {
        if (frameLayout.equals(this.W)) {
            g(false);
        }
    }

    @Override // com.facebook.react.views.scroll.d.f
    public final void c(FrameLayout frameLayout) {
        if (frameLayout.equals(this.W)) {
            this.f0 = true;
            g(false);
        }
    }

    @Override // com.facebook.react.views.scroll.d.i
    public final void d(ViewGroup viewGroup) {
        if (viewGroup.equals(this.W)) {
            g(false);
        }
    }

    public final void g(boolean z) {
        ViewGroup viewGroup;
        String str;
        Rect rect;
        boolean zH;
        wsg wsgVar;
        bx9 bx9Var;
        bx9 bx9Var2;
        if (this.c == null || (viewGroup = this.W) == null) {
            return;
        }
        if (this.f0) {
            this.d0 = 0;
            this.e0 = 0;
            this.f0 = false;
            for (ViewParent parent = getParent(); parent != null && !parent.equals(viewGroup); parent = parent.getParent()) {
                if (parent instanceof View) {
                    View view = (View) parent;
                    this.d0 = view.getLeft() + this.d0;
                    this.e0 = view.getTop() + this.e0;
                }
            }
        }
        int left = getLeft() + this.d0;
        int top = getTop() + this.e0;
        int right = getRight() + this.d0;
        int bottom = getBottom() + this.e0;
        Rect rect2 = this.b0;
        rect2.set(left, top, right, bottom);
        Rect rect3 = this.c0;
        viewGroup.getDrawingRect(rect3);
        if ((rect2.width() == 0 && rect2.height() == 0) || rect3.isEmpty()) {
            if (getDebugLogEnabled$ReactAndroid_release()) {
                String strL = t40.l("empty rects target=", rect2.toShortString(), " threshold=", rect3.toShortString());
                s55.n("ReactVirtualView:dispatchOnModeChangeIfNeeded", ((Object) strL) + " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
                return;
            }
            return;
        }
        if (z) {
            Rect rect4 = this.a0;
            if (!rect4.isEmpty() && rect4.equals(rect2)) {
                if (getDebugLogEnabled$ReactAndroid_release()) {
                    s55.n("ReactVirtualView:dispatchOnModeChangeIfNeeded", "no rect change [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
                    return;
                }
                return;
            }
            rect4.set(rect2);
        }
        boolean zH2 = h(rect2, rect3);
        wsg wsgVar2 = wsg.Hidden;
        wsg wsgVar3 = wsg.Prerender;
        wsg wsgVar4 = wsg.Visible;
        if (zH2) {
            if (!this.f || hasWindowFocus()) {
                str = " threshold=";
                wsgVar = wsgVar4;
            } else {
                str = " threshold=";
                wsgVar = wsgVar3;
            }
            rect = rect3;
        } else {
            if (this.d > 0.0d) {
                str = " threshold=";
                rect = rect3;
                rect.inset((int) (((double) (-rect3.width())) * this.d), (int) (((double) (-rect3.height())) * this.d));
                zH = h(rect2, rect);
            } else {
                str = " threshold=";
                rect = rect3;
                zH = false;
            }
            if (zH) {
                wsgVar = wsgVar3;
            } else {
                rect.setEmpty();
                wsgVar = wsgVar2;
            }
        }
        if (getDebugLogEnabled$ReactAndroid_release()) {
            String str2 = "mode=" + this.a + " target=" + rect2.toShortString() + str + rect.toShortString();
            s55.n("ReactVirtualView:dispatchOnModeChangeIfNeeded", ((Object) str2) + " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
        }
        wsg wsgVar5 = this.a;
        if (wsgVar == wsgVar5) {
            return;
        }
        this.a = wsgVar;
        if (getDebugLogEnabled$ReactAndroid_release()) {
            int id = getId();
            String nativeId$ReactAndroid_release = getNativeId$ReactAndroid_release();
            s55.n("ReactVirtualView:Mode change", ((Object) (wsgVar5 + "->" + wsgVar)) + " [" + id + "][" + nativeId$ReactAndroid_release + "]");
        }
        Trace.beginSection(jpf.g("VirtualView::mode change " + wsgVar5 + " -> " + wsgVar + ", nativeID=" + getNativeId$ReactAndroid_release()));
        int iOrdinal = wsgVar.ordinal();
        if (iOrdinal == 0) {
            ysg ysgVar = this.b;
            if (ysgVar == ysg.Unknown) {
                bx9 bx9Var3 = this.c;
                if (bx9Var3 != null) {
                    bx9Var3.a(wsgVar4, rect2, rect, true);
                }
            } else if ((wsgVar5 != wsgVar3 || ysgVar != ysg.Rendered) && (bx9Var = this.c) != null) {
                bx9Var.a(wsgVar4, rect2, rect, true);
            }
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                l.g();
                return;
            } else {
                bx9 bx9Var4 = this.c;
                if (bx9Var4 != null) {
                    bx9Var4.a(wsgVar2, rect2, rect, false);
                }
            }
        } else if (wsgVar5 != wsgVar4 && (bx9Var2 = this.c) != null) {
            bx9Var2.a(wsgVar3, rect2, rect, false);
        }
        Trace.endSection();
    }

    public final boolean getDebugLogEnabled$ReactAndroid_release() {
        return this.e;
    }

    public final boolean getDetectWindowFocus$ReactAndroid_release() {
        return this.f;
    }

    public final wsg getMode$ReactAndroid_release() {
        return this.a;
    }

    public final bx9 getModeChangeEmitter$ReactAndroid_release() {
        return this.c;
    }

    public final String getNativeId$ReactAndroid_release() {
        Object tag = getTag(R.id.view_tag_native_id);
        if (tag instanceof String) {
            return (String) tag;
        }
        return null;
    }

    public final double getPrerenderRatio$ReactAndroid_release() {
        return this.d;
    }

    public final ysg getRenderState$ReactAndroid_release() {
        return this.b;
    }

    public final ViewGroup i(boolean z) {
        ViewParent parent = getParent();
        while (parent != null) {
            if (!(parent instanceof c) && !(parent instanceof b)) {
                if (parent instanceof vnc) {
                    return null;
                }
                if (parent instanceof View) {
                    View view = (View) parent;
                    view.removeOnLayoutChangeListener(this);
                    if (z) {
                        view.addOnLayoutChangeListener(this);
                    }
                }
                parent = parent.getParent();
            }
            return (ViewGroup) parent;
        }
        return null;
    }

    @Override // defpackage.tpc, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewGroup parentScrollView = getParentScrollView();
        if (parentScrollView != null) {
            this.f0 = true;
            d.a.add(new WeakReference<>(this));
            d.b.add(new WeakReference<>(this));
        } else {
            parentScrollView = null;
        }
        this.W = parentScrollView;
        if (getDebugLogEnabled$ReactAndroid_release()) {
            s55.n("ReactVirtualView:onAttachedToWindow", " [" + getId() + "][" + getNativeId$ReactAndroid_release() + "]");
        }
        if (this.f) {
            getViewTreeObserver().addOnWindowFocusChangeListener(this.V);
        }
        g(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d.a.removeIf(new hoc(new wi(this, 10)));
        d.b.removeIf(new ioc(new hg(this, 6)));
        if (this.f) {
            getViewTreeObserver().addOnWindowFocusChangeListener(this.V);
        }
        i(false);
    }

    @Override // defpackage.tpc, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            this.f0 = true;
            g(false);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f0 = (!this.f0 && i5 == i && i6 == i2) ? false : true;
        g(true);
    }

    @Override // defpackage.tpc
    public final void recycleView$ReactAndroid_release() {
        d.a.removeIf(new hoc(new wi(this, 10)));
        d.b.removeIf(new ioc(new hg(this, 6)));
        i(false);
        this.a = null;
        this.c = null;
        this.a0.setEmpty();
        this.W = null;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = false;
    }

    public final void setMode$ReactAndroid_release(wsg wsgVar) {
        this.a = wsgVar;
    }

    public final void setModeChangeEmitter$ReactAndroid_release(bx9 bx9Var) {
        this.c = bx9Var;
    }

    public final void setPrerenderRatio$ReactAndroid_release(double d) {
        this.d = d;
    }

    public final void setRenderState$ReactAndroid_release(ysg ysgVar) {
        ysgVar.getClass();
        this.b = ysgVar;
    }
}
