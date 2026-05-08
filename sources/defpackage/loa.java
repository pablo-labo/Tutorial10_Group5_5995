package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class loa implements sxa {
    public static final a b = a.a;
    public final joa a;

    public static final class a extends mj8 implements Function1<loa, j6g> {
        public static final a a = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(loa loaVar) {
            loa loaVar2 = loaVar;
            if (loaVar2.W0()) {
                loaVar2.a.u0();
            }
            return j6g.a;
        }
    }

    public loa(joa joaVar) {
        this.a = joaVar;
    }

    @Override // defpackage.sxa
    public final boolean W0() {
        return this.a.k().c0;
    }
}
