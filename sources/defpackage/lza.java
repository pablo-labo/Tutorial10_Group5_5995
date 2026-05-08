package defpackage;

import com.indeed.android.messaging.data.events.EventRemoteMediator;
import defpackage.qsg;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class lza<Key, Value> {
    public final Function1<lu2<? super r2b<Key, Value>>, Object> a;
    public final h4 b;
    public final ko2 c = new ko2(0);
    public final ko2 d = new ko2(0);
    public final vi5<l2b<Value>> e;

    public static final class a<Key, Value> {
        public final rza<Key, Value> a;
        public final s2b<Key, Value> b;
        public final qy7 c;

        public a(rza rzaVar, s2b s2bVar, qy7 qy7Var) {
            this.a = rzaVar;
            this.b = s2bVar;
            this.c = qy7Var;
        }
    }

    public final class b<Key, Value> implements bi6 {
        public final rza<Key, Value> a;

        public b(rza rzaVar) {
            this.a = rzaVar;
        }

        @Override // defpackage.bi6
        public final void a(qsg qsgVar) {
            yh6 yh6Var = this.a.g;
            yh6Var.getClass();
            yh6Var.a.a(qsgVar instanceof qsg.a ? (qsg.a) qsgVar : null, new ai6(qsgVar));
        }
    }

    public final class c {
    }

    public lza(Function1 function1, h4 h4Var, EventRemoteMediator eventRemoteMediator) {
        this.a = function1;
        this.b = h4Var;
        this.e = nfe.a(new mza(eventRemoteMediator, this, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.lza r10, defpackage.r2b r11, defpackage.pu2 r12) {
        /*
            r10.getClass()
            boolean r0 = r12 instanceof defpackage.nza
            if (r0 == 0) goto L16
            r0 = r12
            nza r0 = (defpackage.nza) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.label = r1
            goto L1b
        L16:
            nza r0 = new nza
            r0.<init>(r10, r12)
        L1b:
            java.lang.Object r12 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L39
            if (r1 != r3) goto L33
            java.lang.Object r10 = r0.L$1
            r11 = r10
            r2b r11 = (defpackage.r2b) r11
            java.lang.Object r10 = r0.L$0
            lza r10 = (defpackage.lza) r10
            defpackage.r7d.b(r12)
        L31:
            r5 = r10
            goto L4d
        L33:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r10)
            return r2
        L39:
            defpackage.r7d.b(r12)
            kotlin.jvm.functions.Function1<lu2<? super r2b<Key, Value>>, java.lang.Object> r12 = r10.a
            r0.L$0 = r10
            r0.L$1 = r11
            r0.label = r3
            java.lang.Object r12 = r12.invoke(r0)
            g13 r0 = defpackage.g13.a
            if (r12 != r0) goto L31
            return r0
        L4d:
            r2b r12 = (defpackage.r2b) r12
            boolean r10 = r12 instanceof defpackage.kd2
            if (r10 == 0) goto L5b
            r10 = r12
            kd2 r10 = (defpackage.kd2) r10
            h4 r0 = r5.b
            r10.a()
        L5b:
            if (r12 == r11) goto L9f
            oza r3 = new oza
            java.lang.String r8 = "invalidate()V"
            r9 = 0
            r4 = 0
            java.lang.Class<lza> r6 = defpackage.lza.class
            java.lang.String r7 = "invalidate"
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r12.registerInvalidatedCallback(r3)
            if (r11 == 0) goto L7f
            pza r3 = new pza
            java.lang.String r8 = "invalidate()V"
            r9 = 0
            r4 = 0
            java.lang.Class<lza> r6 = defpackage.lza.class
            java.lang.String r7 = "invalidate"
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r11.unregisterInvalidatedCallback(r3)
        L7f:
            if (r11 == 0) goto L84
            r11.invalidate()
        L84:
            r10 = 3
            java.lang.String r11 = "Paging"
            boolean r10 = android.util.Log.isLoggable(r11, r10)
            if (r10 == 0) goto L9e
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Generated new PagingSource "
            r10.<init>(r0)
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            android.util.Log.d(r11, r10, r2)
        L9e:
            return r12
        L9f:
            java.lang.String r10 = "An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource."
            defpackage.r6.g(r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lza.a(lza, r2b, pu2):java.lang.Object");
    }
}
