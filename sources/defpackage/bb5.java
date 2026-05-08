package defpackage;

import android.graphics.Bitmap;
import defpackage.w5b;

/* JADX INFO: loaded from: classes.dex */
public final class bb5 implements jh8<lhg> {
    @Override // defpackage.jh8
    public final String a(lhg lhgVar, nva nvaVar) {
        String strX;
        lhg lhgVar2 = lhgVar;
        String str = lhgVar2.c;
        if ((str != null && !str.equals("file")) || lhgVar2.e == null) {
            return null;
        }
        Bitmap.Config[] configArr = ukg.a;
        if ((wl7.b(lhgVar2.c, "file") && wl7.b(z92.Q0(pg8.z(lhgVar2)), "android_asset")) || !((Boolean) r55.b(nvaVar, x27.b)).booleanValue() || (strX = pg8.x(lhgVar2)) == null) {
            return null;
        }
        pa5 pa5Var = nvaVar.f;
        String str2 = w5b.b;
        Long l = pa5Var.i(w5b.a.a(strX)).f;
        StringBuilder sb = new StringBuilder();
        sb.append(lhgVar2);
        sb.append('-');
        sb.append(l);
        return sb.toString();
    }
}
