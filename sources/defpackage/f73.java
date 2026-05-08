package defpackage;

import expo.modules.imagepicker.CropShape;

/* JADX INFO: loaded from: classes3.dex */
public final class f73 implements ik0<h73, c27> {
    public final sx9 a;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CropShape.values().length];
            try {
                iArr[CropShape.RECTANGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CropShape.OVAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public f73(sx9 sx9Var) {
        sx9Var.getClass();
        this.a = sx9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    @Override // defpackage.ik0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.Intent a(defpackage.wi0 r54, java.io.Serializable r55) throws expo.modules.core.errors.ModuleNotFoundException {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f73.a(wi0, java.io.Serializable):android.content.Intent");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    @Override // defpackage.ik0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.c27 b(java.io.Serializable r5, int r6, android.content.Intent r7) throws java.lang.Throwable {
        /*
            r4 = this;
            h73 r5 = (defpackage.h73) r5
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            java.lang.String r2 = "CROP_IMAGE_EXTRA_RESULT"
            r3 = 0
            if (r0 < r1) goto L18
            if (r7 == 0) goto L16
            java.lang.Class<com.canhub.cropper.CropImage$ActivityResult> r0 = com.canhub.cropper.CropImage$ActivityResult.class
            java.lang.Object r7 = r7.getParcelableExtra(r2, r0)
            com.canhub.cropper.CropImage$ActivityResult r7 = (com.canhub.cropper.CropImage$ActivityResult) r7
            goto L20
        L16:
            r7 = r3
            goto L20
        L18:
            if (r7 == 0) goto L16
            android.os.Parcelable r7 = r7.getParcelableExtra(r2)
            com.canhub.cropper.CropImage$ActivityResult r7 = (com.canhub.cropper.CropImage$ActivityResult) r7
        L20:
            if (r6 == 0) goto L5e
            if (r7 != 0) goto L25
            goto L5e
        L25:
            android.net.Uri r6 = r7.b
            if (r6 == 0) goto L58
            sx9 r4 = r4.a
            gk0 r4 = r4.b()
            com.facebook.react.bridge.ReactApplicationContext r4 = r4.d()
            if (r4 == 0) goto L52
            android.content.ContentResolver r4 = r4.getContentResolver()
            g73 r7 = new g73
            r7.<init>(r5, r6, r4, r3)
            defpackage.u63.j0(r7)
            c27$c r4 = new c27$c
            expo.modules.imagepicker.MediaType r5 = expo.modules.imagepicker.MediaType.IMAGE
            kotlin.Pair r7 = new kotlin.Pair
            r7.<init>(r5, r6)
            java.util.List r5 = defpackage.u63.Z(r7)
            r4.<init>(r5)
            return r4
        L52:
            java.lang.String r4 = "React Application Context is null"
            defpackage.l5.q(r4)
            return r3
        L58:
            java.lang.String r4 = "Required value was null."
            defpackage.l5.q(r4)
            return r3
        L5e:
            c27$a r4 = c27.a.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f73.b(java.io.Serializable, int, android.content.Intent):java.lang.Object");
    }
}
