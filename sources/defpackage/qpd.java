package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.koin.core.error.NoBeanDefFoundException;

/* JADX INFO: loaded from: classes3.dex */
public final class qpd {
    public final a9c a;
    public final vh8 b;
    public final ArrayList<qpd> c;
    public final zs0<v3b> d;

    public static final class a extends mj8 implements gu5<j6g> {
        final /* synthetic */ v3b $parameters;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v3b v3bVar) {
            super(0);
            this.$parameters = v3bVar;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            qpd.this.d.addFirst(this.$parameters);
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements gu5<v3b> {
        public b() {
            super(0);
        }

        @Override // defpackage.gu5
        public final v3b invoke() {
            zs0<v3b> zs0Var = qpd.this.d;
            return zs0Var.isEmpty() ? null : zs0Var.removeFirst();
        }
    }

    public qpd(a9c a9cVar, vh8 vh8Var) {
        a9cVar.getClass();
        this.a = a9cVar;
        this.b = vh8Var;
        this.c = new ArrayList<>();
        new ArrayList();
        this.d = new zs0<>();
    }

    public final Object a(gu5 gu5Var, yd8 yd8Var, a9c a9cVar) throws NoBeanDefFoundException {
        String str;
        yd8Var.getClass();
        vh8 vh8Var = this.b;
        o81 o81Var = vh8Var.c;
        tu8 tu8Var = tu8.a;
        if (!o81Var.E(tu8Var)) {
            return d(gu5Var, yd8Var, a9cVar);
        }
        if (a9cVar != null) {
            str = " with qualifier '" + a9cVar + '\'';
        } else {
            str = "";
        }
        vh8Var.c.D(tu8Var, "|- '" + zd8.a(yd8Var) + '\'' + str + " ...");
        long jNanoTime = System.nanoTime();
        Object objD = d(gu5Var, yd8Var, a9cVar);
        double dNanoTime = ((double) (System.nanoTime() - jNanoTime)) / 1000000.0d;
        vh8Var.c.D(tu8Var, "|- '" + zd8.a(yd8Var) + "' in " + dNanoTime + " ms");
        return objD;
    }

    public final ArrayList b(yd8 yd8Var) {
        yd8Var.getClass();
        vh8 vh8Var = this.b;
        fg7 fg7Var = new fg7(vh8Var.c, this, null);
        kg7 kg7Var = vh8Var.b;
        kg7Var.getClass();
        Collection collectionValues = kg7Var.b.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (wl7.b(((hg7) obj).a.a, fg7Var.b.a)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            hg7 hg7Var = (hg7) obj2;
            if (wl7.b(hg7Var.a.b, yd8Var) || hg7Var.a.f.contains(yd8Var)) {
                arrayList2.add(obj2);
            }
        }
        List listZ1 = z92.z1(z92.D1(arrayList2));
        ArrayList arrayList3 = new ArrayList(t92.r0(listZ1, 10));
        Iterator it = listZ1.iterator();
        while (it.hasNext()) {
            arrayList3.add(((hg7) it.next()).c(fg7Var));
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator<qpd> it2 = this.c.iterator();
        while (it2.hasNext()) {
            w92.w0(arrayList4, it2.next().b(yd8Var));
        }
        return z92.h1(arrayList3, arrayList4);
    }

    public final Object c(gu5 gu5Var, yd8 yd8Var, a9c a9cVar) {
        tu8 tu8Var = tu8.a;
        vh8 vh8Var = this.b;
        yd8Var.getClass();
        try {
            return a(gu5Var, yd8Var, a9cVar);
        } catch (NoBeanDefFoundException unused) {
            o81 o81Var = vh8Var.c;
            String str = "* No instance found for " + zd8.a(yd8Var) + " on scope " + this;
            if (!o81Var.E(tu8Var)) {
                return null;
            }
            o81Var.D(tu8Var, str);
            return null;
        }
    }

    public final Object d(gu5 gu5Var, yd8 yd8Var, a9c a9cVar) throws NoBeanDefFoundException {
        String str;
        Object objC = null;
        v3b v3bVar = gu5Var != null ? (v3b) gu5Var.invoke() : null;
        if (v3bVar != null) {
            o81 o81Var = this.b.c;
            tu8 tu8Var = tu8.a;
            if (o81Var.E(tu8Var)) {
                o81Var.D(tu8Var, "| >> parameters " + v3bVar + ' ');
            }
            a aVar = new a(v3bVar);
            synchronized (this) {
                aVar.invoke();
            }
        }
        fg7 fg7Var = new fg7(this.b.c, this, v3bVar);
        kg7 kg7Var = this.b.b;
        a9c a9cVar2 = this.a;
        kg7Var.getClass();
        yd8Var.getClass();
        a9cVar2.getClass();
        hg7 hg7Var = (hg7) kg7Var.b.get(mh2.m(yd8Var, a9cVar, a9cVar2));
        Object objC2 = hg7Var != null ? hg7Var.c(fg7Var) : null;
        if (objC2 == null) {
            objC2 = null;
        }
        if (objC2 == null) {
            o81 o81Var2 = this.b.c;
            String str2 = "|- ? t:'" + zd8.a(yd8Var) + "' - q:'" + a9cVar + "' look in injected parameters";
            tu8 tu8Var2 = tu8.a;
            if (o81Var2.E(tu8Var2)) {
                o81Var2.D(tu8Var2, str2);
            }
            v3b v3bVarG = this.d.g();
            objC2 = v3bVarG != null ? v3bVarG.a(yd8Var) : null;
            if (objC2 == null) {
                o81 o81Var3 = this.b.c;
                String str3 = "|- ? t:'" + zd8.a(yd8Var) + "' - q:'" + a9cVar + "' look at scope source";
                if (o81Var3.E(tu8Var2)) {
                    o81Var3.D(tu8Var2, str3);
                }
                o81 o81Var4 = this.b.c;
                String str4 = "|- ? t:'" + zd8.a(yd8Var) + "' - q:'" + a9cVar + "' look in other scopes";
                if (o81Var4.E(tu8Var2)) {
                    o81Var4.D(tu8Var2, str4);
                }
                Iterator<qpd> it = this.c.iterator();
                while (it.hasNext() && (objC = it.next().c(gu5Var, yd8Var, a9cVar)) == null) {
                }
                objC2 = objC;
                if (objC2 == null) {
                    rpd rpdVar = new rpd(this);
                    synchronized (this) {
                        rpdVar.invoke();
                    }
                    o81 o81Var5 = this.b.c;
                    tu8 tu8Var3 = tu8.a;
                    if (o81Var5.E(tu8Var3)) {
                        o81Var5.D(tu8Var3, "|- << parameters");
                    }
                    if (a9cVar != null) {
                        str = " & qualifier:'" + a9cVar + '\'';
                    } else {
                        str = "";
                    }
                    throw new NoBeanDefFoundException("No definition found for class:'" + zd8.a(yd8Var) + "' q:'" + str + "'. Check your definitions!");
                }
            }
        }
        if (v3bVar == null) {
            return objC2;
        }
        o81 o81Var6 = this.b.c;
        tu8 tu8Var4 = tu8.a;
        if (o81Var6.E(tu8Var4)) {
            o81Var6.D(tu8Var4, "| << parameters");
        }
        b bVar = new b();
        synchronized (this) {
            bVar.invoke();
        }
        return objC2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qpd) {
            qpd qpdVar = (qpd) obj;
            return wl7.b(this.a, qpdVar.a) && this.b == qpdVar.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (((((this.a.hashCode() * 31) - 1466499394) * 31) + 1) * 31);
    }

    public final String toString() {
        return "['_root_']";
    }
}
