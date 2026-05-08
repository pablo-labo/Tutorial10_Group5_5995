package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bc4 {
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        if (defpackage.wj3.b(r0.getWidth(), r0.getHeight(), (int) (r4 >> 32), (int) (r4 & 4294967295L), r11) == 1.0d) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap a(android.graphics.drawable.Drawable r8, android.graphics.Bitmap.Config r9, defpackage.iie r10, defpackage.umd r11, boolean r12) {
        /*
            boolean r0 = r8 instanceof android.graphics.drawable.BitmapDrawable
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r3 = 32
            if (r0 == 0) goto L4c
            r0 = r8
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            android.graphics.Bitmap$Config r4 = r0.getConfig()
            if (r9 == 0) goto L1f
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.HARDWARE
            if (r9 != r5) goto L1d
            goto L1f
        L1d:
            r5 = r9
            goto L21
        L1f:
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
        L21:
            if (r4 != r5) goto L4c
            if (r12 == 0) goto L26
            goto L4b
        L26:
            int r12 = r0.getWidth()
            int r4 = r0.getHeight()
            iie r5 = defpackage.iie.c
            long r4 = defpackage.wj3.a(r12, r4, r10, r11, r5)
            long r6 = r4 >> r3
            int r12 = (int) r6
            long r4 = r4 & r1
            int r4 = (int) r4
            int r5 = r0.getWidth()
            int r6 = r0.getHeight()
            double r4 = defpackage.wj3.b(r5, r6, r12, r4, r11)
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r12 != 0) goto L4c
        L4b:
            return r0
        L4c:
            android.graphics.drawable.Drawable r8 = r8.mutate()
            int r12 = defpackage.ukg.b(r8)
            r0 = 512(0x200, float:7.175E-43)
            if (r12 <= 0) goto L59
            goto L5a
        L59:
            r12 = r0
        L5a:
            int r4 = defpackage.ukg.a(r8)
            if (r4 <= 0) goto L61
            r0 = r4
        L61:
            iie r4 = defpackage.iie.c
            long r4 = defpackage.wj3.a(r12, r0, r10, r11, r4)
            long r6 = r4 >> r3
            int r10 = (int) r6
            long r1 = r1 & r4
            int r1 = (int) r1
            double r10 = defpackage.wj3.b(r12, r0, r10, r1, r11)
            double r1 = (double) r12
            double r1 = r1 * r10
            int r12 = defpackage.gf9.a(r1)
            double r0 = (double) r0
            double r10 = r10 * r0
            int r10 = defpackage.gf9.a(r10)
            if (r9 == 0) goto L82
            android.graphics.Bitmap$Config r11 = android.graphics.Bitmap.Config.HARDWARE
            if (r9 != r11) goto L84
        L82:
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888
        L84:
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r12, r10, r9)
            android.graphics.Rect r11 = r8.getBounds()
            int r0 = r11.left
            int r1 = r11.top
            int r2 = r11.right
            int r11 = r11.bottom
            r3 = 0
            r8.setBounds(r3, r3, r12, r10)
            android.graphics.Canvas r10 = new android.graphics.Canvas
            r10.<init>(r9)
            r8.draw(r10)
            r8.setBounds(r0, r1, r2, r11)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bc4.a(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, iie, umd, boolean):android.graphics.Bitmap");
    }
}
