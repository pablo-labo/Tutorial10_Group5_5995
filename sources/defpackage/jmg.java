package defpackage;

import androidx.compose.runtime.b;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jmg {
    public static final void a(nd6 nd6Var, fmg fmgVar) {
        List<hmg> list = fmgVar.Y;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            hmg hmgVar = list.get(i);
            if (hmgVar instanceof kmg) {
                z5b z5bVar = new z5b();
                kmg kmgVar = (kmg) hmgVar;
                z5bVar.d = kmgVar.b;
                z5bVar.n = true;
                z5bVar.c();
                z5bVar.s.e(kmgVar.c);
                z5bVar.c();
                z5bVar.c();
                z5bVar.b = kmgVar.d;
                z5bVar.c();
                z5bVar.c = kmgVar.e;
                z5bVar.c();
                z5bVar.g = kmgVar.f;
                z5bVar.c();
                z5bVar.e = kmgVar.V;
                z5bVar.c();
                z5bVar.f = kmgVar.W;
                z5bVar.o = true;
                z5bVar.c();
                z5bVar.h = kmgVar.X;
                z5bVar.o = true;
                z5bVar.c();
                z5bVar.i = kmgVar.Y;
                z5bVar.o = true;
                z5bVar.c();
                z5bVar.j = kmgVar.Z;
                z5bVar.o = true;
                z5bVar.c();
                z5bVar.k = kmgVar.a0;
                z5bVar.p = true;
                z5bVar.c();
                z5bVar.l = kmgVar.b0;
                z5bVar.p = true;
                z5bVar.c();
                z5bVar.m = kmgVar.c0;
                z5bVar.p = true;
                z5bVar.c();
                nd6Var.e(i, z5bVar);
            } else if (hmgVar instanceof fmg) {
                nd6 nd6Var2 = new nd6();
                fmg fmgVar2 = (fmg) hmgVar;
                nd6Var2.k = fmgVar2.a;
                nd6Var2.c();
                nd6Var2.l = fmgVar2.b;
                nd6Var2.s = true;
                nd6Var2.c();
                nd6Var2.o = fmgVar2.e;
                nd6Var2.s = true;
                nd6Var2.c();
                nd6Var2.p = fmgVar2.f;
                nd6Var2.s = true;
                nd6Var2.c();
                nd6Var2.q = fmgVar2.V;
                nd6Var2.s = true;
                nd6Var2.c();
                nd6Var2.r = fmgVar2.W;
                nd6Var2.s = true;
                nd6Var2.c();
                nd6Var2.m = fmgVar2.c;
                nd6Var2.s = true;
                nd6Var2.c();
                nd6Var2.n = fmgVar2.d;
                nd6Var2.s = true;
                nd6Var2.c();
                nd6Var2.f = fmgVar2.X;
                nd6Var2.g = true;
                nd6Var2.c();
                a(nd6Var2, fmgVar2);
                nd6Var.e(i, nd6Var2);
            }
        }
    }

    public static final img b(p37 p37Var, b bVar) {
        iy3 iy3Var = (iy3) bVar.M(um2.h);
        boolean zE = bVar.e((((long) Float.floatToRawIntBits(iy3Var.getDensity())) & 4294967295L) | (((long) Float.floatToRawIntBits(p37Var.j)) << 32));
        Object objV = bVar.v();
        if (zE || objV == b.a.a) {
            nd6 nd6Var = new nd6();
            a(nd6Var, p37Var.f);
            j6g j6gVar = j6g.a;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(iy3Var.t1(p37Var.b))) << 32) | (((long) Float.floatToRawIntBits(iy3Var.t1(p37Var.c))) & 4294967295L);
            float fIntBitsToFloat = p37Var.d;
            float fIntBitsToFloat2 = p37Var.e;
            if (Float.isNaN(fIntBitsToFloat)) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            }
            if (Float.isNaN(fIntBitsToFloat2)) {
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)));
            img imgVar = new img(nd6Var);
            String str = p37Var.a;
            long j = p37Var.g;
            ih1 ih1Var = j != 16 ? new ih1(j, p37Var.h) : null;
            boolean z = p37Var.i;
            ((gme) imgVar.f).setValue(new kie(jFloatToRawIntBits));
            ((gme) imgVar.V).setValue(Boolean.valueOf(z));
            dmg dmgVar = imgVar.W;
            ((gme) dmgVar.g).setValue(ih1Var);
            ((gme) dmgVar.i).setValue(new kie(jFloatToRawIntBits2));
            dmgVar.c = str;
            bVar.p(imgVar);
            objV = imgVar;
        }
        return (img) objV;
    }
}
