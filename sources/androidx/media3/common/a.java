package androidx.media3.common;

import android.text.TextUtils;
import androidx.media3.common.DrmInitData;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.e47;
import defpackage.ha2;
import defpackage.j6;
import defpackage.js9;
import defpackage.ka2;
import defpackage.kj8;
import defpackage.nz8;
import defpackage.q6;
import defpackage.qyc;
import defpackage.r6;
import defpackage.st9;
import defpackage.vjg;
import defpackage.w20;
import defpackage.w84;
import defpackage.wy3;
import defpackage.zr1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final String A0;
    public static final a Q = new a(new C0036a());
    public static final String R = Integer.toString(0, 36);
    public static final String S = Integer.toString(1, 36);
    public static final String T = Integer.toString(2, 36);
    public static final String U = Integer.toString(3, 36);
    public static final String V = Integer.toString(4, 36);
    public static final String W = Integer.toString(5, 36);
    public static final String X = Integer.toString(6, 36);
    public static final String Y = Integer.toString(7, 36);
    public static final String Z;
    public static final String a0;
    public static final String b0;
    public static final String c0;
    public static final String d0;
    public static final String e0;
    public static final String f0;
    public static final String g0;
    public static final String h0;
    public static final String i0;
    public static final String j0;
    public static final String k0;
    public static final String l0;
    public static final String m0;
    public static final String n0;
    public static final String o0;
    public static final String p0;
    public static final String q0;
    public static final String r0;
    public static final String s0;
    public static final String t0;
    public static final String u0;
    public static final String v0;
    public static final String w0;
    public static final String x0;
    public static final String y0;
    public static final String z0;
    public final float A;
    public final byte[] B;
    public final int C;
    public final ha2 D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public int P;
    public final String a;
    public final String b;
    public final e47 c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final js9 l;
    public final String m;
    public final String n;
    public final int o;
    public final int p;
    public final List<byte[]> q;
    public final DrmInitData r;
    public final long s;
    public final boolean t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final float y;
    public final int z;

    /* JADX INFO: renamed from: androidx.media3.common.a$a, reason: collision with other inner class name */
    public static final class C0036a {
        public byte[] A;
        public int B;
        public ha2 C;
        public int D;
        public int E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public String a;
        public String b;
        public e47 c;
        public String d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public String j;
        public js9 k;
        public String l;
        public String m;
        public int n;
        public int o;
        public List<byte[]> p;
        public DrmInitData q;
        public long r;
        public boolean s;
        public int t;
        public int u;
        public int v;
        public int w;
        public float x;
        public int y;
        public float z;

        public C0036a() {
            e47.b bVar = e47.b;
            this.c = qyc.e;
            this.h = -1;
            this.i = -1;
            this.n = -1;
            this.o = -1;
            this.r = Long.MAX_VALUE;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1.0f;
            this.z = 1.0f;
            this.B = -1;
            this.D = -1;
            this.E = -1;
            this.F = -1;
            this.G = -1;
            this.J = -1;
            this.K = 1;
            this.L = -1;
            this.M = -1;
            this.N = 0;
            this.g = 0;
        }
    }

    static {
        Integer.toString(8, 36);
        Z = Integer.toString(9, 36);
        a0 = Integer.toString(10, 36);
        b0 = Integer.toString(11, 36);
        c0 = Integer.toString(12, 36);
        d0 = Integer.toString(13, 36);
        e0 = Integer.toString(14, 36);
        f0 = Integer.toString(15, 36);
        g0 = Integer.toString(16, 36);
        h0 = Integer.toString(17, 36);
        i0 = Integer.toString(18, 36);
        j0 = Integer.toString(19, 36);
        k0 = Integer.toString(20, 36);
        l0 = Integer.toString(21, 36);
        m0 = Integer.toString(22, 36);
        n0 = Integer.toString(23, 36);
        o0 = Integer.toString(24, 36);
        p0 = Integer.toString(25, 36);
        q0 = Integer.toString(26, 36);
        r0 = Integer.toString(27, 36);
        s0 = Integer.toString(28, 36);
        t0 = Integer.toString(29, 36);
        u0 = Integer.toString(30, 36);
        v0 = Integer.toString(31, 36);
        w0 = Integer.toString(32, 36);
        x0 = Integer.toString(33, 36);
        y0 = Integer.toString(34, 36);
        z0 = Integer.toString(35, 36);
        A0 = Integer.toString(36, 36);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(C0036a c0036a) {
        boolean z;
        String str;
        this.a = c0036a.a;
        String strP = vjg.P(c0036a.d);
        this.d = strP;
        if (c0036a.c.isEmpty() && c0036a.b != null) {
            this.c = e47.n(new kj8(strP, c0036a.b));
            this.b = c0036a.b;
        } else if (!c0036a.c.isEmpty() && c0036a.b == null) {
            e47 e47Var = c0036a.c;
            this.c = e47Var;
            Iterator<E> it = e47Var.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((kj8) e47Var.get(0)).b;
                    break;
                }
                kj8 kj8Var = (kj8) it.next();
                if (TextUtils.equals(kj8Var.a, strP)) {
                    str = kj8Var.b;
                    break;
                }
            }
            this.b = str;
        } else if (c0036a.c.isEmpty() && c0036a.b == null) {
            z = true;
            ka2.q(z);
            this.c = c0036a.c;
            this.b = c0036a.b;
        } else {
            for (int i = 0; i < c0036a.c.size(); i++) {
                if (((kj8) c0036a.c.get(i)).b.equals(c0036a.b)) {
                    z = true;
                    break;
                }
            }
            z = false;
            ka2.q(z);
            this.c = c0036a.c;
            this.b = c0036a.b;
        }
        this.e = c0036a.e;
        ka2.p("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", c0036a.g == 0 || (c0036a.f & 32768) != 0);
        this.f = c0036a.f;
        this.g = c0036a.g;
        int i2 = c0036a.h;
        this.h = i2;
        int i3 = c0036a.i;
        this.i = i3;
        this.j = i3 != -1 ? i3 : i2;
        this.k = c0036a.j;
        this.l = c0036a.k;
        this.m = c0036a.l;
        this.n = c0036a.m;
        this.o = c0036a.n;
        this.p = c0036a.o;
        List<byte[]> list = c0036a.p;
        this.q = list == null ? Collections.EMPTY_LIST : list;
        DrmInitData drmInitData = c0036a.q;
        this.r = drmInitData;
        this.s = c0036a.r;
        this.t = c0036a.s;
        this.u = c0036a.t;
        this.v = c0036a.u;
        this.w = c0036a.v;
        this.x = c0036a.w;
        this.y = c0036a.x;
        int i4 = c0036a.y;
        this.z = i4 == -1 ? 0 : i4;
        float f = c0036a.z;
        this.A = f == -1.0f ? 1.0f : f;
        this.B = c0036a.A;
        this.C = c0036a.B;
        this.D = c0036a.C;
        this.E = c0036a.D;
        this.F = c0036a.E;
        this.G = c0036a.F;
        this.H = c0036a.G;
        int i5 = c0036a.H;
        this.I = i5 == -1 ? 0 : i5;
        int i6 = c0036a.I;
        this.J = i6 != -1 ? i6 : 0;
        this.K = c0036a.J;
        this.L = c0036a.K;
        this.M = c0036a.L;
        this.N = c0036a.M;
        int i7 = c0036a.N;
        if (i7 != 0 || drmInitData == null) {
            this.O = i7;
        } else {
            this.O = 1;
        }
    }

    public static String c(a aVar) {
        int i;
        String str;
        String str2;
        String str3;
        int i2;
        if (aVar == null) {
            return "null";
        }
        int i3 = aVar.e;
        e47 e47Var = aVar.c;
        String str4 = aVar.d;
        int i4 = aVar.G;
        int i5 = aVar.F;
        int i6 = aVar.E;
        float f = aVar.y;
        ha2 ha2Var = aVar.D;
        float f2 = aVar.A;
        int i7 = aVar.x;
        int i8 = aVar.w;
        int i9 = aVar.v;
        int i10 = aVar.u;
        DrmInitData drmInitData = aVar.r;
        String str5 = aVar.k;
        int i11 = aVar.j;
        String str6 = aVar.m;
        int i12 = aVar.f;
        wy3 wy3Var = new wy3(String.valueOf(','));
        StringBuilder sbG = q6.g("id=");
        sbG.append(aVar.a);
        sbG.append(", mimeType=");
        sbG.append(aVar.n);
        if (str6 != null) {
            sbG.append(", container=");
            sbG.append(str6);
        }
        if (i11 != -1) {
            sbG.append(", bitrate=");
            sbG.append(i11);
        }
        if (str5 != null) {
            sbG.append(", codecs=");
            sbG.append(str5);
        }
        if (drmInitData != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i13 = 0;
            while (i13 < drmInitData.d) {
                UUID uuid = drmInitData.a[i13].b;
                if (uuid.equals(zr1.b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(zr1.c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(zr1.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(zr1.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(zr1.a)) {
                    linkedHashSet.add("universal");
                } else {
                    i2 = i13;
                    linkedHashSet.add("unknown (" + uuid + ")");
                    i13 = i2 + 1;
                }
                i2 = i13;
                i13 = i2 + 1;
            }
            sbG.append(", drm=[");
            wy3Var.d(sbG, linkedHashSet.iterator());
            sbG.append(']');
        }
        if (i10 != -1 && i9 != -1) {
            sbG.append(", res=");
            sbG.append(i10);
            sbG.append("x");
            sbG.append(i9);
        }
        if (i8 != -1 && i7 != -1) {
            sbG.append(", decRes=");
            sbG.append(i8);
            sbG.append("x");
            sbG.append(i7);
        }
        double d = f2;
        int i14 = w84.a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            sbG.append(", par=");
            Object[] objArr = {Float.valueOf(f2)};
            String str7 = vjg.a;
            sbG.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (ha2Var != null) {
            int i15 = ha2Var.f;
            int i16 = ha2Var.e;
            if ((i16 != -1 && i15 != -1) || ha2Var.d()) {
                sbG.append(", color=");
                if (ha2Var.d()) {
                    String strB = ha2.b(ha2Var.a);
                    String strA = ha2.a(ha2Var.b);
                    String strC = ha2.c(ha2Var.c);
                    String str8 = vjg.a;
                    Locale locale = Locale.US;
                    str2 = strB + "/" + strA + "/" + strC;
                } else {
                    str2 = "NA/NA/NA";
                }
                if (i16 == -1 || i15 == -1) {
                    str3 = "NA/NA";
                } else {
                    str3 = i16 + "/" + i15;
                }
                sbG.append(str2 + "/" + str3);
            }
        }
        if (f != -1.0f) {
            sbG.append(", fps=");
            sbG.append(f);
        }
        if (i6 != -1) {
            sbG.append(", maxSubLayers=");
            sbG.append(i6);
        }
        if (i5 != -1) {
            sbG.append(", channels=");
            sbG.append(i5);
        }
        if (i4 != -1) {
            sbG.append(", sample_rate=");
            sbG.append(i4);
        }
        if (str4 != null) {
            sbG.append(", language=");
            sbG.append(str4);
        }
        if (!e47Var.isEmpty()) {
            sbG.append(", labels=[");
            wy3Var.d(sbG, nz8.b(new j6(7), e47Var).iterator());
            sbG.append("]");
        }
        if (i3 != 0) {
            sbG.append(", selectionFlags=[");
            String str9 = vjg.a;
            ArrayList arrayList = new ArrayList();
            if ((i3 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i3 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i3 & 2) != 0) {
                arrayList.add("forced");
            }
            wy3Var.d(sbG, arrayList.iterator());
            sbG.append("]");
        }
        if (i12 != 0) {
            sbG.append(", roleFlags=[");
            String str10 = vjg.a;
            ArrayList arrayList2 = new ArrayList();
            if ((i12 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i12 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i12 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i12 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i12 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i12 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i12 & 64) != 0) {
                arrayList2.add("caption");
            }
            i = i12;
            if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
                arrayList2.add("sign");
            }
            if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            wy3Var.d(sbG, arrayList2.iterator());
            sbG.append("]");
        } else {
            i = i12;
        }
        if ((i & 32768) != 0) {
            sbG.append(", auxiliaryTrackType=");
            int i17 = aVar.g;
            String str11 = vjg.a;
            if (i17 == 0) {
                str = "undefined";
            } else if (i17 == 1) {
                str = "original";
            } else if (i17 == 2) {
                str = "depth-linear";
            } else if (i17 == 3) {
                str = "depth-inverse";
            } else {
                if (i17 != 4) {
                    r6.g("Unsupported auxiliary track type");
                    return null;
                }
                str = "depth metadata";
            }
            sbG.append(str);
        }
        return sbG.toString();
    }

    public final C0036a a() {
        C0036a c0036a = new C0036a();
        c0036a.a = this.a;
        c0036a.b = this.b;
        c0036a.c = this.c;
        c0036a.d = this.d;
        c0036a.e = this.e;
        c0036a.f = this.f;
        c0036a.h = this.h;
        c0036a.i = this.i;
        c0036a.j = this.k;
        c0036a.k = this.l;
        c0036a.l = this.m;
        c0036a.m = this.n;
        c0036a.n = this.o;
        c0036a.o = this.p;
        c0036a.p = this.q;
        c0036a.q = this.r;
        c0036a.r = this.s;
        c0036a.s = this.t;
        c0036a.t = this.u;
        c0036a.u = this.v;
        c0036a.v = this.w;
        c0036a.w = this.x;
        c0036a.x = this.y;
        c0036a.y = this.z;
        c0036a.z = this.A;
        c0036a.A = this.B;
        c0036a.B = this.C;
        c0036a.C = this.D;
        c0036a.D = this.E;
        c0036a.E = this.F;
        c0036a.F = this.G;
        c0036a.G = this.H;
        c0036a.H = this.I;
        c0036a.I = this.J;
        c0036a.J = this.K;
        c0036a.K = this.L;
        c0036a.L = this.M;
        c0036a.M = this.N;
        c0036a.N = this.O;
        return c0036a;
    }

    public final boolean b(a aVar) {
        List<byte[]> list = this.q;
        if (list.size() != aVar.q.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), aVar.q.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final a d(a aVar) {
        String str;
        String str2;
        int i;
        int i2;
        if (this == aVar) {
            return this;
        }
        int i3 = st9.i(this.n);
        String str3 = aVar.a;
        e47 e47Var = aVar.c;
        int i4 = aVar.M;
        int i5 = aVar.N;
        String str4 = aVar.b;
        if (str4 == null) {
            str4 = this.b;
        }
        if (e47Var.isEmpty()) {
            e47Var = this.c;
        }
        if ((i3 != 3 && i3 != 1) || (str = aVar.d) == null) {
            str = this.d;
        }
        int i6 = this.h;
        if (i6 == -1) {
            i6 = aVar.h;
        }
        int i7 = this.i;
        if (i7 == -1) {
            i7 = aVar.i;
        }
        String str5 = this.k;
        if (str5 == null) {
            String strV = vjg.v(i3, aVar.k);
            if (vjg.a0(strV).length == 1) {
                str5 = strV;
            }
        }
        js9 js9VarB = aVar.l;
        js9 js9Var = this.l;
        if (js9Var != null) {
            js9VarB = js9Var.b(js9VarB);
        }
        float f = this.y;
        if (f == -1.0f && i3 == 2) {
            f = aVar.y;
        }
        int i8 = this.e | aVar.e;
        int i9 = this.f | aVar.f;
        DrmInitData drmInitData = aVar.r;
        ArrayList arrayList = new ArrayList();
        e47 e47Var2 = e47Var;
        if (drmInitData != null) {
            String str6 = drmInitData.c;
            DrmInitData.SchemeData[] schemeDataArr = drmInitData.a;
            int length = schemeDataArr.length;
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10;
                DrmInitData.SchemeData schemeData = schemeDataArr[i11];
                int i12 = length;
                if (schemeData.e != null) {
                    arrayList.add(schemeData);
                }
                i10 = i11 + 1;
                length = i12;
            }
            str2 = str6;
        } else {
            str2 = null;
        }
        DrmInitData drmInitData2 = this.r;
        if (drmInitData2 != null) {
            if (str2 == null) {
                str2 = drmInitData2.c;
            }
            int size = arrayList.size();
            DrmInitData.SchemeData[] schemeDataArr2 = drmInitData2.a;
            String str7 = str2;
            int length2 = schemeDataArr2.length;
            int i13 = 0;
            while (i13 < length2) {
                int i14 = i13;
                DrmInitData.SchemeData schemeData2 = schemeDataArr2[i14];
                int i15 = length2;
                if (schemeData2.e != null) {
                    UUID uuid = schemeData2.b;
                    i2 = i5;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= size) {
                            i = size;
                            arrayList.add(schemeData2);
                            break;
                        }
                        i = size;
                        if (((DrmInitData.SchemeData) arrayList.get(i16)).b.equals(uuid)) {
                            break;
                        }
                        i16++;
                        size = i;
                    }
                } else {
                    i = size;
                    i2 = i5;
                }
                i13 = i14 + 1;
                length2 = i15;
                i5 = i2;
                size = i;
            }
            str2 = str7;
        }
        int i17 = i5;
        DrmInitData drmInitData3 = arrayList.isEmpty() ? null : new DrmInitData(str2, arrayList);
        C0036a c0036aA = a();
        c0036aA.a = str3;
        c0036aA.b = str4;
        c0036aA.c = e47.j(e47Var2);
        c0036aA.d = str;
        c0036aA.e = i8;
        c0036aA.f = i9;
        c0036aA.h = i6;
        c0036aA.i = i7;
        c0036aA.j = str5;
        c0036aA.k = js9VarB;
        c0036aA.q = drmInitData3;
        c0036aA.x = f;
        c0036aA.L = i4;
        c0036aA.M = i17;
        return new a(c0036aA);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        int i2 = this.P;
        return (i2 == 0 || (i = aVar.P) == 0 || i2 == i) && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && this.i == aVar.i && this.o == aVar.o && this.s == aVar.s && this.u == aVar.u && this.v == aVar.v && this.w == aVar.w && this.x == aVar.x && this.z == aVar.z && this.C == aVar.C && this.E == aVar.E && this.F == aVar.F && this.G == aVar.G && this.H == aVar.H && this.I == aVar.I && this.J == aVar.J && this.K == aVar.K && this.M == aVar.M && this.N == aVar.N && this.O == aVar.O && Float.compare(this.y, aVar.y) == 0 && Float.compare(this.A, aVar.A) == 0 && Objects.equals(this.a, aVar.a) && Objects.equals(this.b, aVar.b) && this.c.equals(aVar.c) && Objects.equals(this.k, aVar.k) && Objects.equals(this.m, aVar.m) && Objects.equals(this.n, aVar.n) && Objects.equals(this.d, aVar.d) && Arrays.equals(this.B, aVar.B) && Objects.equals(this.l, aVar.l) && Objects.equals(this.D, aVar.D) && Objects.equals(this.r, aVar.r) && b(aVar);
    }

    public final int hashCode() {
        if (this.P == 0) {
            String str = this.a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.b;
            int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.d;
            int iHashCode3 = (((((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
            String str4 = this.k;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            js9 js9Var = this.l;
            int iHashCode5 = (iHashCode4 + (js9Var == null ? 0 : js9Var.hashCode())) * 961;
            String str5 = this.m;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.n;
            this.P = ((((((((((((((((((((((Float.floatToIntBits(this.A) + ((((Float.floatToIntBits(this.y) + ((((((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.o) * 31) + ((int) this.s)) * 31) + this.u) * 31) + this.v) * 31) + this.w) * 31) + this.x) * 31)) * 31) + this.z) * 31)) * 31) + this.C) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.M) * 31) + this.N) * 31) + this.O;
        }
        return this.P;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.m);
        sb.append(", ");
        sb.append(this.n);
        sb.append(", ");
        sb.append(this.k);
        sb.append(", ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", [");
        sb.append(this.u);
        sb.append(", ");
        sb.append(this.v);
        sb.append(", ");
        sb.append(this.y);
        sb.append(", ");
        sb.append(this.D);
        sb.append("], [");
        sb.append(this.F);
        sb.append(", ");
        return w20.k(sb, this.G, "])");
    }
}
