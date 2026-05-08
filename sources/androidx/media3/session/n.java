package androidx.media3.session;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.media3.session.legacy.MediaBrowserCompat;
import androidx.media3.session.legacy.c;
import androidx.media3.session.legacy.h;
import androidx.media3.session.r;
import defpackage.cq3;
import defpackage.e47;
import defpackage.ebe;
import defpackage.et3;
import defpackage.h54;
import defpackage.ij9;
import defpackage.ka2;
import defpackage.wu8;
import defpackage.zkd;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class n extends w {

    public final class a implements r.c {
        public final Object a = new Object();
        public final h.b b;

        public a(h.b bVar) {
            new ArrayList();
            this.b = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return Objects.equals(this.b, ((a) obj).b);
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(this.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ebe g(n nVar, wu8 wu8Var) {
        V v;
        ka2.o(wu8Var, "LibraryResult must not be null");
        ebe ebeVar = new ebe();
        if (wu8Var.a != 0 || (v = wu8Var.c) == 0) {
            ebeVar.l(null);
            return ebeVar;
        }
        e47 e47Var = (e47) v;
        if (e47Var.isEmpty()) {
            ebeVar.l(new ArrayList());
            return ebeVar;
        }
        ArrayList arrayList = new ArrayList();
        ebeVar.a(new et3(1, ebeVar, arrayList), h54.a);
        cq3 cq3Var = new cq3(nVar, new AtomicInteger(0), e47Var, arrayList, ebeVar);
        for (int i = 0; i < e47Var.size(); i++) {
            if (((ij9) e47Var.get(i)).d.k != null) {
                throw null;
            }
            arrayList.add(null);
            cq3Var.run();
        }
        return ebeVar;
    }

    @Override // androidx.media3.session.w, androidx.media3.session.legacy.c
    public final c.a b(String str, int i, Bundle bundle) {
        if (super.b(str, i, bundle) == null || h() == null) {
            return null;
        }
        throw null;
    }

    @Override // androidx.media3.session.legacy.c
    public final void c(String str, c.h<List<MediaBrowserCompat.MediaItem>> hVar) {
        d(str, hVar, null);
    }

    @Override // androidx.media3.session.legacy.c
    public final void d(String str, c.h<List<MediaBrowserCompat.MediaItem>> hVar, Bundle bundle) {
        r.d dVarH = h();
        if (dVarH == null) {
            hVar.c(null);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            hVar.a();
            throw null;
        }
        zkd.T("MLSLegacyStub", "onLoadChildren(): Ignoring empty parentId from " + dVarH);
        hVar.c(null);
    }

    @Override // androidx.media3.session.legacy.c
    public final void e(String str, c.h<MediaBrowserCompat.MediaItem> hVar) {
        r.d dVarH = h();
        if (dVarH == null) {
            hVar.c(null);
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            hVar.a();
            throw null;
        }
        zkd.T("MLSLegacyStub", "Ignoring empty itemId from " + dVarH);
        hVar.c(null);
    }

    @Override // androidx.media3.session.w
    public final r.d f(h.b bVar, Bundle bundle) {
        throw null;
    }

    public final r.d h() {
        c.f fVar = this.a;
        fVar.getClass();
        fVar.a();
        throw null;
    }
}
