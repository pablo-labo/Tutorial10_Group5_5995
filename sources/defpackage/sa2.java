package defpackage;

import app.rive.runtime.kotlin.renderers.RendererMetrics;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class sa2 {
    public static final jte a = new jte(a.a);
    public static final jte b = new jte(b.a);

    public static final class a extends mj8 implements gu5<qa2> {
        public static final a a = new a(0);

        @Override // defpackage.gu5
        public final qa2 invoke() {
            jte jteVar = sa2.a;
            long j = ja2.t;
            return new qa2(j, ja2.j, ja2.u, ja2.k, ja2.e, ja2.w, ja2.l, ja2.x, ja2.m, ja2.H, ja2.p, ja2.I, ja2.q, ja2.a, ja2.g, ja2.y, ja2.n, ja2.G, ja2.o, j, ja2.f, ja2.d, ja2.b, ja2.h, ja2.c, ja2.i, ja2.r, ja2.s, ja2.v, ja2.z, ja2.F, ja2.A, ja2.B, ja2.C, ja2.D, ja2.E);
        }
    }

    public static final class b extends mj8 implements gu5<Boolean> {
        public static final b a = new b(0);

        @Override // defpackage.gu5
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    public static final long a(qa2 qa2Var, long j) {
        long j2 = qa2Var.a;
        long j3 = qa2Var.q;
        if (da2.c(j, j2)) {
            return qa2Var.b;
        }
        if (da2.c(j, qa2Var.f)) {
            return qa2Var.g;
        }
        if (da2.c(j, qa2Var.j)) {
            return qa2Var.k;
        }
        if (da2.c(j, qa2Var.n)) {
            return qa2Var.o;
        }
        if (da2.c(j, qa2Var.w)) {
            return qa2Var.x;
        }
        if (da2.c(j, qa2Var.c)) {
            return qa2Var.d;
        }
        if (da2.c(j, qa2Var.h)) {
            return qa2Var.i;
        }
        if (da2.c(j, qa2Var.l)) {
            return qa2Var.m;
        }
        if (da2.c(j, qa2Var.y)) {
            return qa2Var.z;
        }
        if (da2.c(j, qa2Var.u)) {
            return qa2Var.v;
        }
        if (da2.c(j, qa2Var.p)) {
            return j3;
        }
        if (da2.c(j, qa2Var.r)) {
            return qa2Var.s;
        }
        if (da2.c(j, qa2Var.D) || da2.c(j, qa2Var.F) || da2.c(j, qa2Var.G) || da2.c(j, qa2Var.H) || da2.c(j, qa2Var.I) || da2.c(j, qa2Var.J)) {
            return j3;
        }
        int i = da2.j;
        return da2.i;
    }

    public static final long b(long j, androidx.compose.runtime.b bVar) {
        bVar.L(-1680936624);
        long jA = a((qa2) bVar.M(a), j);
        if (jA == 16) {
            jA = ((da2) bVar.M(qs2.a)).a;
        }
        bVar.F();
        return jA;
    }

    public static final long c(qa2 qa2Var, ra2 ra2Var) {
        switch (ra2Var.ordinal()) {
            case 0:
                return qa2Var.n;
            case 1:
                return qa2Var.w;
            case 2:
                return qa2Var.y;
            case 3:
                return qa2Var.v;
            case 4:
                return qa2Var.e;
            case 5:
                return qa2Var.u;
            case 6:
                return qa2Var.o;
            case 7:
                return qa2Var.x;
            case 8:
                return qa2Var.z;
            case DatadogLogGenerator.CRASH /* 9 */:
                return qa2Var.b;
            case 10:
                return qa2Var.d;
            case 11:
            case 12:
            case 15:
            case 16:
            case 21:
            case 22:
            case 27:
            case 28:
            case 32:
            case 33:
            default:
                int i = da2.j;
                return da2.i;
            case 13:
                return qa2Var.g;
            case ModuleDescriptor.MODULE_VERSION /* 14 */:
                return qa2Var.i;
            case 17:
                return qa2Var.q;
            case 18:
                return qa2Var.s;
            case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                return qa2Var.k;
            case 20:
                return qa2Var.m;
            case 23:
                return qa2Var.A;
            case 24:
                return qa2Var.B;
            case 25:
                return qa2Var.a;
            case 26:
                return qa2Var.c;
            case 29:
                return qa2Var.C;
            case RendererMetrics.SAMPLES /* 30 */:
                return qa2Var.f;
            case 31:
                return qa2Var.h;
            case 34:
                return qa2Var.p;
            case 35:
                return qa2Var.D;
            case 36:
                return qa2Var.F;
            case 37:
                return qa2Var.G;
            case 38:
                return qa2Var.H;
            case 39:
                return qa2Var.I;
            case 40:
                return qa2Var.J;
            case 41:
                return qa2Var.E;
            case 42:
                return qa2Var.t;
            case 43:
                return qa2Var.r;
            case 44:
                return qa2Var.j;
            case 45:
                return qa2Var.l;
        }
    }

    public static final long d(ra2 ra2Var, androidx.compose.runtime.b bVar) {
        return c((qa2) bVar.M(a), ra2Var);
    }
}
