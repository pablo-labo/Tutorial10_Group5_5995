package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.indeed.android.jobsearch.R;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class mkc {
    public static final ArrayList a = new ArrayList();
    public static final HashMap b = new HashMap();

    public interface a {
        void a();
    }

    public interface b {
        void a();

        String b();
    }

    public static final View a(View view, String str) {
        view.getClass();
        Object tag = view.getTag(R.id.view_tag_native_id);
        if (wl7.b(tag instanceof String ? (String) tag : null, str)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.getClass();
                View viewA = a(childAt, str);
                if (viewA != null) {
                    return viewA;
                }
            }
        }
        return null;
    }
}
