package defpackage;

import defpackage.le0;
import defpackage.pn5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes.dex */
public final class r1a implements h3b {
    public final le0 a;
    public final List<le0.c<sab>> b;
    public final Lazy c;
    public final Lazy d;
    public final ArrayList e;

    /* JADX WARN: Multi-variable type inference failed */
    public r1a(le0 le0Var, tjf tjfVar, List<le0.c<sab>> list, iy3 iy3Var, pn5.a aVar) {
        int i;
        ArrayList arrayList;
        int i2;
        String str;
        le0 le0Var2 = le0Var;
        tjf tjfVar2 = tjfVar;
        this.a = le0Var2;
        this.b = list;
        xh xhVar = new xh(this, 10);
        qt8 qt8Var = qt8.c;
        this.c = boa.E(qt8Var, xhVar);
        this.d = boa.E(qt8Var, new oe(this, 13));
        l3b l3bVar = tjfVar2.b;
        le0 le0Var3 = me0.a;
        ArrayList arrayList2 = le0Var2.d;
        String str2 = le0Var2.b;
        zr4 zr4Var = zr4.a;
        List listP1 = arrayList2 != null ? z92.p1(arrayList2, new ym9(1)) : zr4Var;
        ArrayList arrayList3 = new ArrayList();
        zs0 zs0Var = new zs0();
        int size = listP1.size();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            le0.c cVar = (le0.c) listP1.get(i4);
            le0.c cVarA = le0.c.a(cVar, l3bVar.a((l3b) cVar.a), i3, 14);
            T t = cVarA.a;
            int i6 = cVarA.c;
            int i7 = cVarA.b;
            while (i5 < i7 && !zs0Var.isEmpty()) {
                le0.c cVar2 = (le0.c) zs0Var.last();
                List list2 = listP1;
                int i8 = cVar2.c;
                zr4 zr4Var2 = zr4Var;
                T t2 = cVar2.a;
                if (i7 < i8) {
                    arrayList3.add(new le0.c(t2, i5, i7));
                    i5 = i7;
                    listP1 = list2;
                    zr4Var = zr4Var2;
                } else {
                    int i9 = size;
                    arrayList3.add(new le0.c(t2, i5, i8));
                    i5 = cVar2.c;
                    while (!zs0Var.isEmpty() && i5 == ((le0.c) zs0Var.last()).c) {
                        zs0Var.removeLast();
                    }
                    listP1 = list2;
                    zr4Var = zr4Var2;
                    size = i9;
                }
            }
            List list3 = listP1;
            zr4 zr4Var3 = zr4Var;
            int i10 = size;
            if (i5 < i7) {
                arrayList3.add(new le0.c(l3bVar, i5, i7));
                i5 = i7;
            }
            le0.c cVar3 = (le0.c) zs0Var.j();
            if (cVar3 != null) {
                int i11 = cVar3.c;
                T t3 = cVar3.a;
                int i12 = cVar3.b;
                if (i12 == i7 && i11 == i6) {
                    zs0Var.removeLast();
                    zs0Var.addLast(new le0.c(((l3b) t3).a((l3b) t), i7, i6));
                } else if (i12 == i11) {
                    arrayList3.add(new le0.c(t3, i12, i11));
                    zs0Var.removeLast();
                    zs0Var.addLast(new le0.c(t, i7, i6));
                } else {
                    if (i11 < i6) {
                        o6.h();
                        throw null;
                    }
                    zs0Var.addLast(new le0.c(((l3b) t3).a((l3b) t), i7, i6));
                }
            } else {
                zs0Var.addLast(new le0.c(t, i7, i6));
            }
            i4++;
            listP1 = list3;
            zr4Var = zr4Var3;
            size = i10;
            i3 = 0;
        }
        zr4 zr4Var4 = zr4Var;
        while (i5 <= str2.length() && !zs0Var.isEmpty()) {
            le0.c cVar4 = (le0.c) zs0Var.last();
            T t4 = cVar4.a;
            int i13 = cVar4.c;
            arrayList3.add(new le0.c(t4, i5, i13));
            while (!zs0Var.isEmpty() && i13 == ((le0.c) zs0Var.last()).c) {
                zs0Var.removeLast();
            }
            i5 = i13;
        }
        if (i5 < str2.length()) {
            arrayList3.add(new le0.c(l3bVar, i5, str2.length()));
        }
        if (arrayList3.isEmpty()) {
            i = 0;
            arrayList3.add(new le0.c(l3bVar, 0, 0));
        } else {
            i = 0;
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        int i14 = i;
        while (i14 < size2) {
            le0.c cVar5 = (le0.c) arrayList3.get(i14);
            int i15 = cVar5.b;
            int i16 = cVar5.c;
            String strSubstring = i15 != i16 ? str2.substring(i15, i16) : "";
            List listA = me0.a(le0Var2, i15, i16, new wa(3));
            le0 le0Var4 = new le0(strSubstring, (List<? extends le0.c<? extends le0.a>>) (listA == null ? zr4Var4 : listA));
            l3b l3bVar2 = (l3b) cVar5.a;
            if (l3bVar2.b == Integer.MIN_VALUE) {
                arrayList = arrayList3;
                i2 = size2;
                l3bVar2 = new l3b(l3bVar2.a, l3bVar.b, l3bVar2.c, l3bVar2.d, l3bVar2.e, l3bVar2.f, l3bVar2.g, l3bVar2.h, l3bVar2.i);
            } else {
                arrayList = arrayList3;
                i2 = size2;
            }
            tjf tjfVar3 = new tjf(tjfVar2.a, l3bVar.a(l3bVar2));
            List<le0.c<? extends le0.a>> list4 = le0Var4.a;
            List<le0.c<? extends le0.a>> list5 = list4 == null ? zr4Var4 : list4;
            List<le0.c<sab>> list6 = this.b;
            ArrayList arrayList5 = new ArrayList(list6.size());
            int size3 = list6.size();
            int i17 = 0;
            while (i17 < size3) {
                le0.c<sab> cVar6 = list6.get(i17);
                int i18 = cVar6.b;
                l3b l3bVar3 = l3bVar;
                int i19 = cVar6.c;
                if (me0.b(i15, i16, i18, i19)) {
                    if (i15 > i18 || i19 > i16) {
                        be7.a("placeholder can not overlap with paragraph.");
                    }
                    str = str2;
                    arrayList5.add(new le0.c(cVar6.a, i18 - i15, i19 - i15));
                } else {
                    str = str2;
                }
                i17++;
                l3bVar = l3bVar3;
                str2 = str;
            }
            arrayList4.add(new g3b(new k80(strSubstring, tjfVar3, list5, arrayList5, aVar, iy3Var), i15, i16));
            i14++;
            le0Var2 = le0Var;
            tjfVar2 = tjfVar;
            arrayList3 = arrayList;
            size2 = i2;
        }
        this.e = arrayList4;
    }

    @Override // defpackage.h3b
    public final boolean a() {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((g3b) arrayList.get(i)).a.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.h3b
    public final float b() {
        return ((Number) this.d.getValue()).floatValue();
    }

    @Override // defpackage.h3b
    public final float c() {
        return ((Number) this.c.getValue()).floatValue();
    }
}
