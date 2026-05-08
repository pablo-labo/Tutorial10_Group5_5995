package defpackage;

import defpackage.a5;
import defpackage.ke8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class x4 implements gu5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ x4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new a5.a(((a5) obj).g());
            case 1:
                return new ke8.a((ke8) obj);
            case 2:
                List<ui8> upperBounds = ((eg8) obj).a.getUpperBounds();
                upperBounds.getClass();
                List<ui8> list = upperBounds;
                ArrayList arrayList = new ArrayList(t92.r0(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new cg8((ui8) it.next(), null));
                }
                return arrayList;
            default:
                ws8 ws8Var = (ws8) obj;
                yx9 yx9Var = ws8Var.c;
                yx9Var.K0();
                return Boolean.valueOf(boa.B((zl2) yx9Var.Z.getValue(), ws8Var.d));
        }
    }
}
