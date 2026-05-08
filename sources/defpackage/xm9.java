package defpackage;

import defpackage.ljd;
import defpackage.srf;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class xm9<T> extends g3a<T> {
    public final ljd<pz8<?>, a<?>> l = new ljd<>();

    public static class a<V> implements goa<V> {
        public final g3a a;
        public final srf.a b;
        public int c = -1;

        public a(g3a g3aVar, srf.a aVar) {
            this.a = g3aVar;
            this.b = aVar;
        }

        @Override // defpackage.goa
        public final void d(V v) {
            int i = this.c;
            int i2 = this.a.g;
            if (i != i2) {
                this.c = i2;
                this.b.d(v);
            }
        }
    }

    @Override // defpackage.pz8
    public final void g() {
        Iterator<Map.Entry<pz8<?>, a<?>>> it = this.l.iterator();
        while (true) {
            ljd.e eVar = (ljd.e) it;
            if (!eVar.hasNext()) {
                return;
            }
            a aVar = (a) ((Map.Entry) eVar.next()).getValue();
            aVar.a.f(aVar);
        }
    }

    @Override // defpackage.pz8
    public final void h() {
        Iterator<Map.Entry<pz8<?>, a<?>>> it = this.l.iterator();
        while (true) {
            ljd.e eVar = (ljd.e) it;
            if (!eVar.hasNext()) {
                return;
            }
            a aVar = (a) ((Map.Entry) eVar.next()).getValue();
            aVar.a.i(aVar);
        }
    }
}
