package defpackage;

import androidx.compose.foundation.d;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.le0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class pif {
    public final g4a a = r.f(null);
    public le0 b;
    public final SnapshotStateList<Function1<gcf, j6g>> c;

    @uh3(c = "androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$3$1", f = "TextLinkScope.kt", l = {247}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ zx8 $linkStateObserver;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zx8 zx8Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$linkStateObserver = zx8Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$linkStateObserver, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    r7d.b(obj);
                    return j6g.a;
                }
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            zx8 zx8Var = this.$linkStateObserver;
            this.label = 1;
            zx8Var.getClass();
            zx8Var.a.b().e(new yx8(new p3a((Object) null), zx8Var), this);
            return g13.a;
        }
    }

    public static final class b implements l74 {
        public final /* synthetic */ Function1 b;

        public b(Function1 function1) {
            this.b = function1;
        }

        @Override // defpackage.l74
        public final void dispose() {
            pif.this.c.remove(this.b);
        }
    }

    public pif(le0 le0Var) {
        hs hsVar = new hs(16);
        le0Var.getClass();
        le0.b bVar = new le0.b(le0Var);
        ArrayList arrayList = bVar.c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            List list = (List) hsVar.invoke(((le0.b.a) arrayList.get(i)).a(Integer.MIN_VALUE));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                le0.c cVar = (le0.c) list.get(i2);
                arrayList3.add(new le0.b.a(cVar.a, cVar.b, cVar.c, cVar.d));
            }
            w92.w0(arrayList2, arrayList3);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.b = bVar.l();
        this.c = new SnapshotStateList<>();
    }

    public static le0.c c(le0.c cVar, mif mifVar) {
        int iC = mifVar.b.c(r3.f - 1, false);
        if (cVar.b < iC) {
            return le0.c.a(cVar, null, Math.min(cVar.c, iC), 11);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i, androidx.compose.runtime.b bVar) {
        char c;
        boolean z;
        c cVarH = bVar.h(1154651354);
        char c2 = 2;
        int i2 = (cVarH.x(this) ? 4 : 2) | i;
        if (cVarH.o(i2 & 1, (i2 & 3) != 2)) {
            mhg mhgVar = (mhg) cVarH.M(um2.r);
            le0 le0Var = this.b;
            List listA = le0Var.a(le0Var.b.length());
            int size = listA.size();
            int i3 = 0;
            while (i3 < size) {
                le0.c cVar = (le0.c) listA.get(i3);
                int i4 = cVar.b;
                T t = cVar.a;
                if (i4 != cVar.c) {
                    cVarH.L(725478935);
                    Object objV = cVarH.v();
                    b.a.C0020a c0020a = b.a.a;
                    if (objV == c0020a) {
                        objV = v40.a(cVarH);
                    }
                    d3a d3aVar = (d3a) objV;
                    c = c2;
                    e eVarA = androidx.compose.ui.graphics.a.a(e.a.b, new kc(6, this, cVar));
                    Object objV2 = cVarH.v();
                    if (objV2 == c0020a) {
                        z = true;
                        objV2 = new iq0(16);
                        cVarH.p(objV2);
                    } else {
                        z = true;
                    }
                    e eVarA2 = d.a(b5e.b(eVarA, false, (Function1) objV2).o(new mjf(new u65(this, cVar))), d3aVar);
                    ueb.a.getClass();
                    e eVarE = bf9.e(eVarA2, q92.Y);
                    boolean zX = cVarH.x(this) | cVarH.K(cVar) | cVarH.x(mhgVar);
                    Object objV3 = cVarH.v();
                    if (zX || objV3 == c0020a) {
                        objV3 = new rr(this, cVar, mhgVar);
                        cVarH.p(objV3);
                    }
                    hl1.a(androidx.compose.foundation.b.e(eVarE, d3aVar, (gu5) objV3), cVarH, 0);
                    rx8 rx8Var = (rx8) t;
                    rif rifVarB = rx8Var.b();
                    if (rifVarB == null || (rifVarB.a == null && rifVarB.b == null && rifVarB.c == null && rifVarB.d == null)) {
                        cVarH.L(728331710);
                        cVarH.U(false);
                    } else {
                        cVarH.L(726303039);
                        Object objV4 = cVarH.v();
                        if (objV4 == c0020a) {
                            objV4 = new zx8(d3aVar);
                            cVarH.p(objV4);
                        }
                        zx8 zx8Var = (zx8) objV4;
                        j6g j6gVar = j6g.a;
                        Object objV5 = cVarH.v();
                        if (objV5 == c0020a) {
                            objV5 = new a(zx8Var, null);
                            cVarH.p(objV5);
                        }
                        to4.d(cVarH, j6gVar, (Function2) objV5);
                        c3a c3aVar = zx8Var.b;
                        c3a c3aVar2 = zx8Var.b;
                        Boolean boolValueOf = Boolean.valueOf((((dme) c3aVar).e() & 2) != 0 ? z : false);
                        Boolean boolValueOf2 = Boolean.valueOf((((dme) c3aVar2).e() & 1) != 0 ? z : false);
                        Boolean boolValueOf3 = Boolean.valueOf((((dme) c3aVar2).e() & 4) != 0 ? z : false);
                        rif rifVarB2 = rx8Var.b();
                        foe foeVar = rifVarB2 != null ? rifVarB2.a : null;
                        rif rifVarB3 = rx8Var.b();
                        foe foeVar2 = rifVarB3 != null ? rifVarB3.b : null;
                        rif rifVarB4 = rx8Var.b();
                        foe foeVar3 = rifVarB4 != null ? rifVarB4.c : null;
                        rif rifVarB5 = rx8Var.b();
                        Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, foeVar, foeVar2, foeVar3, rifVarB5 != null ? rifVarB5.d : null};
                        boolean zX2 = cVarH.x(this) | cVarH.K(cVar);
                        Object objV6 = cVarH.v();
                        if (zX2 || objV6 == c0020a) {
                            objV6 = new wi1(this, cVar, zx8Var);
                            cVarH.p(objV6);
                        }
                        b(objArr, (Function1) objV6, cVarH, (i2 << 6) & 896);
                        cVarH.U(false);
                    }
                    cVarH.U(false);
                } else {
                    c = c2;
                    cVarH.L(728345598);
                    cVarH.U(false);
                }
                i3++;
                c2 = c;
            }
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new pe(this, i, 9);
        }
    }

    public final void b(Object[] objArr, Function1<? super gcf, j6g> function1, androidx.compose.runtime.b bVar, int i) {
        c cVarH = bVar.h(-2083052099);
        int i2 = (i & 48) == 0 ? (cVarH.x(function1) ? 32 : 16) | i : i;
        if ((i & 384) == 0) {
            i2 |= cVarH.x(this) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        cVarH.A(-358305778, Integer.valueOf(objArr.length));
        int i3 = i2 | (cVarH.d(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i3 |= cVarH.x(obj) ? 4 : 0;
        }
        cVarH.U(false);
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        if (cVarH.o(i3 & 1, (i3 & 147) != 146)) {
            md2 md2Var = new md2(2);
            ArrayList arrayList = (ArrayList) md2Var.a;
            md2Var.b(function1);
            md2Var.c(objArr);
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean zX = cVarH.x(this) | ((i3 & 112) == 32);
            Object objV = cVarH.v();
            if (zX || objV == b.a.a) {
                objV = new pu(5, this, function1);
                cVarH.p(objV);
            }
            to4.c(array, (Function1) objV, cVarH);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new wf(this, objArr, function1, i);
        }
    }
}
