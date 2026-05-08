package defpackage;

import defpackage.i4;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g4<S extends i4<?>> {
    public S[] a;
    public int b;
    public int c;
    public lxe d;

    public final lxe f() {
        lxe lxeVar;
        synchronized (this) {
            lxeVar = this.d;
            if (lxeVar == null) {
                int i = this.b;
                lxeVar = new lxe(1, Integer.MAX_VALUE, eo1.b);
                lxeVar.b(Integer.valueOf(i));
                this.d = lxeVar;
            }
        }
        return lxeVar;
    }

    public final S g() {
        S s;
        lxe lxeVar;
        synchronized (this) {
            try {
                S[] sArr = this.a;
                if (sArr == null) {
                    sArr = (S[]) k();
                    this.a = sArr;
                } else if (this.b >= sArr.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(sArr, sArr.length * 2);
                    this.a = (S[]) ((i4[]) objArrCopyOf);
                    sArr = (S[]) ((i4[]) objArrCopyOf);
                }
                int i = this.c;
                do {
                    s = sArr[i];
                    if (s == null) {
                        s = (S) j();
                        sArr[i] = s;
                    }
                    i++;
                    if (i >= sArr.length) {
                        i = 0;
                    }
                } while (!s.a(this));
                this.c = i;
                this.b++;
                lxeVar = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (lxeVar != null) {
            lxeVar.z(1);
        }
        return s;
    }

    public abstract S j();

    public abstract i4[] k();

    public final void l(S s) {
        lxe lxeVar;
        int i;
        lu2[] lu2VarArrB;
        synchronized (this) {
            try {
                int i2 = this.b - 1;
                this.b = i2;
                lxeVar = this.d;
                if (i2 == 0) {
                    this.c = 0;
                }
                s.getClass();
                lu2VarArrB = s.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (lu2 lu2Var : lu2VarArrB) {
            if (lu2Var != null) {
                lu2Var.resumeWith(j6g.a);
            }
        }
        if (lxeVar != null) {
            lxeVar.z(-1);
        }
    }
}
