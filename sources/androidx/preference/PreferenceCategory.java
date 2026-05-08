package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.indeed.android.jobsearch.R;
import defpackage.syf;

/* JADX INFO: loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, syf.a(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle), 0);
    }
}
