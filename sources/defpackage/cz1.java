package defpackage;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.ez1;
import defpackage.n83;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cz1 extends ez1 {
    public final g4b h = new g4b();
    public final f4b i = new f4b();
    public int j = -1;
    public final int k;
    public final b[] l;
    public b m;
    public List<n83> n;
    public List<n83> o;
    public c p;
    public int q;

    public static final class a {
        public static final bz1 c = new bz1();
        public final n83 a;
        public final int b;

        public a(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
            n83.a aVar = new n83.a();
            aVar.a = spannableStringBuilder;
            aVar.b = null;
            aVar.c = alignment;
            aVar.e = f;
            aVar.f = 0;
            aVar.g = i;
            aVar.h = f2;
            aVar.i = i2;
            aVar.l = -3.4028235E38f;
            if (z) {
                aVar.o = i3;
                aVar.n = true;
            }
            this.a = aVar.a();
            this.b = i4;
        }
    }

    public static final class b {
        public static final boolean[] A;
        public static final int[] B;
        public static final int[] C;
        public static final int[] D;
        public static final int[] E;
        public static final int v = c(2, 2, 2, 0);
        public static final int w;
        public static final int[] x;
        public static final int[] y;
        public static final int[] z;
        public final ArrayList a = new ArrayList();
        public final SpannableStringBuilder b = new SpannableStringBuilder();
        public boolean c;
        public boolean d;
        public int e;
        public boolean f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public int o;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public int u;

        static {
            int iC = c(0, 0, 0, 0);
            w = iC;
            int iC2 = c(0, 0, 0, 3);
            x = new int[]{0, 0, 0, 0, 0, 2, 0};
            y = new int[]{0, 0, 0, 0, 0, 0, 2};
            z = new int[]{3, 3, 3, 3, 3, 3, 1};
            A = new boolean[]{false, false, false, true, true, true, false};
            B = new int[]{iC, iC2, iC, iC, iC2, iC, iC};
            C = new int[]{0, 1, 2, 3, 4, 3, 4};
            D = new int[]{0, 0, 0, 0, 0, 3, 3};
            E = new int[]{iC, iC, iC, iC, iC, iC2, iC2};
        }

        public b() {
            d();
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int c(int r4, int r5, int r6, int r7) {
            /*
                r0 = 4
                defpackage.ka2.m(r4, r0)
                defpackage.ka2.m(r5, r0)
                defpackage.ka2.m(r6, r0)
                defpackage.ka2.m(r7, r0)
                r0 = 1
                r1 = 255(0xff, float:3.57E-43)
                r2 = 0
                if (r7 == 0) goto L1b
                if (r7 == r0) goto L1b
                r3 = 2
                if (r7 == r3) goto L1f
                r3 = 3
                if (r7 == r3) goto L1d
            L1b:
                r7 = r1
                goto L21
            L1d:
                r7 = r2
                goto L21
            L1f:
                r7 = 127(0x7f, float:1.78E-43)
            L21:
                if (r4 <= r0) goto L25
                r4 = r1
                goto L26
            L25:
                r4 = r2
            L26:
                if (r5 <= r0) goto L2a
                r5 = r1
                goto L2b
            L2a:
                r5 = r2
            L2b:
                if (r6 <= r0) goto L2e
                goto L2f
            L2e:
                r1 = r2
            L2f:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r1)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: cz1.b.c(int, int, int, int):int");
        }

        public final void a(char c) {
            SpannableStringBuilder spannableStringBuilder = this.b;
            if (c != '\n') {
                spannableStringBuilder.append(c);
                return;
            }
            SpannableString spannableStringB = b();
            ArrayList arrayList = this.a;
            arrayList.add(spannableStringB);
            spannableStringBuilder.clear();
            if (this.o != -1) {
                this.o = 0;
            }
            if (this.p != -1) {
                this.p = 0;
            }
            if (this.q != -1) {
                this.q = 0;
            }
            if (this.s != -1) {
                this.s = 0;
            }
            while (true) {
                if (arrayList.size() < this.j && arrayList.size() < 15) {
                    this.u = arrayList.size();
                    return;
                }
                arrayList.remove(0);
            }
        }

        public final SpannableString b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.o != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.o, length, 33);
                }
                if (this.p != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.p, length, 33);
                }
                if (this.q != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.r), this.q, length, 33);
                }
                if (this.s != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.t), this.s, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public final void d() {
            this.a.clear();
            this.b.clear();
            this.o = -1;
            this.p = -1;
            this.q = -1;
            this.s = -1;
            this.u = 0;
            this.c = false;
            this.d = false;
            this.e = 4;
            this.f = false;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.j = 15;
            this.k = 0;
            this.l = 0;
            this.m = 0;
            int i = w;
            this.n = i;
            this.r = v;
            this.t = i;
        }

        public final void e(boolean z2, boolean z3) {
            int i = this.o;
            SpannableStringBuilder spannableStringBuilder = this.b;
            if (i != -1) {
                if (!z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.o, spannableStringBuilder.length(), 33);
                    this.o = -1;
                }
            } else if (z2) {
                this.o = spannableStringBuilder.length();
            }
            if (this.p == -1) {
                if (z3) {
                    this.p = spannableStringBuilder.length();
                }
            } else {
                if (z3) {
                    return;
                }
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.p, spannableStringBuilder.length(), 33);
                this.p = -1;
            }
        }

        public final void f(int i, int i2) {
            int i3 = this.q;
            SpannableStringBuilder spannableStringBuilder = this.b;
            if (i3 != -1 && this.r != i) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.r), this.q, spannableStringBuilder.length(), 33);
            }
            if (i != v) {
                this.q = spannableStringBuilder.length();
                this.r = i;
            }
            if (this.s != -1 && this.t != i2) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.t), this.s, spannableStringBuilder.length(), 33);
            }
            if (i2 != w) {
                this.s = spannableStringBuilder.length();
                this.t = i2;
            }
        }
    }

    public static final class c {
        public final int a;
        public final int b;
        public final byte[] c;
        public int d = 0;

        public c(int i, int i2) {
            this.a = i;
            this.b = i2;
            this.c = new byte[(i2 * 2) - 1];
        }
    }

    public cz1(int i, List<byte[]> list) {
        this.k = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = d92.a;
            if (list.size() == 1 && list.get(0).length == 1) {
                byte b2 = list.get(0)[0];
            }
        }
        this.l = new b[8];
        int i2 = 0;
        while (true) {
            b[] bVarArr = this.l;
            if (i2 >= 8) {
                this.m = bVarArr[0];
                return;
            } else {
                bVarArr[i2] = new b();
                i2++;
            }
        }
    }

    @Override // defpackage.ez1, defpackage.zj3
    public final void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        this.q = 0;
        this.m = this.l[0];
        m();
        this.p = null;
    }

    @Override // defpackage.ez1
    public final fz1 g() {
        List<n83> list = this.n;
        this.o = list;
        list.getClass();
        return new fz1(list);
    }

    @Override // defpackage.ez1
    public final void h(ez1.a aVar) {
        ByteBuffer byteBuffer = aVar.d;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        g4b g4bVar = this.h;
        g4bVar.H(iLimit, bArrArray);
        while (g4bVar.a() >= 3) {
            int iX = g4bVar.x();
            int i = iX & 3;
            boolean z = (iX & 4) == 4;
            byte bX = (byte) g4bVar.x();
            byte bX2 = (byte) g4bVar.x();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        k();
                        int i2 = (bX & 192) >> 6;
                        int i3 = this.j;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            m();
                            zkd.T("Cea708Decoder", "Sequence number discontinuity. previous=" + this.j + " current=" + i2);
                        }
                        this.j = i2;
                        int i4 = bX & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        c cVar = new c(i2, i4);
                        this.p = cVar;
                        cVar.d = 1;
                        cVar.c[0] = bX2;
                    } else {
                        ka2.l(i == 2);
                        c cVar2 = this.p;
                        if (cVar2 == null) {
                            zkd.w("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr = cVar2.c;
                            int i5 = cVar2.d;
                            int i6 = i5 + 1;
                            cVar2.d = i6;
                            bArr[i5] = bX;
                            cVar2.d = i5 + 2;
                            bArr[i6] = bX2;
                        }
                    }
                    c cVar3 = this.p;
                    if (cVar3.d == (cVar3.b * 2) - 1) {
                        k();
                    }
                }
            }
        }
    }

    @Override // defpackage.ez1
    public final boolean j() {
        return this.n != this.o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void k() {
        char c2;
        int i;
        boolean z;
        c cVar = this.p;
        if (cVar == null) {
            return;
        }
        int i2 = 2;
        if (cVar.d != (cVar.b * 2) - 1) {
            zkd.u("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.p.b * 2) - 1) + ", but current index is " + this.p.d + " (sequence number " + this.p.a + ");");
        }
        c cVar2 = this.p;
        byte[] bArr = cVar2.c;
        int i3 = cVar2.d;
        f4b f4bVar = this.i;
        f4bVar.k(i3, bArr);
        boolean z2 = false;
        while (true) {
            if (f4bVar.b() > 0) {
                int i4 = 3;
                int iG = f4bVar.g(3);
                int iG2 = f4bVar.g(5);
                if (iG == 7) {
                    f4bVar.o(i2);
                    iG = f4bVar.g(6);
                    if (iG < 7) {
                        g7.j(iG, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (iG2 == 0) {
                    if (iG != 0) {
                        zkd.T("Cea708Decoder", "serviceNumber is non-zero (" + iG + ") when blockSize is 0");
                    }
                } else if (iG != this.k) {
                    f4bVar.p(iG2);
                } else {
                    int iE = (iG2 * 8) + f4bVar.e();
                    while (f4bVar.e() < iE) {
                        int iG3 = f4bVar.g(8);
                        if (iG3 != 16) {
                            if (iG3 <= 31) {
                                if (iG3 != 0) {
                                    if (iG3 == i4) {
                                        this.n = l();
                                    } else if (iG3 != 8) {
                                        switch (iG3) {
                                            case 12:
                                                m();
                                                break;
                                            case 13:
                                                this.m.a('\n');
                                                break;
                                            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                                                break;
                                            default:
                                                if (iG3 >= 17 && iG3 <= 23) {
                                                    zkd.T("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + iG3);
                                                    f4bVar.o(8);
                                                } else if (iG3 < 24 || iG3 > 31) {
                                                    g7.j(iG3, "Invalid C0 command: ", "Cea708Decoder");
                                                } else {
                                                    zkd.T("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + iG3);
                                                    f4bVar.o(16);
                                                }
                                                break;
                                        }
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder = this.m.b;
                                        int length = spannableStringBuilder.length();
                                        if (length > 0) {
                                            spannableStringBuilder.delete(length - 1, length);
                                        }
                                    }
                                }
                                i = i2;
                            } else if (iG3 <= 127) {
                                b bVar = this.m;
                                if (iG3 == 127) {
                                    bVar.a((char) 9835);
                                } else {
                                    bVar.a((char) (iG3 & 255));
                                }
                                i = i2;
                                z2 = true;
                            } else {
                                if (iG3 <= 159) {
                                    b[] bVarArr = this.l;
                                    switch (iG3) {
                                        case IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT /* 128 */:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            z = true;
                                            int i5 = iG3 - 128;
                                            if (this.q != i5) {
                                                this.q = i5;
                                                this.m = bVarArr[i5];
                                            }
                                            break;
                                        case 136:
                                            z = true;
                                            for (int i6 = 1; i6 <= 8; i6++) {
                                                if (f4bVar.f()) {
                                                    b bVar2 = bVarArr[8 - i6];
                                                    bVar2.a.clear();
                                                    bVar2.b.clear();
                                                    bVar2.o = -1;
                                                    bVar2.p = -1;
                                                    bVar2.q = -1;
                                                    bVar2.s = -1;
                                                    bVar2.u = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            for (int i7 = 1; i7 <= 8; i7++) {
                                                if (f4bVar.f()) {
                                                    bVarArr[8 - i7].d = true;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 138:
                                            for (int i8 = 1; i8 <= 8; i8++) {
                                                if (f4bVar.f()) {
                                                    bVarArr[8 - i8].d = false;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 139:
                                            for (int i9 = 1; i9 <= 8; i9++) {
                                                if (f4bVar.f()) {
                                                    bVarArr[8 - i9].d = !r1.d;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 140:
                                            for (int i10 = 1; i10 <= 8; i10++) {
                                                if (f4bVar.f()) {
                                                    bVarArr[8 - i10].d();
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 141:
                                            f4bVar.o(8);
                                            z = true;
                                            break;
                                        case 142:
                                            z = true;
                                            break;
                                        case 143:
                                            m();
                                            z = true;
                                            break;
                                        case 144:
                                            int i11 = i2;
                                            if (this.m.c) {
                                                f4bVar.g(4);
                                                f4bVar.g(i11);
                                                f4bVar.g(i11);
                                                boolean zF = f4bVar.f();
                                                boolean zF2 = f4bVar.f();
                                                i4 = 3;
                                                f4bVar.g(3);
                                                f4bVar.g(3);
                                                this.m.e(zF, zF2);
                                                z = true;
                                            } else {
                                                f4bVar.o(16);
                                                z = true;
                                                i4 = 3;
                                            }
                                            break;
                                        case 145:
                                            if (this.m.c) {
                                                int iC = b.c(f4bVar.g(2), f4bVar.g(2), f4bVar.g(2), f4bVar.g(2));
                                                int iC2 = b.c(f4bVar.g(2), f4bVar.g(2), f4bVar.g(2), f4bVar.g(2));
                                                f4bVar.o(2);
                                                b.c(f4bVar.g(2), f4bVar.g(2), f4bVar.g(2), 0);
                                                this.m.f(iC, iC2);
                                            } else {
                                                f4bVar.o(24);
                                            }
                                            z = true;
                                            i4 = 3;
                                            break;
                                        case 146:
                                            if (this.m.c) {
                                                f4bVar.o(4);
                                                int iG4 = f4bVar.g(4);
                                                f4bVar.o(2);
                                                f4bVar.g(6);
                                                b bVar3 = this.m;
                                                if (bVar3.u != iG4) {
                                                    bVar3.a('\n');
                                                }
                                                bVar3.u = iG4;
                                            } else {
                                                f4bVar.o(16);
                                            }
                                            z = true;
                                            i4 = 3;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            g7.j(iG3, "Invalid C1 command: ", "Cea708Decoder");
                                            z = true;
                                            break;
                                        case 151:
                                            if (this.m.c) {
                                                int iC3 = b.c(f4bVar.g(2), f4bVar.g(2), f4bVar.g(2), f4bVar.g(2));
                                                f4bVar.g(2);
                                                b.c(f4bVar.g(2), f4bVar.g(2), f4bVar.g(2), 0);
                                                f4bVar.f();
                                                f4bVar.f();
                                                f4bVar.g(2);
                                                f4bVar.g(2);
                                                int iG5 = f4bVar.g(2);
                                                f4bVar.o(8);
                                                b bVar4 = this.m;
                                                bVar4.n = iC3;
                                                bVar4.k = iG5;
                                            } else {
                                                f4bVar.o(32);
                                            }
                                            z = true;
                                            i4 = 3;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i12 = iG3 - 152;
                                            b bVar5 = bVarArr[i12];
                                            f4bVar.o(i2);
                                            boolean zF3 = f4bVar.f();
                                            f4bVar.o(i2);
                                            int iG6 = f4bVar.g(i4);
                                            boolean zF4 = f4bVar.f();
                                            int iG7 = f4bVar.g(7);
                                            int iG8 = f4bVar.g(8);
                                            int iG9 = f4bVar.g(4);
                                            int iG10 = f4bVar.g(4);
                                            f4bVar.o(i2);
                                            f4bVar.o(6);
                                            f4bVar.o(i2);
                                            int iG11 = f4bVar.g(3);
                                            int iG12 = f4bVar.g(3);
                                            ArrayList arrayList = bVar5.a;
                                            bVar5.c = true;
                                            bVar5.d = zF3;
                                            bVar5.e = iG6;
                                            bVar5.f = zF4;
                                            bVar5.g = iG7;
                                            bVar5.h = iG8;
                                            bVar5.i = iG9;
                                            int i13 = iG10 + 1;
                                            if (bVar5.j != i13) {
                                                bVar5.j = i13;
                                                while (true) {
                                                    if (arrayList.size() >= bVar5.j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (iG11 != 0 && bVar5.l != iG11) {
                                                bVar5.l = iG11;
                                                int i14 = iG11 - 1;
                                                int i15 = b.B[i14];
                                                boolean z3 = b.A[i14];
                                                int i16 = b.y[i14];
                                                int i17 = b.z[i14];
                                                int i18 = b.x[i14];
                                                bVar5.n = i15;
                                                bVar5.k = i18;
                                            }
                                            if (iG12 != 0 && bVar5.m != iG12) {
                                                bVar5.m = iG12;
                                                int i19 = iG12 - 1;
                                                int i20 = b.D[i19];
                                                int i21 = b.C[i19];
                                                bVar5.e(false, false);
                                                bVar5.f(b.v, b.E[i19]);
                                            }
                                            if (this.q != i12) {
                                                this.q = i12;
                                                this.m = bVarArr[i12];
                                            }
                                            z = true;
                                            i4 = 3;
                                            break;
                                    }
                                } else {
                                    z = true;
                                    if (iG3 <= 255) {
                                        this.m.a((char) (iG3 & 255));
                                    } else {
                                        g7.j(iG3, "Invalid base command: ", "Cea708Decoder");
                                        i = 2;
                                        c2 = 7;
                                    }
                                }
                                z2 = z;
                                i = 2;
                                c2 = 7;
                            }
                            c2 = 7;
                        } else {
                            int iG13 = f4bVar.g(8);
                            if (iG13 <= 31) {
                                c2 = 7;
                                if (iG13 > 7) {
                                    if (iG13 <= 15) {
                                        f4bVar.o(8);
                                    } else if (iG13 <= 23) {
                                        f4bVar.o(16);
                                    } else if (iG13 <= 31) {
                                        f4bVar.o(24);
                                    }
                                }
                            } else {
                                c2 = 7;
                                if (iG13 <= 127) {
                                    if (iG13 == 32) {
                                        this.m.a(' ');
                                    } else if (iG13 == 33) {
                                        this.m.a((char) 160);
                                    } else if (iG13 == 37) {
                                        this.m.a((char) 8230);
                                    } else if (iG13 == 42) {
                                        this.m.a((char) 352);
                                    } else if (iG13 == 44) {
                                        this.m.a((char) 338);
                                    } else if (iG13 == 63) {
                                        this.m.a((char) 376);
                                    } else if (iG13 == 57) {
                                        this.m.a((char) 8482);
                                    } else if (iG13 == 58) {
                                        this.m.a((char) 353);
                                    } else if (iG13 == 60) {
                                        this.m.a((char) 339);
                                    } else if (iG13 != 61) {
                                        switch (iG13) {
                                            case 48:
                                                this.m.a((char) 9608);
                                                break;
                                            case 49:
                                                this.m.a((char) 8216);
                                                break;
                                            case 50:
                                                this.m.a((char) 8217);
                                                break;
                                            case 51:
                                                this.m.a((char) 8220);
                                                break;
                                            case 52:
                                                this.m.a((char) 8221);
                                                break;
                                            case 53:
                                                this.m.a((char) 8226);
                                                break;
                                            default:
                                                switch (iG13) {
                                                    case 118:
                                                        this.m.a((char) 8539);
                                                        break;
                                                    case 119:
                                                        this.m.a((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.m.a((char) 8541);
                                                        break;
                                                    case 121:
                                                        this.m.a((char) 8542);
                                                        break;
                                                    case 122:
                                                        this.m.a((char) 9474);
                                                        break;
                                                    case 123:
                                                        this.m.a((char) 9488);
                                                        break;
                                                    case 124:
                                                        this.m.a((char) 9492);
                                                        break;
                                                    case 125:
                                                        this.m.a((char) 9472);
                                                        break;
                                                    case 126:
                                                        this.m.a((char) 9496);
                                                        break;
                                                    case 127:
                                                        this.m.a((char) 9484);
                                                        break;
                                                    default:
                                                        g7.j(iG13, "Invalid G2 character: ", "Cea708Decoder");
                                                        break;
                                                }
                                                break;
                                        }
                                    } else {
                                        this.m.a((char) 8480);
                                    }
                                    i = 2;
                                    z2 = true;
                                } else if (iG13 > 159) {
                                    i = 2;
                                    if (iG13 <= 255) {
                                        if (iG13 == 160) {
                                            this.m.a((char) 13252);
                                        } else {
                                            g7.j(iG13, "Invalid G3 character: ", "Cea708Decoder");
                                            this.m.a('_');
                                        }
                                        z2 = true;
                                    } else {
                                        g7.j(iG13, "Invalid extended command: ", "Cea708Decoder");
                                    }
                                } else if (iG13 <= 135) {
                                    f4bVar.o(32);
                                } else if (iG13 <= 143) {
                                    f4bVar.o(40);
                                } else if (iG13 <= 159) {
                                    i = 2;
                                    f4bVar.o(2);
                                    f4bVar.o(f4bVar.g(6) * 8);
                                }
                            }
                            i = 2;
                        }
                        i2 = i;
                    }
                }
            }
        }
        if (z2) {
            this.n = l();
        }
        this.p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<defpackage.n83> l() {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cz1.l():java.util.List");
    }

    public final void m() {
        for (int i = 0; i < 8; i++) {
            this.l[i].d();
        }
    }
}
