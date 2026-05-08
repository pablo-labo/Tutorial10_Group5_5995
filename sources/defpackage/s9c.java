package defpackage;

import defpackage.r9c;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class s9c implements r9c.d {
    public final /* synthetic */ byte[] a;
    public final /* synthetic */ int[] b;

    public s9c(byte[] bArr, int[] iArr) {
        this.a = bArr;
        this.b = iArr;
    }

    @Override // r9c.d
    public final void a(r9c.c cVar, int i) throws IOException {
        int[] iArr = this.b;
        try {
            cVar.read(this.a, iArr[0], i);
            iArr[0] = iArr[0] + i;
        } finally {
            cVar.close();
        }
    }
}
