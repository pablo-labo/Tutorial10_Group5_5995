package defpackage;

import defpackage.l6d;

/* JADX INFO: loaded from: classes3.dex */
public final class sec extends m3d<byte[]> {
    public final l6d.b<byte[]> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sec(String str, l6d.b bVar, ti9 ti9Var) {
        super(0, str, ti9Var);
        str.getClass();
        this.a = bVar;
    }

    @Override // defpackage.m3d
    public final void deliverResponse(byte[] bArr) {
        byte[] bArr2 = bArr;
        bArr2.getClass();
        this.a.e(bArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0006 A[Catch: UnsupportedEncodingException -> 0x0013, TryCatch #0 {UnsupportedEncodingException -> 0x0013, blocks: (B:3:0x0002, B:6:0x0009, B:5:0x0006), top: B:11:0x0002 }] */
    @Override // defpackage.m3d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.l6d<byte[]> parseNetworkResponse(defpackage.wga r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L6
            byte[] r1 = r2.b     // Catch: java.io.UnsupportedEncodingException -> L13
            if (r1 != 0) goto L9
        L6:
            r1 = 0
            byte[] r1 = new byte[r1]     // Catch: java.io.UnsupportedEncodingException -> L13
        L9:
            ts1$a r2 = defpackage.ol6.a(r2)     // Catch: java.io.UnsupportedEncodingException -> L13
            l6d r0 = new l6d     // Catch: java.io.UnsupportedEncodingException -> L13
            r0.<init>(r1, r2)     // Catch: java.io.UnsupportedEncodingException -> L13
            return r0
        L13:
            r1 = move-exception
            com.android.volley.ParseError r2 = new com.android.volley.ParseError
            r2.<init>(r1)
            l6d r1 = new l6d
            r1.<init>(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sec.parseNetworkResponse(wga):l6d");
    }
}
