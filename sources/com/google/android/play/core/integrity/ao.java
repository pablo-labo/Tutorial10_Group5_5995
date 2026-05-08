package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes2.dex */
final class ao extends IntegrityTokenRequest {
    private final String a;
    private final Long b;
    private final Object c = null;

    public /* synthetic */ ao(String str, Long l, Object obj, an anVar) {
        this.a = str;
        this.b = l;
    }

    private static boolean a() {
        return true;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long cloudProjectNumber() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof com.google.android.play.core.integrity.IntegrityTokenRequest
            r2 = 0
            if (r1 == 0) goto L24
            r1 = r6
            com.google.android.play.core.integrity.IntegrityTokenRequest r1 = (com.google.android.play.core.integrity.IntegrityTokenRequest) r1
            java.lang.String r3 = r5.a
            java.lang.String r4 = r1.nonce()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L24
            java.lang.Long r5 = r5.b
            if (r5 != 0) goto L26
            java.lang.Long r5 = r1.cloudProjectNumber()
            if (r5 != 0) goto L24
        L22:
            r5 = r0
            goto L31
        L24:
            r5 = r2
            goto L31
        L26:
            java.lang.Long r1 = r1.cloudProjectNumber()
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L24
            goto L22
        L31:
            boolean r6 = r6 instanceof com.google.android.play.core.integrity.ao
            if (r6 == 0) goto L3f
            boolean r6 = a()
            if (r6 == 0) goto L3f
            if (r5 == 0) goto L3e
            return r0
        L3e:
            return r2
        L3f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.integrity.ao.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        Long l = this.b;
        int iHashCode2 = (l == null ? 0 : l.hashCode()) ^ (iHashCode * 1000003);
        return a() ? iHashCode2 * 1000003 : iHashCode2;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String nonce() {
        return this.a;
    }

    public final String toString() {
        String strConcat = "IntegrityTokenRequest{nonce=" + this.a + ", cloudProjectNumber=" + this.b;
        if (a()) {
            strConcat = strConcat.concat(", network=null");
        }
        return strConcat.concat("}");
    }
}
