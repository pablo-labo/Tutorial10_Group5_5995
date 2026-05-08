package defpackage;

import android.view.OrientationEventListener;
import expo.modules.video.FullscreenPlayerActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class bu5 extends OrientationEventListener {
    public final /* synthetic */ cu5 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu5(cu5 cu5Var, FullscreenPlayerActivity fullscreenPlayerActivity) {
        super(fullscreenPlayerActivity, 3);
        this.a = cu5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
    @Override // android.view.OrientationEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onOrientationChanged(int r8) {
        /*
            r7 = this;
            cu5 r7 = r7.a
            boolean r0 = r7.g
            boolean r1 = r7.f
            r2 = 2
            r3 = 0
            r4 = 1
            if (r8 < 0) goto Lf
            r5 = 10
            if (r8 <= r5) goto L17
        Lf:
            r5 = 350(0x15e, float:4.9E-43)
            if (r8 < r5) goto L19
            r5 = 360(0x168, float:5.04E-43)
            if (r8 >= r5) goto L19
        L17:
            r8 = r4
            goto L36
        L19:
            r5 = 80
            if (r8 < r5) goto L23
            r5 = 100
            if (r8 > r5) goto L23
        L21:
            r8 = r2
            goto L36
        L23:
            r5 = 170(0xaa, float:2.38E-43)
            if (r8 < r5) goto L2c
            r5 = 190(0xbe, float:2.66E-43)
            if (r8 > r5) goto L2c
            goto L17
        L2c:
            r5 = 260(0x104, float:3.64E-43)
            if (r8 < r5) goto L35
            r5 = 280(0x118, float:3.92E-43)
            if (r8 > r5) goto L35
            goto L21
        L35:
            r8 = r3
        L36:
            expo.modules.video.records.FullscreenOptions r5 = r7.b
            boolean r5 = r5.getAutoExitOnRotate()
            if (r5 != 0) goto L3f
            goto L8c
        L3f:
            if (r8 != r4) goto L49
            if (r1 == 0) goto L49
            boolean r5 = r7.e
            if (r5 == 0) goto L49
            r5 = r4
            goto L4a
        L49:
            r5 = r3
        L4a:
            if (r8 != r2) goto L53
            if (r0 == 0) goto L53
            boolean r6 = r7.e
            if (r6 == 0) goto L53
            goto L55
        L53:
            if (r5 == 0) goto L73
        L55:
            expo.modules.video.FullscreenPlayerActivity r5 = r7.a     // Catch: java.lang.Exception -> L8c
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.Exception -> L8c
            java.lang.String r6 = "accelerometer_rotation"
            int r5 = android.provider.Settings.System.getInt(r5, r6, r3)     // Catch: java.lang.Exception -> L8c
            if (r5 != r4) goto L8c
            qq r5 = r7.d
            r5.invoke()
            d2f r5 = r7.h
            java.lang.Object r5 = r5.getValue()
            bu5 r5 = (defpackage.bu5) r5
            r5.disable()
        L73:
            if (r8 != r4) goto L7d
            if (r0 == 0) goto L7d
            boolean r0 = r7.e
            if (r0 != 0) goto L7d
            r0 = r4
            goto L7e
        L7d:
            r0 = r3
        L7e:
            if (r8 != r2) goto L87
            if (r1 == 0) goto L87
            boolean r8 = r7.e
            if (r8 != 0) goto L87
            r3 = r4
        L87:
            if (r0 != 0) goto L8d
            if (r3 == 0) goto L8c
            goto L8d
        L8c:
            return
        L8d:
            r7.e = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bu5.onOrientationChanged(int):void");
    }
}
