package defpackage;

import defpackage.iad;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class jad implements Function1 {
    public static final jad b = new jad(0);
    public static final jad c = new jad(1);
    public static final jad d = new jad(2);
    public final /* synthetic */ int a;

    public /* synthetic */ jad(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z = false;
        int i = 1;
        switch (this.a) {
            case 0:
                ei8 ei8Var = (ei8) obj;
                iad.b bVar = iad.b.c;
                ei8Var.getClass();
                return ei8Var.t(bnb.INT);
            case 1:
                hv1 hv1Var = (hv1) obj;
                hv1Var.getClass();
                int i2 = mp1.l;
                sfe sfeVar = (sfe) hv1Var;
                if (ei8.A(sfeVar) && b04.b(sfeVar, new b00(sfeVar, i)) != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                p7g p7gVar = (p7g) obj;
                p7gVar.getClass();
                v62 v62VarD = p7gVar.M0().d();
                if (v62VarD != null && (v62VarD instanceof rxf) && (((rxf) v62VarD).d() instanceof zvf)) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
