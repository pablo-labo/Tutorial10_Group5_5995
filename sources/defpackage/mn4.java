package defpackage;

import androidx.compose.foundation.layout.f;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class mn4 {
    public static final void a(final hee heeVar, final boolean z, final Function1<? super Boolean, j6g> function1, final gu5<j6g> gu5Var, b bVar, final int i) {
        heeVar.getClass();
        function1.getClass();
        gu5Var.getClass();
        c cVarH = bVar.h(-1709040427);
        int i2 = i | (cVarH.K(heeVar) ? 4 : 2) | (cVarH.a(z) ? 32 : 16) | (cVarH.x(function1) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) | (cVarH.x(gu5Var) ? 2048 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        if (cVarH.o(i2 & 1, (i2 & 1171) != 1170)) {
            final o97 o97Var = (o97) cVarH.M(p97.a);
            nx6.a(gu5Var, null, heeVar, "EditStatusBottomSheet", false, null, bh2.c(-1244219153, new wu5() { // from class: jn4
                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) {
                    b bVar2 = (b) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((pb2) obj).getClass();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                        nx6.c(ak2.I(R.string.messaging_edit_status, bVar2), null, false, false, false, null, null, bh2.c(-1676236029, new ln4(0, gu5Var), bVar2), null, null, bVar2, 12582912, 894);
                        o97 o97Var2 = o97Var;
                        o97.g gVar = o97Var2.i;
                        e eVarJ = f.j(f.h(e.a.b, 24.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 24.0f, 7);
                        ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar2, 0);
                        int iHashCode = Long.hashCode(bVar2.k());
                        t8b t8bVarM = bVar2.m();
                        e eVarC = androidx.compose.ui.c.c(bVar2, eVarJ);
                        gl2.j.getClass();
                        pm8.a aVar = gl2.a.b;
                        if (bVar2.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar2.B();
                        if (bVar2.f()) {
                            bVar2.y(aVar);
                        } else {
                            bVar2.n();
                        }
                        ygg.y(bVar2, ob2VarA, gl2.a.g);
                        ygg.y(bVar2, t8bVarM, gl2.a.f);
                        gl2.a.C0251a c0251a = gl2.a.j;
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                            uz.g(iHashCode, bVar2, iHashCode, c0251a);
                        }
                        ygg.y(bVar2, eVarC, gl2.a.d);
                        fif.b(ak2.I(R.string.messaging_edit_status_description, bVar2), null, o97Var2.c.a.c, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, o97Var2.j.g, bVar2, 0, 0, 65530);
                        String strI = ak2.I(R.string.messaging_show_when_online, bVar2);
                        boolean z2 = z;
                        zv6[] zv6VarArr = {new zv6(strI, z2), new zv6(ak2.I(R.string.messaging_dont_show_online_status, bVar2), !z2)};
                        Function1 function12 = function1;
                        boolean zK = bVar2.K(function12);
                        Object objV = bVar2.v();
                        if (zK || objV == b.a.a) {
                            objV = new pa(function12, 5);
                            bVar2.p(objV);
                        }
                        fw6.c("", null, null, null, false, zv6VarArr, (Function2) objV, "EditStatusRadioList", bVar2, 100663302, 62);
                        bVar2.q();
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), cVarH, ((i2 >> 9) & 14) | 1575936 | ((i2 << 6) & 896), 50);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2(z, function1, gu5Var, i) { // from class: kn4
                public final /* synthetic */ boolean b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ gu5 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = ka2.L(1);
                    mn4.a(this.a, this.b, this.c, this.d, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }
}
