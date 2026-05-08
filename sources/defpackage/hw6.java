package defpackage;

import androidx.compose.runtime.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class hw6 implements Function2<b, Integer, j6g> {
    public final /* synthetic */ zv6[] a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Function2<Integer, Boolean, j6g> c;
    public final /* synthetic */ String d;

    public hw6(zv6[] zv6VarArr, String str, Function2 function2, String str2) {
        this.a = zv6VarArr;
        this.b = str;
        this.c = function2;
        this.d = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        if ((num.intValue() & 3) == 2 && bVar2.i()) {
            bVar2.D();
        } else {
            zv6[] zv6VarArr = this.a;
            int length = zv6VarArr.length;
            final int i = 0;
            int i2 = 0;
            while (i2 < length) {
                zv6 zv6Var = zv6VarArr[i2];
                int i3 = i + 1;
                boolean z = zv6Var.b;
                boolean z2 = this.b != null;
                String str = zv6Var.a;
                bVar2.L(-1633490746);
                final Function2<Integer, Boolean, j6g> function2 = this.c;
                boolean zK = bVar2.K(function2) | bVar2.d(i);
                Object objV = bVar2.v();
                if (zK || objV == b.a.a) {
                    objV = new Function1() { // from class: gw6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Boolean bool = (Boolean) obj;
                            bool.booleanValue();
                            function2.invoke(Integer.valueOf(i), bool);
                            return j6g.a;
                        }
                    };
                    bVar2.p(objV);
                }
                bVar2.F();
                fw6.b(z, z2, str, (Function1) objV, null, null, this.d + "_RadioSelectorItem_" + i, null, bVar2, 0, 288);
                i2++;
                i = i3;
            }
        }
        return j6g.a;
    }
}
