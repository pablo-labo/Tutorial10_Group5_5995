package defpackage;

import com.facebook.imagepipeline.request.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class oa1 implements ppb {
    public static final j47 b0;
    public static final Object c0;
    public boolean V;
    public inb W;
    public boolean X;
    public boolean Y;
    public final ArrayList Z;
    public final a a;
    public final o27 a0;
    public final String b;
    public final tpb c;
    public final Object d;
    public final a.c e;
    public final HashMap f;

    static {
        int i = j47.a;
        HashSet hashSet = new HashSet(2);
        Collections.addAll(hashSet, "id", "uri_source");
        b0 = new j47(hashSet);
        c0 = new Object();
    }

    public oa1(a aVar, String str, String str2, tpb tpbVar, Object obj, a.c cVar, boolean z, boolean z2, inb inbVar, o27 o27Var) {
        this.a = aVar;
        this.b = str;
        HashMap map = new HashMap();
        this.f = map;
        map.put("id", str);
        map.put("uri_source", aVar == null ? "null-request" : aVar.b);
        this.c = tpbVar;
        this.d = obj == null ? c0 : obj;
        this.e = cVar;
        this.V = z;
        this.W = inbVar;
        this.X = z2;
        this.Y = false;
        this.Z = new ArrayList();
        this.a0 = o27Var;
    }

    public static void b(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((qpb) it.next()).a();
        }
    }

    public static void c(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((qpb) it.next()).d();
        }
    }

    public static void d(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((qpb) it.next()).c();
        }
    }

    @Override // defpackage.ppb
    public final tpb G() {
        return this.c;
    }

    @Override // defpackage.ppb
    public final synchronized boolean N() {
        return this.X;
    }

    @Override // defpackage.ppb
    public final synchronized inb P() {
        return this.W;
    }

    @Override // defpackage.ppb
    public final a Q() {
        return this.a;
    }

    @Override // defpackage.ig6
    public final void W(Map<String, ?> map) {
        if (map == null) {
            return;
        }
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            f0(entry.getValue(), entry.getKey());
        }
    }

    @Override // defpackage.ppb
    public final Object a() {
        return this.d;
    }

    @Override // defpackage.ppb
    public final synchronized boolean b0() {
        return this.V;
    }

    @Override // defpackage.ig6
    public final <T> T d0(String str) {
        return (T) this.f.get(str);
    }

    public final void e() {
        ArrayList arrayList;
        synchronized (this) {
            if (this.Y) {
                arrayList = null;
            } else {
                this.Y = true;
                arrayList = new ArrayList(this.Z);
            }
        }
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((qpb) it.next()).b();
        }
    }

    @Override // defpackage.ig6
    public final void f0(Object obj, String str) {
        if (b0.contains(str)) {
            return;
        }
        this.f.put(str, obj);
    }

    @Override // defpackage.ig6
    public final Map<String, Object> getExtras() {
        return this.f;
    }

    @Override // defpackage.ppb
    public final String getId() {
        return this.b;
    }

    @Override // defpackage.ppb
    public final o27 h() {
        return this.a0;
    }

    @Override // defpackage.ppb
    public final a.c h0() {
        return this.e;
    }

    @Override // defpackage.ppb
    public final void p(String str, String str2) {
        HashMap map = this.f;
        map.put("origin", str);
        map.put("origin_sub", str2);
    }

    @Override // defpackage.ppb
    public final void s(String str) {
        p(str, "default");
    }

    @Override // defpackage.ppb
    public final void v(pa1 pa1Var) {
        boolean z;
        synchronized (this) {
            this.Z.add(pa1Var);
            z = this.Y;
        }
        if (z) {
            pa1Var.b();
        }
    }
}
