package com.swmansion.rnscreens;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.swmansion.rnscreens.a;
import defpackage.akb;
import defpackage.dmc;
import defpackage.h42;
import defpackage.ird;
import defpackage.m6;
import defpackage.mkf;
import defpackage.pc4;
import defpackage.pxf;
import defpackage.r6;
import defpackage.sqd;
import defpackage.t92;
import defpackage.u63;
import defpackage.wqd;
import defpackage.z92;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends com.swmansion.rnscreens.b {
    public final ArrayList<wqd> W;
    public final HashSet a0;
    public List<? extends sqd> b0;
    public final ArrayList c0;
    public ArrayList d0;
    public wqd e0;
    public boolean f0;
    public h42 g0;
    public final ArrayList h0;
    public boolean i0;

    public final class a {
        public Canvas a;
        public View b;
        public long c;

        public a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.d.values().length];
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public d(mkf mkfVar) {
        super(mkfVar);
        this.W = new ArrayList<>();
        this.a0 = new HashSet();
        this.b0 = new ArrayList();
        this.c0 = new ArrayList();
        this.d0 = new ArrayList();
        this.h0 = new ArrayList();
    }

    @Override // com.swmansion.rnscreens.b
    public final sqd a(com.swmansion.rnscreens.a aVar) {
        aVar.getClass();
        return b.a[aVar.getStackPresentation().ordinal()] == 1 ? new e(aVar) : new e(aVar);
    }

    @Override // com.swmansion.rnscreens.b
    public final boolean c(sqd sqdVar) {
        return z92.I0(this.a, sqdVar) && !z92.I0(this.a0, sqdVar);
    }

    @Override // com.swmansion.rnscreens.b
    public final void d() {
        Iterator<T> it = this.W.iterator();
        while (it.hasNext()) {
            ((wqd) it.next()).p();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        super.dispatchDraw(canvas);
        h42 h42Var = this.g0;
        if (h42Var != null) {
            h42Var.a(this.d0);
        }
        ArrayList<a> arrayList = this.d0;
        this.d0 = new ArrayList();
        for (a aVar : arrayList) {
            d dVar = d.this;
            Canvas canvas2 = aVar.a;
            canvas2.getClass();
            super.drawChild(canvas2, aVar.b, aVar.c);
            aVar.a = null;
            aVar.b = null;
            aVar.c = 0L;
            this.c0.add(aVar);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.getClass();
        view.getClass();
        ArrayList arrayList = this.d0;
        ArrayList arrayList2 = this.c0;
        a aVar = arrayList2.isEmpty() ? new a() : (a) arrayList2.remove(u63.J(arrayList2));
        aVar.a = canvas;
        aVar.b = view;
        aVar.c = j;
        arrayList.add(aVar);
        return true;
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        h42 h42Var;
        view.getClass();
        super.endViewTransition(view);
        ArrayList arrayList = this.h0;
        arrayList.remove(view);
        if (arrayList.isEmpty() && (h42Var = this.g0) != null) {
            h42Var.a = false;
        }
        if (this.f0) {
            this.f0 = false;
            j();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0386 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0045  */
    /* JADX WARN: Type inference failed for: r5v2, types: [T, java.lang.Object] */
    @Override // com.swmansion.rnscreens.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instruction units count: 974
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.d.f():void");
    }

    public final ArrayList<wqd> getFragments() {
        return this.W;
    }

    public final boolean getGoingForward() {
        return this.i0;
    }

    public final com.swmansion.rnscreens.a getRootScreen() {
        sqd next;
        Iterator<sqd> it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!z92.I0(this.a0, next)) {
                break;
            }
        }
        sqd sqdVar = next;
        if (sqdVar != null) {
            return sqdVar.l();
        }
        r6.g("[RNScreens] Stack has no root screen set");
        return null;
    }

    public final List<String> getScreenIds() {
        ArrayList<sqd> arrayList = this.a;
        ArrayList arrayList2 = new ArrayList(t92.r0(arrayList, 10));
        Iterator<sqd> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().l().getScreenId());
        }
        return arrayList2;
    }

    @Override // com.swmansion.rnscreens.b
    public com.swmansion.rnscreens.a getTopScreen() {
        wqd wqdVar = this.e0;
        if (wqdVar != null) {
            return wqdVar.l();
        }
        return null;
    }

    @Override // com.swmansion.rnscreens.b
    public final void h() {
        this.a0.clear();
        super.h();
    }

    @Override // com.swmansion.rnscreens.b
    public final void i(int i) {
        sqd sqdVar = this.a.get(i);
        sqdVar.getClass();
        pxf.a(this.a0).remove(sqdVar);
        super.i(i);
    }

    public final void j() {
        int iH = dmc.h(this);
        Context context = getContext();
        context.getClass();
        EventDispatcher eventDispatcherE = dmc.e((ReactContext) context, getId());
        if (eventDispatcherE != null) {
            eventDispatcherE.a(new pc4(iH, getId(), 2));
        }
    }

    public final void setGoingForward(boolean z) {
        this.i0 = z;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        h42 h42Var;
        view.getClass();
        if (!(view instanceof ird)) {
            akb.n(m6.f(view.getClass(), "[RNScreens] Unexpected type of ScreenStack direct subview "));
            return;
        }
        super.startViewTransition(view);
        boolean zIsRemoving = ((ird) view).getFragment$react_native_screens_release().isRemoving();
        ArrayList arrayList = this.h0;
        if (zIsRemoving) {
            arrayList.add(view);
        }
        if (!arrayList.isEmpty() && (h42Var = this.g0) != null) {
            h42Var.a = true;
        }
        this.f0 = true;
    }
}
