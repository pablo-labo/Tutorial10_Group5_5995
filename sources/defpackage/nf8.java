package defpackage;

import defpackage.z4d;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class nf8 implements gu5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ nf8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return akg.d(((of8) obj).j());
            case 1:
                ap8 ap8Var = (ap8) obj;
                hvc hvcVar = ap8Var.W;
                ArrayList<pw7> typeParameters = hvcVar.getTypeParameters();
                ArrayList arrayList = new ArrayList(t92.r0(typeParameters, 10));
                for (pw7 pw7Var : typeParameters) {
                    rxf rxfVarA = ap8Var.Y.b.a(pw7Var);
                    if (rxfVarA == null) {
                        throw new AssertionError("Parameter " + pw7Var + " surely belongs to class " + hvcVar + ", so it must be resolved");
                    }
                    arrayList.add(rxfVarA);
                }
                return arrayList;
            case 2:
                return ((qp8) obj).o(lz3.q);
            default:
                vxe vxeVar = (vxe) obj;
                return vxeVar.i(z4d.a.a(vxeVar.b, null, 3));
        }
    }
}
