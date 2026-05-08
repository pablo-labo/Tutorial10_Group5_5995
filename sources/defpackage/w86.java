package defpackage;

import android.graphics.Bitmap;
import defpackage.u86;
import defpackage.z86;

/* JADX INFO: loaded from: classes.dex */
public final class w86 extends wb4<v86> {
    @Override // defpackage.f5d
    public final int a() {
        z86 z86Var = ((v86) this.a).a.a;
        bre breVar = z86Var.a;
        return (breVar.j.length * 4) + breVar.d.limit() + breVar.i.length + z86Var.o;
    }

    @Override // defpackage.f5d
    public final Class<v86> b() {
        return v86.class;
    }

    @Override // defpackage.wb4, defpackage.kd7
    public final void initialize() {
        ((v86) this.a).a.a.l.prepareToDraw();
    }

    @Override // defpackage.f5d
    public final void recycle() {
        kt0 kt0Var;
        kt0 kt0Var2;
        kt0 kt0Var3;
        v86 v86Var = (v86) this.a;
        v86Var.stop();
        v86Var.d = true;
        z86 z86Var = v86Var.a.a;
        j4d j4dVar = z86Var.d;
        z86Var.c.clear();
        Bitmap bitmap = z86Var.l;
        if (bitmap != null) {
            z86Var.e.d(bitmap);
            z86Var.l = null;
        }
        z86Var.f = false;
        z86.a aVar = z86Var.i;
        if (aVar != null) {
            j4dVar.h(aVar);
            z86Var.i = null;
        }
        z86.a aVar2 = z86Var.k;
        if (aVar2 != null) {
            j4dVar.h(aVar2);
            z86Var.k = null;
        }
        z86.a aVar3 = z86Var.n;
        if (aVar3 != null) {
            j4dVar.h(aVar3);
            z86Var.n = null;
        }
        bre breVar = z86Var.a;
        u86.a aVar4 = breVar.c;
        breVar.l = null;
        byte[] bArr = breVar.i;
        if (bArr != null && (kt0Var3 = ((t86) aVar4).b) != null) {
            kt0Var3.put(bArr);
        }
        int[] iArr = breVar.j;
        if (iArr != null && (kt0Var2 = ((t86) aVar4).b) != null) {
            kt0Var2.put(iArr);
        }
        Bitmap bitmap2 = breVar.m;
        if (bitmap2 != null) {
            ((t86) aVar4).a.d(bitmap2);
        }
        breVar.m = null;
        breVar.d = null;
        breVar.s = null;
        byte[] bArr2 = breVar.e;
        if (bArr2 != null && (kt0Var = ((t86) aVar4).b) != null) {
            kt0Var.put(bArr2);
        }
        z86Var.j = true;
    }
}
