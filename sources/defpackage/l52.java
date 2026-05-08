package defpackage;

import expo.modules.kotlin.sharedobjects.SharedObject;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class l52<SharedObjectType> extends ina {
    public final String k;
    public final yd8<SharedObjectType> l;
    public final rf0 m;
    public a2f n;
    public final ArrayList o;

    public /* synthetic */ class a extends qv5 implements Function2<SharedObject, String, j6g> {
        public static final a a = new a(2, SharedObject.class, "onStartListeningToEvent", "onStartListeningToEvent(Ljava/lang/String;)V", 0);

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(SharedObject sharedObject, String str) {
            sharedObject.getClass();
            str.getClass();
            return j6g.a;
        }
    }

    public /* synthetic */ class b extends qv5 implements Function2<SharedObject, String, j6g> {
        public static final b a = new b(2, SharedObject.class, "onStopListeningToEvent", "onStopListeningToEvent(Ljava/lang/String;)V", 0);

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(SharedObject sharedObject, String str) {
            sharedObject.getClass();
            str.getClass();
            return j6g.a;
        }
    }

    public static final class c implements gu5<zf8> {
        public static final c a = new c();

        @Override // defpackage.gu5
        public final zf8 invoke() {
            return fwc.d(String.class);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l52(gk0 gk0Var, String str, yd8<SharedObjectType> yd8Var, rf0 rf0Var, pwf pwfVar) {
        super(pwfVar);
        yd8Var.getClass();
        this.k = str;
        this.l = yd8Var;
        this.m = rf0Var;
        this.o = new ArrayList();
    }

    public final c4c<SharedObjectType> i(String str) {
        c4c<SharedObjectType> c4cVar = new c4c<>(this.m.a, str);
        this.h.put(str, c4cVar);
        return c4cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.s52 j() {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l52.j():s52");
    }

    public final rf0 k() {
        return this.m;
    }

    public final void l(a2f a2fVar) {
        this.n = a2fVar;
    }
}
