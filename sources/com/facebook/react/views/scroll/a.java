package com.facebook.react.views.scroll;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.views.scroll.d;
import com.facebook.react.views.scroll.d.InterfaceC0142d;
import defpackage.aj6;
import defpackage.dmc;
import defpackage.msb;
import defpackage.r6;
import defpackage.tpc;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class a<ScrollViewT extends ViewGroup & d.InterfaceC0142d> implements UIManagerListener {
    public final FrameLayout a;
    public final boolean b;
    public C0141a c;
    public WeakReference<View> d;
    public Rect e;
    public boolean f;

    /* JADX INFO: renamed from: com.facebook.react.views.scroll.a$a, reason: collision with other inner class name */
    public static final class C0141a {
        public final int a;
        public final Integer b;

        public C0141a(int i, Integer num) {
            this.a = i;
            this.b = num;
        }
    }

    public a(FrameLayout frameLayout, boolean z) {
        this.a = frameLayout;
        this.b = z;
    }

    public final void a() {
        float y;
        int height;
        C0141a c0141a = this.c;
        if (c0141a == null) {
            return;
        }
        FrameLayout frameLayout = this.a;
        tpc tpcVar = (tpc) frameLayout.getChildAt(0);
        if (tpcVar == null) {
            return;
        }
        boolean z = this.b;
        int scrollX = z ? frameLayout.getScrollX() : frameLayout.getScrollY();
        int childCount = tpcVar.getChildCount();
        for (int i = c0141a.a; i < childCount; i++) {
            View childAt = tpcVar.getChildAt(i);
            if (z) {
                y = childAt.getX();
                height = childAt.getWidth();
            } else {
                y = childAt.getY();
                height = childAt.getHeight();
            }
            if (y + height > scrollX || i == tpcVar.getChildCount() - 1) {
                this.d = new WeakReference<>(childAt);
                Rect rect = new Rect();
                childAt.getHitRect(rect);
                this.e = rect;
                return;
            }
        }
    }

    public final UIManager b() {
        FrameLayout frameLayout = this.a;
        ReactContext reactContext = (ReactContext) frameLayout.getContext();
        if (reactContext == null) {
            r6.g("Required value was null.");
            return null;
        }
        UIManager uIManagerJ = dmc.j(reactContext, msb.e(frameLayout.getId()), true);
        if (uIManagerJ != null) {
            return uIManagerJ;
        }
        r6.g("Required value was null.");
        return null;
    }

    public final void c() {
        if (this.f) {
            return;
        }
        this.f = true;
        b().addUIManagerEventListener(this);
    }

    public final void d() {
        if (this.f) {
            this.f = false;
            b().removeUIManagerEventListener(this);
        }
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public final void didDispatchMountItems(UIManager uIManager) {
        uIManager.getClass();
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public final void didMountItems(UIManager uIManager) {
        uIManager.getClass();
        e();
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public final void didScheduleMountItems(UIManager uIManager) {
        uIManager.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e() {
        Rect rect;
        View view;
        C0141a c0141a = this.c;
        if (c0141a == null) {
            return;
        }
        Integer num = c0141a.b;
        WeakReference<View> weakReference = this.d;
        if (weakReference == null || (rect = this.e) == null || (view = weakReference.get()) == null) {
            return;
        }
        Rect rect2 = new Rect();
        view.getHitRect(rect2);
        boolean z = this.b;
        FrameLayout frameLayout = this.a;
        if (z) {
            int i = rect2.left - rect.left;
            if (i != 0) {
                int scrollX = frameLayout.getScrollX();
                d.InterfaceC0142d interfaceC0142d = (d.InterfaceC0142d) frameLayout;
                interfaceC0142d.a(i + scrollX, frameLayout.getScrollY());
                this.e = rect2;
                if (num == null || scrollX > num.intValue()) {
                    return;
                }
                interfaceC0142d.b(0, frameLayout.getScrollY());
                return;
            }
            return;
        }
        int i2 = rect2.top - rect.top;
        if (i2 != 0) {
            int scrollY = frameLayout.getScrollY();
            d.InterfaceC0142d interfaceC0142d2 = (d.InterfaceC0142d) frameLayout;
            interfaceC0142d2.a(frameLayout.getScrollX(), i2 + scrollY);
            this.e = rect2;
            if (num == null || scrollY > num.intValue()) {
                return;
            }
            interfaceC0142d2.b(frameLayout.getScrollX(), 0);
        }
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public final void willDispatchViewUpdates(UIManager uIManager) {
        uIManager.getClass();
        UiThreadUtil.runOnUiThread(new aj6(this, 2));
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public final void willMountItems(UIManager uIManager) {
        uIManager.getClass();
        a();
    }
}
