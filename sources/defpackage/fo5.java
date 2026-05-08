package defpackage;

import defpackage.go5;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class fo5 implements yq2<go5.a> {
    public final /* synthetic */ String a;

    public fo5(String str) {
        this.a = str;
    }

    @Override // defpackage.yq2
    public final void accept(go5.a aVar) {
        go5.a aVar2 = aVar;
        synchronized (go5.c) {
            try {
                jfe<String, ArrayList<yq2<go5.a>>> jfeVar = go5.d;
                ArrayList<yq2<go5.a>> arrayList = jfeVar.get(this.a);
                if (arrayList == null) {
                    return;
                }
                jfeVar.remove(this.a);
                for (int i = 0; i < arrayList.size(); i++) {
                    arrayList.get(i).accept(aVar2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
