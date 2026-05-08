package com.datadog.android.rum.internal.instrumentation.gestures;

import android.view.View;
import com.datadog.android.core.internal.utils.NumberExtKt;
import com.datadog.android.rum.tracking.InteractionPredicate;
import defpackage.l5;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0018\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a\u0016\u0010\t\u001a\u00020\u0001*\u0004\u0018\u00010\n2\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\f\u0010\u000b\u001a\u00020\u0001*\u00020\fH\u0000¨\u0006\r"}, d2 = {"idAsStringHexa", "", "id", "", "resolveTargetName", "interactionPredicate", "Lcom/datadog/android/rum/tracking/InteractionPredicate;", "target", "", "resourceIdName", "Landroid/content/Context;", "targetClassName", "Landroid/view/View;", "dd-sdk-android-rum_release"}, k = 2, mv = {1, 7, 0}, xi = 48)
public final class GesturesUtilsKt {
    private static final String idAsStringHexa(int i) {
        return l5.l("0x", NumberExtKt.toHexString(i));
    }

    public static final String resolveTargetName(InteractionPredicate interactionPredicate, Object obj) {
        interactionPredicate.getClass();
        obj.getClass();
        String targetName = interactionPredicate.getTargetName(obj);
        return (targetName == null || targetName.length() == 0) ? "" : targetName;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String resourceIdName(android.content.Context r0, int r1) {
        /*
            if (r0 == 0) goto Ld
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L15
            if (r0 == 0) goto Ld
            java.lang.String r0 = r0.getResourceEntryName(r1)     // Catch: android.content.res.Resources.NotFoundException -> L15
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 != 0) goto L19
            java.lang.String r0 = idAsStringHexa(r1)     // Catch: android.content.res.Resources.NotFoundException -> L15
            return r0
        L15:
            java.lang.String r0 = idAsStringHexa(r1)
        L19:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.datadog.android.rum.internal.instrumentation.gestures.GesturesUtilsKt.resourceIdName(android.content.Context, int):java.lang.String");
    }

    public static final String targetClassName(View view) {
        view.getClass();
        String canonicalName = view.getClass().getCanonicalName();
        return canonicalName == null ? view.getClass().getSimpleName() : canonicalName;
    }
}
