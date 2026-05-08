package defpackage;

import androidx.compose.runtime.b;
import defpackage.gl2;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class em8 extends mj8 implements Function2<b, Integer, j6g> {
    final /* synthetic */ List<Function2<b, Integer, j6g>> $contents;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public em8(List<? extends Function2<? super b, ? super Integer, j6g>> list) {
        super(2);
        this.$contents = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(b bVar, Integer num) {
        b bVar2 = bVar;
        int iIntValue = num.intValue();
        if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
            List<Function2<b, Integer, j6g>> list = this.$contents;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Function2<b, Integer, j6g> function2 = list.get(i);
                int iHashCode = Long.hashCode(bVar2.k());
                gl2.j.getClass();
                gl2.a.h hVar = gl2.a.c;
                if (bVar2.j() == null) {
                    pg8.B();
                    throw null;
                }
                bVar2.B();
                if (bVar2.f()) {
                    bVar2.y(hVar);
                } else {
                    bVar2.n();
                }
                gl2.a.C0251a c0251a = gl2.a.j;
                if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                    uz.g(iHashCode, bVar2, iHashCode, c0251a);
                }
                function2.invoke(bVar2, 0);
                bVar2.q();
            }
        } else {
            bVar2.D();
        }
        return j6g.a;
    }
}
