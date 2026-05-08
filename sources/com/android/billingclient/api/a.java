package com.android.billingclient.api;

import defpackage.dqh;
import defpackage.okh;
import defpackage.ooh;
import defpackage.t40;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public int a;
    public String b;

    /* JADX INFO: renamed from: com.android.billingclient.api.a$a, reason: collision with other inner class name */
    public static class C0109a {
        public int a;
        public String b;

        public final a a() {
            a aVar = new a();
            aVar.a = this.a;
            aVar.b = this.b;
            return aVar;
        }
    }

    public static C0109a a() {
        C0109a c0109a = new C0109a();
        c0109a.b = "";
        return c0109a;
    }

    public final String toString() {
        int i = this.a;
        int i2 = ooh.a;
        dqh dqhVar = okh.b;
        Integer numValueOf = Integer.valueOf(i);
        return t40.l("Response Code: ", (!dqhVar.containsKey(numValueOf) ? okh.RESPONSE_CODE_UNSPECIFIED : (okh) dqhVar.get(numValueOf)).toString(), ", Debug Message: ", this.b);
    }
}
