package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.dye;
import defpackage.e47;
import defpackage.n83;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ce4 implements dye {
    public static final byte[] h = {0, 7, 8, 15};
    public static final byte[] i = {0, 119, -120, -1};
    public static final byte[] j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public final Paint a;
    public final Paint b;
    public final Canvas c;
    public final b d;
    public final a e;
    public final h f;
    public Bitmap g;

    public static final class a {
        public final int a;
        public final int[] b;
        public final int[] c;
        public final int[] d;

        public a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.a = i;
            this.b = iArr;
            this.c = iArr2;
            this.d = iArr3;
        }
    }

    public static final class b {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
        }
    }

    public static final class c {
        public final int a;
        public final boolean b;
        public final byte[] c;
        public final byte[] d;

        public c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.a = i;
            this.b = z;
            this.c = bArr;
            this.d = bArr2;
        }
    }

    public static final class d {
        public final int a;
        public final int b;
        public final SparseArray<e> c;

        public d(int i, int i2, SparseArray sparseArray) {
            this.a = i;
            this.b = i2;
            this.c = sparseArray;
        }
    }

    public static final class e {
        public final int a;
        public final int b;

        public e(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public static final class f {
        public final int a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final SparseArray<g> j;

        public f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, SparseArray sparseArray) {
            this.a = i;
            this.b = z;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            this.h = i7;
            this.i = i8;
            this.j = sparseArray;
        }
    }

    public static final class g {
        public final int a;
        public final int b;

        public g(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public static final class h {
        public final int a;
        public final int b;
        public final SparseArray<f> c = new SparseArray<>();
        public final SparseArray<a> d = new SparseArray<>();
        public final SparseArray<c> e = new SparseArray<>();
        public final SparseArray<a> f = new SparseArray<>();
        public final SparseArray<c> g = new SparseArray<>();
        public b h;
        public d i;

        public h(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public ce4(List<byte[]> list) {
        g4b g4bVar = new g4b(list.get(0));
        int iD = g4bVar.D();
        int iD2 = g4bVar.D();
        Paint paint = new Paint();
        this.a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.c = new Canvas();
        this.d = new b(719, 575, 0, 719, 0, 575);
        this.e = new a(0, new int[]{0, -1, -16777216, -8421505}, e(), f());
        this.f = new h(iD, iD2);
    }

    public static byte[] d(int i2, int i3, f4b f4bVar) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) f4bVar.g(i3);
        }
        return bArr;
    }

    public static int[] e() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = g(255, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i2] = g(255, (i2 & 1) != 0 ? 127 : 0, (i2 & 2) != 0 ? 127 : 0, (i2 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] f() {
        int[] iArr = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = g(63, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & 136;
                if (i3 == 0) {
                    iArr[i2] = g(255, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 8) {
                    iArr[i2] = g(127, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 128) {
                    iArr[i2] = g(255, ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = g(255, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int g(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0203 A[LOOP:3: B:87:0x0156->B:119:0x0203, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ff A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void h(byte[] r21, int[] r22, int r23, int r24, int r25, android.graphics.Paint r26, android.graphics.Canvas r27) {
        /*
            Method dump skipped, instruction units count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ce4.h(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static a i(f4b f4bVar, int i2) {
        int iG;
        int i3;
        int iG2;
        int iG3;
        int iG4;
        int i4 = 8;
        int iG5 = f4bVar.g(8);
        f4bVar.o(8);
        int i5 = 2;
        int i6 = i2 - 2;
        int i7 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] iArrE = e();
        int[] iArrF = f();
        while (i6 > 0) {
            int iG6 = f4bVar.g(i4);
            int iG7 = f4bVar.g(i4);
            int[] iArr2 = (iG7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? iArr : (iG7 & 64) != 0 ? iArrE : iArrF;
            if ((iG7 & 1) != 0) {
                iG3 = f4bVar.g(i4);
                iG4 = f4bVar.g(i4);
                iG = f4bVar.g(i4);
                iG2 = f4bVar.g(i4);
                i3 = i6 - 6;
            } else {
                int iG8 = f4bVar.g(6) << i5;
                int iG9 = f4bVar.g(4) << 4;
                iG = f4bVar.g(4) << 4;
                i3 = i6 - 4;
                iG2 = f4bVar.g(i5) << 6;
                iG3 = iG8;
                iG4 = iG9;
            }
            if (iG3 == 0) {
                iG4 = i7;
                iG = iG4;
                iG2 = 255;
            }
            double d2 = iG3;
            double d3 = iG4 - 128;
            double d4 = iG - 128;
            iArr2[iG6] = g((byte) (255 - (iG2 & 255)), vjg.i((int) ((1.402d * d3) + d2), 0, 255), vjg.i((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 0, 255), vjg.i((int) ((d4 * 1.772d) + d2), 0, 255));
            i6 = i3;
            i7 = 0;
            iG5 = iG5;
            iArrF = iArrF;
            i4 = 8;
            i5 = 2;
        }
        return new a(iG5, iArr, iArrE, iArrF);
    }

    public static c j(f4b f4bVar) {
        byte[] bArr;
        int iG = f4bVar.g(16);
        f4bVar.o(4);
        int iG2 = f4bVar.g(2);
        boolean zF = f4bVar.f();
        f4bVar.o(1);
        byte[] bArr2 = vjg.b;
        if (iG2 != 1) {
            if (iG2 == 0) {
                int iG3 = f4bVar.g(16);
                int iG4 = f4bVar.g(16);
                if (iG3 > 0) {
                    bArr2 = new byte[iG3];
                    f4bVar.j(iG3, bArr2);
                }
                if (iG4 > 0) {
                    bArr = new byte[iG4];
                    f4bVar.j(iG4, bArr);
                }
            }
            return new c(iG, zF, bArr2, bArr);
        }
        f4bVar.o(f4bVar.g(8) * 16);
        bArr = bArr2;
        return new c(iG, zF, bArr2, bArr);
    }

    @Override // defpackage.dye
    public final void b(byte[] bArr, int i2, int i3, dye.b bVar, wq2<s83> wq2Var) {
        h hVar;
        boolean z;
        s83 s83Var;
        char c2;
        char c3;
        char c4;
        int i4;
        b bVar2;
        ArrayList arrayList;
        int i5;
        f fVar;
        int i6;
        int i7;
        int i8;
        h hVar2;
        int i9;
        f fVar2;
        int iG;
        int iG2;
        int i10;
        int iG3;
        f4b f4bVar = new f4b(bArr, i2 + i3);
        f4bVar.m(i2);
        while (true) {
            int iB = f4bVar.b();
            hVar = this.f;
            z = true;
            if (iB >= 48 && f4bVar.g(8) == 15) {
                int iG4 = f4bVar.g(8);
                int iG5 = f4bVar.g(16);
                int iG6 = f4bVar.g(16);
                int iD = f4bVar.d() + iG6;
                if (iG6 * 8 > f4bVar.b()) {
                    zkd.T("DvbParser", "Data field length exceeds limit");
                    f4bVar.o(f4bVar.b());
                } else {
                    switch (iG4) {
                        case 16:
                            if (iG5 == hVar.a) {
                                d dVar = hVar.i;
                                f4bVar.g(8);
                                int iG7 = f4bVar.g(4);
                                int iG8 = f4bVar.g(2);
                                f4bVar.o(2);
                                int i11 = iG6 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i11 > 0) {
                                    int iG9 = f4bVar.g(8);
                                    f4bVar.o(8);
                                    i11 -= 6;
                                    sparseArray.put(iG9, new e(f4bVar.g(16), f4bVar.g(16)));
                                }
                                d dVar2 = new d(iG7, iG8, sparseArray);
                                if (iG8 != 0) {
                                    hVar.i = dVar2;
                                    hVar.c.clear();
                                    hVar.d.clear();
                                    hVar.e.clear();
                                } else if (dVar != null && dVar.a != iG7) {
                                    hVar.i = dVar2;
                                }
                            }
                            break;
                        case 17:
                            d dVar3 = hVar.i;
                            SparseArray<f> sparseArray2 = hVar.c;
                            if (iG5 == hVar.a && dVar3 != null) {
                                int iG10 = f4bVar.g(8);
                                f4bVar.o(4);
                                boolean zF = f4bVar.f();
                                f4bVar.o(3);
                                int iG11 = f4bVar.g(16);
                                int iG12 = f4bVar.g(16);
                                f4bVar.g(3);
                                int iG13 = f4bVar.g(3);
                                f4bVar.o(2);
                                int iG14 = f4bVar.g(8);
                                int iG15 = f4bVar.g(8);
                                int iG16 = f4bVar.g(4);
                                int iG17 = f4bVar.g(2);
                                f4bVar.o(2);
                                int i12 = iG6 - 10;
                                SparseArray sparseArray3 = new SparseArray();
                                while (i12 > 0) {
                                    int iG18 = f4bVar.g(16);
                                    int iG19 = f4bVar.g(2);
                                    f4bVar.g(2);
                                    int iG20 = f4bVar.g(12);
                                    f4bVar.o(4);
                                    int iG21 = f4bVar.g(12);
                                    int i13 = i12 - 6;
                                    if (iG19 == 1 || iG19 == 2) {
                                        f4bVar.g(8);
                                        f4bVar.g(8);
                                        i12 -= 8;
                                    } else {
                                        i12 = i13;
                                    }
                                    sparseArray3.put(iG18, new g(iG20, iG21));
                                }
                                f fVar3 = new f(iG10, zF, iG11, iG12, iG13, iG14, iG15, iG16, iG17, sparseArray3);
                                if (dVar3.b == 0 && (fVar2 = sparseArray2.get(iG10)) != null) {
                                    SparseArray<g> sparseArray4 = fVar2.j;
                                    for (int i14 = 0; i14 < sparseArray4.size(); i14++) {
                                        fVar3.j.put(sparseArray4.keyAt(i14), sparseArray4.valueAt(i14));
                                    }
                                }
                                sparseArray2.put(fVar3.a, fVar3);
                            }
                            break;
                        case 18:
                            if (iG5 == hVar.a) {
                                a aVarI = i(f4bVar, iG6);
                                hVar.d.put(aVarI.a, aVarI);
                            } else if (iG5 == hVar.b) {
                                a aVarI2 = i(f4bVar, iG6);
                                hVar.f.put(aVarI2.a, aVarI2);
                            }
                            break;
                        case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                            if (iG5 == hVar.a) {
                                c cVarJ = j(f4bVar);
                                hVar.e.put(cVarJ.a, cVarJ);
                            } else if (iG5 == hVar.b) {
                                c cVarJ2 = j(f4bVar);
                                hVar.g.put(cVarJ2.a, cVarJ2);
                            }
                            break;
                        case 20:
                            if (iG5 == hVar.a) {
                                f4bVar.o(4);
                                boolean zF2 = f4bVar.f();
                                f4bVar.o(3);
                                int iG22 = f4bVar.g(16);
                                int iG23 = f4bVar.g(16);
                                if (zF2) {
                                    int iG24 = f4bVar.g(16);
                                    iG = f4bVar.g(16);
                                    iG3 = f4bVar.g(16);
                                    iG2 = f4bVar.g(16);
                                    i10 = iG24;
                                } else {
                                    iG = iG22;
                                    iG2 = iG23;
                                    i10 = 0;
                                    iG3 = 0;
                                }
                                hVar.h = new b(iG22, iG23, i10, iG, iG3, iG2);
                            }
                            break;
                    }
                    f4bVar.p(iD - f4bVar.d());
                }
            }
        }
        d dVar4 = hVar.i;
        if (dVar4 == null) {
            e47.b bVar3 = e47.b;
            s83Var = new s83(-9223372036854775807L, -9223372036854775807L, qyc.e);
        } else {
            b bVar4 = hVar.h;
            if (bVar4 == null) {
                bVar4 = this.d;
            }
            Bitmap bitmap = this.g;
            Canvas canvas = this.c;
            if (bitmap == null || bVar4.a + 1 != bitmap.getWidth() || bVar4.b + 1 != this.g.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bVar4.a + 1, bVar4.b + 1, Bitmap.Config.ARGB_8888);
                this.g = bitmapCreateBitmap;
                canvas.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            SparseArray<e> sparseArray5 = dVar4.c;
            int i15 = 0;
            while (i15 < sparseArray5.size()) {
                canvas.save();
                e eVarValueAt = sparseArray5.valueAt(i15);
                f fVar4 = hVar.c.get(sparseArray5.keyAt(i15));
                int i16 = eVarValueAt.a + bVar4.c;
                int i17 = eVarValueAt.b + bVar4.e;
                int i18 = fVar4.c;
                int i19 = fVar4.f;
                int i20 = fVar4.d;
                boolean z2 = z;
                int i21 = i16 + i18;
                int i22 = i17 + i20;
                SparseArray<e> sparseArray6 = sparseArray5;
                canvas.clipRect(i16, i17, Math.min(i21, bVar4.d), Math.min(i22, bVar4.f));
                a aVar = hVar.d.get(i19);
                if (aVar == null && (aVar = hVar.f.get(i19)) == null) {
                    aVar = this.e;
                }
                SparseArray<g> sparseArray7 = fVar4.j;
                int i23 = i15;
                int i24 = 0;
                while (true) {
                    Canvas canvas2 = canvas;
                    if (i24 < sparseArray7.size()) {
                        int iKeyAt = sparseArray7.keyAt(i24);
                        g gVarValueAt = sparseArray7.valueAt(i24);
                        SparseArray<g> sparseArray8 = sparseArray7;
                        c cVar = hVar.e.get(iKeyAt);
                        if (cVar == null) {
                            cVar = hVar.g.get(iKeyAt);
                        }
                        if (cVar != null) {
                            Paint paint = cVar.b ? null : this.a;
                            int i25 = i16;
                            int i26 = fVar4.e;
                            int i27 = i25 + gVarValueAt.a;
                            int i28 = gVarValueAt.b + i17;
                            bVar2 = bVar4;
                            i6 = i18;
                            f fVar5 = fVar4;
                            int[] iArr = i26 == 3 ? aVar.d : i26 == 2 ? aVar.c : aVar.b;
                            fVar = fVar5;
                            i8 = i20;
                            Paint paint2 = paint;
                            i7 = i24;
                            canvas = canvas2;
                            hVar2 = hVar;
                            i9 = i25;
                            arrayList = arrayList2;
                            i5 = i17;
                            h(cVar.c, iArr, i26, i27, i28, paint2, canvas);
                            h(cVar.d, iArr, i26, i27, i28 + 1, paint2, canvas);
                        } else {
                            bVar2 = bVar4;
                            arrayList = arrayList2;
                            i5 = i17;
                            fVar = fVar4;
                            i6 = i18;
                            i7 = i24;
                            i8 = i20;
                            canvas = canvas2;
                            hVar2 = hVar;
                            i9 = i16;
                        }
                        i24 = i7 + 1;
                        i18 = i6;
                        i17 = i5;
                        fVar4 = fVar;
                        i16 = i9;
                        hVar = hVar2;
                        sparseArray7 = sparseArray8;
                        arrayList2 = arrayList;
                        bVar4 = bVar2;
                        i20 = i8;
                    } else {
                        b bVar5 = bVar4;
                        ArrayList arrayList3 = arrayList2;
                        int i29 = i17;
                        f fVar6 = fVar4;
                        int i30 = i18;
                        int i31 = i20;
                        canvas = canvas2;
                        h hVar3 = hVar;
                        int i32 = i16;
                        if (fVar6.b) {
                            int i33 = fVar6.e;
                            if (i33 == 3) {
                                i4 = aVar.d[fVar6.g];
                                c4 = 2;
                            } else {
                                c4 = 2;
                                i4 = i33 == 2 ? aVar.c[fVar6.h] : aVar.b[fVar6.i];
                            }
                            Paint paint3 = this.b;
                            paint3.setColor(i4);
                            c2 = c4;
                            c3 = 3;
                            canvas.drawRect(i32, i29, i21, i22, paint3);
                        } else {
                            c2 = 2;
                            c3 = 3;
                        }
                        n83.a aVar2 = new n83.a();
                        aVar2.b = Bitmap.createBitmap(this.g, i32, i29, i30, i31);
                        aVar2.a = null;
                        float f2 = bVar5.a;
                        aVar2.h = i32 / f2;
                        aVar2.i = 0;
                        float f3 = bVar5.b;
                        aVar2.e = i29 / f3;
                        aVar2.f = 0;
                        aVar2.g = 0;
                        aVar2.l = i30 / f2;
                        aVar2.m = i31 / f3;
                        arrayList3.add(aVar2.a());
                        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                        canvas.restore();
                        z = z2;
                        arrayList2 = arrayList3;
                        sparseArray5 = sparseArray6;
                        i15 = i23 + 1;
                        bVar4 = bVar5;
                        hVar = hVar3;
                    }
                }
            }
            s83Var = new s83(-9223372036854775807L, -9223372036854775807L, arrayList2);
        }
        wq2Var.accept(s83Var);
    }

    @Override // defpackage.dye
    public final int c() {
        return 2;
    }

    @Override // defpackage.dye
    public final void reset() {
        h hVar = this.f;
        hVar.c.clear();
        hVar.d.clear();
        hVar.e.clear();
        hVar.f.clear();
        hVar.g.clear();
        hVar.h = null;
        hVar.i = null;
    }
}
