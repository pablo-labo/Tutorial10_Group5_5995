package defpackage;

import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import org.apache.avro.AvroRuntimeException;
import org.apache.avro.g;
import org.apache.avro.h;

/* JADX INFO: loaded from: classes3.dex */
public final class vf1<D> {
    public static final byte[] a = {-61, 1};

    public static class a<D> extends yic<D> {
        public final byte[] c;

        public a(zoe zoeVar, g gVar) {
            super(zoeVar, gVar);
            try {
                long jB = h.b(h.c(gVar).getBytes(StandardCharsets.UTF_8));
                byte[] bArr = new byte[8];
                for (int i = 0; i < 8; i++) {
                    bArr[i] = (byte) jB;
                    jB >>= 8;
                }
                byte[] bArr2 = new byte[10];
                System.arraycopy(vf1.a, 0, bArr2, 0, 2);
                System.arraycopy(bArr, 0, bArr2, 2, 8);
                this.c = bArr2;
            } catch (NoSuchAlgorithmException e) {
                throw new AvroRuntimeException(e);
            }
        }
    }
}
