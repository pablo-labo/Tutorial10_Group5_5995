package com.indeed.android.jobsearch.tare.logging;

import com.datadog.android.rum.internal.utils.ViewUtilsKt;
import defpackage.a9c;
import defpackage.ai8;
import defpackage.aq7;
import defpackage.boa;
import defpackage.c0h;
import defpackage.cq7;
import defpackage.cu;
import defpackage.dpe;
import defpackage.dq7;
import defpackage.fwc;
import defpackage.gu5;
import defpackage.gz4;
import defpackage.kc;
import defpackage.l5;
import defpackage.lx5;
import defpackage.lz2;
import defpackage.me;
import defpackage.mj8;
import defpackage.mja;
import defpackage.qpd;
import defpackage.qt8;
import defpackage.s87;
import defpackage.sk6;
import defpackage.sp7;
import defpackage.tp7;
import defpackage.tx5;
import defpackage.u63;
import defpackage.v87;
import defpackage.vh8;
import defpackage.vi1;
import defpackage.vx0;
import defpackage.xh8;
import defpackage.yh;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements tp7, xh8 {
    public final Lazy a = boa.E(qt8.a, new C0168a(this));
    public final tx5 b = new tx5();
    public final c0h c = new c0h(23);
    public String d = "";
    public String e = "";

    /* JADX INFO: renamed from: com.indeed.android.jobsearch.tare.logging.a$a, reason: collision with other inner class name */
    public static final class C0168a extends mj8 implements gu5<gz4> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0168a(a aVar) {
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

    @Override // defpackage.tp7
    public final void a(lx5 lx5Var) {
        Lazy<s87> lazy = s87.f;
        s87.a.a(g(), lx5Var);
    }

    @Override // defpackage.tp7
    public final void b(sp7 sp7Var) {
        boolean z = sp7Var instanceof sp7.f;
        int i = 2;
        tx5 tx5Var = this.b;
        if (z) {
            sp7.f fVar = (sp7.f) sp7Var;
            String str = fVar.b;
            Lazy<s87> lazy = s87.f;
            s87.a.a(g(), tx5Var.f(str, fVar.c, new kc(i, fVar, this)));
            this.d = str;
            return;
        }
        if (sp7Var instanceof sp7.c) {
            sp7.c cVar = (sp7.c) sp7Var;
            Lazy<s87> lazy2 = s87.f;
            s87.a.a(g(), tx5.e(tx5Var, cVar.c, cVar.b, new vi1(i, cVar, this), 4));
            return;
        }
        int i2 = 5;
        if (sp7Var instanceof sp7.g) {
            sp7.g gVar = (sp7.g) sp7Var;
            Lazy<s87> lazy3 = s87.f;
            s87.a.a(g(), tx5Var.j(gVar.b, gVar.c, gVar.d, new vx0(gVar, i2)));
            return;
        }
        if (sp7Var instanceof sp7.h) {
            sp7.h hVar = (sp7.h) sp7Var;
            Lazy<s87> lazy4 = s87.f;
            s87.a.a(g(), tx5Var.l(hVar.b, hVar.c, hVar.d, new me(hVar, 10)));
            return;
        }
        if (sp7Var instanceof sp7.a) {
            sp7.a aVar = (sp7.a) sp7Var;
            Lazy<s87> lazy5 = s87.f;
            s87.a.a(g(), tx5Var.b(aVar.b, aVar.c, aVar.d, new yh(aVar, 7)));
            return;
        }
        if (sp7Var instanceof sp7.e) {
            sp7.e eVar = (sp7.e) sp7Var;
            lx5 lx5VarO = tx5Var.o(eVar.b, eVar.c);
            Lazy<s87> lazy6 = s87.f;
            s87.a.a(g(), lx5VarO);
            return;
        }
        if (sp7Var instanceof sp7.b) {
            sp7.b bVar = (sp7.b) sp7Var;
            Lazy<s87> lazy7 = s87.f;
            s87.a.a(g(), tx5Var.h(bVar.b, bVar.c, bVar.d, new cu(bVar, i2)));
            return;
        }
        if (!(sp7Var instanceof sp7.d)) {
            ArrayList arrayList = lz2.a;
            lz2.b("JSTEventLogImpl", "Unhandled JSTEvent: " + sp7Var, false, new UnhandledJSTEventException(l5.m("Unhandled JSTEvent: ", "JSTEvent type: " + sp7Var, ". No corresponding IQL event fired.")));
            return;
        }
        sp7.d dVar = (sp7.d) sp7Var;
        Lazy<s87> lazy8 = s87.f;
        gz4 gz4VarG = g();
        String str2 = dVar.b;
        String str3 = dVar.c;
        cq7 cq7Var = dVar.d;
        long j = cq7Var.a;
        long j2 = cq7Var.b;
        long j3 = cq7Var.c;
        String str4 = cq7Var.d;
        dq7 dq7Var = dVar.e;
        long j4 = dq7Var != null ? dq7Var.a : -1L;
        long j5 = dq7Var != null ? dq7Var.b : -1L;
        long j6 = dq7Var != null ? dq7Var.c : -1L;
        String str5 = dq7Var != null ? dq7Var.d : ViewUtilsKt.UNKNOWN_DESTINATION_URL;
        long j7 = j6;
        long j8 = dq7Var != null ? dq7Var.e : -1L;
        long j9 = dq7Var != null ? dq7Var.f : -1L;
        String str6 = dVar.f;
        this.c.getClass();
        str6.getClass();
        s87.a.a(gz4VarG, new sk6(str2, str3, j, j2, j3, str4, j4, j5, j7, str5, j8, j9, str6));
    }

    @Override // defpackage.tp7
    public final void c(dpe dpeVar) {
        Lazy<s87> lazy = s87.f;
        s87.a.b(g(), dpeVar);
    }

    @Override // defpackage.tp7
    public final void e(JsonObject jsonObject, aq7 aq7Var) {
        Lazy<s87> lazy = s87.f;
        g().getClass();
        s87 value = s87.f.getValue();
        value.getClass();
        u63.Y(value.b, null, null, new v87(value, jsonObject, aq7Var, null), 3);
    }

    @Override // defpackage.tp7
    public final void f(mja mjaVar) {
        Lazy<s87> lazy = s87.f;
        s87.a.a(g(), mjaVar);
    }

    public final gz4 g() {
        return (gz4) this.a.getValue();
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }
}
