package defpackage;

import android.content.res.Configuration;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class j90 implements jh8<lhg> {
    @Override // defpackage.jh8
    public final String a(lhg lhgVar, nva nvaVar) {
        lhg lhgVar2 = lhgVar;
        if (!wl7.b(lhgVar2.c, "android.resource")) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(lhgVar2);
        sb.append(':');
        Configuration configuration = nvaVar.a.getResources().getConfiguration();
        Bitmap.Config[] configArr = ukg.a;
        sb.append(configuration.uiMode & 48);
        return sb.toString();
    }
}
