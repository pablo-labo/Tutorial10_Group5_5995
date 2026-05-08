package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.apache.avro.InvalidNumberEncodingException;
import org.apache.avro.SystemLimitException;

/* JADX INFO: loaded from: classes3.dex */
public final class f54 extends pf1 {
    public final j55 j;
    public final byte[] l = new byte[8];
    public final a k = new a();

    public class a {
        public a() {
        }
    }

    public f54(j55 j55Var) {
        this.j = j55Var;
    }

    @Override // defpackage.pf1
    public final void J1(int i, byte[] bArr, int i2) throws IOException {
        while (true) {
            int i3 = this.j.a.read(bArr, i, i2);
            if (i3 == i2 || i2 == 0) {
                return;
            }
            if (i3 < 0) {
                k20.n();
                return;
            } else {
                i += i3;
                i2 -= i3;
            }
        }
    }

    @Override // defpackage.pf1
    public final void L1(long j) throws IOException {
        while (j > 0) {
            long jSkip = this.j.a.skip(j);
            if (jSkip <= 0) {
                k20.n();
                return;
            }
            j -= jSkip;
        }
    }

    @Override // defpackage.pf1, defpackage.ka6
    public final boolean O0() throws IOException {
        int i = this.j.a.read();
        if (i >= 0) {
            return i == 1;
        }
        k20.n();
        return false;
    }

    @Override // defpackage.pf1, defpackage.ka6
    public final ByteBuffer P0(ByteBuffer byteBuffer) throws IOException {
        int iC = SystemLimitException.c(W0());
        a aVar = this.k;
        aVar.getClass();
        if (byteBuffer == null || iC > byteBuffer.capacity()) {
            byteBuffer = ByteBuffer.allocate(iC);
        }
        f54.this.J1(byteBuffer.position(), byteBuffer.array(), iC);
        return byteBuffer;
    }

    @Override // defpackage.pf1, defpackage.ka6
    public final double Q0() throws IOException {
        byte[] bArr = this.l;
        J1(0, bArr, 8);
        return Double.longBitsToDouble(((((long) bArr[7]) & 255) << 56) | (((long) bArr[0]) & 255) | ((((long) bArr[1]) & 255) << 8) | ((((long) bArr[2]) & 255) << 16) | ((((long) bArr[3]) & 255) << 24) | ((((long) bArr[4]) & 255) << 32) | ((((long) bArr[5]) & 255) << 40) | ((((long) bArr[6]) & 255) << 48));
    }

    @Override // defpackage.pf1, defpackage.ka6
    public final float T0() throws IOException {
        byte[] bArr = this.l;
        J1(0, bArr, 4);
        return Float.intBitsToFloat((bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16) | ((bArr[3] & 255) << 24));
    }

    @Override // defpackage.pf1, defpackage.ka6
    public final int V0() throws IOException {
        int i = 0;
        int i2 = 0;
        do {
            int i3 = this.j.a.read();
            if (i3 < 0) {
                k20.n();
                return 0;
            }
            i |= (i3 & 127) << i2;
            if ((i3 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
                return (i >>> 1) ^ (-(i & 1));
            }
            i2 += 7;
        } while (i2 < 32);
        throw new InvalidNumberEncodingException("Invalid int encoding");
    }

    @Override // defpackage.pf1, defpackage.ka6
    public final long W0() throws IOException {
        long j = 0;
        int i = 0;
        do {
            int i2 = this.j.a.read();
            if (i2 < 0) {
                k20.n();
                return 0L;
            }
            j |= (((long) i2) & 127) << i;
            if ((i2 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
                return (-(j & 1)) ^ (j >>> 1);
            }
            i += 7;
        } while (i < 64);
        throw new InvalidNumberEncodingException("Invalid long encoding");
    }
}
