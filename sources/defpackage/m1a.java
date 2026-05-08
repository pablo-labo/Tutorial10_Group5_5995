package defpackage;

import com.bumptech.glide.load.engine.GlideException;
import defpackage.f65;
import defpackage.fx9;
import defpackage.ke3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m1a<Model, Data> implements fx9<Model, Data> {
    public final ArrayList a;
    public final ngb<List<Throwable>> b;

    public static class a<Data> implements ke3<Data>, ke3.a<Data> {
        public boolean V;
        public final ArrayList a;
        public final ngb<List<Throwable>> b;
        public int c;
        public knb d;
        public ke3.a<? super Data> e;
        public List<Throwable> f;

        public a(ArrayList arrayList, ngb ngbVar) {
            this.b = ngbVar;
            if (arrayList.isEmpty()) {
                l5.q("Must not be empty.");
                throw null;
            }
            this.a = arrayList;
            this.c = 0;
        }

        @Override // defpackage.ke3
        public final Class<Data> a() {
            return ((ke3) this.a.get(0)).a();
        }

        @Override // defpackage.ke3
        public final void b() {
            List<Throwable> list = this.f;
            if (list != null) {
                this.b.a(list);
            }
            this.f = null;
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((ke3) it.next()).b();
            }
        }

        @Override // ke3.a
        public final void c(Exception exc) {
            List<Throwable> list = this.f;
            beb.e(list, "Argument must not be null");
            list.add(exc);
            g();
        }

        @Override // defpackage.ke3
        public final void cancel() {
            this.V = true;
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((ke3) it.next()).cancel();
            }
        }

        @Override // defpackage.ke3
        public final void d(knb knbVar, ke3.a<? super Data> aVar) {
            this.d = knbVar;
            this.e = aVar;
            this.f = this.b.acquire();
            ((ke3) this.a.get(this.c)).d(knbVar, this);
            if (this.V) {
                cancel();
            }
        }

        @Override // defpackage.ke3
        public final xe3 e() {
            return ((ke3) this.a.get(0)).e();
        }

        @Override // ke3.a
        public final void f(Data data) {
            if (data != null) {
                this.e.f(data);
            } else {
                g();
            }
        }

        public final void g() {
            if (this.V) {
                return;
            }
            if (this.c < this.a.size() - 1) {
                this.c++;
                d(this.d, this.e);
            } else {
                beb.d(this.f);
                this.e.c(new GlideException("Fetch failed", new ArrayList(this.f)));
            }
        }
    }

    public m1a(ArrayList arrayList, f65.c cVar) {
        this.a = arrayList;
        this.b = cVar;
    }

    @Override // defpackage.fx9
    public final fx9.a<Data> a(Model model, int i, int i2, ova ovaVar) {
        fx9.a<Data> aVarA;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        kg8 kg8Var = null;
        for (int i3 = 0; i3 < size; i3++) {
            fx9 fx9Var = (fx9) arrayList.get(i3);
            if (fx9Var.b(model) && (aVarA = fx9Var.a(model, i, i2, ovaVar)) != null) {
                kg8Var = aVarA.a;
                arrayList2.add(aVarA.c);
            }
        }
        if (arrayList2.isEmpty() || kg8Var == null) {
            return null;
        }
        return new fx9.a<>(kg8Var, new a(arrayList2, this.b));
    }

    @Override // defpackage.fx9
    public final boolean b(Model model) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((fx9) it.next()).b(model)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.a.toArray()) + '}';
    }
}
