package defpackage;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class cgb {
    public final int a;
    public final cr1 b;

    public cgb(cr1 cr1Var) {
        web.e(true);
        this.a = 16384;
        this.b = cr1Var;
    }

    public final void a(InputStream inputStream, OutputStream outputStream) {
        cr1 cr1Var = this.b;
        int i = this.a;
        byte[] bArr = cr1Var.get(i);
        while (true) {
            try {
                int i2 = inputStream.read(bArr, 0, i);
                if (i2 == -1) {
                    return;
                } else {
                    outputStream.write(bArr, 0, i2);
                }
            } finally {
                cr1Var.a(bArr);
            }
        }
    }
}
