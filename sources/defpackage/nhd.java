package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class nhd {
    public ezg a;
    public ArrayList<ezg> b;

    public static long a(ry3 ry3Var, long j) {
        ezg ezgVar = ry3Var.d;
        ArrayList arrayList = ry3Var.k;
        if (ezgVar instanceof nh6) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            ny3 ny3Var = (ny3) arrayList.get(i);
            if (ny3Var instanceof ry3) {
                ry3 ry3Var2 = (ry3) ny3Var;
                if (ry3Var2.d != ezgVar) {
                    jMin = Math.min(jMin, a(ry3Var2, ((long) ry3Var2.f) + j));
                }
            }
        }
        ry3 ry3Var3 = ezgVar.i;
        ry3 ry3Var4 = ezgVar.h;
        if (ry3Var != ry3Var3) {
            return jMin;
        }
        long j2 = j - ezgVar.j();
        return Math.min(Math.min(jMin, a(ry3Var4, j2)), j2 - ((long) ry3Var4.f));
    }

    public static long b(ry3 ry3Var, long j) {
        ezg ezgVar = ry3Var.d;
        ArrayList arrayList = ry3Var.k;
        if (ezgVar instanceof nh6) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            ny3 ny3Var = (ny3) arrayList.get(i);
            if (ny3Var instanceof ry3) {
                ry3 ry3Var2 = (ry3) ny3Var;
                if (ry3Var2.d != ezgVar) {
                    jMax = Math.max(jMax, b(ry3Var2, ((long) ry3Var2.f) + j));
                }
            }
        }
        ry3 ry3Var3 = ezgVar.h;
        ry3 ry3Var4 = ezgVar.i;
        if (ry3Var != ry3Var3) {
            return jMax;
        }
        long j2 = ezgVar.j() + j;
        return Math.max(Math.max(jMax, b(ry3Var4, j2)), j2 - ((long) ry3Var4.f));
    }
}
