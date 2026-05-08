package defpackage;

import defpackage.iwg;
import defpackage.k15;
import defpackage.lb3;
import defpackage.nxe;
import defpackage.ph0;
import defpackage.tl6;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes.dex */
public final class lh0 implements Closeable {
    public final boolean V;
    public final k15 W;
    public final List<nl6> X;
    public final iga Y;
    public final a a;
    public final jn2 b;
    public final cha c;
    public final cha d;
    public final lb3 e;
    public final ArrayList f;

    public static final class a implements w2a<a> {
        public final lb3.a a = new lb3.a();
        public final ArrayList b = new ArrayList();
        public final ArrayList c = new ArrayList();
        public final ArrayList d = new ArrayList();
        public final ArrayList e = new ArrayList();
        public final ArrayList f;
        public final ArrayList g;
        public final ArrayList h;
        public final ArrayList i;
        public k15 j;
        public List<nl6> k;
        public String l;
        public qk6 m;
        public fwg n;
        public boolean o;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f = arrayList;
            this.g = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.h = arrayList2;
            this.i = arrayList2;
            this.j = wr4.a;
            this.o = true;
        }

        public static void c(a aVar, uh0 uh0Var) {
            ArrayList arrayList;
            int iOrdinal = ph0.a.a.ordinal();
            if (iOrdinal == 0) {
                arrayList = aVar.b;
            } else if (iOrdinal == 1) {
                arrayList = aVar.c;
            } else if (iOrdinal == 2) {
                arrayList = aVar.d;
            } else {
                if (iOrdinal != 3) {
                    l.g();
                    return;
                }
                arrayList = aVar.e;
            }
            arrayList.add(uh0Var);
        }

        @Override // defpackage.w2a
        public final Object a(k15.a aVar) {
            this.j = this.j.d(aVar);
            return this;
        }

        public final void b(String str, String str2) {
            Collection collection = this.k;
            if (collection == null) {
                collection = zr4.a;
            }
            this.k = z92.g1(new nl6(str, str2), collection);
        }

        public final ArrayList d() {
            return z92.h1(z92.h1(z92.h1(this.b, this.c), this.d), this.e);
        }
    }

    public lh0(a aVar) {
        cha iwgVar;
        this.a = aVar;
        aVar.d();
        ArrayList arrayList = aVar.g;
        this.e = aVar.a.a();
        this.f = aVar.i;
        this.V = aVar.o;
        this.W = aVar.j;
        this.X = aVar.k;
        if (aVar.l == null) {
            r6.g("Apollo: 'serverUrl' is required");
            throw null;
        }
        tl6.a aVar2 = new tl6.a();
        String str = aVar.l;
        str.getClass();
        aVar2.a = str;
        qk6 qk6Var = aVar.m;
        if (qk6Var != null) {
            aVar2.b = qk6Var;
        }
        arrayList.getClass();
        ArrayList arrayList2 = aVar2.c;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        String str2 = aVar2.a;
        go3 go3Var = str2 != null ? new go3(str2) : null;
        if (go3Var == null) {
            r6.g("No HttpRequestComposer found. Use 'httpRequestComposer' or 'serverUrl'");
            throw null;
        }
        ArrayList arrayList3 = aVar2.d;
        if (!arrayList3.isEmpty()) {
            arrayList2.add(new tl6.c(arrayList3));
        }
        qk6 dd8Var = aVar2.b;
        if (dd8Var == null) {
            OkHttpClient.Builder builder = (OkHttpClient.Builder) hpa.a.getValue();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            builder.c(60000L, timeUnit);
            builder.z = Util.b(60000L, timeUnit);
            dd8Var = new dd8(new OkHttpClient(builder));
        }
        tl6 tl6Var = new tl6(go3Var, dd8Var, arrayList2, false);
        this.c = tl6Var;
        String str3 = aVar.l;
        if (str3 == null) {
            iwgVar = tl6Var;
        } else {
            iwg.a aVar3 = new iwg.a();
            hwg hwgVar = new hwg(str3, null);
            fwg fwgVar = aVar.n;
            if (fwgVar != null) {
                aVar3.b = fwgVar;
            }
            fwg vr3Var = aVar3.b;
            if (vr3Var == null) {
                OkHttpClient.Builder builder2 = (OkHttpClient.Builder) hpa.a.getValue();
                builder2.getClass();
                vr3Var = new vr3(new OkHttpClient(builder2));
            }
            iwgVar = new iwg(hwgVar, aVar3.a, vr3Var, 60000L, new nxe.a(0));
        }
        this.d = iwgVar;
        eq3 eq3Var = a74.a;
        no3 no3Var = no3.c;
        this.b = new jn2(no3Var, f13.a(no3Var));
        this.Y = new iga(tl6Var, iwgVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        f13.c(this.b.b, null);
        this.c.dispose();
        this.d.dispose();
    }
}
