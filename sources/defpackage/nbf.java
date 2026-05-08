package defpackage;

import android.net.Uri;
import androidx.media3.datasource.a;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class nbf implements a {
    public final a a;
    public final ve3 b;
    public boolean c;
    public long d;

    public nbf(a aVar, ve3 ve3Var) {
        this.a = aVar;
        ve3Var.getClass();
        this.b = ve3Var;
    }

    @Override // androidx.media3.datasource.a
    public final Uri a() {
        return this.a.a();
    }

    @Override // androidx.media3.datasource.a
    public final long b(gf3 gf3Var) {
        long jB = this.a.b(gf3Var);
        this.d = jB;
        if (jB == 0) {
            return 0L;
        }
        if (gf3Var.g == -1 && jB != -1) {
            gf3Var = gf3Var.d(0L, jB);
        }
        this.c = true;
        this.b.b(gf3Var);
        return this.d;
    }

    @Override // androidx.media3.datasource.a
    public final void close() {
        ve3 ve3Var = this.b;
        try {
            this.a.close();
        } finally {
            if (this.c) {
                this.c = false;
                ve3Var.close();
            }
        }
    }

    @Override // androidx.media3.datasource.a
    public final Map<String, List<String>> e() {
        return this.a.e();
    }

    @Override // androidx.media3.datasource.a
    public final void i(grf grfVar) {
        grfVar.getClass();
        this.a.i(grfVar);
    }

    @Override // defpackage.te3
    public final int read(byte[] bArr, int i, int i2) {
        if (this.d == 0) {
            return -1;
        }
        int i3 = this.a.read(bArr, i, i2);
        if (i3 > 0) {
            this.b.write(bArr, i, i3);
            long j = this.d;
            if (j != -1) {
                this.d = j - ((long) i3);
            }
        }
        return i3;
    }
}
