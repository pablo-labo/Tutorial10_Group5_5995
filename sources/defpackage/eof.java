package defpackage;

import defpackage.c7e;
import defpackage.ltf;
import defpackage.zd9;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class eof extends ltf {
    @Override // defpackage.ltf
    public final ltf.a b(ltf.b bVar, List<ltf.a> list, boolean z) {
        list.getClass();
        c7e.a aVar = bVar.c;
        en6 en6Var = aVar.b;
        oh7 oh7Var = aVar.a;
        int i = oh7Var.a;
        int i2 = oh7Var.b;
        boolean z2 = en6Var instanceof kd9;
        z zVar = this.a;
        if (z2 && ((kd9) en6Var).b) {
            return new ltf.a((y) z92.O0(zVar.b(en6Var, i, i2)), i, i2);
        }
        ArrayList arrayList = new ArrayList(list.size());
        ltf.a aVar2 = (ltf.a) z92.Q0(list);
        int i3 = aVar2 != null ? aVar2.b : i2;
        zd9.a aVar3 = zd9.M;
        if (i != i3) {
            arrayList.addAll(zVar.b(aVar3, i, i3));
        }
        int size = list.size();
        for (int i4 = 1; i4 < size; i4++) {
            ltf.a aVar4 = list.get(i4 - 1);
            ltf.a aVar5 = list.get(i4);
            arrayList.add(aVar4.a);
            int i5 = aVar4.c;
            int i6 = aVar5.b;
            if (i5 != i6) {
                arrayList.addAll(zVar.b(aVar3, i5, i6));
            }
        }
        if (!list.isEmpty()) {
            arrayList.add(((ltf.a) z92.Y0(list)).a);
            int i7 = ((ltf.a) z92.Y0(list)).c;
            if (i7 != i2) {
                arrayList.addAll(zVar.b(aVar3, i7, i2));
            }
        }
        return new ltf.a(zVar.a(en6Var, arrayList), i, i2);
    }

    @Override // defpackage.ltf
    public final void c(ltf.b bVar, List<ltf.a> list) {
        bVar.getClass();
    }
}
