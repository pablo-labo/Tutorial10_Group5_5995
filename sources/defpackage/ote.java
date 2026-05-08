package defpackage;

import android.net.Uri;
import androidx.media3.datasource.a;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ote implements a {
    public final a a;
    public long b;
    public Uri c;
    public Map<String, List<String>> d;

    public ote(a aVar) {
        aVar.getClass();
        this.a = aVar;
        this.c = Uri.EMPTY;
        this.d = Collections.EMPTY_MAP;
    }

    @Override // androidx.media3.datasource.a
    public final Uri a() {
        return this.a.a();
    }

    @Override // androidx.media3.datasource.a
    public final long b(gf3 gf3Var) {
        a aVar = this.a;
        this.c = gf3Var.a;
        this.d = Collections.EMPTY_MAP;
        try {
            return aVar.b(gf3Var);
        } finally {
            Uri uriA = aVar.a();
            if (uriA != null) {
                this.c = uriA;
            }
            this.d = aVar.e();
        }
    }

    @Override // androidx.media3.datasource.a
    public final void close() {
        this.a.close();
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
        int i3 = this.a.read(bArr, i, i2);
        if (i3 != -1) {
            this.b += (long) i3;
        }
        return i3;
    }
}
