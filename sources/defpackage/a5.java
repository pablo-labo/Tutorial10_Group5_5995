package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a5 extends u62 {
    public final fla<a> b;

    public static final class a {
        public final Collection<ui8> a;
        public List<? extends ui8> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Collection<? extends ui8> collection) {
            collection.getClass();
            this.a = collection;
            this.b = u63.Z(lx4.d);
        }
    }

    public a5(aue aueVar) {
        aueVar.getClass();
        int i = 0;
        this.b = aueVar.b(new x4(this, i), new y4(this, i));
    }

    public abstract Collection<ui8> g();

    public abstract ui8 h();

    public Collection<ui8> i(boolean z) {
        return zr4.a;
    }

    public abstract cze j();

    @Override // defpackage.kwf
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final List<ui8> b() {
        return this.b.invoke().b;
    }

    public List<ui8> m(List<ui8> list) {
        return list;
    }

    public void n(ui8 ui8Var) {
        ui8Var.getClass();
    }
}
