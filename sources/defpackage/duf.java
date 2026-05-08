package defpackage;

import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import java.util.Set;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1", f = "InvalidationTracker.kt", l = {DataOkHttpUploader.HTTP_ENTITY_TOO_LARGE, 420}, m = "invokeSuspend")
public final class duf extends c1f implements Function2<drf, lu2<? super Set<? extends Integer>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ztf this$0;

    @uh3(c = "androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1$1", f = "InvalidationTracker.kt", l = {421}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<crf<Set<? extends Integer>>, lu2<? super Set<? extends Integer>>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ztf this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ztf ztfVar, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.this$0 = ztfVar;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.this$0, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(crf<Set<? extends Integer>> crfVar, lu2<? super Set<? extends Integer>> lu2Var) {
            return ((a) create(crfVar, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    r7d.b(obj);
                    return obj;
                }
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            crf crfVar = (crf) this.L$0;
            ztf ztfVar = this.this$0;
            this.label = 1;
            Object objA = ztf.a(ztfVar, crfVar, this);
            g13 g13Var = g13.a;
            return objA == g13Var ? g13Var : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public duf(ztf ztfVar, lu2<? super duf> lu2Var) {
        super(2, lu2Var);
        this.this$0 = ztfVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        duf dufVar = new duf(this.this$0, lu2Var);
        dufVar.L$0 = obj;
        return dufVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drf drfVar, lu2<? super Set<? extends Integer>> lu2Var) {
        return ((duf) create(drfVar, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r7 == r4) goto L19;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.label
            r1 = 0
            r2 = 2
            r3 = 1
            g13 r4 = defpackage.g13.a
            if (r0 == 0) goto L1f
            if (r0 == r3) goto L17
            if (r0 != r2) goto L11
            defpackage.r7d.b(r7)     // Catch: android.database.SQLException -> L52
            goto L4f
        L11:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r6)
            return r1
        L17:
            java.lang.Object r0 = r6.L$0
            drf r0 = (defpackage.drf) r0
            defpackage.r7d.b(r7)
            goto L32
        L1f:
            defpackage.r7d.b(r7)
            java.lang.Object r7 = r6.L$0
            r0 = r7
            drf r0 = (defpackage.drf) r0
            r6.L$0 = r0
            r6.label = r3
            java.lang.Object r7 = r0.c(r6)
            if (r7 != r4) goto L32
            goto L4e
        L32:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L3b
            goto L52
        L3b:
            drf$a r7 = drf.a.b     // Catch: android.database.SQLException -> L52
            duf$a r3 = new duf$a     // Catch: android.database.SQLException -> L52
            ztf r5 = r6.this$0     // Catch: android.database.SQLException -> L52
            r3.<init>(r5, r1)     // Catch: android.database.SQLException -> L52
            r6.L$0 = r1     // Catch: android.database.SQLException -> L52
            r6.label = r2     // Catch: android.database.SQLException -> L52
            java.lang.Object r7 = r0.a(r7, r3, r6)     // Catch: android.database.SQLException -> L52
            if (r7 != r4) goto L4f
        L4e:
            return r4
        L4f:
            java.util.Set r7 = (java.util.Set) r7     // Catch: android.database.SQLException -> L52
            return r7
        L52:
            is4 r6 = defpackage.is4.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
