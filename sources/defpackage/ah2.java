package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ah2 implements Function2, wu5, xu5, yu5, zu5, av5, bv5, cv5, hu5, iu5, ku5, lu5, mu5, nu5, ou5, pu5, qu5, su5, tu5 {
    public final int a;
    public final boolean b;
    public Object c;
    public usc d;
    public ArrayList e;

    public /* synthetic */ class a extends fa implements Function2<b, Integer, j6g> {
        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(b bVar, Integer num) {
            int iIntValue = num.intValue();
            ((ah2) this.receiver).a(iIntValue, bVar);
            return j6g.a;
        }
    }

    public ah2(int i, Object obj, boolean z) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }

    public final Object a(int i, b bVar) {
        c cVarH = bVar.h(this.a);
        h(cVarH);
        int iA = i | (cVarH.K(this) ? bh2.a(2, 0) : bh2.a(1, 0));
        Object obj = this.c;
        obj.getClass();
        pxf.d(2, obj);
        Object objInvoke = ((Function2) obj).invoke(cVarH, Integer.valueOf(iA));
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new a(2, this, ah2.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
        }
        return objInvoke;
    }

    public final Object b(Object obj, b bVar, int i) {
        c cVarH = bVar.h(this.a);
        h(cVarH);
        int iA = cVarH.K(this) ? bh2.a(2, 1) : bh2.a(1, 1);
        Object obj2 = this.c;
        obj2.getClass();
        pxf.d(3, obj2);
        Object objQ = ((wu5) obj2).q(obj, cVarH, Integer.valueOf(iA | i));
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new yg2(i, 0, this, obj);
        }
        return objQ;
    }

    public final Object d(Object obj, Object obj2, b bVar, int i) {
        c cVarH = bVar.h(this.a);
        h(cVarH);
        int iA = cVarH.K(this) ? bh2.a(2, 2) : bh2.a(1, 2);
        Object obj3 = this.c;
        obj3.getClass();
        pxf.d(4, obj3);
        Object objJ = ((xu5) obj3).j(obj, obj2, cVarH, Integer.valueOf(iA | i));
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new tc1(this, obj, obj2, i);
        }
        return objJ;
    }

    public final Object f(final Object obj, final Object obj2, final Object obj3, b bVar, final int i) {
        c cVarH = bVar.h(this.a);
        h(cVarH);
        int iA = cVarH.K(this) ? bh2.a(2, 3) : bh2.a(1, 3);
        Object obj4 = this.c;
        obj4.getClass();
        pxf.d(5, obj4);
        Object objT = ((yu5) obj4).t(obj, obj2, obj3, cVarH, Integer.valueOf(iA | i));
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: xg2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    this.a.f(obj, obj2, obj3, (b) obj5, ka2.L(i) | 1);
                    return j6g.a;
                }
            };
        }
        return objT;
    }

    public final Object g(final Object obj, final Object obj2, final Object obj3, final Object obj4, b bVar, final int i) {
        c cVarH = bVar.h(this.a);
        h(cVarH);
        int iA = cVarH.K(this) ? bh2.a(2, 4) : bh2.a(1, 4);
        Object obj5 = this.c;
        obj5.getClass();
        pxf.d(6, obj5);
        Object objM = ((zu5) obj5).m(obj, obj2, obj3, obj4, cVarH, Integer.valueOf(iA | i));
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: zg2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj6, Object obj7) {
                    ((Integer) obj7).getClass();
                    this.a.g(obj, obj2, obj3, obj4, (b) obj6, ka2.L(i) | 1);
                    return j6g.a;
                }
            };
        }
        return objM;
    }

    public final void h(b bVar) {
        i iVarS;
        if (!this.b || (iVarS = bVar.s()) == null) {
            return;
        }
        bVar.C(iVarS);
        if (bh2.d(this.d, iVarS)) {
            this.d = iVarS;
            return;
        }
        ArrayList arrayList = this.e;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.e = arrayList2;
            arrayList2.add(iVarS);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (bh2.d((usc) arrayList.get(i), iVarS)) {
                arrayList.set(i, iVarS);
                return;
            }
        }
        arrayList.add(iVarS);
    }

    public final void i(vu5 vu5Var) {
        if (wl7.b(this.c, vu5Var)) {
            return;
        }
        boolean z = this.c == null;
        this.c = vu5Var;
        if (z || !this.b) {
            return;
        }
        usc uscVar = this.d;
        if (uscVar != null) {
            uscVar.invalidate();
            this.d = null;
        }
        ArrayList arrayList = this.e;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((usc) arrayList.get(i)).invalidate();
            }
            arrayList.clear();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a(((Number) obj2).intValue(), (b) obj);
    }

    @Override // defpackage.xu5
    public final /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        return d(obj, obj2, (b) obj3, ((Number) obj4).intValue());
    }

    @Override // defpackage.zu5
    public final /* bridge */ /* synthetic */ Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return g(obj, obj2, obj3, obj4, (b) obj5, ((Number) obj6).intValue());
    }

    @Override // defpackage.wu5
    public final /* bridge */ /* synthetic */ Object q(Object obj, Object obj2, Object obj3) {
        return b(obj, (b) obj2, ((Number) obj3).intValue());
    }

    @Override // defpackage.yu5
    public final /* bridge */ /* synthetic */ Object t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return f(obj, obj2, obj3, (b) obj4, ((Number) obj5).intValue());
    }
}
