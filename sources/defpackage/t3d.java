package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.a;
import com.bumptech.glide.c;
import com.bumptech.glide.load.engine.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class t3d<TranscodeType> extends wa1<t3d<TranscodeType>> {
    public final Context f0;
    public final j4d g0;
    public final c i0;
    public psf<?, ? super TranscodeType> j0;
    public Object k0;
    public ArrayList l0;
    public t3d<TranscodeType> m0;
    public t3d<TranscodeType> n0;
    public boolean p0;
    public boolean q0;
    public final boolean o0 = true;
    public final Class<TranscodeType> h0 = Bitmap.class;

    static {
    }

    @SuppressLint({"CheckResult"})
    public t3d(a aVar, j4d j4dVar, Context context) {
        n4d n4dVar;
        this.g0 = j4dVar;
        this.f0 = context;
        Map<Class<?>, psf<?, ?>> map = j4dVar.a.c.e;
        psf value = map.get(Bitmap.class);
        if (value == null) {
            for (Map.Entry<Class<?>, psf<?, ?>> entry : map.entrySet()) {
                if (entry.getKey().isAssignableFrom(Bitmap.class)) {
                    value = entry.getValue();
                }
            }
        }
        this.j0 = value == null ? c.j : value;
        this.i0 = aVar.c;
        Iterator<i4d<Object>> it = j4dVar.X.iterator();
        while (it.hasNext()) {
            q((i4d) it.next());
        }
        synchronized (j4dVar) {
            n4dVar = j4dVar.Y;
        }
        c(n4dVar);
    }

    @Override // defpackage.wa1
    public final boolean equals(Object obj) {
        if (!(obj instanceof t3d)) {
            return false;
        }
        t3d t3dVar = (t3d) obj;
        return super.equals(t3dVar) && Objects.equals(this.h0, t3dVar.h0) && this.j0.equals(t3dVar.j0) && Objects.equals(this.k0, t3dVar.k0) && Objects.equals(this.l0, t3dVar.l0) && Objects.equals(this.m0, t3dVar.m0) && Objects.equals(this.n0, t3dVar.n0) && this.o0 == t3dVar.o0 && this.p0 == t3dVar.p0;
    }

    @Override // defpackage.wa1
    public final int hashCode() {
        return xjg.g(this.p0 ? 1 : 0, xjg.g(this.o0 ? 1 : 0, xjg.h(xjg.h(xjg.h(xjg.h(xjg.h(xjg.h(xjg.h(super.hashCode(), this.h0), this.j0), this.k0), this.l0), this.m0), this.n0), null)));
    }

    public final t3d<TranscodeType> q(i4d<TranscodeType> i4dVar) {
        if (this.c0) {
            return clone().q(i4dVar);
        }
        if (i4dVar != null) {
            if (this.l0 == null) {
                this.l0 = new ArrayList();
            }
            this.l0.add(i4dVar);
        }
        k();
        return this;
    }

    @Override // defpackage.wa1
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final t3d<TranscodeType> c(wa1<?> wa1Var) {
        beb.d(wa1Var);
        return (t3d) super.c(wa1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final n3d t(Object obj, y9f y9fVar, w3d w3dVar, psf psfVar, knb knbVar, int i, int i2, wa1 wa1Var) {
        w3d w3dVar2;
        w3d tw4Var;
        w3d w3dVar3;
        wa1 wa1Var2;
        n3d qheVar;
        knb knbVar2;
        if (this.n0 != null) {
            tw4Var = new tw4(obj, w3dVar);
            w3dVar2 = tw4Var;
        } else {
            w3dVar2 = null;
            tw4Var = w3dVar;
        }
        t3d<TranscodeType> t3dVar = this.m0;
        if (t3dVar == null) {
            w3dVar3 = w3dVar2;
            Context context = this.f0;
            c cVar = this.i0;
            Object obj2 = this.k0;
            Class<TranscodeType> cls = this.h0;
            ArrayList arrayList = this.l0;
            f fVar = cVar.f;
            psfVar.getClass();
            wa1Var2 = wa1Var;
            qheVar = new qhe(context, cVar, obj, obj2, cls, wa1Var2, i, i2, knbVar, y9fVar, arrayList, tw4Var, fVar);
        } else {
            if (this.q0) {
                r6.g("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
                return null;
            }
            psf psfVar2 = t3dVar.o0 ? psfVar : t3dVar.j0;
            if (wa1.h(t3dVar.a, 8)) {
                knbVar2 = this.m0.c;
            } else {
                int iOrdinal = knbVar.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    knbVar2 = knb.a;
                } else if (iOrdinal == 2) {
                    knbVar2 = knb.b;
                } else {
                    if (iOrdinal != 3) {
                        bg.m(this.c, "unknown priority: ");
                        return null;
                    }
                    knbVar2 = knb.c;
                }
            }
            knb knbVar3 = knbVar2;
            t3d<TranscodeType> t3dVar2 = this.m0;
            int i3 = t3dVar2.f;
            int i4 = t3dVar2.e;
            if (xjg.i(i, i2)) {
                t3d<TranscodeType> t3dVar3 = this.m0;
                if (!xjg.i(t3dVar3.f, t3dVar3.e)) {
                    i3 = wa1Var.f;
                    i4 = wa1Var.e;
                }
            }
            int i5 = i4;
            int i6 = i3;
            qlf qlfVar = new qlf(obj, tw4Var);
            Context context2 = this.f0;
            c cVar2 = this.i0;
            Object obj3 = this.k0;
            Class<TranscodeType> cls2 = this.h0;
            ArrayList arrayList2 = this.l0;
            f fVar2 = cVar2.f;
            psfVar.getClass();
            qlf qlfVar2 = qlfVar;
            w3dVar3 = w3dVar2;
            qhe qheVar2 = new qhe(context2, cVar2, obj, obj3, cls2, wa1Var, i, i2, knbVar, y9fVar, arrayList2, qlfVar2, fVar2);
            this.q0 = true;
            t3d<TranscodeType> t3dVar4 = this.m0;
            n3d n3dVarT = t3dVar4.t(obj, y9fVar, qlfVar2, psfVar2, knbVar3, i6, i5, t3dVar4);
            this.q0 = false;
            qlfVar2.c = qheVar2;
            qlfVar2.d = n3dVarT;
            wa1Var2 = wa1Var;
            qheVar = qlfVar2;
        }
        if (w3dVar3 == null) {
            return qheVar;
        }
        t3d<TranscodeType> t3dVar5 = this.n0;
        int i7 = t3dVar5.f;
        int i8 = t3dVar5.e;
        if (xjg.i(i, i2)) {
            t3d<TranscodeType> t3dVar6 = this.n0;
            if (!xjg.i(t3dVar6.f, t3dVar6.e)) {
                i7 = wa1Var2.f;
                i8 = wa1Var2.e;
            }
        }
        t3d<TranscodeType> t3dVar7 = this.n0;
        tw4 tw4Var2 = w3dVar3;
        n3d n3dVarT2 = t3dVar7.t(obj, y9fVar, tw4Var2, t3dVar7.j0, t3dVar7.c, i7, i8, t3dVar7);
        tw4Var2.c = qheVar;
        tw4Var2.d = n3dVarT2;
        return tw4Var2;
    }

    @Override // defpackage.wa1
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final t3d<TranscodeType> clone() {
        t3d<TranscodeType> t3dVar = (t3d) super.clone();
        t3dVar.j0 = t3dVar.j0.clone();
        if (t3dVar.l0 != null) {
            t3dVar.l0 = new ArrayList(t3dVar.l0);
        }
        t3d<TranscodeType> t3dVar2 = t3dVar.m0;
        if (t3dVar2 != null) {
            t3dVar.m0 = t3dVar2.clone();
        }
        t3d<TranscodeType> t3dVar3 = t3dVar.n0;
        if (t3dVar3 != null) {
            t3dVar.n0 = t3dVar3.clone();
        }
        return t3dVar;
    }

    public final void v(y9f y9fVar) {
        beb.d(y9fVar);
        if (!this.p0) {
            l5.q("You must call #load() before calling #into()");
            return;
        }
        n3d n3dVarT = t(new Object(), y9fVar, null, this.j0, this.c, this.f, this.e, this);
        n3d n3dVarA = y9fVar.a();
        if (n3dVarT.f(n3dVarA) && (this.d || !n3dVarA.b())) {
            beb.e(n3dVarA, "Argument must not be null");
            if (n3dVarA.isRunning()) {
                return;
            }
            n3dVarA.k();
            return;
        }
        this.g0.h(y9fVar);
        y9fVar.c(n3dVarT);
        j4d j4dVar = this.g0;
        synchronized (j4dVar) {
            j4dVar.f.a.add(y9fVar);
            r4d r4dVar = j4dVar.d;
            r4dVar.a.add(n3dVarT);
            if (r4dVar.c) {
                n3dVarT.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                r4dVar.b.add(n3dVarT);
            } else {
                n3dVarT.k();
            }
        }
    }

    public final t3d<TranscodeType> w(Object obj) {
        if (this.c0) {
            return clone().w(obj);
        }
        this.k0 = obj;
        this.p0 = true;
        k();
        return this;
    }
}
