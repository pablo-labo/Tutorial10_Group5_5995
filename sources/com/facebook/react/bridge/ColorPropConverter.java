package com.facebook.react.bridge;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.util.TypedValue;
import com.datadog.android.core.internal.CoreFeature;
import com.datadog.android.rum.internal.domain.event.RumEventSerializer;
import defpackage.g6d;
import defpackage.r6;
import defpackage.s55;
import defpackage.wl7;
import defpackage.wve;
import defpackage.zve;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J!\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¢\u0006\u0002\u0010\u0013J\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J!\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010\u0013J\"\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u000fH\u0007J!\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J\u0018\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0007H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/facebook/react/bridge/ColorPropConverter;", "", "<init>", "()V", "supportWideGamut", "", "JSON_KEY", "", "PREFIX_RESOURCE", "PREFIX_ATTR", "PACKAGE_DELIMITER", "PATH_DELIMITER", "ATTR", "ATTR_SEGMENT", "getColorInteger", "", "value", RumEventSerializer.GLOBAL_ATTRIBUTE_PREFIX, "Landroid/content/Context;", "(Ljava/lang/Object;Landroid/content/Context;)Ljava/lang/Integer;", "getColorInstance", "Landroid/graphics/Color;", "getColor", "defaultInt", "resolveResourcePath", "resourcePath", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Integer;", "resolveResource", "resolveThemeAttribute", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ColorPropConverter {
    private static final String ATTR = "attr";
    private static final String ATTR_SEGMENT = "attr/";
    public static final ColorPropConverter INSTANCE = new ColorPropConverter();
    private static final String JSON_KEY = "resource_paths";
    private static final String PACKAGE_DELIMITER = ":";
    private static final String PATH_DELIMITER = "/";
    private static final String PREFIX_ATTR = "?";
    private static final String PREFIX_RESOURCE = "@";

    private ColorPropConverter() {
    }

    public static final Integer getColor(Object value, Context context) {
        Color colorInstance;
        context.getClass();
        try {
            if (INSTANCE.supportWideGamut() && (colorInstance = getColorInstance(value, context)) != null) {
                return Integer.valueOf(colorInstance.toArgb());
            }
        } catch (JSApplicationCausedNativeException e) {
            s55.q(e, "Error extracting color from WideGamut", new Object[0]);
        }
        return INSTANCE.getColorInteger(value, context);
    }

    public static final Color getColorInstance(Object value, Context context) {
        context.getClass();
        if (value == null) {
            return null;
        }
        ColorPropConverter colorPropConverter = INSTANCE;
        if (colorPropConverter.supportWideGamut() && (value instanceof Double)) {
            return Color.valueOf((int) ((Number) value).doubleValue());
        }
        if (!(value instanceof ReadableMap)) {
            throw new JSApplicationCausedNativeException("ColorValue: the value must be a number or Object.");
        }
        if (colorPropConverter.supportWideGamut()) {
            ReadableMap readableMap = (ReadableMap) value;
            if (readableMap.hasKey("space")) {
                ColorSpace colorSpace = ColorSpace.get(wl7.b(readableMap.getString("space"), "display-p3") ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
                colorSpace.getClass();
                return Color.valueOf(Color.pack((float) readableMap.getDouble("r"), (float) readableMap.getDouble("g"), (float) readableMap.getDouble("b"), (float) readableMap.getDouble("a"), colorSpace));
            }
        }
        ReadableArray array = ((ReadableMap) value).getArray(JSON_KEY);
        if (array == null) {
            throw new JSApplicationCausedNativeException("ColorValue: The `resource_paths` must be an array of color resource path strings.");
        }
        int size = array.size();
        for (int i = 0; i < size; i++) {
            Integer numResolveResourcePath = resolveResourcePath(context, array.getString(i));
            if (INSTANCE.supportWideGamut() && numResolveResourcePath != null) {
                return Color.valueOf(numResolveResourcePath.intValue());
            }
        }
        throw new JSApplicationCausedNativeException("ColorValue: None of the paths in the `resource_paths` array resolved to a color resource.");
    }

    private final Integer getColorInteger(Object value, Context context) {
        if (value == null) {
            return null;
        }
        if (value instanceof Double) {
            return Integer.valueOf((int) ((Number) value).doubleValue());
        }
        if (context == null) {
            r6.g("Required value was null.");
            return null;
        }
        if (!(value instanceof ReadableMap)) {
            throw new JSApplicationCausedNativeException("ColorValue: the value must be a number or Object.");
        }
        ReadableMap readableMap = (ReadableMap) value;
        if (readableMap.hasKey("space")) {
            return Integer.valueOf(Color.argb((int) (((float) readableMap.getDouble("a")) * 255.0f), (int) (((float) readableMap.getDouble("r")) * 255.0f), (int) (((float) readableMap.getDouble("g")) * 255.0f), (int) (((float) readableMap.getDouble("b")) * 255.0f)));
        }
        ReadableArray array = readableMap.getArray(JSON_KEY);
        if (array == null) {
            throw new JSApplicationCausedNativeException("ColorValue: The `resource_paths` must be an array of color resource path strings.");
        }
        int size = array.size();
        for (int i = 0; i < size; i++) {
            Integer numResolveResourcePath = resolveResourcePath(context, array.getString(i));
            if (numResolveResourcePath != null) {
                return numResolveResourcePath;
            }
        }
        throw new JSApplicationCausedNativeException("ColorValue: None of the paths in the `resource_paths` array resolved to a color resource.");
    }

    private final int resolveResource(Context context, String resourcePath) {
        List listK0 = zve.k0(resourcePath, new String[]{PACKAGE_DELIMITER});
        String packageName = context.getPackageName();
        if (listK0.size() > 1) {
            packageName = (String) listK0.get(0);
            resourcePath = (String) listK0.get(1);
        }
        List listK02 = zve.k0(resourcePath, new String[]{PATH_DELIMITER});
        String str = (String) listK02.get(0);
        int identifier = context.getResources().getIdentifier((String) listK02.get(1), str, packageName);
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal<TypedValue> threadLocal = g6d.a;
        return resources.getColor(identifier, theme);
    }

    public static final Integer resolveResourcePath(Context context, String resourcePath) {
        context.getClass();
        if (resourcePath == null || resourcePath.length() == 0) {
            return null;
        }
        boolean zK = wve.K(resourcePath, PREFIX_RESOURCE, false);
        boolean zK2 = wve.K(resourcePath, "?", false);
        String strSubstring = resourcePath.substring(1);
        try {
            if (zK) {
                return Integer.valueOf(INSTANCE.resolveResource(context, strSubstring));
            }
            if (zK2) {
                return Integer.valueOf(INSTANCE.resolveThemeAttribute(context, strSubstring));
            }
            return null;
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    private final int resolveThemeAttribute(Context context, String resourcePath) {
        String strI = wve.I(resourcePath, ATTR_SEGMENT, "");
        List listK0 = zve.k0(strI, new String[]{PACKAGE_DELIMITER});
        String packageName = context.getPackageName();
        if (listK0.size() > 1) {
            packageName = (String) listK0.get(0);
            strI = (String) listK0.get(1);
        }
        int identifier = context.getResources().getIdentifier(strI, ATTR, packageName);
        if (identifier == 0) {
            identifier = context.getResources().getIdentifier(strI, ATTR, CoreFeature.DEFAULT_SOURCE_NAME);
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(identifier, typedValue, true)) {
            return typedValue.data;
        }
        throw new Resources.NotFoundException();
    }

    private final boolean supportWideGamut() {
        return true;
    }

    public static final int getColor(Object value, Context context, int defaultInt) {
        context.getClass();
        try {
            Integer color = getColor(value, context);
            return color != null ? color.intValue() : defaultInt;
        } catch (JSApplicationCausedNativeException e) {
            s55.q(e, "Error converting ColorValue", new Object[0]);
            return defaultInt;
        }
    }
}
