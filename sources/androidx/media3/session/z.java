package androidx.media3.session;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import com.datadog.android.rum.metric.interactiontonextview.TimeBasedInteractionIdentifier;
import defpackage.ba;
import defpackage.bq1;
import defpackage.cdb;
import defpackage.dqf;
import defpackage.e47;
import defpackage.emf;
import defpackage.gdb;
import defpackage.ij9;
import defpackage.j6;
import defpackage.ka2;
import defpackage.n6;
import defpackage.n83;
import defpackage.o6;
import defpackage.oj9;
import defpackage.ox0;
import defpackage.q83;
import defpackage.qyc;
import defpackage.s34;
import defpackage.tog;
import defpackage.u9c;
import defpackage.v9e;
import defpackage.vjg;
import defpackage.vp1;
import defpackage.wqf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class z {
    public static final z F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
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
    public final long A;
    public final long B;
    public final long C;
    public final wqf D;
    public final dqf E;
    public final PlaybackException a;
    public final int b;
    public final v9e c;
    public final gdb.d d;
    public final gdb.d e;
    public final int f;
    public final cdb g;
    public final int h;
    public final boolean i;
    public final emf j;
    public final int k;
    public final tog l;
    public final oj9 m;
    public final float n;
    public final ox0 o;
    public final q83 p;
    public final s34 q;
    public final int r;
    public final boolean s;
    public final boolean t;
    public final int u;
    public final boolean v;
    public final boolean w;
    public final int x;
    public final int y;
    public final oj9 z;

    public static class a {
        public static final a c = new a(false, false);
        public static final String d;
        public static final String e;
        public final boolean a;
        public final boolean b;

        static {
            String str = vjg.a;
            d = Integer.toString(0, 36);
            e = Integer.toString(1, 36);
        }

        public a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Objects.hash(Boolean.valueOf(this.a), Boolean.valueOf(this.b));
        }
    }

    public final class b extends Binder {
        public b() {
        }
    }

    static {
        v9e v9eVar = v9e.l;
        gdb.d dVar = v9e.k;
        cdb cdbVar = cdb.d;
        tog togVar = tog.d;
        emf.a aVar = emf.a;
        oj9 oj9Var = oj9.K;
        F = new z(null, 0, v9eVar, dVar, dVar, 0, cdbVar, 0, false, togVar, aVar, 0, oj9Var, 1.0f, ox0.h, q83.d, s34.e, 0, false, false, 1, 0, 1, false, false, oj9Var, 5000L, 15000L, TimeBasedInteractionIdentifier.DEFAULT_TIME_THRESHOLD_MS, wqf.b, dqf.F);
        String str = vjg.a;
        G = Integer.toString(1, 36);
        H = Integer.toString(2, 36);
        I = Integer.toString(3, 36);
        J = Integer.toString(4, 36);
        K = Integer.toString(5, 36);
        L = Integer.toString(6, 36);
        M = Integer.toString(7, 36);
        N = Integer.toString(8, 36);
        O = Integer.toString(9, 36);
        P = Integer.toString(10, 36);
        Q = Integer.toString(11, 36);
        R = Integer.toString(12, 36);
        S = Integer.toString(13, 36);
        T = Integer.toString(14, 36);
        U = Integer.toString(15, 36);
        V = Integer.toString(16, 36);
        W = Integer.toString(17, 36);
        X = Integer.toString(18, 36);
        Y = Integer.toString(19, 36);
        Z = Integer.toString(20, 36);
        a0 = Integer.toString(21, 36);
        b0 = Integer.toString(22, 36);
        c0 = Integer.toString(23, 36);
        d0 = Integer.toString(24, 36);
        e0 = Integer.toString(25, 36);
        f0 = Integer.toString(26, 36);
        g0 = Integer.toString(27, 36);
        h0 = Integer.toString(28, 36);
        i0 = Integer.toString(29, 36);
        j0 = Integer.toString(30, 36);
        k0 = Integer.toString(31, 36);
        l0 = Integer.toString(32, 36);
    }

    public z(PlaybackException playbackException, int i, v9e v9eVar, gdb.d dVar, gdb.d dVar2, int i2, cdb cdbVar, int i3, boolean z, tog togVar, emf emfVar, int i4, oj9 oj9Var, float f, ox0 ox0Var, q83 q83Var, s34 s34Var, int i5, boolean z2, boolean z3, int i6, int i7, int i8, boolean z4, boolean z5, oj9 oj9Var2, long j, long j2, long j3, wqf wqfVar, dqf dqfVar) {
        this.a = playbackException;
        this.b = i;
        this.c = v9eVar;
        this.d = dVar;
        this.e = dVar2;
        this.f = i2;
        this.g = cdbVar;
        this.h = i3;
        this.i = z;
        this.l = togVar;
        this.j = emfVar;
        this.k = i4;
        this.m = oj9Var;
        this.n = f;
        this.o = ox0Var;
        this.p = q83Var;
        this.q = s34Var;
        this.r = i5;
        this.s = z2;
        this.t = z3;
        this.u = i6;
        this.x = i7;
        this.y = i8;
        this.v = z4;
        this.w = z5;
        this.z = oj9Var2;
        this.A = j;
        this.B = j2;
        this.C = j3;
        this.D = wqfVar;
        this.E = dqfVar;
    }

    public static z r(int i, Bundle bundle) {
        PlaybackException playbackException;
        qyc qycVarA;
        qyc qycVarA2;
        emf cVar;
        emf emfVar;
        int i2;
        tog togVar;
        oj9 oj9Var;
        float f;
        tog togVar2;
        qyc qycVarF;
        q83 q83Var;
        q83 q83Var2;
        s34 s34VarA;
        int i3;
        long j;
        wqf wqfVar;
        IBinder binder = bundle.getBinder(l0);
        if (binder instanceof b) {
            return z.this;
        }
        Bundle bundle2 = bundle.getBundle(X);
        if (bundle2 == null) {
            playbackException = null;
        } else {
            String string = bundle2.getString(PlaybackException.c);
            String string2 = bundle2.getString(PlaybackException.d);
            String string3 = bundle2.getString(PlaybackException.e);
            if (!TextUtils.isEmpty(string2)) {
                try {
                    Class<?> cls = Class.forName(string2, true, PlaybackException.class.getClassLoader());
                    remoteException = Throwable.class.isAssignableFrom(cls) ? (Throwable) cls.getConstructor(String.class).newInstance(string3) : null;
                    if (remoteException == null) {
                        remoteException = new RemoteException(string3);
                    }
                } catch (Throwable unused) {
                    remoteException = new RemoteException(string3);
                }
            }
            Throwable th = remoteException;
            int i4 = bundle2.getInt(PlaybackException.a, 1000);
            Bundle bundle3 = bundle2.getBundle(PlaybackException.f);
            if (bundle3 == null) {
                bundle3 = Bundle.EMPTY;
            }
            playbackException = new PlaybackException(string, th, i4, bundle3, bundle2.getLong(PlaybackException.b, SystemClock.elapsedRealtime()));
        }
        int i5 = bundle.getInt(Z, 0);
        Bundle bundle4 = bundle.getBundle(Y);
        v9e v9eVarB = bundle4 == null ? v9e.l : v9e.b(bundle4);
        Bundle bundle5 = bundle.getBundle(a0);
        gdb.d dVarC = bundle5 == null ? v9e.k : gdb.d.c(bundle5);
        Bundle bundle6 = bundle.getBundle(b0);
        gdb.d dVarC2 = bundle6 == null ? v9e.k : gdb.d.c(bundle6);
        int i6 = bundle.getInt(c0, 0);
        Bundle bundle7 = bundle.getBundle(G);
        cdb cdbVar = bundle7 == null ? cdb.d : new cdb(bundle7.getFloat(cdb.e, 1.0f), bundle7.getFloat(cdb.f, 1.0f));
        int i7 = bundle.getInt(H, 0);
        boolean z = bundle.getBoolean(I, false);
        Bundle bundle8 = bundle.getBundle(J);
        if (bundle8 == null) {
            cVar = emf.a;
        } else {
            defpackage.l lVar = new defpackage.l(13);
            IBinder binder2 = bundle8.getBinder(emf.b);
            if (binder2 == null) {
                e47.b bVar = e47.b;
                qycVarA = qyc.e;
            } else {
                qycVarA = vp1.a(lVar, bq1.a(binder2));
            }
            j6 j6Var = new j6(12);
            IBinder binder3 = bundle8.getBinder(emf.c);
            if (binder3 == null) {
                e47.b bVar2 = e47.b;
                qycVarA2 = qyc.e;
            } else {
                qycVarA2 = vp1.a(j6Var, bq1.a(binder3));
            }
            int[] intArray = bundle8.getIntArray(emf.d);
            if (intArray == null) {
                int i8 = qycVarA.d;
                int[] iArr = new int[i8];
                for (int i9 = 0; i9 < i8; i9++) {
                    iArr[i9] = i9;
                }
                intArray = iArr;
            }
            cVar = new emf.c(qycVarA, qycVarA2, intArray);
        }
        int i10 = bundle.getInt(k0, 0);
        Bundle bundle9 = bundle.getBundle(K);
        if (bundle9 == null) {
            togVar = tog.d;
            emfVar = cVar;
            i2 = i10;
        } else {
            emfVar = cVar;
            i2 = i10;
            togVar = new tog(bundle9.getInt(tog.e, 0), bundle9.getFloat(tog.g, 1.0f), bundle9.getInt(tog.f, 0));
        }
        Bundle bundle10 = bundle.getBundle(L);
        oj9 oj9VarB = bundle10 == null ? oj9.K : oj9.b(bundle10);
        float f2 = bundle.getFloat(M, 1.0f);
        Bundle bundle11 = bundle.getBundle(N);
        ox0 ox0VarA = bundle11 == null ? ox0.h : ox0.a(bundle11);
        Bundle bundle12 = bundle.getBundle(d0);
        if (bundle12 == null) {
            q83Var = q83.d;
            oj9Var = oj9VarB;
            f = f2;
            togVar2 = togVar;
        } else {
            ArrayList parcelableArrayList = bundle12.getParcelableArrayList(q83.e);
            if (parcelableArrayList == null) {
                qycVarF = qyc.e;
                oj9Var = oj9VarB;
                f = f2;
                togVar2 = togVar;
            } else {
                e47.b bVar3 = e47.b;
                oj9Var = oj9VarB;
                e47.a aVar = new e47.a();
                f = f2;
                togVar2 = togVar;
                for (int i11 = 0; i11 < parcelableArrayList.size(); i11++) {
                    Bundle bundle13 = (Bundle) parcelableArrayList.get(i11);
                    bundle13.getClass();
                    aVar.c(n83.b(bundle13));
                }
                qycVarF = aVar.f();
            }
            q83Var = new q83(bundle12.getLong(q83.f), qycVarF);
        }
        Bundle bundle14 = bundle.getBundle(O);
        if (bundle14 == null) {
            s34VarA = s34.e;
            q83Var2 = q83Var;
        } else {
            int i12 = bundle14.getInt(s34.f, 0);
            int i13 = bundle14.getInt(s34.g, 0);
            q83Var2 = q83Var;
            int i14 = bundle14.getInt(s34.h, 0);
            String string4 = bundle14.getString(s34.i);
            s34.a aVar2 = new s34.a(i12);
            aVar2.b = i13;
            aVar2.c = i14;
            ka2.l(i12 != 0 || string4 == null);
            aVar2.d = string4;
            s34VarA = aVar2.a();
        }
        int i15 = bundle.getInt(P, 0);
        boolean z2 = bundle.getBoolean(Q, false);
        boolean z3 = bundle.getBoolean(R, false);
        int i16 = bundle.getInt(S, 1);
        int i17 = bundle.getInt(T, 0);
        int i18 = bundle.getInt(U, 1);
        boolean z4 = bundle.getBoolean(V, false);
        boolean z5 = bundle.getBoolean(W, false);
        Bundle bundle15 = bundle.getBundle(e0);
        oj9 oj9VarB2 = bundle15 == null ? oj9.K : oj9.b(bundle15);
        s34 s34Var = s34VarA;
        long j2 = bundle.getLong(f0, i < 4 ? 0L : 5000L);
        long j3 = bundle.getLong(g0, i < 4 ? 0L : 15000L);
        if (i < 4) {
            i3 = i15;
            j = 0;
        } else {
            i3 = i15;
            j = 3000;
        }
        long j4 = bundle.getLong(h0, j);
        Bundle bundle16 = bundle.getBundle(j0);
        if (bundle16 == null) {
            wqfVar = wqf.b;
        } else {
            ArrayList parcelableArrayList2 = bundle16.getParcelableArrayList(wqf.c);
            wqfVar = new wqf(parcelableArrayList2 == null ? qyc.e : vp1.a(new o6(24), parcelableArrayList2));
        }
        Bundle bundle17 = bundle.getBundle(i0);
        return new z(playbackException, i5, v9eVarB, dVarC, dVarC2, i6, cdbVar, i7, z, togVar2, emfVar, i2, oj9Var, f, ox0VarA, q83Var2, s34Var, i3, z2, z3, i16, i17, i18, z4, z5, oj9VarB2, j2, j3, j4, wqfVar, bundle17 == null ? dqf.F : dqf.b(bundle17));
    }

    public final z a(ox0 ox0Var) {
        emf emfVar = this.j;
        boolean zP = emfVar.p();
        v9e v9eVar = this.c;
        ka2.q(zP || v9eVar.a.b < emfVar.o());
        return new z(this.a, this.b, v9eVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, emfVar, this.k, this.m, this.n, ox0Var, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final z b(wqf wqfVar) {
        emf emfVar = this.j;
        boolean zP = emfVar.p();
        v9e v9eVar = this.c;
        ka2.q(zP || v9eVar.a.b < emfVar.o());
        return new z(this.a, this.b, v9eVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, emfVar, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, wqfVar, this.E);
    }

    public final z c(int i, boolean z) {
        emf emfVar = this.j;
        boolean zP = emfVar.p();
        v9e v9eVar = this.c;
        ka2.q(zP || v9eVar.a.b < emfVar.o());
        return new z(this.a, this.b, v9eVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, emfVar, this.k, this.m, this.n, this.o, this.p, this.q, i, z, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final z d(int i, int i2, boolean z) {
        int i3 = this.y;
        boolean z2 = i3 == 3 && z && i2 == 0;
        emf emfVar = this.j;
        boolean zP = emfVar.p();
        v9e v9eVar = this.c;
        ka2.q(zP || v9eVar.a.b < emfVar.o());
        return new z(this.a, this.b, v9eVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, emfVar, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, z, i, i2, i3, z2, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final z e(cdb cdbVar) {
        emf emfVar = this.j;
        boolean zP = emfVar.p();
        v9e v9eVar = this.c;
        ka2.q(zP || v9eVar.a.b < emfVar.o());
        return new z(this.a, this.b, v9eVar, this.d, this.e, this.f, cdbVar, this.h, this.i, this.l, emfVar, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final z f(int i, PlaybackException playbackException) {
        boolean z = this.t;
        int i2 = this.x;
        boolean z2 = i == 3 && z && i2 == 0;
        emf emfVar = this.j;
        boolean zP = emfVar.p();
        v9e v9eVar = this.c;
        ka2.q(zP || v9eVar.a.b < emfVar.o());
        return new z(playbackException, this.b, v9eVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, emfVar, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, z, this.u, i2, i, z2, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final z g(oj9 oj9Var) {
        emf emfVar = this.j;
        boolean zP = emfVar.p();
        v9e v9eVar = this.c;
        ka2.q(zP || v9eVar.a.b < emfVar.o());
        return new z(this.a, this.b, v9eVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, emfVar, this.k, oj9Var, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final z h(int i, gdb.d dVar, gdb.d dVar2) {
        emf emfVar = this.j;
        boolean zP = emfVar.p();
        v9e v9eVar = this.c;
        ka2.q(zP || v9eVar.a.b < emfVar.o());
        return new z(this.a, this.b, v9eVar, dVar, dVar2, i, this.g, this.h, this.i, this.l, emfVar, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final z i(int i) {
        emf emfVar = this.j;
        boolean zP = emfVar.p();
        v9e v9eVar = this.c;
        ka2.q(zP || v9eVar.a.b < emfVar.o());
        return new z(this.a, this.b, v9eVar, this.d, this.e, this.f, this.g, i, this.i, this.l, emfVar, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final z j(v9e v9eVar) {
        emf emfVar = this.j;
        ka2.q(emfVar.p() || v9eVar.a.b < emfVar.o());
        return new z(this.a, this.b, v9eVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, emfVar, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final z k(boolean z) {
        emf emfVar = this.j;
        boolean zP = emfVar.p();
        v9e v9eVar = this.c;
        ka2.q(zP || v9eVar.a.b < emfVar.o());
        return new z(this.a, this.b, v9eVar, this.d, this.e, this.f, this.g, this.h, z, this.l, emfVar, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final z l(emf emfVar) {
        boolean zP = emfVar.p();
        v9e v9eVar = this.c;
        ka2.q(zP || v9eVar.a.b < emfVar.o());
        return new z(this.a, this.b, v9eVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, emfVar, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final z m(u9c u9cVar, int i) {
        v9e v9eVar = this.c;
        gdb.d dVar = v9eVar.a;
        v9e v9eVar2 = new v9e(new gdb.d(dVar.a, i, dVar.c, dVar.d, dVar.e, dVar.f, dVar.g, dVar.h, dVar.i), v9eVar.b, v9eVar.c, v9eVar.d, v9eVar.e, v9eVar.f, v9eVar.g, v9eVar.h, v9eVar.i, v9eVar.j);
        ka2.q(u9cVar.p() || v9eVar2.a.b < u9cVar.o());
        return new z(this.a, this.b, v9eVar2, this.d, this.e, this.f, this.g, this.h, this.i, this.l, u9cVar, 0, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final z n(emf emfVar, v9e v9eVar, int i) {
        ka2.q(emfVar.p() || v9eVar.a.b < emfVar.o());
        return new z(this.a, this.b, v9eVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, emfVar, i, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final z o(dqf dqfVar) {
        emf emfVar = this.j;
        boolean zP = emfVar.p();
        v9e v9eVar = this.c;
        ka2.q(zP || v9eVar.a.b < emfVar.o());
        return new z(this.a, this.b, v9eVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, emfVar, this.k, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, dqfVar);
    }

    public final z p(float f) {
        emf emfVar = this.j;
        boolean zP = emfVar.p();
        v9e v9eVar = this.c;
        ka2.q(zP || v9eVar.a.b < emfVar.o());
        return new z(this.a, this.b, v9eVar, this.d, this.e, this.f, this.g, this.h, this.i, this.l, emfVar, this.k, this.m, f, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.x, this.y, this.v, this.w, this.z, this.A, this.B, this.C, this.D, this.E);
    }

    public final z q(gdb.a aVar, boolean z, boolean z2) {
        int i;
        boolean z3;
        int i2;
        boolean zA = aVar.a(16);
        boolean zA2 = aVar.a(17);
        v9e v9eVar = this.c;
        v9e v9eVarA = v9eVar.a(zA, zA2);
        gdb.d dVarB = this.d.b(zA, zA2);
        gdb.d dVarB2 = this.e.b(zA, zA2);
        boolean z4 = true;
        emf cVar = this.j;
        if (!zA2 && zA && !cVar.p()) {
            int i3 = v9eVar.a.b;
            if (cVar.o() != 1) {
                emf.d dVarM = cVar.m(i3, new emf.d(), 0L);
                e47.a aVar2 = new e47.a();
                int i4 = dVarM.m;
                while (true) {
                    i2 = dVarM.n;
                    if (i4 > i2) {
                        break;
                    }
                    emf.b bVarF = cVar.f(i4, new emf.b(), true);
                    bVarF.c = 0;
                    aVar2.c(bVarF);
                    i4++;
                }
                dVarM.n = i2 - dVarM.m;
                dVarM.m = 0;
                cVar = new emf.c(e47.n(dVarM), aVar2.f(), new int[]{0});
            }
        } else if (z || !zA2) {
            cVar = emf.a;
        }
        emf emfVar = cVar;
        oj9 oj9Var = !aVar.a(18) ? oj9.K : this.m;
        float f = !aVar.a(22) ? 1.0f : this.n;
        ox0 ox0Var = !aVar.a(21) ? ox0.h : this.o;
        q83 q83Var = !aVar.a(28) ? q83.d : this.p;
        if (aVar.a(23)) {
            i = this.r;
            z3 = this.s;
        } else {
            i = 0;
            z3 = false;
        }
        oj9 oj9Var2 = !aVar.a(18) ? oj9.K : this.z;
        wqf wqfVar = (z2 || !aVar.a(30)) ? wqf.b : this.D;
        if (!emfVar.p() && v9eVarA.a.b >= emfVar.o()) {
            z4 = false;
        }
        ka2.q(z4);
        return new z(this.a, this.b, v9eVarA, dVarB, dVarB2, this.f, this.g, this.h, this.i, this.l, emfVar, this.k, oj9Var, f, ox0Var, q83Var, this.q, i, z3, this.t, this.u, this.x, this.y, this.v, this.w, oj9Var2, this.A, this.B, this.C, wqfVar, this.E);
    }

    public final ij9 s() {
        emf emfVar = this.j;
        if (emfVar.p()) {
            return null;
        }
        return emfVar.m(this.c.a.b, new emf.d(), 0L).b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v26 */
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
    public final Bundle t(int i) {
        long j;
        boolean z;
        int i2;
        emf.b bVar;
        int i3;
        int i4;
        Bundle bundleB;
        long j2;
        Bundle bundle = new Bundle();
        PlaybackException playbackException = this.a;
        if (playbackException != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt(PlaybackException.a, playbackException.errorCode);
            bundle2.putLong(PlaybackException.b, playbackException.timestampMs);
            bundle2.putString(PlaybackException.c, playbackException.getMessage());
            bundle2.putBundle(PlaybackException.f, playbackException.extras);
            Throwable cause = playbackException.getCause();
            if (cause != null) {
                bundle2.putString(PlaybackException.d, cause.getClass().getName());
                bundle2.putString(PlaybackException.e, cause.getMessage());
            }
            bundle.putBundle(X, bundle2);
        }
        int i5 = this.b;
        if (i5 != 0) {
            bundle.putInt(Z, i5);
        }
        v9e v9eVar = this.c;
        if (i < 3 || !v9eVar.equals(v9e.l)) {
            bundle.putBundle(Y, v9eVar.c(i));
        }
        gdb.d dVar = this.d;
        if (i < 3 || !v9e.k.a(dVar)) {
            bundle.putBundle(a0, dVar.d(i));
        }
        gdb.d dVar2 = this.e;
        if (i < 3 || !v9e.k.a(dVar2)) {
            bundle.putBundle(b0, dVar2.d(i));
        }
        int i6 = this.f;
        if (i6 != 0) {
            bundle.putInt(c0, i6);
        }
        cdb cdbVar = cdb.d;
        cdb cdbVar2 = this.g;
        if (!cdbVar2.equals(cdbVar)) {
            Bundle bundle3 = new Bundle();
            bundle3.putFloat(cdb.e, cdbVar2.a);
            bundle3.putFloat(cdb.f, cdbVar2.b);
            bundle.putBundle(G, bundle3);
        }
        int i7 = this.h;
        if (i7 != 0) {
            bundle.putInt(H, i7);
        }
        boolean z2 = this.i;
        if (z2) {
            bundle.putBoolean(I, z2);
        }
        emf.a aVar = emf.a;
        emf emfVar = this.j;
        boolean z3 = false;
        long j3 = 0;
        if (emfVar.equals(aVar)) {
            j = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            int iO = emfVar.o();
            emf.d dVar3 = new emf.d();
            int i8 = 0;
            while (i8 < iO) {
                emf.d dVarM = emfVar.m(i8, dVar3, j3);
                dVarM.getClass();
                Bundle bundle4 = new Bundle();
                long j4 = j3;
                if (!ij9.g.equals(dVarM.b)) {
                    bundle4.putBundle(emf.d.s, dVarM.b.b(false));
                }
                long j5 = dVarM.d;
                if (j5 != -9223372036854775807L) {
                    j2 = -9223372036854775807L;
                    bundle4.putLong(emf.d.t, j5);
                } else {
                    j2 = -9223372036854775807L;
                }
                long j6 = dVarM.e;
                if (j6 != j2) {
                    bundle4.putLong(emf.d.u, j6);
                }
                long j7 = dVarM.f;
                if (j7 != j2) {
                    bundle4.putLong(emf.d.v, j7);
                }
                boolean z4 = dVarM.g;
                if (z4) {
                    bundle4.putBoolean(emf.d.w, z4);
                }
                boolean z5 = dVarM.h;
                if (z5) {
                    bundle4.putBoolean(emf.d.x, z5);
                }
                ij9.e eVar = dVarM.i;
                if (eVar != null) {
                    bundle4.putBundle(emf.d.y, eVar.c());
                }
                boolean z6 = dVarM.j;
                if (z6) {
                    bundle4.putBoolean(emf.d.z, z6);
                }
                long j8 = dVarM.k;
                if (j8 != j4) {
                    bundle4.putLong(emf.d.A, j8);
                }
                long j9 = dVarM.l;
                if (j9 != j2) {
                    bundle4.putLong(emf.d.B, j9);
                }
                int i9 = dVarM.m;
                if (i9 != 0) {
                    bundle4.putInt(emf.d.C, i9);
                }
                int i10 = dVarM.n;
                if (i10 != 0) {
                    bundle4.putInt(emf.d.D, i10);
                }
                long j10 = dVarM.o;
                if (j10 != j4) {
                    bundle4.putLong(emf.d.E, j10);
                }
                arrayList.add(bundle4);
                i8++;
                j3 = j4;
            }
            j = j3;
            ArrayList arrayList2 = new ArrayList();
            int iH = emfVar.h();
            emf.b bVar2 = new emf.b();
            int i11 = 0;
            while (i11 < iH) {
                emf.b bVarF = emfVar.f(i11, bVar2, z3);
                bVarF.getClass();
                Bundle bundle5 = new Bundle();
                int i12 = bVarF.c;
                if (i12 != 0) {
                    bundle5.putInt(emf.b.h, i12);
                }
                long j11 = bVarF.d;
                if (j11 != -9223372036854775807L) {
                    z = z3;
                    bundle5.putLong(emf.b.i, j11);
                } else {
                    z = z3;
                }
                long j12 = bVarF.e;
                if (j12 != j) {
                    bundle5.putLong(emf.b.j, j12);
                }
                boolean z7 = bVarF.f;
                if (z7) {
                    bundle5.putBoolean(emf.b.k, z7);
                }
                if (bVarF.g.equals(ba.f)) {
                    i2 = iH;
                    bVar = bVar2;
                    i3 = i11;
                } else {
                    String str = emf.b.l;
                    ba baVar = bVarF.g;
                    baVar.getClass();
                    Bundle bundle6 = new Bundle();
                    ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                    ba.a[] aVarArr = baVar.e;
                    i2 = iH;
                    int length = aVarArr.length;
                    ?? r6 = z;
                    while (r6 < length) {
                        ?? r23 = r6;
                        ba.a aVar2 = aVarArr[r23 == true ? 1 : 0];
                        aVar2.getClass();
                        int i13 = length;
                        Bundle bundle7 = new Bundle();
                        emf.b bVar3 = bVar2;
                        bundle7.putLong(ba.a.l, aVar2.a);
                        bundle7.putInt(ba.a.m, aVar2.b);
                        bundle7.putInt(ba.a.s, aVar2.c);
                        bundle7.putParcelableArrayList(ba.a.n, new ArrayList<>(Arrays.asList(aVar2.d)));
                        String str2 = ba.a.t;
                        ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
                        ij9[] ij9VarArr = aVar2.e;
                        int i14 = i11;
                        int length2 = ij9VarArr.length;
                        ?? r10 = z;
                        while (r10 < length2) {
                            ?? r28 = r10;
                            ij9 ij9Var = ij9VarArr[r28 == true ? 1 : 0];
                            if (ij9Var == null) {
                                bundleB = null;
                                i4 = length2;
                            } else {
                                i4 = length2;
                                bundleB = ij9Var.b(true);
                            }
                            arrayList4.add(bundleB);
                            length2 = i4;
                            r10 = (r28 == true ? 1 : 0) + 1;
                        }
                        bundle7.putParcelableArrayList(str2, arrayList4);
                        bundle7.putIntArray(ba.a.o, aVar2.f);
                        bundle7.putLongArray(ba.a.p, aVar2.g);
                        bundle7.putLong(ba.a.q, aVar2.i);
                        bundle7.putBoolean(ba.a.r, aVar2.j);
                        bundle7.putStringArrayList(ba.a.u, new ArrayList<>(Arrays.asList(aVar2.h)));
                        bundle7.putBoolean(ba.a.v, aVar2.k);
                        arrayList3.add(bundle7);
                        length = i13;
                        bVar2 = bVar3;
                        i11 = i14;
                        r6 = (r23 == true ? 1 : 0) + 1;
                    }
                    bVar = bVar2;
                    i3 = i11;
                    if (!arrayList3.isEmpty()) {
                        bundle6.putParcelableArrayList(ba.h, arrayList3);
                    }
                    long j13 = baVar.b;
                    if (j13 != j) {
                        bundle6.putLong(ba.i, j13);
                    }
                    long j14 = baVar.c;
                    if (j14 != -9223372036854775807L) {
                        bundle6.putLong(ba.j, j14);
                    }
                    int i15 = baVar.d;
                    if (i15 != 0) {
                        bundle6.putInt(ba.k, i15);
                    }
                    bundle5.putBundle(str, bundle6);
                }
                arrayList2.add(bundle5);
                i11 = i3 + 1;
                z3 = z;
                iH = i2;
                bVar2 = bVar;
            }
            boolean z8 = z3;
            int[] iArr = new int[iO];
            boolean z9 = true;
            if (iO > 0) {
                iArr[z8 ? 1 : 0] = emfVar.a(true);
            }
            int i16 = 1;
            while (i16 < iO) {
                iArr[i16] = emfVar.e(iArr[i16 - 1], z8 ? 1 : 0, z9);
                i16++;
                z9 = true;
                z8 = false;
            }
            Bundle bundle8 = new Bundle();
            bundle8.putBinder(emf.b, new bq1(arrayList));
            bundle8.putBinder(emf.c, new bq1(arrayList2));
            bundle8.putIntArray(emf.d, iArr);
            bundle.putBundle(J, bundle8);
        }
        int i17 = this.k;
        if (i17 != 0) {
            bundle.putInt(k0, i17);
        }
        tog togVar = tog.d;
        tog togVar2 = this.l;
        if (!togVar2.equals(togVar)) {
            Bundle bundle9 = new Bundle();
            int i18 = togVar2.a;
            if (i18 != 0) {
                bundle9.putInt(tog.e, i18);
            }
            int i19 = togVar2.b;
            if (i19 != 0) {
                bundle9.putInt(tog.f, i19);
            }
            float f = togVar2.c;
            if (f != 1.0f) {
                bundle9.putFloat(tog.g, f);
            }
            bundle.putBundle(K, bundle9);
        }
        oj9 oj9Var = oj9.K;
        oj9 oj9Var2 = this.m;
        if (!oj9Var2.equals(oj9Var)) {
            bundle.putBundle(L, oj9Var2.c());
        }
        float f2 = this.n;
        if (f2 != 1.0f) {
            bundle.putFloat(M, f2);
        }
        ox0 ox0Var = ox0.h;
        ox0 ox0Var2 = this.o;
        if (!ox0Var2.equals(ox0Var)) {
            bundle.putBundle(N, ox0Var2.c());
        }
        q83 q83Var = q83.d;
        q83 q83Var2 = this.p;
        if (!q83Var2.equals(q83Var)) {
            Bundle bundle10 = new Bundle();
            String str3 = q83.e;
            qyc qycVar = q83Var2.a;
            e47.b bVar4 = e47.b;
            e47.a aVar3 = new e47.a();
            for (int i20 = 0; i20 < qycVar.d; i20++) {
                if (((n83) qycVar.get(i20)).d == null) {
                    aVar3.c((n83) qycVar.get(i20));
                }
            }
            qyc qycVarF = aVar3.f();
            ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>(qycVarF.d);
            e47.b bVarListIterator = qycVarF.listIterator(0);
            while (bVarListIterator.hasNext()) {
                n83 n83Var = (n83) bVarListIterator.next();
                Bundle bundleC = n83Var.c();
                Bitmap bitmap = n83Var.d;
                if (bitmap != null) {
                    bundleC.putParcelable(n83.w, bitmap);
                }
                arrayList5.add(bundleC);
            }
            bundle10.putParcelableArrayList(str3, arrayList5);
            bundle10.putLong(q83.f, q83Var2.b);
            bundle.putBundle(d0, bundle10);
        }
        s34 s34Var = s34.e;
        s34 s34Var2 = this.q;
        if (!s34Var2.equals(s34Var)) {
            Bundle bundle11 = new Bundle();
            int i21 = s34Var2.a;
            if (i21 != 0) {
                bundle11.putInt(s34.f, i21);
            }
            int i22 = s34Var2.b;
            if (i22 != 0) {
                bundle11.putInt(s34.g, i22);
            }
            int i23 = s34Var2.c;
            if (i23 != 0) {
                bundle11.putInt(s34.h, i23);
            }
            String str4 = s34Var2.d;
            if (str4 != null) {
                bundle11.putString(s34.i, str4);
            }
            bundle.putBundle(O, bundle11);
        }
        int i24 = this.r;
        if (i24 != 0) {
            bundle.putInt(P, i24);
        }
        boolean z10 = this.s;
        if (z10) {
            bundle.putBoolean(Q, z10);
        }
        boolean z11 = this.t;
        if (z11) {
            bundle.putBoolean(R, z11);
        }
        int i25 = this.u;
        if (i25 != 1) {
            bundle.putInt(S, i25);
        }
        int i26 = this.x;
        if (i26 != 0) {
            bundle.putInt(T, i26);
        }
        int i27 = this.y;
        if (i27 != 1) {
            bundle.putInt(U, i27);
        }
        boolean z12 = this.v;
        if (z12) {
            bundle.putBoolean(V, z12);
        }
        boolean z13 = this.w;
        if (z13) {
            bundle.putBoolean(W, z13);
        }
        oj9 oj9Var3 = oj9.K;
        oj9 oj9Var4 = this.z;
        if (!oj9Var4.equals(oj9Var3)) {
            bundle.putBundle(e0, oj9Var4.c());
        }
        long j15 = i < 6 ? j : 5000L;
        long j16 = this.A;
        if (j16 != j15) {
            bundle.putLong(f0, j16);
        }
        long j17 = i < 6 ? j : 15000L;
        long j18 = this.B;
        if (j18 != j17) {
            bundle.putLong(g0, j18);
        }
        long j19 = i < 6 ? j : TimeBasedInteractionIdentifier.DEFAULT_TIME_THRESHOLD_MS;
        long j20 = this.C;
        if (j20 != j19) {
            bundle.putLong(h0, j20);
        }
        wqf wqfVar = wqf.b;
        wqf wqfVar2 = this.D;
        if (!wqfVar2.equals(wqfVar)) {
            Bundle bundle12 = new Bundle();
            bundle12.putParcelableArrayList(wqf.c, vp1.b(wqfVar2.a, new n6(12)));
            bundle.putBundle(j0, bundle12);
        }
        dqf dqfVar = dqf.F;
        dqf dqfVar2 = this.E;
        if (!dqfVar2.equals(dqfVar)) {
            bundle.putBundle(i0, dqfVar2.c());
        }
        return bundle;
    }
}
