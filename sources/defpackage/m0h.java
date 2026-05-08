package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", l = {114, 121}, m = "invokeSuspend")
public final class m0h extends c1f implements Function2<wi5<? super Float>, lu2<? super j6g>, Object> {
    final /* synthetic */ Uri $animationScaleUri;
    final /* synthetic */ Context $applicationContext;
    final /* synthetic */ u12<j6g> $channel;
    final /* synthetic */ n0h $contentObserver;
    final /* synthetic */ ContentResolver $resolver;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0h(ContentResolver contentResolver, Uri uri, n0h n0hVar, u12<j6g> u12Var, Context context, lu2<? super m0h> lu2Var) {
        super(2, lu2Var);
        this.$resolver = contentResolver;
        this.$animationScaleUri = uri;
        this.$contentObserver = n0hVar;
        this.$channel = u12Var;
        this.$applicationContext = context;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        m0h m0hVar = new m0h(this.$resolver, this.$animationScaleUri, this.$contentObserver, this.$channel, this.$applicationContext, lu2Var);
        m0hVar.L$0 = obj;
        return m0hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wi5<? super Float> wi5Var, lu2<? super j6g> lu2Var) {
        return ((m0h) create(wi5Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        if (r4.a(r5, r8) == r3) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #0 {all -> 0x0019, blocks: (B:7:0x0014, B:18:0x0045, B:22:0x0055, B:24:0x005d, B:14:0x002a, B:17:0x003f), top: B:31:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007d -> B:8:0x0017). Please report as a decompilation issue!!! */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.label
            r1 = 2
            r2 = 1
            g13 r3 = defpackage.g13.a
            if (r0 == 0) goto L2e
            if (r0 == r2) goto L22
            if (r0 != r1) goto L1b
            java.lang.Object r0 = r8.L$1
            g22 r0 = (defpackage.g22) r0
            java.lang.Object r4 = r8.L$0
            wi5 r4 = (defpackage.wi5) r4
            defpackage.r7d.b(r9)     // Catch: java.lang.Throwable -> L19
        L17:
            r9 = r4
            goto L45
        L19:
            r9 = move-exception
            goto L8a
        L1b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r8)
            r8 = 0
            return r8
        L22:
            java.lang.Object r0 = r8.L$1
            g22 r0 = (defpackage.g22) r0
            java.lang.Object r4 = r8.L$0
            wi5 r4 = (defpackage.wi5) r4
            defpackage.r7d.b(r9)     // Catch: java.lang.Throwable -> L19
            goto L55
        L2e:
            defpackage.r7d.b(r9)
            java.lang.Object r9 = r8.L$0
            wi5 r9 = (defpackage.wi5) r9
            android.content.ContentResolver r0 = r8.$resolver
            android.net.Uri r4 = r8.$animationScaleUri
            r5 = 0
            n0h r6 = r8.$contentObserver
            r0.registerContentObserver(r4, r5, r6)
            u12<j6g> r0 = r8.$channel     // Catch: java.lang.Throwable -> L19
            g22 r0 = r0.iterator()     // Catch: java.lang.Throwable -> L19
        L45:
            r8.L$0 = r9     // Catch: java.lang.Throwable -> L19
            r8.L$1 = r0     // Catch: java.lang.Throwable -> L19
            r8.label = r2     // Catch: java.lang.Throwable -> L19
            java.lang.Object r4 = r0.b(r8)     // Catch: java.lang.Throwable -> L19
            if (r4 != r3) goto L52
            goto L7f
        L52:
            r7 = r4
            r4 = r9
            r9 = r7
        L55:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L19
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L19
            if (r9 == 0) goto L80
            r0.next()     // Catch: java.lang.Throwable -> L19
            android.content.Context r9 = r8.$applicationContext     // Catch: java.lang.Throwable -> L19
            android.content.ContentResolver r9 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L19
            java.lang.String r5 = "animator_duration_scale"
            r6 = 1065353216(0x3f800000, float:1.0)
            float r9 = android.provider.Settings.Global.getFloat(r9, r5, r6)     // Catch: java.lang.Throwable -> L19
            java.lang.Float r5 = new java.lang.Float     // Catch: java.lang.Throwable -> L19
            r5.<init>(r9)     // Catch: java.lang.Throwable -> L19
            r8.L$0 = r4     // Catch: java.lang.Throwable -> L19
            r8.L$1 = r0     // Catch: java.lang.Throwable -> L19
            r8.label = r1     // Catch: java.lang.Throwable -> L19
            java.lang.Object r9 = r4.a(r5, r8)     // Catch: java.lang.Throwable -> L19
            if (r9 != r3) goto L17
        L7f:
            return r3
        L80:
            android.content.ContentResolver r9 = r8.$resolver
            n0h r8 = r8.$contentObserver
            r9.unregisterContentObserver(r8)
            j6g r8 = defpackage.j6g.a
            return r8
        L8a:
            android.content.ContentResolver r0 = r8.$resolver
            n0h r8 = r8.$contentObserver
            r0.unregisterContentObserver(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m0h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
