package com.datadog.android.rum.internal.utils;

import android.content.ComponentName;
import android.content.Intent;
import androidx.navigation.a;
import androidx.navigation.fragment.a;
import defpackage.e44;
import defpackage.wve;
import defpackage.z3;
import defpackage.zve;
import io.jsonwebtoken.JwtParser;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0003H\u0000\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0004H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"UNKNOWN_DESTINATION_URL", "", "resolveViewUrl", "Landroid/content/ComponentName;", "", "dd-sdk-android-rum_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
public final class ViewUtilsKt {
    public static final String UNKNOWN_DESTINATION_URL = "Unknown";

    public static final String resolveViewUrl(ComponentName componentName) {
        componentName.getClass();
        String packageName = componentName.getPackageName();
        packageName.getClass();
        if (packageName.length() == 0) {
            String className = componentName.getClassName();
            className.getClass();
            return className;
        }
        String className2 = componentName.getClassName();
        className2.getClass();
        if (wve.K(className2, componentName.getPackageName() + ".", false)) {
            String className3 = componentName.getClassName();
            className3.getClass();
            return className3;
        }
        String className4 = componentName.getClassName();
        className4.getClass();
        if (!zve.M(className4, JwtParser.SEPARATOR_CHAR)) {
            return z3.m(componentName.getPackageName(), ".", componentName.getClassName());
        }
        String className5 = componentName.getClassName();
        className5.getClass();
        return className5;
    }

    public static final String resolveViewUrl(Object obj) {
        String strResolveViewUrl;
        obj.getClass();
        if (obj instanceof a.b) {
            return ((a.b) obj).l();
        }
        if (obj instanceof e44.a) {
            return ((e44.a) obj).l();
        }
        if (obj instanceof a.C0068a) {
            Intent intent = ((a.C0068a) obj).a0;
            ComponentName component = intent != null ? intent.getComponent() : null;
            return (component == null || (strResolveViewUrl = resolveViewUrl(component)) == null) ? UNKNOWN_DESTINATION_URL : strResolveViewUrl;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        String canonicalName = obj.getClass().getCanonicalName();
        return canonicalName == null ? obj.getClass().getSimpleName() : canonicalName;
    }
}
