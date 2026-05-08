package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import com.facebook.imagepipeline.producers.b;
import com.facebook.imagepipeline.request.a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class vpb {
    public final ContentResolver a;
    public final spb b;
    public final ka6 c;
    public final boolean d;
    public final z1b e;
    public final f94 f;
    public final boolean g;
    public final m37 h;
    public final Set<jb3> i;
    public final LinkedHashMap j;
    public final d2f k;
    public final d2f l;
    public final d2f m;
    public final d2f n;
    public final d2f o;
    public final d2f p;
    public final d2f q;
    public final d2f r;
    public final d2f s;
    public final d2f t;
    public final d2f u;
    public final d2f v;
    public final d2f w;
    public final d2f x;
    public final d2f y;

    public static final class a {
        public static final String a(Uri uri) {
            String string = uri.toString();
            string.getClass();
            return string.length() > 30 ? string.substring(0, 30).concat("...") : string;
        }
    }

    public vpb(ContentResolver contentResolver, spb spbVar, ka6 ka6Var, boolean z, z1b z1bVar, f94 f94Var, boolean z2, l1a l1aVar, Set set) {
        contentResolver.getClass();
        spbVar.getClass();
        ka6Var.getClass();
        z1bVar.getClass();
        f94Var.getClass();
        l1aVar.getClass();
        this.a = contentResolver;
        this.b = spbVar;
        this.c = ka6Var;
        this.d = z;
        this.e = z1bVar;
        this.f = f94Var;
        this.g = z2;
        this.h = l1aVar;
        this.i = set;
        this.j = new LinkedHashMap();
        new LinkedHashMap();
        new LinkedHashMap();
        new d2f(new i30(this, 13));
        int i = 17;
        new d2f(new z0(this, i));
        new d2f(new j30(this, 14));
        this.k = new d2f(new k30(this, 16));
        this.l = new d2f(new n30(this, 9));
        this.m = new d2f(new ye(this, 14));
        this.n = new d2f(new la(this, 21));
        this.o = new d2f(new ig(this, 15));
        this.p = new d2f(new vv(this, 17));
        this.q = new d2f(new oa(this, 19));
        this.r = new d2f(new hr(this, 11));
        this.s = new d2f(new qa(this, i));
        this.t = new d2f(new wm1(this, 13));
        this.u = new d2f(new cq0(this, 10));
        this.v = new d2f(new o91(this, 14));
        this.w = new d2f(new oq(this, 18));
        this.x = new d2f(new dd(this, 15));
        this.y = new d2f(new qq(this, 19));
    }

    public final opb<vs4> a() {
        Object value = this.p.getValue();
        value.getClass();
        return (opb) value;
    }

    public final opb<vs4> b() {
        Object value = this.l.getValue();
        value.getClass();
        return (opb) value;
    }

    public final opb<n82<l82>> c(com.facebook.imagepipeline.request.a aVar) {
        it5.a();
        Uri uri = aVar.b;
        uri.getClass();
        int i = aVar.c;
        if (i == 0) {
            return (opb) this.k.getValue();
        }
        d2f d2fVar = this.s;
        switch (i) {
            case 2:
                return aVar.a() ? e() : (opb) d2fVar.getValue();
            case 3:
                return aVar.a() ? e() : (opb) this.r.getValue();
            case 4:
                if (aVar.a()) {
                    return e();
                }
                String type = this.a.getType(uri);
                Map<String, String> map = wm9.a;
                return type != null ? wve.K(type, "video/", false) : false ? (opb) d2fVar.getValue() : (opb) this.t.getValue();
            case 5:
                return (opb) this.x.getValue();
            case 6:
                return (opb) this.w.getValue();
            case 7:
                return (opb) this.y.getValue();
            case 8:
                return (opb) this.v.getValue();
            default:
                Set<jb3> set = this.i;
                if (set != null) {
                    Iterator<jb3> it = set.iterator();
                    while (it.hasNext()) {
                        it.next().getClass();
                    }
                }
                l5.q("Unsupported uri scheme! Uri is: ".concat(a.a(uri)));
                return null;
        }
    }

    public final opb<Void> d(com.facebook.imagepipeline.request.a aVar) {
        web.e(Boolean.valueOf(aVar.l.c() <= a.c.ENCODED_MEMORY_CACHE.c()));
        int i = aVar.c;
        if (i == 0) {
            Object value = this.m.getValue();
            value.getClass();
            return (opb) value;
        }
        if (i == 2 || i == 3) {
            Object value2 = this.o.getValue();
            value2.getClass();
            return (opb) value2;
        }
        Uri uri = aVar.b;
        uri.getClass();
        l5.q("Unsupported uri scheme for encoded image fetch! Uri is: ".concat(a.a(uri)));
        return null;
    }

    public final opb<n82<l82>> e() {
        return (opb) this.u.getValue();
    }

    public final synchronized opb<n82<l82>> f(opb<n82<l82>> opbVar) {
        opb<n82<l82>> opbVar2;
        opbVar2 = (opb) this.j.get(opbVar);
        if (opbVar2 == null) {
            spb spbVar = this.b;
            whb whbVar = new whb(opbVar, spbVar.o, spbVar.i.g());
            spb spbVar2 = this.b;
            uhb uhbVar = new uhb(spbVar2.m, spbVar2.n, whbVar);
            this.j.put(opbVar, uhbVar);
            opbVar2 = uhbVar;
        }
        return opbVar2;
    }

    public final opb<n82<l82>> g(opb<n82<l82>> opbVar) {
        spb spbVar = this.b;
        up1 up1Var = spbVar.m;
        am3 am3Var = spbVar.n;
        skf skfVar = new skf(new wg1(am3Var, new xg1(up1Var, am3Var, opbVar)), this.e);
        up1 up1Var2 = spbVar.m;
        up1Var2.getClass();
        am3Var.getClass();
        return new ug1(up1Var2, am3Var, skfVar);
    }

    public final opb<n82<l82>> h(opb<vs4> opbVar) {
        opbVar.getClass();
        it5.a();
        spb spbVar = this.b;
        return g(new rj3(spbVar.d, spbVar.i.d(), spbVar.e, spbVar.f, spbVar.g, spbVar.h, opbVar, spbVar.q, spbVar.p));
    }

    public final opb i(q09 q09Var, olf[] olfVarArr) {
        sj sjVar = new sj(j(q09Var));
        spb spbVar = this.b;
        m37 m37Var = this.h;
        return h(new tl1(spbVar.b(new nlf(olfVarArr), true, m37Var), new hlf(spbVar.i.b(), spbVar.b(sjVar, true, m37Var))));
    }

    public final ts4 j(opb opbVar) {
        boolean z = this.g;
        spb spbVar = this.b;
        if (z) {
            it5.a();
            gze<f64> gzeVar = spbVar.k;
            am3 am3Var = spbVar.n;
            opbVar = new com.facebook.imagepipeline.producers.a(gzeVar, am3Var, new b(gzeVar, am3Var, opbVar));
        }
        up1 up1Var = spbVar.l;
        am3 am3Var2 = spbVar.n;
        return new ts4(am3Var2, new ws4(up1Var, am3Var2, opbVar));
    }
}
