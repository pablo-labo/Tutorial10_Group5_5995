package androidx.media3.datasource;

import android.net.Uri;
import defpackage.gf3;
import defpackage.grf;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class e implements a {
    public static final e a = new e();

    @Override // androidx.media3.datasource.a
    public final Uri a() {
        return null;
    }

    @Override // androidx.media3.datasource.a
    public final long b(gf3 gf3Var) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // androidx.media3.datasource.a
    public final void close() {
    }

    @Override // androidx.media3.datasource.a
    public final void i(grf grfVar) {
    }

    @Override // defpackage.te3
    public final int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}
