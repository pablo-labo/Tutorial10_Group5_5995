package defpackage;

import defpackage.le0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class me0 {
    public static final le0 a = new le0("");

    public static final List a(le0 le0Var, int i, int i2, wa waVar) {
        List<le0.c<? extends le0.a>> list;
        if (i == i2 || (list = le0Var.a) == null) {
            return null;
        }
        if (i != 0 || i2 < le0Var.b.length()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                le0.c<? extends le0.a> cVar = list.get(i3);
                if ((waVar != null ? ((Boolean) waVar.invoke(cVar.a)).booleanValue() : true) && b(i, i2, cVar.b, cVar.c)) {
                    arrayList.add(new le0.c((le0.a) cVar.a, nic.C(cVar.b, i, i2) - i, nic.C(cVar.c, i, i2) - i, cVar.d));
                }
            }
            return arrayList;
        }
        if (waVar == null) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            le0.c<? extends le0.a> cVar2 = list.get(i4);
            if (((Boolean) waVar.invoke(cVar2.a)).booleanValue()) {
                arrayList2.add(cVar2);
            }
        }
        return arrayList2;
    }

    public static final boolean b(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}
