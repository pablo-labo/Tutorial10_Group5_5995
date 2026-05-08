package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import defpackage.dye;
import defpackage.e47;
import defpackage.n83;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public final class gtg implements dye {
    public final g4b a = new g4b();
    public final g4b b = new g4b();
    public final a c;
    public Inflater d;

    public static final class a {
        public boolean b;
        public boolean c;
        public int[] d;
        public int e;
        public int f;
        public Rect g;
        public final int[] a = new int[4];
        public int h = -1;
        public int i = -1;

        public static int a(int i, int[] iArr) {
            return (i < 0 || i >= iArr.length) ? iArr[0] : iArr[i];
        }

        public static int c(int i, int i2) {
            return (i & 16777215) | ((i2 * 17) << 24);
        }

        public final void b(f4b f4bVar, boolean z, Rect rect, int[] iArr) {
            int i;
            int i2;
            int iWidth = rect.width();
            int iHeight = rect.height();
            int i3 = !z ? 1 : 0;
            int i4 = i3 * iWidth;
            while (true) {
                int i5 = 0;
                do {
                    int iG = 0;
                    for (int i6 = 1; iG < i6 && i6 <= 64; i6 <<= 2) {
                        if (f4bVar.b() < 4) {
                            i = -1;
                            i2 = 0;
                            break;
                        }
                        iG = (iG << 4) | f4bVar.g(4);
                    }
                    i = iG & 3;
                    i2 = iG < 4 ? iWidth : iG >> 2;
                    int iMin = Math.min(i2, iWidth - i5);
                    if (iMin > 0) {
                        int i7 = i4 + iMin;
                        Arrays.fill(iArr, i4, i7, this.a[i]);
                        i5 += iMin;
                        i4 = i7;
                    }
                } while (i5 < iWidth);
                i3 += 2;
                if (i3 >= iHeight) {
                    return;
                }
                i4 = i3 * iWidth;
                f4bVar.c();
            }
        }
    }

    public gtg(List<byte[]> list) {
        int i;
        a aVar = new a();
        this.c = aVar;
        String strTrim = new String(list.get(0), StandardCharsets.UTF_8).trim();
        String str = vjg.a;
        for (String str2 : strTrim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] strArrSplit = str2.substring(9).split(",", -1);
                aVar.d = new int[strArrSplit.length];
                for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                    int[] iArr = aVar.d;
                    try {
                        i = Integer.parseInt(strArrSplit[i2].trim(), 16);
                    } catch (RuntimeException unused) {
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            } else if (str2.startsWith("size: ")) {
                String[] strArrSplit2 = str2.substring(6).trim().split("x", -1);
                if (strArrSplit2.length == 2) {
                    try {
                        aVar.e = Integer.parseInt(strArrSplit2[0]);
                        aVar.f = Integer.parseInt(strArrSplit2[1]);
                        aVar.b = true;
                    } catch (RuntimeException e) {
                        zkd.U("VobsubParser", "Parsing IDX failed", e);
                    }
                }
            }
        }
    }

    @Override // defpackage.dye
    public final void b(byte[] bArr, int i, int i2, dye.b bVar, wq2<s83> wq2Var) {
        qyc qycVarN;
        Rect rect;
        g4b g4bVar = this.a;
        g4bVar.H(i + i2, bArr);
        g4bVar.J(i);
        if (this.d == null) {
            this.d = new Inflater();
        }
        Inflater inflater = this.d;
        String str = vjg.a;
        if (g4bVar.a() > 0 && (g4bVar.a[g4bVar.b] & 255) == 120) {
            g4b g4bVar2 = this.b;
            if (vjg.I(g4bVar, g4bVar2, inflater)) {
                g4bVar.H(g4bVar2.c, g4bVar2.a);
            }
        }
        a aVar = this.c;
        aVar.c = false;
        n83 n83VarA = null;
        aVar.g = null;
        aVar.h = -1;
        aVar.i = -1;
        int iA = g4bVar.a();
        if (iA >= 2 && g4bVar.D() == iA) {
            int[] iArr = aVar.d;
            if (iArr != null && aVar.b) {
                g4bVar.K(g4bVar.D() - 2);
                int iD = g4bVar.D();
                int[] iArr2 = aVar.a;
                while (g4bVar.b < iD && g4bVar.a() > 0) {
                    switch (g4bVar.x()) {
                        case 3:
                            if (g4bVar.a() >= 2) {
                                int iX = g4bVar.x();
                                int iX2 = g4bVar.x();
                                iArr2[3] = a.a(iX >> 4, iArr);
                                iArr2[2] = a.a(iX & 15, iArr);
                                iArr2[1] = a.a(iX2 >> 4, iArr);
                                iArr2[0] = a.a(iX2 & 15, iArr);
                                aVar.c = true;
                            }
                            break;
                        case 4:
                            if (g4bVar.a() >= 2 && aVar.c) {
                                int iX3 = g4bVar.x();
                                int iX4 = g4bVar.x();
                                iArr2[3] = a.c(iArr2[3], iX3 >> 4);
                                iArr2[2] = a.c(iArr2[2], iX3 & 15);
                                iArr2[1] = a.c(iArr2[1], iX4 >> 4);
                                iArr2[0] = a.c(iArr2[0], iX4 & 15);
                            }
                            break;
                        case 5:
                            if (g4bVar.a() >= 6) {
                                int iX5 = g4bVar.x();
                                int iX6 = g4bVar.x();
                                int i3 = (iX5 << 4) | (iX6 >> 4);
                                int iX7 = ((iX6 & 15) << 8) | g4bVar.x();
                                int iX8 = g4bVar.x();
                                int iX9 = g4bVar.x();
                                aVar.g = new Rect(i3, (iX8 << 4) | (iX9 >> 4), iX7 + 1, (((iX9 & 15) << 8) | g4bVar.x()) + 1);
                            }
                            break;
                        case 6:
                            if (g4bVar.a() >= 4) {
                                aVar.h = g4bVar.D();
                                aVar.i = g4bVar.D();
                            }
                            break;
                    }
                }
            }
            if (aVar.d != null && aVar.b && aVar.c && (rect = aVar.g) != null && aVar.h != -1 && aVar.i != -1 && rect.width() >= 2 && aVar.g.height() >= 2) {
                Rect rect2 = aVar.g;
                int[] iArr3 = new int[rect2.height() * rect2.width()];
                f4b f4bVar = new f4b();
                g4bVar.J(aVar.h);
                f4bVar.l(g4bVar);
                aVar.b(f4bVar, true, rect2, iArr3);
                g4bVar.J(aVar.i);
                f4bVar.l(g4bVar);
                aVar.b(f4bVar, false, rect2, iArr3);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr3, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888);
                n83.a aVar2 = new n83.a();
                aVar2.b = bitmapCreateBitmap;
                aVar2.a = null;
                aVar2.h = rect2.left / aVar.e;
                aVar2.i = 0;
                aVar2.e = rect2.top / aVar.f;
                aVar2.f = 0;
                aVar2.g = 0;
                aVar2.l = rect2.width() / aVar.e;
                aVar2.m = rect2.height() / aVar.f;
                n83VarA = aVar2.a();
            }
        }
        if (n83VarA != null) {
            qycVarN = e47.n(n83VarA);
        } else {
            e47.b bVar2 = e47.b;
            qycVarN = qyc.e;
        }
        wq2Var.accept(new s83(-9223372036854775807L, 5000000L, qycVarN));
    }

    @Override // defpackage.dye
    public final int c() {
        return 2;
    }
}
