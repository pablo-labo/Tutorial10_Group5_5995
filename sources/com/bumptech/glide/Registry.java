package com.bumptech.glide;

import com.bumptech.glide.load.data.a;
import defpackage.b6d;
import defpackage.beb;
import defpackage.ct4;
import defpackage.de6;
import defpackage.f65;
import defpackage.frf;
import defpackage.fx9;
import defpackage.fz1;
import defpackage.g65;
import defpackage.gx9;
import defpackage.h65;
import defpackage.hx9;
import defpackage.j5d;
import defpackage.k5d;
import defpackage.n1a;
import defpackage.n5d;
import defpackage.o5d;
import defpackage.pgb;
import defpackage.wz8;
import defpackage.zs4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Registry {
    public final hx9 a;
    public final ct4 b;
    public final k5d c;
    public final o5d d;
    public final com.bumptech.glide.load.data.b e;
    public final frf f;
    public final fz1 g;
    public final de6 h = new de6();
    public final wz8 i = new wz8();
    public final f65.c j;

    public static class MissingComponentException extends RuntimeException {
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
    }

    public Registry() {
        f65.c cVar = new f65.c(new pgb(20), new g65(), new h65());
        this.j = cVar;
        this.a = new hx9(cVar);
        this.b = new ct4();
        this.c = new k5d();
        this.d = new o5d();
        this.e = new com.bumptech.glide.load.data.b();
        this.f = new frf();
        this.g = new fz1();
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        k5d k5dVar = this.c;
        synchronized (k5dVar) {
            try {
                ArrayList<String> arrayList2 = new ArrayList(k5dVar.a);
                k5dVar.a.clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    k5dVar.a.add((String) it2.next());
                }
                for (String str : arrayList2) {
                    if (!arrayList.contains(str)) {
                        k5dVar.a.add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Class cls, zs4 zs4Var) {
        ct4 ct4Var = this.b;
        synchronized (ct4Var) {
            ct4Var.a.add(new ct4.a(cls, zs4Var));
        }
    }

    public final void b(Class cls, n5d n5dVar) {
        o5d o5dVar = this.d;
        synchronized (o5dVar) {
            o5dVar.a.add(new o5d.a(cls, n5dVar));
        }
    }

    public final void c(Class cls, Class cls2, gx9 gx9Var) {
        hx9 hx9Var = this.a;
        synchronized (hx9Var) {
            n1a n1aVar = hx9Var.a;
            synchronized (n1aVar) {
                try {
                    n1a.b bVar = new n1a.b(cls, cls2, gx9Var);
                    ArrayList arrayList = n1aVar.a;
                    arrayList.add(arrayList.size(), bVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
            hx9Var.b.a.clear();
        }
    }

    public final void d(String str, Class cls, Class cls2, j5d j5dVar) {
        k5d k5dVar = this.c;
        synchronized (k5dVar) {
            k5dVar.a(str).add(new k5d.a<>(cls, cls2, j5dVar));
        }
    }

    public final ArrayList e() {
        ArrayList arrayList;
        fz1 fz1Var = this.g;
        synchronized (fz1Var) {
            arrayList = (ArrayList) fz1Var.a;
        }
        if (arrayList.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return arrayList;
    }

    public final <Model> List<fx9<Model, ?>> f(Model model) {
        List<fx9<Model, ?>> listUnmodifiableList;
        hx9 hx9Var = this.a;
        hx9Var.getClass();
        Class<?> cls = model.getClass();
        synchronized (hx9Var) {
            hx9.a.C0260a c0260a = (hx9.a.C0260a) hx9Var.b.a.get(cls);
            listUnmodifiableList = c0260a == null ? null : c0260a.a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(hx9Var.a.b(cls));
                if (((hx9.a.C0260a) hx9Var.b.a.put(cls, new hx9.a.C0260a(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new NoModelLoaderAvailableException("Failed to find any ModelLoaders registered for model class: " + model.getClass());
        }
        int size = listUnmodifiableList.size();
        List<fx9<Model, ?>> arrayList = Collections.EMPTY_LIST;
        boolean z = true;
        for (int i = 0; i < size; i++) {
            fx9<Model, ?> fx9Var = listUnmodifiableList.get(i);
            if (fx9Var.b(model)) {
                if (z) {
                    arrayList = new ArrayList<>(size - i);
                    z = false;
                }
                arrayList.add(fx9Var);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new NoModelLoaderAvailableException("Found ModelLoaders for model class: " + listUnmodifiableList + ", but none that handle this specific model instance: " + model);
    }

    public final <X> com.bumptech.glide.load.data.a<X> g(X x) {
        com.bumptech.glide.load.data.a<X> aVarB;
        com.bumptech.glide.load.data.b bVar = this.e;
        synchronized (bVar) {
            try {
                beb.d(x);
                a.InterfaceC0114a interfaceC0114a = (a.InterfaceC0114a) bVar.a.get(x.getClass());
                if (interfaceC0114a == null) {
                    Iterator it = bVar.a.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        a.InterfaceC0114a interfaceC0114a2 = (a.InterfaceC0114a) it.next();
                        if (interfaceC0114a2.a().isAssignableFrom(x.getClass())) {
                            interfaceC0114a = interfaceC0114a2;
                            break;
                        }
                    }
                }
                if (interfaceC0114a == null) {
                    interfaceC0114a = com.bumptech.glide.load.data.b.b;
                }
                aVarB = interfaceC0114a.b(x);
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVarB;
    }

    public final void h(a.InterfaceC0114a interfaceC0114a) {
        com.bumptech.glide.load.data.b bVar = this.e;
        synchronized (bVar) {
            bVar.a.put(interfaceC0114a.a(), interfaceC0114a);
        }
    }

    public final void i(Class cls, Class cls2, b6d b6dVar) {
        frf frfVar = this.f;
        synchronized (frfVar) {
            frfVar.a.add(new frf.a(cls, cls2, b6dVar));
        }
    }
}
