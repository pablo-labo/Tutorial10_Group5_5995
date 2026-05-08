package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.react.bridge.AssertionException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.b;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes2.dex */
public final class doc extends y5 {
    public final String d = doc.class.getSimpleName();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.y5
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        view.getClass();
        accessibilityEvent.getClass();
        super.c(view, accessibilityEvent);
        boolean z = view instanceof kjc;
        if (!z) {
            ReactSoftExceptionLogger.logSoftException(this.d, new AssertionException("ReactScrollViewAccessibilityDelegate should only be used with ReactAccessibleScrollView, not with class: ".concat(view.getClass().getSimpleName())));
            return;
        }
        Object tag = view.getTag(R.id.accessibility_collection);
        Integer numValueOf = null;
        ReadableMap readableMap = tag instanceof ReadableMap ? (ReadableMap) tag : null;
        if (readableMap == null) {
            return;
        }
        accessibilityEvent.setItemCount(readableMap.getInt("itemCount"));
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        View childAt = viewGroup != null ? viewGroup.getChildAt(0) : null;
        ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
        if (viewGroup2 == null) {
            return;
        }
        int childCount = viewGroup2.getChildCount();
        Integer numValueOf2 = null;
        for (int i = 0; i < childCount; i++) {
            View childAt2 = viewGroup2.getChildAt(i);
            if (!z) {
                return;
            }
            childAt2.getClass();
            boolean zC = ((kjc) view).c(childAt2);
            Object tag2 = childAt2.getTag(R.id.accessibility_collection_item);
            tag2.getClass();
            ReadableMap readableMap2 = (ReadableMap) tag2;
            if (!(childAt2 instanceof ViewGroup)) {
                return;
            }
            ((ViewGroup) childAt2).getChildCount();
            if (zC) {
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(readableMap2.getInt("itemIndex"));
                }
                numValueOf2 = Integer.valueOf(readableMap2.getInt("itemIndex"));
            }
            if (numValueOf != null && numValueOf2 != null) {
                accessibilityEvent.setFromIndex(numValueOf.intValue());
                accessibilityEvent.setToIndex(numValueOf2.intValue());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.y5
    public final void d(t6 t6Var, View view) {
        view.getClass();
        AccessibilityNodeInfo accessibilityNodeInfo = t6Var.a;
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        boolean z = view instanceof kjc;
        if (!z) {
            ReactSoftExceptionLogger.logSoftException(this.d, new AssertionException("ReactScrollViewAccessibilityDelegate should only be used with ReactAccessibleScrollView, not with class: ".concat(view.getClass().getSimpleName())));
            return;
        }
        b.c cVarC = b.c.c(view);
        if (cVarC != null) {
            b.B(t6Var, cVarC, view.getContext());
        }
        Object tag = view.getTag(R.id.accessibility_collection);
        ReadableMap readableMap = tag instanceof ReadableMap ? (ReadableMap) tag : null;
        if (readableMap != null) {
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(readableMap.getInt("rowCount"), readableMap.getInt("columnCount"), readableMap.getBoolean("hierarchical")));
        }
        if (z) {
            t6Var.w(((kjc) view).getScrollEnabled());
        }
    }
}
