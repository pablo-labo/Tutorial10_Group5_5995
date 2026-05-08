package defpackage;

import androidx.work.b;
import androidx.work.c;
import defpackage.fsa;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public abstract class h3h {
    public final UUID a;
    public final r3h b;
    public final Set<String> c;

    public static abstract class a<B extends a<B, ?>, W extends h3h> {
        public UUID a;
        public r3h b;
        public final LinkedHashSet c;

        public a(Class<? extends c> cls) {
            UUID uuidRandomUUID = UUID.randomUUID();
            uuidRandomUUID.getClass();
            this.a = uuidRandomUUID;
            String string = this.a.toString();
            string.getClass();
            this.b = new r3h(string, null, cls.getName(), null, null, null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 1048570, 0);
            String[] strArr = {cls.getName()};
            LinkedHashSet linkedHashSet = new LinkedHashSet(kc9.V(1));
            ut0.y0(strArr, linkedHashSet);
            this.c = linkedHashSet;
        }

        public final W a() {
            fsa.a aVar = (fsa.a) this;
            fsa fsaVar = new fsa(aVar.a, aVar.b, aVar.c);
            jq2 jq2Var = this.b.j;
            boolean z = !jq2Var.h.isEmpty() || jq2Var.d || jq2Var.b || jq2Var.c;
            r3h r3hVar = this.b;
            if (r3hVar.q) {
                if (z) {
                    l5.q("Expedited jobs only support network and storage constraints");
                    return null;
                }
                if (r3hVar.g > 0) {
                    l5.q("Expedited jobs cannot be delayed");
                    return null;
                }
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            uuidRandomUUID.getClass();
            this.a = uuidRandomUUID;
            String string = uuidRandomUUID.toString();
            string.getClass();
            r3h r3hVar2 = this.b;
            r3hVar2.getClass();
            String str = r3hVar2.c;
            s2h s2hVar = r3hVar2.b;
            String str2 = r3hVar2.d;
            b bVar = new b(r3hVar2.e);
            b bVar2 = new b(r3hVar2.f);
            long j = r3hVar2.g;
            long j2 = r3hVar2.h;
            long j3 = r3hVar2.i;
            jq2 jq2Var2 = r3hVar2.j;
            jq2Var2.getClass();
            this.b = new r3h(string, s2hVar, str, str2, bVar, bVar2, j, j2, j3, new jq2(jq2Var2.a, jq2Var2.b, jq2Var2.c, jq2Var2.d, jq2Var2.e, jq2Var2.f, jq2Var2.g, jq2Var2.h), r3hVar2.k, r3hVar2.l, r3hVar2.m, r3hVar2.n, r3hVar2.o, r3hVar2.p, r3hVar2.q, r3hVar2.r, r3hVar2.s, 524288, 0);
            return fsaVar;
        }
    }

    public h3h(UUID uuid, r3h r3hVar, LinkedHashSet linkedHashSet) {
        uuid.getClass();
        r3hVar.getClass();
        linkedHashSet.getClass();
        this.a = uuid;
        this.b = r3hVar;
        this.c = linkedHashSet;
    }
}
