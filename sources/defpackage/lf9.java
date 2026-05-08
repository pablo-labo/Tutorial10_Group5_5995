package defpackage;

import android.util.SparseArray;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import com.datadog.android.rum.internal.debug.UiRumDebugListener;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.dye;
import defpackage.zpf;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes.dex */
public final class lf9 implements m55 {
    public static final byte[] f0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] g0;
    public static final byte[] h0;
    public static final byte[] i0;
    public static final UUID j0;
    public static final Map<String, Integer> k0;
    public long A;
    public boolean B;
    public long C;
    public long D;
    public long E;
    public a59 F;
    public a59 G;
    public boolean H;
    public boolean I;
    public int J;
    public long K;
    public long L;
    public int M;
    public int N;
    public int[] O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public long U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public boolean Z;
    public final bn3 a;
    public boolean a0;
    public final amg b;
    public int b0;
    public final SparseArray<b> c;
    public byte c0;
    public final boolean d;
    public boolean d0;
    public final boolean e;
    public o55 e0;
    public final dye.a f;
    public final g4b g;
    public final g4b h;
    public final g4b i;
    public final g4b j;
    public final g4b k;
    public final g4b l;
    public final g4b m;
    public final g4b n;
    public final g4b o;
    public final g4b p;
    public ByteBuffer q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public b x;
    public boolean y;
    public int z;

    public final class a {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void a(int i, int i2, n55 n55Var) throws ParserException {
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            long j;
            int i9;
            int i10;
            int[] iArr;
            int i11;
            int i12;
            lf9 lf9Var = lf9.this;
            amg amgVar = lf9Var.b;
            SparseArray<b> sparseArray = lf9Var.c;
            g4b g4bVar = lf9Var.k;
            g4b g4bVar2 = lf9Var.i;
            int i13 = 1;
            int i14 = 0;
            if (i != 161 && i != 163) {
                if (i == 165) {
                    if (lf9Var.J != 2) {
                        return;
                    }
                    b bVar = sparseArray.get(lf9Var.P);
                    int i15 = lf9Var.S;
                    g4b g4bVar3 = lf9Var.p;
                    if (i15 != 4 || !"V_VP9".equals(bVar.c)) {
                        n55Var.n(i2);
                        return;
                    } else {
                        g4bVar3.G(i2);
                        n55Var.readFully(g4bVar3.a, 0, i2);
                        return;
                    }
                }
                if (i == 16877) {
                    lf9Var.e(i);
                    b bVar2 = lf9Var.x;
                    int i16 = bVar2.h;
                    if (i16 != 1685485123 && i16 != 1685480259) {
                        n55Var.n(i2);
                        return;
                    }
                    byte[] bArr = new byte[i2];
                    bVar2.P = bArr;
                    n55Var.readFully(bArr, 0, i2);
                    return;
                }
                if (i == 16981) {
                    lf9Var.e(i);
                    byte[] bArr2 = new byte[i2];
                    lf9Var.x.j = bArr2;
                    n55Var.readFully(bArr2, 0, i2);
                    return;
                }
                if (i == 18402) {
                    byte[] bArr3 = new byte[i2];
                    n55Var.readFully(bArr3, 0, i2);
                    lf9Var.e(i);
                    lf9Var.x.k = new zpf.a(1, 0, 0, bArr3);
                    return;
                }
                if (i == 21419) {
                    Arrays.fill(g4bVar.a, (byte) 0);
                    n55Var.readFully(g4bVar.a, 4 - i2, i2);
                    g4bVar.J(0);
                    lf9Var.z = (int) g4bVar.z();
                    return;
                }
                if (i == 25506) {
                    lf9Var.e(i);
                    byte[] bArr4 = new byte[i2];
                    lf9Var.x.l = bArr4;
                    n55Var.readFully(bArr4, 0, i2);
                    return;
                }
                if (i != 30322) {
                    throw ParserException.a(null, "Unexpected id: " + i);
                }
                lf9Var.e(i);
                byte[] bArr5 = new byte[i2];
                lf9Var.x.x = bArr5;
                n55Var.readFully(bArr5, 0, i2);
                return;
            }
            int i17 = 8;
            if (lf9Var.J == 0) {
                lf9Var.P = (int) amgVar.b(n55Var, false, true, 8);
                lf9Var.Q = amgVar.c;
                lf9Var.L = -9223372036854775807L;
                lf9Var.J = 1;
                g4bVar2.G(0);
            }
            b bVar3 = sparseArray.get(lf9Var.P);
            if (bVar3 == null) {
                n55Var.n(i2 - lf9Var.Q);
                lf9Var.J = 0;
                return;
            }
            bVar3.Z.getClass();
            if (lf9Var.J == 1) {
                lf9Var.j(n55Var, 3);
                int i18 = (g4bVar2.a[2] & 6) >> 1;
                if (i18 == 0) {
                    lf9Var.N = 1;
                    int[] iArr2 = lf9Var.O;
                    if (iArr2 == null) {
                        iArr2 = new int[1];
                    } else if (iArr2.length < 1) {
                        iArr2 = new int[Math.max(iArr2.length * 2, 1)];
                    }
                    lf9Var.O = iArr2;
                    iArr2[0] = (i2 - lf9Var.Q) - 3;
                } else {
                    lf9Var.j(n55Var, 4);
                    int i19 = (g4bVar2.a[3] & 255) + 1;
                    lf9Var.N = i19;
                    int[] iArr3 = lf9Var.O;
                    if (iArr3 == null) {
                        iArr3 = new int[i19];
                        i4 = 4;
                    } else {
                        i4 = 4;
                        if (iArr3.length < i19) {
                            iArr3 = new int[Math.max(iArr3.length * 2, i19)];
                        }
                    }
                    lf9Var.O = iArr3;
                    if (i18 == 2) {
                        int i20 = (i2 - lf9Var.Q) - 4;
                        int i21 = lf9Var.N;
                        Arrays.fill(iArr3, 0, i21, i20 / i21);
                    } else {
                        if (i18 != 1) {
                            if (i18 != 3) {
                                throw ParserException.a(null, "Unexpected lacing value: " + i18);
                            }
                            int i22 = 0;
                            int i23 = 0;
                            int i24 = i4;
                            while (true) {
                                int i25 = lf9Var.N - i13;
                                int[] iArr4 = lf9Var.O;
                                if (i22 >= i25) {
                                    i3 = i13;
                                    i5 = i14;
                                    iArr4[i25] = ((i2 - lf9Var.Q) - i24) - i23;
                                    break;
                                }
                                iArr4[i22] = i14;
                                int i26 = i24 + 1;
                                lf9Var.j(n55Var, i26);
                                if (g4bVar2.a[i24] == 0) {
                                    throw ParserException.a(null, "No valid varint length mask found");
                                }
                                int i27 = i14;
                                while (true) {
                                    if (i27 >= i17) {
                                        i6 = i17;
                                        i7 = i13;
                                        i8 = i14;
                                        j = 0;
                                        i9 = i26;
                                        break;
                                    }
                                    i6 = i17;
                                    int i28 = i13 << (7 - i27);
                                    i7 = i13;
                                    if ((g4bVar2.a[i24] & i28) != 0) {
                                        i9 = i26 + i27;
                                        lf9Var.j(n55Var, i9);
                                        i8 = i14;
                                        j = (~i28) & g4bVar2.a[i24] & 255;
                                        while (i26 < i9) {
                                            j = (j << i6) | ((long) (g4bVar2.a[i26] & 255));
                                            i26++;
                                        }
                                        if (i22 > 0) {
                                            j -= (1 << ((i27 * 7) + 6)) - 1;
                                        }
                                    } else {
                                        i27++;
                                        i13 = i7;
                                        i17 = i6;
                                    }
                                }
                                if (j < -2147483648L || j > 2147483647L) {
                                    break;
                                }
                                int i29 = (int) j;
                                int[] iArr5 = lf9Var.O;
                                if (i22 != 0) {
                                    i29 += iArr5[i22 - 1];
                                }
                                iArr5[i22] = i29;
                                i23 += i29;
                                i22++;
                                i24 = i9;
                                i13 = i7;
                                i17 = i6;
                                i14 = i8;
                            }
                            throw ParserException.a(null, "EBML lacing sample size out of range.");
                        }
                        int i30 = 0;
                        int i31 = 0;
                        int i32 = i4;
                        while (true) {
                            i10 = lf9Var.N - 1;
                            iArr = lf9Var.O;
                            if (i30 >= i10) {
                                break;
                            }
                            iArr[i30] = 0;
                            while (true) {
                                i11 = i32 + 1;
                                lf9Var.j(n55Var, i11);
                                int i33 = g4bVar2.a[i32] & 255;
                                int[] iArr6 = lf9Var.O;
                                i12 = iArr6[i30] + i33;
                                iArr6[i30] = i12;
                                if (i33 != 255) {
                                    break;
                                } else {
                                    i32 = i11;
                                }
                            }
                            i31 += i12;
                            i30++;
                            i32 = i11;
                        }
                        iArr[i10] = ((i2 - lf9Var.Q) - i32) - i31;
                    }
                }
                i3 = 1;
                i5 = 0;
                byte[] bArr6 = g4bVar2.a;
                lf9Var.K = lf9Var.m((bArr6[i3] & 255) | (bArr6[i5] << 8)) + lf9Var.E;
                lf9Var.R = (bVar3.e == 2 || (i == 163 && (g4bVar2.a[2] & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 128)) ? i3 : i5;
                lf9Var.J = 2;
                lf9Var.M = i5;
            } else {
                i3 = 1;
            }
            if (i == 163) {
                while (true) {
                    int i34 = lf9Var.M;
                    if (i34 >= lf9Var.N) {
                        lf9Var.J = 0;
                        return;
                    } else {
                        lf9Var.g(bVar3, ((long) ((lf9Var.M * bVar3.f) / 1000)) + lf9Var.K, lf9Var.R, lf9Var.n(n55Var, bVar3, lf9Var.O[i34], false), 0);
                        lf9Var.M++;
                    }
                }
            } else {
                while (true) {
                    int i35 = lf9Var.M;
                    if (i35 >= lf9Var.N) {
                        return;
                    }
                    int[] iArr7 = lf9Var.O;
                    boolean z = i3;
                    iArr7[i35] = lf9Var.n(n55Var, bVar3, iArr7[i35], z);
                    lf9Var.M += z ? 1 : 0;
                }
            }
        }

        public final void b(int i, long j) throws ParserException {
            if (i == 20529) {
                if (j == 0) {
                    return;
                }
                throw ParserException.a(null, "ContentEncodingOrder " + j + " not supported");
            }
            if (i == 20530) {
                if (j == 1) {
                    return;
                }
                throw ParserException.a(null, "ContentEncodingScope " + j + " not supported");
            }
            lf9 lf9Var = lf9.this;
            switch (i) {
                case 131:
                    lf9Var.e(i);
                    lf9Var.x.e = (int) j;
                    return;
                case 136:
                    lf9Var.e(i);
                    lf9Var.x.X = j == 1;
                    return;
                case 155:
                    lf9Var.L = lf9Var.m(j);
                    return;
                case 159:
                    lf9Var.e(i);
                    lf9Var.x.Q = (int) j;
                    return;
                case 176:
                    lf9Var.e(i);
                    lf9Var.x.n = (int) j;
                    return;
                case 179:
                    lf9Var.a(i);
                    lf9Var.F.a(lf9Var.m(j));
                    return;
                case 186:
                    lf9Var.e(i);
                    lf9Var.x.o = (int) j;
                    return;
                case 215:
                    lf9Var.e(i);
                    lf9Var.x.d = (int) j;
                    return;
                case 231:
                    lf9Var.E = lf9Var.m(j);
                    return;
                case 238:
                    lf9Var.S = (int) j;
                    return;
                case 241:
                    if (lf9Var.H) {
                        return;
                    }
                    lf9Var.a(i);
                    lf9Var.G.a(j);
                    lf9Var.H = true;
                    return;
                case 251:
                    lf9Var.T = true;
                    return;
                case 16871:
                    lf9Var.e(i);
                    lf9Var.x.h = (int) j;
                    return;
                case 16980:
                    if (j == 3) {
                        return;
                    }
                    throw ParserException.a(null, "ContentCompAlgo " + j + " not supported");
                case 17029:
                    if (j < 1 || j > 2) {
                        throw ParserException.a(null, "DocTypeReadVersion " + j + " not supported");
                    }
                    return;
                case 17143:
                    if (j == 1) {
                        return;
                    }
                    throw ParserException.a(null, "EBMLReadVersion " + j + " not supported");
                case 18401:
                    if (j == 5) {
                        return;
                    }
                    throw ParserException.a(null, "ContentEncAlgo " + j + " not supported");
                case 18408:
                    if (j == 1) {
                        return;
                    }
                    throw ParserException.a(null, "AESSettingsCipherMode " + j + " not supported");
                case 21420:
                    lf9Var.A = j + lf9Var.s;
                    return;
                case 21432:
                    int i2 = (int) j;
                    lf9Var.e(i);
                    if (i2 == 0) {
                        lf9Var.x.y = 0;
                        return;
                    }
                    if (i2 == 1) {
                        lf9Var.x.y = 2;
                        return;
                    } else if (i2 == 3) {
                        lf9Var.x.y = 1;
                        return;
                    } else {
                        if (i2 != 15) {
                            return;
                        }
                        lf9Var.x.y = 3;
                        return;
                    }
                case 21680:
                    lf9Var.e(i);
                    lf9Var.x.q = (int) j;
                    return;
                case 21682:
                    lf9Var.e(i);
                    lf9Var.x.s = (int) j;
                    return;
                case 21690:
                    lf9Var.e(i);
                    lf9Var.x.r = (int) j;
                    return;
                case 21930:
                    lf9Var.e(i);
                    lf9Var.x.W = j == 1;
                    return;
                case 21938:
                    lf9Var.e(i);
                    b bVar = lf9Var.x;
                    bVar.z = true;
                    bVar.p = (int) j;
                    return;
                case 21998:
                    lf9Var.e(i);
                    lf9Var.x.g = (int) j;
                    return;
                case 22186:
                    lf9Var.e(i);
                    lf9Var.x.T = j;
                    return;
                case 22203:
                    lf9Var.e(i);
                    lf9Var.x.U = j;
                    return;
                case 25188:
                    lf9Var.e(i);
                    lf9Var.x.R = (int) j;
                    return;
                case 30114:
                    lf9Var.U = j;
                    return;
                case 30321:
                    lf9Var.e(i);
                    int i3 = (int) j;
                    if (i3 == 0) {
                        lf9Var.x.t = 0;
                        return;
                    }
                    if (i3 == 1) {
                        lf9Var.x.t = 1;
                        return;
                    } else if (i3 == 2) {
                        lf9Var.x.t = 2;
                        return;
                    } else {
                        if (i3 != 3) {
                            return;
                        }
                        lf9Var.x.t = 3;
                        return;
                    }
                case 2352003:
                    lf9Var.e(i);
                    lf9Var.x.f = (int) j;
                    return;
                case 2807729:
                    lf9Var.t = j;
                    return;
                default:
                    switch (i) {
                        case 21945:
                            lf9Var.e(i);
                            int i4 = (int) j;
                            if (i4 == 1) {
                                lf9Var.x.C = 2;
                                return;
                            } else {
                                if (i4 != 2) {
                                    return;
                                }
                                lf9Var.x.C = 1;
                                return;
                            }
                        case 21946:
                            lf9Var.e(i);
                            int iG = ha2.g((int) j);
                            if (iG != -1) {
                                lf9Var.x.B = iG;
                                return;
                            }
                            return;
                        case 21947:
                            lf9Var.e(i);
                            lf9Var.x.z = true;
                            int iF = ha2.f((int) j);
                            if (iF != -1) {
                                lf9Var.x.A = iF;
                                return;
                            }
                            return;
                        case 21948:
                            lf9Var.e(i);
                            lf9Var.x.D = (int) j;
                            return;
                        case 21949:
                            lf9Var.e(i);
                            lf9Var.x.E = (int) j;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    public static final class b {
        public byte[] P;
        public puf V;
        public boolean W;
        public zpf Z;
        public boolean a;
        public int a0;
        public String b;
        public String c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public boolean i;
        public byte[] j;
        public zpf.a k;
        public byte[] l;
        public DrmInitData m;
        public int n = -1;
        public int o = -1;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = 0;
        public int t = -1;
        public float u = 0.0f;
        public float v = 0.0f;
        public float w = 0.0f;
        public byte[] x = null;
        public int y = -1;
        public boolean z = false;
        public int A = -1;
        public int B = -1;
        public int C = -1;
        public int D = 1000;
        public int E = UiRumDebugListener.DEFAULT_ALPHA;
        public float F = -1.0f;
        public float G = -1.0f;
        public float H = -1.0f;
        public float I = -1.0f;
        public float J = -1.0f;
        public float K = -1.0f;
        public float L = -1.0f;
        public float M = -1.0f;
        public float N = -1.0f;
        public float O = -1.0f;
        public int Q = 1;
        public int R = -1;
        public int S = 8000;
        public long T = 0;
        public long U = 0;
        public boolean X = true;
        public String Y = "eng";

        @EnsuresNonNull({"codecPrivate"})
        public final byte[] a(String str) throws ParserException {
            byte[] bArr = this.l;
            if (bArr != null) {
                return bArr;
            }
            throw ParserException.a(null, "Missing CodecPrivate for codec " + str);
        }
    }

    static {
        String str = vjg.a;
        g0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        h0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        i0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        j0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        p6.f(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        p6.f(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        k0 = Collections.unmodifiableMap(map);
    }

    public lf9(dye.a aVar, int i) {
        bn3 bn3Var = new bn3();
        this.s = -1L;
        this.t = -9223372036854775807L;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.C = -1L;
        this.D = -1L;
        this.E = -9223372036854775807L;
        this.a = bn3Var;
        bn3Var.d = new a();
        this.f = aVar;
        this.d = (i & 1) == 0;
        this.e = (i & 2) == 0;
        this.b = new amg();
        this.c = new SparseArray<>();
        this.i = new g4b(4);
        this.j = new g4b(ByteBuffer.allocate(4).putInt(-1).array());
        this.k = new g4b(4);
        this.g = new g4b(m8a.a);
        this.h = new g4b(4);
        this.l = new g4b();
        this.m = new g4b();
        this.n = new g4b(8);
        this.o = new g4b();
        this.p = new g4b();
        this.O = new int[1];
    }

    public static byte[] h(long j, String str, long j2) {
        ka2.l(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2)));
        String str3 = vjg.a;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    public final void a(int i) throws ParserException {
        if (this.F == null || this.G == null) {
            throw ParserException.a(null, "Element " + i + " must be in a Cues");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:674:0x0bcc, code lost:
    
        r15 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:675:0x0bcd, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:848:0x0ef3, code lost:
    
        if (r5 == false) goto L859;
     */
    /* JADX WARN: Code restructure failed: missing block: B:849:0x0ef5, code lost:
    
        r1 = r0.getPosition();
        r3 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:850:0x0efd, code lost:
    
        if (r3.B == false) goto L853;
     */
    /* JADX WARN: Code restructure failed: missing block: B:851:0x0eff, code lost:
    
        r3.D = r1;
        r44.a = r3.C;
        r3.B = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:852:0x0f0b, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:854:0x0f12, code lost:
    
        if (r3.y == false) goto L911;
     */
    /* JADX WARN: Code restructure failed: missing block: B:855:0x0f14, code lost:
    
        r6 = r3.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:856:0x0f1a, code lost:
    
        if (r6 == (-1)) goto L912;
     */
    /* JADX WARN: Code restructure failed: missing block: B:857:0x0f1c, code lost:
    
        r44.a = r6;
        r3.D = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:858:0x0f20, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:859:0x0f21, code lost:
    
        r3 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:862:0x0f3f, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:863:0x0f40, code lost:
    
        if (r5 != false) goto L873;
     */
    /* JADX WARN: Code restructure failed: missing block: B:864:0x0f42, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:865:0x0f43, code lost:
    
        r1 = r3.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:866:0x0f49, code lost:
    
        if (r0 >= r1.size()) goto L938;
     */
    /* JADX WARN: Code restructure failed: missing block: B:867:0x0f4b, code lost:
    
        r1 = r1.valueAt(r0);
        r1.Z.getClass();
        r2 = r1.V;
     */
    /* JADX WARN: Code restructure failed: missing block: B:868:0x0f58, code lost:
    
        if (r2 == null) goto L940;
     */
    /* JADX WARN: Code restructure failed: missing block: B:869:0x0f5a, code lost:
    
        r2.a(r1.Z, r1.k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:870:0x0f61, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:871:0x0f64, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:873:0x0f67, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:911:0x0f27, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a8, code lost:
    
        throw androidx.media3.common.ParserException.a(null, "Mandatory element SeekID or SeekPosition not found");
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x08f3  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x090c  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x090e  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x091f  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x092c  */
    /* JADX WARN: Removed duplicated region for block: B:640:0x0aed  */
    /* JADX WARN: Removed duplicated region for block: B:646:0x0b02  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01cb  */
    /* JADX WARN: Type inference failed for: r1v88 */
    /* JADX WARN: Type inference failed for: r1v89, types: [java.lang.RuntimeException] */
    @Override // defpackage.m55
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(defpackage.n55 r43, defpackage.dhb r44) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 4774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lf9.b(n55, dhb):int");
    }

    @Override // defpackage.m55
    public final boolean c(n55 n55Var) throws EOFException, InterruptedIOException {
        ume umeVar = new ume();
        hn3 hn3Var = (hn3) n55Var;
        long j = hn3Var.c;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        g4b g4bVar = umeVar.a;
        hn3Var.d(g4bVar.a, 0, 4, false);
        long jZ = g4bVar.z();
        umeVar.b = 4;
        while (true) {
            if (jZ != 440786851) {
                int i2 = umeVar.b + 1;
                umeVar.b = i2;
                if (i2 == i) {
                    break;
                }
                hn3Var.d(g4bVar.a, 0, 1, false);
                jZ = ((jZ << 8) & (-256)) | ((long) (g4bVar.a[0] & 255));
            } else {
                long jA = umeVar.a(hn3Var);
                long j3 = umeVar.b;
                if (jA != Long.MIN_VALUE && (j == -1 || j3 + jA < j)) {
                    while (true) {
                        long j4 = umeVar.b;
                        long j5 = j3 + jA;
                        if (j4 < j5) {
                            if (umeVar.a(hn3Var) == Long.MIN_VALUE) {
                                break;
                            }
                            long jA2 = umeVar.a(hn3Var);
                            if (jA2 < 0 || jA2 > 2147483647L) {
                                break;
                            }
                            if (jA2 != 0) {
                                int i3 = (int) jA2;
                                hn3Var.o(i3, false);
                                umeVar.b += i3;
                            }
                        } else if (j4 == j5) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.m55
    public final void d(long j, long j2) {
        this.E = -9223372036854775807L;
        this.J = 0;
        bn3 bn3Var = this.a;
        bn3Var.e = 0;
        bn3Var.b.clear();
        amg amgVar = bn3Var.c;
        amgVar.b = 0;
        amgVar.c = 0;
        amg amgVar2 = this.b;
        amgVar2.b = 0;
        amgVar2.c = 0;
        k();
        int i = 0;
        while (true) {
            SparseArray<b> sparseArray = this.c;
            if (i >= sparseArray.size()) {
                return;
            }
            puf pufVar = sparseArray.valueAt(i).V;
            if (pufVar != null) {
                pufVar.b = false;
                pufVar.c = 0;
            }
            i++;
        }
    }

    @EnsuresNonNull({"currentTrack"})
    public final void e(int i) throws ParserException {
        if (this.x != null) {
            return;
        }
        throw ParserException.a(null, "Element " + i + " must be in a TrackEntry");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00e8  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(lf9.b r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lf9.g(lf9$b, long, int, int, int):void");
    }

    public final void j(n55 n55Var, int i) {
        g4b g4bVar = this.i;
        if (g4bVar.c >= i) {
            return;
        }
        byte[] bArr = g4bVar.a;
        if (bArr.length < i) {
            g4bVar.c(Math.max(bArr.length * 2, i));
        }
        byte[] bArr2 = g4bVar.a;
        int i2 = g4bVar.c;
        n55Var.readFully(bArr2, i2, i - i2);
        g4bVar.I(i);
    }

    public final void k() {
        this.V = 0;
        this.W = 0;
        this.X = 0;
        this.Y = false;
        this.Z = false;
        this.a0 = false;
        this.b0 = 0;
        this.c0 = (byte) 0;
        this.d0 = false;
        this.l.G(0);
    }

    @Override // defpackage.m55
    public final void l(o55 o55Var) {
        if (this.e) {
            o55Var = new eye(o55Var, this.f);
        }
        this.e0 = o55Var;
    }

    public final long m(long j) throws ParserException {
        long j2 = this.t;
        if (j2 == -9223372036854775807L) {
            throw ParserException.a(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        String str = vjg.a;
        return vjg.X(j, j2, 1000L, RoundingMode.DOWN);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x016d  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#2.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int n(defpackage.n55 r18, lf9.b r19, int r20, boolean r21) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instruction units count: 685
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lf9.n(n55, lf9$b, int, boolean):int");
    }

    public final void o(n55 n55Var, byte[] bArr, int i) {
        int length = bArr.length + i;
        g4b g4bVar = this.m;
        byte[] bArr2 = g4bVar.a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i);
            g4bVar.getClass();
            g4bVar.H(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        n55Var.readFully(g4bVar.a, bArr.length, i);
        g4bVar.J(0);
        g4bVar.I(length);
    }

    @Override // defpackage.m55
    public final void release() {
    }
}
