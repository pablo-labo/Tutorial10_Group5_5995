package defpackage;

import defpackage.rp9;
import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h3 implements rp9 {
    protected int memoizedHashCode = 0;

    public static abstract class a<BuilderType extends a> implements rp9.a {
        @Override // rp9.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public abstract BuilderType s0(e92 e92Var, s45 s45Var);

        /* JADX INFO: renamed from: h3$a$a, reason: collision with other inner class name */
        public static final class C0253a extends FilterInputStream {
            public int a;

            public C0253a(ByteArrayInputStream byteArrayInputStream, int i) {
                super(byteArrayInputStream);
                this.a = i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int available() {
                return Math.min(super.available(), this.a);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read(byte[] bArr, int i, int i2) throws IOException {
                int i3 = this.a;
                if (i3 <= 0) {
                    return -1;
                }
                int i4 = super.read(bArr, i, Math.min(i2, i3));
                if (i4 >= 0) {
                    this.a -= i4;
                }
                return i4;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final long skip(long j) throws IOException {
                long jSkip = super.skip(Math.min(j, this.a));
                if (jSkip >= 0) {
                    this.a = (int) (((long) this.a) - jSkip);
                }
                return jSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read() throws IOException {
                if (this.a <= 0) {
                    return -1;
                }
                int i = super.read();
                if (i >= 0) {
                    this.a--;
                }
                return i;
            }
        }
    }
}
