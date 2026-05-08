package com.datadog.android.rum.tracking;

import android.view.View;
import com.datadog.android.rum.internal.RumFeature;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J-\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/datadog/android/rum/tracking/ViewAttributesProvider;", "", "Landroid/view/View;", "view", "", "", RumFeature.EVENT_ATTRIBUTES_PROPERTY, "Lj6g;", "extractAttributes", "(Landroid/view/View;Ljava/util/Map;)V", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public interface ViewAttributesProvider {
    void extractAttributes(View view, Map<String, Object> attributes);
}
