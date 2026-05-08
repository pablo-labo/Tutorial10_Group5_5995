package defpackage;

import com.airbnb.lottie.parser.moshi.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class oh8 {
    public static final a.C0108a a = a.C0108a.a("k");

    public static ArrayList a(a aVar, s69 s69Var, float f, tlg tlgVar, boolean z) {
        a aVar2;
        s69 s69Var2;
        float f2;
        tlg tlgVar2;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (aVar.v() == a.b.f) {
            s69Var.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        aVar.h();
        while (aVar.hasNext()) {
            if (aVar.N(a) != 0) {
                aVar.I();
            } else if (aVar.v() == a.b.a) {
                aVar.a();
                if (aVar.v() == a.b.V) {
                    a aVar3 = aVar;
                    s69 s69Var3 = s69Var;
                    float f3 = f;
                    tlg tlgVar3 = tlgVar;
                    boolean z3 = z;
                    lh8 lh8VarB = nh8.b(aVar3, s69Var3, f3, tlgVar3, false, z3);
                    aVar2 = aVar3;
                    s69Var2 = s69Var3;
                    f2 = f3;
                    tlgVar2 = tlgVar3;
                    z2 = z3;
                    arrayList.add(lh8VarB);
                } else {
                    aVar2 = aVar;
                    s69Var2 = s69Var;
                    f2 = f;
                    tlgVar2 = tlgVar;
                    z2 = z;
                    while (aVar2.hasNext()) {
                        arrayList.add(nh8.b(aVar2, s69Var2, f2, tlgVar2, true, z2));
                    }
                }
                aVar2.p();
                aVar = aVar2;
                s69Var = s69Var2;
                f = f2;
                tlgVar = tlgVar2;
                z = z2;
            } else {
                a aVar4 = aVar;
                arrayList.add(nh8.b(aVar4, s69Var, f, tlgVar, false, z));
                aVar = aVar4;
            }
        }
        aVar.s();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i;
        T t;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            lh8 lh8Var = (lh8) arrayList.get(i2);
            i2++;
            lh8 lh8Var2 = (lh8) arrayList.get(i2);
            lh8Var.h = Float.valueOf(lh8Var2.g);
            if (lh8Var.c == 0 && (t = lh8Var2.b) != 0) {
                lh8Var.c = t;
                if (lh8Var instanceof e6b) {
                    ((e6b) lh8Var).d();
                }
            }
        }
        lh8 lh8Var3 = (lh8) arrayList.get(i);
        if ((lh8Var3.b == 0 || lh8Var3.c == 0) && arrayList.size() > 1) {
            arrayList.remove(lh8Var3);
        }
    }
}
