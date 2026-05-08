package androidx.datastore.preferences.protobuf;

import defpackage.sp9;
import defpackage.tr1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends h0<i0, i0> {
    @Override // androidx.datastore.preferences.protobuf.h0
    public final void a(i0 i0Var, int i, int i2) {
        i0Var.b((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void b(i0 i0Var, int i, long j) {
        i0Var.b((i << 3) | 1, Long.valueOf(j));
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void c(int i, Object obj, Object obj2) {
        ((i0) obj).b((i << 3) | 3, (i0) obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void d(i0 i0Var, int i, tr1 tr1Var) {
        i0Var.b((i << 3) | 2, tr1Var);
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void e(i0 i0Var, int i, long j) {
        i0Var.b(i << 3, Long.valueOf(j));
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final i0 f(Object obj) {
        n nVar = (n) obj;
        i0 i0Var = nVar.unknownFields;
        if (i0Var != i0.f) {
            return i0Var;
        }
        i0 i0Var2 = new i0();
        nVar.unknownFields = i0Var2;
        return i0Var2;
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final i0 g(Object obj) {
        return ((n) obj).unknownFields;
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final int h(i0 i0Var) {
        return i0Var.a();
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final int i(i0 i0Var) {
        i0 i0Var2 = i0Var;
        int i = i0Var2.d;
        if (i != -1) {
            return i;
        }
        int iJ1 = 0;
        for (int i2 = 0; i2 < i0Var2.a; i2++) {
            int i3 = i0Var2.b[i2] >>> 3;
            iJ1 += CodedOutputStream.J1(3, (tr1) i0Var2.c[i2]) + CodedOutputStream.S1(2, i3) + (CodedOutputStream.R1(1) * 2);
        }
        i0Var2.d = iJ1;
        return iJ1;
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void j(Object obj) {
        ((n) obj).unknownFields.e = false;
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final i0 k(Object obj, Object obj2) {
        i0 i0Var = (i0) obj;
        i0 i0Var2 = (i0) obj2;
        if (i0Var2.equals(i0.f)) {
            return i0Var;
        }
        int i = i0Var.a + i0Var2.a;
        int[] iArrCopyOf = Arrays.copyOf(i0Var.b, i);
        System.arraycopy(i0Var2.b, 0, iArrCopyOf, i0Var.a, i0Var2.a);
        Object[] objArrCopyOf = Arrays.copyOf(i0Var.c, i);
        System.arraycopy(i0Var2.c, 0, objArrCopyOf, i0Var.a, i0Var2.a);
        return new i0(i, iArrCopyOf, objArrCopyOf, true);
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final i0 m() {
        return new i0();
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void n(Object obj, i0 i0Var) {
        ((n) obj).unknownFields = i0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void o(Object obj, i0 i0Var) {
        ((n) obj).unknownFields = i0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final i0 p(Object obj) {
        i0 i0Var = (i0) obj;
        i0Var.e = false;
        return i0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void q(i0 i0Var, k0 k0Var) {
        i0 i0Var2 = i0Var;
        i0Var2.getClass();
        k0Var.getClass();
        for (int i = 0; i < i0Var2.a; i++) {
            int i2 = i0Var2.b[i] >>> 3;
            Object obj = i0Var2.c[i];
            boolean z = obj instanceof tr1;
            CodedOutputStream codedOutputStream = ((g) k0Var).a;
            if (z) {
                codedOutputStream.k2(i2, (tr1) obj);
            } else {
                codedOutputStream.j2(i2, (sp9) obj);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.h0
    public final void r(i0 i0Var, k0 k0Var) {
        i0Var.c(k0Var);
    }
}
