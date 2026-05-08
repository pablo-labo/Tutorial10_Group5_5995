package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import app.rive.runtime.kotlin.renderers.RendererMetrics;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.datadog.android.rum.internal.domain.scope.RumViewScope;
import com.datadog.android.trace.AndroidTracer;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.akb;
import defpackage.b0;
import defpackage.fac;
import defpackage.l5;
import defpackage.nac;
import defpackage.rz9;
import defpackage.tde;
import defpackage.ze4;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final int[] d = {0, 4, 8};
    public static final SparseIntArray e;
    public static final SparseIntArray f;
    public final HashMap<String, androidx.constraintlayout.widget.a> a = new HashMap<>();
    public final boolean b = true;
    public final HashMap<Integer, a> c = new HashMap<>();

    public static class a {
        public int a;
        public final d b;
        public final C0028c c;
        public final b d;
        public final e e;
        public HashMap<String, androidx.constraintlayout.widget.a> f;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.c$a$a, reason: collision with other inner class name */
        public static class C0027a {
            public int[] a;
            public int[] b;
            public int c;
            public int[] d;
            public float[] e;
            public int f;
            public int[] g;
            public String[] h;
            public int i;
            public int[] j;
            public boolean[] k;
            public int l;

            public final void a(float f, int i) {
                int i2 = this.f;
                int[] iArr = this.d;
                if (i2 >= iArr.length) {
                    this.d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.e;
                    this.e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.d;
                int i3 = this.f;
                iArr2[i3] = i;
                float[] fArr2 = this.e;
                this.f = i3 + 1;
                fArr2[i3] = f;
            }

            public final void b(int i, int i2) {
                int i3 = this.c;
                int[] iArr = this.a;
                if (i3 >= iArr.length) {
                    this.a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.b;
                    this.b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.a;
                int i4 = this.c;
                iArr3[i4] = i;
                int[] iArr4 = this.b;
                this.c = i4 + 1;
                iArr4[i4] = i2;
            }

            public final void c(int i, String str) {
                int i2 = this.i;
                int[] iArr = this.g;
                if (i2 >= iArr.length) {
                    this.g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.h;
                    this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.g;
                int i3 = this.i;
                iArr2[i3] = i;
                String[] strArr2 = this.h;
                this.i = i3 + 1;
                strArr2[i3] = str;
            }

            public final void d(int i, boolean z) {
                int i2 = this.l;
                int[] iArr = this.j;
                if (i2 >= iArr.length) {
                    this.j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.k;
                    this.k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.j;
                int i3 = this.l;
                iArr2[i3] = i;
                boolean[] zArr2 = this.k;
                this.l = i3 + 1;
                zArr2[i3] = z;
            }
        }

        public a() {
            d dVar = new d();
            dVar.a = 0;
            dVar.b = 0;
            dVar.c = 1.0f;
            dVar.d = Float.NaN;
            this.b = dVar;
            C0028c c0028c = new C0028c();
            c0028c.a = -1;
            c0028c.b = 0;
            c0028c.c = -1;
            c0028c.d = Float.NaN;
            c0028c.e = Float.NaN;
            c0028c.f = Float.NaN;
            c0028c.g = -1;
            c0028c.h = null;
            c0028c.i = -1;
            this.c = c0028c;
            b bVar = new b();
            bVar.a = false;
            bVar.d = -1;
            bVar.e = -1;
            bVar.f = -1.0f;
            bVar.g = -1;
            bVar.h = -1;
            bVar.i = -1;
            bVar.j = -1;
            bVar.k = -1;
            bVar.l = -1;
            bVar.m = -1;
            bVar.n = -1;
            bVar.o = -1;
            bVar.p = -1;
            bVar.q = -1;
            bVar.r = -1;
            bVar.s = -1;
            bVar.t = -1;
            bVar.u = -1;
            bVar.v = 0.5f;
            bVar.w = 0.5f;
            bVar.x = null;
            bVar.y = -1;
            bVar.z = 0;
            bVar.A = 0.0f;
            bVar.B = -1;
            bVar.C = -1;
            bVar.D = -1;
            bVar.E = 0;
            bVar.F = 0;
            bVar.G = 0;
            bVar.H = 0;
            bVar.I = 0;
            bVar.J = 0;
            bVar.K = 0;
            bVar.L = Integer.MIN_VALUE;
            bVar.M = Integer.MIN_VALUE;
            bVar.N = Integer.MIN_VALUE;
            bVar.O = Integer.MIN_VALUE;
            bVar.P = Integer.MIN_VALUE;
            bVar.Q = Integer.MIN_VALUE;
            bVar.R = Integer.MIN_VALUE;
            bVar.S = -1.0f;
            bVar.T = -1.0f;
            bVar.U = 0;
            bVar.V = 0;
            bVar.W = 0;
            bVar.X = 0;
            bVar.Y = -1;
            bVar.Z = -1;
            bVar.a0 = -1;
            bVar.b0 = -1;
            bVar.c0 = 1.0f;
            bVar.d0 = 1.0f;
            bVar.e0 = -1;
            bVar.f0 = 0;
            bVar.g0 = -1;
            bVar.k0 = false;
            bVar.l0 = false;
            bVar.m0 = true;
            bVar.n0 = 0;
            this.d = bVar;
            e eVar = new e();
            eVar.a = 0.0f;
            eVar.b = 0.0f;
            eVar.c = 0.0f;
            eVar.d = 1.0f;
            eVar.e = 1.0f;
            eVar.f = Float.NaN;
            eVar.g = Float.NaN;
            eVar.h = -1;
            eVar.i = 0.0f;
            eVar.j = 0.0f;
            eVar.k = 0.0f;
            eVar.l = false;
            eVar.m = 0.0f;
            this.e = eVar;
            this.f = new HashMap<>();
        }

        public final void a(ConstraintLayout.a aVar) {
            b bVar = this.d;
            aVar.d = bVar.g;
            aVar.e = bVar.h;
            aVar.f = bVar.i;
            aVar.g = bVar.j;
            aVar.h = bVar.k;
            aVar.i = bVar.l;
            aVar.j = bVar.m;
            aVar.k = bVar.n;
            aVar.l = bVar.o;
            aVar.m = bVar.p;
            aVar.n = bVar.q;
            aVar.r = bVar.r;
            aVar.s = bVar.s;
            aVar.t = bVar.t;
            aVar.u = bVar.u;
            ((ViewGroup.MarginLayoutParams) aVar).leftMargin = bVar.E;
            ((ViewGroup.MarginLayoutParams) aVar).rightMargin = bVar.F;
            ((ViewGroup.MarginLayoutParams) aVar).topMargin = bVar.G;
            ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = bVar.H;
            aVar.z = bVar.Q;
            aVar.A = bVar.P;
            aVar.w = bVar.M;
            aVar.y = bVar.O;
            aVar.D = bVar.v;
            aVar.E = bVar.w;
            aVar.o = bVar.y;
            aVar.p = bVar.z;
            aVar.q = bVar.A;
            aVar.F = bVar.x;
            aVar.S = bVar.B;
            aVar.T = bVar.C;
            aVar.H = bVar.S;
            aVar.G = bVar.T;
            aVar.J = bVar.V;
            aVar.I = bVar.U;
            aVar.V = bVar.k0;
            aVar.W = bVar.l0;
            aVar.K = bVar.W;
            aVar.L = bVar.X;
            aVar.O = bVar.Y;
            aVar.P = bVar.Z;
            aVar.M = bVar.a0;
            aVar.N = bVar.b0;
            aVar.Q = bVar.c0;
            aVar.R = bVar.d0;
            aVar.U = bVar.D;
            aVar.c = bVar.f;
            aVar.a = bVar.d;
            aVar.b = bVar.e;
            ((ViewGroup.MarginLayoutParams) aVar).width = bVar.b;
            ((ViewGroup.MarginLayoutParams) aVar).height = bVar.c;
            String str = bVar.j0;
            if (str != null) {
                aVar.X = str;
            }
            aVar.Y = bVar.n0;
            aVar.setMarginStart(bVar.J);
            aVar.setMarginEnd(bVar.I);
            aVar.a();
        }

        public final void b(int i, ConstraintLayout.a aVar) {
            this.a = i;
            int i2 = aVar.d;
            b bVar = this.d;
            bVar.g = i2;
            bVar.h = aVar.e;
            bVar.i = aVar.f;
            bVar.j = aVar.g;
            bVar.k = aVar.h;
            bVar.l = aVar.i;
            bVar.m = aVar.j;
            bVar.n = aVar.k;
            bVar.o = aVar.l;
            bVar.p = aVar.m;
            bVar.q = aVar.n;
            bVar.r = aVar.r;
            bVar.s = aVar.s;
            bVar.t = aVar.t;
            bVar.u = aVar.u;
            bVar.v = aVar.D;
            bVar.w = aVar.E;
            bVar.x = aVar.F;
            bVar.y = aVar.o;
            bVar.z = aVar.p;
            bVar.A = aVar.q;
            bVar.B = aVar.S;
            bVar.C = aVar.T;
            bVar.D = aVar.U;
            bVar.f = aVar.c;
            bVar.d = aVar.a;
            bVar.e = aVar.b;
            bVar.b = ((ViewGroup.MarginLayoutParams) aVar).width;
            bVar.c = ((ViewGroup.MarginLayoutParams) aVar).height;
            bVar.E = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
            bVar.F = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
            bVar.G = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
            bVar.H = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
            bVar.K = aVar.C;
            bVar.S = aVar.H;
            bVar.T = aVar.G;
            bVar.V = aVar.J;
            bVar.U = aVar.I;
            bVar.k0 = aVar.V;
            bVar.l0 = aVar.W;
            bVar.W = aVar.K;
            bVar.X = aVar.L;
            bVar.Y = aVar.O;
            bVar.Z = aVar.P;
            bVar.a0 = aVar.M;
            bVar.b0 = aVar.N;
            bVar.c0 = aVar.Q;
            bVar.d0 = aVar.R;
            bVar.j0 = aVar.X;
            bVar.M = aVar.w;
            bVar.O = aVar.y;
            bVar.L = aVar.v;
            bVar.N = aVar.x;
            bVar.Q = aVar.z;
            bVar.P = aVar.A;
            bVar.R = aVar.B;
            bVar.n0 = aVar.Y;
            bVar.I = aVar.getMarginEnd();
            bVar.J = aVar.getMarginStart();
        }

        public final void c(int i, d.a aVar) {
            b(i, aVar);
            this.b.c = aVar.q0;
            float f = aVar.t0;
            e eVar = this.e;
            eVar.a = f;
            eVar.b = aVar.u0;
            eVar.c = aVar.v0;
            eVar.d = aVar.w0;
            eVar.e = aVar.x0;
            eVar.f = aVar.y0;
            eVar.g = aVar.z0;
            eVar.i = aVar.A0;
            eVar.j = aVar.B0;
            eVar.k = aVar.C0;
            eVar.m = aVar.s0;
            eVar.l = aVar.r0;
        }

        public final Object clone() {
            a aVar = new a();
            b bVar = aVar.d;
            bVar.getClass();
            b bVar2 = this.d;
            bVar.a = bVar2.a;
            bVar.b = bVar2.b;
            bVar.c = bVar2.c;
            bVar.d = bVar2.d;
            bVar.e = bVar2.e;
            bVar.f = bVar2.f;
            bVar.g = bVar2.g;
            bVar.h = bVar2.h;
            bVar.i = bVar2.i;
            bVar.j = bVar2.j;
            bVar.k = bVar2.k;
            bVar.l = bVar2.l;
            bVar.m = bVar2.m;
            bVar.n = bVar2.n;
            bVar.o = bVar2.o;
            bVar.p = bVar2.p;
            bVar.q = bVar2.q;
            bVar.r = bVar2.r;
            bVar.s = bVar2.s;
            bVar.t = bVar2.t;
            bVar.u = bVar2.u;
            bVar.v = bVar2.v;
            bVar.w = bVar2.w;
            bVar.x = bVar2.x;
            bVar.y = bVar2.y;
            bVar.z = bVar2.z;
            bVar.A = bVar2.A;
            bVar.B = bVar2.B;
            bVar.C = bVar2.C;
            bVar.D = bVar2.D;
            bVar.E = bVar2.E;
            bVar.F = bVar2.F;
            bVar.G = bVar2.G;
            bVar.H = bVar2.H;
            bVar.I = bVar2.I;
            bVar.J = bVar2.J;
            bVar.K = bVar2.K;
            bVar.L = bVar2.L;
            bVar.M = bVar2.M;
            bVar.N = bVar2.N;
            bVar.O = bVar2.O;
            bVar.P = bVar2.P;
            bVar.Q = bVar2.Q;
            bVar.R = bVar2.R;
            bVar.S = bVar2.S;
            bVar.T = bVar2.T;
            bVar.U = bVar2.U;
            bVar.V = bVar2.V;
            bVar.W = bVar2.W;
            bVar.X = bVar2.X;
            bVar.Y = bVar2.Y;
            bVar.Z = bVar2.Z;
            bVar.a0 = bVar2.a0;
            bVar.b0 = bVar2.b0;
            bVar.c0 = bVar2.c0;
            bVar.d0 = bVar2.d0;
            bVar.e0 = bVar2.e0;
            bVar.f0 = bVar2.f0;
            bVar.g0 = bVar2.g0;
            bVar.j0 = bVar2.j0;
            int[] iArr = bVar2.h0;
            if (iArr != null) {
                bVar.h0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                bVar.h0 = null;
            }
            bVar.i0 = bVar2.i0;
            bVar.k0 = bVar2.k0;
            bVar.l0 = bVar2.l0;
            bVar.m0 = bVar2.m0;
            bVar.n0 = bVar2.n0;
            C0028c c0028c = aVar.c;
            c0028c.getClass();
            C0028c c0028c2 = this.c;
            c0028c2.getClass();
            c0028c.a = c0028c2.a;
            c0028c.c = c0028c2.c;
            c0028c.e = c0028c2.e;
            c0028c.d = c0028c2.d;
            d dVar = this.b;
            int i = dVar.a;
            d dVar2 = aVar.b;
            dVar2.a = i;
            dVar2.c = dVar.c;
            dVar2.d = dVar.d;
            dVar2.b = dVar.b;
            e eVar = aVar.e;
            eVar.getClass();
            e eVar2 = this.e;
            eVar2.getClass();
            eVar.a = eVar2.a;
            eVar.b = eVar2.b;
            eVar.c = eVar2.c;
            eVar.d = eVar2.d;
            eVar.e = eVar2.e;
            eVar.f = eVar2.f;
            eVar.g = eVar2.g;
            eVar.h = eVar2.h;
            eVar.i = eVar2.i;
            eVar.j = eVar2.j;
            eVar.k = eVar2.k;
            eVar.l = eVar2.l;
            eVar.m = eVar2.m;
            aVar.a = this.a;
            return aVar;
        }
    }

    public static class b {
        public static final SparseIntArray o0;
        public float A;
        public int B;
        public int C;
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
        public int O;
        public int P;
        public int Q;
        public int R;
        public float S;
        public float T;
        public int U;
        public int V;
        public int W;
        public int X;
        public int Y;
        public int Z;
        public boolean a;
        public int a0;
        public int b;
        public int b0;
        public int c;
        public float c0;
        public int d;
        public float d0;
        public int e;
        public int e0;
        public float f;
        public int f0;
        public int g;
        public int g0;
        public int h;
        public int[] h0;
        public int i;
        public String i0;
        public int j;
        public String j0;
        public int k;
        public boolean k0;
        public int l;
        public boolean l0;
        public int m;
        public boolean m0;
        public int n;
        public int n0;
        public int o;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public int u;
        public float v;
        public float w;
        public String x;
        public int y;
        public int z;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            o0 = sparseIntArray;
            sparseIntArray.append(42, 24);
            sparseIntArray.append(43, 25);
            sparseIntArray.append(45, 28);
            sparseIntArray.append(46, 29);
            sparseIntArray.append(51, 35);
            sparseIntArray.append(50, 34);
            sparseIntArray.append(23, 4);
            sparseIntArray.append(22, 3);
            sparseIntArray.append(18, 1);
            sparseIntArray.append(60, 6);
            sparseIntArray.append(61, 7);
            sparseIntArray.append(30, 17);
            sparseIntArray.append(31, 18);
            sparseIntArray.append(32, 19);
            sparseIntArray.append(0, 26);
            sparseIntArray.append(47, 31);
            sparseIntArray.append(48, 32);
            sparseIntArray.append(29, 10);
            sparseIntArray.append(28, 9);
            sparseIntArray.append(65, 13);
            sparseIntArray.append(68, 16);
            sparseIntArray.append(66, 14);
            sparseIntArray.append(63, 11);
            sparseIntArray.append(67, 15);
            sparseIntArray.append(64, 12);
            sparseIntArray.append(54, 38);
            sparseIntArray.append(40, 37);
            sparseIntArray.append(39, 39);
            sparseIntArray.append(53, 40);
            sparseIntArray.append(38, 20);
            sparseIntArray.append(52, 36);
            sparseIntArray.append(27, 5);
            sparseIntArray.append(41, 76);
            sparseIntArray.append(49, 76);
            sparseIntArray.append(44, 76);
            sparseIntArray.append(21, 76);
            sparseIntArray.append(17, 76);
            sparseIntArray.append(3, 23);
            sparseIntArray.append(5, 27);
            sparseIntArray.append(7, 30);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(4, 33);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 22);
            sparseIntArray.append(2, 21);
            sparseIntArray.append(55, 41);
            sparseIntArray.append(33, 42);
            sparseIntArray.append(16, 41);
            sparseIntArray.append(15, 42);
            sparseIntArray.append(70, 97);
            sparseIntArray.append(24, 61);
            sparseIntArray.append(26, 62);
            sparseIntArray.append(25, 63);
            sparseIntArray.append(59, 69);
            sparseIntArray.append(37, 70);
            sparseIntArray.append(12, 71);
            sparseIntArray.append(10, 72);
            sparseIntArray.append(11, 73);
            sparseIntArray.append(13, 74);
            sparseIntArray.append(9, 75);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nac.f);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                SparseIntArray sparseIntArray = o0;
                int i2 = sparseIntArray.get(index);
                if (i2 == 80) {
                    this.k0 = typedArrayObtainStyledAttributes.getBoolean(index, this.k0);
                } else if (i2 == 81) {
                    this.l0 = typedArrayObtainStyledAttributes.getBoolean(index, this.l0);
                } else if (i2 != 97) {
                    switch (i2) {
                        case 1:
                            this.o = c.f(typedArrayObtainStyledAttributes, index, this.o);
                            break;
                        case 2:
                            this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                            break;
                        case 3:
                            this.n = c.f(typedArrayObtainStyledAttributes, index, this.n);
                            break;
                        case 4:
                            this.m = c.f(typedArrayObtainStyledAttributes, index, this.m);
                            break;
                        case 5:
                            this.x = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.B);
                            break;
                        case 7:
                            this.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.C);
                            break;
                        case 8:
                            this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                            break;
                        case DatadogLogGenerator.CRASH /* 9 */:
                            this.u = c.f(typedArrayObtainStyledAttributes, index, this.u);
                            break;
                        case 10:
                            this.t = c.f(typedArrayObtainStyledAttributes, index, this.t);
                            break;
                        case 11:
                            this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            break;
                        case 12:
                            this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                            break;
                        case 13:
                            this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 14 */:
                            this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        case 15:
                            this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                            break;
                        case 16:
                            this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            break;
                        case 17:
                            this.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                            break;
                        case 18:
                            this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                            break;
                        case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                            this.f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                            break;
                        case 20:
                            this.v = typedArrayObtainStyledAttributes.getFloat(index, this.v);
                            break;
                        case 21:
                            this.c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.c);
                            break;
                        case 22:
                            this.b = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.b);
                            break;
                        case 23:
                            this.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.E);
                            break;
                        case 24:
                            this.g = c.f(typedArrayObtainStyledAttributes, index, this.g);
                            break;
                        case 25:
                            this.h = c.f(typedArrayObtainStyledAttributes, index, this.h);
                            break;
                        case 26:
                            this.D = typedArrayObtainStyledAttributes.getInt(index, this.D);
                            break;
                        case 27:
                            this.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.F);
                            break;
                        case 28:
                            this.i = c.f(typedArrayObtainStyledAttributes, index, this.i);
                            break;
                        case 29:
                            this.j = c.f(typedArrayObtainStyledAttributes, index, this.j);
                            break;
                        case RendererMetrics.SAMPLES /* 30 */:
                            this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                            break;
                        case 31:
                            this.r = c.f(typedArrayObtainStyledAttributes, index, this.r);
                            break;
                        case 32:
                            this.s = c.f(typedArrayObtainStyledAttributes, index, this.s);
                            break;
                        case 33:
                            this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.G);
                            break;
                        case 34:
                            this.l = c.f(typedArrayObtainStyledAttributes, index, this.l);
                            break;
                        case 35:
                            this.k = c.f(typedArrayObtainStyledAttributes, index, this.k);
                            break;
                        case 36:
                            this.w = typedArrayObtainStyledAttributes.getFloat(index, this.w);
                            break;
                        case 37:
                            this.T = typedArrayObtainStyledAttributes.getFloat(index, this.T);
                            break;
                        case 38:
                            this.S = typedArrayObtainStyledAttributes.getFloat(index, this.S);
                            break;
                        case 39:
                            this.U = typedArrayObtainStyledAttributes.getInt(index, this.U);
                            break;
                        case 40:
                            this.V = typedArrayObtainStyledAttributes.getInt(index, this.V);
                            break;
                        case 41:
                            c.g(this, typedArrayObtainStyledAttributes, index, 0);
                            break;
                        case 42:
                            c.g(this, typedArrayObtainStyledAttributes, index, 1);
                            break;
                        default:
                            switch (i2) {
                                case 54:
                                    this.W = typedArrayObtainStyledAttributes.getInt(index, this.W);
                                    break;
                                case RumViewScope.SLOW_RENDERED_THRESHOLD_FPS /* 55 */:
                                    this.X = typedArrayObtainStyledAttributes.getInt(index, this.X);
                                    break;
                                case 56:
                                    this.Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Y);
                                    break;
                                case 57:
                                    this.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Z);
                                    break;
                                case 58:
                                    this.a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.a0);
                                    break;
                                case 59:
                                    this.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                    break;
                                default:
                                    switch (i2) {
                                        case 61:
                                            this.y = c.f(typedArrayObtainStyledAttributes, index, this.y);
                                            break;
                                        case 62:
                                            this.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.z);
                                            break;
                                        case AndroidTracer.SPAN_ID_BIT_SIZE /* 63 */:
                                            this.A = typedArrayObtainStyledAttributes.getFloat(index, this.A);
                                            break;
                                        default:
                                            switch (i2) {
                                                case 69:
                                                    this.c0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.d0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case 72:
                                                    this.e0 = typedArrayObtainStyledAttributes.getInt(index, this.e0);
                                                    break;
                                                case 73:
                                                    this.f0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f0);
                                                    break;
                                                case 74:
                                                    this.i0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.m0 = typedArrayObtainStyledAttributes.getBoolean(index, this.m0);
                                                    break;
                                                case 76:
                                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                                    break;
                                                case 77:
                                                    this.j0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    switch (i2) {
                                                        case 91:
                                                            this.p = c.f(typedArrayObtainStyledAttributes, index, this.p);
                                                            break;
                                                        case 92:
                                                            this.q = c.f(typedArrayObtainStyledAttributes, index, this.q);
                                                            break;
                                                        case 93:
                                                            this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                                                            break;
                                                        case 94:
                                                            this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                                                            break;
                                                        default:
                                                            Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    this.n0 = typedArrayObtainStyledAttributes.getInt(index, this.n0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.c$c, reason: collision with other inner class name */
    public static class C0028c {
        public static final SparseIntArray j;
        public int a;
        public int b;
        public int c;
        public float d;
        public float e;
        public float f;
        public int g;
        public String h;
        public int i;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            j = sparseIntArray;
            sparseIntArray.append(3, 1);
            sparseIntArray.append(5, 2);
            sparseIntArray.append(9, 3);
            sparseIntArray.append(2, 4);
            sparseIntArray.append(1, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(4, 7);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(7, 9);
            sparseIntArray.append(6, 10);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nac.g);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (j.get(index)) {
                    case 1:
                        this.e = typedArrayObtainStyledAttributes.getFloat(index, this.e);
                        break;
                    case 2:
                        this.c = typedArrayObtainStyledAttributes.getInt(index, this.c);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            String str = ze4.c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.a = c.f(typedArrayObtainStyledAttributes, index, this.a);
                        break;
                    case 6:
                        this.b = typedArrayObtainStyledAttributes.getInteger(index, this.b);
                        break;
                    case 7:
                        this.d = typedArrayObtainStyledAttributes.getFloat(index, this.d);
                        break;
                    case 8:
                        this.g = typedArrayObtainStyledAttributes.getInteger(index, this.g);
                        break;
                    case DatadogLogGenerator.CRASH /* 9 */:
                        this.f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                        break;
                    case 10:
                        int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i2 == 1) {
                            this.i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        } else if (i2 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.h = string;
                            if (string.indexOf("/") > 0) {
                                this.i = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index, this.i);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class d {
        public int a;
        public int b;
        public float c;
        public float d;

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nac.i);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.c = typedArrayObtainStyledAttributes.getFloat(index, this.c);
                } else if (index == 0) {
                    int i2 = typedArrayObtainStyledAttributes.getInt(index, this.a);
                    this.a = i2;
                    this.a = c.d[i2];
                } else if (index == 4) {
                    this.b = typedArrayObtainStyledAttributes.getInt(index, this.b);
                } else if (index == 3) {
                    this.d = typedArrayObtainStyledAttributes.getFloat(index, this.d);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class e {
        public static final SparseIntArray n;
        public float a;
        public float b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public int h;
        public float i;
        public float j;
        public float k;
        public boolean l;
        public float m;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            n = sparseIntArray;
            sparseIntArray.append(6, 1);
            sparseIntArray.append(7, 2);
            sparseIntArray.append(8, 3);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(2, 8);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(10, 11);
            sparseIntArray.append(11, 12);
        }

        public final void a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nac.k);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (n.get(index)) {
                    case 1:
                        this.a = typedArrayObtainStyledAttributes.getFloat(index, this.a);
                        break;
                    case 2:
                        this.b = typedArrayObtainStyledAttributes.getFloat(index, this.b);
                        break;
                    case 3:
                        this.c = typedArrayObtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 4:
                        this.d = typedArrayObtainStyledAttributes.getFloat(index, this.d);
                        break;
                    case 5:
                        this.e = typedArrayObtainStyledAttributes.getFloat(index, this.e);
                        break;
                    case 6:
                        this.f = typedArrayObtainStyledAttributes.getDimension(index, this.f);
                        break;
                    case 7:
                        this.g = typedArrayObtainStyledAttributes.getDimension(index, this.g);
                        break;
                    case 8:
                        this.i = typedArrayObtainStyledAttributes.getDimension(index, this.i);
                        break;
                    case DatadogLogGenerator.CRASH /* 9 */:
                        this.j = typedArrayObtainStyledAttributes.getDimension(index, this.j);
                        break;
                    case 10:
                        this.k = typedArrayObtainStyledAttributes.getDimension(index, this.k);
                        break;
                    case 11:
                        this.l = true;
                        this.m = typedArrayObtainStyledAttributes.getDimension(index, this.m);
                        break;
                    case 12:
                        this.h = c.f(typedArrayObtainStyledAttributes, index, this.h);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f = sparseIntArray2;
        sparseIntArray.append(81, 25);
        sparseIntArray.append(82, 26);
        sparseIntArray.append(84, 29);
        sparseIntArray.append(85, 30);
        sparseIntArray.append(91, 36);
        sparseIntArray.append(90, 35);
        sparseIntArray.append(62, 4);
        sparseIntArray.append(61, 3);
        sparseIntArray.append(57, 1);
        sparseIntArray.append(59, 91);
        sparseIntArray.append(58, 92);
        sparseIntArray.append(100, 6);
        sparseIntArray.append(101, 7);
        sparseIntArray.append(69, 17);
        sparseIntArray.append(70, 18);
        sparseIntArray.append(71, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(86, 32);
        sparseIntArray.append(87, 33);
        sparseIntArray.append(68, 10);
        sparseIntArray.append(67, 9);
        sparseIntArray.append(105, 13);
        sparseIntArray.append(108, 16);
        sparseIntArray.append(106, 14);
        sparseIntArray.append(103, 11);
        sparseIntArray.append(107, 15);
        sparseIntArray.append(104, 12);
        sparseIntArray.append(94, 40);
        sparseIntArray.append(79, 39);
        sparseIntArray.append(78, 41);
        sparseIntArray.append(93, 42);
        sparseIntArray.append(77, 20);
        sparseIntArray.append(92, 37);
        sparseIntArray.append(66, 5);
        sparseIntArray.append(80, 87);
        sparseIntArray.append(89, 87);
        sparseIntArray.append(83, 87);
        sparseIntArray.append(60, 87);
        sparseIntArray.append(56, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(95, 95);
        sparseIntArray.append(72, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(96, 54);
        sparseIntArray.append(73, 55);
        sparseIntArray.append(97, 56);
        sparseIntArray.append(74, 57);
        sparseIntArray.append(98, 58);
        sparseIntArray.append(75, 59);
        sparseIntArray.append(63, 61);
        sparseIntArray.append(65, 62);
        sparseIntArray.append(64, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(120, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(121, 67);
        sparseIntArray.append(112, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(111, 68);
        sparseIntArray.append(99, 69);
        sparseIntArray.append(76, 70);
        sparseIntArray.append(110, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(113, 76);
        sparseIntArray.append(88, 77);
        sparseIntArray.append(122, 78);
        sparseIntArray.append(55, 80);
        sparseIntArray.append(54, 81);
        sparseIntArray.append(115, 82);
        sparseIntArray.append(119, 83);
        sparseIntArray.append(118, 84);
        sparseIntArray.append(117, 85);
        sparseIntArray.append(116, 86);
        sparseIntArray2.append(84, 6);
        sparseIntArray2.append(84, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(88, 13);
        sparseIntArray2.append(91, 16);
        sparseIntArray2.append(89, 14);
        sparseIntArray2.append(86, 11);
        sparseIntArray2.append(90, 15);
        sparseIntArray2.append(87, 12);
        sparseIntArray2.append(77, 40);
        sparseIntArray2.append(70, 39);
        sparseIntArray2.append(69, 41);
        sparseIntArray2.append(76, 42);
        sparseIntArray2.append(68, 20);
        sparseIntArray2.append(75, 37);
        sparseIntArray2.append(59, 5);
        sparseIntArray2.append(71, 87);
        sparseIntArray2.append(74, 87);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(55, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(78, 95);
        sparseIntArray2.append(63, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(79, 54);
        sparseIntArray2.append(64, 55);
        sparseIntArray2.append(80, 56);
        sparseIntArray2.append(65, 57);
        sparseIntArray2.append(81, 58);
        sparseIntArray2.append(66, 59);
        sparseIntArray2.append(58, 62);
        sparseIntArray2.append(57, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(104, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(105, 67);
        sparseIntArray2.append(95, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(96, 98);
        sparseIntArray2.append(94, 68);
        sparseIntArray2.append(82, 69);
        sparseIntArray2.append(67, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(97, 76);
        sparseIntArray2.append(73, 77);
        sparseIntArray2.append(106, 78);
        sparseIntArray2.append(54, 80);
        sparseIntArray2.append(53, 81);
        sparseIntArray2.append(99, 82);
        sparseIntArray2.append(103, 83);
        sparseIntArray2.append(102, 84);
        sparseIntArray2.append(101, 85);
        sparseIntArray2.append(100, 86);
        sparseIntArray2.append(93, 97);
    }

    public static int[] c(Barrier barrier, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Integer num = null;
            try {
                iIntValue = fac.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                if (strTrim != null) {
                    HashMap<String, Integer> map = constraintLayout.e0;
                    if (map != null && map.containsKey(strTrim)) {
                        num = constraintLayout.e0.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (num != null && (num instanceof Integer)) {
                    iIntValue = num.intValue();
                }
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    public static a d(Context context, AttributeSet attributeSet, boolean z) {
        int i;
        int i2;
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? nac.c : nac.a);
        String[] strArr = ze4.c;
        d dVar = aVar.b;
        e eVar = aVar.e;
        C0028c c0028c = aVar.c;
        b bVar = aVar.d;
        int[] iArr = d;
        SparseIntArray sparseIntArray = e;
        if (z) {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            a.C0027a c0027a = new a.C0027a();
            c0027a.a = new int[10];
            c0027a.b = new int[10];
            c0027a.c = 0;
            c0027a.d = new int[10];
            c0027a.e = new float[10];
            c0027a.f = 0;
            c0027a.g = new int[5];
            c0027a.h = new String[5];
            c0027a.i = 0;
            c0027a.j = new int[4];
            c0027a.k = new boolean[4];
            c0027a.l = 0;
            c0028c.getClass();
            bVar.getClass();
            eVar.getClass();
            int i3 = 0;
            while (i3 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                int i4 = indexCount;
                switch (f.get(index)) {
                    case 2:
                        i2 = i3;
                        c0027a.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.H));
                        continue;
                        i3 = i2 + 1;
                        indexCount = i4;
                        break;
                    case 3:
                    case 4:
                    case DatadogLogGenerator.CRASH /* 9 */:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case RendererMetrics.SAMPLES /* 30 */:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                        i2 = i3;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 5:
                        i2 = i3;
                        c0027a.c(5, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i3 = i2 + 1;
                        indexCount = i4;
                        break;
                    case 6:
                        i2 = i3;
                        c0027a.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar.B));
                        break;
                    case 7:
                        i2 = i3;
                        c0027a.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar.C));
                        break;
                    case 8:
                        i2 = i3;
                        c0027a.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.I));
                        break;
                    case 11:
                        i2 = i3;
                        c0027a.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.O));
                        break;
                    case 12:
                        i2 = i3;
                        c0027a.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.P));
                        break;
                    case 13:
                        i2 = i3;
                        c0027a.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.L));
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 14 */:
                        i2 = i3;
                        c0027a.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.N));
                        break;
                    case 15:
                        i2 = i3;
                        c0027a.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.Q));
                        break;
                    case 16:
                        i2 = i3;
                        c0027a.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.M));
                        break;
                    case 17:
                        i2 = i3;
                        c0027a.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar.d));
                        break;
                    case 18:
                        i2 = i3;
                        c0027a.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar.e));
                        break;
                    case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                        i2 = i3;
                        c0027a.a(typedArrayObtainStyledAttributes.getFloat(index, bVar.f), 19);
                        break;
                    case 20:
                        i2 = i3;
                        c0027a.a(typedArrayObtainStyledAttributes.getFloat(index, bVar.v), 20);
                        break;
                    case 21:
                        i2 = i3;
                        c0027a.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, bVar.c));
                        break;
                    case 22:
                        i2 = i3;
                        c0027a.b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, dVar.a)]);
                        break;
                    case 23:
                        i2 = i3;
                        c0027a.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, bVar.b));
                        break;
                    case 24:
                        i2 = i3;
                        c0027a.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.E));
                        break;
                    case 27:
                        i2 = i3;
                        c0027a.b(27, typedArrayObtainStyledAttributes.getInt(index, bVar.D));
                        break;
                    case 28:
                        i2 = i3;
                        c0027a.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.F));
                        break;
                    case 31:
                        i2 = i3;
                        c0027a.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.J));
                        break;
                    case 34:
                        i2 = i3;
                        c0027a.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.G));
                        break;
                    case 37:
                        i2 = i3;
                        c0027a.a(typedArrayObtainStyledAttributes.getFloat(index, bVar.w), 37);
                        break;
                    case 38:
                        i2 = i3;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, aVar.a);
                        aVar.a = resourceId;
                        c0027a.b(38, resourceId);
                        break;
                    case 39:
                        i2 = i3;
                        c0027a.a(typedArrayObtainStyledAttributes.getFloat(index, bVar.T), 39);
                        break;
                    case 40:
                        i2 = i3;
                        c0027a.a(typedArrayObtainStyledAttributes.getFloat(index, bVar.S), 40);
                        break;
                    case 41:
                        i2 = i3;
                        c0027a.b(41, typedArrayObtainStyledAttributes.getInt(index, bVar.U));
                        break;
                    case 42:
                        i2 = i3;
                        c0027a.b(42, typedArrayObtainStyledAttributes.getInt(index, bVar.V));
                        break;
                    case 43:
                        i2 = i3;
                        c0027a.a(typedArrayObtainStyledAttributes.getFloat(index, dVar.c), 43);
                        break;
                    case 44:
                        i2 = i3;
                        c0027a.d(44, true);
                        c0027a.a(typedArrayObtainStyledAttributes.getDimension(index, eVar.m), 44);
                        break;
                    case 45:
                        i2 = i3;
                        c0027a.a(typedArrayObtainStyledAttributes.getFloat(index, eVar.b), 45);
                        break;
                    case 46:
                        i2 = i3;
                        c0027a.a(typedArrayObtainStyledAttributes.getFloat(index, eVar.c), 46);
                        break;
                    case 47:
                        i2 = i3;
                        c0027a.a(typedArrayObtainStyledAttributes.getFloat(index, eVar.d), 47);
                        break;
                    case 48:
                        i2 = i3;
                        c0027a.a(typedArrayObtainStyledAttributes.getFloat(index, eVar.e), 48);
                        break;
                    case 49:
                        i2 = i3;
                        c0027a.a(typedArrayObtainStyledAttributes.getDimension(index, eVar.f), 49);
                        break;
                    case 50:
                        i2 = i3;
                        c0027a.a(typedArrayObtainStyledAttributes.getDimension(index, eVar.g), 50);
                        break;
                    case 51:
                        i2 = i3;
                        c0027a.a(typedArrayObtainStyledAttributes.getDimension(index, eVar.i), 51);
                        break;
                    case 52:
                        i2 = i3;
                        c0027a.a(typedArrayObtainStyledAttributes.getDimension(index, eVar.j), 52);
                        break;
                    case 53:
                        i2 = i3;
                        c0027a.a(typedArrayObtainStyledAttributes.getDimension(index, eVar.k), 53);
                        break;
                    case 54:
                        i2 = i3;
                        c0027a.b(54, typedArrayObtainStyledAttributes.getInt(index, bVar.W));
                        break;
                    case RumViewScope.SLOW_RENDERED_THRESHOLD_FPS /* 55 */:
                        i2 = i3;
                        c0027a.b(55, typedArrayObtainStyledAttributes.getInt(index, bVar.X));
                        break;
                    case 56:
                        i2 = i3;
                        c0027a.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.Y));
                        break;
                    case 57:
                        i2 = i3;
                        c0027a.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.Z));
                        break;
                    case 58:
                        i2 = i3;
                        c0027a.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.a0));
                        break;
                    case 59:
                        i2 = i3;
                        c0027a.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.b0));
                        break;
                    case 60:
                        i2 = i3;
                        c0027a.a(typedArrayObtainStyledAttributes.getFloat(index, eVar.a), 60);
                        break;
                    case 62:
                        i2 = i3;
                        c0027a.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.z));
                        break;
                    case AndroidTracer.SPAN_ID_BIT_SIZE /* 63 */:
                        i2 = i3;
                        c0027a.a(typedArrayObtainStyledAttributes.getFloat(index, bVar.A), 63);
                        break;
                    case 64:
                        i2 = i3;
                        c0027a.b(64, f(typedArrayObtainStyledAttributes, index, c0028c.a));
                        break;
                    case 65:
                        i2 = i3;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            c0027a.c(65, typedArrayObtainStyledAttributes.getString(index));
                        } else {
                            c0027a.c(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        }
                        break;
                    case 66:
                        i2 = i3;
                        c0027a.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i2 = i3;
                        c0027a.a(typedArrayObtainStyledAttributes.getFloat(index, c0028c.e), 67);
                        break;
                    case 68:
                        i2 = i3;
                        c0027a.a(typedArrayObtainStyledAttributes.getFloat(index, dVar.d), 68);
                        break;
                    case 69:
                        i2 = i3;
                        c0027a.a(typedArrayObtainStyledAttributes.getFloat(index, 1.0f), 69);
                        break;
                    case 70:
                        i2 = i3;
                        c0027a.a(typedArrayObtainStyledAttributes.getFloat(index, 1.0f), 70);
                        break;
                    case 71:
                        i2 = i3;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i2 = i3;
                        c0027a.b(72, typedArrayObtainStyledAttributes.getInt(index, bVar.e0));
                        break;
                    case 73:
                        i2 = i3;
                        c0027a.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f0));
                        break;
                    case 74:
                        i2 = i3;
                        c0027a.c(74, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        i2 = i3;
                        c0027a.d(75, typedArrayObtainStyledAttributes.getBoolean(index, bVar.m0));
                        break;
                    case 76:
                        i2 = i3;
                        c0027a.b(76, typedArrayObtainStyledAttributes.getInt(index, c0028c.c));
                        break;
                    case 77:
                        i2 = i3;
                        c0027a.c(77, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i2 = i3;
                        c0027a.b(78, typedArrayObtainStyledAttributes.getInt(index, dVar.b));
                        break;
                    case 79:
                        i2 = i3;
                        c0027a.a(typedArrayObtainStyledAttributes.getFloat(index, c0028c.d), 79);
                        break;
                    case 80:
                        i2 = i3;
                        c0027a.d(80, typedArrayObtainStyledAttributes.getBoolean(index, bVar.k0));
                        break;
                    case 81:
                        i2 = i3;
                        c0027a.d(81, typedArrayObtainStyledAttributes.getBoolean(index, bVar.l0));
                        break;
                    case 82:
                        i2 = i3;
                        c0027a.b(82, typedArrayObtainStyledAttributes.getInteger(index, c0028c.b));
                        break;
                    case 83:
                        i2 = i3;
                        c0027a.b(83, f(typedArrayObtainStyledAttributes, index, eVar.h));
                        break;
                    case 84:
                        i2 = i3;
                        c0027a.b(84, typedArrayObtainStyledAttributes.getInteger(index, c0028c.g));
                        break;
                    case 85:
                        i2 = i3;
                        c0027a.a(typedArrayObtainStyledAttributes.getFloat(index, c0028c.f), 85);
                        break;
                    case 86:
                        i2 = i3;
                        int i5 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i5 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            c0028c.i = resourceId2;
                            c0027a.b(89, resourceId2);
                            if (c0028c.i != -1) {
                                c0027a.b(88, -2);
                            }
                        } else if (i5 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            c0028c.h = string;
                            c0027a.c(90, string);
                            if (c0028c.h.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                c0028c.i = resourceId3;
                                c0027a.b(89, resourceId3);
                                c0027a.b(88, -2);
                            } else {
                                c0027a.b(88, -1);
                            }
                        } else {
                            c0027a.b(88, typedArrayObtainStyledAttributes.getInteger(index, c0028c.i));
                        }
                        break;
                    case 87:
                        i2 = i3;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i2 = i3;
                        c0027a.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.K));
                        break;
                    case 94:
                        i2 = i3;
                        c0027a.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.R));
                        break;
                    case 95:
                        i2 = i3;
                        g(c0027a, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i2 = i3;
                        g(c0027a, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i2 = i3;
                        c0027a.b(97, typedArrayObtainStyledAttributes.getInt(index, bVar.n0));
                        break;
                    case 98:
                        i2 = i3;
                        int i6 = rz9.w0;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            aVar.a = typedArrayObtainStyledAttributes.getResourceId(index, aVar.a);
                        }
                        break;
                }
                i3 = i2 + 1;
                indexCount = i4;
            }
        } else {
            int i7 = 0;
            for (int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount(); i7 < indexCount2; indexCount2 = i) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        c0028c.getClass();
                        bVar.getClass();
                        eVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        bVar.o = f(typedArrayObtainStyledAttributes, index2, bVar.o);
                        continue;
                        i7++;
                        break;
                    case 2:
                        i = indexCount2;
                        bVar.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.H);
                        continue;
                        i7++;
                        break;
                    case 3:
                        i = indexCount2;
                        bVar.n = f(typedArrayObtainStyledAttributes, index2, bVar.n);
                        continue;
                        i7++;
                        break;
                    case 4:
                        i = indexCount2;
                        bVar.m = f(typedArrayObtainStyledAttributes, index2, bVar.m);
                        continue;
                        i7++;
                        break;
                    case 5:
                        i = indexCount2;
                        bVar.x = typedArrayObtainStyledAttributes.getString(index2);
                        continue;
                        i7++;
                        break;
                    case 6:
                        i = indexCount2;
                        bVar.B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, bVar.B);
                        continue;
                        i7++;
                        break;
                    case 7:
                        i = indexCount2;
                        bVar.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, bVar.C);
                        continue;
                        i7++;
                        break;
                    case 8:
                        i = indexCount2;
                        bVar.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.I);
                        continue;
                        i7++;
                        break;
                    case DatadogLogGenerator.CRASH /* 9 */:
                        i = indexCount2;
                        bVar.u = f(typedArrayObtainStyledAttributes, index2, bVar.u);
                        continue;
                        i7++;
                        break;
                    case 10:
                        i = indexCount2;
                        bVar.t = f(typedArrayObtainStyledAttributes, index2, bVar.t);
                        continue;
                        i7++;
                        break;
                    case 11:
                        i = indexCount2;
                        bVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.O);
                        continue;
                        i7++;
                        break;
                    case 12:
                        i = indexCount2;
                        bVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.P);
                        continue;
                        i7++;
                        break;
                    case 13:
                        i = indexCount2;
                        bVar.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.L);
                        continue;
                        i7++;
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 14 */:
                        i = indexCount2;
                        bVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.N);
                        continue;
                        i7++;
                        break;
                    case 15:
                        i = indexCount2;
                        bVar.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.Q);
                        continue;
                        i7++;
                        break;
                    case 16:
                        i = indexCount2;
                        bVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.M);
                        continue;
                        i7++;
                        break;
                    case 17:
                        i = indexCount2;
                        bVar.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, bVar.d);
                        continue;
                        i7++;
                        break;
                    case 18:
                        i = indexCount2;
                        bVar.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, bVar.e);
                        continue;
                        i7++;
                        break;
                    case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                        i = indexCount2;
                        bVar.f = typedArrayObtainStyledAttributes.getFloat(index2, bVar.f);
                        continue;
                        i7++;
                        break;
                    case 20:
                        i = indexCount2;
                        bVar.v = typedArrayObtainStyledAttributes.getFloat(index2, bVar.v);
                        continue;
                        i7++;
                        break;
                    case 21:
                        i = indexCount2;
                        bVar.c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, bVar.c);
                        continue;
                        i7++;
                        break;
                    case 22:
                        i = indexCount2;
                        int i8 = typedArrayObtainStyledAttributes.getInt(index2, dVar.a);
                        dVar.a = i8;
                        dVar.a = iArr[i8];
                        continue;
                        i7++;
                        break;
                    case 23:
                        i = indexCount2;
                        bVar.b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, bVar.b);
                        continue;
                        i7++;
                        break;
                    case 24:
                        i = indexCount2;
                        bVar.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.E);
                        continue;
                        i7++;
                        break;
                    case 25:
                        i = indexCount2;
                        bVar.g = f(typedArrayObtainStyledAttributes, index2, bVar.g);
                        continue;
                        i7++;
                        break;
                    case 26:
                        i = indexCount2;
                        bVar.h = f(typedArrayObtainStyledAttributes, index2, bVar.h);
                        continue;
                        i7++;
                        break;
                    case 27:
                        i = indexCount2;
                        bVar.D = typedArrayObtainStyledAttributes.getInt(index2, bVar.D);
                        continue;
                        i7++;
                        break;
                    case 28:
                        i = indexCount2;
                        bVar.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.F);
                        continue;
                        i7++;
                        break;
                    case 29:
                        i = indexCount2;
                        bVar.i = f(typedArrayObtainStyledAttributes, index2, bVar.i);
                        continue;
                        i7++;
                        break;
                    case RendererMetrics.SAMPLES /* 30 */:
                        i = indexCount2;
                        bVar.j = f(typedArrayObtainStyledAttributes, index2, bVar.j);
                        continue;
                        i7++;
                        break;
                    case 31:
                        i = indexCount2;
                        bVar.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.J);
                        continue;
                        i7++;
                        break;
                    case 32:
                        i = indexCount2;
                        bVar.r = f(typedArrayObtainStyledAttributes, index2, bVar.r);
                        continue;
                        i7++;
                        break;
                    case 33:
                        i = indexCount2;
                        bVar.s = f(typedArrayObtainStyledAttributes, index2, bVar.s);
                        continue;
                        i7++;
                        break;
                    case 34:
                        i = indexCount2;
                        bVar.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.G);
                        continue;
                        i7++;
                        break;
                    case 35:
                        i = indexCount2;
                        bVar.l = f(typedArrayObtainStyledAttributes, index2, bVar.l);
                        continue;
                        i7++;
                        break;
                    case 36:
                        i = indexCount2;
                        bVar.k = f(typedArrayObtainStyledAttributes, index2, bVar.k);
                        continue;
                        i7++;
                        break;
                    case 37:
                        i = indexCount2;
                        bVar.w = typedArrayObtainStyledAttributes.getFloat(index2, bVar.w);
                        continue;
                        i7++;
                        break;
                    case 38:
                        i = indexCount2;
                        aVar.a = typedArrayObtainStyledAttributes.getResourceId(index2, aVar.a);
                        continue;
                        i7++;
                        break;
                    case 39:
                        i = indexCount2;
                        bVar.T = typedArrayObtainStyledAttributes.getFloat(index2, bVar.T);
                        continue;
                        i7++;
                        break;
                    case 40:
                        i = indexCount2;
                        bVar.S = typedArrayObtainStyledAttributes.getFloat(index2, bVar.S);
                        continue;
                        i7++;
                        break;
                    case 41:
                        i = indexCount2;
                        bVar.U = typedArrayObtainStyledAttributes.getInt(index2, bVar.U);
                        continue;
                        i7++;
                        break;
                    case 42:
                        i = indexCount2;
                        bVar.V = typedArrayObtainStyledAttributes.getInt(index2, bVar.V);
                        continue;
                        i7++;
                        break;
                    case 43:
                        i = indexCount2;
                        dVar.c = typedArrayObtainStyledAttributes.getFloat(index2, dVar.c);
                        continue;
                        i7++;
                        break;
                    case 44:
                        i = indexCount2;
                        eVar.l = true;
                        eVar.m = typedArrayObtainStyledAttributes.getDimension(index2, eVar.m);
                        continue;
                        i7++;
                        break;
                    case 45:
                        i = indexCount2;
                        eVar.b = typedArrayObtainStyledAttributes.getFloat(index2, eVar.b);
                        continue;
                        i7++;
                        break;
                    case 46:
                        i = indexCount2;
                        eVar.c = typedArrayObtainStyledAttributes.getFloat(index2, eVar.c);
                        continue;
                        i7++;
                        break;
                    case 47:
                        i = indexCount2;
                        eVar.d = typedArrayObtainStyledAttributes.getFloat(index2, eVar.d);
                        continue;
                        i7++;
                        break;
                    case 48:
                        i = indexCount2;
                        eVar.e = typedArrayObtainStyledAttributes.getFloat(index2, eVar.e);
                        continue;
                        i7++;
                        break;
                    case 49:
                        i = indexCount2;
                        eVar.f = typedArrayObtainStyledAttributes.getDimension(index2, eVar.f);
                        continue;
                        i7++;
                        break;
                    case 50:
                        i = indexCount2;
                        eVar.g = typedArrayObtainStyledAttributes.getDimension(index2, eVar.g);
                        continue;
                        i7++;
                        break;
                    case 51:
                        i = indexCount2;
                        eVar.i = typedArrayObtainStyledAttributes.getDimension(index2, eVar.i);
                        continue;
                        i7++;
                        break;
                    case 52:
                        i = indexCount2;
                        eVar.j = typedArrayObtainStyledAttributes.getDimension(index2, eVar.j);
                        continue;
                        i7++;
                        break;
                    case 53:
                        i = indexCount2;
                        eVar.k = typedArrayObtainStyledAttributes.getDimension(index2, eVar.k);
                        continue;
                        i7++;
                        break;
                    case 54:
                        i = indexCount2;
                        bVar.W = typedArrayObtainStyledAttributes.getInt(index2, bVar.W);
                        continue;
                        i7++;
                        break;
                    case RumViewScope.SLOW_RENDERED_THRESHOLD_FPS /* 55 */:
                        i = indexCount2;
                        bVar.X = typedArrayObtainStyledAttributes.getInt(index2, bVar.X);
                        continue;
                        i7++;
                        break;
                    case 56:
                        i = indexCount2;
                        bVar.Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.Y);
                        continue;
                        i7++;
                        break;
                    case 57:
                        i = indexCount2;
                        bVar.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.Z);
                        continue;
                        i7++;
                        break;
                    case 58:
                        i = indexCount2;
                        bVar.a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.a0);
                        continue;
                        i7++;
                        break;
                    case 59:
                        i = indexCount2;
                        bVar.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.b0);
                        continue;
                        i7++;
                        break;
                    case 60:
                        i = indexCount2;
                        eVar.a = typedArrayObtainStyledAttributes.getFloat(index2, eVar.a);
                        continue;
                        i7++;
                        break;
                    case 61:
                        i = indexCount2;
                        bVar.y = f(typedArrayObtainStyledAttributes, index2, bVar.y);
                        continue;
                        i7++;
                        break;
                    case 62:
                        i = indexCount2;
                        bVar.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.z);
                        continue;
                        i7++;
                        break;
                    case AndroidTracer.SPAN_ID_BIT_SIZE /* 63 */:
                        i = indexCount2;
                        bVar.A = typedArrayObtainStyledAttributes.getFloat(index2, bVar.A);
                        continue;
                        i7++;
                        break;
                    case 64:
                        i = indexCount2;
                        c0028c.a = f(typedArrayObtainStyledAttributes, index2, c0028c.a);
                        continue;
                        i7++;
                        break;
                    case 65:
                        i = indexCount2;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            c0028c.getClass();
                        } else {
                            String str = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            c0028c.getClass();
                            i7++;
                        }
                        break;
                    case 66:
                        i = indexCount2;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        c0028c.getClass();
                        continue;
                        i7++;
                        break;
                    case 67:
                        i = indexCount2;
                        c0028c.e = typedArrayObtainStyledAttributes.getFloat(index2, c0028c.e);
                        break;
                    case 68:
                        i = indexCount2;
                        dVar.d = typedArrayObtainStyledAttributes.getFloat(index2, dVar.d);
                        break;
                    case 69:
                        i = indexCount2;
                        bVar.c0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i = indexCount2;
                        bVar.d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i = indexCount2;
                        bVar.e0 = typedArrayObtainStyledAttributes.getInt(index2, bVar.e0);
                        break;
                    case 73:
                        i = indexCount2;
                        bVar.f0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.f0);
                        break;
                    case 74:
                        i = indexCount2;
                        bVar.i0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i = indexCount2;
                        bVar.m0 = typedArrayObtainStyledAttributes.getBoolean(index2, bVar.m0);
                        break;
                    case 76:
                        i = indexCount2;
                        c0028c.c = typedArrayObtainStyledAttributes.getInt(index2, c0028c.c);
                        break;
                    case 77:
                        i = indexCount2;
                        bVar.j0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i = indexCount2;
                        dVar.b = typedArrayObtainStyledAttributes.getInt(index2, dVar.b);
                        break;
                    case 79:
                        i = indexCount2;
                        c0028c.d = typedArrayObtainStyledAttributes.getFloat(index2, c0028c.d);
                        break;
                    case 80:
                        i = indexCount2;
                        bVar.k0 = typedArrayObtainStyledAttributes.getBoolean(index2, bVar.k0);
                        break;
                    case 81:
                        i = indexCount2;
                        bVar.l0 = typedArrayObtainStyledAttributes.getBoolean(index2, bVar.l0);
                        break;
                    case 82:
                        i = indexCount2;
                        c0028c.b = typedArrayObtainStyledAttributes.getInteger(index2, c0028c.b);
                        break;
                    case 83:
                        i = indexCount2;
                        eVar.h = f(typedArrayObtainStyledAttributes, index2, eVar.h);
                        break;
                    case 84:
                        i = indexCount2;
                        c0028c.g = typedArrayObtainStyledAttributes.getInteger(index2, c0028c.g);
                        break;
                    case 85:
                        i = indexCount2;
                        c0028c.f = typedArrayObtainStyledAttributes.getFloat(index2, c0028c.f);
                        break;
                    case 86:
                        i = indexCount2;
                        int i9 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i9 == 1) {
                            c0028c.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i9 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            c0028c.h = string2;
                            if (string2.indexOf("/") > 0) {
                                c0028c.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, c0028c.i);
                        }
                        break;
                    case 87:
                        i = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 91:
                        i = indexCount2;
                        bVar.p = f(typedArrayObtainStyledAttributes, index2, bVar.p);
                        break;
                    case 92:
                        i = indexCount2;
                        bVar.q = f(typedArrayObtainStyledAttributes, index2, bVar.q);
                        break;
                    case 93:
                        i = indexCount2;
                        bVar.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.K);
                        break;
                    case 94:
                        i = indexCount2;
                        bVar.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, bVar.R);
                        break;
                    case 95:
                        i = indexCount2;
                        g(bVar, typedArrayObtainStyledAttributes, index2, 0);
                        continue;
                        i7++;
                        break;
                    case 96:
                        i = indexCount2;
                        g(bVar, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i = indexCount2;
                        bVar.n0 = typedArrayObtainStyledAttributes.getInt(index2, bVar.n0);
                        break;
                }
                i7++;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public static int f(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.c.g(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void h(ConstraintLayout.a aVar, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                i = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f2 = Float.parseFloat(strSubstring3);
                        float f3 = Float.parseFloat(strSubstring4);
                        if (f2 > 0.0f && f3 > 0.0f) {
                            if (i == 1) {
                                Math.abs(f3 / f2);
                            } else {
                                Math.abs(f2 / f3);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        aVar.F = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i;
        HashMap<String, androidx.constraintlayout.widget.a> map;
        String resourceEntryName;
        c cVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> map2 = cVar.c;
        HashSet<Integer> hashSet2 = new HashSet(map2.keySet());
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!map2.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb.append(resourceEntryName);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (cVar.b && id == -1) {
                    b0.o("All children of ConstraintLayout must have ids to use ConstraintSet");
                    return;
                }
                if (id != -1) {
                    if (map2.containsKey(Integer.valueOf(id))) {
                        hashSet2.remove(Integer.valueOf(id));
                        a aVar = map2.get(Integer.valueOf(id));
                        if (aVar != null) {
                            d dVar = aVar.b;
                            b bVar = aVar.d;
                            e eVar = aVar.e;
                            if (childAt instanceof Barrier) {
                                bVar.g0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(bVar.e0);
                                barrier.setMargin(bVar.f0);
                                barrier.setAllowsGoneWidget(bVar.m0);
                                int[] iArr = bVar.h0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.i0;
                                    if (str != null) {
                                        int[] iArrC = c(barrier, str);
                                        bVar.h0 = iArrC;
                                        barrier.setReferencedIds(iArrC);
                                    }
                                }
                            }
                            ConstraintLayout.a aVar2 = (ConstraintLayout.a) childAt.getLayoutParams();
                            aVar2.a();
                            aVar.a(aVar2);
                            HashMap<String, androidx.constraintlayout.widget.a> map3 = aVar.f;
                            Class<?> cls = childAt.getClass();
                            for (String str2 : map3.keySet()) {
                                androidx.constraintlayout.widget.a aVar3 = map3.get(str2);
                                HashSet hashSet3 = hashSet2;
                                String strL = !aVar3.a ? l5.l("set", str2) : str2;
                                int i3 = i2;
                                try {
                                    int iOrdinal = aVar3.c.ordinal();
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (iOrdinal) {
                                        case 0:
                                            map = map3;
                                            cls.getMethod(strL, cls3).invoke(childAt, Integer.valueOf(aVar3.d));
                                            break;
                                        case 1:
                                            map = map3;
                                            cls.getMethod(strL, cls2).invoke(childAt, Float.valueOf(aVar3.e));
                                            break;
                                        case 2:
                                            map = map3;
                                            cls.getMethod(strL, cls3).invoke(childAt, Integer.valueOf(aVar3.h));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(strL, Drawable.class);
                                            map = map3;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(aVar3.h);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e2) {
                                                e = e2;
                                                StringBuilder sbM = akb.m(" Custom Attribute \"", str2, "\" not found on ");
                                                sbM.append(cls.getName());
                                                Log.e("TransitionLayout", sbM.toString());
                                                e.printStackTrace();
                                            } catch (NoSuchMethodException e3) {
                                                e = e3;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + strL);
                                            } catch (InvocationTargetException e4) {
                                                e = e4;
                                                StringBuilder sbM2 = akb.m(" Custom Attribute \"", str2, "\" not found on ");
                                                sbM2.append(cls.getName());
                                                Log.e("TransitionLayout", sbM2.toString());
                                                e.printStackTrace();
                                            }
                                            break;
                                        case 4:
                                            cls.getMethod(strL, CharSequence.class).invoke(childAt, aVar3.f);
                                            map = map3;
                                            break;
                                        case 5:
                                            cls.getMethod(strL, Boolean.TYPE).invoke(childAt, Boolean.valueOf(aVar3.g));
                                            map = map3;
                                            break;
                                        case 6:
                                            cls.getMethod(strL, cls2).invoke(childAt, Float.valueOf(aVar3.e));
                                            map = map3;
                                            break;
                                        case 7:
                                            cls.getMethod(strL, cls3).invoke(childAt, Integer.valueOf(aVar3.d));
                                            map = map3;
                                            break;
                                        default:
                                            map = map3;
                                            break;
                                    }
                                } catch (IllegalAccessException e5) {
                                    e = e5;
                                    map = map3;
                                } catch (NoSuchMethodException e6) {
                                    e = e6;
                                    map = map3;
                                } catch (InvocationTargetException e7) {
                                    e = e7;
                                    map = map3;
                                }
                                hashSet2 = hashSet3;
                                i2 = i3;
                                map3 = map;
                            }
                            hashSet = hashSet2;
                            i = i2;
                            childAt.setLayoutParams(aVar2);
                            if (dVar.b == 0) {
                                childAt.setVisibility(dVar.a);
                            }
                            childAt.setAlpha(dVar.c);
                            childAt.setRotation(eVar.a);
                            childAt.setRotationX(eVar.b);
                            childAt.setRotationY(eVar.c);
                            childAt.setScaleX(eVar.d);
                            childAt.setScaleY(eVar.e);
                            if (eVar.h != -1) {
                                if (((View) childAt.getParent()).findViewById(eVar.h) != null) {
                                    float bottom = (r0.getBottom() + r0.getTop()) / 2.0f;
                                    float right = (r0.getRight() + r0.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.f)) {
                                    childAt.setPivotX(eVar.f);
                                }
                                if (!Float.isNaN(eVar.g)) {
                                    childAt.setPivotY(eVar.g);
                                }
                            }
                            childAt.setTranslationX(eVar.i);
                            childAt.setTranslationY(eVar.j);
                            childAt.setTranslationZ(eVar.k);
                            if (eVar.l) {
                                childAt.setElevation(eVar.m);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i = i2;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
                i2 = i + 1;
                cVar = this;
                hashSet2 = hashSet;
            }
            hashSet = hashSet2;
            i = i2;
            i2 = i + 1;
            cVar = this;
            hashSet2 = hashSet;
        }
        for (Integer num : hashSet2) {
            a aVar4 = map2.get(num);
            if (aVar4 != null) {
                b bVar2 = aVar4.d;
                if (bVar2.g0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = bVar2.h0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str3 = bVar2.i0;
                        if (str3 != null) {
                            int[] iArrC2 = c(barrier2, str3);
                            bVar2.h0 = iArrC2;
                            barrier2.setReferencedIds(iArrC2);
                        }
                    }
                    barrier2.setType(bVar2.e0);
                    barrier2.setMargin(bVar2.f0);
                    tde tdeVar = ConstraintLayout.j0;
                    ConstraintLayout.a aVar5 = new ConstraintLayout.a();
                    barrier2.i();
                    aVar4.a(aVar5);
                    constraintLayout.addView(barrier2, aVar5);
                }
                if (bVar2.a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    tde tdeVar2 = ConstraintLayout.j0;
                    ConstraintLayout.a aVar6 = new ConstraintLayout.a();
                    aVar4.a(aVar6);
                    constraintLayout.addView(guideline, aVar6);
                }
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = constraintLayout.getChildAt(i4);
            if (childAt2 instanceof androidx.constraintlayout.widget.b) {
                ((androidx.constraintlayout.widget.b) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i;
        HashMap<Integer, a> map;
        HashMap<Integer, a> map2;
        c cVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> map3 = cVar.c;
        map3.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.a aVar = (ConstraintLayout.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (cVar.b && id == -1) {
                b0.o("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            }
            if (!map3.containsKey(Integer.valueOf(id))) {
                map3.put(Integer.valueOf(id), new a());
            }
            a aVar2 = map3.get(Integer.valueOf(id));
            if (aVar2 == null) {
                i = childCount;
                map = map3;
            } else {
                d dVar = aVar2.b;
                b bVar = aVar2.d;
                e eVar = aVar2.e;
                HashMap<String, androidx.constraintlayout.widget.a> map4 = new HashMap<>();
                Class<?> cls = childAt.getClass();
                HashMap<String, androidx.constraintlayout.widget.a> map5 = cVar.a;
                for (String str : map5.keySet()) {
                    androidx.constraintlayout.widget.a aVar3 = map5.get(str);
                    int i3 = childCount;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map2 = map3;
                            try {
                                map4.put(str, new androidx.constraintlayout.widget.a(aVar3, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException e2) {
                                e = e2;
                                e.printStackTrace();
                            } catch (NoSuchMethodException e3) {
                                e = e3;
                                e.printStackTrace();
                            } catch (InvocationTargetException e4) {
                                e = e4;
                                e.printStackTrace();
                            }
                        } else {
                            map2 = map3;
                            map4.put(str, new androidx.constraintlayout.widget.a(aVar3, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e5) {
                        e = e5;
                        map2 = map3;
                    } catch (NoSuchMethodException e6) {
                        e = e6;
                        map2 = map3;
                    } catch (InvocationTargetException e7) {
                        e = e7;
                        map2 = map3;
                    }
                    childCount = i3;
                    map3 = map2;
                }
                i = childCount;
                map = map3;
                aVar2.f = map4;
                aVar2.b(id, aVar);
                dVar.a = childAt.getVisibility();
                dVar.c = childAt.getAlpha();
                eVar.a = childAt.getRotation();
                eVar.b = childAt.getRotationX();
                eVar.c = childAt.getRotationY();
                eVar.d = childAt.getScaleX();
                eVar.e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    eVar.f = pivotX;
                    eVar.g = pivotY;
                }
                eVar.i = childAt.getTranslationX();
                eVar.j = childAt.getTranslationY();
                eVar.k = childAt.getTranslationZ();
                if (eVar.l) {
                    eVar.m = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    bVar.m0 = barrier.getAllowsGoneWidget();
                    bVar.h0 = barrier.getReferencedIds();
                    bVar.e0 = barrier.getType();
                    bVar.f0 = barrier.getMargin();
                }
            }
            i2++;
            cVar = this;
            childCount = i;
            map3 = map;
        }
    }

    public final void e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a aVarD = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarD.d.a = true;
                    }
                    this.c.put(Integer.valueOf(aVarD.a), aVarD);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
