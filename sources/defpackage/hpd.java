package defpackage;

import java.util.EnumSet;
import java.util.IdentityHashMap;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import org.apache.avro.g;

/* JADX INFO: loaded from: classes3.dex */
public final class hpd {
    public static final AtomicInteger a = new AtomicInteger();

    public static final class a implements jpd<Void> {
        public static final EnumSet c;
        public static final EnumSet d;
        public final j4b a;
        public final IdentityHashMap<g, g> b = new IdentityHashMap<>();

        static {
            g.u uVar = g.u.RECORD;
            c = EnumSet.of(uVar, g.u.ARRAY, g.u.MAP, g.u.UNION);
            d = EnumSet.of(uVar, g.u.ENUM, g.u.FIXED);
        }

        public a(j4b j4bVar) {
            this.a = j4bVar;
        }

        public static void a(g gVar, final g gVar2) {
            Optional.ofNullable(gVar.G()).ifPresent(new Consumer() { // from class: epd
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((p49) obj).a(gVar2);
                }
            });
            if (d.contains(gVar.K())) {
                gVar.u().forEach(new Consumer() { // from class: fpd
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        gVar2.n((String) obj);
                    }
                });
            }
            gVar.d().forEach(new BiConsumer() { // from class: gpd
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    gVar2.a(obj2, (String) obj);
                }
            });
        }

        public final String toString() {
            return akb.k("ResolvingVisitor{symbolTable=", String.valueOf(this.a), ", replace=", String.valueOf(this.b), "}");
        }
    }

    public static boolean a(g gVar) {
        return gVar.K() == g.u.RECORD && gVar.e("org.apache.avro.idl.unresolved.name") != null && gVar.H() != null && gVar.H().startsWith("UnresolvedSchema") && "org.apache.avro.compiler".equals(gVar.I());
    }
}
