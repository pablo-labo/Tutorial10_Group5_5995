package defpackage;

import defpackage.e69;
import kotlin.jvm.functions.Function1;
import org.intellij.markdown.MarkdownParsingException;

/* JADX INFO: loaded from: classes3.dex */
public final class xd9 {

    public static final class a extends mj8 implements Function1<e69.a, Boolean> {
        final /* synthetic */ gd9 $constraints;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gd9 gd9Var) {
            super(1);
            this.$constraints = gd9Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
        @Override // kotlin.jvm.functions.Function1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean invoke(e69.a r4) {
            /*
                r3 = this;
                e69$a r4 = (e69.a) r4
                r4.getClass()
                gd9 r0 = r3.$constraints
                tc2 r0 = r0.h(r4)
                java.lang.String r1 = r4.d
                int r2 = defpackage.hd9.d(r0, r1)
                gd9 r3 = r3.$constraints
                boolean r3 = defpackage.hd9.e(r0, r3)
                if (r3 == 0) goto L30
                int r3 = r1.length()
                r0 = 1
                if (r2 >= r3) goto L31
                int r2 = r2 + r0
                e69$a r3 = r4.e(r2)
                if (r3 == 0) goto L2c
                java.lang.Integer r3 = r3.a()
                goto L2d
            L2c:
                r3 = 0
            L2d:
                if (r3 != 0) goto L30
                goto L31
            L30:
                r0 = 0
            L31:
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: xd9.a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public static int a(e69.a aVar, gd9 gd9Var) {
        gd9Var.getClass();
        if (aVar.b != -1) {
            throw new MarkdownParsingException("");
        }
        a aVar2 = new a(gd9Var);
        int i = 1;
        while (((Boolean) aVar2.invoke(aVar)).booleanValue() && (aVar = aVar.d()) != null && (i = i + 1) <= 4) {
        }
        return i;
    }

    public static e69.a b(e69.a aVar, int i) {
        int i2 = i - 1;
        e69.a aVarD = aVar;
        for (int i3 = 0; i3 < i2; i3++) {
            aVarD = aVar.d();
            if (aVarD == null) {
                return null;
            }
        }
        while (aVarD.a() == null) {
            aVarD = aVarD.d();
            if (aVarD == null) {
                return null;
            }
        }
        return aVarD;
    }
}
