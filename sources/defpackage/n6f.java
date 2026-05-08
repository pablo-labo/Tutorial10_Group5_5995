package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.ComposeView;
import com.indeed.android.jobsearch.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ln6f;", "Lm6f;", "<init>", "()V", "a", "uiplugin_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class n6f extends m6f {

    public static final class a {
        public final boolean equals(Object obj) {
            Object objValueOf = Integer.valueOf(R.string.rnmyjobs_logged_out_screen_message);
            Object objValueOf2 = Integer.valueOf(R.string.rnmyjobs_header);
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && objValueOf2.equals(objValueOf2) && objValueOf.equals(objValueOf);
        }

        public final int hashCode() {
            return Integer.hashCode(R.drawable.hero_working_9) + w40.c(R.string.rnmyjobs_sign_in, w40.c(R.string.rnmyjobs_create_account, (Integer.valueOf(R.string.rnmyjobs_logged_out_screen_message).hashCode() + w40.c(R.string.rnmyjobs_logged_out_screen_title, Integer.valueOf(R.string.rnmyjobs_header).hashCode() * 31, 31)) * 31, 31), 31);
        }

        public final String toString() {
            return "LoggedOutConfig(headerTextResId=" + Integer.valueOf(R.string.rnmyjobs_header) + ", titleTextResId=2131953050, messageTextResId=" + Integer.valueOf(R.string.rnmyjobs_logged_out_screen_message) + ", createAccountButtonTextResId=2131953047, signInButtonTextResId=2131953051, imageResId=2131231173)";
        }
    }

    public abstract void O(int i, b bVar);

    /* JADX INFO: renamed from: P */
    public abstract a getD();

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6);
        composeView.setContent(new ah2(539903047, new mh(this, 10), true));
        return composeView;
    }
}
