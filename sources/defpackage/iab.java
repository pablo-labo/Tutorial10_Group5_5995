package defpackage;

import android.graphics.Rect;
import android.util.Rational;
import android.view.View;
import androidx.media3.ui.PlayerView;
import expo.modules.video.enums.ContentFit;

/* JADX INFO: loaded from: classes3.dex */
public final class iab {
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(android.app.Activity r5, boolean r6, android.util.Rational r7) {
        /*
            r5.getClass()
            r0 = 0
            if (r7 == 0) goto L1e
            float r1 = r7.floatValue()
            double r1 = (double) r1
            r3 = 4601209024398258277(0x3fdac73abc947065, double:0.41841)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 > 0) goto L1e
            r3 = 4612564220354725151(0x40031eb851eb851f, double:2.39)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L1e
            goto L1f
        L1e:
            r7 = r0
        L1f:
            expo.modules.video.VideoView$a r0 = expo.modules.video.VideoView.INSTANCE
            r0.getClass()
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            java.lang.String r1 = "android.software.picture_in_picture"
            boolean r0 = r0.hasSystemFeature(r1)
            if (r0 == 0) goto L54
            android.app.PictureInPictureParams$Builder r0 = new android.app.PictureInPictureParams$Builder
            r0.<init>()
            if (r7 == 0) goto L3a
            r0.setAspectRatio(r7)
        L3a:
            int r7 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r7 < r1) goto L43
            r0.setAutoEnterEnabled(r6)
        L43:
            android.app.PictureInPictureParams r6 = r0.build()     // Catch: java.lang.IllegalStateException -> L4d
            r5.setPictureInPictureParams(r6)     // Catch: java.lang.IllegalStateException -> L4d
            j6g r5 = defpackage.j6g.a     // Catch: java.lang.IllegalStateException -> L4d
            return
        L4d:
            java.lang.String r5 = "ExpoVideo"
            java.lang.String r6 = "Current activity does not support picture-in-picture. Make sure you have configured the `expo-video` config plugin correctly."
            android.util.Log.e(r5, r6)
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iab.a(android.app.Activity, boolean, android.util.Rational):void");
    }

    public static final Rational b(tog togVar, int i, int i2, ContentFit contentFit) {
        togVar.getClass();
        contentFit.getClass();
        Rational rational = contentFit == ContentFit.CONTAIN ? new Rational(togVar.a, togVar.b) : new Rational(i, i2);
        Rational rational2 = new Rational(239, 100);
        Rational rational3 = new Rational(100, 239);
        return rational.floatValue() > rational2.floatValue() ? rational2 : rational.floatValue() < rational3.floatValue() ? rational3 : rational;
    }

    public static final Rect c(PlayerView playerView) {
        playerView.getClass();
        Rect rect = new Rect();
        View videoSurfaceView = playerView.getVideoSurfaceView();
        if (videoSurfaceView != null) {
            videoSurfaceView.getGlobalVisibleRect(rect);
        }
        int[] iArr = new int[2];
        View videoSurfaceView2 = playerView.getVideoSurfaceView();
        if (videoSurfaceView2 != null) {
            videoSurfaceView2.getLocationOnScreen(iArr);
        }
        int i = rect.bottom - rect.top;
        int i2 = iArr[1];
        rect.top = i2;
        rect.bottom = i2 + i;
        return rect;
    }
}
