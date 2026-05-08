package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import defpackage.a64;
import defpackage.ize;
import defpackage.p27;
import defpackage.ufb;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class n27 implements o27 {
    public final sl3 a;
    public final yg1 b;
    public final w9a c;
    public final am3 d;
    public final Context e;
    public final f94 f;
    public final h64 g;
    public final dn3 h;
    public final gn3 i;
    public final jia j;
    public final ize.a k;
    public final a64 l;
    public final lia m;
    public final ka6 n;
    public final vfb o;
    public final gge p;
    public final Set<g4d> q;
    public final is4 r;
    public final is4 s;
    public final boolean t;
    public final a64 u;
    public final p27 v;
    public final boolean w;
    public final q92 x;
    public final r13 y;

    public static final class a {
        public final Context a;
        public lpa c;
        public HashSet d;
        public final p27.a g;
        public final boolean h;
        public final q92 i;
        public f94 b = f94.b;
        public final boolean e = true;
        public final int f = -1;

        public a(Context context) {
            p27.a aVar = new p27.a();
            aVar.a = new hze();
            aVar.b = new ojh(22);
            this.g = aVar;
            this.h = true;
            this.i = new q92(24);
            this.a = context;
        }
    }

    public n27(a aVar) {
        am3 am3Var;
        jia jiaVar;
        it5.a();
        p27.a aVar2 = aVar.g;
        aVar2.getClass();
        this.v = new p27(aVar2);
        Object systemService = aVar.a.getSystemService("activity");
        if (systemService == null) {
            r6.g("Required value was null.");
            throw null;
        }
        this.a = new sl3((ActivityManager) systemService);
        this.b = new yg1();
        this.c = new w9a();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        synchronized (am3.class) {
            try {
                if (am3.a == null) {
                    am3.a = new am3();
                }
                am3Var = am3.a;
            } finally {
            }
        }
        am3Var.getClass();
        this.d = am3Var;
        Context context = aVar.a;
        if (context == null) {
            r6.g("Required value was null.");
            throw null;
        }
        this.e = context;
        this.f = aVar.b;
        this.h = new dn3();
        synchronized (jia.class) {
            try {
                if (jia.a == null) {
                    jia.a = new jia();
                }
                jiaVar = jia.a;
            } finally {
            }
        }
        jiaVar.getClass();
        this.j = jiaVar;
        this.k = ize.a;
        Context context2 = aVar.a;
        it5.a();
        a64 a64Var = new a64(new a64.b(context2));
        this.l = a64Var;
        lia liaVarA = lia.a();
        liaVarA.getClass();
        this.m = liaVarA;
        int i = aVar.f;
        i = i < 0 ? 30000 : i;
        it5.a();
        ka6 ka6Var = aVar.c;
        this.n = ka6Var == null ? new km6(i) : ka6Var;
        ufb ufbVar = new ufb(new ufb.a());
        this.o = new vfb(ufbVar);
        this.p = new gge();
        Set<g4d> set = aVar.d;
        this.q = set == null ? is4.a : set;
        is4 is4Var = is4.a;
        this.r = is4Var;
        this.s = is4Var;
        this.t = aVar.e;
        this.u = a64Var;
        this.i = new gn3(ufbVar.c.d);
        this.w = aVar.h;
        this.x = aVar.i;
        this.y = new r13();
        this.g = new h64(new q64(), this);
        it5.a();
    }

    @Override // defpackage.o27
    public final gge a() {
        return this.p;
    }

    @Override // defpackage.o27
    public final p27 b() {
        return this.v;
    }
}
