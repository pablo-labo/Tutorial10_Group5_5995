package defpackage;

import androidx.compose.ui.layout.f0;

/* JADX INFO: loaded from: classes.dex */
public final class tq8 implements f0 {
    public final qq8 a;
    public final o3a<Object> b = mna.a();

    public tq8(qq8 qq8Var) {
        this.a = qq8Var;
    }

    @Override // androidx.compose.ui.layout.f0
    public final void a(f0.a aVar) {
        o3a<Object> o3aVar = this.b;
        o3aVar.a();
        q3a<Object> q3aVar = aVar.a;
        Object[] objArr = q3aVar.b;
        long[] jArr = q3aVar.c;
        int i = q3aVar.e;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            Object objB = this.a.b(obj);
            int iD = o3aVar.d(objB);
            int i3 = iD >= 0 ? o3aVar.c[iD] : 0;
            if (i3 == 7) {
                aVar.remove(obj);
            } else {
                o3aVar.h(i3 + 1, objB);
            }
            i = i2;
        }
    }

    @Override // androidx.compose.ui.layout.f0
    public final boolean b(Object obj, Object obj2) {
        qq8 qq8Var = this.a;
        return wl7.b(qq8Var.b(obj), qq8Var.b(obj2));
    }
}
