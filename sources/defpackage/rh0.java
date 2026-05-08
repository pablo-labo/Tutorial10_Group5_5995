package defpackage;

import defpackage.k15;
import defpackage.pua;
import java.util.List;
import java.util.UUID;
import pua.a;

/* JADX INFO: loaded from: classes.dex */
public final class rh0<D extends pua.a> {
    public final pua<D> a;
    public final UUID b;
    public final k15 c;
    public final sl6 d;
    public final List<nl6> e;
    public final Boolean f;
    public final Boolean g;
    public final Boolean h;
    public final Boolean i;
    public final Boolean j;
    public final boolean k;

    public static final class a<D extends pua.a> implements w2a<a<D>> {
        public final pua<D> a;
        public UUID b;
        public k15 c;
        public sl6 d;
        public List<nl6> e;
        public Boolean f;
        public Boolean g;
        public Boolean h;
        public Boolean i;
        public Boolean j;
        public boolean k;

        public a(pua<D> puaVar) {
            puaVar.getClass();
            this.a = puaVar;
            this.c = wr4.a;
            this.k = true;
        }

        @Override // defpackage.w2a
        public final Object a(k15.a aVar) {
            this.c = this.c.d(aVar);
            return this;
        }

        public final rh0<D> b() {
            UUID uuidRandomUUID = this.b;
            if (uuidRandomUUID == null) {
                uuidRandomUUID = UUID.randomUUID();
                uuidRandomUUID.getClass();
            }
            return new rh0<>(this.a, uuidRandomUUID, this.c, this.d, this.e, this.g, this.h, this.f, this.i, this.j, this.k);
        }
    }

    public rh0(pua puaVar, UUID uuid, k15 k15Var, sl6 sl6Var, List list, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, boolean z) {
        this.a = puaVar;
        this.b = uuid;
        this.c = k15Var;
        this.d = sl6Var;
        this.e = list;
        this.f = bool;
        this.g = bool2;
        this.h = bool3;
        this.i = bool4;
        this.j = bool5;
        this.k = z;
    }

    public final a<D> a() {
        pua<D> puaVar = this.a;
        puaVar.getClass();
        a<D> aVar = new a<>(puaVar);
        UUID uuid = this.b;
        uuid.getClass();
        aVar.b = uuid;
        k15 k15Var = this.c;
        k15Var.getClass();
        aVar.c = k15Var;
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.g = this.f;
        aVar.h = this.g;
        aVar.f = this.h;
        aVar.i = this.i;
        aVar.j = this.j;
        aVar.k = this.k;
        return aVar;
    }
}
