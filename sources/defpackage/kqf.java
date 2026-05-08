package defpackage;

import defpackage.lla;

/* JADX INFO: loaded from: classes3.dex */
public final class kqf extends lla.a {
    public final /* synthetic */ mqf a;

    public kqf(mqf mqfVar) {
        this.a = mqfVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SimplifyVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v4 boolean, still in use, count: 3, list:
          (r5v4 boolean) from 0x0056: INVOKE 
          (wrap:java.util.concurrent.atomic.AtomicBoolean:0x0054: IGET (r1v0 u8e) A[WRAPPED] u8e.f java.util.concurrent.atomic.AtomicBoolean)
          (r5v4 boolean)
          (r2v0 boolean)
         VIRTUAL call: java.util.concurrent.atomic.AtomicBoolean.compareAndSet(boolean, boolean):boolean A[MD:(boolean, boolean):boolean (c), WRAPPED]
          (r5v4 boolean) from 0x002d: IF  (r5v4 boolean) == true  -> B:17:0x002f A[HIDDEN]
          (r5v4 boolean) from 0x0060: IF  (r5v4 boolean) != true  -> B:31:0x0083 A[HIDDEN]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:174)
        	at jadx.core.utils.InsnRemover.unbindAllArgs(InsnRemover.java:106)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:90)
        	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:174)
        	at jadx.core.dex.instructions.args.InsnArg.wrapInstruction(InsnArg.java:141)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyArgs(SimplifyVisitor.java:116)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyInsn(SimplifyVisitor.java:132)
        	at jadx.core.dex.visitors.SimplifyVisitor.simplifyBlock(SimplifyVisitor.java:86)
        	at jadx.core.dex.visitors.SimplifyVisitor.visit(SimplifyVisitor.java:71)
        */
    @Override // lla.a
    public final void a(java.util.HashMap r5) {
        /*
            r4 = this;
            mqf r0 = r4.a
            u8e r1 = r0.j
            if (r1 == 0) goto L95
            boolean r0 = r0.t
            if (r0 != 0) goto Lc
            goto L95
        Lc:
            java.lang.String r0 = "isForeground"
            java.lang.Object r5 = r5.get(r0)
            boolean r0 = r5 instanceof java.lang.Boolean
            if (r0 == 0) goto L19
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            goto L1a
        L19:
            r5 = 0
        L1a:
            if (r5 == 0) goto L95
            boolean r5 = r5.booleanValue()
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f
            boolean r0 = r0.get()
            r2 = r5 ^ 1
            if (r0 != r2) goto L2b
            goto L95
        L2b:
            mqf r4 = r4.a
            if (r5 == 0) goto L42
            gp5 r0 = new gp5
            r0.<init>()
            int r3 = r1.d
            int r3 = r3 + 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.b = r3
            r4.c(r0)
            goto L54
        L42:
            m71 r0 = new m71
            r0.<init>()
            int r3 = r1.c
            int r3 = r3 + 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.b = r3
            r4.c(r0)
        L54:
            java.util.concurrent.atomic.AtomicBoolean r4 = r1.f
            boolean r4 = r4.compareAndSet(r5, r2)
            if (r4 != 0) goto L5d
            goto L95
        L5d:
            r4 = 0
            java.lang.String r0 = "u8e"
            if (r5 == 0) goto L83
            java.lang.String r5 = "Application moved to foreground"
            java.lang.Object[] r2 = new java.lang.Object[r4]
            defpackage.c49.a(r0, r5, r2)
            java.lang.Runnable r5 = r1.k
            defpackage.u8e.a(r5)
            r1.d(r4)     // Catch: java.lang.Exception -> L72
            goto L7c
        L72:
            r4 = move-exception
            java.lang.String r5 = "Could not resume checking as tracker not setup. Exception: %s"
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            defpackage.c49.b(r0, r5, r4)
        L7c:
            int r4 = r1.d
            int r4 = r4 + 1
            r1.d = r4
            return
        L83:
            java.lang.String r5 = "Application moved to background"
            java.lang.Object[] r4 = new java.lang.Object[r4]
            defpackage.c49.a(r0, r5, r4)
            java.lang.Runnable r4 = r1.l
            defpackage.u8e.a(r4)
            int r4 = r1.c
            int r4 = r4 + 1
            r1.c = r4
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kqf.a(java.util.HashMap):void");
    }
}
