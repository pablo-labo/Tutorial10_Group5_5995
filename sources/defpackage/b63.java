package defpackage;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b63 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b63(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    @Override // android.content.DialogInterface.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onClick(android.content.DialogInterface r4, int r5) {
        /*
            r3 = this;
            int r4 = r3.a
            java.lang.Object r3 = r3.b
            switch(r4) {
                case 0: goto L35;
                default: goto L7;
            }
        L7:
            xta r3 = (defpackage.xta) r3
            gua r4 = r3.b
            r0 = 0
            java.lang.String r1 = "viewModel"
            if (r4 == 0) goto L31
            sta[] r4 = defpackage.sta.values()
            if (r5 < 0) goto L21
            r4.getClass()
            int r2 = r4.length
            int r2 = r2 + (-1)
            if (r5 > r2) goto L21
            r4 = r4[r5]
            goto L23
        L21:
            sta r4 = defpackage.sta.NotSelected
        L23:
            gua r3 = r3.b
            if (r3 == 0) goto L2d
            g3a<sta> r3 = r3.V
            r3.j(r4)
            return
        L2d:
            defpackage.wl7.g(r1)
            throw r0
        L31:
            defpackage.wl7.g(r1)
            throw r0
        L35:
            com.linecorp.linesdk.openchat.ui.CreateOpenChatActivity r3 = (com.linecorp.linesdk.openchat.ui.CreateOpenChatActivity) r3
            int r4 = com.linecorp.linesdk.openchat.ui.CreateOpenChatActivity.u0
            r3.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b63.onClick(android.content.DialogInterface, int):void");
    }
}
