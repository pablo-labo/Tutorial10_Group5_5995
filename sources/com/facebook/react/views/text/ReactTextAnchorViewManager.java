package com.facebook.react.views.text;

import android.content.Context;
import com.facebook.react.uimanager.BaseViewManager;
import defpackage.cj1;
import defpackage.o49;
import defpackage.opc;
import defpackage.ou8;
import defpackage.pq3;
import defpackage.pu8;
import defpackage.rjc;
import defpackage.snc;
import defpackage.tnc;
import defpackage.v71;
import defpackage.zi1;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b,\b'\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0019\u0010\fJ\u001f\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001bH\u0001¢\u0006\u0004\b!\u0010\u001eJ!\u0010%\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\u0013H\u0001¢\u0006\u0004\b$\u0010\u0016J\u001f\u0010(\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\bH\u0001¢\u0006\u0004\b'\u0010\fJ!\u0010,\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0001¢\u0006\u0004\b*\u0010+J!\u0010/\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010-\u001a\u0004\u0018\u00010\u0013H\u0001¢\u0006\u0004\b.\u0010\u0016J'\u00104\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\u001bH\u0001¢\u0006\u0004\b2\u00103J!\u00107\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\b\u00105\u001a\u0004\u0018\u00010\u0013H\u0001¢\u0006\u0004\b6\u0010\u0016J'\u0010:\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\u001bH\u0001¢\u0006\u0004\b9\u00103J)\u0010=\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u000e2\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0001¢\u0006\u0004\b;\u0010<J\u001f\u0010@\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\bH\u0001¢\u0006\u0004\b?\u0010\fJ\u001f\u0010C\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\bH\u0001¢\u0006\u0004\bB\u0010\fJ!\u0010F\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010D\u001a\u0004\u0018\u00010\u0013H\u0001¢\u0006\u0004\bE\u0010\u0016¨\u0006G"}, d2 = {"Lcom/facebook/react/views/text/ReactTextAnchorViewManager;", "Lrjc;", "C", "Lcom/facebook/react/uimanager/BaseViewManager;", "Lopc;", "<init>", "()V", "view", "", "accessible", "Lj6g;", "setAccessible$ReactAndroid_release", "(Lopc;Z)V", "setAccessible", "", "numberOfLines", "setNumberOfLines$ReactAndroid_release", "(Lopc;I)V", "setNumberOfLines", "", "ellipsizeMode", "setEllipsizeMode$ReactAndroid_release", "(Lopc;Ljava/lang/String;)V", "setEllipsizeMode", "adjustsFontSizeToFit", "setAdjustFontSizeToFit$ReactAndroid_release", "setAdjustFontSizeToFit", "", "fontSize", "setFontSize$ReactAndroid_release", "(Lopc;F)V", "setFontSize", "letterSpacing", "setLetterSpacing$ReactAndroid_release", "setLetterSpacing", "textAlignVertical", "setTextAlignVertical$ReactAndroid_release", "setTextAlignVertical", "isSelectable", "setSelectable$ReactAndroid_release", "setSelectable", "color", "setSelectionColor$ReactAndroid_release", "(Lopc;Ljava/lang/Integer;)V", "setSelectionColor", "frequency", "setAndroidHyphenationFrequency$ReactAndroid_release", "setAndroidHyphenationFrequency", "index", "borderRadius", "setBorderRadius$ReactAndroid_release", "(Lopc;IF)V", "setBorderRadius", "borderStyle", "setBorderStyle$ReactAndroid_release", "setBorderStyle", "width", "setBorderWidth$ReactAndroid_release", "setBorderWidth", "setBorderColor$ReactAndroid_release", "(Lopc;ILjava/lang/Integer;)V", "setBorderColor", "includepad", "setIncludeFontPadding$ReactAndroid_release", "setIncludeFontPadding", "disabled", "setDisabled$ReactAndroid_release", "setDisabled", "type", "setDataDetectorType$ReactAndroid_release", "setDataDetectorType", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ReactTextAnchorViewManager<C extends rjc> extends BaseViewManager<opc, C> {
    @snc(name = "accessible")
    public final void setAccessible$ReactAndroid_release(opc view, boolean accessible) {
        view.getClass();
        view.setFocusable(accessible);
    }

    @snc(name = "adjustsFontSizeToFit")
    public final void setAdjustFontSizeToFit$ReactAndroid_release(opc view, boolean adjustsFontSizeToFit) {
        view.getClass();
        view.setAdjustFontSizeToFit(adjustsFontSizeToFit);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if (r4.equals("none") == false) goto L21;
     */
    @defpackage.snc(name = "android_hyphenationFrequency")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setAndroidHyphenationFrequency$ReactAndroid_release(defpackage.opc r3, java.lang.String r4) {
        /*
            r2 = this;
            r3.getClass()
            r2 = 0
            if (r4 == 0) goto L4d
            int r0 = r4.hashCode()
            r1 = -1039745817(0xffffffffc206bce7, float:-33.684475)
            if (r0 == r1) goto L31
            r1 = 3154575(0x30228f, float:4.420501E-39)
            if (r0 == r1) goto L23
            r1 = 3387192(0x33af38, float:4.746467E-39)
            if (r0 == r1) goto L1a
            goto L39
        L1a:
            java.lang.String r0 = "none"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L4d
            goto L39
        L23:
            java.lang.String r0 = "full"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L2c
            goto L39
        L2c:
            r2 = 2
            r3.setHyphenationFrequency(r2)
            return
        L31:
            java.lang.String r0 = "normal"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L48
        L39:
            java.lang.String r0 = "Invalid android_hyphenationFrequency: "
            java.lang.String r4 = r0.concat(r4)
            java.lang.String r0 = "ReactNative"
            defpackage.s55.n(r0, r4)
            r3.setHyphenationFrequency(r2)
            return
        L48:
            r2 = 1
            r3.setHyphenationFrequency(r2)
            return
        L4d:
            r3.setHyphenationFrequency(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.ReactTextAnchorViewManager.setAndroidHyphenationFrequency$ReactAndroid_release(opc, java.lang.String):void");
    }

    @tnc(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public final void setBorderColor$ReactAndroid_release(opc view, int index, Integer color) {
        view.getClass();
        v71.l(view, o49.values()[index], color);
    }

    @tnc(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public final void setBorderRadius$ReactAndroid_release(opc view, int index, float borderRadius) {
        view.getClass();
        v71.m(view, zi1.values()[index], Float.isNaN(borderRadius) ? null : new ou8(borderRadius, pu8.a));
    }

    @snc(name = "borderStyle")
    public final void setBorderStyle$ReactAndroid_release(opc view, String borderStyle) {
        cj1 cj1VarA;
        view.getClass();
        if (borderStyle == null) {
            cj1VarA = null;
        } else {
            cj1.a.getClass();
            cj1VarA = cj1.a.a(borderStyle);
        }
        v71.n(view, cj1VarA);
    }

    @tnc(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth", "borderStartWidth", "borderEndWidth"})
    public final void setBorderWidth$ReactAndroid_release(opc view, int index, float width) {
        view.getClass();
        v71.o(view, o49.values()[index], Float.valueOf(width));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @snc(name = "dataDetectorType")
    public final void setDataDetectorType$ReactAndroid_release(opc view, String type) {
        view.getClass();
        if (type != null) {
            switch (type.hashCode()) {
                case -1192969641:
                    if (type.equals("phoneNumber")) {
                        view.setLinkifyMask(4);
                        return;
                    }
                    break;
                case 96673:
                    if (type.equals("all")) {
                        view.setLinkifyMask(15);
                        return;
                    }
                    break;
                case 3321850:
                    if (type.equals("link")) {
                        view.setLinkifyMask(1);
                        return;
                    }
                    break;
                case 96619420:
                    if (type.equals("email")) {
                        view.setLinkifyMask(2);
                        return;
                    }
                    break;
            }
        }
        view.setLinkifyMask(0);
    }

    @snc(defaultBoolean = false, name = "disabled")
    public final void setDisabled$ReactAndroid_release(opc view, boolean disabled) {
        view.getClass();
        view.setEnabled(!disabled);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (r2.equals("tail") == false) goto L22;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @defpackage.snc(name = "ellipsizeMode")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setEllipsizeMode$ReactAndroid_release(defpackage.opc r1, java.lang.String r2) {
        /*
            r0 = this;
            r1.getClass()
            if (r2 == 0) goto L52
            int r0 = r2.hashCode()
            switch(r0) {
                case -1074341483: goto L33;
                case 3056464: goto L25;
                case 3198432: goto L16;
                case 3552336: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L3b
        Ld:
            java.lang.String r0 = "tail"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L52
            goto L3b
        L16:
            java.lang.String r0 = "head"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L1f
            goto L3b
        L1f:
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.START
            r1.setEllipsizeLocation(r0)
            return
        L25:
            java.lang.String r0 = "clip"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L2e
            goto L3b
        L2e:
            r0 = 0
            r1.setEllipsizeLocation(r0)
            return
        L33:
            java.lang.String r0 = "middle"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L4c
        L3b:
            java.lang.String r0 = "Invalid ellipsizeMode: "
            java.lang.String r0 = r0.concat(r2)
            java.lang.String r2 = "ReactNative"
            defpackage.s55.n(r2, r0)
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r1.setEllipsizeLocation(r0)
            return
        L4c:
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.MIDDLE
            r1.setEllipsizeLocation(r0)
            return
        L52:
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r1.setEllipsizeLocation(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.ReactTextAnchorViewManager.setEllipsizeMode$ReactAndroid_release(opc, java.lang.String):void");
    }

    @snc(name = "fontSize")
    public final void setFontSize$ReactAndroid_release(opc view, float fontSize) {
        view.getClass();
        view.setFontSize(fontSize);
    }

    @snc(defaultBoolean = true, name = "includeFontPadding")
    public final void setIncludeFontPadding$ReactAndroid_release(opc view, boolean includepad) {
        view.getClass();
        view.setIncludeFontPadding(includepad);
    }

    @snc(defaultFloat = 0.0f, name = "letterSpacing")
    public final void setLetterSpacing$ReactAndroid_release(opc view, float letterSpacing) {
        view.getClass();
        view.setLetterSpacing(letterSpacing);
    }

    @snc(defaultInt = Integer.MAX_VALUE, name = "numberOfLines")
    public final void setNumberOfLines$ReactAndroid_release(opc view, int numberOfLines) {
        view.getClass();
        view.setNumberOfLines(numberOfLines);
    }

    @snc(name = "selectable")
    public final void setSelectable$ReactAndroid_release(opc view, boolean isSelectable) {
        view.getClass();
        view.setTextIsSelectable(isSelectable);
    }

    @snc(customType = "Color", name = "selectionColor")
    public final void setSelectionColor$ReactAndroid_release(opc view, Integer color) {
        int iA;
        view.getClass();
        if (color != null) {
            iA = color.intValue();
        } else {
            Context context = view.getContext();
            context.getClass();
            iA = pq3.a(context);
        }
        view.setHighlightColor(iA);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
    
        if (r3.equals("auto") == false) goto L22;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @defpackage.snc(name = "textAlignVertical")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setTextAlignVertical$ReactAndroid_release(defpackage.opc r2, java.lang.String r3) {
        /*
            r1 = this;
            r2.getClass()
            r1 = 0
            if (r3 == 0) goto L52
            int r0 = r3.hashCode()
            switch(r0) {
                case -1383228885: goto L35;
                case -1364013995: goto L26;
                case 115029: goto L17;
                case 3005871: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L3d
        Le:
            java.lang.String r0 = "auto"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L52
            goto L3d
        L17:
            java.lang.String r0 = "top"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L20
            goto L3d
        L20:
            r1 = 48
            r2.setGravityVertical(r1)
            return
        L26:
            java.lang.String r0 = "center"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L2f
            goto L3d
        L2f:
            r1 = 16
            r2.setGravityVertical(r1)
            return
        L35:
            java.lang.String r0 = "bottom"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L4c
        L3d:
            java.lang.String r0 = "Invalid textAlignVertical: "
            java.lang.String r3 = r0.concat(r3)
            java.lang.String r0 = "ReactNative"
            defpackage.s55.n(r0, r3)
            r2.setGravityVertical(r1)
            return
        L4c:
            r1 = 80
            r2.setGravityVertical(r1)
            return
        L52:
            r2.setGravityVertical(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.ReactTextAnchorViewManager.setTextAlignVertical$ReactAndroid_release(opc, java.lang.String):void");
    }
}
