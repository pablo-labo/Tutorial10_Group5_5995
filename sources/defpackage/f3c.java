package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class f3c extends fq5 {
    public final /* synthetic */ g3c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3c(to1 to1Var, g3c g3cVar) {
        super(to1Var);
        this.b = g3cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // defpackage.fq5, defpackage.pne
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long f1(defpackage.zn1 r12, long r13) {
        /*
            r11 = this;
            r12.getClass()
            pne r0 = r11.a
            long r12 = r0.f1(r12, r13)
            r0 = -1
            int r14 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            g3c r11 = r11.b
            if (r14 == 0) goto L16
            long r0 = r11.f
            long r0 = r0 + r12
            r11.f = r0
        L16:
            com.facebook.react.modules.network.NetworkingModule$f r0 = r11.d
            long r1 = r11.f
            okhttp3.ResponseBody r11 = r11.c
            long r3 = r11.getD()
            if (r14 != 0) goto L24
            r11 = 1
            goto L25
        L24:
            r11 = 0
        L25:
            r0.getClass()
            long r5 = java.lang.System.nanoTime()
            if (r11 != 0) goto L3d
            com.facebook.react.modules.network.NetworkingModule$a r11 = com.facebook.react.modules.network.NetworkingModule.INSTANCE
            long r7 = r0.a
            r11.getClass()
            r9 = 100000000(0x5f5e100, double:4.94065646E-316)
            long r7 = r7 + r9
            int r11 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r11 >= 0) goto L6e
        L3d:
            java.lang.String r11 = r0.b
            java.lang.String r14 = "text"
            boolean r11 = r11.equals(r14)
            if (r11 == 0) goto L48
            goto L6e
        L48:
            com.facebook.react.bridge.ReactApplicationContext r11 = r0.c
            int r14 = r0.d
            if (r11 == 0) goto L6c
            com.facebook.react.bridge.WritableArray r7 = com.facebook.react.bridge.Arguments.createArray()
            r7.getClass()
            com.facebook.react.bridge.ReadableArrayBuilder r8 = new com.facebook.react.bridge.ReadableArrayBuilder
            r8.<init>(r7)
            r8.add(r14)
            int r14 = (int) r1
            r8.add(r14)
            int r14 = (int) r3
            r8.add(r14)
            j6g r14 = defpackage.j6g.a
            java.lang.String r14 = "didReceiveNetworkDataProgress"
            r11.emitDeviceEvent(r14, r7)
        L6c:
            r0.a = r5
        L6e:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f3c.f1(zn1, long):long");
    }
}
