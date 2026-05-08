package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.navigation.k;
import defpackage.cba;
import defpackage.h5;
import defpackage.j6g;
import defpackage.k20;
import defpackage.l5;
import defpackage.loe;
import defpackage.noe;
import defpackage.r6;
import defpackage.u63;
import defpackage.uac;
import defpackage.ut0;
import defpackage.v6e;
import defpackage.vp2;
import defpackage.wl7;
import defpackage.wve;
import defpackage.z92;
import defpackage.ze8;
import defpackage.zve;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class l extends k implements Iterable<k>, ze8 {
    public static final /* synthetic */ int e0 = 0;
    public final loe<k> a0;
    public int b0;
    public String c0;
    public String d0;

    public static final class a implements Iterator<k>, ze8 {
        public int a = -1;
        public boolean b;

        public a() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.a + 1 < l.this.a0.h();
        }

        @Override // java.util.Iterator
        public final k next() {
            if (!hasNext()) {
                k20.p();
                return null;
            }
            this.b = true;
            loe<k> loeVar = l.this.a0;
            int i = this.a + 1;
            this.a = i;
            return loeVar.i(i);
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.b) {
                r6.g("You must call next() before you can remove an element");
                return;
            }
            loe<k> loeVar = l.this.a0;
            loeVar.i(this.a).b = null;
            int i = this.a;
            Object[] objArr = loeVar.c;
            Object obj = objArr[i];
            Object obj2 = u63.e;
            if (obj != obj2) {
                objArr[i] = obj2;
                loeVar.a = true;
            }
            this.a = i - 1;
            this.b = false;
        }
    }

    public l(n nVar) {
        super(nVar);
        this.a0 = new loe<>(0);
    }

    @Override // androidx.navigation.k
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof l) || !super.equals(obj)) {
            return false;
        }
        loe<k> loeVar = this.a0;
        int iH = loeVar.h();
        l lVar = (l) obj;
        loe<k> loeVar2 = lVar.a0;
        if (iH != loeVar2.h() || this.b0 != lVar.b0) {
            return false;
        }
        for (k kVar : (vp2) v6e.L(new noe(loeVar))) {
            if (!kVar.equals(loeVar2.e(kVar.W))) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.navigation.k
    public final k.b f(cba cbaVar) {
        return q(cbaVar, false, this);
    }

    @Override // androidx.navigation.k
    public final int hashCode() {
        int iF = this.b0;
        loe<k> loeVar = this.a0;
        int iH = loeVar.h();
        for (int i = 0; i < iH; i++) {
            iF = (((iF * 31) + loeVar.f(i)) * 31) + loeVar.i(i).hashCode();
        }
        return iF;
    }

    @Override // androidx.navigation.k
    public final void i(Context context, AttributeSet attributeSet) {
        String strValueOf;
        context.getClass();
        super.i(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, uac.d);
        typedArrayObtainAttributes.getClass();
        s(typedArrayObtainAttributes.getResourceId(0, 0));
        int i = this.b0;
        if (i <= 16777215) {
            strValueOf = String.valueOf(i);
        } else {
            try {
                strValueOf = context.getResources().getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                strValueOf = String.valueOf(i);
            }
            strValueOf.getClass();
        }
        this.c0 = strValueOf;
        j6g j6gVar = j6g.a;
        typedArrayObtainAttributes.recycle();
    }

    @Override // java.lang.Iterable
    public final Iterator<k> iterator() {
        return new a();
    }

    public final void l(k kVar) {
        kVar.getClass();
        int i = kVar.W;
        String str = kVar.X;
        if (i == 0 && str == null) {
            l5.q("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
            return;
        }
        String str2 = this.X;
        if (str2 != null && wl7.b(str, str2)) {
            h5.l("Destination ", kVar, " cannot have the same route as graph ", this);
            return;
        }
        if (i == this.W) {
            h5.l("Destination ", kVar, " cannot have the same id as graph ", this);
            return;
        }
        loe<k> loeVar = this.a0;
        k kVarE = loeVar.e(i);
        if (kVarE == kVar) {
            return;
        }
        if (kVar.b != null) {
            r6.g("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
            return;
        }
        if (kVarE != null) {
            kVarE.b = null;
        }
        kVar.b = this;
        loeVar.g(kVar.W, kVar);
    }

    public final k n(String str, boolean z) {
        Object next;
        l lVar;
        str.getClass();
        loe<k> loeVar = this.a0;
        loeVar.getClass();
        Iterator it = ((vp2) v6e.L(new noe(loeVar))).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            k kVar = (k) next;
            if (wve.E(kVar.X, str, false) || kVar.g(str) != null) {
                break;
            }
        }
        k kVar2 = (k) next;
        if (kVar2 != null) {
            return kVar2;
        }
        if (!z || (lVar = this.b) == null || zve.U(str)) {
            return null;
        }
        return lVar.n(str, true);
    }

    public final k o(int i, l lVar, boolean z, k kVar) {
        loe<k> loeVar = this.a0;
        k kVarE = loeVar.e(i);
        if (kVar != null) {
            if (wl7.b(kVarE, kVar) && wl7.b(kVarE.b, kVar.b)) {
                return kVarE;
            }
            kVarE = null;
        } else if (kVarE != null) {
            return kVarE;
        }
        if (z) {
            Iterator it = ((vp2) v6e.L(new noe(loeVar))).iterator();
            while (true) {
                if (!it.hasNext()) {
                    kVarE = null;
                    break;
                }
                k kVar2 = (k) it.next();
                kVarE = (!(kVar2 instanceof l) || kVar2.equals(lVar)) ? null : ((l) kVar2).o(i, this, true, kVar);
                if (kVarE != null) {
                    break;
                }
            }
        }
        if (kVarE != null) {
            return kVarE;
        }
        l lVar2 = this.b;
        if (lVar2 == null || lVar2.equals(lVar)) {
            return null;
        }
        l lVar3 = this.b;
        lVar3.getClass();
        return lVar3.o(i, this, z, kVar);
    }

    public final k.b q(cba cbaVar, boolean z, l lVar) {
        k.b bVarQ;
        k.b bVarF = super.f(cbaVar);
        ArrayList arrayList = new ArrayList();
        a aVar = new a();
        while (true) {
            if (!aVar.hasNext()) {
                break;
            }
            k kVar = (k) aVar.next();
            bVarQ = wl7.b(kVar, lVar) ? null : kVar.f(cbaVar);
            if (bVarQ != null) {
                arrayList.add(bVarQ);
            }
        }
        k.b bVar = (k.b) z92.a1(arrayList);
        l lVar2 = this.b;
        if (lVar2 != null && z && !lVar2.equals(lVar)) {
            bVarQ = lVar2.q(cbaVar, true, this);
        }
        return (k.b) z92.a1(ut0.i0(new k.b[]{bVarF, bVar, bVarQ}));
    }

    public final k.b r(String str, boolean z, l lVar) {
        k.b bVarR;
        k.b bVarG = g(str);
        ArrayList arrayList = new ArrayList();
        a aVar = new a();
        while (true) {
            if (!aVar.hasNext()) {
                break;
            }
            k kVar = (k) aVar.next();
            bVarR = wl7.b(kVar, lVar) ? null : kVar instanceof l ? ((l) kVar).r(str, false, this) : kVar.g(str);
            if (bVarR != null) {
                arrayList.add(bVarR);
            }
        }
        k.b bVar = (k.b) z92.a1(arrayList);
        l lVar2 = this.b;
        if (lVar2 != null && z && !lVar2.equals(lVar)) {
            bVarR = lVar2.r(str, true, this);
        }
        return (k.b) z92.a1(ut0.i0(new k.b[]{bVarG, bVar, bVarR}));
    }

    public final void s(int i) {
        if (i != this.W) {
            if (this.d0 != null) {
                t(null);
            }
            this.b0 = i;
            this.c0 = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i + " cannot use the same id as the graph " + this).toString());
    }

    public final void t(String str) {
        int iHashCode;
        if (str == null) {
            iHashCode = 0;
        } else if (str.equals(this.X)) {
            h5.l("Start destination ", str, " cannot use the same route as the graph ", this);
            return;
        } else {
            if (zve.U(str)) {
                l5.q("Cannot have an empty start destination route");
                return;
            }
            iHashCode = "android-app://androidx.navigation/".concat(str).hashCode();
        }
        this.b0 = iHashCode;
        this.d0 = str;
    }

    @Override // androidx.navigation.k
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        String str = this.d0;
        k kVarN = (str == null || zve.U(str)) ? null : n(str, true);
        if (kVarN == null) {
            kVarN = o(this.b0, this, false, null);
        }
        sb.append(" startDestination=");
        if (kVarN == null) {
            String str2 = this.d0;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = this.c0;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(this.b0));
                }
            }
        } else {
            sb.append("{");
            sb.append(kVarN.toString());
            sb.append("}");
        }
        return sb.toString();
    }
}
