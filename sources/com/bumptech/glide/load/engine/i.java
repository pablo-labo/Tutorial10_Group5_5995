package com.bumptech.glide.load.engine;

import com.bumptech.glide.Registry;
import com.bumptech.glide.load.engine.f;
import defpackage.de6;
import defpackage.fx9;
import defpackage.g1a;
import defpackage.h5d;
import defpackage.ht0;
import defpackage.hx9;
import defpackage.ke3;
import defpackage.kg8;
import defpackage.prf;
import defpackage.xe3;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class i implements c, ke3.a<Object> {
    public int V;
    public volatile fx9.a<?> W;
    public File X;
    public h5d Y;
    public final e a;
    public final d<?> b;
    public int c;
    public int d = -1;
    public kg8 e;
    public List<fx9<File, ?>> f;

    public i(d dVar, e eVar) {
        this.b = dVar;
        this.a = eVar;
    }

    @Override // com.bumptech.glide.load.engine.c
    public final boolean a() {
        List list;
        ArrayList arrayListC;
        ArrayList arrayListA = this.b.a();
        boolean z = false;
        if (!arrayListA.isEmpty()) {
            d<?> dVar = this.b;
            Registry registryA = dVar.c.a();
            Class<?> cls = dVar.d.getClass();
            Class<?> cls2 = dVar.g;
            Class<?> cls3 = dVar.k;
            de6 de6Var = registryA.h;
            g1a g1aVar = (g1a) ((AtomicReference) de6Var.a).getAndSet(null);
            if (g1aVar == null) {
                g1aVar = new g1a(cls, cls2, cls3);
            } else {
                g1aVar.a = cls;
                g1aVar.b = cls2;
                g1aVar.c = cls3;
            }
            synchronized (((ht0) de6Var.b)) {
                list = (List) ((ht0) de6Var.b).get(g1aVar);
            }
            ((AtomicReference) de6Var.a).set(g1aVar);
            List list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                hx9 hx9Var = registryA.a;
                synchronized (hx9Var) {
                    arrayListC = hx9Var.a.c(cls);
                }
                Iterator it = arrayListC.iterator();
                while (it.hasNext()) {
                    for (Class cls4 : registryA.c.b((Class) it.next(), cls2)) {
                        if (!registryA.f.a(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                            arrayList.add(cls4);
                        }
                    }
                }
                de6 de6Var2 = registryA.h;
                List listUnmodifiableList = Collections.unmodifiableList(arrayList);
                synchronized (((ht0) de6Var2.b)) {
                    ((ht0) de6Var2.b).put(new g1a(cls, cls2, cls3), listUnmodifiableList);
                }
                list2 = arrayList;
            }
            if (!list2.isEmpty()) {
                while (true) {
                    List<fx9<File, ?>> list3 = this.f;
                    if (list3 != null && this.V < list3.size()) {
                        this.W = null;
                        while (!z && this.V < this.f.size()) {
                            List<fx9<File, ?>> list4 = this.f;
                            int i = this.V;
                            this.V = i + 1;
                            fx9<File, ?> fx9Var = list4.get(i);
                            File file = this.X;
                            d<?> dVar2 = this.b;
                            this.W = fx9Var.a(file, dVar2.e, dVar2.f, dVar2.i);
                            if (this.W != null && this.b.c(this.W.c.a()) != null) {
                                this.W.c.d(this.b.o, this);
                                z = true;
                            }
                        }
                        return z;
                    }
                    int i2 = this.d + 1;
                    this.d = i2;
                    if (i2 >= list2.size()) {
                        int i3 = this.c + 1;
                        this.c = i3;
                        if (i3 >= arrayListA.size()) {
                            break;
                        }
                        this.d = 0;
                    }
                    kg8 kg8Var = (kg8) arrayListA.get(this.c);
                    Class cls5 = (Class) list2.get(this.d);
                    prf<Z> prfVarE = this.b.e(cls5);
                    d<?> dVar3 = this.b;
                    this.Y = new h5d(dVar3.c.a, kg8Var, dVar3.n, dVar3.e, dVar3.f, prfVarE, cls5, dVar3.i);
                    File fileA = ((f.c) dVar3.h).a().a(this.Y);
                    this.X = fileA;
                    if (fileA != null) {
                        this.e = kg8Var;
                        this.f = this.b.c.a().f(fileA);
                        this.V = 0;
                    }
                }
            } else if (!File.class.equals(this.b.k)) {
                StringBuilder sb = new StringBuilder("Failed to find any load path from ");
                sb.append(this.b.d.getClass());
                Class<?> cls6 = this.b.k;
                sb.append(" to ");
                sb.append(cls6);
                throw new IllegalStateException(sb.toString());
            }
        }
        return false;
    }

    @Override // ke3.a
    public final void c(Exception exc) {
        this.a.e(this.Y, exc, this.W.c, xe3.d);
    }

    @Override // com.bumptech.glide.load.engine.c
    public final void cancel() {
        fx9.a<?> aVar = this.W;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    @Override // ke3.a
    public final void f(Object obj) {
        this.a.f(this.e, obj, this.W.c, xe3.d, this.Y);
    }
}
