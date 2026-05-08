package defpackage;

import androidx.media3.session.k;
import androidx.media3.session.m;
import com.android.volley.VolleyError;
import com.rivereactnative.g;
import com.rivereactnative.j;
import defpackage.e47;
import defpackage.l6d;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ti9 implements k.c, l6d.a {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ti9(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // l6d.a
    public void e(VolleyError volleyError) {
        j jVar = (j) this.a;
        String str = (String) this.b;
        volleyError.getClass();
        boolean z = jVar.f0;
        wga wgaVar = volleyError.networkResponse;
        g gVar = g.IncorrectRiveFileUrl;
        if (wgaVar == null || wgaVar.a != 404) {
            if (!z) {
                j.u(volleyError, "Unable to download Rive asset file " + str);
                return;
            } else {
                gVar.c("Unable to download the Rive asset file from: " + str);
                jVar.n(gVar);
                return;
            }
        }
        if (!z) {
            j.u(volleyError, "Bad URL: " + str);
        } else {
            gVar.c("Bad URL: " + str);
            jVar.n(gVar);
        }
    }

    @Override // androidx.media3.session.k.c
    public void h(androidx.media3.session.g gVar, int i) {
        k kVar = (k) this.a;
        List list = (List) this.b;
        m mVar = kVar.c;
        e47.b bVar = e47.b;
        e47.a aVar = new e47.a();
        for (int i2 = 0; i2 < list.size(); i2++) {
            aVar.c(((ij9) list.get(i2)).b(true));
        }
        gVar.F(mVar, i, new bq1(aVar.f()), true);
    }
}
