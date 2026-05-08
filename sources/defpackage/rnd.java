package defpackage;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import androidx.media3.common.a;
import androidx.media3.common.util.GlUtil;
import defpackage.m3c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class rnd implements rng, cw1 {
    public int X;
    public SurfaceTexture Y;
    public byte[] b0;
    public final AtomicBoolean a = new AtomicBoolean();
    public final AtomicBoolean b = new AtomicBoolean(true);
    public final o3c c = new o3c();
    public final us5 d = new us5();
    public final dmf<Long> e = new dmf<>();
    public final dmf<m3c> f = new dmf<>();
    public final float[] V = new float[16];
    public final float[] W = new float[16];
    public volatile int Z = 0;
    public int a0 = -1;

    @Override // defpackage.cw1
    public final void a(long j, float[] fArr) {
        this.d.c.a(fArr, j);
    }

    public final SurfaceTexture b() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            GlUtil.b();
            this.c.a();
            GlUtil.b();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            GlUtil.b();
            int i = iArr[0];
            GlUtil.a(36197, i);
            this.X = i;
        } catch (GlUtil.GlException e) {
            zkd.x("SceneRenderer", "Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.X);
        this.Y = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: qnd
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.a.a.set(true);
            }
        });
        return this.Y;
    }

    @Override // defpackage.cw1
    public final void d() {
        this.e.b();
        us5 us5Var = this.d;
        us5Var.c.b();
        us5Var.d = false;
        this.b.set(true);
    }

    @Override // defpackage.rng
    public final void e(long j, long j2, a aVar, MediaFormat mediaFormat) {
        int i;
        ArrayList<m3c.a> arrayListA;
        int iJ;
        this.e.a(Long.valueOf(j), j2);
        byte[] bArr = aVar.B;
        int i2 = aVar.C;
        byte[] bArr2 = this.b0;
        int i3 = this.a0;
        this.b0 = bArr;
        if (i2 == -1) {
            i2 = this.Z;
        }
        this.a0 = i2;
        if (i3 == i2 && Arrays.equals(bArr2, this.b0)) {
            return;
        }
        byte[] bArr3 = this.b0;
        m3c m3cVar = null;
        if (bArr3 != null) {
            int i4 = this.a0;
            g4b g4bVar = new g4b(bArr3);
            try {
                g4bVar.K(4);
                iJ = g4bVar.j();
                g4bVar.J(0);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (iJ == 1886547818) {
                g4bVar.K(8);
                int i5 = g4bVar.b;
                int i6 = g4bVar.c;
                while (i5 < i6) {
                    int iJ2 = g4bVar.j() + i5;
                    if (iJ2 > i5 && iJ2 <= i6) {
                        int iJ3 = g4bVar.j();
                        if (iJ3 != 2037673328 && iJ3 != 1836279920) {
                            g4bVar.J(iJ2);
                            i5 = iJ2;
                        }
                        g4bVar.I(iJ2);
                        arrayListA = n3c.a(g4bVar);
                        break;
                    }
                    break;
                }
                arrayListA = null;
            } else {
                arrayListA = n3c.a(g4bVar);
            }
            if (arrayListA != null) {
                int size = arrayListA.size();
                if (size == 1) {
                    m3c.a aVar2 = arrayListA.get(0);
                    m3cVar = new m3c(aVar2, aVar2, i4);
                } else if (size == 2) {
                    m3cVar = new m3c(arrayListA.get(0), arrayListA.get(1), i4);
                }
            }
        }
        if (m3cVar == null || !o3c.b(m3cVar)) {
            int i7 = this.a0;
            float radians = (float) Math.toRadians(180.0d);
            float radians2 = (float) Math.toRadians(360.0d);
            float f = radians / 36.0f;
            float f2 = radians2 / 72.0f;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < 36; i10 = i) {
                float f3 = radians / 2.0f;
                float f4 = (i10 * f) - f3;
                i = i10 + 1;
                float f5 = (i * f) - f3;
                int i11 = 0;
                while (i11 < 73) {
                    int i12 = i;
                    int i13 = 0;
                    int i14 = 2;
                    while (i13 < i14) {
                        float f6 = radians;
                        float f7 = i11 * f2;
                        float f8 = radians2;
                        double d = (f7 + 3.1415927f) - (radians2 / 2.0f);
                        double d2 = i13 == 0 ? f4 : f5;
                        fArr[i8] = -((float) (Math.cos(d2) * Math.sin(d) * 50.0d));
                        fArr[i8 + 1] = (float) (Math.sin(d2) * 50.0d);
                        int i15 = i8 + 3;
                        float f9 = f;
                        fArr[i8 + 2] = (float) (Math.cos(d2) * Math.cos(d) * 50.0d);
                        fArr2[i9] = f7 / f8;
                        int i16 = i9 + 2;
                        fArr2[i9 + 1] = ((i10 + i13) * f9) / f6;
                        if ((i11 == 0 && i13 == 0) || (i11 == 72 && i13 == 1)) {
                            System.arraycopy(fArr, i8, fArr, i15, 3);
                            i8 += 6;
                            i14 = 2;
                            System.arraycopy(fArr2, i9, fArr2, i16, 2);
                            i9 += 4;
                        } else {
                            i14 = 2;
                            i8 = i15;
                            i9 = i16;
                        }
                        i13++;
                        radians = f6;
                        f = f9;
                        radians2 = f8;
                    }
                    i11++;
                    i = i12;
                }
            }
            m3c.a aVar3 = new m3c.a(new m3c.b(0, 1, fArr, fArr2));
            m3cVar = new m3c(aVar3, aVar3, i7);
        }
        this.f.a(m3cVar, j2);
    }
}
