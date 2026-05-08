package defpackage;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import com.indeed.android.jobsearch.R;

/* JADX INFO: loaded from: classes2.dex */
public final class u24 extends PreferenceActivity {
    @Override // android.preference.PreferenceActivity, android.app.Activity
    @sy3
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(getApplication().getResources().getString(R.string.catalyst_settings_title));
        addPreferencesFromResource(R.xml.rn_dev_preferences);
    }
}
