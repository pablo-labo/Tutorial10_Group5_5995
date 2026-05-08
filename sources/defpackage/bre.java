package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.u86;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class bre implements u86 {
    public int[] a;
    public final u86.a c;
    public ByteBuffer d;
    public byte[] e;
    public short[] f;
    public byte[] g;
    public byte[] h;
    public byte[] i;
    public final int[] j;
    public int k;
    public b96 l;
    public Bitmap m;
    public final boolean n;
    public int o;
    public final int p;
    public final int q;
    public final int r;
    public Boolean s;
    public final int[] b = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
    public Bitmap.Config t = Bitmap.Config.ARGB_8888;

    public bre(u86.a aVar, b96 b96Var, ByteBuffer byteBuffer, int i) {
        this.c = aVar;
        this.l = new b96();
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int iHighestOneBit = Integer.highestOneBit(i);
                this.o = 0;
                this.l = b96Var;
                this.k = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.d = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.d.order(ByteOrder.LITTLE_ENDIAN);
                this.n = false;
                Iterator it = b96Var.e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((y86) it.next()).g == 3) {
                        this.n = true;
                        break;
                    }
                }
                this.p = iHighestOneBit;
                int i2 = b96Var.f;
                this.r = i2 / iHighestOneBit;
                int i3 = b96Var.g;
                this.q = i3 / iHighestOneBit;
                int i4 = i2 * i3;
                kt0 kt0Var = ((t86) this.c).b;
                this.i = kt0Var == null ? new byte[i4] : (byte[]) kt0Var.c(i4, byte[].class);
                u86.a aVar2 = this.c;
                int i5 = this.r * this.q;
                kt0 kt0Var2 = ((t86) aVar2).b;
                this.j = kt0Var2 == null ? new int[i5] : (int[]) kt0Var2.c(i5, int[].class);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        this.k = (this.k + 1) % this.l.c;
    }

    public final Bitmap b() {
        Boolean bool = this.s;
        Bitmap bitmapC = ((t86) this.c).a.c(this.r, this.q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.t);
        bitmapC.setHasAlpha(true);
        return bitmapC;
    }

    public final void c(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01e8 A[PHI: r7
  0x01e8: PHI (r7v18 int) = (r7v12 int), (r7v20 int), (r7v20 int) binds: [B:95:0x01d4, B:97:0x01df, B:98:0x01e1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v29, types: [short] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap d(defpackage.y86 r37, defpackage.y86 r38) {
        /*
            Method dump skipped, instruction units count: 1044
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bre.d(y86, y86):android.graphics.Bitmap");
    }

    @Override // defpackage.u86
    public final synchronized Bitmap getNextFrame() {
        try {
            if (this.l.c <= 0 || this.k < 0) {
                if (Log.isLoggable("bre", 3)) {
                    Log.d("bre", "Unable to decode frame, frameCount=" + this.l.c + ", framePointer=" + this.k);
                }
                this.o = 1;
            }
            int i = this.o;
            if (i != 1 && i != 2) {
                this.o = 0;
                if (this.e == null) {
                    kt0 kt0Var = ((t86) this.c).b;
                    this.e = kt0Var == null ? new byte[255] : (byte[]) kt0Var.c(255, byte[].class);
                }
                y86 y86Var = (y86) this.l.e.get(this.k);
                int i2 = this.k - 1;
                y86 y86Var2 = i2 >= 0 ? (y86) this.l.e.get(i2) : null;
                int[] iArr = y86Var.k;
                if (iArr == null) {
                    iArr = this.l.a;
                }
                this.a = iArr;
                if (iArr == null) {
                    if (Log.isLoggable("bre", 3)) {
                        Log.d("bre", "No valid color table found for frame #" + this.k);
                    }
                    this.o = 1;
                    return null;
                }
                if (y86Var.f) {
                    System.arraycopy(iArr, 0, this.b, 0, iArr.length);
                    int[] iArr2 = this.b;
                    this.a = iArr2;
                    iArr2[y86Var.h] = 0;
                    if (y86Var.g == 2 && this.k == 0) {
                        this.s = Boolean.TRUE;
                    }
                }
                return d(y86Var, y86Var2);
            }
            if (Log.isLoggable("bre", 3)) {
                Log.d("bre", "Unable to decode frame, status=" + this.o);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
