package com.canhub.cropper;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import com.canhub.cropper.a;
import com.canhub.cropper.g;
import defpackage.c1f;
import defpackage.e13;
import defpackage.g13;
import defpackage.j6g;
import defpackage.lu2;
import defpackage.r6;
import defpackage.r7d;
import defpackage.uh3;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@uh3(c = "com.canhub.cropper.BitmapCroppingWorkerJob$start$1", f = "BitmapCroppingWorkerJob.kt", l = {76, 115}, m = "invokeSuspend")
public final class c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ com.canhub.cropper.a this$0;

    @uh3(c = "com.canhub.cropper.BitmapCroppingWorkerJob$start$1$1", f = "BitmapCroppingWorkerJob.kt", l = {104}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ g.a $bitmapSampled;
        final /* synthetic */ Bitmap $resizedBitmap;
        int label;
        final /* synthetic */ com.canhub.cropper.a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.canhub.cropper.a aVar, Bitmap bitmap, g.a aVar2, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.this$0 = aVar;
            this.$resizedBitmap = bitmap;
            this.$bitmapSampled = aVar2;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.this$0, this.$resizedBitmap, this.$bitmapSampled, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                Rect rect = g.a;
                com.canhub.cropper.a aVar = this.this$0;
                Uri uriR = g.r(aVar.a, this.$resizedBitmap, aVar.f0, aVar.g0, aVar.h0);
                com.canhub.cropper.a aVar2 = this.this$0;
                a.C0119a c0119a = new a.C0119a(this.$resizedBitmap, uriR, null, this.$bitmapSampled.b);
                this.label = 1;
                Object objA = com.canhub.cropper.a.a(aVar2, c0119a, this);
                g13 g13Var = g13.a;
                if (objA == g13Var) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.canhub.cropper.a aVar, lu2<? super c> lu2Var) {
        super(2, lu2Var);
        this.this$0 = aVar;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        c cVar = new c(this.this$0, lu2Var);
        cVar.L$0 = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
        return ((c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b7, code lost:
    
        if (com.canhub.cropper.a.a(r2, r3, r20) != r5) goto L31;
     */
    @Override // defpackage.x81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r1 = r20
            int r0 = r1.label
            r2 = 2
            r3 = 1
            r4 = 0
            g13 r5 = defpackage.g13.a
            if (r0 == 0) goto L22
            if (r0 == r3) goto L1a
            if (r0 != r2) goto L14
            defpackage.r7d.b(r21)
            goto Lba
        L14:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.r6.g(r0)
            return r4
        L1a:
            defpackage.r7d.b(r21)     // Catch: java.lang.Exception -> L1f
            goto La4
        L1f:
            r0 = move-exception
            goto La7
        L22:
            defpackage.r7d.b(r21)
            java.lang.Object r0 = r1.L$0
            e13 r0 = (defpackage.e13) r0
            boolean r6 = defpackage.f13.e(r0)     // Catch: java.lang.Exception -> L1f
            if (r6 == 0) goto Lba
            com.canhub.cropper.a r6 = r1.this$0     // Catch: java.lang.Exception -> L1f
            android.net.Uri r8 = r6.c     // Catch: java.lang.Exception -> L1f
            if (r8 == 0) goto L5c
            android.graphics.Rect r7 = com.canhub.cropper.g.a     // Catch: java.lang.Exception -> L1f
            android.content.Context r7 = r6.a     // Catch: java.lang.Exception -> L1f
            float[] r9 = r6.e     // Catch: java.lang.Exception -> L1f
            int r10 = r6.f     // Catch: java.lang.Exception -> L1f
            int r11 = r6.V     // Catch: java.lang.Exception -> L1f
            int r12 = r6.W     // Catch: java.lang.Exception -> L1f
            boolean r13 = r6.X     // Catch: java.lang.Exception -> L1f
            int r14 = r6.Y     // Catch: java.lang.Exception -> L1f
            int r15 = r6.Z     // Catch: java.lang.Exception -> L1f
            int r3 = r6.a0     // Catch: java.lang.Exception -> L1f
            int r2 = r6.b0     // Catch: java.lang.Exception -> L1f
            boolean r4 = r6.c0     // Catch: java.lang.Exception -> L1f
            boolean r6 = r6.d0     // Catch: java.lang.Exception -> L1f
            r17 = r2
            r16 = r3
            r18 = r4
            r19 = r6
            com.canhub.cropper.g$a r2 = com.canhub.cropper.g.c(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Exception -> L1f
            goto L75
        L5c:
            android.graphics.Bitmap r2 = r6.d     // Catch: java.lang.Exception -> L1f
            if (r2 == 0) goto L94
            android.graphics.Rect r3 = com.canhub.cropper.g.a     // Catch: java.lang.Exception -> L1f
            float[] r7 = r6.e     // Catch: java.lang.Exception -> L1f
            int r8 = r6.f     // Catch: java.lang.Exception -> L1f
            boolean r9 = r6.X     // Catch: java.lang.Exception -> L1f
            int r10 = r6.Y     // Catch: java.lang.Exception -> L1f
            int r11 = r6.Z     // Catch: java.lang.Exception -> L1f
            boolean r12 = r6.c0     // Catch: java.lang.Exception -> L1f
            boolean r13 = r6.d0     // Catch: java.lang.Exception -> L1f
            r6 = r2
            com.canhub.cropper.g$a r2 = com.canhub.cropper.g.e(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> L1f
        L75:
            android.graphics.Bitmap r3 = r2.a     // Catch: java.lang.Exception -> L1f
            com.canhub.cropper.a r4 = r1.this$0     // Catch: java.lang.Exception -> L1f
            int r6 = r4.a0     // Catch: java.lang.Exception -> L1f
            int r7 = r4.b0     // Catch: java.lang.Exception -> L1f
            com.canhub.cropper.CropImageView$j r4 = r4.e0     // Catch: java.lang.Exception -> L1f
            android.graphics.Bitmap r3 = com.canhub.cropper.g.q(r3, r6, r7, r4)     // Catch: java.lang.Exception -> L1f
            eq3 r4 = defpackage.a74.a     // Catch: java.lang.Exception -> L1f
            no3 r4 = defpackage.no3.c     // Catch: java.lang.Exception -> L1f
            com.canhub.cropper.c$a r6 = new com.canhub.cropper.c$a     // Catch: java.lang.Exception -> L1f
            com.canhub.cropper.a r7 = r1.this$0     // Catch: java.lang.Exception -> L1f
            r8 = 0
            r6.<init>(r7, r3, r2, r8)     // Catch: java.lang.Exception -> L1f
            r2 = 2
            defpackage.u63.Y(r0, r4, r8, r6, r2)     // Catch: java.lang.Exception -> L1f
            goto Lba
        L94:
            com.canhub.cropper.a$a r0 = new com.canhub.cropper.a$a     // Catch: java.lang.Exception -> L1f
            r2 = 1
            r8 = 0
            r0.<init>(r8, r8, r8, r2)     // Catch: java.lang.Exception -> L1f
            r1.label = r2     // Catch: java.lang.Exception -> L1f
            java.lang.Object r0 = com.canhub.cropper.a.a(r6, r0, r1)     // Catch: java.lang.Exception -> L1f
            if (r0 != r5) goto La4
            goto Lb9
        La4:
            j6g r0 = defpackage.j6g.a     // Catch: java.lang.Exception -> L1f
            return r0
        La7:
            com.canhub.cropper.a r2 = r1.this$0
            com.canhub.cropper.a$a r3 = new com.canhub.cropper.a$a
            r4 = 1
            r8 = 0
            r3.<init>(r8, r8, r0, r4)
            r4 = 2
            r1.label = r4
            java.lang.Object r0 = com.canhub.cropper.a.a(r2, r3, r1)
            if (r0 != r5) goto Lba
        Lb9:
            return r5
        Lba:
            j6g r0 = defpackage.j6g.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
