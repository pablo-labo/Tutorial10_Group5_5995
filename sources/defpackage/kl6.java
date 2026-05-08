package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o7d;
import defpackage.pm8;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class kl6 {
    public static final void a(final int i, final gu5 gu5Var, final gu5 gu5Var2, final gu5 gu5Var3, b bVar, final boolean z) {
        int i2;
        c cVar;
        gu5Var.getClass();
        gu5Var2.getClass();
        gu5Var3.getClass();
        c cVarH = bVar.h(-524857695);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(gu5Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(gu5Var3) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.a(z) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        if (cVarH.o(i2 & 1, (i2 & 1171) != 1170)) {
            cVar = cVarH;
            pmd.a(null, null, bh2.c(1583497020, new Function2() { // from class: hl6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    b bVar2 = (b) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                        if (z) {
                            bVar2.L(-1961007834);
                            ehd ehdVarA = chd.a(vs0.a, c20.a.j, bVar2, 0);
                            int iHashCode = Long.hashCode(bVar2.k());
                            t8b t8bVarM = bVar2.m();
                            e.a aVar = e.a.b;
                            e eVarC = androidx.compose.ui.c.c(bVar2, aVar);
                            gl2.j.getClass();
                            pm8.a aVar2 = gl2.a.b;
                            if (bVar2.j() == null) {
                                pg8.B();
                                throw null;
                            }
                            bVar2.B();
                            if (bVar2.f()) {
                                bVar2.y(aVar2);
                            } else {
                                bVar2.n();
                            }
                            ygg.y(bVar2, ehdVarA, gl2.a.g);
                            ygg.y(bVar2, t8bVarM, gl2.a.f);
                            gl2.a.C0251a c0251a = gl2.a.j;
                            if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                                uz.g(iHashCode, bVar2, iHashCode, c0251a);
                            }
                            ygg.y(bVar2, eVarC, gl2.a.d);
                            gt6.l(fv6.G1, gu5Var3, f.a(aVar, "BackButton"), null, null, bVar2, 390, 248);
                            bVar2.q();
                        } else {
                            bVar2.L(-1966586842);
                        }
                        bVar2.F();
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), null, null, null, 0, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, bh2.c(-1662834141, new rb1((o97) cVarH.M(p97.a), gu5Var, gu5Var2), cVarH), cVar, 384, 131067);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: il6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    kl6.a(ka2.L(i | 1), gu5Var, gu5Var2, gu5Var3, (b) obj, z);
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(final int i, final gu5 gu5Var, final gu5 gu5Var2, final gu5 gu5Var3, b bVar, final boolean z) {
        int i2;
        c cVar;
        gu5Var.getClass();
        gu5Var2.getClass();
        gu5Var3.getClass();
        c cVarH = bVar.h(2045397861);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(gu5Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.x(gu5Var3) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i & 3072) == 0) {
            i2 |= cVarH.a(z) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        }
        int i3 = 0;
        if (cVarH.o(i2 & 1, (i2 & 1171) != 1170)) {
            cVar = cVarH;
            pmd.a(null, null, bh2.c(589388650, new el6(gu5Var3, z), cVarH), null, null, null, 0, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, bh2.c(1593046947, new fl6(i3, gu5Var, (o97) cVarH.M(p97.a), gu5Var2), cVarH), cVar, 384, 131067);
        } else {
            cVar = cVarH;
            cVar.D();
        }
        i iVarW = cVar.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: gl6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    kl6.b(ka2.L(i | 1), gu5Var, gu5Var2, gu5Var3, (b) obj, z);
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(defpackage.dx4 r8, defpackage.gu5<defpackage.j6g> r9, defpackage.gu5<defpackage.j6g> r10, defpackage.gu5<defpackage.j6g> r11, boolean r12, androidx.compose.runtime.b r13, int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kl6.c(dx4, gu5, gu5, gu5, boolean, androidx.compose.runtime.b, int, int):void");
    }

    public static final x2b d(b bVar) {
        Object aVar;
        bVar.L(-1899602260);
        bVar.L(-1899604079);
        try {
            aVar = z2b.a(R.drawable.ic_something_wrong, 0, bVar);
        } catch (Throwable th) {
            aVar = new o7d.a(th);
        }
        bVar.F();
        if (o7d.a(aVar) != null) {
            aVar = z2b.a(R.drawable.ic_something_wrong_webp, 0, bVar);
        }
        x2b x2bVar = (x2b) aVar;
        bVar.F();
        return x2bVar;
    }
}
