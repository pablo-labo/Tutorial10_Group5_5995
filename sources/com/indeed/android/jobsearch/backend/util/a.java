package com.indeed.android.jobsearch.backend.util;

import android.webkit.CookieManager;
import defpackage.a9c;
import defpackage.ai8;
import defpackage.b87;
import defpackage.boa;
import defpackage.c87;
import defpackage.d2f;
import defpackage.d93;
import defpackage.dd4;
import defpackage.ez2;
import defpackage.fwc;
import defpackage.gu5;
import defpackage.gz4;
import defpackage.lg;
import defpackage.mj8;
import defpackage.pxc;
import defpackage.qpd;
import defpackage.qt8;
import defpackage.ra8;
import defpackage.sa8;
import defpackage.vh8;
import defpackage.xh8;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements xh8 {
    public static final Lazy a = boa.E(qt8.a, new C0166a(new a()));
    public static final ra8 b = sa8.a(new lg(7));

    /* JADX INFO: renamed from: com.indeed.android.jobsearch.backend.util.a$a, reason: collision with other inner class name */
    public static final class C0166a extends mj8 implements gu5<gz4> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0166a(a aVar) {
            super(0);
            this.$this_inject = aVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gz4, java.lang.Object] */
        @Override // defpackage.gu5
        public final gz4 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gz4.class), a9cVar);
        }
    }

    public static String a() {
        String strE;
        CookieManager cookieManager = CookieManager.getInstance();
        String strG = d93.g();
        dd4 dd4Var = dd4.a;
        if (dd4.c()) {
            d2f d2fVar = c87.a;
            strE = (String) c87.a.getValue();
        } else {
            pxc pxcVar = b87.a;
            strE = b87.e(strG);
        }
        d2f d2fVar2 = c87.a;
        cookieManager.getClass();
        return c87.a.b(cookieManager, "https://" + strE + "/", ez2.b);
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
