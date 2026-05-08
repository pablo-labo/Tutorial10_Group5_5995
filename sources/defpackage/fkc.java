package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.TypedValue;
import com.datadog.android.core.internal.CoreFeature;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;

/* JADX INFO: loaded from: classes2.dex */
public final class fkc {
    public static final TypedValue a = new TypedValue();

    public static final Drawable a(Context context, ReadableMap readableMap) {
        int color;
        String string = readableMap.getString("type");
        boolean zEquals = "ThemeAttrAndroid".equals(string);
        TypedValue typedValue = a;
        if (!zEquals) {
            if (!"RippleAndroid".equals(string)) {
                m6.m(l5.l("Invalid type for android drawable: ", string));
                return null;
            }
            if (readableMap.hasKey("color") && !readableMap.isNull("color")) {
                color = readableMap.getInt("color");
            } else {
                if (!context.getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                    m6.m("Attribute colorControlHighlight couldn't be resolved into a drawable");
                    return null;
                }
                color = context.getResources().getColor(typedValue.resourceId, context.getTheme());
            }
            RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{color}), null, (readableMap.hasKey("borderless") && !readableMap.isNull("borderless") && readableMap.getBoolean("borderless")) ? null : new ColorDrawable(-1));
            if (readableMap.hasKey("rippleRadius")) {
                rippleDrawable.setRadius((int) nn2.G((float) readableMap.getDouble("rippleRadius")));
            }
            return rippleDrawable;
        }
        String string2 = readableMap.getString("attribute");
        if (string2 == null) {
            m6.m("JS description missing 'attribute' field");
            return null;
        }
        int identifier = "selectableItemBackground".equals(string2) ? R.attr.selectableItemBackground : "selectableItemBackgroundBorderless".equals(string2) ? R.attr.selectableItemBackgroundBorderless : context.getResources().getIdentifier(string2, "attr", CoreFeature.DEFAULT_SOURCE_NAME);
        if (context.getTheme().resolveAttribute(identifier, typedValue, true)) {
            Drawable drawable = context.getResources().getDrawable(typedValue.resourceId, context.getTheme());
            if (readableMap.hasKey("rippleRadius") && (drawable instanceof RippleDrawable)) {
                ((RippleDrawable) drawable).setRadius((int) nn2.G((float) readableMap.getDouble("rippleRadius")));
            }
            return drawable;
        }
        throw new JSApplicationIllegalArgumentException("Attribute " + string2 + " with id " + identifier + " couldn't be resolved into a drawable");
    }
}
