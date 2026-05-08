package defpackage;

import android.net.Uri;
import android.os.Bundle;
import app.rive.runtime.kotlin.renderers.RendererMetrics;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.e47;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class oj9 {
    public static final oj9 K = new oj9(new a());
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
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
    public final CharSequence A;
    public final CharSequence B;
    public final Integer C;
    public final Integer D;
    public final CharSequence E;
    public final CharSequence F;
    public final CharSequence G;
    public final Integer H;
    public final Bundle I;
    public final e47<String> J;
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final CharSequence g;
    public final Long h;
    public final qic i;
    public final qic j;
    public final byte[] k;
    public final Integer l;
    public final Uri m;
    public final Integer n;
    public final Integer o;

    @Deprecated
    public final Integer p;
    public final Boolean q;
    public final Boolean r;

    @Deprecated
    public final Integer s;
    public final Integer t;
    public final Integer u;
    public final Integer v;
    public final Integer w;
    public final Integer x;
    public final Integer y;
    public final CharSequence z;

    public static final class a {
        public CharSequence A;
        public Integer B;
        public Integer C;
        public CharSequence D;
        public CharSequence E;
        public CharSequence F;
        public Integer G;
        public Bundle H;
        public e47<String> I;
        public CharSequence a;
        public CharSequence b;
        public CharSequence c;
        public CharSequence d;
        public CharSequence e;
        public CharSequence f;
        public CharSequence g;
        public Long h;
        public qic i;
        public qic j;
        public byte[] k;
        public Integer l;
        public Uri m;
        public Integer n;
        public Integer o;
        public Integer p;
        public Boolean q;
        public Boolean r;
        public Integer s;
        public Integer t;
        public Integer u;
        public Integer v;
        public Integer w;
        public Integer x;
        public CharSequence y;
        public CharSequence z;

        public a() {
            e47.b bVar = e47.b;
            this.I = qyc.e;
        }

        public final void a(int i, byte[] bArr) {
            if (this.k == null || i == 3 || !Objects.equals(this.l, 3)) {
                this.k = (byte[]) bArr.clone();
                this.l = Integer.valueOf(i);
            }
        }

        public final void b(byte[] bArr, Integer num) {
            this.k = bArr == null ? null : (byte[]) bArr.clone();
            this.l = num;
        }

        public final void c(Long l) {
            ka2.l(l == null || l.longValue() >= 0);
            this.h = l;
        }
    }

    static {
        String str = vjg.a;
        L = Integer.toString(0, 36);
        M = Integer.toString(1, 36);
        N = Integer.toString(2, 36);
        O = Integer.toString(3, 36);
        P = Integer.toString(4, 36);
        Q = Integer.toString(5, 36);
        R = Integer.toString(6, 36);
        S = Integer.toString(8, 36);
        T = Integer.toString(9, 36);
        U = Integer.toString(10, 36);
        V = Integer.toString(11, 36);
        W = Integer.toString(12, 36);
        X = Integer.toString(13, 36);
        Y = Integer.toString(14, 36);
        Z = Integer.toString(15, 36);
        a0 = Integer.toString(16, 36);
        b0 = Integer.toString(17, 36);
        c0 = Integer.toString(18, 36);
        d0 = Integer.toString(19, 36);
        e0 = Integer.toString(20, 36);
        f0 = Integer.toString(21, 36);
        g0 = Integer.toString(22, 36);
        h0 = Integer.toString(23, 36);
        i0 = Integer.toString(24, 36);
        j0 = Integer.toString(25, 36);
        k0 = Integer.toString(26, 36);
        l0 = Integer.toString(27, 36);
        m0 = Integer.toString(28, 36);
        n0 = Integer.toString(29, 36);
        o0 = Integer.toString(30, 36);
        p0 = Integer.toString(31, 36);
        q0 = Integer.toString(32, 36);
        r0 = Integer.toString(33, 36);
        s0 = Integer.toString(34, 36);
        t0 = Integer.toString(1000, 36);
    }

    public oj9(a aVar) {
        Boolean boolValueOf = aVar.q;
        Integer numValueOf = aVar.p;
        Integer numValueOf2 = aVar.G;
        int i = 1;
        int i2 = 0;
        int i3 = 0;
        if (boolValueOf != null) {
            if (!boolValueOf.booleanValue()) {
                numValueOf = -1;
            } else if (numValueOf == null || numValueOf.intValue() == -1) {
                if (numValueOf2 != null) {
                    switch (numValueOf2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case DatadogLogGenerator.CRASH /* 9 */:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case ModuleDescriptor.MODULE_VERSION /* 14 */:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case RendererMetrics.SAMPLES /* 30 */:
                        default:
                            i = 0;
                            break;
                        case 21:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    i3 = i;
                }
                numValueOf = Integer.valueOf(i3);
            }
        } else if (numValueOf != null) {
            boolean z = numValueOf.intValue() != -1;
            boolValueOf = Boolean.valueOf(z);
            if (z && numValueOf2 == null) {
                switch (numValueOf.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i2 = 21;
                        break;
                    case 3:
                        i2 = 22;
                        break;
                    case 4:
                        i2 = 23;
                        break;
                    case 5:
                        i2 = 24;
                        break;
                    case 6:
                        i2 = 25;
                        break;
                    default:
                        i2 = 20;
                        break;
                }
                numValueOf2 = Integer.valueOf(i2);
            }
        }
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.i;
        this.j = aVar.j;
        this.k = aVar.k;
        this.l = aVar.l;
        this.m = aVar.m;
        this.n = aVar.n;
        this.o = aVar.o;
        this.p = numValueOf;
        this.q = boolValueOf;
        this.r = aVar.r;
        Integer num = aVar.s;
        this.s = num;
        this.t = num;
        this.u = aVar.t;
        this.v = aVar.u;
        this.w = aVar.v;
        this.x = aVar.w;
        this.y = aVar.x;
        this.z = aVar.y;
        this.A = aVar.z;
        this.B = aVar.A;
        this.C = aVar.B;
        this.D = aVar.C;
        this.E = aVar.D;
        this.F = aVar.E;
        this.G = aVar.F;
        this.H = numValueOf2;
        this.J = aVar.I;
        this.I = aVar.H;
    }

    public static oj9 b(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        a aVar = new a();
        aVar.a = bundle.getCharSequence(L);
        aVar.b = bundle.getCharSequence(M);
        aVar.c = bundle.getCharSequence(N);
        aVar.d = bundle.getCharSequence(O);
        aVar.e = bundle.getCharSequence(P);
        aVar.f = bundle.getCharSequence(Q);
        aVar.g = bundle.getCharSequence(R);
        byte[] byteArray = bundle.getByteArray(U);
        String str = n0;
        aVar.b(byteArray, bundle.containsKey(str) ? Integer.valueOf(bundle.getInt(str)) : null);
        aVar.m = (Uri) bundle.getParcelable(V);
        aVar.y = bundle.getCharSequence(g0);
        aVar.z = bundle.getCharSequence(h0);
        aVar.A = bundle.getCharSequence(i0);
        aVar.D = bundle.getCharSequence(l0);
        aVar.E = bundle.getCharSequence(m0);
        aVar.F = bundle.getCharSequence(o0);
        aVar.H = bundle.getBundle(t0);
        String str2 = S;
        if (bundle.containsKey(str2) && (bundle3 = bundle.getBundle(str2)) != null) {
            aVar.i = qic.a(bundle3);
        }
        String str3 = T;
        if (bundle.containsKey(str3) && (bundle2 = bundle.getBundle(str3)) != null) {
            aVar.j = qic.a(bundle2);
        }
        String str4 = r0;
        if (bundle.containsKey(str4)) {
            aVar.c(Long.valueOf(bundle.getLong(str4)));
        }
        String str5 = W;
        if (bundle.containsKey(str5)) {
            aVar.n = Integer.valueOf(bundle.getInt(str5));
        }
        String str6 = X;
        if (bundle.containsKey(str6)) {
            aVar.o = Integer.valueOf(bundle.getInt(str6));
        }
        String str7 = Y;
        if (bundle.containsKey(str7)) {
            aVar.p = Integer.valueOf(bundle.getInt(str7));
        }
        String str8 = q0;
        if (bundle.containsKey(str8)) {
            aVar.q = Boolean.valueOf(bundle.getBoolean(str8));
        }
        String str9 = Z;
        if (bundle.containsKey(str9)) {
            aVar.r = Boolean.valueOf(bundle.getBoolean(str9));
        }
        String str10 = a0;
        if (bundle.containsKey(str10)) {
            aVar.s = Integer.valueOf(bundle.getInt(str10));
        }
        String str11 = b0;
        if (bundle.containsKey(str11)) {
            aVar.t = Integer.valueOf(bundle.getInt(str11));
        }
        String str12 = c0;
        if (bundle.containsKey(str12)) {
            aVar.u = Integer.valueOf(bundle.getInt(str12));
        }
        String str13 = d0;
        if (bundle.containsKey(str13)) {
            aVar.v = Integer.valueOf(bundle.getInt(str13));
        }
        String str14 = e0;
        if (bundle.containsKey(str14)) {
            aVar.w = Integer.valueOf(bundle.getInt(str14));
        }
        String str15 = f0;
        if (bundle.containsKey(str15)) {
            aVar.x = Integer.valueOf(bundle.getInt(str15));
        }
        String str16 = j0;
        if (bundle.containsKey(str16)) {
            aVar.B = Integer.valueOf(bundle.getInt(str16));
        }
        String str17 = k0;
        if (bundle.containsKey(str17)) {
            aVar.C = Integer.valueOf(bundle.getInt(str17));
        }
        String str18 = p0;
        if (bundle.containsKey(str18)) {
            aVar.G = Integer.valueOf(bundle.getInt(str18));
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList(s0);
        if (stringArrayList != null) {
            aVar.I = e47.j(stringArrayList);
        }
        return new oj9(aVar);
    }

    public final a a() {
        a aVar = new a();
        aVar.a = this.a;
        aVar.b = this.b;
        aVar.c = this.c;
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.f;
        aVar.g = this.g;
        aVar.h = this.h;
        aVar.i = this.i;
        aVar.j = this.j;
        aVar.k = this.k;
        aVar.l = this.l;
        aVar.m = this.m;
        aVar.n = this.n;
        aVar.o = this.o;
        aVar.p = this.p;
        aVar.q = this.q;
        aVar.r = this.r;
        aVar.s = this.t;
        aVar.t = this.u;
        aVar.u = this.v;
        aVar.v = this.w;
        aVar.w = this.x;
        aVar.x = this.y;
        aVar.y = this.z;
        aVar.z = this.A;
        aVar.A = this.B;
        aVar.B = this.C;
        aVar.C = this.D;
        aVar.D = this.E;
        aVar.E = this.F;
        aVar.F = this.G;
        aVar.G = this.H;
        aVar.I = this.J;
        aVar.H = this.I;
        return aVar;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            bundle.putCharSequence(L, charSequence);
        }
        CharSequence charSequence2 = this.b;
        if (charSequence2 != null) {
            bundle.putCharSequence(M, charSequence2);
        }
        CharSequence charSequence3 = this.c;
        if (charSequence3 != null) {
            bundle.putCharSequence(N, charSequence3);
        }
        CharSequence charSequence4 = this.d;
        if (charSequence4 != null) {
            bundle.putCharSequence(O, charSequence4);
        }
        CharSequence charSequence5 = this.e;
        if (charSequence5 != null) {
            bundle.putCharSequence(P, charSequence5);
        }
        CharSequence charSequence6 = this.f;
        if (charSequence6 != null) {
            bundle.putCharSequence(Q, charSequence6);
        }
        CharSequence charSequence7 = this.g;
        if (charSequence7 != null) {
            bundle.putCharSequence(R, charSequence7);
        }
        Long l = this.h;
        if (l != null) {
            bundle.putLong(r0, l.longValue());
        }
        byte[] bArr = this.k;
        if (bArr != null) {
            bundle.putByteArray(U, bArr);
        }
        Uri uri = this.m;
        if (uri != null) {
            bundle.putParcelable(V, uri);
        }
        CharSequence charSequence8 = this.z;
        if (charSequence8 != null) {
            bundle.putCharSequence(g0, charSequence8);
        }
        CharSequence charSequence9 = this.A;
        if (charSequence9 != null) {
            bundle.putCharSequence(h0, charSequence9);
        }
        CharSequence charSequence10 = this.B;
        if (charSequence10 != null) {
            bundle.putCharSequence(i0, charSequence10);
        }
        CharSequence charSequence11 = this.E;
        if (charSequence11 != null) {
            bundle.putCharSequence(l0, charSequence11);
        }
        CharSequence charSequence12 = this.F;
        if (charSequence12 != null) {
            bundle.putCharSequence(m0, charSequence12);
        }
        CharSequence charSequence13 = this.G;
        if (charSequence13 != null) {
            bundle.putCharSequence(o0, charSequence13);
        }
        qic qicVar = this.i;
        if (qicVar != null) {
            bundle.putBundle(S, qicVar.c());
        }
        qic qicVar2 = this.j;
        if (qicVar2 != null) {
            bundle.putBundle(T, qicVar2.c());
        }
        Integer num = this.n;
        if (num != null) {
            bundle.putInt(W, num.intValue());
        }
        Integer num2 = this.o;
        if (num2 != null) {
            bundle.putInt(X, num2.intValue());
        }
        Integer num3 = this.p;
        if (num3 != null) {
            bundle.putInt(Y, num3.intValue());
        }
        Boolean bool = this.q;
        if (bool != null) {
            bundle.putBoolean(q0, bool.booleanValue());
        }
        Boolean bool2 = this.r;
        if (bool2 != null) {
            bundle.putBoolean(Z, bool2.booleanValue());
        }
        Integer num4 = this.t;
        if (num4 != null) {
            bundle.putInt(a0, num4.intValue());
        }
        Integer num5 = this.u;
        if (num5 != null) {
            bundle.putInt(b0, num5.intValue());
        }
        Integer num6 = this.v;
        if (num6 != null) {
            bundle.putInt(c0, num6.intValue());
        }
        Integer num7 = this.w;
        if (num7 != null) {
            bundle.putInt(d0, num7.intValue());
        }
        Integer num8 = this.x;
        if (num8 != null) {
            bundle.putInt(e0, num8.intValue());
        }
        Integer num9 = this.y;
        if (num9 != null) {
            bundle.putInt(f0, num9.intValue());
        }
        Integer num10 = this.C;
        if (num10 != null) {
            bundle.putInt(j0, num10.intValue());
        }
        Integer num11 = this.D;
        if (num11 != null) {
            bundle.putInt(k0, num11.intValue());
        }
        Integer num12 = this.l;
        if (num12 != null) {
            bundle.putInt(n0, num12.intValue());
        }
        Integer num13 = this.H;
        if (num13 != null) {
            bundle.putInt(p0, num13.intValue());
        }
        e47<String> e47Var = this.J;
        if (!e47Var.isEmpty()) {
            bundle.putStringArrayList(s0, new ArrayList<>(e47Var));
        }
        Bundle bundle2 = this.I;
        if (bundle2 != null) {
            bundle.putBundle(t0, bundle2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && oj9.class == obj.getClass()) {
            oj9 oj9Var = (oj9) obj;
            if (Objects.equals(this.a, oj9Var.a) && Objects.equals(this.b, oj9Var.b) && Objects.equals(this.c, oj9Var.c) && Objects.equals(this.d, oj9Var.d) && Objects.equals(this.e, oj9Var.e) && Objects.equals(this.f, oj9Var.f) && Objects.equals(this.g, oj9Var.g) && Objects.equals(this.h, oj9Var.h) && Objects.equals(this.i, oj9Var.i) && Objects.equals(this.j, oj9Var.j) && Arrays.equals(this.k, oj9Var.k) && Objects.equals(this.l, oj9Var.l) && Objects.equals(this.m, oj9Var.m) && Objects.equals(this.n, oj9Var.n) && Objects.equals(this.o, oj9Var.o) && Objects.equals(this.p, oj9Var.p) && Objects.equals(this.q, oj9Var.q) && Objects.equals(this.r, oj9Var.r) && Objects.equals(this.t, oj9Var.t) && Objects.equals(this.u, oj9Var.u) && Objects.equals(this.v, oj9Var.v) && Objects.equals(this.w, oj9Var.w) && Objects.equals(this.x, oj9Var.x) && Objects.equals(this.y, oj9Var.y) && Objects.equals(this.z, oj9Var.z) && Objects.equals(this.A, oj9Var.A) && Objects.equals(this.B, oj9Var.B) && Objects.equals(this.C, oj9Var.C) && Objects.equals(this.D, oj9Var.D) && Objects.equals(this.E, oj9Var.E) && Objects.equals(this.F, oj9Var.F) && Objects.equals(this.G, oj9Var.G) && Objects.equals(this.H, oj9Var.H) && Objects.equals(this.J, oj9Var.J)) {
                if ((this.I == null) == (oj9Var.I == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, Integer.valueOf(Arrays.hashCode(this.k)), this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, Boolean.valueOf(this.I == null), this.J);
    }
}
