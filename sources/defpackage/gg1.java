package defpackage;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class gg1 implements n5d {
    public final Object a;
    public final Object b;

    public gg1() {
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
    }

    public Object a(qf8 qf8Var, Object obj) {
        qf8Var.getClass();
        return Long.valueOf(((nm0) this.a).j((String) this.b));
    }

    public void b(qf8 qf8Var, Object obj, Object obj2) {
        long jLongValue = ((Number) obj2).longValue();
        qf8Var.getClass();
        ((nm0) this.a).g(jLongValue, (String) this.b);
    }

    @Override // defpackage.n5d
    public ss4 c(ova ovaVar) {
        return ss4.b;
    }

    @Override // defpackage.zs4
    public boolean d(Object obj, File file, ova ovaVar) {
        return ((hg1) this.b).d(new dh1((bh1) this.a, ((BitmapDrawable) ((f5d) obj).get()).getBitmap()), file, ovaVar);
    }

    public /* synthetic */ gg1(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }
}
