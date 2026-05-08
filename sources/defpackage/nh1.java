package defpackage;

import android.annotation.TargetApi;
import android.graphics.BlendMode;
import android.os.Build;
import app.rive.runtime.kotlin.fonts.Fonts;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(29)
public final class nh1 {
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean a(android.view.ViewGroup r5) {
        /*
            r0 = 0
            r1 = r0
        L2:
            int r2 = r5.getChildCount()
            r3 = 1
            if (r1 >= r2) goto Lb
            r2 = r3
            goto Lc
        Lb:
            r2 = r0
        Lc:
            if (r2 == 0) goto L25
            int r2 = r1 + 1
            android.view.View r1 = r5.getChildAt(r1)
            if (r1 == 0) goto L22
            r4 = 2131362330(0x7f0a021a, float:1.8344438E38)
            java.lang.Object r1 = r1.getTag(r4)
            if (r1 == 0) goto L20
            return r3
        L20:
            r1 = r2
            goto L2
        L22:
            defpackage.k20.o()
        L25:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nh1.a(android.view.ViewGroup):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final BlendMode b(String str) {
        if (str != null && Build.VERSION.SDK_INT >= 29) {
            switch (str.hashCode()) {
                case -2120744511:
                    if (str.equals("luminosity")) {
                        return BlendMode.LUMINOSITY;
                    }
                    l5.q("Invalid mix-blend-mode name: ".concat(str));
                    break;
                case -1427739212:
                    if (str.equals("hard-light")) {
                        return BlendMode.HARD_LIGHT;
                    }
                    l5.q("Invalid mix-blend-mode name: ".concat(str));
                    break;
                case -1338968417:
                    if (str.equals("darken")) {
                        return BlendMode.DARKEN;
                    }
                    l5.q("Invalid mix-blend-mode name: ".concat(str));
                    break;
                case -1247677005:
                    if (str.equals("soft-light")) {
                        return BlendMode.SOFT_LIGHT;
                    }
                    l5.q("Invalid mix-blend-mode name: ".concat(str));
                    break;
                case -1091287984:
                    if (str.equals("overlay")) {
                        return BlendMode.OVERLAY;
                    }
                    l5.q("Invalid mix-blend-mode name: ".concat(str));
                    break;
                case -1039745817:
                    if (str.equals(Fonts.Font.STYLE_NORMAL)) {
                        return null;
                    }
                    l5.q("Invalid mix-blend-mode name: ".concat(str));
                    break;
                case -907689876:
                    if (str.equals("screen")) {
                        return BlendMode.SCREEN;
                    }
                    l5.q("Invalid mix-blend-mode name: ".concat(str));
                    break;
                case -230491182:
                    if (str.equals("saturation")) {
                        return BlendMode.SATURATION;
                    }
                    l5.q("Invalid mix-blend-mode name: ".concat(str));
                    break;
                case -120580883:
                    if (str.equals("color-dodge")) {
                        return BlendMode.COLOR_DODGE;
                    }
                    l5.q("Invalid mix-blend-mode name: ".concat(str));
                    break;
                case 103672:
                    if (str.equals("hue")) {
                        return BlendMode.HUE;
                    }
                    l5.q("Invalid mix-blend-mode name: ".concat(str));
                    break;
                case 94842723:
                    if (str.equals("color")) {
                        return BlendMode.COLOR;
                    }
                    l5.q("Invalid mix-blend-mode name: ".concat(str));
                    break;
                case 170546239:
                    if (str.equals("lighten")) {
                        return BlendMode.LIGHTEN;
                    }
                    l5.q("Invalid mix-blend-mode name: ".concat(str));
                    break;
                case 653829668:
                    if (str.equals("multiply")) {
                        return BlendMode.MULTIPLY;
                    }
                    l5.q("Invalid mix-blend-mode name: ".concat(str));
                    break;
                case 1242982905:
                    if (str.equals("color-burn")) {
                        return BlendMode.COLOR_BURN;
                    }
                    l5.q("Invalid mix-blend-mode name: ".concat(str));
                    break;
                case 1686617550:
                    if (str.equals("exclusion")) {
                        return BlendMode.EXCLUSION;
                    }
                    l5.q("Invalid mix-blend-mode name: ".concat(str));
                    break;
                case 1728361789:
                    if (str.equals("difference")) {
                        return BlendMode.DIFFERENCE;
                    }
                    l5.q("Invalid mix-blend-mode name: ".concat(str));
                    break;
                default:
                    l5.q("Invalid mix-blend-mode name: ".concat(str));
                    break;
            }
        }
        return null;
    }
}
