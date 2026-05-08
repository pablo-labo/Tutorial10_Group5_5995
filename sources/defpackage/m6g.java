package defpackage;

import defpackage.fx9;
import defpackage.ke3;

/* JADX INFO: loaded from: classes.dex */
public final class m6g<Model> implements fx9<Model, Model> {
    public static final m6g<?> a = new m6g<>();

    public static class a<Model> implements gx9<Model, Model> {
        public static final a<?> a = new a<>();

        @Override // defpackage.gx9
        public final fx9<Model, Model> c(n1a n1aVar) {
            return m6g.a;
        }
    }

    public static class b<Model> implements ke3<Model> {
        public final Model a;

        public b(Model model) {
            this.a = model;
        }

        @Override // defpackage.ke3
        public final Class<Model> a() {
            return (Class<Model>) this.a.getClass();
        }

        @Override // defpackage.ke3
        public final void b() {
        }

        @Override // defpackage.ke3
        public final void cancel() {
        }

        @Override // defpackage.ke3
        public final void d(knb knbVar, ke3.a<? super Model> aVar) {
            aVar.f(this.a);
        }

        @Override // defpackage.ke3
        public final xe3 e() {
            return xe3.a;
        }
    }

    @Override // defpackage.fx9
    public final fx9.a<Model> a(Model model, int i, int i2, ova ovaVar) {
        return new fx9.a<>(new nna(model), new b(model));
    }

    @Override // defpackage.fx9
    public final boolean b(Model model) {
        return true;
    }
}
