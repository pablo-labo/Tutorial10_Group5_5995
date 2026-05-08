package defpackage;

import android.os.SystemClock;
import android.os.Trace;
import android.util.SparseBooleanArray;
import android.view.View;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.views.view.ReactViewManager;
import com.facebook.yoga.a;
import defpackage.ybe;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class k0g {
    public final Object a;
    public final ay4 b;
    public final ReactApplicationContext c;
    public final ybe d;
    public final vqg e;
    public final e4g f;
    public final iaa g;
    public final int[] h;
    public long i;
    public volatile boolean j;

    public k0g(ReactApplicationContext reactApplicationContext, vqg vqgVar, ay4 ay4Var, int i) {
        e4g e4gVar = new e4g(reactApplicationContext, new haa(vqgVar), i);
        this.a = new Object();
        ybe ybeVar = new ybe();
        this.d = ybeVar;
        this.h = new int[4];
        this.i = 0L;
        this.j = true;
        this.c = reactApplicationContext;
        this.e = vqgVar;
        this.f = e4gVar;
        this.g = new iaa(e4gVar, ybeVar);
        this.b = ay4Var;
    }

    public final void a(koc kocVar, float f, float f2, ArrayList arrayList) {
        if (kocVar.f()) {
            if (kocVar.O(f, f2) && kocVar.P()) {
                int iB = kocVar.B();
                ybe ybeVar = this.d;
                ybeVar.c.a();
                if (!ybeVar.b.get(iB)) {
                    arrayList.add(kocVar);
                }
            }
            ArrayList arrayListZ = kocVar.z();
            if (arrayListZ != null) {
                Iterator it = arrayListZ.iterator();
                while (it.hasNext()) {
                    a((koc) it.next(), kocVar.s() + f, kocVar.p() + f2, arrayList);
                }
            }
            e4g e4gVar = this.f;
            iaa iaaVar = this.g;
            kocVar.y(f, f2, e4gVar, iaaVar);
            kocVar.b();
            iaaVar.c.clear();
        }
    }

    public final void b(koc kocVar) {
        NativeModule nativeModuleA = this.e.a(kocVar.n());
        if (!(nativeModuleA instanceof wo6)) {
            throw new IllegalViewOperationException("Trying to use view " + kocVar.n() + " as a parent, but its Manager doesn't extends ViewGroupManager");
        }
        if (((wo6) nativeModuleA).needsCustomLayoutForChildren()) {
            throw new IllegalViewOperationException("Trying to measure a view using measureLayout/measureLayoutRelativeToParent relative to an ancestor that requires custom layout for it's children (" + kocVar.n() + "). Use measure instead.");
        }
    }

    public final void c(koc kocVar) {
        i3f i3fVar = new i3f("cssRoot.calculateLayout");
        i3fVar.R("rootTag", String.valueOf(kocVar.B()));
        i3fVar.T();
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            int iIntValue = kocVar.getWidthMeasureSpec().intValue();
            int iIntValue2 = kocVar.getHeightMeasureSpec().intValue();
            float size = Float.NaN;
            float size2 = View.MeasureSpec.getMode(iIntValue) == 0 ? Float.NaN : View.MeasureSpec.getSize(iIntValue);
            if (View.MeasureSpec.getMode(iIntValue2) != 0) {
                size = View.MeasureSpec.getSize(iIntValue2);
            }
            kocVar.Q(size2, size);
        } finally {
            Trace.endSection();
            this.i = SystemClock.uptimeMillis() - jUptimeMillis;
        }
    }

    public final boolean d(int i, String str) {
        if (this.d.a(i) != null) {
            return true;
        }
        s55.n("ReactNative", "Unable to execute operation " + str + " on view with tag: " + i + ", since the view does not exist");
        return false;
    }

    public final void e(int i) {
        i3f i3fVar = new i3f("UIImplementation.dispatchViewUpdates");
        i3fVar.R("batchId", String.valueOf(i));
        i3fVar.T();
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            k();
            this.g.c.clear();
            this.f.a(jUptimeMillis, i, this.i);
        } finally {
            Trace.endSection();
        }
    }

    public final void f() {
        e4g e4gVar = this.f;
        if (e4gVar.h.isEmpty() && e4gVar.g.isEmpty()) {
            e(-1);
        }
    }

    public final void g(koc kocVar, noc nocVar) {
        if (kocVar.E()) {
            return;
        }
        mkf mkfVarK = kocVar.K();
        iaa iaaVar = this.g;
        iaaVar.getClass();
        kocVar.t(kocVar.n().equals(ReactViewManager.REACT_CLASS) && iaa.f(nocVar));
        if (kocVar.L() != t9a.c) {
            iaaVar.a.b(mkfVarK, kocVar.B(), kocVar.n(), nocVar);
        }
    }

    public final void h(int i, int i2, int[] iArr) {
        int iRound;
        int iRound2;
        ybe ybeVar = this.d;
        koc<?> kocVarA = ybeVar.a(i);
        koc<?> kocVarA2 = ybeVar.a(i2);
        if (kocVarA == null || kocVarA2 == null) {
            StringBuilder sb = new StringBuilder("Tag ");
            if (kocVarA != null) {
                i = i2;
            }
            throw new IllegalViewOperationException(w20.k(sb, i, " does not exist"));
        }
        if (kocVarA != kocVarA2) {
            for (loc parent = kocVarA.getParent(); parent != kocVarA2; parent = parent.W) {
                if (parent == null) {
                    throw new IllegalViewOperationException(k20.l("Tag ", i2, i, " is not an ancestor of tag "));
                }
            }
        }
        if (kocVarA == kocVarA2 || kocVarA.E()) {
            iRound = 0;
            iRound2 = 0;
        } else {
            iRound = Math.round(kocVarA.s());
            iRound2 = Math.round(kocVarA.p());
            for (loc parent2 = kocVarA.getParent(); parent2 != kocVarA2; parent2 = parent2.W) {
                hh1.n(parent2);
                a aVar = parent2.j0;
                b(parent2);
                iRound += Math.round(aVar.k());
                iRound2 += Math.round(aVar.l());
            }
            b(kocVarA2);
        }
        iArr[0] = iRound;
        iArr[1] = iRound2;
        iArr[2] = kocVarA.H();
        iArr[3] = kocVarA.u();
    }

    public final void i(koc kocVar) {
        if (kocVar.f()) {
            for (int i = 0; i < kocVar.g(); i++) {
                i(kocVar.a(i));
            }
            kocVar.I(this.g);
        }
    }

    public final void j(koc kocVar) {
        int i = iaa.d;
        kocVar.C();
        int iB = kocVar.B();
        ybe ybeVar = this.d;
        ybeVar.c.a();
        if (ybeVar.b.get(iB)) {
            throw new IllegalViewOperationException(bg.d(iB, "Trying to remove root node ", " without using removeRootNode!"));
        }
        ybeVar.a.remove(iB);
        for (int iG = kocVar.g() - 1; iG >= 0; iG--) {
            j(kocVar.a(iG));
        }
        kocVar.h();
    }

    public final void k() {
        ybe ybeVar = this.d;
        Trace.beginSection(jpf.g("UIImplementation.updateViewHierarchy"));
        int i = 0;
        while (true) {
            try {
                ybe.a aVar = ybeVar.c;
                SparseBooleanArray sparseBooleanArray = ybeVar.b;
                aVar.a();
                if (i >= sparseBooleanArray.size()) {
                    return;
                }
                ybeVar.c.a();
                koc<?> kocVarA = ybeVar.a(sparseBooleanArray.keyAt(i));
                if (kocVarA.getWidthMeasureSpec() != null && kocVarA.getHeightMeasureSpec() != null) {
                    i3f i3fVar = new i3f("UIImplementation.notifyOnBeforeLayoutRecursive");
                    i3fVar.R("rootTag", String.valueOf(kocVarA.B()));
                    i3fVar.T();
                    i(kocVarA);
                    Trace.endSection();
                    c(kocVarA);
                    i3f i3fVar2 = new i3f("UIImplementation.applyUpdatesRecursive");
                    i3fVar2.R("rootTag", String.valueOf(kocVarA.B()));
                    i3fVar2.T();
                    ArrayList<koc> arrayList = new ArrayList();
                    a(kocVarA, 0.0f, 0.0f, arrayList);
                    for (koc kocVar : arrayList) {
                        ay4 ay4Var = this.b;
                        int iB = kocVar.B();
                        int iQ = kocVar.q();
                        int iL = kocVar.l();
                        int iH = kocVar.H();
                        int iU = kocVar.u();
                        pqa pqaVarAcquire = pqa.e.acquire();
                        if (pqaVarAcquire == null) {
                            pqaVarAcquire = new pqa();
                        }
                        pqaVarAcquire.init(-1, iB);
                        pqaVarAcquire.a = iQ;
                        pqaVarAcquire.b = iL;
                        pqaVarAcquire.c = iH;
                        pqaVarAcquire.d = iU;
                        ay4Var.a(pqaVarAcquire);
                    }
                    Trace.endSection();
                }
                i++;
            } catch (Throwable th) {
                throw th;
            } finally {
                Trace.endSection();
            }
        }
    }
}
