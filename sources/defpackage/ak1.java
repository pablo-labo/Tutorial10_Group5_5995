package defpackage;

import android.view.View;
import defpackage.gsg;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ak1 implements gsg.b {
    @Override // gsg.b
    public final rzg a(View view, rzg rzgVar, gsg.c cVar) {
        cVar.d = rzgVar.a() + cVar.d;
        WeakHashMap<View, prg> weakHashMap = epg.a;
        boolean z = view.getLayoutDirection() == 1;
        int iB = rzgVar.b();
        int iC = rzgVar.c();
        int i = cVar.a + (z ? iC : iB);
        cVar.a = i;
        int i2 = cVar.c;
        if (!z) {
            iB = iC;
        }
        int i3 = i2 + iB;
        cVar.c = i3;
        view.setPaddingRelative(i, cVar.b, i3, cVar.d);
        return rzgVar;
    }
}
