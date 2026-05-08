package defpackage;

import androidx.activity.result.ActivityResult;
import androidx.appcompat.widget.SearchView;
import androidx.media3.session.z;
import com.swmansion.rnscreens.i;
import defpackage.e75;
import defpackage.gdb;
import defpackage.lz8;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x65 implements e75.b, lz8.a, n8, l6h, SearchView.j {
    public final /* synthetic */ Object a;

    public /* synthetic */ x65(Object obj) {
        this.a = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x014f  */
    @Override // defpackage.l6h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long N(com.facebook.yoga.YogaNodeJNIBase r18, float r19, defpackage.m6h r20, float r21, defpackage.m6h r22) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x65.N(com.facebook.yoga.YogaNodeJNIBase, float, m6h, float, m6h):long");
    }

    @Override // androidx.appcompat.widget.SearchView.j
    public boolean b() {
        i.h((i) this.a);
        return false;
    }

    @Override // defpackage.n8
    public void c(Object obj) {
        h5b h5bVar = (h5b) this.a;
        ActivityResult activityResult = (ActivityResult) obj;
        activityResult.getClass();
        int i = activityResult.a;
        if (i == -1) {
            ((ua6) h5bVar.s0.getValue()).b(activityResult.b, new j91(h5bVar, 12), new j30(h5bVar, 13));
        } else {
            ArrayList arrayList = lz2.a;
            lz2.b("PassportSignInWebViewFragment", p6.c(i, "Google SignIn - resultCode "), false, new Throwable(p6.c(i, "Google SignIn - resultCode ")));
        }
    }

    @Override // lz8.a
    public void invoke(Object obj) {
        ((gdb.c) obj).o0(((z) this.a).g);
    }

    @Override // defpackage.wg3
    public Object j(Object obj, ka6 ka6Var) {
        return this.a;
    }
}
