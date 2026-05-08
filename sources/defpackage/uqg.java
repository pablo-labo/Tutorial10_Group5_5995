package defpackage;

import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class uqg implements gu5 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ int b;

    public /* synthetic */ uqg(int i, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ViewManager) it.next()).onSurfaceStopped(this.b);
        }
        return j6g.a;
    }
}
