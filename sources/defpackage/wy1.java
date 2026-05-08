package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class wy1 {

    public static final class a implements Function1<Integer, Object> {
        public final /* synthetic */ List a;

        public a(List list) {
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            this.a.get(num.intValue());
            return null;
        }
    }

    public static final class b implements xu5<xo8, Integer, androidx.compose.runtime.b, Integer, j6g> {
        public final /* synthetic */ List a;
        public final /* synthetic */ Function1 b;

        public b(List list, Function1 function1) {
            this.a = list;
            this.b = function1;
        }

        @Override // defpackage.xu5
        public final j6g j(xo8 xo8Var, Integer num, androidx.compose.runtime.b bVar, Integer num2) {
            int i;
            xo8 xo8Var2 = xo8Var;
            int iIntValue = num.intValue();
            androidx.compose.runtime.b bVar2 = bVar;
            int iIntValue2 = num2.intValue();
            if ((iIntValue2 & 6) == 0) {
                i = (bVar2.K(xo8Var2) ? 4 : 2) | iIntValue2;
            } else {
                i = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i |= bVar2.d(iIntValue) ? 32 : 16;
            }
            if (bVar2.o(i & 1, (i & 147) != 146)) {
                aca acaVar = (aca) this.a.get(iIntValue);
                bVar2.L(-1965747125);
                if (acaVar.b.length() > 0) {
                    bVar2.L(-1965723163);
                    ue6.c(acaVar.b, bVar2, 0);
                } else {
                    bVar2.L(-1969597419);
                }
                bVar2.F();
                bVar2.L(1737708491);
                Iterator it = acaVar.c.iterator();
                while (it.hasNext()) {
                    ue6.a((zba) it.next(), this.b, true, bVar2, 384);
                }
                bVar2.F();
                bVar2.F();
            } else {
                bVar2.D();
            }
            return j6g.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final java.util.List<defpackage.aca> r18, final kotlin.jvm.functions.Function1<? super defpackage.zba, defpackage.j6g> r19, boolean r20, androidx.compose.runtime.b r21, final int r22, final int r23) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wy1.a(java.util.List, kotlin.jvm.functions.Function1, boolean, androidx.compose.runtime.b, int, int):void");
    }
}
