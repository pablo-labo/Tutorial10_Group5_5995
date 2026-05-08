package defpackage;

import android.content.Context;
import android.webkit.CookieManager;
import defpackage.c87;
import defpackage.xh8;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class o1g implements n1g, xh8 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.n1g
    public final void a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            iae iaeVar = (iae) it.next();
            m1g m1gVar = iaeVar.a;
            String str = iaeVar.b;
            int iOrdinal = m1gVar.ordinal();
            if (iOrdinal == 0) {
                boolean z = this instanceof ai8;
                CookieManager cookieManager = CookieManager.getInstance();
                String strG = d93.g();
                String strA = ez2.f.a();
                pxc pxcVar = d87.a;
                cookieManager.setCookie(strG, o6.f(strA, "=", str, "; Path=/; Max-Age=157680000"));
                c87.a((Context) (z ? ((ai8) this).d() : (qpd) xh8.a.a().a.b).a(null, fwc.a.b(Context.class), null));
            } else if (iOrdinal == 1) {
                boolean z2 = this instanceof ai8;
                CookieManager cookieManager2 = CookieManager.getInstance();
                String strG2 = d93.g();
                String strA2 = ez2.e.a();
                pxc pxcVar2 = d87.a;
                cookieManager2.setCookie(strG2, o6.f(strA2, "=", str, "; Path=/; Max-Age=157680000"));
                c87.a((Context) (z2 ? ((ai8) this).d() : (qpd) xh8.a.a().a.b).a(null, fwc.a.b(Context.class), null));
            } else if (iOrdinal != 2) {
                l.g();
                return;
            } else {
                d2f d2fVar = c87.a;
                c87.a.d(ez2.X, str);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.n1g
    public final String b(m1g m1gVar) {
        m1gVar.getClass();
        int iOrdinal = m1gVar.ordinal();
        if (iOrdinal == 0) {
            String strG = d93.g();
            d2f d2fVar = c87.a;
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.getClass();
            return c87.a.b(cookieManager, strG, ez2.f);
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                l.g();
                return null;
            }
            d2f d2fVar2 = c87.a;
            return c87.a.a(ez2.X);
        }
        String strG2 = d93.g();
        d2f d2fVar3 = c87.a;
        CookieManager cookieManager2 = CookieManager.getInstance();
        cookieManager2.getClass();
        return c87.a.b(cookieManager2, strG2, ez2.e);
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
