package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.indeed.android.jobsearch.R;
import defpackage.syf;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, syf.a(context, R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle), 0);
    }
}
