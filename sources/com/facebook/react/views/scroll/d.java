package com.facebook.react.views.scroll;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.scroll.f;
import defpackage.dmc;
import defpackage.kc9;
import defpackage.msb;
import defpackage.nn2;
import defpackage.pgb;
import defpackage.s55;
import defpackage.vse;
import defpackage.wjc;
import defpackage.z92;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class d {
    public static final CopyOnWriteArrayList<WeakReference<i>> a = new CopyOnWriteArrayList<>();
    public static final CopyOnWriteArrayList<WeakReference<f>> b = new CopyOnWriteArrayList<>();
    public static int c = 250;
    public static boolean d;

    public interface a {
        void d(int i, int i2);

        ValueAnimator getFlingAnimator();
    }

    public interface b {
        long getLastScrollDispatchTime();

        int getScrollEventThrottle();

        void setLastScrollDispatchTime(long j);
    }

    public interface c {
        h getReactScrollViewScrollState();
    }

    /* JADX INFO: renamed from: com.facebook.react.views.scroll.d$d, reason: collision with other inner class name */
    public interface InterfaceC0142d {
        void a(int i, int i2);

        void b(int i, int i2);
    }

    public interface e {
        vse getStateWrapper();
    }

    public interface f {
        void c(FrameLayout frameLayout);
    }

    public static final class g extends OverScroller {
        public int a;

        @Override // android.widget.OverScroller
        public final void startScroll(int i, int i2, int i3, int i4, int i5) {
            this.a = i5;
        }
    }

    public static final class h {
        public int b;
        public boolean d;
        public final Point a = new Point();
        public final Point c = new Point(-1, -1);
        public boolean e = true;
        public float f = 0.985f;
    }

    public interface i {
        void a(FrameLayout frameLayout);

        void d(ViewGroup viewGroup);
    }

    public static final void a(FrameLayout frameLayout) {
        Iterator<WeakReference<f>> it = b.iterator();
        it.getClass();
        while (it.hasNext()) {
            f fVar = it.next().get();
            if (fVar != null) {
                fVar.c(frameLayout);
            }
        }
    }

    public static final void b(FrameLayout frameLayout) {
        Iterator<WeakReference<i>> it = a.iterator();
        it.getClass();
        while (it.hasNext()) {
            i iVar = it.next().get();
            if (iVar != null) {
                iVar.a(frameLayout);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(ViewGroup viewGroup, com.facebook.react.views.scroll.g gVar, float f2, float f3) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.facebook.react.views.scroll.g gVar2 = com.facebook.react.views.scroll.g.d;
        if (gVar == gVar2) {
            if (r1.getScrollEventThrottle() >= Math.max(17L, jCurrentTimeMillis - ((b) viewGroup).getLastScrollDispatchTime())) {
                return;
            }
        }
        View childAt = viewGroup.getChildAt(0);
        if (childAt == null) {
            return;
        }
        Iterator it = z92.z1(a).iterator();
        while (it.hasNext()) {
            i iVar = (i) ((WeakReference) it.next()).get();
            if (iVar != null) {
                iVar.d(viewGroup);
            }
        }
        Context context = viewGroup.getContext();
        context.getClass();
        ReactContext reactContext = (ReactContext) context;
        int iG = dmc.g(reactContext);
        EventDispatcher eventDispatcherE = dmc.e(reactContext, viewGroup.getId());
        if (eventDispatcherE != null) {
            pgb<com.facebook.react.views.scroll.f> pgbVar = com.facebook.react.views.scroll.f.k;
            eventDispatcherE.a(f.a.a(iG, viewGroup.getId(), gVar, viewGroup.getScrollX(), viewGroup.getScrollY(), f2, f3, childAt.getWidth(), childAt.getHeight(), viewGroup.getWidth(), viewGroup.getHeight()));
            if (gVar == gVar2) {
                ((b) viewGroup).setLastScrollDispatchTime(jCurrentTimeMillis);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final View d(FrameLayout frameLayout, View view, int i2) {
        FabricUIManager fabricUIManager;
        Integer numFindNextFocusableElement;
        view.getClass();
        Context context = frameLayout.getContext();
        context.getClass();
        UIManager uIManagerJ = dmc.j((ReactContext) context, 2, true);
        if (uIManagerJ == null || (numFindNextFocusableElement = (fabricUIManager = (FabricUIManager) uIManagerJ).findNextFocusableElement(frameLayout.getId(), view.getId(), i2)) == null) {
            return null;
        }
        int iIntValue = numFindNextFocusableElement.intValue();
        int[] relativeAncestorList = fabricUIManager.getRelativeAncestorList(frameLayout.getChildAt(0).getId(), iIntValue);
        if (relativeAncestorList == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(kc9.V(relativeAncestorList.length));
        for (int i3 : relativeAncestorList) {
            linkedHashSet.add(Integer.valueOf(i3));
        }
        linkedHashSet.add(numFindNextFocusableElement);
        ((wjc) frameLayout).updateClippingRect(linkedHashSet);
        return frameLayout.findViewById(iIntValue);
    }

    public static final <T extends ViewGroup & c & e> void e(T t) {
        h reactScrollViewScrollState = t.getReactScrollViewScrollState();
        int i2 = reactScrollViewScrollState.b;
        Point point = reactScrollViewScrollState.c;
        int i3 = point.x;
        int i4 = point.y;
        vse stateWrapper = t.getStateWrapper();
        if (stateWrapper != null) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("contentOffsetLeft", nn2.C(i3));
            writableNativeMap.putDouble("contentOffsetTop", nn2.C(i4));
            writableNativeMap.putDouble("scrollAwayPaddingTop", nn2.C(i2));
            stateWrapper.updateState(writableNativeMap);
        }
    }

    public static final int f(Context context) {
        if (!d) {
            d = true;
            try {
                g gVar = new g(context);
                gVar.a = 250;
                gVar.startScroll(0, 0, 0, 0);
                c = gVar.a;
            } catch (Throwable unused) {
            }
        }
        return c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int g(FrameLayout frameLayout, int i2, int i3, int i4) {
        h reactScrollViewScrollState = ((c) frameLayout).getReactScrollViewScrollState();
        return (!reactScrollViewScrollState.e || (reactScrollViewScrollState.d && ((i3 - i2) * (i4 != 0 ? i4 / Math.abs(i4) : 0) > 0))) ? i3 : i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0028, code lost:
    
        if (r3.equals("auto") != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int h(java.lang.String r3) {
        /*
            r0 = 1
            if (r3 == 0) goto L41
            int r1 = r3.hashCode()
            r2 = -1414557169(0xffffffffabaf920f, float:-1.2475037E-12)
            if (r1 == r2) goto L2b
            r2 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r1 == r2) goto L22
            r2 = 104712844(0x63dca8c, float:3.5695757E-35)
            if (r1 == r2) goto L17
            goto L33
        L17:
            java.lang.String r1 = "never"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L20
            goto L33
        L20:
            r3 = 2
            return r3
        L22:
            java.lang.String r1 = "auto"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L33
            goto L41
        L2b:
            java.lang.String r1 = "always"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L3f
        L33:
            java.lang.String r1 = "wrong overScrollMode: "
            java.lang.String r3 = r1.concat(r3)
            java.lang.String r1 = "ReactNative"
            defpackage.s55.n(r1, r3)
            return r0
        L3f:
            r3 = 0
            return r3
        L41:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.scroll.d.h(java.lang.String):int");
    }

    public static final int i(String str) {
        if (str == null) {
            return 0;
        }
        if ("start".equalsIgnoreCase(str)) {
            return 1;
        }
        if ("center".equalsIgnoreCase(str)) {
            return 2;
        }
        if ("end".equals(str)) {
            return 3;
        }
        s55.n("ReactNative", "wrong snap alignment value: ".concat(str));
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Point j(FrameLayout frameLayout, int i2, int i3, int i4, int i5) {
        h reactScrollViewScrollState = ((c) frameLayout).getReactScrollViewScrollState();
        OverScroller overScroller = new OverScroller(frameLayout.getContext());
        overScroller.setFriction(1.0f - reactScrollViewScrollState.f);
        int width = (frameLayout.getWidth() - frameLayout.getPaddingStart()) - frameLayout.getPaddingEnd();
        int height = (frameLayout.getHeight() - frameLayout.getPaddingBottom()) - frameLayout.getPaddingTop();
        Point point = reactScrollViewScrollState.a;
        overScroller.fling(g(frameLayout, frameLayout.getScrollX(), point.x, i2), g(frameLayout, frameLayout.getScrollY(), point.y, i3), i2, i3, 0, i4, 0, i5, width / 2, height / 2);
        return new Point(overScroller.getFinalX(), overScroller.getFinalY());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void k(FrameLayout frameLayout, int i2, int i3) {
        a aVar = (a) frameLayout;
        ValueAnimator flingAnimator = aVar.getFlingAnimator();
        if (flingAnimator.getListeners() == null || flingAnimator.getListeners().size() == 0) {
            aVar.getFlingAnimator().addListener(new com.facebook.react.views.scroll.e(frameLayout));
        }
        ((c) frameLayout).getReactScrollViewScrollState().a.set(i2, i3);
        int scrollX = frameLayout.getScrollX();
        int scrollY = frameLayout.getScrollY();
        if (scrollX != i2) {
            aVar.d(scrollX, i2);
        }
        if (scrollY != i3) {
            aVar.d(scrollY, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends ViewGroup & a & c & e> void l(T t) {
        m(t, t.getScrollX(), t.getScrollY());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void m(ViewGroup viewGroup, int i2, int i3) {
        if (msb.e(viewGroup.getId()) == 1 || ((e) viewGroup).getStateWrapper() == null) {
            return;
        }
        h reactScrollViewScrollState = ((c) viewGroup).getReactScrollViewScrollState();
        if (reactScrollViewScrollState.c.equals(i2, i3)) {
            return;
        }
        reactScrollViewScrollState.c.set(i2, i3);
        e(viewGroup);
    }
}
