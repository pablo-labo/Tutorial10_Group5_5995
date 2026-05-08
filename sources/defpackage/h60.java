package defpackage;

import android.content.Context;
import defpackage.hmb;
import defpackage.jc7;

/* JADX INFO: loaded from: classes.dex */
public final class h60 implements l74 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h60(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.l74
    public final void dispose() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((j60) obj);
                break;
            case 1:
                ((jc7) obj2).a.j((jc7.a) obj);
                break;
            default:
                g4a g4aVar = (g4a) obj2;
                hmb.b bVar = (hmb.b) g4aVar.getValue();
                if (bVar != null) {
                    hmb.a aVar = new hmb.a(bVar);
                    d3a d3aVar = (d3a) obj;
                    if (d3aVar != null) {
                        d3aVar.c(aVar);
                    }
                    g4aVar.setValue(null);
                }
                break;
        }
    }
}
