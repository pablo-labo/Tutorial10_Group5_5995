package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.p;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class lmb implements Function2<b, Integer, j6g> {
    public final /* synthetic */ Object[] a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public lmb(String str, String str2, Object[] objArr) {
        this.a = objArr;
        this.b = str;
        this.c = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objV = bVar2.v();
            if (objV == b.a.a) {
                objV = p.a(0);
                bVar2.p(objV);
            }
            c3a c3aVar = (c3a) objV;
            Object[] objArr = this.a;
            pmd.a(null, null, null, null, null, bh2.c(958604965, new jmb(objArr, c3aVar), bVar2), 0, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, bh2.c(57310875, new kmb(this.b, this.c, objArr, c3aVar), bVar2), bVar2, 196608, 131039);
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
