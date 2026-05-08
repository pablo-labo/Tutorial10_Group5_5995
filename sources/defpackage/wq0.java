package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class wq0 implements Function1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ wq0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.a
            java.lang.Object r3 = r3.b
            switch(r0) {
                case 0: goto L54;
                default: goto L7;
            }
        L7:
            hvc r3 = (defpackage.hvc) r3
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            boolean r0 = r4.isSynthetic()
            r1 = 0
            if (r0 == 0) goto L13
            goto L4f
        L13:
            java.lang.Class<?> r3 = r3.a
            boolean r3 = r3.isEnum()
            r0 = 1
            if (r3 == 0) goto L4e
            java.lang.String r3 = r4.getName()
            java.lang.String r2 = "values"
            boolean r2 = defpackage.wl7.b(r3, r2)
            if (r2 == 0) goto L36
            java.lang.Class[] r3 = r4.getParameterTypes()
            r3.getClass()
            int r3 = r3.length
            if (r3 != 0) goto L34
            r3 = r0
            goto L4c
        L34:
            r3 = r1
            goto L4c
        L36:
            java.lang.String r2 = "valueOf"
            boolean r3 = defpackage.wl7.b(r3, r2)
            if (r3 == 0) goto L34
            java.lang.Class[] r3 = r4.getParameterTypes()
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            java.lang.Class[] r4 = new java.lang.Class[]{r4}
            boolean r3 = java.util.Arrays.equals(r3, r4)
        L4c:
            if (r3 != 0) goto L4f
        L4e:
            r1 = r0
        L4f:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            return r3
        L54:
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.get(r4)
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wq0.invoke(java.lang.Object):java.lang.Object");
    }
}
