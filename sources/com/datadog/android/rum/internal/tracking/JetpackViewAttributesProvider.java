package com.datadog.android.rum.internal.tracking;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.datadog.android.core.internal.utils.NumberExtKt;
import com.datadog.android.rum.RumAttributes;
import com.datadog.android.rum.internal.RumFeature;
import com.datadog.android.rum.tracking.ViewAttributesProvider;
import defpackage.l5;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\fJ-\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00042\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/datadog/android/rum/internal/tracking/JetpackViewAttributesProvider;", "Lcom/datadog/android/rum/tracking/ViewAttributesProvider;", "<init>", "()V", "Landroid/view/View;", "child", "", "isDirectChildOfRecyclerView", "(Landroid/view/View;)Z", "view", "", "resolveIdOrResourceName", "(Landroid/view/View;)Ljava/lang/String;", "viewIdAsHexa", "", "", RumFeature.EVENT_ATTRIBUTES_PROPERTY, "Lj6g;", "extractAttributes", "(Landroid/view/View;Ljava/util/Map;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class JetpackViewAttributesProvider implements ViewAttributesProvider {
    private final boolean isDirectChildOfRecyclerView(View child) {
        return child.getLayoutParams() instanceof RecyclerView.n;
    }

    private final String resolveIdOrResourceName(View view) {
        try {
            String resourceEntryName = view.getResources().getResourceEntryName(view.getId());
            return resourceEntryName == null ? viewIdAsHexa(view) : resourceEntryName;
        } catch (Resources.NotFoundException unused) {
            return this.viewIdAsHexa(view);
        }
    }

    private final String viewIdAsHexa(View view) {
        return l5.l("0x", NumberExtKt.toHexString(view.getId()));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return JetpackViewAttributesProvider.class.equals(other != null ? other.getClass() : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.datadog.android.rum.tracking.ViewAttributesProvider
    public void extractAttributes(View view, Map<String, Object> attributes) {
        RecyclerView recyclerView;
        view.getClass();
        attributes.getClass();
        for (ViewParent parent = view.getParent(); parent != 0; parent = parent.getParent()) {
            if ((parent instanceof RecyclerView) && view != null && isDirectChildOfRecyclerView(view)) {
                RecyclerView.b0 b0VarM = RecyclerView.M(view);
                int iJ = -1;
                if (b0VarM != null && (recyclerView = b0VarM.r) != null) {
                    iJ = recyclerView.J(b0VarM);
                }
                attributes.put(RumAttributes.ACTION_TARGET_PARENT_INDEX, Integer.valueOf(iJ));
                attributes.put(RumAttributes.ACTION_TARGET_PARENT_CLASSNAME, parent.getClass().getCanonicalName());
                attributes.put(RumAttributes.ACTION_TARGET_PARENT_RESOURCE_ID, resolveIdOrResourceName((View) parent));
                return;
            }
            view = parent instanceof View ? (View) parent : null;
        }
    }

    public int hashCode() {
        return JetpackViewAttributesProvider.class.hashCode();
    }
}
