package defpackage;

import defpackage.of1;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nf1 implements Supplier {
    public final /* synthetic */ int a;

    public /* synthetic */ nf1(int i) {
        this.a = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                of1.b bVar = new of1.b();
                new pf1(new byte[0], 0);
                return bVar;
            default:
                return new lug();
        }
    }
}
