package defpackage;

import defpackage.ad8;
import defpackage.od8;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nd8 {

    public static final class a extends nd8 {
        public final Field a;

        public a(Field field) {
            field.getClass();
            this.a = field;
        }

        @Override // defpackage.nd8
        public final String a() {
            StringBuilder sb = new StringBuilder();
            Field field = this.a;
            String name = field.getName();
            name.getClass();
            sb.append(jc8.a(name));
            sb.append("()");
            Class<?> type = field.getType();
            type.getClass();
            sb.append(wuc.b(type));
            return sb.toString();
        }
    }

    public static final class b extends nd8 {
        public final Method a;
        public final Method b;

        public b(Method method, Method method2) {
            method.getClass();
            this.a = method;
            this.b = method2;
        }

        @Override // defpackage.nd8
        public final String a() {
            return pnb.l(this.a);
        }
    }

    public static final class c extends nd8 {
        public final d4c a;
        public final g5c b;
        public final od8.c c;
        public final o8a d;
        public final hyf e;
        public final String f;

        /* JADX WARN: Removed duplicated region for block: B:25:0x00d7  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public c(defpackage.d4c r3, defpackage.g5c r4, od8.c r5, defpackage.o8a r6, defpackage.hyf r7) {
            /*
                Method dump skipped, instruction units count: 233
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: nd8.c.<init>(d4c, g5c, od8$c, o8a, hyf):void");
        }

        @Override // defpackage.nd8
        public final String a() {
            return this.f;
        }
    }

    public static final class d extends nd8 {
        public final ad8.e a;
        public final ad8.e b;

        public d(ad8.e eVar, ad8.e eVar2) {
            this.a = eVar;
            this.b = eVar2;
        }

        @Override // defpackage.nd8
        public final String a() {
            return this.a.b;
        }
    }

    public abstract String a();
}
