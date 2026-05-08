package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import defpackage.c20;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.vs0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class t90 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ long a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ e c;
    public final /* synthetic */ toa d;

    public t90(long j, boolean z, e eVar, toa toaVar) {
        this.a = j;
        this.b = z;
        this.c = eVar;
        this.d = toaVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        int i = 1;
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            long j = this.a;
            b.a.C0020a c0020a = b.a.a;
            toa toaVar = this.d;
            boolean z = this.b;
            if (j != 9205357640488583168L) {
                bVar2.L(3458246);
                vs0.e eVar = z ? vs0.a.b : vs0.a.a;
                e eVarM = g.m(this.c, m94.b(j), m94.a(j), 0.0f, 0.0f, 12);
                ehd ehdVarA = chd.a(eVar, c20.a.j, bVar2, 0);
                int iHashCode = Long.hashCode(bVar2.k());
                t8b t8bVarM = bVar2.m();
                e eVarC = c.c(bVar2, eVarM);
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
                ygg.y(bVar2, ehdVarA, gl2.a.g);
                ygg.y(bVar2, t8bVarM, gl2.a.f);
                gl2.a.C0251a c0251a = gl2.a.j;
                if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                    uz.g(iHashCode, bVar2, iHashCode, c0251a);
                }
                ygg.y(bVar2, eVarC, gl2.a.d);
                boolean zX = bVar2.x(toaVar);
                Object objV = bVar2.v();
                if (zX || objV == c0020a) {
                    objV = new hr(toaVar, i);
                    bVar2.p(objV);
                }
                y90.c(6, (gu5) objV, bVar2, e.a.b, z);
                bVar2.q();
                bVar2.F();
            } else {
                bVar2.L(4389176);
                boolean zX2 = bVar2.x(toaVar);
                Object objV2 = bVar2.v();
                if (zX2 || objV2 == c0020a) {
                    objV2 = new qa(toaVar, i);
                    bVar2.p(objV2);
                }
                y90.c(0, (gu5) objV2, bVar2, this.c, z);
                bVar2.F();
            }
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
