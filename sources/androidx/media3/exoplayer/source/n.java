package androidx.media3.exoplayer.source;

import android.media.MediaCodec;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.source.o;
import defpackage.b83;
import defpackage.g4b;
import defpackage.j20;
import defpackage.ka2;
import defpackage.qk3;
import defpackage.vjg;
import defpackage.zpf;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    public final qk3 a;
    public final int b;
    public final g4b c;
    public a d;
    public a e;
    public a f;
    public long g;

    public static final class a {
        public long a;
        public long b;
        public j20 c;
        public a d;

        public a(long j, int i) {
            ka2.q(this.c == null);
            this.a = j;
            this.b = j + ((long) i);
        }
    }

    public n(qk3 qk3Var) {
        this.a = qk3Var;
        int i = qk3Var.b;
        this.b = i;
        this.c = new g4b(32);
        a aVar = new a(0L, i);
        this.d = aVar;
        this.e = aVar;
        this.f = aVar;
    }

    public static a d(a aVar, long j, ByteBuffer byteBuffer, int i) {
        while (j >= aVar.b) {
            aVar = aVar.d;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (aVar.b - j));
            j20 j20Var = aVar.c;
            byteBuffer.put(j20Var.a, ((int) (j - aVar.a)) + j20Var.b, iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == aVar.b) {
                aVar = aVar.d;
            }
        }
        return aVar;
    }

    public static a e(a aVar, long j, byte[] bArr, int i) {
        while (j >= aVar.b) {
            aVar = aVar.d;
        }
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (aVar.b - j));
            j20 j20Var = aVar.c;
            System.arraycopy(j20Var.a, ((int) (j - aVar.a)) + j20Var.b, bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == aVar.b) {
                aVar = aVar.d;
            }
        }
        return aVar;
    }

    public static a f(a aVar, DecoderInputBuffer decoderInputBuffer, o.a aVar2, g4b g4bVar) {
        if (decoderInputBuffer.h(1073741824)) {
            long j = aVar2.b;
            int iD = 1;
            g4bVar.G(1);
            a aVarE = e(aVar, j, g4bVar.a, 1);
            long j2 = j + 1;
            byte b = g4bVar.a[0];
            boolean z = (b & 128) != 0;
            int i = b & 127;
            b83 b83Var = decoderInputBuffer.c;
            byte[] bArr = b83Var.a;
            if (bArr == null) {
                b83Var.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            aVar = e(aVarE, j2, b83Var.a, i);
            long j3 = j2 + ((long) i);
            if (z) {
                g4bVar.G(2);
                aVar = e(aVar, j3, g4bVar.a, 2);
                j3 += 2;
                iD = g4bVar.D();
            }
            int[] iArr = b83Var.d;
            if (iArr == null || iArr.length < iD) {
                iArr = new int[iD];
            }
            int[] iArr2 = b83Var.e;
            if (iArr2 == null || iArr2.length < iD) {
                iArr2 = new int[iD];
            }
            if (z) {
                int i2 = iD * 6;
                g4bVar.G(i2);
                aVar = e(aVar, j3, g4bVar.a, i2);
                j3 += (long) i2;
                g4bVar.J(0);
                for (int i3 = 0; i3 < iD; i3++) {
                    iArr[i3] = g4bVar.D();
                    iArr2[i3] = g4bVar.B();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = aVar2.a - ((int) (j3 - aVar2.b));
            }
            zpf.a aVar3 = aVar2.c;
            String str = vjg.a;
            byte[] bArr2 = aVar3.b;
            byte[] bArr3 = b83Var.a;
            int i4 = aVar3.a;
            int i5 = aVar3.c;
            int i6 = aVar3.d;
            b83Var.f = iD;
            b83Var.d = iArr;
            b83Var.e = iArr2;
            b83Var.b = bArr2;
            b83Var.a = bArr3;
            b83Var.c = i4;
            b83Var.g = i5;
            b83Var.h = i6;
            MediaCodec.CryptoInfo cryptoInfo = b83Var.i;
            cryptoInfo.numSubSamples = iD;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i4;
            b83.a aVar4 = b83Var.j;
            aVar4.getClass();
            MediaCodec.CryptoInfo.Pattern pattern = aVar4.b;
            pattern.set(i5, i6);
            aVar4.a.setPattern(pattern);
            long j4 = aVar2.b;
            int i7 = (int) (j3 - j4);
            aVar2.b = j4 + ((long) i7);
            aVar2.a -= i7;
        }
        if (!decoderInputBuffer.h(268435456)) {
            decoderInputBuffer.p(aVar2.a);
            return d(aVar, aVar2.b, decoderInputBuffer.d, aVar2.a);
        }
        g4bVar.G(4);
        a aVarE2 = e(aVar, aVar2.b, g4bVar.a, 4);
        int iB = g4bVar.B();
        aVar2.b += 4;
        aVar2.a -= 4;
        decoderInputBuffer.p(iB);
        a aVarD = d(aVarE2, aVar2.b, decoderInputBuffer.d, iB);
        aVar2.b += (long) iB;
        int i8 = aVar2.a - iB;
        aVar2.a = i8;
        ByteBuffer byteBuffer = decoderInputBuffer.V;
        if (byteBuffer == null || byteBuffer.capacity() < i8) {
            decoderInputBuffer.V = ByteBuffer.allocate(i8);
        } else {
            decoderInputBuffer.V.clear();
        }
        return d(aVarD, aVar2.b, decoderInputBuffer.V, aVar2.a);
    }

    public final void a(a aVar) {
        if (aVar.c == null) {
            return;
        }
        qk3 qk3Var = this.a;
        synchronized (qk3Var) {
            a aVar2 = aVar;
            while (aVar2 != null) {
                try {
                    j20[] j20VarArr = qk3Var.f;
                    int i = qk3Var.e;
                    qk3Var.e = i + 1;
                    j20 j20Var = aVar2.c;
                    j20Var.getClass();
                    j20VarArr[i] = j20Var;
                    qk3Var.d--;
                    aVar2 = aVar2.d;
                    if (aVar2 == null || aVar2.c == null) {
                        aVar2 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            qk3Var.notifyAll();
        }
        aVar.c = null;
        aVar.d = null;
    }

    public final void b(long j) {
        a aVar;
        if (j == -1) {
            return;
        }
        while (true) {
            aVar = this.d;
            if (j < aVar.b) {
                break;
            }
            qk3 qk3Var = this.a;
            j20 j20Var = aVar.c;
            synchronized (qk3Var) {
                j20[] j20VarArr = qk3Var.f;
                int i = qk3Var.e;
                qk3Var.e = i + 1;
                j20VarArr[i] = j20Var;
                qk3Var.d--;
                qk3Var.notifyAll();
            }
            a aVar2 = this.d;
            aVar2.c = null;
            a aVar3 = aVar2.d;
            aVar2.d = null;
            this.d = aVar3;
        }
        if (this.e.a < aVar.a) {
            this.e = aVar;
        }
    }

    public final int c(int i) {
        j20 j20Var;
        a aVar = this.f;
        if (aVar.c == null) {
            qk3 qk3Var = this.a;
            synchronized (qk3Var) {
                try {
                    int i2 = qk3Var.d + 1;
                    qk3Var.d = i2;
                    int i3 = qk3Var.e;
                    if (i3 > 0) {
                        j20[] j20VarArr = qk3Var.f;
                        int i4 = i3 - 1;
                        qk3Var.e = i4;
                        j20Var = j20VarArr[i4];
                        j20Var.getClass();
                        qk3Var.f[qk3Var.e] = null;
                    } else {
                        j20 j20Var2 = new j20(new byte[qk3Var.b], 0);
                        j20[] j20VarArr2 = qk3Var.f;
                        if (i2 > j20VarArr2.length) {
                            qk3Var.f = (j20[]) Arrays.copyOf(j20VarArr2, j20VarArr2.length * 2);
                        }
                        j20Var = j20Var2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            a aVar2 = new a(this.f.b, this.b);
            aVar.c = j20Var;
            aVar.d = aVar2;
        }
        return Math.min(i, (int) (this.f.b - this.g));
    }
}
