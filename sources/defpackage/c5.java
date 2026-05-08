package defpackage;

import defpackage.if8;
import defpackage.lxf;
import defpackage.te8;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class c5 implements gu5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ c5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                StringBuilder sb = new StringBuilder("Scope for type parameter ");
                d5 d5Var = (d5) obj;
                sb.append(d5Var.a.c());
                return lxf.a.a(d5Var.b.getUpperBounds(), sb.toString());
            case 1:
                ke8 ke8Var = (ke8) obj;
                return ke8Var.x(ke8Var.getDescriptor().o().n(), te8.c.b);
            case 2:
                return new if8.a((if8) obj);
            case 3:
                return ((yo8) obj).b.j().a();
            case 4:
                return (ArrayList) obj;
            default:
                return bnb.c((bnb) obj);
        }
    }
}
