package defpackage;

import android.widget.ImageView;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class m0g {
    public static final Map<String, Object> a;
    public static final Map<String, Object> b;
    public static final Map<String, Object> c;

    static {
        Pair pair = new Pair("topChange", kc9.W(new Pair("phasedRegistrationNames", lc9.a0(new Pair("bubbled", "onChange"), new Pair("captured", "onChangeCapture")))));
        Pair pair2 = new Pair("topSelect", kc9.W(new Pair("phasedRegistrationNames", lc9.a0(new Pair("bubbled", "onSelect"), new Pair("captured", "onSelectCapture")))));
        epf.a.getClass();
        a = lc9.a0(pair, pair2, new Pair(epf.START.a(), kc9.W(new Pair("phasedRegistrationNames", lc9.a0(new Pair("bubbled", "onTouchStart"), new Pair("captured", "onTouchStartCapture"))))), new Pair(epf.MOVE.a(), kc9.W(new Pair("phasedRegistrationNames", lc9.a0(new Pair("bubbled", "onTouchMove"), new Pair("captured", "onTouchMoveCapture"))))), new Pair(epf.END.a(), kc9.W(new Pair("phasedRegistrationNames", lc9.a0(new Pair("bubbled", "onTouchEnd"), new Pair("captured", "onTouchEndCapture"))))), new Pair(epf.CANCEL.a(), kc9.W(new Pair("phasedRegistrationNames", lc9.a0(new Pair("bubbled", "onTouchCancel"), new Pair("captured", "onTouchCancelCapture"))))));
        b = lc9.a0(new Pair("topContentSizeChange", j6.c("registrationName", "onContentSizeChange")), new Pair("topLayout", j6.c("registrationName", "onLayout")), new Pair("topLoadingError", j6.c("registrationName", "onLoadingError")), new Pair("topLoadingFinish", j6.c("registrationName", "onLoadingFinish")), new Pair("topLoadingStart", j6.c("registrationName", "onLoadingStart")), new Pair("topSelectionChange", j6.c("registrationName", "onSelectionChange")), new Pair("topMessage", j6.c("registrationName", "onMessage")), new Pair("topScrollBeginDrag", j6.c("registrationName", "onScrollBeginDrag")), new Pair("topScrollEndDrag", j6.c("registrationName", "onScrollEndDrag")), new Pair("topScroll", j6.c("registrationName", "onScroll")), new Pair("topMomentumScrollBegin", j6.c("registrationName", "onMomentumScrollBegin")), new Pair("topMomentumScrollEnd", j6.c("registrationName", "onMomentumScrollEnd")));
        c = lc9.a0(new Pair("UIView", kc9.W(new Pair("ContentMode", lc9.a0(new Pair("ScaleAspectFit", Integer.valueOf(ImageView.ScaleType.FIT_CENTER.ordinal())), new Pair("ScaleAspectFill", Integer.valueOf(ImageView.ScaleType.CENTER_CROP.ordinal())), new Pair("ScaleAspectCenter", Integer.valueOf(ImageView.ScaleType.CENTER_INSIDE.ordinal())))))), new Pair("StyleConstants", kc9.W(new Pair("PointerEventsValues", lc9.a0(new Pair("none", 0), new Pair("boxNone", 1), new Pair("boxOnly", 2), new Pair("unspecified", 3))))), new Pair("AccessibilityEventTypes", lc9.a0(new Pair("typeWindowStateChanged", 32), new Pair("typeViewFocused", 8), new Pair("typeViewClicked", 1))));
    }
}
