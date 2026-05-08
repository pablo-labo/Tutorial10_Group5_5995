package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.Arrays;
import okhttp3.Headers;

/* JADX INFO: loaded from: classes.dex */
public final class qva {
    public final Context a;
    public final Bitmap.Config b;
    public final hie c;
    public final tmd d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final Headers h;
    public final d8f i;
    public final u3b j;
    public final vt1 k;
    public final vt1 l;
    public final vt1 m;

    public qva(Context context, Bitmap.Config config, hie hieVar, tmd tmdVar, boolean z, boolean z2, boolean z3, Headers headers, d8f d8fVar, u3b u3bVar, vt1 vt1Var, vt1 vt1Var2, vt1 vt1Var3) {
        this.a = context;
        this.b = config;
        this.c = hieVar;
        this.d = tmdVar;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = headers;
        this.i = d8fVar;
        this.j = u3bVar;
        this.k = vt1Var;
        this.l = vt1Var2;
        this.m = vt1Var3;
    }

    public static qva a(qva qvaVar) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Context context = qvaVar.a;
        qvaVar.getClass();
        hie hieVar = qvaVar.c;
        tmd tmdVar = qvaVar.d;
        boolean z = qvaVar.e;
        boolean z2 = qvaVar.f;
        boolean z3 = qvaVar.g;
        qvaVar.getClass();
        Headers headers = qvaVar.h;
        d8f d8fVar = qvaVar.i;
        u3b u3bVar = qvaVar.j;
        vt1 vt1Var = qvaVar.k;
        vt1 vt1Var2 = qvaVar.l;
        vt1 vt1Var3 = qvaVar.m;
        qvaVar.getClass();
        return new qva(context, config, hieVar, tmdVar, z, z2, z3, headers, d8fVar, u3bVar, vt1Var, vt1Var2, vt1Var3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qva)) {
            return false;
        }
        qva qvaVar = (qva) obj;
        return wl7.b(this.a, qvaVar.a) && this.b == qvaVar.b && wl7.b(this.c, qvaVar.c) && this.d == qvaVar.d && this.e == qvaVar.e && this.f == qvaVar.f && this.g == qvaVar.g && wl7.b(this.h, qvaVar.h) && wl7.b(this.i, qvaVar.i) && wl7.b(this.j, qvaVar.j) && this.k == qvaVar.k && this.l == qvaVar.l && this.m == qvaVar.m;
    }

    public final int hashCode() {
        return this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + k20.b(this.j.a, k20.b(this.i.a, (ia.f(ia.f(ia.f((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 961)) * 31)) * 31, 31, this.e), 31, this.f), 961, this.g) + Arrays.hashCode(this.h.a)) * 31, 31), 31)) * 31)) * 31);
    }
}
