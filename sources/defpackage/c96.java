package defpackage;

import android.util.Log;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class c96 {
    public ByteBuffer b;
    public b96 c;
    public final byte[] a = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
    public int d = 0;

    public final boolean a() {
        return this.c.b != 0;
    }

    public final b96 b() {
        byte[] bArr;
        if (this.b == null) {
            r6.g("You must call setData() before parseHeader()");
            return null;
        }
        if (a()) {
            return this.c;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) c());
        }
        boolean zStartsWith = sb.toString().startsWith("GIF");
        b96 b96Var = this.c;
        if (zStartsWith) {
            b96Var.f = this.b.getShort();
            this.c.g = this.b.getShort();
            int iC = c();
            b96 b96Var2 = this.c;
            b96Var2.h = (iC & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0;
            b96Var2.i = (int) Math.pow(2.0d, (iC & 7) + 1);
            this.c.j = c();
            b96 b96Var3 = this.c;
            c();
            b96Var3.getClass();
            if (this.c.h && !a()) {
                b96 b96Var4 = this.c;
                b96Var4.a = e(b96Var4.i);
                b96 b96Var5 = this.c;
                b96Var5.k = b96Var5.a[b96Var5.j];
            }
        } else {
            b96Var.b = 1;
        }
        if (!a()) {
            boolean z = false;
            while (!z && !a() && this.c.c <= Integer.MAX_VALUE) {
                int iC2 = c();
                if (iC2 == 33) {
                    int iC3 = c();
                    if (iC3 == 1) {
                        f();
                    } else if (iC3 == 249) {
                        this.c.d = new y86();
                        c();
                        int iC4 = c();
                        y86 y86Var = this.c.d;
                        int i2 = (iC4 & 28) >> 2;
                        y86Var.g = i2;
                        if (i2 == 0) {
                            y86Var.g = 1;
                        }
                        y86Var.f = (iC4 & 1) != 0;
                        short s = this.b.getShort();
                        if (s < 2) {
                            s = 10;
                        }
                        y86 y86Var2 = this.c.d;
                        y86Var2.i = s * 10;
                        y86Var2.h = c();
                        c();
                    } else if (iC3 == 254) {
                        f();
                    } else if (iC3 != 255) {
                        f();
                    } else {
                        d();
                        StringBuilder sb2 = new StringBuilder();
                        int i3 = 0;
                        while (true) {
                            bArr = this.a;
                            if (i3 >= 11) {
                                break;
                            }
                            sb2.append((char) bArr[i3]);
                            i3++;
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                d();
                                if (bArr[0] == 1) {
                                    byte b = bArr[1];
                                    byte b2 = bArr[2];
                                    this.c.getClass();
                                }
                                if (this.d > 0) {
                                }
                            } while (!a());
                        } else {
                            f();
                        }
                    }
                } else if (iC2 == 44) {
                    b96 b96Var6 = this.c;
                    if (b96Var6.d == null) {
                        b96Var6.d = new y86();
                    }
                    this.c.d.a = this.b.getShort();
                    this.c.d.b = this.b.getShort();
                    this.c.d.c = this.b.getShort();
                    this.c.d.d = this.b.getShort();
                    int iC5 = c();
                    boolean z2 = (iC5 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0;
                    int iPow = (int) Math.pow(2.0d, (iC5 & 7) + 1);
                    y86 y86Var3 = this.c.d;
                    y86Var3.e = (iC5 & 64) != 0;
                    if (z2) {
                        y86Var3.k = e(iPow);
                    } else {
                        y86Var3.k = null;
                    }
                    this.c.d.j = this.b.position();
                    c();
                    f();
                    if (!a()) {
                        b96 b96Var7 = this.c;
                        b96Var7.c++;
                        b96Var7.e.add(b96Var7.d);
                    }
                } else if (iC2 != 59) {
                    this.c.b = 1;
                } else {
                    z = true;
                }
            }
            b96 b96Var8 = this.c;
            if (b96Var8.c < 0) {
                b96Var8.b = 1;
            }
        }
        return this.c;
    }

    public final int c() {
        try {
            return this.b.get() & 255;
        } catch (Exception unused) {
            this.c.b = 1;
            return 0;
        }
    }

    public final void d() {
        int iC = c();
        this.d = iC;
        if (iC <= 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                i2 = this.d;
                if (i >= i2) {
                    return;
                }
                i2 -= i;
                this.b.get(this.a, i, i2);
                i += i2;
            } catch (Exception e) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder sbF = uz.f("Error Reading Block n: ", i, " count: ", i2, " blockSize: ");
                    sbF.append(this.d);
                    Log.d("GifHeaderParser", sbF.toString(), e);
                }
                this.c.b = 1;
                return;
            }
        }
    }

    public final int[] e(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.b.get(bArr);
            iArr = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = bArr[i3] & 255;
                int i5 = i3 + 2;
                int i6 = bArr[i3 + 1] & 255;
                i3 += 3;
                int i7 = i2 + 1;
                iArr[i2] = (i6 << 8) | (i4 << 16) | (-16777216) | (bArr[i5] & 255);
                i2 = i7;
            }
            return iArr;
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.c.b = 1;
            return iArr;
        }
    }

    public final void f() {
        int iC;
        do {
            iC = c();
            this.b.position(Math.min(this.b.position() + iC, this.b.limit()));
        } while (iC > 0);
    }
}
