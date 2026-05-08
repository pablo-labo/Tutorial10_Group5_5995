package androidx.datastore.preferences.protobuf;

import defpackage.r0h;
import defpackage.zjb;

/* JADX INFO: loaded from: classes.dex */
public final class u<K, V> {
    public final a<K, V> a;

    public static class a<K, V> {
        public final r0h a;
        public final r0h b;
        public final V c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(r0h r0hVar, r0h r0hVar2, Object obj) {
            this.a = r0hVar;
            this.b = r0hVar2;
            this.c = obj;
        }
    }

    public u(r0h r0hVar, r0h r0hVar2, zjb zjbVar) {
        this.a = new a<>(r0hVar, r0hVar2, zjbVar);
    }

    public static <K, V> int a(a<K, V> aVar, K k, V v) {
        return l.b(aVar.b, 2, v) + l.b(aVar.a, 1, k);
    }

    public static <K, V> void b(CodedOutputStream codedOutputStream, a<K, V> aVar, K k, V v) {
        l.j(codedOutputStream, aVar.a, 1, k);
        l.j(codedOutputStream, aVar.b, 2, v);
    }
}
