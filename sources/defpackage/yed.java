package defpackage;

import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "androidx.room.RoomDatabase$performClear$1", f = "RoomDatabase.android.kt", l = {DataOkHttpUploader.HTTP_BAD_GATEWAY}, m = "invokeSuspend")
public final class yed extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    final /* synthetic */ boolean $hasForeignKeys;
    final /* synthetic */ String[] $tableNames;
    int label;
    final /* synthetic */ xed this$0;

    @uh3(c = "androidx.room.RoomDatabase$performClear$1$1", f = "RoomDatabase.android.kt", l = {DataOkHttpUploader.HTTP_UNAVAILABLE, DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT, 506, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, 513, 514}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<drf, lu2<? super j6g>, Object> {
        final /* synthetic */ boolean $hasForeignKeys;
        final /* synthetic */ String[] $tableNames;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ xed this$0;

        /* JADX INFO: renamed from: yed$a$a, reason: collision with other inner class name */
        @uh3(c = "androidx.room.RoomDatabase$performClear$1$1$1", f = "RoomDatabase.android.kt", l = {508, 510}, m = "invokeSuspend")
        public static final class C0482a extends c1f implements Function2<crf<j6g>, lu2<? super j6g>, Object> {
            final /* synthetic */ boolean $hasForeignKeys;
            final /* synthetic */ String[] $tableNames;
            int I$0;
            int I$1;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0482a(boolean z, String[] strArr, lu2<? super C0482a> lu2Var) {
                super(2, lu2Var);
                this.$hasForeignKeys = z;
                this.$tableNames = strArr;
            }

            @Override // defpackage.x81
            public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
                C0482a c0482a = new C0482a(this.$hasForeignKeys, this.$tableNames, lu2Var);
                c0482a.L$0 = obj;
                return c0482a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(crf<j6g> crfVar, lu2<? super j6g> lu2Var) {
                return ((C0482a) create(crfVar, lu2Var)).invokeSuspend(j6g.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
            
                if (defpackage.erf.a(r0, "PRAGMA defer_foreign_keys = TRUE", r9) == r3) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
            
                if (defpackage.erf.a(r6, r10, r9) == r3) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
            
                return r3;
             */
            /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0066 -> B:20:0x0069). Please report as a decompilation issue!!! */
            @Override // defpackage.x81
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    int r0 = r9.label
                    r1 = 2
                    r2 = 1
                    g13 r3 = defpackage.g13.a
                    if (r0 == 0) goto L2b
                    if (r0 == r2) goto L23
                    if (r0 != r1) goto L1c
                    int r0 = r9.I$1
                    int r4 = r9.I$0
                    java.lang.Object r5 = r9.L$1
                    java.lang.String[] r5 = (java.lang.String[]) r5
                    java.lang.Object r6 = r9.L$0
                    crf r6 = (defpackage.crf) r6
                    defpackage.r7d.b(r10)
                    goto L69
                L1c:
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.r6.g(r9)
                    r9 = 0
                    return r9
                L23:
                    java.lang.Object r0 = r9.L$0
                    crf r0 = (defpackage.crf) r0
                    defpackage.r7d.b(r10)
                    goto L44
                L2b:
                    defpackage.r7d.b(r10)
                    java.lang.Object r10 = r9.L$0
                    r0 = r10
                    crf r0 = (defpackage.crf) r0
                    boolean r10 = r9.$hasForeignKeys
                    if (r10 == 0) goto L44
                    r9.L$0 = r0
                    r9.label = r2
                    java.lang.String r10 = "PRAGMA defer_foreign_keys = TRUE"
                    java.lang.Object r10 = defpackage.erf.a(r0, r10, r9)
                    if (r10 != r3) goto L44
                    goto L68
                L44:
                    java.lang.String[] r10 = r9.$tableNames
                    int r4 = r10.length
                    r5 = 0
                    r6 = r0
                    r0 = r4
                    r4 = r5
                    r5 = r10
                L4c:
                    if (r4 >= r0) goto L6b
                    r10 = r5[r4]
                    java.lang.String r7 = "DELETE FROM `"
                    r8 = 96
                    java.lang.String r10 = defpackage.ja.f(r8, r7, r10)
                    r9.L$0 = r6
                    r9.L$1 = r5
                    r9.I$0 = r4
                    r9.I$1 = r0
                    r9.label = r1
                    java.lang.Object r10 = defpackage.erf.a(r6, r10, r9)
                    if (r10 != r3) goto L69
                L68:
                    return r3
                L69:
                    int r4 = r4 + r2
                    goto L4c
                L6b:
                    j6g r9 = defpackage.j6g.a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: yed.a.C0482a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xed xedVar, boolean z, String[] strArr, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.this$0 = xedVar;
            this.$hasForeignKeys = z;
            this.$tableNames = strArr;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            a aVar = new a(this.this$0, this.$hasForeignKeys, this.$tableNames, lu2Var);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(drf drfVar, lu2<? super j6g> lu2Var) {
            return ((a) create(drfVar, lu2Var)).invokeSuspend(j6g.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x00b1, code lost:
        
            if (defpackage.erf.a(r0, "VACUUM", r6) != r2) goto L35;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006d A[PHI: r0
  0x006d: PHI (r0v7 drf) = (r0v4 drf), (r0v4 drf), (r0v9 drf) binds: [B:17:0x0059, B:19:0x006a, B:10:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0084 A[PHI: r0
  0x0084: PHI (r0v10 drf) = (r0v7 drf), (r0v12 drf) binds: [B:22:0x0081, B:9:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0090 A[PHI: r0 r7
  0x0090: PHI (r0v13 drf) = (r0v10 drf), (r0v15 drf) binds: [B:25:0x008d, B:8:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0090: PHI (r7v14 java.lang.Object) = (r7v13 java.lang.Object), (r7v0 java.lang.Object) binds: [B:25:0x008d, B:8:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
        @Override // defpackage.x81
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instruction units count: 216
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: yed.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yed(xed xedVar, boolean z, String[] strArr, lu2<? super yed> lu2Var) {
        super(2, lu2Var);
        this.this$0 = xedVar;
        this.$hasForeignKeys = z;
        this.$tableNames = strArr;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new yed(this.this$0, this.$hasForeignKeys, this.$tableNames, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((yed) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            r7d.b(obj);
            xed xedVar = this.this$0;
            ved vedVar = xedVar.e;
            if (vedVar == null) {
                wl7.g("connectionManager");
                throw null;
            }
            a aVar = new a(xedVar, this.$hasForeignKeys, this.$tableNames, null);
            this.label = 1;
            Object objF0 = vedVar.f.F0(false, aVar, this);
            g13 g13Var = g13.a;
            if (objF0 == g13Var) {
                return g13Var;
            }
        } else {
            if (i != 1) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
        }
        return j6g.a;
    }
}
