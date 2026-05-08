package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.x1f;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class o4b {
    public final q4b a;
    public x1f[] b;
    public int c;

    public o4b(x1f.m mVar, q4b q4bVar) {
        this.a = q4bVar;
        x1f[] x1fVarArr = new x1f[5];
        this.b = x1fVarArr;
        x1fVarArr[0] = mVar;
        this.c = 1;
    }

    public final x1f a(x1f x1fVar) {
        while (true) {
            x1f[] x1fVarArr = this.b;
            int i = this.c - 1;
            this.c = i;
            x1f x1fVar2 = x1fVarArr[i];
            if (x1fVar2 == x1fVar) {
                return x1fVar2;
            }
            x1f.j jVar = x1fVar2.a;
            if (jVar == x1f.j.f) {
                x1f x1fVarK1 = ((d5d) this.a).K1(x1fVar, x1fVar2);
                if (x1fVarK1 != null) {
                    return x1fVarK1;
                }
            } else {
                if (jVar == x1f.j.a) {
                    r40.l(akb.k("Attempt to process a ", String.valueOf(x1fVar), " when a ", String.valueOf(x1fVar2), " was expected."));
                    return null;
                }
                if (jVar == x1f.j.d && x1fVar == ((x1f.k) x1fVar2).j0) {
                    return x1fVar;
                }
                d(x1fVar2);
            }
        }
    }

    public final x1f b() {
        x1f[] x1fVarArr = this.b;
        int i = this.c - 1;
        this.c = i;
        return x1fVarArr[i];
    }

    public final void c() {
        while (true) {
            int i = this.c;
            if (i < 1) {
                return;
            }
            int i2 = i - 1;
            x1f x1fVar = this.b[i2];
            if (x1fVar.a != x1f.j.f || !((x1f.h) x1fVar).j0) {
                return;
            }
            this.c = i2;
            ((d5d) this.a).K1(null, x1fVar);
        }
    }

    public final void d(x1f x1fVar) {
        x1f[] x1fVarArr = x1fVar.b;
        while (true) {
            int i = this.c;
            int length = x1fVarArr.length + i;
            x1f[] x1fVarArr2 = this.b;
            if (length <= x1fVarArr2.length) {
                System.arraycopy(x1fVarArr, 0, x1fVarArr2, i, x1fVarArr.length);
                this.c += x1fVarArr.length;
                return;
            } else {
                this.b = (x1f[]) Arrays.copyOf(x1fVarArr2, Math.max(x1fVarArr2.length, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) + x1fVarArr2.length);
            }
        }
    }

    public final void e(x1f x1fVar) {
        int i = this.c;
        x1f[] x1fVarArr = this.b;
        if (i == x1fVarArr.length) {
            this.b = (x1f[]) Arrays.copyOf(x1fVarArr, Math.max(x1fVarArr.length, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) + x1fVarArr.length);
        }
        x1f[] x1fVarArr2 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        x1fVarArr2[i2] = x1fVar;
    }
}
